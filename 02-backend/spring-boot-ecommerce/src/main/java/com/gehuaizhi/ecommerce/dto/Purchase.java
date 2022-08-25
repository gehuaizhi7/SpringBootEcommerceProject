package com.gehuaizhi.ecommerce.dto;

import com.gehuaizhi.ecommerce.entity.Address;
import com.gehuaizhi.ecommerce.entity.Customer;
import com.gehuaizhi.ecommerce.entity.Order;
import com.gehuaizhi.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
