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
import com.aliyuncs.dataphin_public.transform.v20230630.GetStandardTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStandardTemplateResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private TemplateInfo templateInfo;

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

	public TemplateInfo getTemplateInfo() {
		return this.templateInfo;
	}

	public void setTemplateInfo(TemplateInfo templateInfo) {
		this.templateInfo = templateInfo;
	}

	public static class TemplateInfo {

		private Long id;

		private String templateFrom;

		private String uniqueId;

		private Integer version;

		private String name;

		private String code;

		private String description;

		private String createTime;

		private String modifyTime;

		private List<Maintainer> maintainerList;

		private Creator creator;

		private LastModifier lastModifier;

		private AttributesConfig attributesConfig;

		private CodeRuleConfig codeRuleConfig;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTemplateFrom() {
			return this.templateFrom;
		}

		public void setTemplateFrom(String templateFrom) {
			this.templateFrom = templateFrom;
		}

		public String getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
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

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public List<Maintainer> getMaintainerList() {
			return this.maintainerList;
		}

		public void setMaintainerList(List<Maintainer> maintainerList) {
			this.maintainerList = maintainerList;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public LastModifier getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(LastModifier lastModifier) {
			this.lastModifier = lastModifier;
		}

		public AttributesConfig getAttributesConfig() {
			return this.attributesConfig;
		}

		public void setAttributesConfig(AttributesConfig attributesConfig) {
			this.attributesConfig = attributesConfig;
		}

		public CodeRuleConfig getCodeRuleConfig() {
			return this.codeRuleConfig;
		}

		public void setCodeRuleConfig(CodeRuleConfig codeRuleConfig) {
			this.codeRuleConfig = codeRuleConfig;
		}

		public static class Maintainer {

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

		public static class AttributesConfig {

			private List<Attribute> attributeList;

			public List<Attribute> getAttributeList() {
				return this.attributeList;
			}

			public void setAttributeList(List<Attribute> attributeList) {
				this.attributeList = attributeList;
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

		public static class CodeRuleConfig {

			private String generateType;

			private AutoConfig autoConfig;

			public String getGenerateType() {
				return this.generateType;
			}

			public void setGenerateType(String generateType) {
				this.generateType = generateType;
			}

			public AutoConfig getAutoConfig() {
				return this.autoConfig;
			}

			public void setAutoConfig(AutoConfig autoConfig) {
				this.autoConfig = autoConfig;
			}

			public static class AutoConfig {

				private Boolean needStrongValidate;

				private List<CodeRule> codeRuleList;

				public Boolean getNeedStrongValidate() {
					return this.needStrongValidate;
				}

				public void setNeedStrongValidate(Boolean needStrongValidate) {
					this.needStrongValidate = needStrongValidate;
				}

				public List<CodeRule> getCodeRuleList() {
					return this.codeRuleList;
				}

				public void setCodeRuleList(List<CodeRule> codeRuleList) {
					this.codeRuleList = codeRuleList;
				}

				public static class CodeRule {

					private Integer index;

					private String type;

					private String value;

					private AutoIncrementSequenceConfig autoIncrementSequenceConfig;

					public Integer getIndex() {
						return this.index;
					}

					public void setIndex(Integer index) {
						this.index = index;
					}

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

					public AutoIncrementSequenceConfig getAutoIncrementSequenceConfig() {
						return this.autoIncrementSequenceConfig;
					}

					public void setAutoIncrementSequenceConfig(AutoIncrementSequenceConfig autoIncrementSequenceConfig) {
						this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
					}

					public static class AutoIncrementSequenceConfig {

						private Integer digit;

						private Long startValue;

						private Integer step;

						private Boolean needPaddingZero;

						public Integer getDigit() {
							return this.digit;
						}

						public void setDigit(Integer digit) {
							this.digit = digit;
						}

						public Long getStartValue() {
							return this.startValue;
						}

						public void setStartValue(Long startValue) {
							this.startValue = startValue;
						}

						public Integer getStep() {
							return this.step;
						}

						public void setStep(Integer step) {
							this.step = step;
						}

						public Boolean getNeedPaddingZero() {
							return this.needPaddingZero;
						}

						public void setNeedPaddingZero(Boolean needPaddingZero) {
							this.needPaddingZero = needPaddingZero;
						}
					}
				}
			}
		}
	}

	@Override
	public GetStandardTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetStandardTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
