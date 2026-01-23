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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateStandardTemplateRequest extends RpcAcsRequest<UpdateStandardTemplateResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateStandardTemplateRequest() {
		super("dataphin-public", "2023-06-30", "UpdateStandardTemplate");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public static class UpdateCommand {

		@SerializedName("MaintainerList")
		private List<String> maintainerList;

		@SerializedName("AttributesConfig")
		private AttributesConfig attributesConfig;

		@SerializedName("Code")
		private String code;

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("CodeRuleConfig")
		private CodeRuleConfig codeRuleConfig;

		@SerializedName("Id")
		private Long id;

		@SerializedName("PublishInfo")
		private PublishInfo publishInfo;

		@SerializedName("Version")
		private Integer version;

		public List<String> getMaintainerList() {
			return this.maintainerList;
		}

		public void setMaintainerList(List<String> maintainerList) {
			this.maintainerList = maintainerList;
		}

		public AttributesConfig getAttributesConfig() {
			return this.attributesConfig;
		}

		public void setAttributesConfig(AttributesConfig attributesConfig) {
			this.attributesConfig = attributesConfig;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
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

		public CodeRuleConfig getCodeRuleConfig() {
			return this.codeRuleConfig;
		}

		public void setCodeRuleConfig(CodeRuleConfig codeRuleConfig) {
			this.codeRuleConfig = codeRuleConfig;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public PublishInfo getPublishInfo() {
			return this.publishInfo;
		}

		public void setPublishInfo(PublishInfo publishInfo) {
			this.publishInfo = publishInfo;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public static class AttributesConfig {

			@SerializedName("AttributeList")
			private List<AttributeListItem> attributeList;

			public List<AttributeListItem> getAttributeList() {
				return this.attributeList;
			}

			public void setAttributeList(List<AttributeListItem> attributeList) {
				this.attributeList = attributeList;
			}

			public static class AttributeListItem {

				@SerializedName("Code")
				private String code;

				@SerializedName("Name")
				private String name;

				@SerializedName("ValueConfig")
				private ValueConfig valueConfig;

				@SerializedName("Description")
				private String description;

				@SerializedName("RefAttribute")
				private RefAttribute refAttribute;

				@SerializedName("Type")
				private String type;

				@SerializedName("Required")
				private Boolean required;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public ValueConfig getValueConfig() {
					return this.valueConfig;
				}

				public void setValueConfig(ValueConfig valueConfig) {
					this.valueConfig = valueConfig;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public RefAttribute getRefAttribute() {
					return this.refAttribute;
				}

				public void setRefAttribute(RefAttribute refAttribute) {
					this.refAttribute = refAttribute;
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

				public static class ValueConfig {

					@SerializedName("ValueRange")
					private ValueRange valueRange;

					@SerializedName("DataType")
					private String dataType;

					@SerializedName("Length")
					private Integer length;

					@SerializedName("DefaultValue")
					private String defaultValue;

					@SerializedName("Type")
					private String type;

					public ValueRange getValueRange() {
						return this.valueRange;
					}

					public void setValueRange(ValueRange valueRange) {
						this.valueRange = valueRange;
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

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public static class ValueRange {

						@SerializedName("LookupTableReference")
						private LookupTableReference lookupTableReference;

						@SerializedName("DataphinAttributeType")
						private String dataphinAttributeType;

						@SerializedName("MinMaxValueConfig")
						private MinMaxValueConfig minMaxValueConfig;

						@SerializedName("ValueList")
						private List<String> valueList;

						@SerializedName("ValueConstraint")
						private String valueConstraint;

						public LookupTableReference getLookupTableReference() {
							return this.lookupTableReference;
						}

						public void setLookupTableReference(LookupTableReference lookupTableReference) {
							this.lookupTableReference = lookupTableReference;
						}

						public String getDataphinAttributeType() {
							return this.dataphinAttributeType;
						}

						public void setDataphinAttributeType(String dataphinAttributeType) {
							this.dataphinAttributeType = dataphinAttributeType;
						}

						public MinMaxValueConfig getMinMaxValueConfig() {
							return this.minMaxValueConfig;
						}

						public void setMinMaxValueConfig(MinMaxValueConfig minMaxValueConfig) {
							this.minMaxValueConfig = minMaxValueConfig;
						}

						public List<String> getValueList() {
							return this.valueList;
						}

						public void setValueList(List<String> valueList) {
							this.valueList = valueList;
						}

						public String getValueConstraint() {
							return this.valueConstraint;
						}

						public void setValueConstraint(String valueConstraint) {
							this.valueConstraint = valueConstraint;
						}

						public static class LookupTableReference {

							@SerializedName("Column")
							private String column;

							@SerializedName("LookupTableId")
							private Long lookupTableId;

							public String getColumn() {
								return this.column;
							}

							public void setColumn(String column) {
								this.column = column;
							}

							public Long getLookupTableId() {
								return this.lookupTableId;
							}

							public void setLookupTableId(Long lookupTableId) {
								this.lookupTableId = lookupTableId;
							}
						}

						public static class MinMaxValueConfig {

							@SerializedName("MaxValue")
							private String maxValue;

							@SerializedName("IncludeMinValue")
							private Boolean includeMinValue;

							@SerializedName("IncludeMaxValue")
							private Boolean includeMaxValue;

							@SerializedName("MinValue")
							private String minValue;

							public String getMaxValue() {
								return this.maxValue;
							}

							public void setMaxValue(String maxValue) {
								this.maxValue = maxValue;
							}

							public Boolean getIncludeMinValue() {
								return this.includeMinValue;
							}

							public void setIncludeMinValue(Boolean includeMinValue) {
								this.includeMinValue = includeMinValue;
							}

							public Boolean getIncludeMaxValue() {
								return this.includeMaxValue;
							}

							public void setIncludeMaxValue(Boolean includeMaxValue) {
								this.includeMaxValue = includeMaxValue;
							}

							public String getMinValue() {
								return this.minValue;
							}

							public void setMinValue(String minValue) {
								this.minValue = minValue;
							}
						}
					}
				}

				public static class RefAttribute {

					@SerializedName("AttributeId")
					private Long attributeId;

					@SerializedName("AttributeFromInfo")
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

						@SerializedName("StandardReference")
						private StandardReference standardReference;

						@SerializedName("AttributeFrom")
						private String attributeFrom;

						public StandardReference getStandardReference() {
							return this.standardReference;
						}

						public void setStandardReference(StandardReference standardReference) {
							this.standardReference = standardReference;
						}

						public String getAttributeFrom() {
							return this.attributeFrom;
						}

						public void setAttributeFrom(String attributeFrom) {
							this.attributeFrom = attributeFrom;
						}

						public static class StandardReference {

							@SerializedName("StandardId")
							private Long standardId;

							@SerializedName("Version")
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

			@SerializedName("GenerateType")
			private String generateType;

			@SerializedName("AutoConfig")
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

				@SerializedName("NeedStrongValidate")
				private Boolean needStrongValidate;

				@SerializedName("CodeRuleList")
				private List<CodeRuleListItem> codeRuleList;

				public Boolean getNeedStrongValidate() {
					return this.needStrongValidate;
				}

				public void setNeedStrongValidate(Boolean needStrongValidate) {
					this.needStrongValidate = needStrongValidate;
				}

				public List<CodeRuleListItem> getCodeRuleList() {
					return this.codeRuleList;
				}

				public void setCodeRuleList(List<CodeRuleListItem> codeRuleList) {
					this.codeRuleList = codeRuleList;
				}

				public static class CodeRuleListItem {

					@SerializedName("AutoIncrementSequenceConfig")
					private AutoIncrementSequenceConfig autoIncrementSequenceConfig;

					@SerializedName("Index")
					private Integer index;

					@SerializedName("Type")
					private String type;

					@SerializedName("Value")
					private String value;

					public AutoIncrementSequenceConfig getAutoIncrementSequenceConfig() {
						return this.autoIncrementSequenceConfig;
					}

					public void setAutoIncrementSequenceConfig(AutoIncrementSequenceConfig autoIncrementSequenceConfig) {
						this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
					}

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

					public static class AutoIncrementSequenceConfig {

						@SerializedName("StartValue")
						private Long startValue;

						@SerializedName("Step")
						private Integer step;

						@SerializedName("NeedPaddingZero")
						private Boolean needPaddingZero;

						@SerializedName("Digit")
						private Integer digit;

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

						public Integer getDigit() {
							return this.digit;
						}

						public void setDigit(Integer digit) {
							this.digit = digit;
						}
					}
				}
			}
		}

		public static class PublishInfo {

			@SerializedName("Comment")
			private String comment;

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}
		}
	}

	@Override
	public Class<UpdateStandardTemplateResponse> getResponseClass() {
		return UpdateStandardTemplateResponse.class;
	}

}
