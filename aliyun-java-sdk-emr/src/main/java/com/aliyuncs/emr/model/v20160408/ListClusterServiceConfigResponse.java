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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterServiceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceConfigResponse extends AcsResponse {

	private String requestId;

	private List<Config> configs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Config> getConfigs() {
		return this.configs;
	}

	public void setConfigs(List<Config> configs) {
		this.configs = configs;
	}

	public static class Config {

		private String serviceName;

		private String configVersion;

		private String applied;

		private String createTime;

		private String author;

		private String comment;

		private List<ConfigValue> configValueList;

		private List<PropertyInfo> propertyInfoList;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getConfigVersion() {
			return this.configVersion;
		}

		public void setConfigVersion(String configVersion) {
			this.configVersion = configVersion;
		}

		public String getApplied() {
			return this.applied;
		}

		public void setApplied(String applied) {
			this.applied = applied;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public List<ConfigValue> getConfigValueList() {
			return this.configValueList;
		}

		public void setConfigValueList(List<ConfigValue> configValueList) {
			this.configValueList = configValueList;
		}

		public List<PropertyInfo> getPropertyInfoList() {
			return this.propertyInfoList;
		}

		public void setPropertyInfoList(List<PropertyInfo> propertyInfoList) {
			this.propertyInfoList = propertyInfoList;
		}

		public static class ConfigValue {

			private String configName;

			private Boolean allowCustom;

			private List<ConfigItemValue> configItemValueList;

			public String getConfigName() {
				return this.configName;
			}

			public void setConfigName(String configName) {
				this.configName = configName;
			}

			public Boolean getAllowCustom() {
				return this.allowCustom;
			}

			public void setAllowCustom(Boolean allowCustom) {
				this.allowCustom = allowCustom;
			}

			public List<ConfigItemValue> getConfigItemValueList() {
				return this.configItemValueList;
			}

			public void setConfigItemValueList(List<ConfigItemValue> configItemValueList) {
				this.configItemValueList = configItemValueList;
			}

			public static class ConfigItemValue {

				private String itemName;

				private String value;

				private Boolean isCustom;

				private String description;

				public String getItemName() {
					return this.itemName;
				}

				public void setItemName(String itemName) {
					this.itemName = itemName;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public Boolean getIsCustom() {
					return this.isCustom;
				}

				public void setIsCustom(Boolean isCustom) {
					this.isCustom = isCustom;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}
		}

		public static class PropertyInfo {

			private String name;

			private String value;

			private String description;

			private String fileName;

			private String displayName;

			private String serviceName;

			private String component;

			private List<String> propertyTypes;

			private PropertyValueAttributes propertyValueAttributes;

			private EffectWay effectWay;

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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getComponent() {
				return this.component;
			}

			public void setComponent(String component) {
				this.component = component;
			}

			public List<String> getPropertyTypes() {
				return this.propertyTypes;
			}

			public void setPropertyTypes(List<String> propertyTypes) {
				this.propertyTypes = propertyTypes;
			}

			public PropertyValueAttributes getPropertyValueAttributes() {
				return this.propertyValueAttributes;
			}

			public void setPropertyValueAttributes(PropertyValueAttributes propertyValueAttributes) {
				this.propertyValueAttributes = propertyValueAttributes;
			}

			public EffectWay getEffectWay() {
				return this.effectWay;
			}

			public void setEffectWay(EffectWay effectWay) {
				this.effectWay = effectWay;
			}

			public static class PropertyValueAttributes {

				private String type;

				private String maximum;

				private String mimimum;

				private String unit;

				private Boolean readOnly;

				private Boolean hidden;

				private String incrememtStep;

				private List<ValueEntryInfo> entries;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getMaximum() {
					return this.maximum;
				}

				public void setMaximum(String maximum) {
					this.maximum = maximum;
				}

				public String getMimimum() {
					return this.mimimum;
				}

				public void setMimimum(String mimimum) {
					this.mimimum = mimimum;
				}

				public String getUnit() {
					return this.unit;
				}

				public void setUnit(String unit) {
					this.unit = unit;
				}

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public Boolean getHidden() {
					return this.hidden;
				}

				public void setHidden(Boolean hidden) {
					this.hidden = hidden;
				}

				public String getIncrememtStep() {
					return this.incrememtStep;
				}

				public void setIncrememtStep(String incrememtStep) {
					this.incrememtStep = incrememtStep;
				}

				public List<ValueEntryInfo> getEntries() {
					return this.entries;
				}

				public void setEntries(List<ValueEntryInfo> entries) {
					this.entries = entries;
				}

				public static class ValueEntryInfo {

					private String value;

					private String label;

					private String description;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}
				}
			}

			public static class EffectWay {

				private String effectType;

				private String invokeServiceName;

				public String getEffectType() {
					return this.effectType;
				}

				public void setEffectType(String effectType) {
					this.effectType = effectType;
				}

				public String getInvokeServiceName() {
					return this.invokeServiceName;
				}

				public void setInvokeServiceName(String invokeServiceName) {
					this.invokeServiceName = invokeServiceName;
				}
			}
		}
	}

	@Override
	public ListClusterServiceConfigResponse getInstance(UnmarshallerContext context) {
		return	ListClusterServiceConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
