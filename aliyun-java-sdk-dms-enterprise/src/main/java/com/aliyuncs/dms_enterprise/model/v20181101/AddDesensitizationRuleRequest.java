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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddDesensitizationRuleRequest extends RpcAcsRequest<AddDesensitizationRuleResponse> {
	   

	private String ruleDescription;

	private List<Map<String,String>> functionParams;

	private String ruleType;

	private String ruleName;

	private String functionType;

	private Long tid;
	public AddDesensitizationRuleRequest() {
		super("dms-enterprise", "2018-11-01", "AddDesensitizationRule", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRuleDescription() {
		return this.ruleDescription;
	}

	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
		if(ruleDescription != null){
			putQueryParameter("RuleDescription", ruleDescription);
		}
	}

	public List<Map<String,String>> getFunctionParams() {
		return this.functionParams;
	}

	public void setFunctionParams(List<Map<String,String>> functionParams) {
		this.functionParams = functionParams;	
		if (functionParams != null) {
			for (int depth1 = 0; depth1 < functionParams.size(); depth1++) {
				if (functionParams.get(depth1) != null) {
					for (String key2: functionParams.get(depth1).keySet() ) {
						putBodyParameter("FunctionParams." + (depth1 + 1) + ".#" + key2.length() + "#" + key2 , functionParams.get(depth1).get(key2));
					}
				}
			}
		}	
	}

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
		if(functionType != null){
			putQueryParameter("FunctionType", functionType);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	@Override
	public Class<AddDesensitizationRuleResponse> getResponseClass() {
		return AddDesensitizationRuleResponse.class;
	}

}
