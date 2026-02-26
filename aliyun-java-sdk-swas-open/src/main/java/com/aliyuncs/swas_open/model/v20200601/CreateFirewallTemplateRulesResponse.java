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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.CreateFirewallTemplateRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFirewallTemplateRulesResponse extends AcsResponse {

	private String requestId;

	private List<FirewallTemplateRule> firewallTemplateRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FirewallTemplateRule> getFirewallTemplateRules() {
		return this.firewallTemplateRules;
	}

	public void setFirewallTemplateRules(List<FirewallTemplateRule> firewallTemplateRules) {
		this.firewallTemplateRules = firewallTemplateRules;
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
	public CreateFirewallTemplateRulesResponse getInstance(UnmarshallerContext context) {
		return	CreateFirewallTemplateRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
