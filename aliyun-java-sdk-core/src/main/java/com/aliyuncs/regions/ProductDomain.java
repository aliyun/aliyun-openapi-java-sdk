package com.aliyuncs.regions;

public class ProductDomain {

    private String productName;
    private String domainName;

    public ProductDomain(String product, String domain) {
        this.productName = product;
        this.domainName = domain;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

}
