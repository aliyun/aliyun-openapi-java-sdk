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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.DescribeCloudbenchTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudbenchTaskResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dtsJobName;

		private String errorMessage;

		private String external;

		private String backupType;

		private String userId;

		private String dstType;

		private String ecsInstanceId;

		private String dstInstanceUuid;

		private String taskType;

		private String benchStep;

		private String version;

		private String endState;

		private String srcInstanceUuid;

		private String clientType;

		private String state;

		private String dstIp;

		private String srcPublicIp;

		private String backupId;

		private String sqlCompleteReuse;

		private Integer smartPressureTime;

		private Integer archiveState;

		private String status;

		private String workDir;

		private String archiveOssTableName;

		private String dtsJobId;

		private Integer dtsJobState;

		private Integer dstPort;

		private String dtsJobClass;

		private String clientGatewayId;

		private String description;

		private String errorCode;

		private String tableSchema;

		private String dtsJobStatus;

		private String srcInstanceArea;

		private String benchStepStatus;

		private String source;

		private String archiveJobId;

		private String topic;

		private Long requestDuration;

		private String taskId;

		private Long rate;

		public String getDtsJobName() {
			return this.dtsJobName;
		}

		public void setDtsJobName(String dtsJobName) {
			this.dtsJobName = dtsJobName;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getExternal() {
			return this.external;
		}

		public void setExternal(String external) {
			this.external = external;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getDstType() {
			return this.dstType;
		}

		public void setDstType(String dstType) {
			this.dstType = dstType;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getDstInstanceUuid() {
			return this.dstInstanceUuid;
		}

		public void setDstInstanceUuid(String dstInstanceUuid) {
			this.dstInstanceUuid = dstInstanceUuid;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getBenchStep() {
			return this.benchStep;
		}

		public void setBenchStep(String benchStep) {
			this.benchStep = benchStep;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getEndState() {
			return this.endState;
		}

		public void setEndState(String endState) {
			this.endState = endState;
		}

		public String getSrcInstanceUuid() {
			return this.srcInstanceUuid;
		}

		public void setSrcInstanceUuid(String srcInstanceUuid) {
			this.srcInstanceUuid = srcInstanceUuid;
		}

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getDstIp() {
			return this.dstIp;
		}

		public void setDstIp(String dstIp) {
			this.dstIp = dstIp;
		}

		public String getSrcPublicIp() {
			return this.srcPublicIp;
		}

		public void setSrcPublicIp(String srcPublicIp) {
			this.srcPublicIp = srcPublicIp;
		}

		public String getBackupId() {
			return this.backupId;
		}

		public void setBackupId(String backupId) {
			this.backupId = backupId;
		}

		public String getSqlCompleteReuse() {
			return this.sqlCompleteReuse;
		}

		public void setSqlCompleteReuse(String sqlCompleteReuse) {
			this.sqlCompleteReuse = sqlCompleteReuse;
		}

		public Integer getSmartPressureTime() {
			return this.smartPressureTime;
		}

		public void setSmartPressureTime(Integer smartPressureTime) {
			this.smartPressureTime = smartPressureTime;
		}

		public Integer getArchiveState() {
			return this.archiveState;
		}

		public void setArchiveState(Integer archiveState) {
			this.archiveState = archiveState;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getWorkDir() {
			return this.workDir;
		}

		public void setWorkDir(String workDir) {
			this.workDir = workDir;
		}

		public String getArchiveOssTableName() {
			return this.archiveOssTableName;
		}

		public void setArchiveOssTableName(String archiveOssTableName) {
			this.archiveOssTableName = archiveOssTableName;
		}

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
		}

		public Integer getDtsJobState() {
			return this.dtsJobState;
		}

		public void setDtsJobState(Integer dtsJobState) {
			this.dtsJobState = dtsJobState;
		}

		public Integer getDstPort() {
			return this.dstPort;
		}

		public void setDstPort(Integer dstPort) {
			this.dstPort = dstPort;
		}

		public String getDtsJobClass() {
			return this.dtsJobClass;
		}

		public void setDtsJobClass(String dtsJobClass) {
			this.dtsJobClass = dtsJobClass;
		}

		public String getClientGatewayId() {
			return this.clientGatewayId;
		}

		public void setClientGatewayId(String clientGatewayId) {
			this.clientGatewayId = clientGatewayId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getTableSchema() {
			return this.tableSchema;
		}

		public void setTableSchema(String tableSchema) {
			this.tableSchema = tableSchema;
		}

		public String getDtsJobStatus() {
			return this.dtsJobStatus;
		}

		public void setDtsJobStatus(String dtsJobStatus) {
			this.dtsJobStatus = dtsJobStatus;
		}

		public String getSrcInstanceArea() {
			return this.srcInstanceArea;
		}

		public void setSrcInstanceArea(String srcInstanceArea) {
			this.srcInstanceArea = srcInstanceArea;
		}

		public String getBenchStepStatus() {
			return this.benchStepStatus;
		}

		public void setBenchStepStatus(String benchStepStatus) {
			this.benchStepStatus = benchStepStatus;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getArchiveJobId() {
			return this.archiveJobId;
		}

		public void setArchiveJobId(String archiveJobId) {
			this.archiveJobId = archiveJobId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getRequestDuration() {
			return this.requestDuration;
		}

		public void setRequestDuration(Long requestDuration) {
			this.requestDuration = requestDuration;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Long getRate() {
			return this.rate;
		}

		public void setRate(Long rate) {
			this.rate = rate;
		}
	}

	@Override
	public DescribeCloudbenchTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudbenchTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
