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
public class DescribeScalingActivitiesRequest extends RpcAcsRequest<DescribeScalingActivitiesResponse> {
	   

	private String scalingActivityId9;

	private Long resourceOwnerId;

	private String scalingActivityId5;

	private String scalingActivityId6;

	private String scalingGroupId;

	private String scalingActivityId7;

	private String scalingActivityId8;

	private String scalingActivityId1;

	private String scalingActivityId2;

	private String scalingActivityId3;

	private String scalingActivityId4;

	private Integer pageNumber;

	private String statusCode;

	private Integer pageSize;

	private String scalingActivityId11;

	private String scalingActivityId10;

	private String scalingActivityId13;

	private String scalingActivityId12;

	private String scalingActivityId15;

	private String scalingActivityId14;

	private String scalingActivityId17;

	private String scalingActivityId16;

	private String scalingActivityId19;

	private String resourceOwnerAccount;

	private String scalingActivityId18;

	private String ownerAccount;

	private Long ownerId;

	private String scalingActivityId20;
	public DescribeScalingActivitiesRequest() {
		super("Ess", "2014-08-28", "DescribeScalingActivities", "ess");
		setMethod(MethodType.POST);
	}

	public String getScalingActivityId9() {
		return this.scalingActivityId9;
	}

	public void setScalingActivityId9(String scalingActivityId9) {
		this.scalingActivityId9 = scalingActivityId9;
		if(scalingActivityId9 != null){
			putQueryParameter("ScalingActivityId.9", scalingActivityId9);
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

	public String getScalingActivityId5() {
		return this.scalingActivityId5;
	}

	public void setScalingActivityId5(String scalingActivityId5) {
		this.scalingActivityId5 = scalingActivityId5;
		if(scalingActivityId5 != null){
			putQueryParameter("ScalingActivityId.5", scalingActivityId5);
		}
	}

	public String getScalingActivityId6() {
		return this.scalingActivityId6;
	}

	public void setScalingActivityId6(String scalingActivityId6) {
		this.scalingActivityId6 = scalingActivityId6;
		if(scalingActivityId6 != null){
			putQueryParameter("ScalingActivityId.6", scalingActivityId6);
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

	public String getScalingActivityId7() {
		return this.scalingActivityId7;
	}

	public void setScalingActivityId7(String scalingActivityId7) {
		this.scalingActivityId7 = scalingActivityId7;
		if(scalingActivityId7 != null){
			putQueryParameter("ScalingActivityId.7", scalingActivityId7);
		}
	}

	public String getScalingActivityId8() {
		return this.scalingActivityId8;
	}

	public void setScalingActivityId8(String scalingActivityId8) {
		this.scalingActivityId8 = scalingActivityId8;
		if(scalingActivityId8 != null){
			putQueryParameter("ScalingActivityId.8", scalingActivityId8);
		}
	}

	public String getScalingActivityId1() {
		return this.scalingActivityId1;
	}

	public void setScalingActivityId1(String scalingActivityId1) {
		this.scalingActivityId1 = scalingActivityId1;
		if(scalingActivityId1 != null){
			putQueryParameter("ScalingActivityId.1", scalingActivityId1);
		}
	}

	public String getScalingActivityId2() {
		return this.scalingActivityId2;
	}

	public void setScalingActivityId2(String scalingActivityId2) {
		this.scalingActivityId2 = scalingActivityId2;
		if(scalingActivityId2 != null){
			putQueryParameter("ScalingActivityId.2", scalingActivityId2);
		}
	}

	public String getScalingActivityId3() {
		return this.scalingActivityId3;
	}

	public void setScalingActivityId3(String scalingActivityId3) {
		this.scalingActivityId3 = scalingActivityId3;
		if(scalingActivityId3 != null){
			putQueryParameter("ScalingActivityId.3", scalingActivityId3);
		}
	}

	public String getScalingActivityId4() {
		return this.scalingActivityId4;
	}

	public void setScalingActivityId4(String scalingActivityId4) {
		this.scalingActivityId4 = scalingActivityId4;
		if(scalingActivityId4 != null){
			putQueryParameter("ScalingActivityId.4", scalingActivityId4);
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

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
		if(statusCode != null){
			putQueryParameter("StatusCode", statusCode);
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

	public String getScalingActivityId11() {
		return this.scalingActivityId11;
	}

	public void setScalingActivityId11(String scalingActivityId11) {
		this.scalingActivityId11 = scalingActivityId11;
		if(scalingActivityId11 != null){
			putQueryParameter("ScalingActivityId.11", scalingActivityId11);
		}
	}

	public String getScalingActivityId10() {
		return this.scalingActivityId10;
	}

	public void setScalingActivityId10(String scalingActivityId10) {
		this.scalingActivityId10 = scalingActivityId10;
		if(scalingActivityId10 != null){
			putQueryParameter("ScalingActivityId.10", scalingActivityId10);
		}
	}

	public String getScalingActivityId13() {
		return this.scalingActivityId13;
	}

	public void setScalingActivityId13(String scalingActivityId13) {
		this.scalingActivityId13 = scalingActivityId13;
		if(scalingActivityId13 != null){
			putQueryParameter("ScalingActivityId.13", scalingActivityId13);
		}
	}

	public String getScalingActivityId12() {
		return this.scalingActivityId12;
	}

	public void setScalingActivityId12(String scalingActivityId12) {
		this.scalingActivityId12 = scalingActivityId12;
		if(scalingActivityId12 != null){
			putQueryParameter("ScalingActivityId.12", scalingActivityId12);
		}
	}

	public String getScalingActivityId15() {
		return this.scalingActivityId15;
	}

	public void setScalingActivityId15(String scalingActivityId15) {
		this.scalingActivityId15 = scalingActivityId15;
		if(scalingActivityId15 != null){
			putQueryParameter("ScalingActivityId.15", scalingActivityId15);
		}
	}

	public String getScalingActivityId14() {
		return this.scalingActivityId14;
	}

	public void setScalingActivityId14(String scalingActivityId14) {
		this.scalingActivityId14 = scalingActivityId14;
		if(scalingActivityId14 != null){
			putQueryParameter("ScalingActivityId.14", scalingActivityId14);
		}
	}

	public String getScalingActivityId17() {
		return this.scalingActivityId17;
	}

	public void setScalingActivityId17(String scalingActivityId17) {
		this.scalingActivityId17 = scalingActivityId17;
		if(scalingActivityId17 != null){
			putQueryParameter("ScalingActivityId.17", scalingActivityId17);
		}
	}

	public String getScalingActivityId16() {
		return this.scalingActivityId16;
	}

	public void setScalingActivityId16(String scalingActivityId16) {
		this.scalingActivityId16 = scalingActivityId16;
		if(scalingActivityId16 != null){
			putQueryParameter("ScalingActivityId.16", scalingActivityId16);
		}
	}

	public String getScalingActivityId19() {
		return this.scalingActivityId19;
	}

	public void setScalingActivityId19(String scalingActivityId19) {
		this.scalingActivityId19 = scalingActivityId19;
		if(scalingActivityId19 != null){
			putQueryParameter("ScalingActivityId.19", scalingActivityId19);
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

	public String getScalingActivityId18() {
		return this.scalingActivityId18;
	}

	public void setScalingActivityId18(String scalingActivityId18) {
		this.scalingActivityId18 = scalingActivityId18;
		if(scalingActivityId18 != null){
			putQueryParameter("ScalingActivityId.18", scalingActivityId18);
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

	public String getScalingActivityId20() {
		return this.scalingActivityId20;
	}

	public void setScalingActivityId20(String scalingActivityId20) {
		this.scalingActivityId20 = scalingActivityId20;
		if(scalingActivityId20 != null){
			putQueryParameter("ScalingActivityId.20", scalingActivityId20);
		}
	}

	@Override
	public Class<DescribeScalingActivitiesResponse> getResponseClass() {
		return DescribeScalingActivitiesResponse.class;
	}

}
