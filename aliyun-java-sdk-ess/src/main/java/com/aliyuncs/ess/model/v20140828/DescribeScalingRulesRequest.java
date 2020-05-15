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
public class DescribeScalingRulesRequest extends RpcAcsRequest<DescribeScalingRulesResponse> {
	   

	private Long resourceOwnerId;

	private String scalingRuleId10;

	private Long ownerId;

	private String scalingRuleAri1;

	private String scalingRuleAri2;

	private String scalingRuleAri3;

	private String scalingRuleAri4;

	private String scalingRuleAri5;

	private String scalingRuleAri6;

	private String scalingRuleAri7;

	private String scalingRuleAri8;

	private Boolean showAlarmRules;

	private String scalingRuleName1;

	private String scalingRuleName2;

	private String scalingRuleName3;

	private String scalingRuleName4;

	private String scalingRuleName5;

	private String scalingGroupId;

	private String scalingRuleName6;

	private String scalingRuleName7;

	private String scalingRuleName8;

	private String scalingRuleAri9;

	private String scalingRuleName9;

	private Integer pageNumber;

	private Integer pageSize;

	private String scalingRuleType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String scalingRuleName10;

	private String scalingRuleId8;

	private String scalingRuleId9;

	private String scalingRuleAri10;

	private String scalingRuleId4;

	private String scalingRuleId5;

	private String scalingRuleId6;

	private String scalingRuleId7;

	private String scalingRuleId1;

	private String scalingRuleId2;

	private String scalingRuleId3;
	public DescribeScalingRulesRequest() {
		super("Ess", "2014-08-28", "DescribeScalingRules", "ess");
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

	public String getScalingRuleId10() {
		return this.scalingRuleId10;
	}

	public void setScalingRuleId10(String scalingRuleId10) {
		this.scalingRuleId10 = scalingRuleId10;
		if(scalingRuleId10 != null){
			putQueryParameter("ScalingRuleId.10", scalingRuleId10);
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

	public String getScalingRuleAri1() {
		return this.scalingRuleAri1;
	}

	public void setScalingRuleAri1(String scalingRuleAri1) {
		this.scalingRuleAri1 = scalingRuleAri1;
		if(scalingRuleAri1 != null){
			putQueryParameter("ScalingRuleAri.1", scalingRuleAri1);
		}
	}

	public String getScalingRuleAri2() {
		return this.scalingRuleAri2;
	}

	public void setScalingRuleAri2(String scalingRuleAri2) {
		this.scalingRuleAri2 = scalingRuleAri2;
		if(scalingRuleAri2 != null){
			putQueryParameter("ScalingRuleAri.2", scalingRuleAri2);
		}
	}

	public String getScalingRuleAri3() {
		return this.scalingRuleAri3;
	}

	public void setScalingRuleAri3(String scalingRuleAri3) {
		this.scalingRuleAri3 = scalingRuleAri3;
		if(scalingRuleAri3 != null){
			putQueryParameter("ScalingRuleAri.3", scalingRuleAri3);
		}
	}

	public String getScalingRuleAri4() {
		return this.scalingRuleAri4;
	}

	public void setScalingRuleAri4(String scalingRuleAri4) {
		this.scalingRuleAri4 = scalingRuleAri4;
		if(scalingRuleAri4 != null){
			putQueryParameter("ScalingRuleAri.4", scalingRuleAri4);
		}
	}

	public String getScalingRuleAri5() {
		return this.scalingRuleAri5;
	}

	public void setScalingRuleAri5(String scalingRuleAri5) {
		this.scalingRuleAri5 = scalingRuleAri5;
		if(scalingRuleAri5 != null){
			putQueryParameter("ScalingRuleAri.5", scalingRuleAri5);
		}
	}

	public String getScalingRuleAri6() {
		return this.scalingRuleAri6;
	}

	public void setScalingRuleAri6(String scalingRuleAri6) {
		this.scalingRuleAri6 = scalingRuleAri6;
		if(scalingRuleAri6 != null){
			putQueryParameter("ScalingRuleAri.6", scalingRuleAri6);
		}
	}

	public String getScalingRuleAri7() {
		return this.scalingRuleAri7;
	}

	public void setScalingRuleAri7(String scalingRuleAri7) {
		this.scalingRuleAri7 = scalingRuleAri7;
		if(scalingRuleAri7 != null){
			putQueryParameter("ScalingRuleAri.7", scalingRuleAri7);
		}
	}

	public String getScalingRuleAri8() {
		return this.scalingRuleAri8;
	}

	public void setScalingRuleAri8(String scalingRuleAri8) {
		this.scalingRuleAri8 = scalingRuleAri8;
		if(scalingRuleAri8 != null){
			putQueryParameter("ScalingRuleAri.8", scalingRuleAri8);
		}
	}

	public Boolean getShowAlarmRules() {
		return this.showAlarmRules;
	}

	public void setShowAlarmRules(Boolean showAlarmRules) {
		this.showAlarmRules = showAlarmRules;
		if(showAlarmRules != null){
			putQueryParameter("ShowAlarmRules", showAlarmRules.toString());
		}
	}

	public String getScalingRuleName1() {
		return this.scalingRuleName1;
	}

	public void setScalingRuleName1(String scalingRuleName1) {
		this.scalingRuleName1 = scalingRuleName1;
		if(scalingRuleName1 != null){
			putQueryParameter("ScalingRuleName.1", scalingRuleName1);
		}
	}

	public String getScalingRuleName2() {
		return this.scalingRuleName2;
	}

	public void setScalingRuleName2(String scalingRuleName2) {
		this.scalingRuleName2 = scalingRuleName2;
		if(scalingRuleName2 != null){
			putQueryParameter("ScalingRuleName.2", scalingRuleName2);
		}
	}

	public String getScalingRuleName3() {
		return this.scalingRuleName3;
	}

	public void setScalingRuleName3(String scalingRuleName3) {
		this.scalingRuleName3 = scalingRuleName3;
		if(scalingRuleName3 != null){
			putQueryParameter("ScalingRuleName.3", scalingRuleName3);
		}
	}

	public String getScalingRuleName4() {
		return this.scalingRuleName4;
	}

	public void setScalingRuleName4(String scalingRuleName4) {
		this.scalingRuleName4 = scalingRuleName4;
		if(scalingRuleName4 != null){
			putQueryParameter("ScalingRuleName.4", scalingRuleName4);
		}
	}

	public String getScalingRuleName5() {
		return this.scalingRuleName5;
	}

	public void setScalingRuleName5(String scalingRuleName5) {
		this.scalingRuleName5 = scalingRuleName5;
		if(scalingRuleName5 != null){
			putQueryParameter("ScalingRuleName.5", scalingRuleName5);
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

	public String getScalingRuleName6() {
		return this.scalingRuleName6;
	}

	public void setScalingRuleName6(String scalingRuleName6) {
		this.scalingRuleName6 = scalingRuleName6;
		if(scalingRuleName6 != null){
			putQueryParameter("ScalingRuleName.6", scalingRuleName6);
		}
	}

	public String getScalingRuleName7() {
		return this.scalingRuleName7;
	}

	public void setScalingRuleName7(String scalingRuleName7) {
		this.scalingRuleName7 = scalingRuleName7;
		if(scalingRuleName7 != null){
			putQueryParameter("ScalingRuleName.7", scalingRuleName7);
		}
	}

	public String getScalingRuleName8() {
		return this.scalingRuleName8;
	}

	public void setScalingRuleName8(String scalingRuleName8) {
		this.scalingRuleName8 = scalingRuleName8;
		if(scalingRuleName8 != null){
			putQueryParameter("ScalingRuleName.8", scalingRuleName8);
		}
	}

	public String getScalingRuleAri9() {
		return this.scalingRuleAri9;
	}

	public void setScalingRuleAri9(String scalingRuleAri9) {
		this.scalingRuleAri9 = scalingRuleAri9;
		if(scalingRuleAri9 != null){
			putQueryParameter("ScalingRuleAri.9", scalingRuleAri9);
		}
	}

	public String getScalingRuleName9() {
		return this.scalingRuleName9;
	}

	public void setScalingRuleName9(String scalingRuleName9) {
		this.scalingRuleName9 = scalingRuleName9;
		if(scalingRuleName9 != null){
			putQueryParameter("ScalingRuleName.9", scalingRuleName9);
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

	public String getScalingRuleType() {
		return this.scalingRuleType;
	}

	public void setScalingRuleType(String scalingRuleType) {
		this.scalingRuleType = scalingRuleType;
		if(scalingRuleType != null){
			putQueryParameter("ScalingRuleType", scalingRuleType);
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

	public String getScalingRuleName10() {
		return this.scalingRuleName10;
	}

	public void setScalingRuleName10(String scalingRuleName10) {
		this.scalingRuleName10 = scalingRuleName10;
		if(scalingRuleName10 != null){
			putQueryParameter("ScalingRuleName.10", scalingRuleName10);
		}
	}

	public String getScalingRuleId8() {
		return this.scalingRuleId8;
	}

	public void setScalingRuleId8(String scalingRuleId8) {
		this.scalingRuleId8 = scalingRuleId8;
		if(scalingRuleId8 != null){
			putQueryParameter("ScalingRuleId.8", scalingRuleId8);
		}
	}

	public String getScalingRuleId9() {
		return this.scalingRuleId9;
	}

	public void setScalingRuleId9(String scalingRuleId9) {
		this.scalingRuleId9 = scalingRuleId9;
		if(scalingRuleId9 != null){
			putQueryParameter("ScalingRuleId.9", scalingRuleId9);
		}
	}

	public String getScalingRuleAri10() {
		return this.scalingRuleAri10;
	}

	public void setScalingRuleAri10(String scalingRuleAri10) {
		this.scalingRuleAri10 = scalingRuleAri10;
		if(scalingRuleAri10 != null){
			putQueryParameter("ScalingRuleAri.10", scalingRuleAri10);
		}
	}

	public String getScalingRuleId4() {
		return this.scalingRuleId4;
	}

	public void setScalingRuleId4(String scalingRuleId4) {
		this.scalingRuleId4 = scalingRuleId4;
		if(scalingRuleId4 != null){
			putQueryParameter("ScalingRuleId.4", scalingRuleId4);
		}
	}

	public String getScalingRuleId5() {
		return this.scalingRuleId5;
	}

	public void setScalingRuleId5(String scalingRuleId5) {
		this.scalingRuleId5 = scalingRuleId5;
		if(scalingRuleId5 != null){
			putQueryParameter("ScalingRuleId.5", scalingRuleId5);
		}
	}

	public String getScalingRuleId6() {
		return this.scalingRuleId6;
	}

	public void setScalingRuleId6(String scalingRuleId6) {
		this.scalingRuleId6 = scalingRuleId6;
		if(scalingRuleId6 != null){
			putQueryParameter("ScalingRuleId.6", scalingRuleId6);
		}
	}

	public String getScalingRuleId7() {
		return this.scalingRuleId7;
	}

	public void setScalingRuleId7(String scalingRuleId7) {
		this.scalingRuleId7 = scalingRuleId7;
		if(scalingRuleId7 != null){
			putQueryParameter("ScalingRuleId.7", scalingRuleId7);
		}
	}

	public String getScalingRuleId1() {
		return this.scalingRuleId1;
	}

	public void setScalingRuleId1(String scalingRuleId1) {
		this.scalingRuleId1 = scalingRuleId1;
		if(scalingRuleId1 != null){
			putQueryParameter("ScalingRuleId.1", scalingRuleId1);
		}
	}

	public String getScalingRuleId2() {
		return this.scalingRuleId2;
	}

	public void setScalingRuleId2(String scalingRuleId2) {
		this.scalingRuleId2 = scalingRuleId2;
		if(scalingRuleId2 != null){
			putQueryParameter("ScalingRuleId.2", scalingRuleId2);
		}
	}

	public String getScalingRuleId3() {
		return this.scalingRuleId3;
	}

	public void setScalingRuleId3(String scalingRuleId3) {
		this.scalingRuleId3 = scalingRuleId3;
		if(scalingRuleId3 != null){
			putQueryParameter("ScalingRuleId.3", scalingRuleId3);
		}
	}

	@Override
	public Class<DescribeScalingRulesResponse> getResponseClass() {
		return DescribeScalingRulesResponse.class;
	}

}
