/*
 * Copyright 2017 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class SetVpcAccessRequest extends RpcAcsRequest<SetVpcAccessResponse> {

    public SetVpcAccessRequest() {
        super("CloudAPI", "2016-07-14", "SetVpcAccess", "apigateway");
    }

    private String  vpcId;

    private String  instanceId;

    private Integer port;
    
    private String name;

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
        putQueryParameter("VpcId", vpcId);
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        putQueryParameter("InstanceId", instanceId);
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
        putQueryParameter("Port", port);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        putQueryParameter("Name", name);
    }

    @Override
    public Class<SetVpcAccessResponse> getResponseClass() {
        return SetVpcAccessResponse.class;
    }
}
