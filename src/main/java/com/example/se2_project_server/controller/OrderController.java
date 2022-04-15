package com.example.se2_project_server.controller;

import com.example.se2_project_server.model.Order;
import com.example.se2_project_server.model.OrderPojo;
import com.example.se2_project_server.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    //GET USER ORDERS
    @GetMapping("/find/{id}")
    public List<OrderPojo> getOrderByUserId(@PathVariable(name = "id") Long userId){
        return orderService.getOrderByUserId(userId);
    }
    @PostMapping("/create")
    public OrderPojo createNewOrder(@Valid @RequestBody OrderPojo orderPojo){
        return orderService.createNewOrder(orderPojo);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;

    }
    //update order
    @PutMapping("/{id}")
    @PreAuthorize("hasRole('Admin')")
    public  OrderPojo updateByOrderId(@PathVariable(value = "id") Long orderId,@Valid @RequestBody OrderPojo newOrderPojo){
return orderService.updateOrder(orderId,newOrderPojo);
    }
//delete order by id
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('Admin')")
public String deleteOrderById(@PathVariable(value = "id") Long orderId){
        return  orderService.deleteById(orderId);
    }
//get all order
    //for admin
    @GetMapping("/")
    @PreAuthorize("hasRole('Admin')")
    public List<OrderPojo> getAllOrder(){
return  orderService.getAllOrder();
    }
}
