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
public class DescribeScalingConfigurationsRequest extends RpcAcsRequest<DescribeScalingConfigurationsResponse> {
	   

	private String scalingConfigurationId6;

	private String scalingConfigurationId7;

	private Long resourceOwnerId;

	private String scalingConfigurationId4;

	private String scalingConfigurationId5;

	private String scalingGroupId;

	private String scalingConfigurationId8;

	private String scalingConfigurationId9;

	private String scalingConfigurationId10;

	private Integer pageNumber;

	private String scalingConfigurationName2;

	private String scalingConfigurationName3;

	private String scalingConfigurationName1;

	private Integer pageSize;

	private String scalingConfigurationId2;

	private String scalingConfigurationId3;

	private String scalingConfigurationId1;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String scalingConfigurationName6;

	private String scalingConfigurationName7;

	private String scalingConfigurationName4;

	private String scalingConfigurationName5;

	private Long ownerId;

	private String scalingConfigurationName8;

	private String scalingConfigurationName9;

	private String scalingConfigurationName10;
	public DescribeScalingConfigurationsRequest() {
		super("Ess", "2014-08-28", "DescribeScalingConfigurations", "ess");
		setMethod(MethodType.POST);
	}

	public String getScalingConfigurationId6() {
		return this.scalingConfigurationId6;
	}

	public void setScalingConfigurationId6(String scalingConfigurationId6) {
		this.scalingConfigurationId6 = scalingConfigurationId6;
		if(scalingConfigurationId6 != null){
			putQueryParameter("ScalingConfigurationId.6", scalingConfigurationId6);
		}
	}

	public String getScalingConfigurationId7() {
		return this.scalingConfigurationId7;
	}

	public void setScalingConfigurationId7(String scalingConfigurationId7) {
		this.scalingConfigurationId7 = scalingConfigurationId7;
		if(scalingConfigurationId7 != null){
			putQueryParameter("ScalingConfigurationId.7", scalingConfigurationId7);
		}
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

	public String getScalingConfigurationId4() {
		return this.scalingConfigurationId4;
	}

	public void setScalingConfigurationId4(String scalingConfigurationId4) {
		this.scalingConfigurationId4 = scalingConfigurationId4;
		if(scalingConfigurationId4 != null){
			putQueryParameter("ScalingConfigurationId.4", scalingConfigurationId4);
		}
	}

	public String getScalingConfigurationId5() {
		return this.scalingConfigurationId5;
	}

	public void setScalingConfigurationId5(String scalingConfigurationId5) {
		this.scalingConfigurationId5 = scalingConfigurationId5;
		if(scalingConfigurationId5 != null){
			putQueryParameter("ScalingConfigurationId.5", scalingConfigurationId5);
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public String getScalingConfigurationId8() {
		return this.scalingConfigurationId8;
	}

	public void setScalingConfigurationId8(String scalingConfigurationId8) {
		this.scalingConfigurationId8 = scalingConfigurationId8;
		if(scalingConfigurationId8 != null){
			putQueryParameter("ScalingConfigurationId.8", scalingConfigurationId8);
		}
	}

	public String getScalingConfigurationId9() {
		return this.scalingConfigurationId9;
	}

	public void setScalingConfigurationId9(String scalingConfigurationId9) {
		this.scalingConfigurationId9 = scalingConfigurationId9;
		if(scalingConfigurationId9 != null){
			putQueryParameter("ScalingConfigurationId.9", scalingConfigurationId9);
		}
	}

	public String getScalingConfigurationId10() {
		return this.scalingConfigurationId10;
	}

	public void setScalingConfigurationId10(String scalingConfigurationId10) {
		this.scalingConfigurationId10 = scalingConfigurationId10;
		if(scalingConfigurationId10 != null){
			putQueryParameter("ScalingConfigurationId.10", scalingConfigurationId10);
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

	public String getScalingConfigurationName2() {
		return this.scalingConfigurationName2;
	}

	public void setScalingConfigurationName2(String scalingConfigurationName2) {
		this.scalingConfigurationName2 = scalingConfigurationName2;
		if(scalingConfigurationName2 != null){
			putQueryParameter("ScalingConfigurationName.2", scalingConfigurationName2);
		}
	}

	public String getScalingConfigurationName3() {
		return this.scalingConfigurationName3;
	}

	public void setScalingConfigurationName3(String scalingConfigurationName3) {
		this.scalingConfigurationName3 = scalingConfigurationName3;
		if(scalingConfigurationName3 != null){
			putQueryParameter("ScalingConfigurationName.3", scalingConfigurationName3);
		}
	}

	public String getScalingConfigurationName1() {
		return this.scalingConfigurationName1;
	}

	public void setScalingConfigurationName1(String scalingConfigurationName1) {
		this.scalingConfigurationName1 = scalingConfigurationName1;
		if(scalingConfigurationName1 != null){
			putQueryParameter("ScalingConfigurationName.1", scalingConfigurationName1);
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

	public String getScalingConfigurationId2() {
		return this.scalingConfigurationId2;
	}

	public void setScalingConfigurationId2(String scalingConfigurationId2) {
		this.scalingConfigurationId2 = scalingConfigurationId2;
		if(scalingConfigurationId2 != null){
			putQueryParameter("ScalingConfigurationId.2", scalingConfigurationId2);
		}
	}

	public String getScalingConfigurationId3() {
		return this.scalingConfigurationId3;
	}

	public void setScalingConfigurationId3(String scalingConfigurationId3) {
		this.scalingConfigurationId3 = scalingConfigurationId3;
		if(scalingConfigurationId3 != null){
			putQueryParameter("ScalingConfigurationId.3", scalingConfigurationId3);
		}
	}

	public String getScalingConfigurationId1() {
		return this.scalingConfigurationId1;
	}

	public void setScalingConfigurationId1(String scalingConfigurationId1) {
		this.scalingConfigurationId1 = scalingConfigurationId1;
		if(scalingConfigurationId1 != null){
			putQueryParameter("ScalingConfigurationId.1", scalingConfigurationId1);
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

	public String getScalingConfigurationName6() {
		return this.scalingConfigurationName6;
	}

	public void setScalingConfigurationName6(String scalingConfigurationName6) {
		this.scalingConfigurationName6 = scalingConfigurationName6;
		if(scalingConfigurationName6 != null){
			putQueryParameter("ScalingConfigurationName.6", scalingConfigurationName6);
		}
	}

	public String getScalingConfigurationName7() {
		return this.scalingConfigurationName7;
	}

	public void setScalingConfigurationName7(String scalingConfigurationName7) {
		this.scalingConfigurationName7 = scalingConfigurationName7;
		if(scalingConfigurationName7 != null){
			putQueryParameter("ScalingConfigurationName.7", scalingConfigurationName7);
		}
	}

	public String getScalingConfigurationName4() {
		return this.scalingConfigurationName4;
	}

	public void setScalingConfigurationName4(String scalingConfigurationName4) {
		this.scalingConfigurationName4 = scalingConfigurationName4;
		if(scalingConfigurationName4 != null){
			putQueryParameter("ScalingConfigurationName.4", scalingConfigurationName4);
		}
	}

	public String getScalingConfigurationName5() {
		return this.scalingConfigurationName5;
	}

	public void setScalingConfigurationName5(String scalingConfigurationName5) {
		this.scalingConfigurationName5 = scalingConfigurationName5;
		if(scalingConfigurationName5 != null){
			putQueryParameter("ScalingConfigurationName.5", scalingConfigurationName5);
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

	public String getScalingConfigurationName8() {
		return this.scalingConfigurationName8;
	}

	public void setScalingConfigurationName8(String scalingConfigurationName8) {
		this.scalingConfigurationName8 = scalingConfigurationName8;
		if(scalingConfigurationName8 != null){
			putQueryParameter("ScalingConfigurationName.8", scalingConfigurationName8);
		}
	}

	public String getScalingConfigurationName9() {
		return this.scalingConfigurationName9;
	}

	public void setScalingConfigurationName9(String scalingConfigurationName9) {
		this.scalingConfigurationName9 = scalingConfigurationName9;
		if(scalingConfigurationName9 != null){
			putQueryParameter("ScalingConfigurationName.9", scalingConfigurationName9);
		}
	}

	public String getScalingConfigurationName10() {
		return this.scalingConfigurationName10;
	}

	public void setScalingConfigurationName10(String scalingConfigurationName10) {
		this.scalingConfigurationName10 = scalingConfigurationName10;
		if(scalingConfigurationName10 != null){
			putQueryParameter("ScalingConfigurationName.10", scalingConfigurationName10);
		}
	}

	@Override
	public Class<DescribeScalingConfigurationsResponse> getResponseClass() {
		return DescribeScalingConfigurationsResponse.class;
	}

}
