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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListQualityRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityRulesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<QualityRule> qualityRuleList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<QualityRule> getQualityRuleList() {
			return this.qualityRuleList;
		}

		public void setQualityRuleList(List<QualityRule> qualityRuleList) {
			this.qualityRuleList = qualityRuleList;
		}

		public static class QualityRule {

			private Long id;

			private String name;

			private String status;

			private String description;

			private String strength;

			private String templateType;

			private Long templateId;

			private String templateName;

			private String templateScope;

			private Long watchId;

			private Boolean enableErrorArchive;

			private Long testRunRuleTaskId;

			private String testRunRuleTaskStatus;

			private Boolean testRunRuleValidateResult;

			private String creator;

			private String creatorName;

			private String modifier;

			private String modifierName;

			private String createTime;

			private String modifyTime;

			private List<ValidateCondition> validateConditionList;

			private List<ScheduleBind> scheduleBindList;

			private List<FormProperty> formPropertyList;

			private List<AttributeWithValue> attributeWithValueList;

			private List<String> catalogList;

			private ValidateObject validateObject;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getStrength() {
				return this.strength;
			}

			public void setStrength(String strength) {
				this.strength = strength;
			}

			public String getTemplateType() {
				return this.templateType;
			}

			public void setTemplateType(String templateType) {
				this.templateType = templateType;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getTemplateScope() {
				return this.templateScope;
			}

			public void setTemplateScope(String templateScope) {
				this.templateScope = templateScope;
			}

			public Long getWatchId() {
				return this.watchId;
			}

			public void setWatchId(Long watchId) {
				this.watchId = watchId;
			}

			public Boolean getEnableErrorArchive() {
				return this.enableErrorArchive;
			}

			public void setEnableErrorArchive(Boolean enableErrorArchive) {
				this.enableErrorArchive = enableErrorArchive;
			}

			public Long getTestRunRuleTaskId() {
				return this.testRunRuleTaskId;
			}

			public void setTestRunRuleTaskId(Long testRunRuleTaskId) {
				this.testRunRuleTaskId = testRunRuleTaskId;
			}

			public String getTestRunRuleTaskStatus() {
				return this.testRunRuleTaskStatus;
			}

			public void setTestRunRuleTaskStatus(String testRunRuleTaskStatus) {
				this.testRunRuleTaskStatus = testRunRuleTaskStatus;
			}

			public Boolean getTestRunRuleValidateResult() {
				return this.testRunRuleValidateResult;
			}

			public void setTestRunRuleValidateResult(Boolean testRunRuleValidateResult) {
				this.testRunRuleValidateResult = testRunRuleValidateResult;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getModifierName() {
				return this.modifierName;
			}

			public void setModifierName(String modifierName) {
				this.modifierName = modifierName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public List<ValidateCondition> getValidateConditionList() {
				return this.validateConditionList;
			}

			public void setValidateConditionList(List<ValidateCondition> validateConditionList) {
				this.validateConditionList = validateConditionList;
			}

			public List<ScheduleBind> getScheduleBindList() {
				return this.scheduleBindList;
			}

			public void setScheduleBindList(List<ScheduleBind> scheduleBindList) {
				this.scheduleBindList = scheduleBindList;
			}

			public List<FormProperty> getFormPropertyList() {
				return this.formPropertyList;
			}

			public void setFormPropertyList(List<FormProperty> formPropertyList) {
				this.formPropertyList = formPropertyList;
			}

			public List<AttributeWithValue> getAttributeWithValueList() {
				return this.attributeWithValueList;
			}

			public void setAttributeWithValueList(List<AttributeWithValue> attributeWithValueList) {
				this.attributeWithValueList = attributeWithValueList;
			}

			public List<String> getCatalogList() {
				return this.catalogList;
			}

			public void setCatalogList(List<String> catalogList) {
				this.catalogList = catalogList;
			}

			public ValidateObject getValidateObject() {
				return this.validateObject;
			}

			public void setValidateObject(ValidateObject validateObject) {
				this.validateObject = validateObject;
			}

			public static class ValidateCondition {

				private String id;

				private String type;

				private String operator;

				private String operatorName;

				private String metric;

				private String metricName;

				private String value;

				private String parentId;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getOperatorName() {
					return this.operatorName;
				}

				public void setOperatorName(String operatorName) {
					this.operatorName = operatorName;
				}

				public String getMetric() {
					return this.metric;
				}

				public void setMetric(String metric) {
					this.metric = metric;
				}

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getParentId() {
					return this.parentId;
				}

				public void setParentId(String parentId) {
					this.parentId = parentId;
				}
			}

			public static class ScheduleBind {

				private Long scheduleId;

				private String scheduleName;

				public Long getScheduleId() {
					return this.scheduleId;
				}

				public void setScheduleId(Long scheduleId) {
					this.scheduleId = scheduleId;
				}

				public String getScheduleName() {
					return this.scheduleName;
				}

				public void setScheduleName(String scheduleName) {
					this.scheduleName = scheduleName;
				}
			}

			public static class FormProperty {

				private String componentType;

				private String name;

				private String value;

				public String getComponentType() {
					return this.componentType;
				}

				public void setComponentType(String componentType) {
					this.componentType = componentType;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class AttributeWithValue {

				private AttributeInfo attributeInfo;

				private AttributeValue attributeValue;

				public AttributeInfo getAttributeInfo() {
					return this.attributeInfo;
				}

				public void setAttributeInfo(AttributeInfo attributeInfo) {
					this.attributeInfo = attributeInfo;
				}

				public AttributeValue getAttributeValue() {
					return this.attributeValue;
				}

				public void setAttributeValue(AttributeValue attributeValue) {
					this.attributeValue = attributeValue;
				}

				public static class AttributeInfo {

					private Long id;

					private String name;

					private String description;

					private Boolean enabled;

					private Boolean required;

					private Boolean searchable;

					private ValueConfig valueConfig;

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
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

					public Boolean getEnabled() {
						return this.enabled;
					}

					public void setEnabled(Boolean enabled) {
						this.enabled = enabled;
					}

					public Boolean getRequired() {
						return this.required;
					}

					public void setRequired(Boolean required) {
						this.required = required;
					}

					public Boolean getSearchable() {
						return this.searchable;
					}

					public void setSearchable(Boolean searchable) {
						this.searchable = searchable;
					}

					public ValueConfig getValueConfig() {
						return this.valueConfig;
					}

					public void setValueConfig(ValueConfig valueConfig) {
						this.valueConfig = valueConfig;
					}

					public static class ValueConfig {

						private String type;

						private String dataType;

						private Integer length;

						private List<String> valueEnumList;

						private DefaultValue defaultValue;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public String getDataType() {
							return this.dataType;
						}

						public void setDataType(String dataType) {
							this.dataType = dataType;
						}

						public Integer getLength() {
							return this.length;
						}

						public void setLength(Integer length) {
							this.length = length;
						}

						public List<String> getValueEnumList() {
							return this.valueEnumList;
						}

						public void setValueEnumList(List<String> valueEnumList) {
							this.valueEnumList = valueEnumList;
						}

						public DefaultValue getDefaultValue() {
							return this.defaultValue;
						}

						public void setDefaultValue(DefaultValue defaultValue) {
							this.defaultValue = defaultValue;
						}

						public static class DefaultValue {

							private String minValue;

							private Boolean includeMinValue;

							private String maxValue;

							private Boolean includeMaxValue;

							private List<String> valueList;

							public String getMinValue() {
								return this.minValue;
							}

							public void setMinValue(String minValue) {
								this.minValue = minValue;
							}

							public Boolean getIncludeMinValue() {
								return this.includeMinValue;
							}

							public void setIncludeMinValue(Boolean includeMinValue) {
								this.includeMinValue = includeMinValue;
							}

							public String getMaxValue() {
								return this.maxValue;
							}

							public void setMaxValue(String maxValue) {
								this.maxValue = maxValue;
							}

							public Boolean getIncludeMaxValue() {
								return this.includeMaxValue;
							}

							public void setIncludeMaxValue(Boolean includeMaxValue) {
								this.includeMaxValue = includeMaxValue;
							}

							public List<String> getValueList() {
								return this.valueList;
							}

							public void setValueList(List<String> valueList) {
								this.valueList = valueList;
							}
						}
					}
				}

				public static class AttributeValue {

					private String minValue;

					private Boolean includeMinValue;

					private String maxValue;

					private Boolean includeMaxValue;

					private List<String> valueList1;

					public String getMinValue() {
						return this.minValue;
					}

					public void setMinValue(String minValue) {
						this.minValue = minValue;
					}

					public Boolean getIncludeMinValue() {
						return this.includeMinValue;
					}

					public void setIncludeMinValue(Boolean includeMinValue) {
						this.includeMinValue = includeMinValue;
					}

					public String getMaxValue() {
						return this.maxValue;
					}

					public void setMaxValue(String maxValue) {
						this.maxValue = maxValue;
					}

					public Boolean getIncludeMaxValue() {
						return this.includeMaxValue;
					}

					public void setIncludeMaxValue(Boolean includeMaxValue) {
						this.includeMaxValue = includeMaxValue;
					}

					public List<String> getValueList1() {
						return this.valueList1;
					}

					public void setValueList1(List<String> valueList1) {
						this.valueList1 = valueList1;
					}
				}
			}

			public static class ValidateObject {

				private String type;

				private String name;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public ListQualityRulesResponse getInstance(UnmarshallerContext context) {
		return	ListQualityRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
