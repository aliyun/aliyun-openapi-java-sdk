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
package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RemoveInstancesRequest extends RpcAcsRequest<RemoveInstancesResponse> {
	
	public RemoveInstancesRequest() {
		super("Ess", "2014-08-28", "RemoveInstances");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String scalingGroupId;

	private String instanceId1;

	private String instanceId2;

	private String instanceId3;

	private String instanceId4;

	private String instanceId5;

	private String instanceId6;

	private String instanceId7;

	private String instanceId8;

	private String instanceId9;

	private String instanceId10;

	private String instanceId11;

	private String instanceId12;

	private String instanceId13;

	private String instanceId14;

	private String instanceId15;

	private String instanceId16;

	private String instanceId17;

	private String instanceId18;

	private String instanceId19;

	private String instanceId20;

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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		putQueryParameter("ScalingGroupId", scalingGroupId);
	}

	public String getInstanceId1() {
		return this.instanceId1;
	}

	public void setInstanceId1(String instanceId1) {
		this.instanceId1 = instanceId1;
		putQueryParameter("InstanceId.1", instanceId1);
	}

	public String getInstanceId2() {
		return this.instanceId2;
	}

	public void setInstanceId2(String instanceId2) {
		this.instanceId2 = instanceId2;
		putQueryParameter("InstanceId.2", instanceId2);
	}

	public String getInstanceId3() {
		return this.instanceId3;
	}

	public void setInstanceId3(String instanceId3) {
		this.instanceId3 = instanceId3;
		putQueryParameter("InstanceId.3", instanceId3);
	}

	public String getInstanceId4() {
		return this.instanceId4;
	}

	public void setInstanceId4(String instanceId4) {
		this.instanceId4 = instanceId4;
		putQueryParameter("InstanceId.4", instanceId4);
	}

	public String getInstanceId5() {
		return this.instanceId5;
	}

	public void setInstanceId5(String instanceId5) {
		this.instanceId5 = instanceId5;
		putQueryParameter("InstanceId.5", instanceId5);
	}

	public String getInstanceId6() {
		return this.instanceId6;
	}

	public void setInstanceId6(String instanceId6) {
		this.instanceId6 = instanceId6;
		putQueryParameter("InstanceId.6", instanceId6);
	}

	public String getInstanceId7() {
		return this.instanceId7;
	}

	public void setInstanceId7(String instanceId7) {
		this.instanceId7 = instanceId7;
		putQueryParameter("InstanceId.7", instanceId7);
	}

	public String getInstanceId8() {
		return this.instanceId8;
	}

	public void setInstanceId8(String instanceId8) {
		this.instanceId8 = instanceId8;
		putQueryParameter("InstanceId.8", instanceId8);
	}

	public String getInstanceId9() {
		return this.instanceId9;
	}

	public void setInstanceId9(String instanceId9) {
		this.instanceId9 = instanceId9;
		putQueryParameter("InstanceId.9", instanceId9);
	}

	public String getInstanceId10() {
		return this.instanceId10;
	}

	public void setInstanceId10(String instanceId10) {
		this.instanceId10 = instanceId10;
		putQueryParameter("InstanceId.10", instanceId10);
	}

	public String getInstanceId11() {
		return this.instanceId11;
	}

	public void setInstanceId11(String instanceId11) {
		this.instanceId11 = instanceId11;
		putQueryParameter("InstanceId.11", instanceId11);
	}

	public String getInstanceId12() {
		return this.instanceId12;
	}

	public void setInstanceId12(String instanceId12) {
		this.instanceId12 = instanceId12;
		putQueryParameter("InstanceId.12", instanceId12);
	}

	public String getInstanceId13() {
		return this.instanceId13;
	}

	public void setInstanceId13(String instanceId13) {
		this.instanceId13 = instanceId13;
		putQueryParameter("InstanceId.13", instanceId13);
	}

	public String getInstanceId14() {
		return this.instanceId14;
	}

	public void setInstanceId14(String instanceId14) {
		this.instanceId14 = instanceId14;
		putQueryParameter("InstanceId.14", instanceId14);
	}

	public String getInstanceId15() {
		return this.instanceId15;
	}

	public void setInstanceId15(String instanceId15) {
		this.instanceId15 = instanceId15;
		putQueryParameter("InstanceId.15", instanceId15);
	}

	public String getInstanceId16() {
		return this.instanceId16;
	}

	public void setInstanceId16(String instanceId16) {
		this.instanceId16 = instanceId16;
		putQueryParameter("InstanceId.16", instanceId16);
	}

	public String getInstanceId17() {
		return this.instanceId17;
	}

	public void setInstanceId17(String instanceId17) {
		this.instanceId17 = instanceId17;
		putQueryParameter("InstanceId.17", instanceId17);
	}

	public String getInstanceId18() {
		return this.instanceId18;
	}

	public void setInstanceId18(String instanceId18) {
		this.instanceId18 = instanceId18;
		putQueryParameter("InstanceId.18", instanceId18);
	}

	public String getInstanceId19() {
		return this.instanceId19;
	}

	public void setInstanceId19(String instanceId19) {
		this.instanceId19 = instanceId19;
		putQueryParameter("InstanceId.19", instanceId19);
	}

	public String getInstanceId20() {
		return this.instanceId20;
	}

	public void setInstanceId20(String instanceId20) {
		this.instanceId20 = instanceId20;
		putQueryParameter("InstanceId.20", instanceId20);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<RemoveInstancesResponse> getResponseClass() {
		return RemoveInstancesResponse.class;
	}

}
