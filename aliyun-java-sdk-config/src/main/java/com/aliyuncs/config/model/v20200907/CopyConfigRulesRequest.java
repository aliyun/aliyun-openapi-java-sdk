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
public class CopyConfigRulesRequest extends RpcAcsRequest<CopyConfigRulesResponse> {
	   

	private String desAggregatorIds;

	private String srcConfigRuleIds;

	private String srcAggregatorId;
	public CopyConfigRulesRequest() {
		super("Config", "2020-09-07", "CopyConfigRules");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDesAggregatorIds() {
		return this.desAggregatorIds;
	}

	public void setDesAggregatorIds(String desAggregatorIds) {
		this.desAggregatorIds = desAggregatorIds;
		if(desAggregatorIds != null){
			putQueryParameter("DesAggregatorIds", desAggregatorIds);
		}
	}

	public String getSrcConfigRuleIds() {
		return this.srcConfigRuleIds;
	}

	public void setSrcConfigRuleIds(String srcConfigRuleIds) {
		this.srcConfigRuleIds = srcConfigRuleIds;
		if(srcConfigRuleIds != null){
			putQueryParameter("SrcConfigRuleIds", srcConfigRuleIds);
		}
	}

	public String getSrcAggregatorId() {
		return this.srcAggregatorId;
	}

	public void setSrcAggregatorId(String srcAggregatorId) {
		this.srcAggregatorId = srcAggregatorId;
		if(srcAggregatorId != null){
			putQueryParameter("SrcAggregatorId", srcAggregatorId);
		}
	}

	@Override
	public Class<CopyConfigRulesResponse> getResponseClass() {
		return CopyConfigRulesResponse.class;
	}

}
