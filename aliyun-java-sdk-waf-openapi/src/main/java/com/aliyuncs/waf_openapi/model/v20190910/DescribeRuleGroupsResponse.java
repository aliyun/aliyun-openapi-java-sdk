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
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeRuleGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRuleGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer taskStatus;

	private Integer total;

	private String wafTaskId;

	private List<RuleGroupsItem> ruleGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getWafTaskId() {
		return this.wafTaskId;
	}

	public void setWafTaskId(String wafTaskId) {
		this.wafTaskId = wafTaskId;
	}

	public List<RuleGroupsItem> getRuleGroups() {
		return this.ruleGroups;
	}

	public void setRuleGroups(List<RuleGroupsItem> ruleGroups) {
		this.ruleGroups = ruleGroups;
	}

	public static class RuleGroupsItem {

		private Integer type;

		private Integer ruleCnt;

		private Long ruleGroupUpdateTime;

		private Long policyId;

		private String name;

		private Long templatePolicyId;

		private String ruleGroupTemplateName;

		private String desc;

		private Long wafVersion;

		private List<String> domainList;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getRuleCnt() {
			return this.ruleCnt;
		}

		public void setRuleCnt(Integer ruleCnt) {
			this.ruleCnt = ruleCnt;
		}

		public Long getRuleGroupUpdateTime() {
			return this.ruleGroupUpdateTime;
		}

		public void setRuleGroupUpdateTime(Long ruleGroupUpdateTime) {
			this.ruleGroupUpdateTime = ruleGroupUpdateTime;
		}

		public Long getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(Long policyId) {
			this.policyId = policyId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getTemplatePolicyId() {
			return this.templatePolicyId;
		}

		public void setTemplatePolicyId(Long templatePolicyId) {
			this.templatePolicyId = templatePolicyId;
		}

		public String getRuleGroupTemplateName() {
			return this.ruleGroupTemplateName;
		}

		public void setRuleGroupTemplateName(String ruleGroupTemplateName) {
			this.ruleGroupTemplateName = ruleGroupTemplateName;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Long getWafVersion() {
			return this.wafVersion;
		}

		public void setWafVersion(Long wafVersion) {
			this.wafVersion = wafVersion;
		}

		public List<String> getDomainList() {
			return this.domainList;
		}

		public void setDomainList(List<String> domainList) {
			this.domainList = domainList;
		}
	}

	@Override
	public DescribeRuleGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRuleGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
