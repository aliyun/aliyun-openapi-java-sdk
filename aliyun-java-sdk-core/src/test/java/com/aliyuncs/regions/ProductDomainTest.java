package com.aliyuncs.regions;

import org.junit.Assert;
import org.junit.Test;

public class ProductDomainTest {

    @Test
    public void constructorTest() {
        ProductDomain pd = new ProductDomain("product", "domain");
        // domain name
        Assert.assertEquals(pd.getDomianName(), "domain");
        pd.setDomianName("newdomain");
        Assert.assertEquals(pd.getDomianName(), "newdomain");
        // product name
        Assert.assertEquals(pd.getProductName(), "product");
        pd.setProductName("newproduct");
        Assert.assertEquals(pd.getProductName(), "newproduct");
    }
}