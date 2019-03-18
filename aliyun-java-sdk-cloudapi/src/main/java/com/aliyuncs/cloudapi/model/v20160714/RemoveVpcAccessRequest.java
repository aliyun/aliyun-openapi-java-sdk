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
public class RemoveVpcAccessRequest extends RpcAcsRequest<RemoveVpcAccessResponse> {
    
    public RemoveVpcAccessRequest() {
        super("CloudAPI", "2016-07-14", "RemoveVpcAccess", "apigateway");
    }

    private String  vpcId;

    private String  instanceId;

    private Integer port;
    
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

    @Override
    public Class<RemoveVpcAccessResponse> getResponseClass() {
        return RemoveVpcAccessResponse.class;
    }

}
