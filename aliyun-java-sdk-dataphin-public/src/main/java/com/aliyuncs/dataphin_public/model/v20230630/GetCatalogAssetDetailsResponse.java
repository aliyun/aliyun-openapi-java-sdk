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
import com.aliyuncs.dataphin_public.transform.v20230630.GetCatalogAssetDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCatalogAssetDetailsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String guid;

		private String assetType;

		private Boolean isDeleted;

		private String assetName;

		private String assetDisplayName;

		private String assetFullName;

		private String maxSecurityLevel;

		private String assetDescription;

		private String assetFrom;

		private Long bizUnitId;

		private String bizUnitName;

		private Long projectId;

		private String projectName;

		private Long datasourceId;

		private String dataSourceName;

		private String subType;

		private String sumTableGuid;

		private String sumTableName;

		private String granularity;

		private String dataCellId;

		private String dataCellName;

		private Long apiId;

		private String apiGroupName;

		private String apiRequestMethod;

		private String apiCallMode;

		private String biCatalog;

		private Long chartCount;

		private Boolean isPartitionTable;

		private String partitionKey;

		private String primaryKey;

		private String tableLifeCycle;

		private Long tableSizeInBytes;

		private String createTime;

		private String modifyTime;

		private String lastDdlTime;

		private String lastDmlTime;

		private String lastOnShelveTime;

		private String firstOnShelveTime;

		private String shelveViewScopeType;

		private String profilingReportViewScopeType;

		private Long readCount;

		private Long collectionCount;

		private String assetDetailUrl;

		private String instruction;

		private List<Directorie> directories;

		private List<CustomAttribute> customAttributes;

		private List<SimpleNodeInfo> simpleNodeInfos;

		private List<Column> columns;

		private List<String> assetTags;

		private List<String> maintainUserIds;

		private List<String> maintainUserGroups;

		private List<String> shelveViewScopeUserIds;

		private List<String> shelveViewScopeUserGroups;

		private List<String> profilingReportViewScopeUserIds;

		private List<String> profilingReportViewScopeUserGroups;

		private Owner1 owner1;

		private LastOnShelveUser lastOnShelveUser;

		private FirstOnShelveUser firstOnShelveUser;

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getAssetName() {
			return this.assetName;
		}

		public void setAssetName(String assetName) {
			this.assetName = assetName;
		}

		public String getAssetDisplayName() {
			return this.assetDisplayName;
		}

		public void setAssetDisplayName(String assetDisplayName) {
			this.assetDisplayName = assetDisplayName;
		}

		public String getAssetFullName() {
			return this.assetFullName;
		}

		public void setAssetFullName(String assetFullName) {
			this.assetFullName = assetFullName;
		}

		public String getMaxSecurityLevel() {
			return this.maxSecurityLevel;
		}

		public void setMaxSecurityLevel(String maxSecurityLevel) {
			this.maxSecurityLevel = maxSecurityLevel;
		}

		public String getAssetDescription() {
			return this.assetDescription;
		}

		public void setAssetDescription(String assetDescription) {
			this.assetDescription = assetDescription;
		}

		public String getAssetFrom() {
			return this.assetFrom;
		}

		public void setAssetFrom(String assetFrom) {
			this.assetFrom = assetFrom;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public String getBizUnitName() {
			return this.bizUnitName;
		}

		public void setBizUnitName(String bizUnitName) {
			this.bizUnitName = bizUnitName;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Long getDatasourceId() {
			return this.datasourceId;
		}

		public void setDatasourceId(Long datasourceId) {
			this.datasourceId = datasourceId;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getSubType() {
			return this.subType;
		}

		public void setSubType(String subType) {
			this.subType = subType;
		}

		public String getSumTableGuid() {
			return this.sumTableGuid;
		}

		public void setSumTableGuid(String sumTableGuid) {
			this.sumTableGuid = sumTableGuid;
		}

		public String getSumTableName() {
			return this.sumTableName;
		}

		public void setSumTableName(String sumTableName) {
			this.sumTableName = sumTableName;
		}

		public String getGranularity() {
			return this.granularity;
		}

		public void setGranularity(String granularity) {
			this.granularity = granularity;
		}

		public String getDataCellId() {
			return this.dataCellId;
		}

		public void setDataCellId(String dataCellId) {
			this.dataCellId = dataCellId;
		}

		public String getDataCellName() {
			return this.dataCellName;
		}

		public void setDataCellName(String dataCellName) {
			this.dataCellName = dataCellName;
		}

		public Long getApiId() {
			return this.apiId;
		}

		public void setApiId(Long apiId) {
			this.apiId = apiId;
		}

		public String getApiGroupName() {
			return this.apiGroupName;
		}

		public void setApiGroupName(String apiGroupName) {
			this.apiGroupName = apiGroupName;
		}

		public String getApiRequestMethod() {
			return this.apiRequestMethod;
		}

		public void setApiRequestMethod(String apiRequestMethod) {
			this.apiRequestMethod = apiRequestMethod;
		}

		public String getApiCallMode() {
			return this.apiCallMode;
		}

		public void setApiCallMode(String apiCallMode) {
			this.apiCallMode = apiCallMode;
		}

		public String getBiCatalog() {
			return this.biCatalog;
		}

		public void setBiCatalog(String biCatalog) {
			this.biCatalog = biCatalog;
		}

		public Long getChartCount() {
			return this.chartCount;
		}

		public void setChartCount(Long chartCount) {
			this.chartCount = chartCount;
		}

		public Boolean getIsPartitionTable() {
			return this.isPartitionTable;
		}

		public void setIsPartitionTable(Boolean isPartitionTable) {
			this.isPartitionTable = isPartitionTable;
		}

		public String getPartitionKey() {
			return this.partitionKey;
		}

		public void setPartitionKey(String partitionKey) {
			this.partitionKey = partitionKey;
		}

		public String getPrimaryKey() {
			return this.primaryKey;
		}

		public void setPrimaryKey(String primaryKey) {
			this.primaryKey = primaryKey;
		}

		public String getTableLifeCycle() {
			return this.tableLifeCycle;
		}

		public void setTableLifeCycle(String tableLifeCycle) {
			this.tableLifeCycle = tableLifeCycle;
		}

		public Long getTableSizeInBytes() {
			return this.tableSizeInBytes;
		}

		public void setTableSizeInBytes(Long tableSizeInBytes) {
			this.tableSizeInBytes = tableSizeInBytes;
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

		public String getLastDdlTime() {
			return this.lastDdlTime;
		}

		public void setLastDdlTime(String lastDdlTime) {
			this.lastDdlTime = lastDdlTime;
		}

		public String getLastDmlTime() {
			return this.lastDmlTime;
		}

		public void setLastDmlTime(String lastDmlTime) {
			this.lastDmlTime = lastDmlTime;
		}

		public String getLastOnShelveTime() {
			return this.lastOnShelveTime;
		}

		public void setLastOnShelveTime(String lastOnShelveTime) {
			this.lastOnShelveTime = lastOnShelveTime;
		}

		public String getFirstOnShelveTime() {
			return this.firstOnShelveTime;
		}

		public void setFirstOnShelveTime(String firstOnShelveTime) {
			this.firstOnShelveTime = firstOnShelveTime;
		}

		public String getShelveViewScopeType() {
			return this.shelveViewScopeType;
		}

		public void setShelveViewScopeType(String shelveViewScopeType) {
			this.shelveViewScopeType = shelveViewScopeType;
		}

		public String getProfilingReportViewScopeType() {
			return this.profilingReportViewScopeType;
		}

		public void setProfilingReportViewScopeType(String profilingReportViewScopeType) {
			this.profilingReportViewScopeType = profilingReportViewScopeType;
		}

		public Long getReadCount() {
			return this.readCount;
		}

		public void setReadCount(Long readCount) {
			this.readCount = readCount;
		}

		public Long getCollectionCount() {
			return this.collectionCount;
		}

		public void setCollectionCount(Long collectionCount) {
			this.collectionCount = collectionCount;
		}

		public String getAssetDetailUrl() {
			return this.assetDetailUrl;
		}

		public void setAssetDetailUrl(String assetDetailUrl) {
			this.assetDetailUrl = assetDetailUrl;
		}

		public String getInstruction() {
			return this.instruction;
		}

		public void setInstruction(String instruction) {
			this.instruction = instruction;
		}

		public List<Directorie> getDirectories() {
			return this.directories;
		}

		public void setDirectories(List<Directorie> directories) {
			this.directories = directories;
		}

		public List<CustomAttribute> getCustomAttributes() {
			return this.customAttributes;
		}

		public void setCustomAttributes(List<CustomAttribute> customAttributes) {
			this.customAttributes = customAttributes;
		}

		public List<SimpleNodeInfo> getSimpleNodeInfos() {
			return this.simpleNodeInfos;
		}

		public void setSimpleNodeInfos(List<SimpleNodeInfo> simpleNodeInfos) {
			this.simpleNodeInfos = simpleNodeInfos;
		}

		public List<Column> getColumns() {
			return this.columns;
		}

		public void setColumns(List<Column> columns) {
			this.columns = columns;
		}

		public List<String> getAssetTags() {
			return this.assetTags;
		}

		public void setAssetTags(List<String> assetTags) {
			this.assetTags = assetTags;
		}

		public List<String> getMaintainUserIds() {
			return this.maintainUserIds;
		}

		public void setMaintainUserIds(List<String> maintainUserIds) {
			this.maintainUserIds = maintainUserIds;
		}

		public List<String> getMaintainUserGroups() {
			return this.maintainUserGroups;
		}

		public void setMaintainUserGroups(List<String> maintainUserGroups) {
			this.maintainUserGroups = maintainUserGroups;
		}

		public List<String> getShelveViewScopeUserIds() {
			return this.shelveViewScopeUserIds;
		}

		public void setShelveViewScopeUserIds(List<String> shelveViewScopeUserIds) {
			this.shelveViewScopeUserIds = shelveViewScopeUserIds;
		}

		public List<String> getShelveViewScopeUserGroups() {
			return this.shelveViewScopeUserGroups;
		}

		public void setShelveViewScopeUserGroups(List<String> shelveViewScopeUserGroups) {
			this.shelveViewScopeUserGroups = shelveViewScopeUserGroups;
		}

		public List<String> getProfilingReportViewScopeUserIds() {
			return this.profilingReportViewScopeUserIds;
		}

		public void setProfilingReportViewScopeUserIds(List<String> profilingReportViewScopeUserIds) {
			this.profilingReportViewScopeUserIds = profilingReportViewScopeUserIds;
		}

		public List<String> getProfilingReportViewScopeUserGroups() {
			return this.profilingReportViewScopeUserGroups;
		}

		public void setProfilingReportViewScopeUserGroups(List<String> profilingReportViewScopeUserGroups) {
			this.profilingReportViewScopeUserGroups = profilingReportViewScopeUserGroups;
		}

		public Owner1 getOwner1() {
			return this.owner1;
		}

		public void setOwner1(Owner1 owner1) {
			this.owner1 = owner1;
		}

		public LastOnShelveUser getLastOnShelveUser() {
			return this.lastOnShelveUser;
		}

		public void setLastOnShelveUser(LastOnShelveUser lastOnShelveUser) {
			this.lastOnShelveUser = lastOnShelveUser;
		}

		public FirstOnShelveUser getFirstOnShelveUser() {
			return this.firstOnShelveUser;
		}

		public void setFirstOnShelveUser(FirstOnShelveUser firstOnShelveUser) {
			this.firstOnShelveUser = firstOnShelveUser;
		}

		public static class Directorie {

			private Long topicId;

			private String topicName;

			private Long directoryId;

			private String directoryName;

			public Long getTopicId() {
				return this.topicId;
			}

			public void setTopicId(Long topicId) {
				this.topicId = topicId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}

			public Long getDirectoryId() {
				return this.directoryId;
			}

			public void setDirectoryId(Long directoryId) {
				this.directoryId = directoryId;
			}

			public String getDirectoryName() {
				return this.directoryName;
			}

			public void setDirectoryName(String directoryName) {
				this.directoryName = directoryName;
			}
		}

		public static class CustomAttribute {

			private String code;

			private String name;

			private String value;

			private String attrType;

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

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getAttrType() {
				return this.attrType;
			}

			public void setAttrType(String attrType) {
				this.attrType = attrType;
			}
		}

		public static class SimpleNodeInfo {

			private String nodeId;

			private String subBizType;

			private String nodeName;

			private String bizUnit;

			private String nodeScheduleType;

			private String env;

			private List<Owner> owners;

			private Project project;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getSubBizType() {
				return this.subBizType;
			}

			public void setSubBizType(String subBizType) {
				this.subBizType = subBizType;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getBizUnit() {
				return this.bizUnit;
			}

			public void setBizUnit(String bizUnit) {
				this.bizUnit = bizUnit;
			}

			public String getNodeScheduleType() {
				return this.nodeScheduleType;
			}

			public void setNodeScheduleType(String nodeScheduleType) {
				this.nodeScheduleType = nodeScheduleType;
			}

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}

			public List<Owner> getOwners() {
				return this.owners;
			}

			public void setOwners(List<Owner> owners) {
				this.owners = owners;
			}

			public Project getProject() {
				return this.project;
			}

			public void setProject(Project project) {
				this.project = project;
			}

			public static class Owner {

				private String userId;

				private String displayName;

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}
			}

			public static class Project {

				private String projectId;

				private String projectName;

				public String getProjectId() {
					return this.projectId;
				}

				public void setProjectId(String projectId) {
					this.projectId = projectId;
				}

				public String getProjectName() {
					return this.projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
				}
			}
		}

		public static class Column {

			private String guid;

			private String name;

			private String displayName;

			private String description;

			private String dataType;

			private String bizType;

			private Double qualityScore;

			private String classifyName;

			private String levelShortName;

			private List<Standard> standards;

			private AssociatedEntity associatedEntity;

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public Double getQualityScore() {
				return this.qualityScore;
			}

			public void setQualityScore(Double qualityScore) {
				this.qualityScore = qualityScore;
			}

			public String getClassifyName() {
				return this.classifyName;
			}

			public void setClassifyName(String classifyName) {
				this.classifyName = classifyName;
			}

			public String getLevelShortName() {
				return this.levelShortName;
			}

			public void setLevelShortName(String levelShortName) {
				this.levelShortName = levelShortName;
			}

			public List<Standard> getStandards() {
				return this.standards;
			}

			public void setStandards(List<Standard> standards) {
				this.standards = standards;
			}

			public AssociatedEntity getAssociatedEntity() {
				return this.associatedEntity;
			}

			public void setAssociatedEntity(AssociatedEntity associatedEntity) {
				this.associatedEntity = associatedEntity;
			}

			public static class Standard {

				private Long id;

				private String name;

				private String code;

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
			}

			public static class AssociatedEntity {

				private Long bizUnitId;

				private String bizUnitName;

				private Long dimensionId;

				private String dimensionName;

				private String dimensionDisplayName;

				public Long getBizUnitId() {
					return this.bizUnitId;
				}

				public void setBizUnitId(Long bizUnitId) {
					this.bizUnitId = bizUnitId;
				}

				public String getBizUnitName() {
					return this.bizUnitName;
				}

				public void setBizUnitName(String bizUnitName) {
					this.bizUnitName = bizUnitName;
				}

				public Long getDimensionId() {
					return this.dimensionId;
				}

				public void setDimensionId(Long dimensionId) {
					this.dimensionId = dimensionId;
				}

				public String getDimensionName() {
					return this.dimensionName;
				}

				public void setDimensionName(String dimensionName) {
					this.dimensionName = dimensionName;
				}

				public String getDimensionDisplayName() {
					return this.dimensionDisplayName;
				}

				public void setDimensionDisplayName(String dimensionDisplayName) {
					this.dimensionDisplayName = dimensionDisplayName;
				}
			}
		}

		public static class Owner1 {

			private String userId;

			private String displayName;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}

		public static class LastOnShelveUser {

			private String userId;

			private String displayName;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}

		public static class FirstOnShelveUser {

			private String userId;

			private String displayName;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}
	}

	@Override
	public GetCatalogAssetDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetCatalogAssetDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
