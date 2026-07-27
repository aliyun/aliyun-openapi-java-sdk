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

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String apiGroupName;

		private String assetDescription;

		private String guid;

		private String instruction;

		private Long bizUnitId;

		private String lastDmlTime;

		private Boolean isDeleted;

		private String subType;

		private String lastDdlTime;

		private String assetName;

		private String tableLifeCycle;

		private String partitionKey;

		private String assetDetailUrl;

		private String modifyTime;

		private String sumTableName;

		private String lastOnShelveTime;

		private Long datasourceId;

		private String apiRequestMethod;

		private Boolean isPartitionTable;

		private String dataCellName;

		private Long tableSizeInBytes;

		private String projectName;

		private String sumTableGuid;

		private Long chartCount;

		private String primaryKey;

		private Long collectionCount;

		private String assetFrom;

		private String granularity;

		private String dataCellId;

		private String maxSecurityLevel;

		private String bizUnitName;

		private String assetFullName;

		private String shelveViewScopeType;

		private String biCatalog;

		private String createTime;

		private Long projectId;

		private String apiCallMode;

		private String assetType;

		private String dataSourceName;

		private String profilingReportViewScopeType;

		private String assetDisplayName;

		private Long apiId;

		private String firstOnShelveTime;

		private Long readCount;

		private List<CustomAttribute> customAttributes;

		private List<Directorie> directories;

		private List<Column> columns;

		private List<SimpleNodeInfo> simpleNodeInfos;

		private List<String> profilingReportViewScopeUserIds;

		private List<String> maintainUserIds;

		private List<String> maintainUserGroups;

		private List<String> profilingReportViewScopeUserGroups;

		private List<String> shelveViewScopeUserGroups;

		private List<String> assetTags;

		private List<String> shelveViewScopeUserIds;

		private Owner1 owner1;

		private LastOnShelveUser lastOnShelveUser;

		private FirstOnShelveUser firstOnShelveUser;

		public String getApiGroupName() {
			return this.apiGroupName;
		}

		public void setApiGroupName(String apiGroupName) {
			this.apiGroupName = apiGroupName;
		}

		public String getAssetDescription() {
			return this.assetDescription;
		}

		public void setAssetDescription(String assetDescription) {
			this.assetDescription = assetDescription;
		}

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public String getInstruction() {
			return this.instruction;
		}

		public void setInstruction(String instruction) {
			this.instruction = instruction;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public String getLastDmlTime() {
			return this.lastDmlTime;
		}

		public void setLastDmlTime(String lastDmlTime) {
			this.lastDmlTime = lastDmlTime;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getSubType() {
			return this.subType;
		}

		public void setSubType(String subType) {
			this.subType = subType;
		}

		public String getLastDdlTime() {
			return this.lastDdlTime;
		}

		public void setLastDdlTime(String lastDdlTime) {
			this.lastDdlTime = lastDdlTime;
		}

		public String getAssetName() {
			return this.assetName;
		}

		public void setAssetName(String assetName) {
			this.assetName = assetName;
		}

		public String getTableLifeCycle() {
			return this.tableLifeCycle;
		}

		public void setTableLifeCycle(String tableLifeCycle) {
			this.tableLifeCycle = tableLifeCycle;
		}

		public String getPartitionKey() {
			return this.partitionKey;
		}

		public void setPartitionKey(String partitionKey) {
			this.partitionKey = partitionKey;
		}

		public String getAssetDetailUrl() {
			return this.assetDetailUrl;
		}

		public void setAssetDetailUrl(String assetDetailUrl) {
			this.assetDetailUrl = assetDetailUrl;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getSumTableName() {
			return this.sumTableName;
		}

		public void setSumTableName(String sumTableName) {
			this.sumTableName = sumTableName;
		}

		public String getLastOnShelveTime() {
			return this.lastOnShelveTime;
		}

		public void setLastOnShelveTime(String lastOnShelveTime) {
			this.lastOnShelveTime = lastOnShelveTime;
		}

		public Long getDatasourceId() {
			return this.datasourceId;
		}

		public void setDatasourceId(Long datasourceId) {
			this.datasourceId = datasourceId;
		}

		public String getApiRequestMethod() {
			return this.apiRequestMethod;
		}

		public void setApiRequestMethod(String apiRequestMethod) {
			this.apiRequestMethod = apiRequestMethod;
		}

		public Boolean getIsPartitionTable() {
			return this.isPartitionTable;
		}

		public void setIsPartitionTable(Boolean isPartitionTable) {
			this.isPartitionTable = isPartitionTable;
		}

		public String getDataCellName() {
			return this.dataCellName;
		}

		public void setDataCellName(String dataCellName) {
			this.dataCellName = dataCellName;
		}

		public Long getTableSizeInBytes() {
			return this.tableSizeInBytes;
		}

		public void setTableSizeInBytes(Long tableSizeInBytes) {
			this.tableSizeInBytes = tableSizeInBytes;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getSumTableGuid() {
			return this.sumTableGuid;
		}

		public void setSumTableGuid(String sumTableGuid) {
			this.sumTableGuid = sumTableGuid;
		}

		public Long getChartCount() {
			return this.chartCount;
		}

		public void setChartCount(Long chartCount) {
			this.chartCount = chartCount;
		}

		public String getPrimaryKey() {
			return this.primaryKey;
		}

		public void setPrimaryKey(String primaryKey) {
			this.primaryKey = primaryKey;
		}

		public Long getCollectionCount() {
			return this.collectionCount;
		}

		public void setCollectionCount(Long collectionCount) {
			this.collectionCount = collectionCount;
		}

		public String getAssetFrom() {
			return this.assetFrom;
		}

		public void setAssetFrom(String assetFrom) {
			this.assetFrom = assetFrom;
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

		public String getMaxSecurityLevel() {
			return this.maxSecurityLevel;
		}

		public void setMaxSecurityLevel(String maxSecurityLevel) {
			this.maxSecurityLevel = maxSecurityLevel;
		}

		public String getBizUnitName() {
			return this.bizUnitName;
		}

		public void setBizUnitName(String bizUnitName) {
			this.bizUnitName = bizUnitName;
		}

		public String getAssetFullName() {
			return this.assetFullName;
		}

		public void setAssetFullName(String assetFullName) {
			this.assetFullName = assetFullName;
		}

		public String getShelveViewScopeType() {
			return this.shelveViewScopeType;
		}

		public void setShelveViewScopeType(String shelveViewScopeType) {
			this.shelveViewScopeType = shelveViewScopeType;
		}

		public String getBiCatalog() {
			return this.biCatalog;
		}

		public void setBiCatalog(String biCatalog) {
			this.biCatalog = biCatalog;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getApiCallMode() {
			return this.apiCallMode;
		}

		public void setApiCallMode(String apiCallMode) {
			this.apiCallMode = apiCallMode;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getProfilingReportViewScopeType() {
			return this.profilingReportViewScopeType;
		}

		public void setProfilingReportViewScopeType(String profilingReportViewScopeType) {
			this.profilingReportViewScopeType = profilingReportViewScopeType;
		}

		public String getAssetDisplayName() {
			return this.assetDisplayName;
		}

		public void setAssetDisplayName(String assetDisplayName) {
			this.assetDisplayName = assetDisplayName;
		}

		public Long getApiId() {
			return this.apiId;
		}

		public void setApiId(Long apiId) {
			this.apiId = apiId;
		}

		public String getFirstOnShelveTime() {
			return this.firstOnShelveTime;
		}

		public void setFirstOnShelveTime(String firstOnShelveTime) {
			this.firstOnShelveTime = firstOnShelveTime;
		}

		public Long getReadCount() {
			return this.readCount;
		}

		public void setReadCount(Long readCount) {
			this.readCount = readCount;
		}

		public List<CustomAttribute> getCustomAttributes() {
			return this.customAttributes;
		}

		public void setCustomAttributes(List<CustomAttribute> customAttributes) {
			this.customAttributes = customAttributes;
		}

		public List<Directorie> getDirectories() {
			return this.directories;
		}

		public void setDirectories(List<Directorie> directories) {
			this.directories = directories;
		}

		public List<Column> getColumns() {
			return this.columns;
		}

		public void setColumns(List<Column> columns) {
			this.columns = columns;
		}

		public List<SimpleNodeInfo> getSimpleNodeInfos() {
			return this.simpleNodeInfos;
		}

		public void setSimpleNodeInfos(List<SimpleNodeInfo> simpleNodeInfos) {
			this.simpleNodeInfos = simpleNodeInfos;
		}

		public List<String> getProfilingReportViewScopeUserIds() {
			return this.profilingReportViewScopeUserIds;
		}

		public void setProfilingReportViewScopeUserIds(List<String> profilingReportViewScopeUserIds) {
			this.profilingReportViewScopeUserIds = profilingReportViewScopeUserIds;
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

		public List<String> getProfilingReportViewScopeUserGroups() {
			return this.profilingReportViewScopeUserGroups;
		}

		public void setProfilingReportViewScopeUserGroups(List<String> profilingReportViewScopeUserGroups) {
			this.profilingReportViewScopeUserGroups = profilingReportViewScopeUserGroups;
		}

		public List<String> getShelveViewScopeUserGroups() {
			return this.shelveViewScopeUserGroups;
		}

		public void setShelveViewScopeUserGroups(List<String> shelveViewScopeUserGroups) {
			this.shelveViewScopeUserGroups = shelveViewScopeUserGroups;
		}

		public List<String> getAssetTags() {
			return this.assetTags;
		}

		public void setAssetTags(List<String> assetTags) {
			this.assetTags = assetTags;
		}

		public List<String> getShelveViewScopeUserIds() {
			return this.shelveViewScopeUserIds;
		}

		public void setShelveViewScopeUserIds(List<String> shelveViewScopeUserIds) {
			this.shelveViewScopeUserIds = shelveViewScopeUserIds;
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

		public static class CustomAttribute {

			private String attrType;

			private String value;

			private String code;

			private String name;

			public String getAttrType() {
				return this.attrType;
			}

			public void setAttrType(String attrType) {
				this.attrType = attrType;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
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

		public static class Directorie {

			private Long directoryId;

			private Long topicId;

			private String directoryName;

			private String topicName;

			public Long getDirectoryId() {
				return this.directoryId;
			}

			public void setDirectoryId(Long directoryId) {
				this.directoryId = directoryId;
			}

			public Long getTopicId() {
				return this.topicId;
			}

			public void setTopicId(Long topicId) {
				this.topicId = topicId;
			}

			public String getDirectoryName() {
				return this.directoryName;
			}

			public void setDirectoryName(String directoryName) {
				this.directoryName = directoryName;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}

		public static class Column {

			private String classifyName;

			private String description;

			private Double qualityScore;

			private String displayName;

			private String dataType;

			private String bizType;

			private String guid;

			private String levelShortName;

			private String name;

			private List<Standard> standards;

			private AssociatedEntity associatedEntity;

			public String getClassifyName() {
				return this.classifyName;
			}

			public void setClassifyName(String classifyName) {
				this.classifyName = classifyName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Double getQualityScore() {
				return this.qualityScore;
			}

			public void setQualityScore(Double qualityScore) {
				this.qualityScore = qualityScore;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
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

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getLevelShortName() {
				return this.levelShortName;
			}

			public void setLevelShortName(String levelShortName) {
				this.levelShortName = levelShortName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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

				private String code;

				private String name;

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
			}

			public static class AssociatedEntity {

				private Long bizUnitId;

				private String dimensionDisplayName;

				private String bizUnitName;

				private Long dimensionId;

				private String dimensionName;

				public Long getBizUnitId() {
					return this.bizUnitId;
				}

				public void setBizUnitId(Long bizUnitId) {
					this.bizUnitId = bizUnitId;
				}

				public String getDimensionDisplayName() {
					return this.dimensionDisplayName;
				}

				public void setDimensionDisplayName(String dimensionDisplayName) {
					this.dimensionDisplayName = dimensionDisplayName;
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
			}
		}

		public static class SimpleNodeInfo {

			private String bizUnit;

			private String nodeName;

			private String nodeId;

			private String nodeScheduleType;

			private String env;

			private String subBizType;

			private List<Owner> owners;

			private Project project;

			public String getBizUnit() {
				return this.bizUnit;
			}

			public void setBizUnit(String bizUnit) {
				this.bizUnit = bizUnit;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
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

			public String getSubBizType() {
				return this.subBizType;
			}

			public void setSubBizType(String subBizType) {
				this.subBizType = subBizType;
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

				private String projectName;

				private String projectId;

				public String getProjectName() {
					return this.projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
				}

				public String getProjectId() {
					return this.projectId;
				}

				public void setProjectId(String projectId) {
					this.projectId = projectId;
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
