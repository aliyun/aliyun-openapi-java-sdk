package com.aliyuncs.regions;

import com.aliyuncs.RpcAcsRequest;

/**
 * Created by hi.yan.li on 2016/3/31.
 */
public class DescribeEndpointRequest extends RpcAcsRequest<DescribeEndpointResponse> {
    public DescribeEndpointRequest() {
        super("Location", "2015-06-12", "DescribeEndpoints");
    }

    private String id;

    private String password;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
        putQueryParameter("Id", id);
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
        putQueryParameter("Password", password);
    }

    @Override
    public Class<DescribeEndpointResponse> getResponseClass() {
        return DescribeEndpointResponse.class;
    }

}
