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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.BackupFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BackupFileResponse extends AcsResponse {

	private String requestId;

	private Long count;

	private String taskId;

	private List<BackupFileTaskList> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<BackupFileTaskList> getData() {
		return this.data;
	}

	public void setData(List<BackupFileTaskList> data) {
		this.data = data;
	}

	public static class BackupFileTaskList {

		private String backupFileId;

		private String backupFileName;

		private String androidInstanceId;

		private String taskId;

		public String getBackupFileId() {
			return this.backupFileId;
		}

		public void setBackupFileId(String backupFileId) {
			this.backupFileId = backupFileId;
		}

		public String getBackupFileName() {
			return this.backupFileName;
		}

		public void setBackupFileName(String backupFileName) {
			this.backupFileName = backupFileName;
		}

		public String getAndroidInstanceId() {
			return this.androidInstanceId;
		}

		public void setAndroidInstanceId(String androidInstanceId) {
			this.androidInstanceId = androidInstanceId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public BackupFileResponse getInstance(UnmarshallerContext context) {
		return	BackupFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
