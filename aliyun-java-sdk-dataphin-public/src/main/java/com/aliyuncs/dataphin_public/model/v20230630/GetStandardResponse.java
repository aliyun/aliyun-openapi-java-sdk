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
import com.aliyuncs.dataphin_public.transform.v20230630.GetStandardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStandardResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private StandardInfo standardInfo;

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

	public StandardInfo getStandardInfo() {
		return this.standardInfo;
	}

	public void setStandardInfo(StandardInfo standardInfo) {
		this.standardInfo = standardInfo;
	}

	public static class StandardInfo {

		private Long id;

		private Integer version;

		private String status;

		private String stage;

		private String description;

		private String name;

		private String englishName;

		private String code;

		private String type;

		private String modifyTime;

		private List<AttributeWithValue> attributeWithValueList;

		private List<StandardRelation> standardRelations;

		private List<LookupTableRelation> lookupTableRelations;

		private StandardTemplate standardTemplate;

		private StandardSet standardSet;

		private EffectiveTimeConfig effectiveTimeConfig;

		private Owner owner;

		private LastModifier lastModifier;

		private Creator creator;

		private StandardGeneralMonitorConfig standardGeneralMonitorConfig;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStage() {
			return this.stage;
		}

		public void setStage(String stage) {
			this.stage = stage;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEnglishName() {
			return this.englishName;
		}

		public void setEnglishName(String englishName) {
			this.englishName = englishName;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public List<AttributeWithValue> getAttributeWithValueList() {
			return this.attributeWithValueList;
		}

		public void setAttributeWithValueList(List<AttributeWithValue> attributeWithValueList) {
			this.attributeWithValueList = attributeWithValueList;
		}

		public List<StandardRelation> getStandardRelations() {
			return this.standardRelations;
		}

		public void setStandardRelations(List<StandardRelation> standardRelations) {
			this.standardRelations = standardRelations;
		}

		public List<LookupTableRelation> getLookupTableRelations() {
			return this.lookupTableRelations;
		}

		public void setLookupTableRelations(List<LookupTableRelation> lookupTableRelations) {
			this.lookupTableRelations = lookupTableRelations;
		}

		public StandardTemplate getStandardTemplate() {
			return this.standardTemplate;
		}

		public void setStandardTemplate(StandardTemplate standardTemplate) {
			this.standardTemplate = standardTemplate;
		}

		public StandardSet getStandardSet() {
			return this.standardSet;
		}

		public void setStandardSet(StandardSet standardSet) {
			this.standardSet = standardSet;
		}

		public EffectiveTimeConfig getEffectiveTimeConfig() {
			return this.effectiveTimeConfig;
		}

		public void setEffectiveTimeConfig(EffectiveTimeConfig effectiveTimeConfig) {
			this.effectiveTimeConfig = effectiveTimeConfig;
		}

		public Owner getOwner() {
			return this.owner;
		}

		public void setOwner(Owner owner) {
			this.owner = owner;
		}

		public LastModifier getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(LastModifier lastModifier) {
			this.lastModifier = lastModifier;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public StandardGeneralMonitorConfig getStandardGeneralMonitorConfig() {
			return this.standardGeneralMonitorConfig;
		}

		public void setStandardGeneralMonitorConfig(StandardGeneralMonitorConfig standardGeneralMonitorConfig) {
			this.standardGeneralMonitorConfig = standardGeneralMonitorConfig;
		}

		public static class AttributeWithValue {

			private String value;

			private Attribute attribute;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Attribute getAttribute() {
				return this.attribute;
			}

			public void setAttribute(Attribute attribute) {
				this.attribute = attribute;
			}

			public static class Attribute {

				private String name;

				private String code;

				private String type;

				private Boolean required;

				private Boolean enableMonitorConfig;

				private String description;

				private Long id;

				private ValueConfig valueConfig;

				private MonitorConfig monitorConfig;

				private RefAttribute refAttribute;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public Boolean getEnableMonitorConfig() {
					return this.enableMonitorConfig;
				}

				public void setEnableMonitorConfig(Boolean enableMonitorConfig) {
					this.enableMonitorConfig = enableMonitorConfig;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public ValueConfig getValueConfig() {
					return this.valueConfig;
				}

				public void setValueConfig(ValueConfig valueConfig) {
					this.valueConfig = valueConfig;
				}

				public MonitorConfig getMonitorConfig() {
					return this.monitorConfig;
				}

				public void setMonitorConfig(MonitorConfig monitorConfig) {
					this.monitorConfig = monitorConfig;
				}

				public RefAttribute getRefAttribute() {
					return this.refAttribute;
				}

				public void setRefAttribute(RefAttribute refAttribute) {
					this.refAttribute = refAttribute;
				}

				public static class ValueConfig {

					private String type;

					private String dataType;

					private Integer length;

					private String defaultValue;

					private ValueRange valueRange;

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

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}

					public ValueRange getValueRange() {
						return this.valueRange;
					}

					public void setValueRange(ValueRange valueRange) {
						this.valueRange = valueRange;
					}

					public static class ValueRange {

						private String valueConstraint;

						private String dataphinAttributeType;

						private List<String> valueList;

						private MinMaxValueConfig minMaxValueConfig;

						private LookupTableReference lookupTableReference;

						public String getValueConstraint() {
							return this.valueConstraint;
						}

						public void setValueConstraint(String valueConstraint) {
							this.valueConstraint = valueConstraint;
						}

						public String getDataphinAttributeType() {
							return this.dataphinAttributeType;
						}

						public void setDataphinAttributeType(String dataphinAttributeType) {
							this.dataphinAttributeType = dataphinAttributeType;
						}

						public List<String> getValueList() {
							return this.valueList;
						}

						public void setValueList(List<String> valueList) {
							this.valueList = valueList;
						}

						public MinMaxValueConfig getMinMaxValueConfig() {
							return this.minMaxValueConfig;
						}

						public void setMinMaxValueConfig(MinMaxValueConfig minMaxValueConfig) {
							this.minMaxValueConfig = minMaxValueConfig;
						}

						public LookupTableReference getLookupTableReference() {
							return this.lookupTableReference;
						}

						public void setLookupTableReference(LookupTableReference lookupTableReference) {
							this.lookupTableReference = lookupTableReference;
						}

						public static class MinMaxValueConfig {

							private String minValue;

							private Boolean includeMinValue;

							private String maxValue;

							private Boolean includeMaxValue;

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
						}

						public static class LookupTableReference {

							private Long lookupTableId;

							private String column;

							public Long getLookupTableId() {
								return this.lookupTableId;
							}

							public void setLookupTableId(Long lookupTableId) {
								this.lookupTableId = lookupTableId;
							}

							public String getColumn() {
								return this.column;
							}

							public void setColumn(String column) {
								this.column = column;
							}
						}
					}
				}

				public static class MonitorConfig {

					private String type;

					private String columnName;

					private Boolean isCaseSensitive;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getColumnName() {
						return this.columnName;
					}

					public void setColumnName(String columnName) {
						this.columnName = columnName;
					}

					public Boolean getIsCaseSensitive() {
						return this.isCaseSensitive;
					}

					public void setIsCaseSensitive(Boolean isCaseSensitive) {
						this.isCaseSensitive = isCaseSensitive;
					}
				}

				public static class RefAttribute {

					private Long attributeId;

					private AttributeFromInfo attributeFromInfo;

					public Long getAttributeId() {
						return this.attributeId;
					}

					public void setAttributeId(Long attributeId) {
						this.attributeId = attributeId;
					}

					public AttributeFromInfo getAttributeFromInfo() {
						return this.attributeFromInfo;
					}

					public void setAttributeFromInfo(AttributeFromInfo attributeFromInfo) {
						this.attributeFromInfo = attributeFromInfo;
					}

					public static class AttributeFromInfo {

						private String attributeFrom;

						private StandardReference standardReference;

						public String getAttributeFrom() {
							return this.attributeFrom;
						}

						public void setAttributeFrom(String attributeFrom) {
							this.attributeFrom = attributeFrom;
						}

						public StandardReference getStandardReference() {
							return this.standardReference;
						}

						public void setStandardReference(StandardReference standardReference) {
							this.standardReference = standardReference;
						}

						public static class StandardReference {

							private Long standardId;

							private Integer version;

							public Long getStandardId() {
								return this.standardId;
							}

							public void setStandardId(Long standardId) {
								this.standardId = standardId;
							}

							public Integer getVersion() {
								return this.version;
							}

							public void setVersion(Integer version) {
								this.version = version;
							}
						}
					}
				}
			}
		}

		public static class StandardRelation {

			private Long standardId;

			private Integer version;

			private String standardStage;

			private String standardStatus;

			private String relationType;

			public Long getStandardId() {
				return this.standardId;
			}

			public void setStandardId(Long standardId) {
				this.standardId = standardId;
			}

			public Integer getVersion() {
				return this.version;
			}

			public void setVersion(Integer version) {
				this.version = version;
			}

			public String getStandardStage() {
				return this.standardStage;
			}

			public void setStandardStage(String standardStage) {
				this.standardStage = standardStage;
			}

			public String getStandardStatus() {
				return this.standardStatus;
			}

			public void setStandardStatus(String standardStatus) {
				this.standardStatus = standardStatus;
			}

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}
		}

		public static class LookupTableRelation {

			private Long lookupTableId;

			private String lookupTableCode;

			private Long attributeId;

			private String attributeName;

			private String attributeCode;

			public Long getLookupTableId() {
				return this.lookupTableId;
			}

			public void setLookupTableId(Long lookupTableId) {
				this.lookupTableId = lookupTableId;
			}

			public String getLookupTableCode() {
				return this.lookupTableCode;
			}

			public void setLookupTableCode(String lookupTableCode) {
				this.lookupTableCode = lookupTableCode;
			}

			public Long getAttributeId() {
				return this.attributeId;
			}

			public void setAttributeId(Long attributeId) {
				this.attributeId = attributeId;
			}

			public String getAttributeName() {
				return this.attributeName;
			}

			public void setAttributeName(String attributeName) {
				this.attributeName = attributeName;
			}

			public String getAttributeCode() {
				return this.attributeCode;
			}

			public void setAttributeCode(String attributeCode) {
				this.attributeCode = attributeCode;
			}
		}

		public static class StandardTemplate {

			private Long id;

			private String name;

			private String code;

			private String templateFrom;

			private Integer version;

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

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getTemplateFrom() {
				return this.templateFrom;
			}

			public void setTemplateFrom(String templateFrom) {
				this.templateFrom = templateFrom;
			}

			public Integer getVersion() {
				return this.version;
			}

			public void setVersion(Integer version) {
				this.version = version;
			}
		}

		public static class StandardSet {

			private Long id;

			private String name;

			private String code;

			private String directory;

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

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}
		}

		public static class EffectiveTimeConfig {

			private String type;

			private String startTime;

			private String endTime;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}

		public static class Owner {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class LastModifier {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Creator {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class StandardGeneralMonitorConfig {

			private List<StandardMonitorConfig> standardMonitorConfigList;

			public List<StandardMonitorConfig> getStandardMonitorConfigList() {
				return this.standardMonitorConfigList;
			}

			public void setStandardMonitorConfigList(List<StandardMonitorConfig> standardMonitorConfigList) {
				this.standardMonitorConfigList = standardMonitorConfigList;
			}

			public static class StandardMonitorConfig {

				private Long id;

				private String ruleName;

				private String description;

				private String type;

				private String monitorFrom;

				private Long attributeId;

				private String attributeName;

				private String ruleSubType;

				private List<RuleConfig> ruleConfigList;

				private List<RuleValidateConfig> ruleValidateConfigList;

				private AttributeMonitorConfig attributeMonitorConfig;

				private QualityRuleTemplate qualityRuleTemplate;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getMonitorFrom() {
					return this.monitorFrom;
				}

				public void setMonitorFrom(String monitorFrom) {
					this.monitorFrom = monitorFrom;
				}

				public Long getAttributeId() {
					return this.attributeId;
				}

				public void setAttributeId(Long attributeId) {
					this.attributeId = attributeId;
				}

				public String getAttributeName() {
					return this.attributeName;
				}

				public void setAttributeName(String attributeName) {
					this.attributeName = attributeName;
				}

				public String getRuleSubType() {
					return this.ruleSubType;
				}

				public void setRuleSubType(String ruleSubType) {
					this.ruleSubType = ruleSubType;
				}

				public List<RuleConfig> getRuleConfigList() {
					return this.ruleConfigList;
				}

				public void setRuleConfigList(List<RuleConfig> ruleConfigList) {
					this.ruleConfigList = ruleConfigList;
				}

				public List<RuleValidateConfig> getRuleValidateConfigList() {
					return this.ruleValidateConfigList;
				}

				public void setRuleValidateConfigList(List<RuleValidateConfig> ruleValidateConfigList) {
					this.ruleValidateConfigList = ruleValidateConfigList;
				}

				public AttributeMonitorConfig getAttributeMonitorConfig() {
					return this.attributeMonitorConfig;
				}

				public void setAttributeMonitorConfig(AttributeMonitorConfig attributeMonitorConfig) {
					this.attributeMonitorConfig = attributeMonitorConfig;
				}

				public QualityRuleTemplate getQualityRuleTemplate() {
					return this.qualityRuleTemplate;
				}

				public void setQualityRuleTemplate(QualityRuleTemplate qualityRuleTemplate) {
					this.qualityRuleTemplate = qualityRuleTemplate;
				}

				public static class RuleConfig {

					private String key;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class RuleValidateConfig {

					private String id;

					private String parentId;

					private String type;

					private String operator;

					private String metric;

					private String metricName;

					private String value;

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getParentId() {
						return this.parentId;
					}

					public void setParentId(String parentId) {
						this.parentId = parentId;
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
				}

				public static class AttributeMonitorConfig {

					private String type;

					private String columnName;

					private Boolean isCaseSensitive;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getColumnName() {
						return this.columnName;
					}

					public void setColumnName(String columnName) {
						this.columnName = columnName;
					}

					public Boolean getIsCaseSensitive() {
						return this.isCaseSensitive;
					}

					public void setIsCaseSensitive(Boolean isCaseSensitive) {
						this.isCaseSensitive = isCaseSensitive;
					}
				}

				public static class QualityRuleTemplate {

					private Long id;

					private String type;

					private String name;

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}

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
	}

	@Override
	public GetStandardResponse getInstance(UnmarshallerContext context) {
		return	GetStandardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
