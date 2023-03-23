 
package com.foltan.pf.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;


public class Product implements Serializable {
    private String SKU;
    private long productId;
    private List<String> images;
    private String productDesc;
    private String productTitle;
    private BigDecimal pricePer;


    public String getSKU() {
        return SKU;
    }

 
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

  
    public long getProductId() {
        return productId;
    }

 
    public void setProductId(long productId) {
        this.productId = productId;
    }


    public List<String> getImages() {
        return images;
    }

 
    public void setImages(List<String> images) {
        this.images = images;
    }

  
    public String getProductDesc() {
        return productDesc;
    }


    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

   
    public String getProductTitle() {
        return productTitle;
    }

  
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.SKU);
        hash = 11 * hash + (int) (this.productId ^ (this.productId >>> 32));
        hash = 11 * hash + Objects.hashCode(this.productTitle);
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
        final Product other = (Product) obj;
        if (this.productId != other.productId) {
            return false;
        }
        if (!Objects.equals(this.SKU, other.SKU)) {
            return false;
        }
        if (!Objects.equals(this.productTitle, other.productTitle)) {
            return false;
        }
        return true;
    }

    public BigDecimal getPricePer() {
        return pricePer;
    }

    public void setPricePer(BigDecimal pricePer) {
        this.pricePer = pricePer;
    }

    @Override
    public String toString() {
        return "Product{" + "SKU=" + SKU + ", productId=" + productId + ", productTitle=" + productTitle + ", pricePer=" + pricePer + '}';
    }
    
}
