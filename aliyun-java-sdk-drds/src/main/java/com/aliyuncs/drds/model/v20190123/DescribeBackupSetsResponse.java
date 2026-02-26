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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeBackupSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSetsResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<BackupSet> backupSets;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackupSet> getBackupSets() {
		return this.backupSets;
	}

	public void setBackupSets(List<BackupSet> backupSets) {
		this.backupSets = backupSets;
	}

	public static class BackupSet {

		private Boolean enableRecovery;

		private Long status;

		private String backupConsitentTime;

		private String backupType;

		private Long backupStartTime;

		private String backupLevel;

		private String backupMode;

		private Long backupEndTime;

		private String id;

		private String backupTotalSize;

		private List<String> backupDbs;

		public Boolean getEnableRecovery() {
			return this.enableRecovery;
		}

		public void setEnableRecovery(Boolean enableRecovery) {
			this.enableRecovery = enableRecovery;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getBackupConsitentTime() {
			return this.backupConsitentTime;
		}

		public void setBackupConsitentTime(String backupConsitentTime) {
			this.backupConsitentTime = backupConsitentTime;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public Long getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(Long backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getBackupLevel() {
			return this.backupLevel;
		}

		public void setBackupLevel(String backupLevel) {
			this.backupLevel = backupLevel;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public Long getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(Long backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBackupTotalSize() {
			return this.backupTotalSize;
		}

		public void setBackupTotalSize(String backupTotalSize) {
			this.backupTotalSize = backupTotalSize;
		}

		public List<String> getBackupDbs() {
			return this.backupDbs;
		}

		public void setBackupDbs(List<String> backupDbs) {
			this.backupDbs = backupDbs;
		}
	}

	@Override
	public DescribeBackupSetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupSetsResponseUnmarshaller.unmarshall(this, context);
	}
}
