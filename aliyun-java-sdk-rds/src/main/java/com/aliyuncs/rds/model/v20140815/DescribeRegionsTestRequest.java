/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 */
public class DescribeRegionsTestRequest extends RpcAcsRequest<DescribeRegionsTestResponse> {

    public DescribeRegionsTestRequest() {
        super("Rds", "2014-08-15", "DescribeRegionsTest");
    }

    private Integer ownerId;

    private String resourceOwnerAccount;

    private Integer resourceOwnerId;

    private String clientToken;

    private String ownerAccount;

    public Integer getownerId() {
        return this.ownerId;
    }

    public void setownerId(Integer ownerId) {
        this.ownerId = ownerId;
        putQueryParameter("ownerId", String.valueOf(ownerId));
    }

    public String getresourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public void setresourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        putQueryParameter("resourceOwnerAccount", resourceOwnerAccount);
    }

    public Integer getresourceOwnerId() {
        return this.resourceOwnerId;
    }

    public void setresourceOwnerId(Integer resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        putQueryParameter("resourceOwnerId", String.valueOf(resourceOwnerId));
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        putQueryParameter("ClientToken", clientToken);
    }

    public String getownerAccount() {
        return this.ownerAccount;
    }

    public void setownerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        putQueryParameter("ownerAccount", ownerAccount);
    }

    @Override
    public Class<DescribeRegionsTestResponse> getResponseClass() {
        return DescribeRegionsTestResponse.class;
    }

}
