package com.Demo.project.spring_boot_ecommerce.dao;
import com.Demo.project.spring_boot_ecommerce.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

//Create a projection interface to specify which fields to include in the response
@Projection(name = "productDetails", types = { Product.class })
public interface ProductProjection {
    Long getId();
    String getSku();
    String getName();
    String getDescription();
    BigDecimal getUnitPrice();
    boolean isActive();
    int getUnitsInStock();
    String getImageUrl();
}