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
import com.aliyuncs.swas_open.transform.v20200601.DescribeFirewallTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFirewallTemplatesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<FirewallTemplate> firewallTemplates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<FirewallTemplate> getFirewallTemplates() {
		return this.firewallTemplates;
	}

	public void setFirewallTemplates(List<FirewallTemplate> firewallTemplates) {
		this.firewallTemplates = firewallTemplates;
	}

	public static class FirewallTemplate {

		private String firewallTemplateId;

		private String creationTime;

		private String name;

		private String description;

		private String createTime;

		private List<FirewallTemplateRule> firewallTemplateRules;

		public String getFirewallTemplateId() {
			return this.firewallTemplateId;
		}

		public void setFirewallTemplateId(String firewallTemplateId) {
			this.firewallTemplateId = firewallTemplateId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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
	}

	@Override
	public DescribeFirewallTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeFirewallTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
