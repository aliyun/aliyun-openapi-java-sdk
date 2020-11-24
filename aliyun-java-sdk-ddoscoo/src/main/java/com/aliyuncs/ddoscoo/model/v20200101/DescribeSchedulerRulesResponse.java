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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeSchedulerRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSchedulerRulesResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private List<SchedulerRule> schedulerRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<SchedulerRule> getSchedulerRules() {
		return this.schedulerRules;
	}

	public void setSchedulerRules(List<SchedulerRule> schedulerRules) {
		this.schedulerRules = schedulerRules;
	}

	public static class SchedulerRule {

		private String ruleName;

		private String cname;

		private String ruleType;

		private List<Rule> rules;

		private Param param;

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public Param getParam() {
			return this.param;
		}

		public void setParam(Param param) {
			this.param = param;
		}

		public static class Rule {

			private String type;

			private String value;

			private Integer valueType;

			private Integer priority;

			private Integer status;

			private String regionId;

			private Integer restoreDelay;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Integer getValueType() {
				return this.valueType;
			}

			public void setValueType(Integer valueType) {
				this.valueType = valueType;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Integer getRestoreDelay() {
				return this.restoreDelay;
			}

			public void setRestoreDelay(Integer restoreDelay) {
				this.restoreDelay = restoreDelay;
			}
		}

		public static class Param {

			private String paramType;

			private ParamData paramData;

			public String getParamType() {
				return this.paramType;
			}

			public void setParamType(String paramType) {
				this.paramType = paramType;
			}

			public ParamData getParamData() {
				return this.paramData;
			}

			public void setParamData(ParamData paramData) {
				this.paramData = paramData;
			}

			public static class ParamData {

				private String cloudInstanceId;

				public String getCloudInstanceId() {
					return this.cloudInstanceId;
				}

				public void setCloudInstanceId(String cloudInstanceId) {
					this.cloudInstanceId = cloudInstanceId;
				}
			}
		}
	}

	@Override
	public DescribeSchedulerRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSchedulerRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
