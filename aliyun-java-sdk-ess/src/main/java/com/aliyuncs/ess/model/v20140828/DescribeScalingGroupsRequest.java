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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingGroupsRequest extends RpcAcsRequest<DescribeScalingGroupsResponse> {
	   

	private Long resourceOwnerId;

	private List<String> scalingGroupIds;

	private Integer pageNumber;

	private Integer pageSize;

	private String scalingGroupName20;

	private String scalingGroupName19;

	private String scalingGroupName18;

	private String scalingGroupName17;

	private String scalingGroupName16;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private String ownerAccount;

	private Long ownerId;

	private String scalingGroupName1;

	private String scalingGroupName2;

	private String scalingGroupName7;

	private String scalingGroupName11;

	private String scalingGroupName8;

	private String scalingGroupName10;

	private String scalingGroupName9;

	private String scalingGroupName3;

	private String scalingGroupName15;

	private String scalingGroupName4;

	private String scalingGroupName14;

	private String scalingGroupName5;

	private String scalingGroupName13;

	private String scalingGroupName6;

	private String scalingGroupName12;
	public DescribeScalingGroupsRequest() {
		super("Ess", "2014-08-28", "DescribeScalingGroups", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getScalingGroupIds() {
		return this.scalingGroupIds;
	}

	public void setScalingGroupIds(List<String> scalingGroupIds) {
		this.scalingGroupIds = scalingGroupIds;	
		if (scalingGroupIds != null) {
			for (int i = 0; i < scalingGroupIds.size(); i++) {
				putQueryParameter("ScalingGroupId." + (i + 1) , scalingGroupIds.get(i));
			}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getScalingGroupName9() {
		return this.scalingGroupName9;
	}

	public void setScalingGroupName9(String scalingGroupName9) {
		this.scalingGroupName9 = scalingGroupName9;
		if(scalingGroupName9 != null){
			putQueryParameter("ScalingGroupName.9", scalingGroupName9);
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
