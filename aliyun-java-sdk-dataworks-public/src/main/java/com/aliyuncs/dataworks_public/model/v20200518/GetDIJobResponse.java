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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetDIJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDIJobResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long projectId;

		private Long dIJobId;

		private String jobName;

		private String description;

		private String migrationType;

		private String sourceDataSourceType;

		private String destinationDataSourceType;

		private Long createdTime;

		private String createdUid;

		private Long updatedTime;

		private String updatedUid;

		private Long startedTime;

		private String startedUid;

		private String jobStatus;

		private String errorMessage;

		private Map<Object,Object> runStats;

		private List<SourceDataSourceSetting> sourceDataSourceSettings;

		private List<DestinationDataSourceSetting> destinationDataSourceSettings;

		private List<TransformationRule> transformationRules;

		private List<TableMapping> tableMappings;

		private ResourceSettings resourceSettings;

		private JobSettings jobSettings;

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getDIJobId() {
			return this.dIJobId;
		}

		public void setDIJobId(Long dIJobId) {
			this.dIJobId = dIJobId;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMigrationType() {
			return this.migrationType;
		}

		public void setMigrationType(String migrationType) {
			this.migrationType = migrationType;
		}

		public String getSourceDataSourceType() {
			return this.sourceDataSourceType;
		}

		public void setSourceDataSourceType(String sourceDataSourceType) {
			this.sourceDataSourceType = sourceDataSourceType;
		}

		public String getDestinationDataSourceType() {
			return this.destinationDataSourceType;
		}

		public void setDestinationDataSourceType(String destinationDataSourceType) {
			this.destinationDataSourceType = destinationDataSourceType;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getCreatedUid() {
			return this.createdUid;
		}

		public void setCreatedUid(String createdUid) {
			this.createdUid = createdUid;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getUpdatedUid() {
			return this.updatedUid;
		}

		public void setUpdatedUid(String updatedUid) {
			this.updatedUid = updatedUid;
		}

		public Long getStartedTime() {
			return this.startedTime;
		}

		public void setStartedTime(Long startedTime) {
			this.startedTime = startedTime;
		}

		public String getStartedUid() {
			return this.startedUid;
		}

		public void setStartedUid(String startedUid) {
			this.startedUid = startedUid;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Map<Object,Object> getRunStats() {
			return this.runStats;
		}

		public void setRunStats(Map<Object,Object> runStats) {
			this.runStats = runStats;
		}

		public List<SourceDataSourceSetting> getSourceDataSourceSettings() {
			return this.sourceDataSourceSettings;
		}

		public void setSourceDataSourceSettings(List<SourceDataSourceSetting> sourceDataSourceSettings) {
			this.sourceDataSourceSettings = sourceDataSourceSettings;
		}

		public List<DestinationDataSourceSetting> getDestinationDataSourceSettings() {
			return this.destinationDataSourceSettings;
		}

		public void setDestinationDataSourceSettings(List<DestinationDataSourceSetting> destinationDataSourceSettings) {
			this.destinationDataSourceSettings = destinationDataSourceSettings;
		}

		public List<TransformationRule> getTransformationRules() {
			return this.transformationRules;
		}

		public void setTransformationRules(List<TransformationRule> transformationRules) {
			this.transformationRules = transformationRules;
		}

		public List<TableMapping> getTableMappings() {
			return this.tableMappings;
		}

		public void setTableMappings(List<TableMapping> tableMappings) {
			this.tableMappings = tableMappings;
		}

		public ResourceSettings getResourceSettings() {
			return this.resourceSettings;
		}

		public void setResourceSettings(ResourceSettings resourceSettings) {
			this.resourceSettings = resourceSettings;
		}

		public JobSettings getJobSettings() {
			return this.jobSettings;
		}

		public void setJobSettings(JobSettings jobSettings) {
			this.jobSettings = jobSettings;
		}

		public static class SourceDataSourceSetting {

			private String dataSourceName;

			private Map<Object,Object> dataSourceProperties;

			public String getDataSourceName() {
				return this.dataSourceName;
			}

			public void setDataSourceName(String dataSourceName) {
				this.dataSourceName = dataSourceName;
			}

			public Map<Object,Object> getDataSourceProperties() {
				return this.dataSourceProperties;
			}

			public void setDataSourceProperties(Map<Object,Object> dataSourceProperties) {
				this.dataSourceProperties = dataSourceProperties;
			}
		}

		public static class DestinationDataSourceSetting {

			private String dataSourceName;

			private Map<Object,Object> dataSourceProperties;

			public String getDataSourceName() {
				return this.dataSourceName;
			}

			public void setDataSourceName(String dataSourceName) {
				this.dataSourceName = dataSourceName;
			}

			public Map<Object,Object> getDataSourceProperties() {
				return this.dataSourceProperties;
			}

			public void setDataSourceProperties(Map<Object,Object> dataSourceProperties) {
				this.dataSourceProperties = dataSourceProperties;
			}
		}

		public static class TransformationRule {

			private String ruleActionType;

			private String ruleExpression;

			private String ruleName;

			private String ruleTargetType;

			public String getRuleActionType() {
				return this.ruleActionType;
			}

			public void setRuleActionType(String ruleActionType) {
				this.ruleActionType = ruleActionType;
			}

			public String getRuleExpression() {
				return this.ruleExpression;
			}

			public void setRuleExpression(String ruleExpression) {
				this.ruleExpression = ruleExpression;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getRuleTargetType() {
				return this.ruleTargetType;
			}

			public void setRuleTargetType(String ruleTargetType) {
				this.ruleTargetType = ruleTargetType;
			}
		}

		public static class TableMapping {

			private List<SourceObjectSelectionRule> sourceObjectSelectionRules;

			private List<TransformationRule2> transformationRules1;

			public List<SourceObjectSelectionRule> getSourceObjectSelectionRules() {
				return this.sourceObjectSelectionRules;
			}

			public void setSourceObjectSelectionRules(List<SourceObjectSelectionRule> sourceObjectSelectionRules) {
				this.sourceObjectSelectionRules = sourceObjectSelectionRules;
			}

			public List<TransformationRule2> getTransformationRules1() {
				return this.transformationRules1;
			}

			public void setTransformationRules1(List<TransformationRule2> transformationRules1) {
				this.transformationRules1 = transformationRules1;
			}

			public static class SourceObjectSelectionRule {

				private String expression;

				private String objectType;

				public String getExpression() {
					return this.expression;
				}

				public void setExpression(String expression) {
					this.expression = expression;
				}

				public String getObjectType() {
					return this.objectType;
				}

				public void setObjectType(String objectType) {
					this.objectType = objectType;
				}
			}

			public static class TransformationRule2 {

				private String ruleActionType;

				private String ruleName;

				private String ruleTargetType;

				public String getRuleActionType() {
					return this.ruleActionType;
				}

				public void setRuleActionType(String ruleActionType) {
					this.ruleActionType = ruleActionType;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public String getRuleTargetType() {
					return this.ruleTargetType;
				}

				public void setRuleTargetType(String ruleTargetType) {
					this.ruleTargetType = ruleTargetType;
				}
			}
		}

		public static class ResourceSettings {

			private OfflineResourceSettings offlineResourceSettings;

			private RealtimeResourceSettings realtimeResourceSettings;

			public OfflineResourceSettings getOfflineResourceSettings() {
				return this.offlineResourceSettings;
			}

			public void setOfflineResourceSettings(OfflineResourceSettings offlineResourceSettings) {
				this.offlineResourceSettings = offlineResourceSettings;
			}

			public RealtimeResourceSettings getRealtimeResourceSettings() {
				return this.realtimeResourceSettings;
			}

			public void setRealtimeResourceSettings(RealtimeResourceSettings realtimeResourceSettings) {
				this.realtimeResourceSettings = realtimeResourceSettings;
			}

			public static class OfflineResourceSettings {

				private String resourceGroupIdentifier;

				public String getResourceGroupIdentifier() {
					return this.resourceGroupIdentifier;
				}

				public void setResourceGroupIdentifier(String resourceGroupIdentifier) {
					this.resourceGroupIdentifier = resourceGroupIdentifier;
				}
			}

			public static class RealtimeResourceSettings {

				private String resourceGroupIdentifier;

				public String getResourceGroupIdentifier() {
					return this.resourceGroupIdentifier;
				}

				public void setResourceGroupIdentifier(String resourceGroupIdentifier) {
					this.resourceGroupIdentifier = resourceGroupIdentifier;
				}
			}
		}

		public static class JobSettings {

			private List<ColumnDataTypeSetting> columnDataTypeSettings;

			private List<DdlHandlingSetting> ddlHandlingSettings;

			private List<RuntimeSetting> runtimeSettings;

			public List<ColumnDataTypeSetting> getColumnDataTypeSettings() {
				return this.columnDataTypeSettings;
			}

			public void setColumnDataTypeSettings(List<ColumnDataTypeSetting> columnDataTypeSettings) {
				this.columnDataTypeSettings = columnDataTypeSettings;
			}

			public List<DdlHandlingSetting> getDdlHandlingSettings() {
				return this.ddlHandlingSettings;
			}

			public void setDdlHandlingSettings(List<DdlHandlingSetting> ddlHandlingSettings) {
				this.ddlHandlingSettings = ddlHandlingSettings;
			}

			public List<RuntimeSetting> getRuntimeSettings() {
				return this.runtimeSettings;
			}

			public void setRuntimeSettings(List<RuntimeSetting> runtimeSettings) {
				this.runtimeSettings = runtimeSettings;
			}

			public static class ColumnDataTypeSetting {

				private String sourceDataType;

				private String destinationDataType;

				public String getSourceDataType() {
					return this.sourceDataType;
				}

				public void setSourceDataType(String sourceDataType) {
					this.sourceDataType = sourceDataType;
				}

				public String getDestinationDataType() {
					return this.destinationDataType;
				}

				public void setDestinationDataType(String destinationDataType) {
					this.destinationDataType = destinationDataType;
				}
			}

			public static class DdlHandlingSetting {

				private String action;

				private String type;

				public String getAction() {
					return this.action;
				}

				public void setAction(String action) {
					this.action = action;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class RuntimeSetting {

				private String name;

				private String value;

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
		}
	}

	@Override
	public GetDIJobResponse getInstance(UnmarshallerContext context) {
		return	GetDIJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
