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
public class DescribeScalingRulesRequest extends RpcAcsRequest<DescribeScalingRulesResponse> {
	   

	private Long resourceOwnerId;

	private String scalingGroupId;

	private List<String> scalingRuleIds;

	private Integer pageNumber;

	private List<String> scalingRuleNames;

	private Integer pageSize;

	private String scalingRuleType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> scalingRuleAris;

	private Boolean showAlarmRules;
	public DescribeScalingRulesRequest() {
		super("Ess", "2014-08-28", "DescribeScalingRules", "ess");
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public List<String> getScalingRuleIds() {
		return this.scalingRuleIds;
	}

	public void setScalingRuleIds(List<String> scalingRuleIds) {
		this.scalingRuleIds = scalingRuleIds;	
		if (scalingRuleIds != null) {
			for (int i = 0; i < scalingRuleIds.size(); i++) {
				putQueryParameter("ScalingRuleId." + (i + 1) , scalingRuleIds.get(i));
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

	public List<String> getScalingRuleNames() {
		return this.scalingRuleNames;
	}

	public void setScalingRuleNames(List<String> scalingRuleNames) {
		this.scalingRuleNames = scalingRuleNames;	
		if (scalingRuleNames != null) {
			for (int i = 0; i < scalingRuleNames.size(); i++) {
				putQueryParameter("ScalingRuleName." + (i + 1) , scalingRuleNames.get(i));
			}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getScalingRuleAris() {
		return this.scalingRuleAris;
	}

	public void setScalingRuleAris(List<String> scalingRuleAris) {
		this.scalingRuleAris = scalingRuleAris;	
		if (scalingRuleAris != null) {
			for (int i = 0; i < scalingRuleAris.size(); i++) {
				putQueryParameter("ScalingRuleAri." + (i + 1) , scalingRuleAris.get(i));
			}
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

	@Override
	public Class<DescribeScalingRulesResponse> getResponseClass() {
		return DescribeScalingRulesResponse.class;
	}

}
