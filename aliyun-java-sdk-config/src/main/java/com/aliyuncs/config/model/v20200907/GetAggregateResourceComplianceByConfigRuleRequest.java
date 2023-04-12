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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAggregateResourceComplianceByConfigRuleRequest extends RpcAcsRequest<GetAggregateResourceComplianceByConfigRuleResponse> {
	   

	private String configRuleId;

	private Long resourceOwnerId;

	private String aggregatorId;

	private Long resourceAccountId;

	private String complianceType;
	public GetAggregateResourceComplianceByConfigRuleRequest() {
		super("Config", "2020-09-07", "GetAggregateResourceComplianceByConfigRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleId() {
		return this.configRuleId;
	}

	public void setConfigRuleId(String configRuleId) {
		this.configRuleId = configRuleId;
		if(configRuleId != null){
			putQueryParameter("ConfigRuleId", configRuleId);
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

	public String getAggregatorId() {
		return this.aggregatorId;
	}

	public void setAggregatorId(String aggregatorId) {
		this.aggregatorId = aggregatorId;
		if(aggregatorId != null){
			putQueryParameter("AggregatorId", aggregatorId);
		}
	}

	public Long getResourceAccountId() {
		return this.resourceAccountId;
	}

	public void setResourceAccountId(Long resourceAccountId) {
		this.resourceAccountId = resourceAccountId;
		if(resourceAccountId != null){
			putQueryParameter("ResourceAccountId", resourceAccountId.toString());
		}
	}

	public String getComplianceType() {
		return this.complianceType;
	}

	public void setComplianceType(String complianceType) {
		this.complianceType = complianceType;
		if(complianceType != null){
			putQueryParameter("ComplianceType", complianceType);
		}
	}

	@Override
	public Class<GetAggregateResourceComplianceByConfigRuleResponse> getResponseClass() {
		return GetAggregateResourceComplianceByConfigRuleResponse.class;
	}

}
