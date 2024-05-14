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

package com.aliyuncs.waf_openapi.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRulesResponse extends AcsResponse {

	private String ruleGroupTemplateId;

	private String ruleGroupName;

	private String requestId;

	private Integer totalCount;

	private String ruleGroupTemplateName;

	private Long isSubscribe;

	private List<RulesItem> rules;

	public String getRuleGroupTemplateId() {
		return this.ruleGroupTemplateId;
	}

	public void setRuleGroupTemplateId(String ruleGroupTemplateId) {
		this.ruleGroupTemplateId = ruleGroupTemplateId;
	}

	public String getRuleGroupName() {
		return this.ruleGroupName;
	}

	public void setRuleGroupName(String ruleGroupName) {
		this.ruleGroupName = ruleGroupName;
	}

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

	public String getRuleGroupTemplateName() {
		return this.ruleGroupTemplateName;
	}

	public void setRuleGroupTemplateName(String ruleGroupTemplateName) {
		this.ruleGroupTemplateName = ruleGroupTemplateName;
	}

	public Long getIsSubscribe() {
		return this.isSubscribe;
	}

	public void setIsSubscribe(Long isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

	public List<RulesItem> getRules() {
		return this.rules;
	}

	public void setRules(List<RulesItem> rules) {
		this.rules = rules;
	}

	public static class RulesItem {

		private Integer riskLevel;

		private Long updateTime;

		private String description;

		private String cveUrl;

		private Integer applicationType;

		private String cveId;

		private Integer protectionType;

		private String ruleName;

		private Long ruleId;

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCveUrl() {
			return this.cveUrl;
		}

		public void setCveUrl(String cveUrl) {
			this.cveUrl = cveUrl;
		}

		public Integer getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(Integer applicationType) {
			this.applicationType = applicationType;
		}

		public String getCveId() {
			return this.cveId;
		}

		public void setCveId(String cveId) {
			this.cveId = cveId;
		}

		public Integer getProtectionType() {
			return this.protectionType;
		}

		public void setProtectionType(Integer protectionType) {
			this.protectionType = protectionType;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}
	}

	@Override
	public DescribeRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
