package com.example.se2_project_server.model;




import com.example.se2_project_server.validation.UniqueSlugName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.util.Set;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String desc;
    private String image1;
    private String image2;

    public CategorySlug  getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(CategorySlug categorySlug) {
        this.categorySlug = categorySlug;
    }

    private String image3;
    private Integer rating;

    public Product() {
    }

    private Integer discount;
    private Float  regularPrice;
  @UniqueSlugName
     @NotEmpty(message = "slug name is empty")
    private String  slugName;
    @ManyToOne(cascade ={CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private CategorySlug categorySlug;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private Set<Gender> genders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage1() {
        return image1;
    }



    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Float getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Float regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getSlugName() {
        return slugName;
    }

    public void setSlugName(String slugName) {
        this.slugName = slugName;
    }

    public Set<Gender> getGenders() {
        return genders;
    }

    public void setGenders(Set<Gender> genders) {
        this.genders = genders;
    }

    public Set<Color> getColors() {
        return colors;
    }

    public void setColors(Set<Color> colors) {
        this.colors = colors;
    }

    public Set<Size> getSizes() {
        return sizes;
    }

    public void setSizes(Set<Size> sizes) {
        this.sizes = sizes;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE} )
    private Set<Color> colors;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE} )
    private  Set<Size> sizes;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "Wish_List",
            joinColumns = {
                    @JoinColumn(name = "PRODUCT_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "USER_ID")
            })
private Set<User> users;


}
