package com.example.se2_project_server.service;


import com.example.se2_project_server.exception.OrderNotFound;
import com.example.se2_project_server.exception.UserNotFoundException;
import com.example.se2_project_server.model.*;
import com.example.se2_project_server.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class OrderService {
    @Autowired
 private    OrderRepository orderRepository;
    @Autowired
   private OrderItemRepository orderItemRepository;
    @Autowired
   private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ProductRepository productRepository;
    public List<OrderPojo> getOrderByUserId(Long userId){
List<OrderPojo> orderPojos=new ArrayList<>();
        if(userRepository.existsById(userId)==false) { throw new UserNotFoundException();}
            User user = userRepository.findById(userId).get();

           List<Order> orders = orderRepository.findOrderByUser(user);
            if (orders.size()==0) throw new OrderNotFound() ;
            for (int i=0;i<orders.size();i++) {

                Set<OrderItem> orderItem = orders.get(i).getOrderItemSet();
                Set<OrderItemPoJo> orderItemPoJos = new HashSet<>();
                for (OrderItem item : orderItem) {
                    orderItemPoJos.add(new OrderItemPoJo(item.getProduct().getTitle(), item.getProduct().getSlugName(), item.getQuantity(), item.getProduct().getRegularPrice()));


                }


                OrderPojo orderPojo = new OrderPojo(orders.get(i).getId(), orders.get(i).getUser().getId(),orders.get(i).getQuantity(), orders.get(i).getAddress().getRecivedName(), orders.get(i).getPaymentMethod(), orders.get(i).getAddress().getRecivedNumber(), orders.get(i).getAddress().getRecivedAddress(), orderItemPoJos);
                orderPojos.add(orderPojo);
            }return orderPojos;

    }
    public OrderPojo createNewOrder(OrderPojo orderPojo){
        Long userId=orderPojo.getUserId();
        if(userRepository.existsById(userId)==false) { throw new UserNotFoundException();}
      Set<OrderItemPoJo> orderItemPoJos= orderPojo.getProducts();
      Set<OrderItem> orderItemSet=new HashSet<>();
      for(OrderItemPoJo item:orderItemPoJos){

          orderItemSet.add(new OrderItem(item.getQuantity(),productRepository.findBySlugName(item.getProductSlug())));
      orderItemRepository.save(new OrderItem(item.getQuantity(),productRepository.findBySlugName(item.getProductSlug())));
      }
    User user=userRepository.findById(orderPojo.getUserId()).get();
      Order  order=new Order();
      if(addressRepository.findAddressByUserIdAndAndRecivedAddressAndRecivedNameAndRecivedNumber(userId,orderPojo.getAddress(),orderPojo.getName(),orderPojo.getPhoneNumber())==null){

          addressRepository.save(new Address(user,orderPojo.getName(),orderPojo.getPhoneNumber(),orderPojo.getAddress()));
          order.setAddress(addressRepository.findAddressByUserIdAndAndRecivedAddressAndRecivedNameAndRecivedNumber(userId,orderPojo.getAddress(),orderPojo.getName(),orderPojo.getPhoneNumber()));
      }else {
          order.setAddress(addressRepository.findAddressByUserIdAndAndRecivedAddressAndRecivedNameAndRecivedNumber(userId,orderPojo.getAddress(),orderPojo.getName(),orderPojo.getPhoneNumber()));
      }

      order.setOrderItemSet(orderItemSet);
      order.setUser(user);
      order.setPaymentMethod(orderPojo.getPaymentMethod());
      order.setQuantity(orderPojo.getQuantity());
     Order newOrder= orderRepository.save(order);
      orderPojo.setId(newOrder.getId());
      return orderPojo;

    }
    public OrderPojo updateOrder(Long orderId,OrderPojo orderPojo){
        Long userId=orderPojo.getUserId();
        if(orderRepository.existsById(orderId)==false) { throw new OrderNotFound();}
        if(!userRepository.existsById(userId)) { throw new UserNotFoundException();}
        Set<OrderItemPoJo> orderItemPoJos= orderPojo.getProducts();
        Set<OrderItem> orderItemSet=new HashSet<>();
        for(OrderItemPoJo item:orderItemPoJos){

            orderItemSet.add(new OrderItem(item.getQuantity(),productRepository.findBySlugName(item.getProductSlug())));

            orderItemRepository.save(new OrderItem(item.getQuantity(),productRepository.findBySlugName(item.getProductSlug())));
        }
        User user=userRepository.findById(orderPojo.getUserId()).get();
        Order  order=orderRepository.findById(orderId).get();
        if(addressRepository.findAddressByUserIdAndAndRecivedAddressAndRecivedNameAndRecivedNumber(userId,orderPojo.getAddress(),orderPojo.getName(),orderPojo.getPhoneNumber())==null){

            addressRepository.save(new Address(user,orderPojo.getName(),orderPojo.getPhoneNumber(),orderPojo.getAddress()));
            order.setAddress(addressRepository.findAddressByUserIdAndAndRecivedAddressAndRecivedNameAndRecivedNumber(userId,orderPojo.getAddress(),orderPojo.getName(),orderPojo.getPhoneNumber()));
        }else {
            order.setAddress(addressRepository.findAddressByUserIdAndAndRecivedAddressAndRecivedNameAndRecivedNumber(userId,orderPojo.getAddress(),orderPojo.getName(),orderPojo.getPhoneNumber()));
        }
        order.setOrderItemSet(orderItemSet);
        order.setUser(user);
        order.setPaymentMethod(orderPojo.getPaymentMethod());
        order.setQuantity(orderPojo.getQuantity());
        orderRepository.save(order);
        return orderPojo;

    }
    public String deleteById(Long orderId){
        if(orderRepository.existsById(orderId)){
            Set<OrderItem> orderItemSet=orderRepository.findById(orderId).get().getOrderItemSet();
            for (OrderItem item:orderItemSet){
                orderItemRepository.deleteById(item.getId());
            }
            orderRepository.deleteById(orderId);
            return "delete success!";
        }
        else{
            return "order is not existed";
        }
    }
public List<OrderPojo> getAllOrder(){
        List<OrderPojo> orderPojos=new ArrayList<>();
        List<Order>orders=orderRepository.findAll();
    if (orders.size()==0) throw new OrderNotFound() ;
    for (int i=0;i<orders.size();i++) {

        Set<OrderItem> orderItem = orders.get(i).getOrderItemSet();
        Set<OrderItemPoJo> orderItemPoJos = new HashSet<>();
        for (OrderItem item : orderItem) {
            orderItemPoJos.add(new OrderItemPoJo(item.getProduct().getTitle(), item.getProduct().getSlugName(), item.getQuantity(), item.getProduct().getRegularPrice()));


        }


        OrderPojo orderPojo = new OrderPojo(orders.get(i).getId(), orders.get(i).getUser().getId(),orders.get(i).getQuantity(), orders.get(i).getAddress().getRecivedName(), orders.get(i).getPaymentMethod(), orders.get(i).getAddress().getRecivedNumber(), orders.get(i).getAddress().getRecivedAddress(), orderItemPoJos);
        orderPojos.add(orderPojo);
    }
    return orderPojos;
}
}
