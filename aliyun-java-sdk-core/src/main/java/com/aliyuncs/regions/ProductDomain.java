package com.aliyuncs.regions;

public class ProductDomain {

    private String productName;
    private String domianName;

    public ProductDomain(String product, String domain) {
        this.productName = product;
        this.domianName = domain;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDomianName() {
        return domianName;
    }

    public void setDomianName(String domianName) {
        this.domianName = domianName;
    }

}
