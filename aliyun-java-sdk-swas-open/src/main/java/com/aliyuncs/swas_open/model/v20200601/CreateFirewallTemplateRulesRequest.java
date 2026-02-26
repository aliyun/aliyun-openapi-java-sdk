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
public class CreateFirewallTemplateRulesRequest extends RpcAcsRequest<CreateFirewallTemplateRulesResponse> {
	   

	private String firewallTemplateId;

	private List<FirewallRule> firewallRules;
	public CreateFirewallTemplateRulesRequest() {
		super("SWAS-OPEN", "2020-06-01", "CreateFirewallTemplateRules", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getFirewallTemplateId() {
		return this.firewallTemplateId;
	}

	public void setFirewallTemplateId(String firewallTemplateId) {
		this.firewallTemplateId = firewallTemplateId;
		if(firewallTemplateId != null){
			putQueryParameter("FirewallTemplateId", firewallTemplateId);
		}
	}

	public List<FirewallRule> getFirewallRules() {
		return this.firewallRules;
	}

	public void setFirewallRules(List<FirewallRule> firewallRules) {
		this.firewallRules = firewallRules;	
		if (firewallRules != null) {
			for (int depth1 = 0; depth1 < firewallRules.size(); depth1++) {
				putQueryParameter("FirewallRule." + (depth1 + 1) + ".RuleProtocol" , firewallRules.get(depth1).getRuleProtocol());
				putQueryParameter("FirewallRule." + (depth1 + 1) + ".Port" , firewallRules.get(depth1).getPort());
				putQueryParameter("FirewallRule." + (depth1 + 1) + ".SourceCidrIp" , firewallRules.get(depth1).getSourceCidrIp());
				putQueryParameter("FirewallRule." + (depth1 + 1) + ".Remark" , firewallRules.get(depth1).getRemark());
			}
		}	
	}

	public static class FirewallRule {

		private String ruleProtocol;

		private String port;

		private String sourceCidrIp;

		private String remark;

		public String getRuleProtocol() {
			return this.ruleProtocol;
		}

		public void setRuleProtocol(String ruleProtocol) {
			this.ruleProtocol = ruleProtocol;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}

	@Override
	public Class<CreateFirewallTemplateRulesResponse> getResponseClass() {
		return CreateFirewallTemplateRulesResponse.class;
	}

}
