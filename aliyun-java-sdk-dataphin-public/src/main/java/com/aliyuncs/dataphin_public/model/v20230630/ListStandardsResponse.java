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
import com.aliyuncs.dataphin_public.transform.v20230630.ListStandardsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStandardsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private PageResult pageResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<Standard> standardList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Standard> getStandardList() {
			return this.standardList;
		}

		public void setStandardList(List<Standard> standardList) {
			this.standardList = standardList;
		}

		public static class Standard {

			private String status;

			private String modifyTime;

			private String description;

			private String code;

			private String name;

			private String type;

			private Integer version;

			private String stage;

			private Long id;

			private String englishName;

			private List<AttributeWithValue> attributeWithValueList;

			private Owner owner;

			private LastModifier lastModifier;

			private StandardSet standardSet;

			private StandardTemplate standardTemplate;

			private EffectiveTimeConfig effectiveTimeConfig;

			private Creator creator;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getVersion() {
				return this.version;
			}

			public void setVersion(Integer version) {
				this.version = version;
			}

			public String getStage() {
				return this.stage;
			}

			public void setStage(String stage) {
				this.stage = stage;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getEnglishName() {
				return this.englishName;
			}

			public void setEnglishName(String englishName) {
				this.englishName = englishName;
			}

			public List<AttributeWithValue> getAttributeWithValueList() {
				return this.attributeWithValueList;
			}

			public void setAttributeWithValueList(List<AttributeWithValue> attributeWithValueList) {
				this.attributeWithValueList = attributeWithValueList;
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

			public StandardSet getStandardSet() {
				return this.standardSet;
			}

			public void setStandardSet(StandardSet standardSet) {
				this.standardSet = standardSet;
			}

			public StandardTemplate getStandardTemplate() {
				return this.standardTemplate;
			}

			public void setStandardTemplate(StandardTemplate standardTemplate) {
				this.standardTemplate = standardTemplate;
			}

			public EffectiveTimeConfig getEffectiveTimeConfig() {
				return this.effectiveTimeConfig;
			}

			public void setEffectiveTimeConfig(EffectiveTimeConfig effectiveTimeConfig) {
				this.effectiveTimeConfig = effectiveTimeConfig;
			}

			public Creator getCreator() {
				return this.creator;
			}

			public void setCreator(Creator creator) {
				this.creator = creator;
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

					private String type;

					private String description;

					private Boolean required;

					private Long id;

					private String code;

					private Boolean enableMonitorConfig;

					private String name;

					private RefAttribute refAttribute;

					private ValueConfig valueConfig;

					private MonitorConfig monitorConfig;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}

					public Boolean getRequired() {
						return this.required;
					}

					public void setRequired(Boolean required) {
						this.required = required;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}

					public String getCode() {
						return this.code;
					}

					public void setCode(String code) {
						this.code = code;
					}

					public Boolean getEnableMonitorConfig() {
						return this.enableMonitorConfig;
					}

					public void setEnableMonitorConfig(Boolean enableMonitorConfig) {
						this.enableMonitorConfig = enableMonitorConfig;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public RefAttribute getRefAttribute() {
						return this.refAttribute;
					}

					public void setRefAttribute(RefAttribute refAttribute) {
						this.refAttribute = refAttribute;
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

								private Integer version;

								private Long standardId;

								public Integer getVersion() {
									return this.version;
								}

								public void setVersion(Integer version) {
									this.version = version;
								}

								public Long getStandardId() {
									return this.standardId;
								}

								public void setStandardId(Long standardId) {
									this.standardId = standardId;
								}
							}
						}
					}

					public static class ValueConfig {

						private String defaultValue;

						private String type;

						private Integer length;

						private String dataType;

						private ValueRange valueRange;

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

						public Integer getLength() {
							return this.length;
						}

						public void setLength(Integer length) {
							this.length = length;
						}

						public String getDataType() {
							return this.dataType;
						}

						public void setDataType(String dataType) {
							this.dataType = dataType;
						}

						public ValueRange getValueRange() {
							return this.valueRange;
						}

						public void setValueRange(ValueRange valueRange) {
							this.valueRange = valueRange;
						}

						public static class ValueRange {

							private String dataphinAttributeType;

							private String valueConstraint;

							private List<String> valueList;

							private LookupTableReference lookupTableReference;

							private MinMaxValueConfig minMaxValueConfig;

							public String getDataphinAttributeType() {
								return this.dataphinAttributeType;
							}

							public void setDataphinAttributeType(String dataphinAttributeType) {
								this.dataphinAttributeType = dataphinAttributeType;
							}

							public String getValueConstraint() {
								return this.valueConstraint;
							}

							public void setValueConstraint(String valueConstraint) {
								this.valueConstraint = valueConstraint;
							}

							public List<String> getValueList() {
								return this.valueList;
							}

							public void setValueList(List<String> valueList) {
								this.valueList = valueList;
							}

							public LookupTableReference getLookupTableReference() {
								return this.lookupTableReference;
							}

							public void setLookupTableReference(LookupTableReference lookupTableReference) {
								this.lookupTableReference = lookupTableReference;
							}

							public MinMaxValueConfig getMinMaxValueConfig() {
								return this.minMaxValueConfig;
							}

							public void setMinMaxValueConfig(MinMaxValueConfig minMaxValueConfig) {
								this.minMaxValueConfig = minMaxValueConfig;
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

							public static class MinMaxValueConfig {

								private Boolean includeMaxValue;

								private String minValue;

								private String maxValue;

								private Boolean includeMinValue;

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
							}
						}
					}

					public static class MonitorConfig {

						private String columnName;

						private String type;

						private Boolean isCaseSensitive;

						public String getColumnName() {
							return this.columnName;
						}

						public void setColumnName(String columnName) {
							this.columnName = columnName;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public Boolean getIsCaseSensitive() {
							return this.isCaseSensitive;
						}

						public void setIsCaseSensitive(Boolean isCaseSensitive) {
							this.isCaseSensitive = isCaseSensitive;
						}
					}
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

			public static class StandardSet {

				private Long id;

				private String code;

				private String name;

				private String directory;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
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

				public String getDirectory() {
					return this.directory;
				}

				public void setDirectory(String directory) {
					this.directory = directory;
				}
			}

			public static class StandardTemplate {

				private Integer version;

				private Long id;

				private String templateFrom;

				private String code;

				private String name;

				public Integer getVersion() {
					return this.version;
				}

				public void setVersion(Integer version) {
					this.version = version;
				}

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
			}

			public static class EffectiveTimeConfig {

				private String type;

				private String endTime;

				private String startTime;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

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
		}
	}

	@Override
	public ListStandardsResponse getInstance(UnmarshallerContext context) {
		return	ListStandardsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
