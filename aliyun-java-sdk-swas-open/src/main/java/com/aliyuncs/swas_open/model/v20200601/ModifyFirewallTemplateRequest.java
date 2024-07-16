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
public class ModifyFirewallTemplateRequest extends RpcAcsRequest<ModifyFirewallTemplateResponse> {
	   

	private String firewallTemplateId;

	private String clientToken;

	private String description;

	private String instanceId;

	private List<FirewallTemplateRule> firewallTemplateRules;

	private String name;
	public ModifyFirewallTemplateRequest() {
		super("SWAS-OPEN", "2020-06-01", "ModifyFirewallTemplate", "SWAS-OPEN");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public List<FirewallTemplateRule> getFirewallTemplateRules() {
		return this.firewallTemplateRules;
	}

	public void setFirewallTemplateRules(List<FirewallTemplateRule> firewallTemplateRules) {
		this.firewallTemplateRules = firewallTemplateRules;	
		if (firewallTemplateRules != null) {
			for (int depth1 = 0; depth1 < firewallTemplateRules.size(); depth1++) {
				putQueryParameter("FirewallTemplateRule." + (depth1 + 1) + ".FirewallTemplateRuleId" , firewallTemplateRules.get(depth1).getFirewallTemplateRuleId());
				putQueryParameter("FirewallTemplateRule." + (depth1 + 1) + ".RuleProtocol" , firewallTemplateRules.get(depth1).getRuleProtocol());
				putQueryParameter("FirewallTemplateRule." + (depth1 + 1) + ".Port" , firewallTemplateRules.get(depth1).getPort());
				putQueryParameter("FirewallTemplateRule." + (depth1 + 1) + ".SourceCidrIp" , firewallTemplateRules.get(depth1).getSourceCidrIp());
				putQueryParameter("FirewallTemplateRule." + (depth1 + 1) + ".Remark" , firewallTemplateRules.get(depth1).getRemark());
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class FirewallTemplateRule {

		private String firewallTemplateRuleId;

		private String ruleProtocol;

		private String port;

		private String sourceCidrIp;

		private String remark;

		public String getFirewallTemplateRuleId() {
			return this.firewallTemplateRuleId;
		}

		public void setFirewallTemplateRuleId(String firewallTemplateRuleId) {
			this.firewallTemplateRuleId = firewallTemplateRuleId;
		}

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
	public Class<ModifyFirewallTemplateResponse> getResponseClass() {
		return ModifyFirewallTemplateResponse.class;
	}

}
