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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteFirewallRulesRequest extends RpcAcsRequest<DeleteFirewallRulesResponse> {
	   

	private String clientToken;

	private List<String> ruleIds;

	private String instanceId;
	public DeleteFirewallRulesRequest() {
		super("SWAS-OPEN", "2020-06-01", "DeleteFirewallRules", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<String> getRuleIds() {
		return this.ruleIds;
	}

	public void setRuleIds(List<String> ruleIds) {
		this.ruleIds = ruleIds;	
		if (ruleIds != null) {
			String ruleIdsArrVal = "";
			for(int depth1 = 0; depth1 < ruleIds.size(); depth1++) {
				ruleIdsArrVal += ruleIds.get(depth1) + ",";
			}
			if (ruleIdsArrVal.length() > 0) {
				ruleIdsArrVal = ruleIdsArrVal.substring(0, ruleIdsArrVal.length() - 1);
			}
			putQueryParameter("RuleIds" , ruleIdsArrVal);
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<DeleteFirewallRulesResponse> getResponseClass() {
		return DeleteFirewallRulesResponse.class;
	}

}
