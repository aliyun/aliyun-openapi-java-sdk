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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMaskingRulesRequest extends RpcAcsRequest<DescribeMaskingRulesResponse> {
	   

	private String dBClusterId;

	private String ruleNameList;
	public DescribeMaskingRulesRequest() {
		super("polardb", "2017-08-01", "DescribeMaskingRules", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getRuleNameList() {
		return this.ruleNameList;
	}

	public void setRuleNameList(String ruleNameList) {
		this.ruleNameList = ruleNameList;
		if(ruleNameList != null){
			putQueryParameter("RuleNameList", ruleNameList);
		}
	}

	@Override
	public Class<DescribeMaskingRulesResponse> getResponseClass() {
		return DescribeMaskingRulesResponse.class;
	}

}
