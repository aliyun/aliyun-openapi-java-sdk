package com.aliyuncs.regions;

public final class LocationConfig {
    private String regionId = "cn-hangzhou";
    private String product  = "Location";
    private String endpoint = "location.aliyuncs.com";

    public LocationConfig() {
        super();
    }

    public LocationConfig(String regionId, String product, String endpoint) {
        this.regionId = regionId;
        this.product = product;
        this.endpoint = endpoint;
    }

    public synchronized static LocationConfig createLocationConfig(String regionId, String product, String endpoint) {
        return new LocationConfig(regionId, product, endpoint);
    }

    public String getRegionId() {
        return regionId;
    }

    public String getProduct() {
        return product;
    }

    public String getEndpoint() {
        return endpoint;
    }

}
