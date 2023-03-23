
package com.foltan.pf.dto;

import com.foltan.pf.constants.OrderStatus;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class Order implements Serializable {
    
    private long orderId;
    private String customerId;
    private Instant orderCreated;
    private Instant orderUpdated;
    private BigDecimal orderTotal;
    private OrderStatus orderStatus;
    private Map<Product,Integer> orderItems; 
    private Set<Product> products;
    
    public Order(){
        orderItems = new HashMap<>();
        orderCreated = Instant.now();
        orderTotal = BigDecimal.ZERO;
        orderStatus = OrderStatus.PENDING; 
    }

    
    public long getOrderId() {
        return orderId;
    }

    
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

   
    public String getCustomerId() {
        return customerId;
    }

    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    
    public Instant getOrderCreated() {
        return orderCreated;
    }

   
    public void setOrderCreated(Instant orderCreated) {
        this.orderCreated = orderCreated;
    }

  
    public Instant getOrderUpdated() {
        return orderUpdated;
    }

 
    public void setOrderUpdated(Instant orderUpdated) {
        this.orderUpdated = orderUpdated;
    }

   
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

 
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

 
    public Map<Product,Integer> getOrderItems() {
        return orderItems;
    }

 
    public void setOrderItems(Map<Product,Integer> orderItems) {
        this.orderItems = orderItems;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (this.orderId ^ (this.orderId >>> 32));
        hash = 89 * hash + Objects.hashCode(this.orderCreated);
        hash = 89 * hash + Objects.hashCode(this.orderTotal);
        hash = 89 * hash + Objects.hashCode(this.orderItems);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (this.orderId != other.orderId) {
            return false;
        }
        if (this.customerId != other.customerId) {
            return false;
        }
        if (!Objects.equals(this.orderCreated, other.orderCreated)) {
            return false;
        }
        if (!Objects.equals(this.orderTotal, other.orderTotal)) {
            return false;
        }
        if (!Objects.equals(this.orderItems, other.orderItems)) {
            return false;
        }
        return true;
    }

    public Set<Product> getProducts() {
        return orderItems.keySet();
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    
}
