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

	private Integer httpStatusCode;

	private Integer pageNum;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private Integer totalPages;

	private Integer totalElements;

	private Integer pageSize;

	private List<RestoreTaskDetail> items;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<RestoreTaskDetail> getItems() {
		return this.items;
	}

	public void setItems(List<RestoreTaskDetail> items) {
		this.items = items;
	}

	public static class RestoreTaskDetail {

		private String restoreStatus;

		private Integer fullStruAfterRestoreProgress;

		private String crossRoleName;

		private String restoreDir;

		private String crossAliyunId;

		private String restoreObjects;

		private String backupPlanId;

		private String destinationEndpointRegion;

		private Long restoreTaskCreateTime;

		private String destinationEndpointUserName;

		private Long restoreTaskFinishTime;

		private String destinationEndpointIpPort;

		private String destinationEndpointDatabaseName;

		private String destinationEndpointInstanceType;

		private String destinationEndpointOracleSID;

		private Integer fullStruforeRestoreProgress;

		private String errMessage;

		private String restoreTaskId;

		private Integer fullDataRestoreProgress;

		private Integer continuousRestoreProgress;

		private String destinationEndpointInstanceID;

		private String backupSetId;

		private Long backupGatewayId;

		private String restoreTaskName;

		private Long restoreTime;

		public String getRestoreStatus() {
			return this.restoreStatus;
		}

		public void setRestoreStatus(String restoreStatus) {
			this.restoreStatus = restoreStatus;
		}

		public Integer getFullStruAfterRestoreProgress() {
			return this.fullStruAfterRestoreProgress;
		}

		public void setFullStruAfterRestoreProgress(Integer fullStruAfterRestoreProgress) {
			this.fullStruAfterRestoreProgress = fullStruAfterRestoreProgress;
		}

		public String getCrossRoleName() {
			return this.crossRoleName;
		}

		public void setCrossRoleName(String crossRoleName) {
			this.crossRoleName = crossRoleName;
		}

		public String getRestoreDir() {
			return this.restoreDir;
		}

		public void setRestoreDir(String restoreDir) {
			this.restoreDir = restoreDir;
		}

		public String getCrossAliyunId() {
			return this.crossAliyunId;
		}

		public void setCrossAliyunId(String crossAliyunId) {
			this.crossAliyunId = crossAliyunId;
		}

		public String getRestoreObjects() {
			return this.restoreObjects;
		}

		public void setRestoreObjects(String restoreObjects) {
			this.restoreObjects = restoreObjects;
		}

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public String getDestinationEndpointRegion() {
			return this.destinationEndpointRegion;
		}

		public void setDestinationEndpointRegion(String destinationEndpointRegion) {
			this.destinationEndpointRegion = destinationEndpointRegion;
		}

		public Long getRestoreTaskCreateTime() {
			return this.restoreTaskCreateTime;
		}

		public void setRestoreTaskCreateTime(Long restoreTaskCreateTime) {
			this.restoreTaskCreateTime = restoreTaskCreateTime;
		}

		public String getDestinationEndpointUserName() {
			return this.destinationEndpointUserName;
		}

		public void setDestinationEndpointUserName(String destinationEndpointUserName) {
			this.destinationEndpointUserName = destinationEndpointUserName;
		}

		public Long getRestoreTaskFinishTime() {
			return this.restoreTaskFinishTime;
		}

		public void setRestoreTaskFinishTime(Long restoreTaskFinishTime) {
			this.restoreTaskFinishTime = restoreTaskFinishTime;
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

		public String getDestinationEndpointInstanceType() {
			return this.destinationEndpointInstanceType;
		}

		public void setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
			this.destinationEndpointInstanceType = destinationEndpointInstanceType;
		}

		public String getDestinationEndpointOracleSID() {
			return this.destinationEndpointOracleSID;
		}

		public void setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
			this.destinationEndpointOracleSID = destinationEndpointOracleSID;
		}

		public Integer getFullStruforeRestoreProgress() {
			return this.fullStruforeRestoreProgress;
		}

		public void setFullStruforeRestoreProgress(Integer fullStruforeRestoreProgress) {
			this.fullStruforeRestoreProgress = fullStruforeRestoreProgress;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}

		public String getRestoreTaskId() {
			return this.restoreTaskId;
		}

		public void setRestoreTaskId(String restoreTaskId) {
			this.restoreTaskId = restoreTaskId;
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

		public String getDestinationEndpointInstanceID() {
			return this.destinationEndpointInstanceID;
		}

		public void setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
			this.destinationEndpointInstanceID = destinationEndpointInstanceID;
		}

		public String getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(String backupSetId) {
			this.backupSetId = backupSetId;
		}

		public Long getBackupGatewayId() {
			return this.backupGatewayId;
		}

		public void setBackupGatewayId(Long backupGatewayId) {
			this.backupGatewayId = backupGatewayId;
		}

		public String getRestoreTaskName() {
			return this.restoreTaskName;
		}

		public void setRestoreTaskName(String restoreTaskName) {
			this.restoreTaskName = restoreTaskName;
		}

		public Long getRestoreTime() {
			return this.restoreTime;
		}

		public void setRestoreTime(Long restoreTime) {
			this.restoreTime = restoreTime;
		}
	}

	@Override
	public DescribeRestoreTaskListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreTaskListResponseUnmarshaller.unmarshall(this, context);
	}
}
