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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeBackupRestoreCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupRestoreCountResponse extends AcsResponse {

	private String requestId;

	private BackupRestoreCount backupRestoreCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BackupRestoreCount getBackupRestoreCount() {
		return this.backupRestoreCount;
	}

	public void setBackupRestoreCount(BackupRestoreCount backupRestoreCount) {
		this.backupRestoreCount = backupRestoreCount;
	}

	public static class BackupRestoreCount {

		private Integer total;

		private Integer recovering;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getRecovering() {
			return this.recovering;
		}

		public void setRecovering(Integer recovering) {
			this.recovering = recovering;
		}
	}

	@Override
	public DescribeBackupRestoreCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupRestoreCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
