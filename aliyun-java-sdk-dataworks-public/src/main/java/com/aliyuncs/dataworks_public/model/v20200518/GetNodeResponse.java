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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

		private String schedulerType;

		private Long repeatInterval;

		private String repeatability;

		private Integer repeatMode;

		private Long projectId;

		private String programType;

		private Integer priority;

		private String ownerId;

		private String connection;

		private String paramValues;

		private Long relatedFlowId;

		private Integer dqcType;

		private Long baselineId;

		private String description;

		private String nodeName;

		private String resGroupName;

		private Long businessId;

		private String dqcDescription;

		private String cronExpress;

		private Long nodeId;

		private String resGroupIdentifier;

		private Integer fileType;

		private Long fileId;

		private Integer fileVersion;

		private Long deployDate;

		private Long createTime;

		private Long modifyTime;

		public String getSchedulerType() {
			return this.schedulerType;
		}

		public void setSchedulerType(String schedulerType) {
			this.schedulerType = schedulerType;
		}

		public Long getRepeatInterval() {
			return this.repeatInterval;
		}

		public void setRepeatInterval(Long repeatInterval) {
			this.repeatInterval = repeatInterval;
		}

		public String getRepeatability() {
			return this.repeatability;
		}

		public void setRepeatability(String repeatability) {
			this.repeatability = repeatability;
		}

		public Integer getRepeatMode() {
			return this.repeatMode;
		}

		public void setRepeatMode(Integer repeatMode) {
			this.repeatMode = repeatMode;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getProgramType() {
			return this.programType;
		}

		public void setProgramType(String programType) {
			this.programType = programType;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getConnection() {
			return this.connection;
		}

		public void setConnection(String connection) {
			this.connection = connection;
		}

		public String getParamValues() {
			return this.paramValues;
		}

		public void setParamValues(String paramValues) {
			this.paramValues = paramValues;
		}

		public Long getRelatedFlowId() {
			return this.relatedFlowId;
		}

		public void setRelatedFlowId(Long relatedFlowId) {
			this.relatedFlowId = relatedFlowId;
		}

		public Integer getDqcType() {
			return this.dqcType;
		}

		public void setDqcType(Integer dqcType) {
			this.dqcType = dqcType;
		}

		public Long getBaselineId() {
			return this.baselineId;
		}

		public void setBaselineId(Long baselineId) {
			this.baselineId = baselineId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getResGroupName() {
			return this.resGroupName;
		}

		public void setResGroupName(String resGroupName) {
			this.resGroupName = resGroupName;
		}

		public Long getBusinessId() {
			return this.businessId;
		}

		public void setBusinessId(Long businessId) {
			this.businessId = businessId;
		}

		public String getDqcDescription() {
			return this.dqcDescription;
		}

		public void setDqcDescription(String dqcDescription) {
			this.dqcDescription = dqcDescription;
		}

		public String getCronExpress() {
			return this.cronExpress;
		}

		public void setCronExpress(String cronExpress) {
			this.cronExpress = cronExpress;
		}

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}

		public String getResGroupIdentifier() {
			return this.resGroupIdentifier;
		}

		public void setResGroupIdentifier(String resGroupIdentifier) {
			this.resGroupIdentifier = resGroupIdentifier;
		}

		public Integer getFileType() {
			return this.fileType;
		}

		public void setFileType(Integer fileType) {
			this.fileType = fileType;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public Integer getFileVersion() {
			return this.fileVersion;
		}

		public void setFileVersion(Integer fileVersion) {
			this.fileVersion = fileVersion;
		}

		public Long getDeployDate() {
			return this.deployDate;
		}

		public void setDeployDate(Long deployDate) {
			this.deployDate = deployDate;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public GetNodeResponse getInstance(UnmarshallerContext context) {
		return	GetNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
