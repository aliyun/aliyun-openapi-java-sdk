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
public class CreatePostpaidDBInstanceRequest
        extends RpcAcsRequest<CreatePostpaidDBInstanceResponse> {

    public CreatePostpaidDBInstanceRequest() {
        super("Rds", "2014-08-15", "CreatePostpaidDBInstance");
    }

    private Long ownerId;

    private String resourceOwnerAccount;

    private Long resourceOwnerId;

    private String clientToken;

    private String engine;

    private String engineVersion;

    private String dBInstanceClass;

    private Integer dBInstanceStorage;

    private String dBInstanceNetType;

    private String dBInstanceDescription;

    private String securityIPList;

    private String ownerAccount;

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        putQueryParameter("OwnerId", String.valueOf(ownerId));
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
        putQueryParameter("ResourceOwnerId", String.valueOf(resourceOwnerId));
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        putQueryParameter("ClientToken", clientToken);
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
        putQueryParameter("Engine", engine);
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        putQueryParameter("EngineVersion", engineVersion);
    }

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        putQueryParameter("DBInstanceClass", dBInstanceClass);
    }

    public Integer getDBInstanceStorage() {
        return this.dBInstanceStorage;
    }

    public void setDBInstanceStorage(Integer dBInstanceStorage) {
        this.dBInstanceStorage = dBInstanceStorage;
        putQueryParameter("DBInstanceStorage", String.valueOf(dBInstanceStorage));
    }

    public String getDBInstanceNetType() {
        return this.dBInstanceNetType;
    }

    public void setDBInstanceNetType(String dBInstanceNetType) {
        this.dBInstanceNetType = dBInstanceNetType;
        putQueryParameter("DBInstanceNetType", dBInstanceNetType);
    }

    public String getDBInstanceDescription() {
        return this.dBInstanceDescription;
    }

    public void setDBInstanceDescription(String dBInstanceDescription) {
        this.dBInstanceDescription = dBInstanceDescription;
        putQueryParameter("DBInstanceDescription", dBInstanceDescription);
    }

    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public void setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        putQueryParameter("SecurityIPList", securityIPList);
    }

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        putQueryParameter("OwnerAccount", ownerAccount);
    }

    @Override
    public Class<CreatePostpaidDBInstanceResponse> getResponseClass() {
        return CreatePostpaidDBInstanceResponse.class;
    }

}
