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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeReplicationLinkLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicationLinkLogsResponse extends AcsResponse {

	private String dBInstanceId;

	private String requestId;

	private Integer totalSize;

	private List<Tasks> items;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public List<Tasks> getItems() {
		return this.items;
	}

	public void setItems(List<Tasks> items) {
		this.items = items;
	}

	public static class Tasks {

		private String detail;

		private String gmtCreated;

		private String gmtModified;

		private String replicationInfo;

		private String replicationState;

		private String replicatorAccount;

		private String replicatorPassword;

		private String sourceAddress;

		private String sourceCategory;

		private Long sourcePort;

		private String targetInstanceId;

		private Long taskId;

		private String taskName;

		private String taskStage;

		private String taskStatus;

		private String taskType;

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getReplicationInfo() {
			return this.replicationInfo;
		}

		public void setReplicationInfo(String replicationInfo) {
			this.replicationInfo = replicationInfo;
		}

		public String getReplicationState() {
			return this.replicationState;
		}

		public void setReplicationState(String replicationState) {
			this.replicationState = replicationState;
		}

		public String getReplicatorAccount() {
			return this.replicatorAccount;
		}

		public void setReplicatorAccount(String replicatorAccount) {
			this.replicatorAccount = replicatorAccount;
		}

		public String getReplicatorPassword() {
			return this.replicatorPassword;
		}

		public void setReplicatorPassword(String replicatorPassword) {
			this.replicatorPassword = replicatorPassword;
		}

		public String getSourceAddress() {
			return this.sourceAddress;
		}

		public void setSourceAddress(String sourceAddress) {
			this.sourceAddress = sourceAddress;
		}

		public String getSourceCategory() {
			return this.sourceCategory;
		}

		public void setSourceCategory(String sourceCategory) {
			this.sourceCategory = sourceCategory;
		}

		public Long getSourcePort() {
			return this.sourcePort;
		}

		public void setSourcePort(Long sourcePort) {
			this.sourcePort = sourcePort;
		}

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getTaskStage() {
			return this.taskStage;
		}

		public void setTaskStage(String taskStage) {
			this.taskStage = taskStage;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}
	}

	@Override
	public DescribeReplicationLinkLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicationLinkLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
