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
public class UpsertQualityRuleRequest extends RpcAcsRequest<UpsertQualityRuleResponse> {
	   

	private Long opTenantId;

	@SerializedName("upsertCommand")
	private UpsertCommand upsertCommand;
	public UpsertQualityRuleRequest() {
		super("dataphin-public", "2023-06-30", "UpsertQualityRule");
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

	public UpsertCommand getUpsertCommand() {
		return this.upsertCommand;
	}

	public void setUpsertCommand(UpsertCommand upsertCommand) {
		this.upsertCommand = upsertCommand;	
		if (upsertCommand != null) {
			putBodyParameter("UpsertCommand" , new Gson().toJson(upsertCommand));
		}	
	}

	public static class UpsertCommand {

		@SerializedName("EnableErrorArchive")
		private Boolean enableErrorArchive;

		@SerializedName("ValidateConditionList")
		private List<ValidateConditionListItem> validateConditionList;

		@SerializedName("Strength")
		private String strength;

		@SerializedName("CatalogList")
		private List<String> catalogList;

		@SerializedName("FormPropertyList")
		private List<FormPropertyListItem> formPropertyList;

		@SerializedName("TemplateType")
		private String templateType;

		@SerializedName("WatchId")
		private Long watchId;

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("Id")
		private Long id;

		@SerializedName("AttributeWithValueList")
		private List<AttributeWithValueListItem> attributeWithValueList;

		@SerializedName("TemplateId")
		private Long templateId;

		public Boolean getEnableErrorArchive() {
			return this.enableErrorArchive;
		}

		public void setEnableErrorArchive(Boolean enableErrorArchive) {
			this.enableErrorArchive = enableErrorArchive;
		}

		public List<ValidateConditionListItem> getValidateConditionList() {
			return this.validateConditionList;
		}

		public void setValidateConditionList(List<ValidateConditionListItem> validateConditionList) {
			this.validateConditionList = validateConditionList;
		}

		public String getStrength() {
			return this.strength;
		}

		public void setStrength(String strength) {
			this.strength = strength;
		}

		public List<String> getCatalogList() {
			return this.catalogList;
		}

		public void setCatalogList(List<String> catalogList) {
			this.catalogList = catalogList;
		}

		public List<FormPropertyListItem> getFormPropertyList() {
			return this.formPropertyList;
		}

		public void setFormPropertyList(List<FormPropertyListItem> formPropertyList) {
			this.formPropertyList = formPropertyList;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<AttributeWithValueListItem> getAttributeWithValueList() {
			return this.attributeWithValueList;
		}

		public void setAttributeWithValueList(List<AttributeWithValueListItem> attributeWithValueList) {
			this.attributeWithValueList = attributeWithValueList;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public static class ValidateConditionListItem {

			@SerializedName("Metric")
			private String metric;

			@SerializedName("Id")
			private String id;

			@SerializedName("Type")
			private String type;

			@SerializedName("Value")
			private String value;

			@SerializedName("Operator")
			private String operator;

			@SerializedName("ParentId")
			private String parentId;

			public String getMetric() {
				return this.metric;
			}

			public void setMetric(String metric) {
				this.metric = metric;
			}

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

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}
		}

		public static class FormPropertyListItem {

			@SerializedName("ComponentType")
			private String componentType;

			@SerializedName("Name")
			private String name;

			@SerializedName("Value")
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

		public static class AttributeWithValueListItem {

			@SerializedName("AttributeInfo")
			private AttributeInfo attributeInfo;

			@SerializedName("AttributeValue")
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

				@SerializedName("Name")
				private String name;

				@SerializedName("ValueConfig")
				private ValueConfig valueConfig;

				@SerializedName("Description")
				private String description;

				@SerializedName("Id")
				private Long id;

				@SerializedName("Enabled")
				private Boolean enabled;

				@SerializedName("Required")
				private Boolean required;

				@SerializedName("Searchable")
				private Boolean searchable;

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

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
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

				public static class ValueConfig {

					@SerializedName("DataType")
					private String dataType;

					@SerializedName("Length")
					private Integer length;

					@SerializedName("DefaultValue")
					private DefaultValue defaultValue;

					@SerializedName("Type")
					private String type;

					@SerializedName("ValueEnumList")
					private List<String> valueEnumList;

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

					public DefaultValue getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(DefaultValue defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public List<String> getValueEnumList() {
						return this.valueEnumList;
					}

					public void setValueEnumList(List<String> valueEnumList) {
						this.valueEnumList = valueEnumList;
					}

					public static class DefaultValue {

						@SerializedName("MaxValue")
						private String maxValue;

						@SerializedName("ValueList")
						private List<String> valueList;

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

						public List<String> getValueList() {
							return this.valueList;
						}

						public void setValueList(List<String> valueList) {
							this.valueList = valueList;
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

			public static class AttributeValue {

				@SerializedName("MaxValue")
				private String maxValue;

				@SerializedName("ValueList")
				private List<String> valueList;

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

				public List<String> getValueList() {
					return this.valueList;
				}

				public void setValueList(List<String> valueList) {
					this.valueList = valueList;
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

	@Override
	public Class<UpsertQualityRuleResponse> getResponseClass() {
		return UpsertQualityRuleResponse.class;
	}

}
