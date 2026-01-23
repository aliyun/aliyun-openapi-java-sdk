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
public class UpdateStandardRequest extends RpcAcsRequest<UpdateStandardResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateStandardRequest() {
		super("dataphin-public", "2023-06-30", "UpdateStandard");
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

		@SerializedName("StandardSetReference")
		private StandardSetReference standardSetReference;

		@SerializedName("Owner")
		private String owner;

		@SerializedName("StandardGeneralMonitorConfig")
		private StandardGeneralMonitorConfig standardGeneralMonitorConfig;

		@SerializedName("EffectiveTimeConfig")
		private EffectiveTimeConfig effectiveTimeConfig;

		@SerializedName("NeedGenerateStandardCode")
		private Boolean needGenerateStandardCode;

		@SerializedName("StandardId")
		private Long standardId;

		@SerializedName("StandardTemplateReference")
		private StandardTemplateReference standardTemplateReference;

		@SerializedName("StandardStatus")
		private String standardStatus;

		@SerializedName("Description")
		private String description;

		@SerializedName("Version")
		private Integer version;

		public StandardSetReference getStandardSetReference() {
			return this.standardSetReference;
		}

		public void setStandardSetReference(StandardSetReference standardSetReference) {
			this.standardSetReference = standardSetReference;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public StandardGeneralMonitorConfig getStandardGeneralMonitorConfig() {
			return this.standardGeneralMonitorConfig;
		}

		public void setStandardGeneralMonitorConfig(StandardGeneralMonitorConfig standardGeneralMonitorConfig) {
			this.standardGeneralMonitorConfig = standardGeneralMonitorConfig;
		}

		public EffectiveTimeConfig getEffectiveTimeConfig() {
			return this.effectiveTimeConfig;
		}

		public void setEffectiveTimeConfig(EffectiveTimeConfig effectiveTimeConfig) {
			this.effectiveTimeConfig = effectiveTimeConfig;
		}

		public Boolean getNeedGenerateStandardCode() {
			return this.needGenerateStandardCode;
		}

		public void setNeedGenerateStandardCode(Boolean needGenerateStandardCode) {
			this.needGenerateStandardCode = needGenerateStandardCode;
		}

		public Long getStandardId() {
			return this.standardId;
		}

		public void setStandardId(Long standardId) {
			this.standardId = standardId;
		}

		public StandardTemplateReference getStandardTemplateReference() {
			return this.standardTemplateReference;
		}

		public void setStandardTemplateReference(StandardTemplateReference standardTemplateReference) {
			this.standardTemplateReference = standardTemplateReference;
		}

		public String getStandardStatus() {
			return this.standardStatus;
		}

		public void setStandardStatus(String standardStatus) {
			this.standardStatus = standardStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public static class StandardSetReference {

			@SerializedName("Id")
			private Long id;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}

		public static class StandardGeneralMonitorConfig {

			@SerializedName("StandardMonitorConfigList")
			private List<StandardMonitorConfigListItem> standardMonitorConfigList;

			public List<StandardMonitorConfigListItem> getStandardMonitorConfigList() {
				return this.standardMonitorConfigList;
			}

			public void setStandardMonitorConfigList(List<StandardMonitorConfigListItem> standardMonitorConfigList) {
				this.standardMonitorConfigList = standardMonitorConfigList;
			}

			public static class StandardMonitorConfigListItem {

				@SerializedName("AttributeId")
				private Long attributeId;

				@SerializedName("RuleConfigList")
				private List<RuleConfigListItem> ruleConfigList;

				@SerializedName("AttributeMonitorConfig")
				private AttributeMonitorConfig attributeMonitorConfig;

				@SerializedName("RuleSubType")
				private String ruleSubType;

				@SerializedName("RuleValidateConfigList")
				private List<RuleValidateConfigListItem> ruleValidateConfigList;

				@SerializedName("Description")
				private String description;

				@SerializedName("RuleName")
				private String ruleName;

				@SerializedName("MonitorFrom")
				private String monitorFrom;

				@SerializedName("Id")
				private Long id;

				@SerializedName("AttributeName")
				private String attributeName;

				@SerializedName("Type")
				private String type;

				@SerializedName("QualityRuleTemplate")
				private QualityRuleTemplate qualityRuleTemplate;

				public Long getAttributeId() {
					return this.attributeId;
				}

				public void setAttributeId(Long attributeId) {
					this.attributeId = attributeId;
				}

				public List<RuleConfigListItem> getRuleConfigList() {
					return this.ruleConfigList;
				}

				public void setRuleConfigList(List<RuleConfigListItem> ruleConfigList) {
					this.ruleConfigList = ruleConfigList;
				}

				public AttributeMonitorConfig getAttributeMonitorConfig() {
					return this.attributeMonitorConfig;
				}

				public void setAttributeMonitorConfig(AttributeMonitorConfig attributeMonitorConfig) {
					this.attributeMonitorConfig = attributeMonitorConfig;
				}

				public String getRuleSubType() {
					return this.ruleSubType;
				}

				public void setRuleSubType(String ruleSubType) {
					this.ruleSubType = ruleSubType;
				}

				public List<RuleValidateConfigListItem> getRuleValidateConfigList() {
					return this.ruleValidateConfigList;
				}

				public void setRuleValidateConfigList(List<RuleValidateConfigListItem> ruleValidateConfigList) {
					this.ruleValidateConfigList = ruleValidateConfigList;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public String getMonitorFrom() {
					return this.monitorFrom;
				}

				public void setMonitorFrom(String monitorFrom) {
					this.monitorFrom = monitorFrom;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getAttributeName() {
					return this.attributeName;
				}

				public void setAttributeName(String attributeName) {
					this.attributeName = attributeName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public QualityRuleTemplate getQualityRuleTemplate() {
					return this.qualityRuleTemplate;
				}

				public void setQualityRuleTemplate(QualityRuleTemplate qualityRuleTemplate) {
					this.qualityRuleTemplate = qualityRuleTemplate;
				}

				public static class RuleConfigListItem {

					@SerializedName("Value")
					private String value;

					@SerializedName("Key")
					private String key;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}

				public static class AttributeMonitorConfig {

					@SerializedName("IsCaseSensitive")
					private Boolean isCaseSensitive;

					@SerializedName("Type")
					private String type;

					@SerializedName("ColumnName")
					private String columnName;

					public Boolean getIsCaseSensitive() {
						return this.isCaseSensitive;
					}

					public void setIsCaseSensitive(Boolean isCaseSensitive) {
						this.isCaseSensitive = isCaseSensitive;
					}

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
				}

				public static class RuleValidateConfigListItem {

					@SerializedName("Metric")
					private String metric;

					@SerializedName("Id")
					private String id;

					@SerializedName("Type")
					private String type;

					@SerializedName("MetricName")
					private String metricName;

					@SerializedName("Value")
					private String value;

					@SerializedName("ParentId")
					private String parentId;

					@SerializedName("Operator")
					private String operator;

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

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}
				}

				public static class QualityRuleTemplate {

					@SerializedName("Name")
					private String name;

					@SerializedName("Id")
					private Long id;

					@SerializedName("Type")
					private String type;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

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
				}
			}
		}

		public static class EffectiveTimeConfig {

			@SerializedName("EndTime")
			private String endTime;

			@SerializedName("StartTime")
			private String startTime;

			@SerializedName("Type")
			private String type;

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class StandardTemplateReference {

			@SerializedName("Id")
			private Long id;

			@SerializedName("AttributeValueList")
			private List<AttributeValueListItem> attributeValueList;

			@SerializedName("Version")
			private Integer version;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public List<AttributeValueListItem> getAttributeValueList() {
				return this.attributeValueList;
			}

			public void setAttributeValueList(List<AttributeValueListItem> attributeValueList) {
				this.attributeValueList = attributeValueList;
			}

			public Integer getVersion() {
				return this.version;
			}

			public void setVersion(Integer version) {
				this.version = version;
			}

			public static class AttributeValueListItem {

				@SerializedName("AttributeId")
				private Long attributeId;

				@SerializedName("Value")
				private String value;

				public Long getAttributeId() {
					return this.attributeId;
				}

				public void setAttributeId(Long attributeId) {
					this.attributeId = attributeId;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public Class<UpdateStandardResponse> getResponseClass() {
		return UpdateStandardResponse.class;
	}

}
