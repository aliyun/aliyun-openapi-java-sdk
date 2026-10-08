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
import com.aliyuncs.dataphin_public.transform.v20230630.GetTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableResponse extends AcsResponse {

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

		private Long lifeCycle;

		private String owner;

		private Boolean isPartitionTable;

		private Long tableSizeInBytes;

		private String projectName;

		private String guid;

		private String creator;

		private String env;

		private String name;

		private Long dataDomainId;

		private Long bizUnitId;

		private Long securityLevel;

		private String displayName;

		private String lastDmlTime;

		private String bizUnitName;

		private Boolean isBasicMode;

		private String comment;

		private String storageType;

		private String lastDdlTime;

		private String createTime;

		private String lastQueryTime;

		private String parentModelId;

		private Long projectId;

		private Long visitCount30d;

		private String securityLevelName;

		private String dataDomainName;

		private String fileId;

		private Long dataSourceId;

		private String securityLevelAbbreviation;

		private List<StreamTableConfigItem> streamTableConfig;

		private List<Instruction> instructions;

		private List<SimpleNodeInfo> simpleNodeInfos;

		private List<String> assetTags;

		private List<String> nodeIds;

		public Long getLifeCycle() {
			return this.lifeCycle;
		}

		public void setLifeCycle(Long lifeCycle) {
			this.lifeCycle = lifeCycle;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Boolean getIsPartitionTable() {
			return this.isPartitionTable;
		}

		public void setIsPartitionTable(Boolean isPartitionTable) {
			this.isPartitionTable = isPartitionTable;
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

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getDataDomainId() {
			return this.dataDomainId;
		}

		public void setDataDomainId(Long dataDomainId) {
			this.dataDomainId = dataDomainId;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public Long getSecurityLevel() {
			return this.securityLevel;
		}

		public void setSecurityLevel(Long securityLevel) {
			this.securityLevel = securityLevel;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getLastDmlTime() {
			return this.lastDmlTime;
		}

		public void setLastDmlTime(String lastDmlTime) {
			this.lastDmlTime = lastDmlTime;
		}

		public String getBizUnitName() {
			return this.bizUnitName;
		}

		public void setBizUnitName(String bizUnitName) {
			this.bizUnitName = bizUnitName;
		}

		public Boolean getIsBasicMode() {
			return this.isBasicMode;
		}

		public void setIsBasicMode(Boolean isBasicMode) {
			this.isBasicMode = isBasicMode;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getLastDdlTime() {
			return this.lastDdlTime;
		}

		public void setLastDdlTime(String lastDdlTime) {
			this.lastDdlTime = lastDdlTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLastQueryTime() {
			return this.lastQueryTime;
		}

		public void setLastQueryTime(String lastQueryTime) {
			this.lastQueryTime = lastQueryTime;
		}

		public String getParentModelId() {
			return this.parentModelId;
		}

		public void setParentModelId(String parentModelId) {
			this.parentModelId = parentModelId;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getVisitCount30d() {
			return this.visitCount30d;
		}

		public void setVisitCount30d(Long visitCount30d) {
			this.visitCount30d = visitCount30d;
		}

		public String getSecurityLevelName() {
			return this.securityLevelName;
		}

		public void setSecurityLevelName(String securityLevelName) {
			this.securityLevelName = securityLevelName;
		}

		public String getDataDomainName() {
			return this.dataDomainName;
		}

		public void setDataDomainName(String dataDomainName) {
			this.dataDomainName = dataDomainName;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public Long getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Long dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getSecurityLevelAbbreviation() {
			return this.securityLevelAbbreviation;
		}

		public void setSecurityLevelAbbreviation(String securityLevelAbbreviation) {
			this.securityLevelAbbreviation = securityLevelAbbreviation;
		}

		public List<StreamTableConfigItem> getStreamTableConfig() {
			return this.streamTableConfig;
		}

		public void setStreamTableConfig(List<StreamTableConfigItem> streamTableConfig) {
			this.streamTableConfig = streamTableConfig;
		}

		public List<Instruction> getInstructions() {
			return this.instructions;
		}

		public void setInstructions(List<Instruction> instructions) {
			this.instructions = instructions;
		}

		public List<SimpleNodeInfo> getSimpleNodeInfos() {
			return this.simpleNodeInfos;
		}

		public void setSimpleNodeInfos(List<SimpleNodeInfo> simpleNodeInfos) {
			this.simpleNodeInfos = simpleNodeInfos;
		}

		public List<String> getAssetTags() {
			return this.assetTags;
		}

		public void setAssetTags(List<String> assetTags) {
			this.assetTags = assetTags;
		}

		public List<String> getNodeIds() {
			return this.nodeIds;
		}

		public void setNodeIds(List<String> nodeIds) {
			this.nodeIds = nodeIds;
		}

		public static class StreamTableConfigItem {

			private String value;

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

		public static class Instruction {

			private String gmtCreate;

			private String ownerId;

			private String content;

			private String gmtModified;

			private String title;

			private String ownerNickName;

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getOwnerNickName() {
				return this.ownerNickName;
			}

			public void setOwnerNickName(String ownerNickName) {
				this.ownerNickName = ownerNickName;
			}
		}

		public static class SimpleNodeInfo {

			private String nodeName;

			private String nodeId;

			private String nodeScheduleType;

			private String env;

			private String subBizType;

			private List<Owner> owners;

			private BizUnit bizUnit;

			private Project project;

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

			public BizUnit getBizUnit() {
				return this.bizUnit;
			}

			public void setBizUnit(BizUnit bizUnit) {
				this.bizUnit = bizUnit;
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

			public static class BizUnit {

				private String bizUnitId;

				private String bizUnitDisplayName;

				private String bizUnitName;

				public String getBizUnitId() {
					return this.bizUnitId;
				}

				public void setBizUnitId(String bizUnitId) {
					this.bizUnitId = bizUnitId;
				}

				public String getBizUnitDisplayName() {
					return this.bizUnitDisplayName;
				}

				public void setBizUnitDisplayName(String bizUnitDisplayName) {
					this.bizUnitDisplayName = bizUnitDisplayName;
				}

				public String getBizUnitName() {
					return this.bizUnitName;
				}

				public void setBizUnitName(String bizUnitName) {
					this.bizUnitName = bizUnitName;
				}
			}

			public static class Project {

				private String projectDisplayName;

				private String projectName;

				private String projectId;

				public String getProjectDisplayName() {
					return this.projectDisplayName;
				}

				public void setProjectDisplayName(String projectDisplayName) {
					this.projectDisplayName = projectDisplayName;
				}

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
	}

	@Override
	public GetTableResponse getInstance(UnmarshallerContext context) {
		return	GetTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
