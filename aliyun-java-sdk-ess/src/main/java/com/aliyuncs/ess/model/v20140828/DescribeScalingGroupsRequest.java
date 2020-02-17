/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingGroupsRequest extends RpcAcsRequest<DescribeScalingGroupsResponse> {
	   

	private Long resourceOwnerId;

	private String scalingGroupId10;

	private String scalingGroupId12;

	private String scalingGroupId13;

	private String scalingGroupId14;

	private String scalingGroupId15;

	private Long ownerId;

	private Integer pageNumber;

	private Integer pageSize;

	private String scalingGroupName20;

	private String scalingGroupName19;

	private String scalingGroupId20;

	private String scalingGroupName18;

	private String scalingGroupName17;

	private String scalingGroupName16;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private String ownerAccount;

	private String scalingGroupName1;

	private String scalingGroupName2;

	private String scalingGroupId2;

	private String scalingGroupId1;

	private String scalingGroupId6;

	private String scalingGroupId16;

	private String scalingGroupName7;

	private String scalingGroupName11;

	private String scalingGroupId5;

	private String scalingGroupId17;

	private String scalingGroupName8;

	private String scalingGroupName10;

	private String scalingGroupId4;

	private String scalingGroupId18;

	private String scalingGroupName9;

	private String scalingGroupId3;

	private String scalingGroupId19;

	private String scalingGroupName3;

	private String scalingGroupName15;

	private String scalingGroupId9;

	private String scalingGroupName4;

	private String scalingGroupName14;

	private String scalingGroupId8;

	private String scalingGroupName5;

	private String scalingGroupName13;

	private String scalingGroupId7;

	private String scalingGroupName6;

	private String scalingGroupName12;
	public DescribeScalingGroupsRequest() {
		super("Ess", "2014-08-28", "DescribeScalingGroups", "ess");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getScalingGroupId10() {
		return this.scalingGroupId10;
	}

	public void setScalingGroupId10(String scalingGroupId10) {
		this.scalingGroupId10 = scalingGroupId10;
		if(scalingGroupId10 != null){
			putQueryParameter("ScalingGroupId.10", scalingGroupId10);
		}
	}

	public String getScalingGroupId12() {
		return this.scalingGroupId12;
	}

	public void setScalingGroupId12(String scalingGroupId12) {
		this.scalingGroupId12 = scalingGroupId12;
		if(scalingGroupId12 != null){
			putQueryParameter("ScalingGroupId.12", scalingGroupId12);
		}
	}

	public String getScalingGroupId13() {
		return this.scalingGroupId13;
	}

	public void setScalingGroupId13(String scalingGroupId13) {
		this.scalingGroupId13 = scalingGroupId13;
		if(scalingGroupId13 != null){
			putQueryParameter("ScalingGroupId.13", scalingGroupId13);
		}
	}

	public String getScalingGroupId14() {
		return this.scalingGroupId14;
	}

	public void setScalingGroupId14(String scalingGroupId14) {
		this.scalingGroupId14 = scalingGroupId14;
		if(scalingGroupId14 != null){
			putQueryParameter("ScalingGroupId.14", scalingGroupId14);
		}
	}

	public String getScalingGroupId15() {
		return this.scalingGroupId15;
	}

	public void setScalingGroupId15(String scalingGroupId15) {
		this.scalingGroupId15 = scalingGroupId15;
		if(scalingGroupId15 != null){
			putQueryParameter("ScalingGroupId.15", scalingGroupId15);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getScalingGroupName20() {
		return this.scalingGroupName20;
	}

	public void setScalingGroupName20(String scalingGroupName20) {
		this.scalingGroupName20 = scalingGroupName20;
		if(scalingGroupName20 != null){
			putQueryParameter("ScalingGroupName.20", scalingGroupName20);
		}
	}

	public String getScalingGroupName19() {
		return this.scalingGroupName19;
	}

	public void setScalingGroupName19(String scalingGroupName19) {
		this.scalingGroupName19 = scalingGroupName19;
		if(scalingGroupName19 != null){
			putQueryParameter("ScalingGroupName.19", scalingGroupName19);
		}
	}

	public String getScalingGroupId20() {
		return this.scalingGroupId20;
	}

	public void setScalingGroupId20(String scalingGroupId20) {
		this.scalingGroupId20 = scalingGroupId20;
		if(scalingGroupId20 != null){
			putQueryParameter("ScalingGroupId.20", scalingGroupId20);
		}
	}

	public String getScalingGroupName18() {
		return this.scalingGroupName18;
	}

	public void setScalingGroupName18(String scalingGroupName18) {
		this.scalingGroupName18 = scalingGroupName18;
		if(scalingGroupName18 != null){
			putQueryParameter("ScalingGroupName.18", scalingGroupName18);
		}
	}

	public String getScalingGroupName17() {
		return this.scalingGroupName17;
	}

	public void setScalingGroupName17(String scalingGroupName17) {
		this.scalingGroupName17 = scalingGroupName17;
		if(scalingGroupName17 != null){
			putQueryParameter("ScalingGroupName.17", scalingGroupName17);
		}
	}

	public String getScalingGroupName16() {
		return this.scalingGroupName16;
	}

	public void setScalingGroupName16(String scalingGroupName16) {
		this.scalingGroupName16 = scalingGroupName16;
		if(scalingGroupName16 != null){
			putQueryParameter("ScalingGroupName.16", scalingGroupName16);
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

	public String getScalingGroupName() {
		return this.scalingGroupName;
	}

	public void setScalingGroupName(String scalingGroupName) {
		this.scalingGroupName = scalingGroupName;
		if(scalingGroupName != null){
			putQueryParameter("ScalingGroupName", scalingGroupName);
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

	public String getScalingGroupName1() {
		return this.scalingGroupName1;
	}

	public void setScalingGroupName1(String scalingGroupName1) {
		this.scalingGroupName1 = scalingGroupName1;
		if(scalingGroupName1 != null){
			putQueryParameter("ScalingGroupName.1", scalingGroupName1);
		}
	}

	public String getScalingGroupName2() {
		return this.scalingGroupName2;
	}

	public void setScalingGroupName2(String scalingGroupName2) {
		this.scalingGroupName2 = scalingGroupName2;
		if(scalingGroupName2 != null){
			putQueryParameter("ScalingGroupName.2", scalingGroupName2);
		}
	}

	public String getScalingGroupId2() {
		return this.scalingGroupId2;
	}

	public void setScalingGroupId2(String scalingGroupId2) {
		this.scalingGroupId2 = scalingGroupId2;
		if(scalingGroupId2 != null){
			putQueryParameter("ScalingGroupId.2", scalingGroupId2);
		}
	}

	public String getScalingGroupId1() {
		return this.scalingGroupId1;
	}

	public void setScalingGroupId1(String scalingGroupId1) {
		this.scalingGroupId1 = scalingGroupId1;
		if(scalingGroupId1 != null){
			putQueryParameter("ScalingGroupId.1", scalingGroupId1);
		}
	}

	public String getScalingGroupId6() {
		return this.scalingGroupId6;
	}

	public void setScalingGroupId6(String scalingGroupId6) {
		this.scalingGroupId6 = scalingGroupId6;
		if(scalingGroupId6 != null){
			putQueryParameter("ScalingGroupId.6", scalingGroupId6);
		}
	}

	public String getScalingGroupId16() {
		return this.scalingGroupId16;
	}

	public void setScalingGroupId16(String scalingGroupId16) {
		this.scalingGroupId16 = scalingGroupId16;
		if(scalingGroupId16 != null){
			putQueryParameter("ScalingGroupId.16", scalingGroupId16);
		}
	}

	public String getScalingGroupName7() {
		return this.scalingGroupName7;
	}

	public void setScalingGroupName7(String scalingGroupName7) {
		this.scalingGroupName7 = scalingGroupName7;
		if(scalingGroupName7 != null){
			putQueryParameter("ScalingGroupName.7", scalingGroupName7);
		}
	}

	public String getScalingGroupName11() {
		return this.scalingGroupName11;
	}

	public void setScalingGroupName11(String scalingGroupName11) {
		this.scalingGroupName11 = scalingGroupName11;
		if(scalingGroupName11 != null){
			putQueryParameter("ScalingGroupName.11", scalingGroupName11);
		}
	}

	public String getScalingGroupId5() {
		return this.scalingGroupId5;
	}

	public void setScalingGroupId5(String scalingGroupId5) {
		this.scalingGroupId5 = scalingGroupId5;
		if(scalingGroupId5 != null){
			putQueryParameter("ScalingGroupId.5", scalingGroupId5);
		}
	}

	public String getScalingGroupId17() {
		return this.scalingGroupId17;
	}

	public void setScalingGroupId17(String scalingGroupId17) {
		this.scalingGroupId17 = scalingGroupId17;
		if(scalingGroupId17 != null){
			putQueryParameter("ScalingGroupId.17", scalingGroupId17);
		}
	}

	public String getScalingGroupName8() {
		return this.scalingGroupName8;
	}

	public void setScalingGroupName8(String scalingGroupName8) {
		this.scalingGroupName8 = scalingGroupName8;
		if(scalingGroupName8 != null){
			putQueryParameter("ScalingGroupName.8", scalingGroupName8);
		}
	}

	public String getScalingGroupName10() {
		return this.scalingGroupName10;
	}

	public void setScalingGroupName10(String scalingGroupName10) {
		this.scalingGroupName10 = scalingGroupName10;
		if(scalingGroupName10 != null){
			putQueryParameter("ScalingGroupName.10", scalingGroupName10);
		}
	}

	public String getScalingGroupId4() {
		return this.scalingGroupId4;
	}

	public void setScalingGroupId4(String scalingGroupId4) {
		this.scalingGroupId4 = scalingGroupId4;
		if(scalingGroupId4 != null){
			putQueryParameter("ScalingGroupId.4", scalingGroupId4);
		}
	}

	public String getScalingGroupId18() {
		return this.scalingGroupId18;
	}

	public void setScalingGroupId18(String scalingGroupId18) {
		this.scalingGroupId18 = scalingGroupId18;
		if(scalingGroupId18 != null){
			putQueryParameter("ScalingGroupId.18", scalingGroupId18);
		}
	}

	public String getScalingGroupName9() {
		return this.scalingGroupName9;
	}

	public void setScalingGroupName9(String scalingGroupName9) {
		this.scalingGroupName9 = scalingGroupName9;
		if(scalingGroupName9 != null){
			putQueryParameter("ScalingGroupName.9", scalingGroupName9);
		}
	}

	public String getScalingGroupId3() {
		return this.scalingGroupId3;
	}

	public void setScalingGroupId3(String scalingGroupId3) {
		this.scalingGroupId3 = scalingGroupId3;
		if(scalingGroupId3 != null){
			putQueryParameter("ScalingGroupId.3", scalingGroupId3);
		}
	}

	public String getScalingGroupId19() {
		return this.scalingGroupId19;
	}

	public void setScalingGroupId19(String scalingGroupId19) {
		this.scalingGroupId19 = scalingGroupId19;
		if(scalingGroupId19 != null){
			putQueryParameter("ScalingGroupId.19", scalingGroupId19);
		}
	}

	public String getScalingGroupName3() {
		return this.scalingGroupName3;
	}

	public void setScalingGroupName3(String scalingGroupName3) {
		this.scalingGroupName3 = scalingGroupName3;
		if(scalingGroupName3 != null){
			putQueryParameter("ScalingGroupName.3", scalingGroupName3);
		}
	}

	public String getScalingGroupName15() {
		return this.scalingGroupName15;
	}

	public void setScalingGroupName15(String scalingGroupName15) {
		this.scalingGroupName15 = scalingGroupName15;
		if(scalingGroupName15 != null){
			putQueryParameter("ScalingGroupName.15", scalingGroupName15);
		}
	}

	public String getScalingGroupId9() {
		return this.scalingGroupId9;
	}

	public void setScalingGroupId9(String scalingGroupId9) {
		this.scalingGroupId9 = scalingGroupId9;
		if(scalingGroupId9 != null){
			putQueryParameter("ScalingGroupId.9", scalingGroupId9);
		}
	}

	public String getScalingGroupName4() {
		return this.scalingGroupName4;
	}

	public void setScalingGroupName4(String scalingGroupName4) {
		this.scalingGroupName4 = scalingGroupName4;
		if(scalingGroupName4 != null){
			putQueryParameter("ScalingGroupName.4", scalingGroupName4);
		}
	}

	public String getScalingGroupName14() {
		return this.scalingGroupName14;
	}

	public void setScalingGroupName14(String scalingGroupName14) {
		this.scalingGroupName14 = scalingGroupName14;
		if(scalingGroupName14 != null){
			putQueryParameter("ScalingGroupName.14", scalingGroupName14);
		}
	}

	public String getScalingGroupId8() {
		return this.scalingGroupId8;
	}

	public void setScalingGroupId8(String scalingGroupId8) {
		this.scalingGroupId8 = scalingGroupId8;
		if(scalingGroupId8 != null){
			putQueryParameter("ScalingGroupId.8", scalingGroupId8);
		}
	}

	public String getScalingGroupName5() {
		return this.scalingGroupName5;
	}

	public void setScalingGroupName5(String scalingGroupName5) {
		this.scalingGroupName5 = scalingGroupName5;
		if(scalingGroupName5 != null){
			putQueryParameter("ScalingGroupName.5", scalingGroupName5);
		}
	}

	public String getScalingGroupName13() {
		return this.scalingGroupName13;
	}

	public void setScalingGroupName13(String scalingGroupName13) {
		this.scalingGroupName13 = scalingGroupName13;
		if(scalingGroupName13 != null){
			putQueryParameter("ScalingGroupName.13", scalingGroupName13);
		}
	}

	public String getScalingGroupId7() {
		return this.scalingGroupId7;
	}

	public void setScalingGroupId7(String scalingGroupId7) {
		this.scalingGroupId7 = scalingGroupId7;
		if(scalingGroupId7 != null){
			putQueryParameter("ScalingGroupId.7", scalingGroupId7);
		}
	}

	public String getScalingGroupName6() {
		return this.scalingGroupName6;
	}

	public void setScalingGroupName6(String scalingGroupName6) {
		this.scalingGroupName6 = scalingGroupName6;
		if(scalingGroupName6 != null){
			putQueryParameter("ScalingGroupName.6", scalingGroupName6);
		}
	}

	public String getScalingGroupName12() {
		return this.scalingGroupName12;
	}

	public void setScalingGroupName12(String scalingGroupName12) {
		this.scalingGroupName12 = scalingGroupName12;
		if(scalingGroupName12 != null){
			putQueryParameter("ScalingGroupName.12", scalingGroupName12);
		}
	}

	@Override
	public Class<DescribeScalingGroupsResponse> getResponseClass() {
		return DescribeScalingGroupsResponse.class;
	}

}
