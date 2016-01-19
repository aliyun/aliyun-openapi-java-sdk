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
public class DescribeScalingConfigurationsRequest extends RpcAcsRequest<DescribeScalingConfigurationsResponse> {
	
	public DescribeScalingConfigurationsRequest() {
		super("Ess", "2014-08-28", "DescribeScalingConfigurations");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private String scalingGroupId;

	private String scalingConfigurationId1;

	private String scalingConfigurationId2;

	private String scalingConfigurationId3;

	private String scalingConfigurationId4;

	private String scalingConfigurationId5;

	private String scalingConfigurationId6;

	private String scalingConfigurationId7;

	private String scalingConfigurationId8;

	private String scalingConfigurationId9;

	private String scalingConfigurationId10;

	private String scalingConfigurationName1;

	private String scalingConfigurationName2;

	private String scalingConfigurationName3;

	private String scalingConfigurationName4;

	private String scalingConfigurationName5;

	private String scalingConfigurationName6;

	private String scalingConfigurationName7;

	private String scalingConfigurationName8;

	private String scalingConfigurationName9;

	private String scalingConfigurationName10;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		putQueryParameter("ScalingGroupId", scalingGroupId);
	}

	public String getScalingConfigurationId1() {
		return this.scalingConfigurationId1;
	}

	public void setScalingConfigurationId1(String scalingConfigurationId1) {
		this.scalingConfigurationId1 = scalingConfigurationId1;
		putQueryParameter("ScalingConfigurationId.1", scalingConfigurationId1);
	}

	public String getScalingConfigurationId2() {
		return this.scalingConfigurationId2;
	}

	public void setScalingConfigurationId2(String scalingConfigurationId2) {
		this.scalingConfigurationId2 = scalingConfigurationId2;
		putQueryParameter("ScalingConfigurationId.2", scalingConfigurationId2);
	}

	public String getScalingConfigurationId3() {
		return this.scalingConfigurationId3;
	}

	public void setScalingConfigurationId3(String scalingConfigurationId3) {
		this.scalingConfigurationId3 = scalingConfigurationId3;
		putQueryParameter("ScalingConfigurationId.3", scalingConfigurationId3);
	}

	public String getScalingConfigurationId4() {
		return this.scalingConfigurationId4;
	}

	public void setScalingConfigurationId4(String scalingConfigurationId4) {
		this.scalingConfigurationId4 = scalingConfigurationId4;
		putQueryParameter("ScalingConfigurationId.4", scalingConfigurationId4);
	}

	public String getScalingConfigurationId5() {
		return this.scalingConfigurationId5;
	}

	public void setScalingConfigurationId5(String scalingConfigurationId5) {
		this.scalingConfigurationId5 = scalingConfigurationId5;
		putQueryParameter("ScalingConfigurationId.5", scalingConfigurationId5);
	}

	public String getScalingConfigurationId6() {
		return this.scalingConfigurationId6;
	}

	public void setScalingConfigurationId6(String scalingConfigurationId6) {
		this.scalingConfigurationId6 = scalingConfigurationId6;
		putQueryParameter("ScalingConfigurationId.6", scalingConfigurationId6);
	}

	public String getScalingConfigurationId7() {
		return this.scalingConfigurationId7;
	}

	public void setScalingConfigurationId7(String scalingConfigurationId7) {
		this.scalingConfigurationId7 = scalingConfigurationId7;
		putQueryParameter("ScalingConfigurationId.7", scalingConfigurationId7);
	}

	public String getScalingConfigurationId8() {
		return this.scalingConfigurationId8;
	}

	public void setScalingConfigurationId8(String scalingConfigurationId8) {
		this.scalingConfigurationId8 = scalingConfigurationId8;
		putQueryParameter("ScalingConfigurationId.8", scalingConfigurationId8);
	}

	public String getScalingConfigurationId9() {
		return this.scalingConfigurationId9;
	}

	public void setScalingConfigurationId9(String scalingConfigurationId9) {
		this.scalingConfigurationId9 = scalingConfigurationId9;
		putQueryParameter("ScalingConfigurationId.9", scalingConfigurationId9);
	}

	public String getScalingConfigurationId10() {
		return this.scalingConfigurationId10;
	}

	public void setScalingConfigurationId10(String scalingConfigurationId10) {
		this.scalingConfigurationId10 = scalingConfigurationId10;
		putQueryParameter("ScalingConfigurationId.10", scalingConfigurationId10);
	}

	public String getScalingConfigurationName1() {
		return this.scalingConfigurationName1;
	}

	public void setScalingConfigurationName1(String scalingConfigurationName1) {
		this.scalingConfigurationName1 = scalingConfigurationName1;
		putQueryParameter("ScalingConfigurationName.1", scalingConfigurationName1);
	}

	public String getScalingConfigurationName2() {
		return this.scalingConfigurationName2;
	}

	public void setScalingConfigurationName2(String scalingConfigurationName2) {
		this.scalingConfigurationName2 = scalingConfigurationName2;
		putQueryParameter("ScalingConfigurationName.2", scalingConfigurationName2);
	}

	public String getScalingConfigurationName3() {
		return this.scalingConfigurationName3;
	}

	public void setScalingConfigurationName3(String scalingConfigurationName3) {
		this.scalingConfigurationName3 = scalingConfigurationName3;
		putQueryParameter("ScalingConfigurationName.3", scalingConfigurationName3);
	}

	public String getScalingConfigurationName4() {
		return this.scalingConfigurationName4;
	}

	public void setScalingConfigurationName4(String scalingConfigurationName4) {
		this.scalingConfigurationName4 = scalingConfigurationName4;
		putQueryParameter("ScalingConfigurationName.4", scalingConfigurationName4);
	}

	public String getScalingConfigurationName5() {
		return this.scalingConfigurationName5;
	}

	public void setScalingConfigurationName5(String scalingConfigurationName5) {
		this.scalingConfigurationName5 = scalingConfigurationName5;
		putQueryParameter("ScalingConfigurationName.5", scalingConfigurationName5);
	}

	public String getScalingConfigurationName6() {
		return this.scalingConfigurationName6;
	}

	public void setScalingConfigurationName6(String scalingConfigurationName6) {
		this.scalingConfigurationName6 = scalingConfigurationName6;
		putQueryParameter("ScalingConfigurationName.6", scalingConfigurationName6);
	}

	public String getScalingConfigurationName7() {
		return this.scalingConfigurationName7;
	}

	public void setScalingConfigurationName7(String scalingConfigurationName7) {
		this.scalingConfigurationName7 = scalingConfigurationName7;
		putQueryParameter("ScalingConfigurationName.7", scalingConfigurationName7);
	}

	public String getScalingConfigurationName8() {
		return this.scalingConfigurationName8;
	}

	public void setScalingConfigurationName8(String scalingConfigurationName8) {
		this.scalingConfigurationName8 = scalingConfigurationName8;
		putQueryParameter("ScalingConfigurationName.8", scalingConfigurationName8);
	}

	public String getScalingConfigurationName9() {
		return this.scalingConfigurationName9;
	}

	public void setScalingConfigurationName9(String scalingConfigurationName9) {
		this.scalingConfigurationName9 = scalingConfigurationName9;
		putQueryParameter("ScalingConfigurationName.9", scalingConfigurationName9);
	}

	public String getScalingConfigurationName10() {
		return this.scalingConfigurationName10;
	}

	public void setScalingConfigurationName10(String scalingConfigurationName10) {
		this.scalingConfigurationName10 = scalingConfigurationName10;
		putQueryParameter("ScalingConfigurationName.10", scalingConfigurationName10);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<DescribeScalingConfigurationsResponse> getResponseClass() {
		return DescribeScalingConfigurationsResponse.class;
	}

}
