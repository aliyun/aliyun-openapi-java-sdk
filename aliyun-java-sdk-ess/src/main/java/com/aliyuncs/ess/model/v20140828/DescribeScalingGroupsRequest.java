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
public class DescribeScalingGroupsRequest extends RpcAcsRequest<DescribeScalingGroupsResponse> {
	
	public DescribeScalingGroupsRequest() {
		super("Ess", "2014-08-28", "DescribeScalingGroups");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private String scalingGroupId1;

	private String scalingGroupId2;

	private String scalingGroupId3;

	private String scalingGroupId4;

	private String scalingGroupId5;

	private String scalingGroupId6;

	private String scalingGroupId7;

	private String scalingGroupId8;

	private String scalingGroupId9;

	private String scalingGroupId10;

	private String scalingGroupId12;

	private String scalingGroupId13;

	private String scalingGroupId14;

	private String scalingGroupId15;

	private String scalingGroupId16;

	private String scalingGroupId17;

	private String scalingGroupId18;

	private String scalingGroupId19;

	private String scalingGroupId20;

	private String scalingGroupName1;

	private String scalingGroupName2;

	private String scalingGroupName3;

	private String scalingGroupName4;

	private String scalingGroupName5;

	private String scalingGroupName6;

	private String scalingGroupName7;

	private String scalingGroupName8;

	private String scalingGroupName9;

	private String scalingGroupName10;

	private String scalingGroupName11;

	private String scalingGroupName12;

	private String scalingGroupName13;

	private String scalingGroupName14;

	private String scalingGroupName15;

	private String scalingGroupName16;

	private String scalingGroupName17;

	private String scalingGroupName18;

	private String scalingGroupName19;

	private String scalingGroupName20;

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

	public String getScalingGroupId1() {
		return this.scalingGroupId1;
	}

	public void setScalingGroupId1(String scalingGroupId1) {
		this.scalingGroupId1 = scalingGroupId1;
		putQueryParameter("ScalingGroupId.1", scalingGroupId1);
	}

	public String getScalingGroupId2() {
		return this.scalingGroupId2;
	}

	public void setScalingGroupId2(String scalingGroupId2) {
		this.scalingGroupId2 = scalingGroupId2;
		putQueryParameter("ScalingGroupId.2", scalingGroupId2);
	}

	public String getScalingGroupId3() {
		return this.scalingGroupId3;
	}

	public void setScalingGroupId3(String scalingGroupId3) {
		this.scalingGroupId3 = scalingGroupId3;
		putQueryParameter("ScalingGroupId.3", scalingGroupId3);
	}

	public String getScalingGroupId4() {
		return this.scalingGroupId4;
	}

	public void setScalingGroupId4(String scalingGroupId4) {
		this.scalingGroupId4 = scalingGroupId4;
		putQueryParameter("ScalingGroupId.4", scalingGroupId4);
	}

	public String getScalingGroupId5() {
		return this.scalingGroupId5;
	}

	public void setScalingGroupId5(String scalingGroupId5) {
		this.scalingGroupId5 = scalingGroupId5;
		putQueryParameter("ScalingGroupId.5", scalingGroupId5);
	}

	public String getScalingGroupId6() {
		return this.scalingGroupId6;
	}

	public void setScalingGroupId6(String scalingGroupId6) {
		this.scalingGroupId6 = scalingGroupId6;
		putQueryParameter("ScalingGroupId.6", scalingGroupId6);
	}

	public String getScalingGroupId7() {
		return this.scalingGroupId7;
	}

	public void setScalingGroupId7(String scalingGroupId7) {
		this.scalingGroupId7 = scalingGroupId7;
		putQueryParameter("ScalingGroupId.7", scalingGroupId7);
	}

	public String getScalingGroupId8() {
		return this.scalingGroupId8;
	}

	public void setScalingGroupId8(String scalingGroupId8) {
		this.scalingGroupId8 = scalingGroupId8;
		putQueryParameter("ScalingGroupId.8", scalingGroupId8);
	}

	public String getScalingGroupId9() {
		return this.scalingGroupId9;
	}

	public void setScalingGroupId9(String scalingGroupId9) {
		this.scalingGroupId9 = scalingGroupId9;
		putQueryParameter("ScalingGroupId.9", scalingGroupId9);
	}

	public String getScalingGroupId10() {
		return this.scalingGroupId10;
	}

	public void setScalingGroupId10(String scalingGroupId10) {
		this.scalingGroupId10 = scalingGroupId10;
		putQueryParameter("ScalingGroupId.10", scalingGroupId10);
	}

	public String getScalingGroupId12() {
		return this.scalingGroupId12;
	}

	public void setScalingGroupId12(String scalingGroupId12) {
		this.scalingGroupId12 = scalingGroupId12;
		putQueryParameter("ScalingGroupId.12", scalingGroupId12);
	}

	public String getScalingGroupId13() {
		return this.scalingGroupId13;
	}

	public void setScalingGroupId13(String scalingGroupId13) {
		this.scalingGroupId13 = scalingGroupId13;
		putQueryParameter("ScalingGroupId.13", scalingGroupId13);
	}

	public String getScalingGroupId14() {
		return this.scalingGroupId14;
	}

	public void setScalingGroupId14(String scalingGroupId14) {
		this.scalingGroupId14 = scalingGroupId14;
		putQueryParameter("ScalingGroupId.14", scalingGroupId14);
	}

	public String getScalingGroupId15() {
		return this.scalingGroupId15;
	}

	public void setScalingGroupId15(String scalingGroupId15) {
		this.scalingGroupId15 = scalingGroupId15;
		putQueryParameter("ScalingGroupId.15", scalingGroupId15);
	}

	public String getScalingGroupId16() {
		return this.scalingGroupId16;
	}

	public void setScalingGroupId16(String scalingGroupId16) {
		this.scalingGroupId16 = scalingGroupId16;
		putQueryParameter("ScalingGroupId.16", scalingGroupId16);
	}

	public String getScalingGroupId17() {
		return this.scalingGroupId17;
	}

	public void setScalingGroupId17(String scalingGroupId17) {
		this.scalingGroupId17 = scalingGroupId17;
		putQueryParameter("ScalingGroupId.17", scalingGroupId17);
	}

	public String getScalingGroupId18() {
		return this.scalingGroupId18;
	}

	public void setScalingGroupId18(String scalingGroupId18) {
		this.scalingGroupId18 = scalingGroupId18;
		putQueryParameter("ScalingGroupId.18", scalingGroupId18);
	}

	public String getScalingGroupId19() {
		return this.scalingGroupId19;
	}

	public void setScalingGroupId19(String scalingGroupId19) {
		this.scalingGroupId19 = scalingGroupId19;
		putQueryParameter("ScalingGroupId.19", scalingGroupId19);
	}

	public String getScalingGroupId20() {
		return this.scalingGroupId20;
	}

	public void setScalingGroupId20(String scalingGroupId20) {
		this.scalingGroupId20 = scalingGroupId20;
		putQueryParameter("ScalingGroupId.20", scalingGroupId20);
	}

	public String getScalingGroupName1() {
		return this.scalingGroupName1;
	}

	public void setScalingGroupName1(String scalingGroupName1) {
		this.scalingGroupName1 = scalingGroupName1;
		putQueryParameter("ScalingGroupName.1", scalingGroupName1);
	}

	public String getScalingGroupName2() {
		return this.scalingGroupName2;
	}

	public void setScalingGroupName2(String scalingGroupName2) {
		this.scalingGroupName2 = scalingGroupName2;
		putQueryParameter("ScalingGroupName.2", scalingGroupName2);
	}

	public String getScalingGroupName3() {
		return this.scalingGroupName3;
	}

	public void setScalingGroupName3(String scalingGroupName3) {
		this.scalingGroupName3 = scalingGroupName3;
		putQueryParameter("ScalingGroupName.3", scalingGroupName3);
	}

	public String getScalingGroupName4() {
		return this.scalingGroupName4;
	}

	public void setScalingGroupName4(String scalingGroupName4) {
		this.scalingGroupName4 = scalingGroupName4;
		putQueryParameter("ScalingGroupName.4", scalingGroupName4);
	}

	public String getScalingGroupName5() {
		return this.scalingGroupName5;
	}

	public void setScalingGroupName5(String scalingGroupName5) {
		this.scalingGroupName5 = scalingGroupName5;
		putQueryParameter("ScalingGroupName.5", scalingGroupName5);
	}

	public String getScalingGroupName6() {
		return this.scalingGroupName6;
	}

	public void setScalingGroupName6(String scalingGroupName6) {
		this.scalingGroupName6 = scalingGroupName6;
		putQueryParameter("ScalingGroupName.6", scalingGroupName6);
	}

	public String getScalingGroupName7() {
		return this.scalingGroupName7;
	}

	public void setScalingGroupName7(String scalingGroupName7) {
		this.scalingGroupName7 = scalingGroupName7;
		putQueryParameter("ScalingGroupName.7", scalingGroupName7);
	}

	public String getScalingGroupName8() {
		return this.scalingGroupName8;
	}

	public void setScalingGroupName8(String scalingGroupName8) {
		this.scalingGroupName8 = scalingGroupName8;
		putQueryParameter("ScalingGroupName.8", scalingGroupName8);
	}

	public String getScalingGroupName9() {
		return this.scalingGroupName9;
	}

	public void setScalingGroupName9(String scalingGroupName9) {
		this.scalingGroupName9 = scalingGroupName9;
		putQueryParameter("ScalingGroupName.9", scalingGroupName9);
	}

	public String getScalingGroupName10() {
		return this.scalingGroupName10;
	}

	public void setScalingGroupName10(String scalingGroupName10) {
		this.scalingGroupName10 = scalingGroupName10;
		putQueryParameter("ScalingGroupName.10", scalingGroupName10);
	}

	public String getScalingGroupName11() {
		return this.scalingGroupName11;
	}

	public void setScalingGroupName11(String scalingGroupName11) {
		this.scalingGroupName11 = scalingGroupName11;
		putQueryParameter("ScalingGroupName.11", scalingGroupName11);
	}

	public String getScalingGroupName12() {
		return this.scalingGroupName12;
	}

	public void setScalingGroupName12(String scalingGroupName12) {
		this.scalingGroupName12 = scalingGroupName12;
		putQueryParameter("ScalingGroupName.12", scalingGroupName12);
	}

	public String getScalingGroupName13() {
		return this.scalingGroupName13;
	}

	public void setScalingGroupName13(String scalingGroupName13) {
		this.scalingGroupName13 = scalingGroupName13;
		putQueryParameter("ScalingGroupName.13", scalingGroupName13);
	}

	public String getScalingGroupName14() {
		return this.scalingGroupName14;
	}

	public void setScalingGroupName14(String scalingGroupName14) {
		this.scalingGroupName14 = scalingGroupName14;
		putQueryParameter("ScalingGroupName.14", scalingGroupName14);
	}

	public String getScalingGroupName15() {
		return this.scalingGroupName15;
	}

	public void setScalingGroupName15(String scalingGroupName15) {
		this.scalingGroupName15 = scalingGroupName15;
		putQueryParameter("ScalingGroupName.15", scalingGroupName15);
	}

	public String getScalingGroupName16() {
		return this.scalingGroupName16;
	}

	public void setScalingGroupName16(String scalingGroupName16) {
		this.scalingGroupName16 = scalingGroupName16;
		putQueryParameter("ScalingGroupName.16", scalingGroupName16);
	}

	public String getScalingGroupName17() {
		return this.scalingGroupName17;
	}

	public void setScalingGroupName17(String scalingGroupName17) {
		this.scalingGroupName17 = scalingGroupName17;
		putQueryParameter("ScalingGroupName.17", scalingGroupName17);
	}

	public String getScalingGroupName18() {
		return this.scalingGroupName18;
	}

	public void setScalingGroupName18(String scalingGroupName18) {
		this.scalingGroupName18 = scalingGroupName18;
		putQueryParameter("ScalingGroupName.18", scalingGroupName18);
	}

	public String getScalingGroupName19() {
		return this.scalingGroupName19;
	}

	public void setScalingGroupName19(String scalingGroupName19) {
		this.scalingGroupName19 = scalingGroupName19;
		putQueryParameter("ScalingGroupName.19", scalingGroupName19);
	}

	public String getScalingGroupName20() {
		return this.scalingGroupName20;
	}

	public void setScalingGroupName20(String scalingGroupName20) {
		this.scalingGroupName20 = scalingGroupName20;
		putQueryParameter("ScalingGroupName.20", scalingGroupName20);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<DescribeScalingGroupsResponse> getResponseClass() {
		return DescribeScalingGroupsResponse.class;
	}

}
