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
 * @version 
 */
public class ModifyDBInstanceNetworkTypeRequest extends RpcAcsRequest<ModifyDBInstanceNetworkTypeResponse> {
	
	public ModifyDBInstanceNetworkTypeRequest() {
		super("Rds", "2014-08-15", "ModifyDBInstanceNetworkType", "rds");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String vSwitchId;

	private String privateIpAddress;

	private String retainClassic;

	private String classicExpiredDays;

	private String vPCId;

	private String dBInstanceId;

	private String readWriteSplittingPrivateIpAddress;

	private String instanceNetworkType;

	private Integer readWriteSplittingClassicExpiredDays;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getRetainClassic() {
		return this.retainClassic;
	}

	public void setRetainClassic(String retainClassic) {
		this.retainClassic = retainClassic;
		if(retainClassic != null){
			putQueryParameter("RetainClassic", retainClassic);
		}
	}

	public String getClassicExpiredDays() {
		return this.classicExpiredDays;
	}

	public void setClassicExpiredDays(String classicExpiredDays) {
		this.classicExpiredDays = classicExpiredDays;
		if(classicExpiredDays != null){
			putQueryParameter("ClassicExpiredDays", classicExpiredDays);
		}
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getReadWriteSplittingPrivateIpAddress() {
		return this.readWriteSplittingPrivateIpAddress;
	}

	public void setReadWriteSplittingPrivateIpAddress(String readWriteSplittingPrivateIpAddress) {
		this.readWriteSplittingPrivateIpAddress = readWriteSplittingPrivateIpAddress;
		if(readWriteSplittingPrivateIpAddress != null){
			putQueryParameter("ReadWriteSplittingPrivateIpAddress", readWriteSplittingPrivateIpAddress);
		}
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
		}
	}

	public Integer getReadWriteSplittingClassicExpiredDays() {
		return this.readWriteSplittingClassicExpiredDays;
	}

	public void setReadWriteSplittingClassicExpiredDays(Integer readWriteSplittingClassicExpiredDays) {
		this.readWriteSplittingClassicExpiredDays = readWriteSplittingClassicExpiredDays;
		if(readWriteSplittingClassicExpiredDays != null){
			putQueryParameter("ReadWriteSplittingClassicExpiredDays", readWriteSplittingClassicExpiredDays.toString());
		}
	}

	@Override
	public Class<ModifyDBInstanceNetworkTypeResponse> getResponseClass() {
		return ModifyDBInstanceNetworkTypeResponse.class;
	}

}
