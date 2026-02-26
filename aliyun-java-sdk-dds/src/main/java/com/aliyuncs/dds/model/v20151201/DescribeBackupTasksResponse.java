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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeBackupTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupTasksResponse extends AcsResponse {

	private String requestId;

	private List<BackupTask> backupJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackupTask> getBackupJobs() {
		return this.backupJobs;
	}

	public void setBackupJobs(List<BackupTask> backupJobs) {
		this.backupJobs = backupJobs;
	}

	public static class BackupTask {

		private String backupjobId;

		private String backupSetStatus;

		private String backupStartTime;

		private String progress;

		private String jobMode;

		public String getBackupjobId() {
			return this.backupjobId;
		}

		public void setBackupjobId(String backupjobId) {
			this.backupjobId = backupjobId;
		}

		public String getBackupSetStatus() {
			return this.backupSetStatus;
		}

		public void setBackupSetStatus(String backupSetStatus) {
			this.backupSetStatus = backupSetStatus;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getJobMode() {
			return this.jobMode;
		}

		public void setJobMode(String jobMode) {
			this.jobMode = jobMode;
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
