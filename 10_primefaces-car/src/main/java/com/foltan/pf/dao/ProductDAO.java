package com.foltan.pf.dao;

import java.util.Collection;


public interface ProductDAO<M> {

    M getProduct(long productId);

    <I> M getProduct(I productId);
    
    Collection<M> getProducts();

}
