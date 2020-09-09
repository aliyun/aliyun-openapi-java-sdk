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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.ListDatasetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDatasetResponse extends AcsResponse {

	private String errorCode;

	private String errorDesc;

	private Boolean success;

	private String traceId;

	private String requestId;

	private List<DataItem> data;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String id;

		private String name;

		private Integer dataSetType;

		private String factTable;

		private String uniqueMappingType;

		private String uniqueFieldName;

		private Map<Object,Object> extMappingTypes;

		private String gmtCreate;

		private String gmtModified;

		private ExtRFM extRFM;

		private ExtBehavior extBehavior;

		private ExtLabel extLabel;

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

		public Integer getDataSetType() {
			return this.dataSetType;
		}

		public void setDataSetType(Integer dataSetType) {
			this.dataSetType = dataSetType;
		}

		public String getFactTable() {
			return this.factTable;
		}

		public void setFactTable(String factTable) {
			this.factTable = factTable;
		}

		public String getUniqueMappingType() {
			return this.uniqueMappingType;
		}

		public void setUniqueMappingType(String uniqueMappingType) {
			this.uniqueMappingType = uniqueMappingType;
		}

		public String getUniqueFieldName() {
			return this.uniqueFieldName;
		}

		public void setUniqueFieldName(String uniqueFieldName) {
			this.uniqueFieldName = uniqueFieldName;
		}

		public Map<Object,Object> getExtMappingTypes() {
			return this.extMappingTypes;
		}

		public void setExtMappingTypes(Map<Object,Object> extMappingTypes) {
			this.extMappingTypes = extMappingTypes;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public ExtRFM getExtRFM() {
			return this.extRFM;
		}

		public void setExtRFM(ExtRFM extRFM) {
			this.extRFM = extRFM;
		}

		public ExtBehavior getExtBehavior() {
			return this.extBehavior;
		}

		public void setExtBehavior(ExtBehavior extBehavior) {
			this.extBehavior = extBehavior;
		}

		public ExtLabel getExtLabel() {
			return this.extLabel;
		}

		public void setExtLabel(ExtLabel extLabel) {
			this.extLabel = extLabel;
		}

		public static class ExtRFM {

			private String tradeDateField;

			private String tradeFrequencyField;

			private String tradeMoneyField;

			private Integer tradeMoneyUnit;

			private String dataFromType;

			private Integer period;

			private Integer comparisonCalculateType;

			private String recencyScoreCompareValue;

			private String frequencyScoreCompareValue;

			private String monetaryScoreCompareValue;

			private List<RecencyScoreConfigItem> recencyScoreConfig;

			private List<FrequencyScoreConfigItem> frequencyScoreConfig;

			private List<MonetaryScoreConfigItem> monetaryScoreConfig;

			public String getTradeDateField() {
				return this.tradeDateField;
			}

			public void setTradeDateField(String tradeDateField) {
				this.tradeDateField = tradeDateField;
			}

			public String getTradeFrequencyField() {
				return this.tradeFrequencyField;
			}

			public void setTradeFrequencyField(String tradeFrequencyField) {
				this.tradeFrequencyField = tradeFrequencyField;
			}

			public String getTradeMoneyField() {
				return this.tradeMoneyField;
			}

			public void setTradeMoneyField(String tradeMoneyField) {
				this.tradeMoneyField = tradeMoneyField;
			}

			public Integer getTradeMoneyUnit() {
				return this.tradeMoneyUnit;
			}

			public void setTradeMoneyUnit(Integer tradeMoneyUnit) {
				this.tradeMoneyUnit = tradeMoneyUnit;
			}

			public String getDataFromType() {
				return this.dataFromType;
			}

			public void setDataFromType(String dataFromType) {
				this.dataFromType = dataFromType;
			}

			public Integer getPeriod() {
				return this.period;
			}

			public void setPeriod(Integer period) {
				this.period = period;
			}

			public Integer getComparisonCalculateType() {
				return this.comparisonCalculateType;
			}

			public void setComparisonCalculateType(Integer comparisonCalculateType) {
				this.comparisonCalculateType = comparisonCalculateType;
			}

			public String getRecencyScoreCompareValue() {
				return this.recencyScoreCompareValue;
			}

			public void setRecencyScoreCompareValue(String recencyScoreCompareValue) {
				this.recencyScoreCompareValue = recencyScoreCompareValue;
			}

			public String getFrequencyScoreCompareValue() {
				return this.frequencyScoreCompareValue;
			}

			public void setFrequencyScoreCompareValue(String frequencyScoreCompareValue) {
				this.frequencyScoreCompareValue = frequencyScoreCompareValue;
			}

			public String getMonetaryScoreCompareValue() {
				return this.monetaryScoreCompareValue;
			}

			public void setMonetaryScoreCompareValue(String monetaryScoreCompareValue) {
				this.monetaryScoreCompareValue = monetaryScoreCompareValue;
			}

			public List<RecencyScoreConfigItem> getRecencyScoreConfig() {
				return this.recencyScoreConfig;
			}

			public void setRecencyScoreConfig(List<RecencyScoreConfigItem> recencyScoreConfig) {
				this.recencyScoreConfig = recencyScoreConfig;
			}

			public List<FrequencyScoreConfigItem> getFrequencyScoreConfig() {
				return this.frequencyScoreConfig;
			}

			public void setFrequencyScoreConfig(List<FrequencyScoreConfigItem> frequencyScoreConfig) {
				this.frequencyScoreConfig = frequencyScoreConfig;
			}

			public List<MonetaryScoreConfigItem> getMonetaryScoreConfig() {
				return this.monetaryScoreConfig;
			}

			public void setMonetaryScoreConfig(List<MonetaryScoreConfigItem> monetaryScoreConfig) {
				this.monetaryScoreConfig = monetaryScoreConfig;
			}

			public static class RecencyScoreConfigItem {

				private Integer start;

				private Integer end;

				private Integer score;

				public Integer getStart() {
					return this.start;
				}

				public void setStart(Integer start) {
					this.start = start;
				}

				public Integer getEnd() {
					return this.end;
				}

				public void setEnd(Integer end) {
					this.end = end;
				}

				public Integer getScore() {
					return this.score;
				}

				public void setScore(Integer score) {
					this.score = score;
				}
			}

			public static class FrequencyScoreConfigItem {

				private Integer start;

				private Integer end;

				private Integer score;

				public Integer getStart() {
					return this.start;
				}

				public void setStart(Integer start) {
					this.start = start;
				}

				public Integer getEnd() {
					return this.end;
				}

				public void setEnd(Integer end) {
					this.end = end;
				}

				public Integer getScore() {
					return this.score;
				}

				public void setScore(Integer score) {
					this.score = score;
				}
			}

			public static class MonetaryScoreConfigItem {

				private String start;

				private String end;

				private String score;

				public String getStart() {
					return this.start;
				}

				public void setStart(String start) {
					this.start = start;
				}

				public String getEnd() {
					return this.end;
				}

				public void setEnd(String end) {
					this.end = end;
				}

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}
			}
		}

		public static class ExtBehavior {

			private String behaviorDateField;

			private String behaviorTypeField;

			private String behaviorObjectTypeField;

			private String behaviorObjectValueField;

			private String behaviorChannelField;

			private String behaviorCountsField;

			private String behaviorAmountsField;

			private String channelDimTableName;

			private String channelField;

			private String typeDimTableName;

			private String typeField;

			private Map<Object,Object> objectTypeContext;

			public String getBehaviorDateField() {
				return this.behaviorDateField;
			}

			public void setBehaviorDateField(String behaviorDateField) {
				this.behaviorDateField = behaviorDateField;
			}

			public String getBehaviorTypeField() {
				return this.behaviorTypeField;
			}

			public void setBehaviorTypeField(String behaviorTypeField) {
				this.behaviorTypeField = behaviorTypeField;
			}

			public String getBehaviorObjectTypeField() {
				return this.behaviorObjectTypeField;
			}

			public void setBehaviorObjectTypeField(String behaviorObjectTypeField) {
				this.behaviorObjectTypeField = behaviorObjectTypeField;
			}

			public String getBehaviorObjectValueField() {
				return this.behaviorObjectValueField;
			}

			public void setBehaviorObjectValueField(String behaviorObjectValueField) {
				this.behaviorObjectValueField = behaviorObjectValueField;
			}

			public String getBehaviorChannelField() {
				return this.behaviorChannelField;
			}

			public void setBehaviorChannelField(String behaviorChannelField) {
				this.behaviorChannelField = behaviorChannelField;
			}

			public String getBehaviorCountsField() {
				return this.behaviorCountsField;
			}

			public void setBehaviorCountsField(String behaviorCountsField) {
				this.behaviorCountsField = behaviorCountsField;
			}

			public String getBehaviorAmountsField() {
				return this.behaviorAmountsField;
			}

			public void setBehaviorAmountsField(String behaviorAmountsField) {
				this.behaviorAmountsField = behaviorAmountsField;
			}

			public String getChannelDimTableName() {
				return this.channelDimTableName;
			}

			public void setChannelDimTableName(String channelDimTableName) {
				this.channelDimTableName = channelDimTableName;
			}

			public String getChannelField() {
				return this.channelField;
			}

			public void setChannelField(String channelField) {
				this.channelField = channelField;
			}

			public String getTypeDimTableName() {
				return this.typeDimTableName;
			}

			public void setTypeDimTableName(String typeDimTableName) {
				this.typeDimTableName = typeDimTableName;
			}

			public String getTypeField() {
				return this.typeField;
			}

			public void setTypeField(String typeField) {
				this.typeField = typeField;
			}

			public Map<Object,Object> getObjectTypeContext() {
				return this.objectTypeContext;
			}

			public void setObjectTypeContext(Map<Object,Object> objectTypeContext) {
				this.objectTypeContext = objectTypeContext;
			}
		}

		public static class ExtLabel {

			private List<DatasetLabelListItem> datasetLabelList;

			public List<DatasetLabelListItem> getDatasetLabelList() {
				return this.datasetLabelList;
			}

			public void setDatasetLabelList(List<DatasetLabelListItem> datasetLabelList) {
				this.datasetLabelList = datasetLabelList;
			}

			public static class DatasetLabelListItem {

				private String columnName;

				private String tableName;

				private String columnAlias;

				private String colType;

				private String labelSeparator;

				private String remark;

				public String getColumnName() {
					return this.columnName;
				}

				public void setColumnName(String columnName) {
					this.columnName = columnName;
				}

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getColumnAlias() {
					return this.columnAlias;
				}

				public void setColumnAlias(String columnAlias) {
					this.columnAlias = columnAlias;
				}

				public String getColType() {
					return this.colType;
				}

				public void setColType(String colType) {
					this.colType = colType;
				}

				public String getLabelSeparator() {
					return this.labelSeparator;
				}

				public void setLabelSeparator(String labelSeparator) {
					this.labelSeparator = labelSeparator;
				}

				public String getRemark() {
					return this.remark;
				}

				public void setRemark(String remark) {
					this.remark = remark;
				}
			}
		}
	}

	@Override
	public ListDatasetResponse getInstance(UnmarshallerContext context) {
		return	ListDatasetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
