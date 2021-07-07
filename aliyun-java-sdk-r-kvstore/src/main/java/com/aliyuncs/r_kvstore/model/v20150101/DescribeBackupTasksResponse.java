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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeBackupTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupTasksResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<BackupJob> backupJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<BackupJob> getBackupJobs() {
		return this.backupJobs;
	}

	public void setBackupJobs(List<BackupJob> backupJobs) {
		this.backupJobs = backupJobs;
	}

	public static class BackupJob {

		private Integer backupJobID;

		private String backupProgressStatus;

		private String jobMode;

		private String process;

		private String startTime;

		private String taskAction;

		private String nodeId;

		public Integer getBackupJobID() {
			return this.backupJobID;
		}

		public void setBackupJobID(Integer backupJobID) {
			this.backupJobID = backupJobID;
		}

		public String getBackupProgressStatus() {
			return this.backupProgressStatus;
		}

		public void setBackupProgressStatus(String backupProgressStatus) {
			this.backupProgressStatus = backupProgressStatus;
		}

		public String getJobMode() {
			return this.jobMode;
		}

		public void setJobMode(String jobMode) {
			this.jobMode = jobMode;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getTaskAction() {
			return this.taskAction;
		}

		public void setTaskAction(String taskAction) {
			this.taskAction = taskAction;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}
	}

	@Override
	public DescribeBackupTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
