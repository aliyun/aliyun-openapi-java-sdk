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
public class ResetAccountPasswordRequest extends RpcAcsRequest<ResetAccountPasswordResponse> {

    public ResetAccountPasswordRequest() {
        super("Rds", "2014-08-15", "ResetAccountPassword");
    }

    private Long ownerId;

    private String resourceOwnerAccount;

    private Long resourceOwnerId;

    private String dBInstanceId;

    private String accountName;

    private String accountPassword;

    private String ownerAccount;

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        putQueryParameter("OwnerId", ownerId);
    }

    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
    }

    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        putQueryParameter("ResourceOwnerId", resourceOwnerId);
    }

    public String getDBInstanceId() {
        return this.dBInstanceId;
    }

    public void setDBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
        putQueryParameter("DBInstanceId", dBInstanceId);
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
        putQueryParameter("AccountName", accountName);
    }

    public String getAccountPassword() {
        return this.accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        putQueryParameter("AccountPassword", accountPassword);
    }

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        putQueryParameter("OwnerAccount", ownerAccount);
    }

    @Override
    public Class<ResetAccountPasswordResponse> getResponseClass() {
        return ResetAccountPasswordResponse.class;
    }

}
