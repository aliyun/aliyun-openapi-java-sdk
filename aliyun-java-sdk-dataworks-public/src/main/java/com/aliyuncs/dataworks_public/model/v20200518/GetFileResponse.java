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
import com.aliyuncs.dataworks_public.transform.v20200518.GetFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFileResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private File file;

		private NodeConfiguration nodeConfiguration;

		public File getFile() {
			return this.file;
		}

		public void setFile(File file) {
			this.file = file;
		}

		public NodeConfiguration getNodeConfiguration() {
			return this.nodeConfiguration;
		}

		public void setNodeConfiguration(NodeConfiguration nodeConfiguration) {
			this.nodeConfiguration = nodeConfiguration;
		}

		public static class File {

			private Integer commitStatus;

			private Boolean autoParsing;

			private String owner;

			private Long createTime;

			private Integer fileType;

			private Integer currentVersion;

			private Long bizId;

			private String lastEditUser;

			private String fileName;

			private String connectionName;

			private String useType;

			private String fileFolderId;

			private Long parentId;

			private String createUser;

			private Boolean isMaxCompute;

			private Long businessId;

			private String fileDescription;

			private String deletedStatus;

			private Long lastEditTime;

			private String content;

			private Long nodeId;

			private String advancedSettings;

			public Integer getCommitStatus() {
				return this.commitStatus;
			}

			public void setCommitStatus(Integer commitStatus) {
				this.commitStatus = commitStatus;
			}

			public Boolean getAutoParsing() {
				return this.autoParsing;
			}

			public void setAutoParsing(Boolean autoParsing) {
				this.autoParsing = autoParsing;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Integer getFileType() {
				return this.fileType;
			}

			public void setFileType(Integer fileType) {
				this.fileType = fileType;
			}

			public Integer getCurrentVersion() {
				return this.currentVersion;
			}

			public void setCurrentVersion(Integer currentVersion) {
				this.currentVersion = currentVersion;
			}

			public Long getBizId() {
				return this.bizId;
			}

			public void setBizId(Long bizId) {
				this.bizId = bizId;
			}

			public String getLastEditUser() {
				return this.lastEditUser;
			}

			public void setLastEditUser(String lastEditUser) {
				this.lastEditUser = lastEditUser;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getConnectionName() {
				return this.connectionName;
			}

			public void setConnectionName(String connectionName) {
				this.connectionName = connectionName;
			}

			public String getUseType() {
				return this.useType;
			}

			public void setUseType(String useType) {
				this.useType = useType;
			}

			public String getFileFolderId() {
				return this.fileFolderId;
			}

			public void setFileFolderId(String fileFolderId) {
				this.fileFolderId = fileFolderId;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}

			public Boolean getIsMaxCompute() {
				return this.isMaxCompute;
			}

			public void setIsMaxCompute(Boolean isMaxCompute) {
				this.isMaxCompute = isMaxCompute;
			}

			public Long getBusinessId() {
				return this.businessId;
			}

			public void setBusinessId(Long businessId) {
				this.businessId = businessId;
			}

			public String getFileDescription() {
				return this.fileDescription;
			}

			public void setFileDescription(String fileDescription) {
				this.fileDescription = fileDescription;
			}

			public String getDeletedStatus() {
				return this.deletedStatus;
			}

			public void setDeletedStatus(String deletedStatus) {
				this.deletedStatus = deletedStatus;
			}

			public Long getLastEditTime() {
				return this.lastEditTime;
			}

			public void setLastEditTime(Long lastEditTime) {
				this.lastEditTime = lastEditTime;
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

			public String getAdvancedSettings() {
				return this.advancedSettings;
			}

			public void setAdvancedSettings(String advancedSettings) {
				this.advancedSettings = advancedSettings;
			}
		}

		public static class NodeConfiguration {

			private String rerunMode;

			private String schedulerType;

			private Boolean stop;

			private String paraValue;

			private Long startEffectDate;

			private Long endEffectDate;

			private String cycleType;

			private String dependentNodeIdList;

			private Long resourceGroupId;

			private String dependentType;

			private Integer autoRerunTimes;

			private Integer autoRerunIntervalMillis;

			private String cronExpress;

			private Boolean startImmediately;

			private List<NodeInputOutput> inputList;

			private List<NodeInputOutput1> outputList;

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

			public Boolean getStop() {
				return this.stop;
			}

			public void setStop(Boolean stop) {
				this.stop = stop;
			}

			public String getParaValue() {
				return this.paraValue;
			}

			public void setParaValue(String paraValue) {
				this.paraValue = paraValue;
			}

			public Long getStartEffectDate() {
				return this.startEffectDate;
			}

			public void setStartEffectDate(Long startEffectDate) {
				this.startEffectDate = startEffectDate;
			}

			public Long getEndEffectDate() {
				return this.endEffectDate;
			}

			public void setEndEffectDate(Long endEffectDate) {
				this.endEffectDate = endEffectDate;
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

			public String getDependentType() {
				return this.dependentType;
			}

			public void setDependentType(String dependentType) {
				this.dependentType = dependentType;
			}

			public Integer getAutoRerunTimes() {
				return this.autoRerunTimes;
			}

			public void setAutoRerunTimes(Integer autoRerunTimes) {
				this.autoRerunTimes = autoRerunTimes;
			}

			public Integer getAutoRerunIntervalMillis() {
				return this.autoRerunIntervalMillis;
			}

			public void setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
				this.autoRerunIntervalMillis = autoRerunIntervalMillis;
			}

			public String getCronExpress() {
				return this.cronExpress;
			}

			public void setCronExpress(String cronExpress) {
				this.cronExpress = cronExpress;
			}

			public Boolean getStartImmediately() {
				return this.startImmediately;
			}

			public void setStartImmediately(Boolean startImmediately) {
				this.startImmediately = startImmediately;
			}

			public List<NodeInputOutput> getInputList() {
				return this.inputList;
			}

			public void setInputList(List<NodeInputOutput> inputList) {
				this.inputList = inputList;
			}

			public List<NodeInputOutput1> getOutputList() {
				return this.outputList;
			}

			public void setOutputList(List<NodeInputOutput1> outputList) {
				this.outputList = outputList;
			}

			public static class NodeInputOutput {

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

			public static class NodeInputOutput1 {

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

	@Override
	public GetFileResponse getInstance(UnmarshallerContext context) {
		return	GetFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
