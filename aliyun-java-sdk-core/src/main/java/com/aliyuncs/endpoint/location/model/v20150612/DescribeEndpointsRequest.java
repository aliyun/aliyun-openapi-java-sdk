package com.aliyuncs.endpoint.location.model.v20150612;

import com.aliyuncs.RpcAcsRequest;

public class DescribeEndpointsRequest extends RpcAcsRequest<DescribeEndpointsResponse> {

    private String id;
    private String serviceCode;
    private String type;

    public DescribeEndpointsRequest() {
        super("Location", "2015-06-12", "DescribeEndpoints");
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
        putQueryParameter("Id", id);
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        putQueryParameter("ServiceCode", serviceCode);
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
        putQueryParameter("Type", type);
    }

    @Override
    public Class<DescribeEndpointsResponse> getResponseClass() {
        return DescribeEndpointsResponse.class;
    }

}