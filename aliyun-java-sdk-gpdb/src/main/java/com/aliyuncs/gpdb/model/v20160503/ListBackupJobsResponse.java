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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListBackupJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBackupJobsResponse extends AcsResponse {

	private String requestId;

	private List<BackupJob> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackupJob> getItems() {
		return this.items;
	}

	public void setItems(List<BackupJob> items) {
		this.items = items;
	}

	public static class BackupJob {

		private String backupJobId;

		private String backupMode;

		private String backupStatus;

		private String process;

		private String startTime;

		public String getBackupJobId() {
			return this.backupJobId;
		}

		public void setBackupJobId(String backupJobId) {
			this.backupJobId = backupJobId;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
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
	}

	@Override
	public ListBackupJobsResponse getInstance(UnmarshallerContext context) {
		return	ListBackupJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
