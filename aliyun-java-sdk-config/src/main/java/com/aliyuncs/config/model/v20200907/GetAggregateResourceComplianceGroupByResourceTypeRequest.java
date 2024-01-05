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
public class GetAggregateResourceComplianceGroupByResourceTypeRequest extends RpcAcsRequest<GetAggregateResourceComplianceGroupByResourceTypeResponse> {
	   

	private String configRuleIds;

	private String aggregatorId;
	public GetAggregateResourceComplianceGroupByResourceTypeRequest() {
		super("Config", "2020-09-07", "GetAggregateResourceComplianceGroupByResourceType", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleIds() {
		return this.configRuleIds;
	}

	public void setConfigRuleIds(String configRuleIds) {
		this.configRuleIds = configRuleIds;
		if(configRuleIds != null){
			putQueryParameter("ConfigRuleIds", configRuleIds);
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

	@Override
	public Class<GetAggregateResourceComplianceGroupByResourceTypeResponse> getResponseClass() {
		return GetAggregateResourceComplianceGroupByResourceTypeResponse.class;
	}

}
