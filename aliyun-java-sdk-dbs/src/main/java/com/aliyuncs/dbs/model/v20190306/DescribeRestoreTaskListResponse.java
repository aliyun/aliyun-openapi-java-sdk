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

package com.aliyuncs.dbs.model.v20190306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeRestoreTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreTaskListResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Integer totalPages;

	private Integer pageSize;

	private Integer pageNum;

	private Integer totalElements;

	private List<RestoreTaskDetail> items;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

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

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public List<RestoreTaskDetail> getItems() {
		return this.items;
	}

	public void setItems(List<RestoreTaskDetail> items) {
		this.items = items;
	}

	public static class RestoreTaskDetail {

		private String backupPlanId;

		private String destinationEndpointInstanceType;

		private String destinationEndpointRegion;

		private String destinationEndpointInstanceID;

		private String destinationEndpointIpPort;

		private String destinationEndpointDatabaseName;

		private String destinationEndpointUserName;

		private String destinationEndpointOracleSID;

		private String restoreObjects;

		private Long backupGatewayId;

		private String restoreDir;

		private String restoreTaskName;

		private String backupSetId;

		private Long restoreTime;

		private Long restoreTaskCreateTime;

		private Long restoreTaskFinishTime;

		private String restoreStatus;

		private String restoreTaskId;

		private Integer fullStruforeRestoreProgress;

		private Integer fullDataRestoreProgress;

		private Integer continuousRestoreProgress;

		private Integer fullStruAfterRestoreProgress;

		private String errMessage;

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public String getDestinationEndpointInstanceType() {
			return this.destinationEndpointInstanceType;
		}

		public void setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
			this.destinationEndpointInstanceType = destinationEndpointInstanceType;
		}

		public String getDestinationEndpointRegion() {
			return this.destinationEndpointRegion;
		}

		public void setDestinationEndpointRegion(String destinationEndpointRegion) {
			this.destinationEndpointRegion = destinationEndpointRegion;
		}

		public String getDestinationEndpointInstanceID() {
			return this.destinationEndpointInstanceID;
		}

		public void setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
			this.destinationEndpointInstanceID = destinationEndpointInstanceID;
		}

		public String getDestinationEndpointIpPort() {
			return this.destinationEndpointIpPort;
		}

		public void setDestinationEndpointIpPort(String destinationEndpointIpPort) {
			this.destinationEndpointIpPort = destinationEndpointIpPort;
		}

		public String getDestinationEndpointDatabaseName() {
			return this.destinationEndpointDatabaseName;
		}

		public void setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
			this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
		}

		public String getDestinationEndpointUserName() {
			return this.destinationEndpointUserName;
		}

		public void setDestinationEndpointUserName(String destinationEndpointUserName) {
			this.destinationEndpointUserName = destinationEndpointUserName;
		}

		public String getDestinationEndpointOracleSID() {
			return this.destinationEndpointOracleSID;
		}

		public void setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
			this.destinationEndpointOracleSID = destinationEndpointOracleSID;
		}

		public String getRestoreObjects() {
			return this.restoreObjects;
		}

		public void setRestoreObjects(String restoreObjects) {
			this.restoreObjects = restoreObjects;
		}

		public Long getBackupGatewayId() {
			return this.backupGatewayId;
		}

		public void setBackupGatewayId(Long backupGatewayId) {
			this.backupGatewayId = backupGatewayId;
		}

		public String getRestoreDir() {
			return this.restoreDir;
		}

		public void setRestoreDir(String restoreDir) {
			this.restoreDir = restoreDir;
		}

		public String getRestoreTaskName() {
			return this.restoreTaskName;
		}

		public void setRestoreTaskName(String restoreTaskName) {
			this.restoreTaskName = restoreTaskName;
		}

		public String getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(String backupSetId) {
			this.backupSetId = backupSetId;
		}

		public Long getRestoreTime() {
			return this.restoreTime;
		}

		public void setRestoreTime(Long restoreTime) {
			this.restoreTime = restoreTime;
		}

		public Long getRestoreTaskCreateTime() {
			return this.restoreTaskCreateTime;
		}

		public void setRestoreTaskCreateTime(Long restoreTaskCreateTime) {
			this.restoreTaskCreateTime = restoreTaskCreateTime;
		}

		public Long getRestoreTaskFinishTime() {
			return this.restoreTaskFinishTime;
		}

		public void setRestoreTaskFinishTime(Long restoreTaskFinishTime) {
			this.restoreTaskFinishTime = restoreTaskFinishTime;
		}

		public String getRestoreStatus() {
			return this.restoreStatus;
		}

		public void setRestoreStatus(String restoreStatus) {
			this.restoreStatus = restoreStatus;
		}

		public String getRestoreTaskId() {
			return this.restoreTaskId;
		}

		public void setRestoreTaskId(String restoreTaskId) {
			this.restoreTaskId = restoreTaskId;
		}

		public Integer getFullStruforeRestoreProgress() {
			return this.fullStruforeRestoreProgress;
		}

		public void setFullStruforeRestoreProgress(Integer fullStruforeRestoreProgress) {
			this.fullStruforeRestoreProgress = fullStruforeRestoreProgress;
		}

		public Integer getFullDataRestoreProgress() {
			return this.fullDataRestoreProgress;
		}

		public void setFullDataRestoreProgress(Integer fullDataRestoreProgress) {
			this.fullDataRestoreProgress = fullDataRestoreProgress;
		}

		public Integer getContinuousRestoreProgress() {
			return this.continuousRestoreProgress;
		}

		public void setContinuousRestoreProgress(Integer continuousRestoreProgress) {
			this.continuousRestoreProgress = continuousRestoreProgress;
		}

		public Integer getFullStruAfterRestoreProgress() {
			return this.fullStruAfterRestoreProgress;
		}

		public void setFullStruAfterRestoreProgress(Integer fullStruAfterRestoreProgress) {
			this.fullStruAfterRestoreProgress = fullStruAfterRestoreProgress;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}
	}

	@Override
	public DescribeRestoreTaskListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreTaskListResponseUnmarshaller.unmarshall(this, context);
	}
}
