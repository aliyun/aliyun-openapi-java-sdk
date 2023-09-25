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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetIDEEventDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIDEEventDetailResponse extends AcsResponse {

	private String requestId;

	private EventDetail eventDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EventDetail getEventDetail() {
		return this.eventDetail;
	}

	public void setEventDetail(EventDetail eventDetail) {
		this.eventDetail = eventDetail;
	}

	public static class EventDetail {

		private FileExecutionCommand fileExecutionCommand;

		private DeletedFile deletedFile;

		private CommittedFile committedFile;

		private TableModel tableModel;

		public FileExecutionCommand getFileExecutionCommand() {
			return this.fileExecutionCommand;
		}

		public void setFileExecutionCommand(FileExecutionCommand fileExecutionCommand) {
			this.fileExecutionCommand = fileExecutionCommand;
		}

		public DeletedFile getDeletedFile() {
			return this.deletedFile;
		}

		public void setDeletedFile(DeletedFile deletedFile) {
			this.deletedFile = deletedFile;
		}

		public CommittedFile getCommittedFile() {
			return this.committedFile;
		}

		public void setCommittedFile(CommittedFile committedFile) {
			this.committedFile = committedFile;
		}

		public TableModel getTableModel() {
			return this.tableModel;
		}

		public void setTableModel(TableModel tableModel) {
			this.tableModel = tableModel;
		}

		public static class FileExecutionCommand {

			private Long fileId;

			private String dataSourceName;

			private String content;

			private Long fileType;

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}

			public String getDataSourceName() {
				return this.dataSourceName;
			}

			public void setDataSourceName(String dataSourceName) {
				this.dataSourceName = dataSourceName;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Long getFileType() {
				return this.fileType;
			}

			public void setFileType(Long fileType) {
				this.fileType = fileType;
			}
		}

		public static class DeletedFile {

			private String owner;

			private Long fileType;

			private Long currentVersion;

			private Long businessId;

			private String fileName;

			private String dataSourceName;

			private String useType;

			private String folderId;

			private Long parentFileId;

			private String content;

			private Long nodeId;

			private Long fileId;

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getFileType() {
				return this.fileType;
			}

			public void setFileType(Long fileType) {
				this.fileType = fileType;
			}

			public Long getCurrentVersion() {
				return this.currentVersion;
			}

			public void setCurrentVersion(Long currentVersion) {
				this.currentVersion = currentVersion;
			}

			public Long getBusinessId() {
				return this.businessId;
			}

			public void setBusinessId(Long businessId) {
				this.businessId = businessId;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getDataSourceName() {
				return this.dataSourceName;
			}

			public void setDataSourceName(String dataSourceName) {
				this.dataSourceName = dataSourceName;
			}

			public String getUseType() {
				return this.useType;
			}

			public void setUseType(String useType) {
				this.useType = useType;
			}

			public String getFolderId() {
				return this.folderId;
			}

			public void setFolderId(String folderId) {
				this.folderId = folderId;
			}

			public Long getParentFileId() {
				return this.parentFileId;
			}

			public void setParentFileId(Long parentFileId) {
				this.parentFileId = parentFileId;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}
		}

		public static class CommittedFile {

			private Long fileId;

			private String content;

			private String committor;

			private Long fileType;

			private String changeType;

			private String fileName;

			private Long nodeId;

			private String comment;

			private String useType;

			private FilePropertyContent filePropertyContent;

			private NodeConfiguration nodeConfiguration;

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getCommittor() {
				return this.committor;
			}

			public void setCommittor(String committor) {
				this.committor = committor;
			}

			public Long getFileType() {
				return this.fileType;
			}

			public void setFileType(Long fileType) {
				this.fileType = fileType;
			}

			public String getChangeType() {
				return this.changeType;
			}

			public void setChangeType(String changeType) {
				this.changeType = changeType;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getUseType() {
				return this.useType;
			}

			public void setUseType(String useType) {
				this.useType = useType;
			}

			public FilePropertyContent getFilePropertyContent() {
				return this.filePropertyContent;
			}

			public void setFilePropertyContent(FilePropertyContent filePropertyContent) {
				this.filePropertyContent = filePropertyContent;
			}

			public NodeConfiguration getNodeConfiguration() {
				return this.nodeConfiguration;
			}

			public void setNodeConfiguration(NodeConfiguration nodeConfiguration) {
				this.nodeConfiguration = nodeConfiguration;
			}

			public static class FilePropertyContent {

				private String dataSourceName;

				private Long parentFileId;

				private Long businessId;

				private Long currentVersion;

				private String owner;

				private String folderId;

				public String getDataSourceName() {
					return this.dataSourceName;
				}

				public void setDataSourceName(String dataSourceName) {
					this.dataSourceName = dataSourceName;
				}

				public Long getParentFileId() {
					return this.parentFileId;
				}

				public void setParentFileId(Long parentFileId) {
					this.parentFileId = parentFileId;
				}

				public Long getBusinessId() {
					return this.businessId;
				}

				public void setBusinessId(Long businessId) {
					this.businessId = businessId;
				}

				public Long getCurrentVersion() {
					return this.currentVersion;
				}

				public void setCurrentVersion(Long currentVersion) {
					this.currentVersion = currentVersion;
				}

				public String getOwner() {
					return this.owner;
				}

				public void setOwner(String owner) {
					this.owner = owner;
				}

				public String getFolderId() {
					return this.folderId;
				}

				public void setFolderId(String folderId) {
					this.folderId = folderId;
				}
			}

			public static class NodeConfiguration {

				private String rerunMode;

				private String schedulerType;

				private String paraValue;

				private String cycleType;

				private String dependentNodeIdList;

				private Long resourceGroupId;

				private Long autoRerunTimes;

				private Long autoRerunIntervalMillis;

				private String cronExpress;

				private String dependentType;

				private List<Input> inputList;

				private List<Output> outputList;

				public String getRerunMode() {
					return this.rerunMode;
				}

				public void setRerunMode(String rerunMode) {
					this.rerunMode = rerunMode;
				}

				public String getSchedulerType() {
					return this.schedulerType;
				}

				public void setSchedulerType(String schedulerType) {
					this.schedulerType = schedulerType;
				}

				public String getParaValue() {
					return this.paraValue;
				}

				public void setParaValue(String paraValue) {
					this.paraValue = paraValue;
				}

				public String getCycleType() {
					return this.cycleType;
				}

				public void setCycleType(String cycleType) {
					this.cycleType = cycleType;
				}

				public String getDependentNodeIdList() {
					return this.dependentNodeIdList;
				}

				public void setDependentNodeIdList(String dependentNodeIdList) {
					this.dependentNodeIdList = dependentNodeIdList;
				}

				public Long getResourceGroupId() {
					return this.resourceGroupId;
				}

				public void setResourceGroupId(Long resourceGroupId) {
					this.resourceGroupId = resourceGroupId;
				}

				public Long getAutoRerunTimes() {
					return this.autoRerunTimes;
				}

				public void setAutoRerunTimes(Long autoRerunTimes) {
					this.autoRerunTimes = autoRerunTimes;
				}

				public Long getAutoRerunIntervalMillis() {
					return this.autoRerunIntervalMillis;
				}

				public void setAutoRerunIntervalMillis(Long autoRerunIntervalMillis) {
					this.autoRerunIntervalMillis = autoRerunIntervalMillis;
				}

				public String getCronExpress() {
					return this.cronExpress;
				}

				public void setCronExpress(String cronExpress) {
					this.cronExpress = cronExpress;
				}

				public String getDependentType() {
					return this.dependentType;
				}

				public void setDependentType(String dependentType) {
					this.dependentType = dependentType;
				}

				public List<Input> getInputList() {
					return this.inputList;
				}

				public void setInputList(List<Input> inputList) {
					this.inputList = inputList;
				}

				public List<Output> getOutputList() {
					return this.outputList;
				}

				public void setOutputList(List<Output> outputList) {
					this.outputList = outputList;
				}

				public static class Input {

					private String input;

					private String parseType;

					public String getInput() {
						return this.input;
					}

					public void setInput(String input) {
						this.input = input;
					}

					public String getParseType() {
						return this.parseType;
					}

					public void setParseType(String parseType) {
						this.parseType = parseType;
					}
				}

				public static class Output {

					private String refTableName;

					private String output;

					public String getRefTableName() {
						return this.refTableName;
					}

					public void setRefTableName(String refTableName) {
						this.refTableName = refTableName;
					}

					public String getOutput() {
						return this.output;
					}

					public void setOutput(String output) {
						this.output = output;
					}
				}
			}
		}

		public static class TableModel {

			private String env;

			private Long lifeCycle;

			private String tableName;

			private String dataSourceName;

			private String comment;

			private String location;

			private List<Column> columns;

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}

			public Long getLifeCycle() {
				return this.lifeCycle;
			}

			public void setLifeCycle(Long lifeCycle) {
				this.lifeCycle = lifeCycle;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getDataSourceName() {
				return this.dataSourceName;
			}

			public void setDataSourceName(String dataSourceName) {
				this.dataSourceName = dataSourceName;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public List<Column> getColumns() {
				return this.columns;
			}

			public void setColumns(List<Column> columns) {
				this.columns = columns;
			}

			public static class Column {

				private String columnName;

				private String columnType;

				private Boolean isPartitionColumn;

				private String comment;

				public String getColumnName() {
					return this.columnName;
				}

				public void setColumnName(String columnName) {
					this.columnName = columnName;
				}

				public String getColumnType() {
					return this.columnType;
				}

				public void setColumnType(String columnType) {
					this.columnType = columnType;
				}

				public Boolean getIsPartitionColumn() {
					return this.isPartitionColumn;
				}

				public void setIsPartitionColumn(Boolean isPartitionColumn) {
					this.isPartitionColumn = isPartitionColumn;
				}

				public String getComment() {
					return this.comment;
				}

				public void setComment(String comment) {
					this.comment = comment;
				}
			}
		}
	}

	@Override
	public GetIDEEventDetailResponse getInstance(UnmarshallerContext context) {
		return	GetIDEEventDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
