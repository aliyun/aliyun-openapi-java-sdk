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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeCheckFixDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCheckFixDetailsResponse extends AcsResponse {

	private Integer count;

	private String requestId;

	private List<Data> checkFixDetails;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getCheckFixDetails() {
		return this.checkFixDetails;
	}

	public void setCheckFixDetails(List<Data> checkFixDetails) {
		this.checkFixDetails = checkFixDetails;
	}

	public static class Data {

		private Long checkId;

		private String checkItem;

		private String checkDesc;

		private List<Rule> rules;

		public Long getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Long checkId) {
			this.checkId = checkId;
		}

		public String getCheckItem() {
			return this.checkItem;
		}

		public void setCheckItem(String checkItem) {
			this.checkItem = checkItem;
		}

		public String getCheckDesc() {
			return this.checkDesc;
		}

		public void setCheckDesc(String checkDesc) {
			this.checkDesc = checkDesc;
		}

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public static class Rule {

			private String ruleId;

			private String ruleDesc;

			private String varName;

			private Integer defaultValue;

			private Integer optional;

			private Long checkId;

			private Integer value;

			private List<ParamListItem> paramList;

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleDesc() {
				return this.ruleDesc;
			}

			public void setRuleDesc(String ruleDesc) {
				this.ruleDesc = ruleDesc;
			}

			public String getVarName() {
				return this.varName;
			}

			public void setVarName(String varName) {
				this.varName = varName;
			}

			public Integer getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(Integer defaultValue) {
				this.defaultValue = defaultValue;
			}

			public Integer getOptional() {
				return this.optional;
			}

			public void setOptional(Integer optional) {
				this.optional = optional;
			}

			public Long getCheckId() {
				return this.checkId;
			}

			public void setCheckId(Long checkId) {
				this.checkId = checkId;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public List<ParamListItem> getParamList() {
				return this.paramList;
			}

			public void setParamList(List<ParamListItem> paramList) {
				this.paramList = paramList;
			}

			public static class ParamListItem {

				private String paramName;

				private String paramDesc;

				private String paramDefaultValue;

				private Integer paramType;

				private Integer minValue;

				private Integer maxValue;

				private String enumValue;

				private String value;

				private String ruleId;

				public String getParamName() {
					return this.paramName;
				}

				public void setParamName(String paramName) {
					this.paramName = paramName;
				}

				public String getParamDesc() {
					return this.paramDesc;
				}

				public void setParamDesc(String paramDesc) {
					this.paramDesc = paramDesc;
				}

				public String getParamDefaultValue() {
					return this.paramDefaultValue;
				}

				public void setParamDefaultValue(String paramDefaultValue) {
					this.paramDefaultValue = paramDefaultValue;
				}

				public Integer getParamType() {
					return this.paramType;
				}

				public void setParamType(Integer paramType) {
					this.paramType = paramType;
				}

				public Integer getMinValue() {
					return this.minValue;
				}

				public void setMinValue(Integer minValue) {
					this.minValue = minValue;
				}

				public Integer getMaxValue() {
					return this.maxValue;
				}

				public void setMaxValue(Integer maxValue) {
					this.maxValue = maxValue;
				}

				public String getEnumValue() {
					return this.enumValue;
				}

				public void setEnumValue(String enumValue) {
					this.enumValue = enumValue;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(String ruleId) {
					this.ruleId = ruleId;
				}
			}
		}
	}

	@Override
	public DescribeCheckFixDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCheckFixDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
