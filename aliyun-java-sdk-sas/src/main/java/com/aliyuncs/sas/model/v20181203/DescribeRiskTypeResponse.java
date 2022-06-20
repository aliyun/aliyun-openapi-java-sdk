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
import com.aliyuncs.sas.transform.v20181203.DescribeRiskTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskTypeResponse extends AcsResponse {

	private String requestId;

	private List<RiskType> riskTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RiskType> getRiskTypes() {
		return this.riskTypes;
	}

	public void setRiskTypes(List<RiskType> riskTypes) {
		this.riskTypes = riskTypes;
	}

	public static class RiskType {

		private String typeName;

		private String alias;

		private List<SubType> subTypes;

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public List<SubType> getSubTypes() {
			return this.subTypes;
		}

		public void setSubTypes(List<SubType> subTypes) {
			this.subTypes = subTypes;
		}

		public static class SubType {

			private String typeName;

			private String alias;

			private List<CheckDetail> checkDetails;

			public String getTypeName() {
				return this.typeName;
			}

			public void setTypeName(String typeName) {
				this.typeName = typeName;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public List<CheckDetail> getCheckDetails() {
				return this.checkDetails;
			}

			public void setCheckDetails(List<CheckDetail> checkDetails) {
				this.checkDetails = checkDetails;
			}

			public static class CheckDetail {

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

					private Integer optional;

					private String ruleDesc;

					private Integer defaultValue;

					private String ruleId;

					private List<Param> paramList;

					public Integer getOptional() {
						return this.optional;
					}

					public void setOptional(Integer optional) {
						this.optional = optional;
					}

					public String getRuleDesc() {
						return this.ruleDesc;
					}

					public void setRuleDesc(String ruleDesc) {
						this.ruleDesc = ruleDesc;
					}

					public Integer getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(Integer defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getRuleId() {
						return this.ruleId;
					}

					public void setRuleId(String ruleId) {
						this.ruleId = ruleId;
					}

					public List<Param> getParamList() {
						return this.paramList;
					}

					public void setParamList(List<Param> paramList) {
						this.paramList = paramList;
					}

					public static class Param {

						private String paramDefaultValue;

						private String paramName;

						private Integer maxValue;

						private Integer paramType;

						private String paramDesc;

						private Integer minValue;

						private String enumValue;

						public String getParamDefaultValue() {
							return this.paramDefaultValue;
						}

						public void setParamDefaultValue(String paramDefaultValue) {
							this.paramDefaultValue = paramDefaultValue;
						}

						public String getParamName() {
							return this.paramName;
						}

						public void setParamName(String paramName) {
							this.paramName = paramName;
						}

						public Integer getMaxValue() {
							return this.maxValue;
						}

						public void setMaxValue(Integer maxValue) {
							this.maxValue = maxValue;
						}

						public Integer getParamType() {
							return this.paramType;
						}

						public void setParamType(Integer paramType) {
							this.paramType = paramType;
						}

						public String getParamDesc() {
							return this.paramDesc;
						}

						public void setParamDesc(String paramDesc) {
							this.paramDesc = paramDesc;
						}

						public Integer getMinValue() {
							return this.minValue;
						}

						public void setMinValue(Integer minValue) {
							this.minValue = minValue;
						}

						public String getEnumValue() {
							return this.enumValue;
						}

						public void setEnumValue(String enumValue) {
							this.enumValue = enumValue;
						}
					}
				}
			}
		}
	}

	@Override
	public DescribeRiskTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
