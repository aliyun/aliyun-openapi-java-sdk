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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupsResponse extends AcsResponse {

	private String enableStatus;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private List<Backup> backups;

	public String getEnableStatus() {
		return this.enableStatus;
	}

	public void setEnableStatus(String enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Backup> getBackups() {
		return this.backups;
	}

	public void setBackups(List<Backup> backups) {
		this.backups = backups;
	}

	public static class Backup {

		private String backupStatus;

		private String backupStartTime;

		private String backupType;

		private String backupDownloadURL;

		private String backupStartTimeUTC;

		private String backupEndTime;

		private String backupDBNames;

		private Integer backupId;

		private String backupEndTimeUTC;

		private String backupSize;

		private String backupMode;

		private String backupMethod;

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getBackupDownloadURL() {
			return this.backupDownloadURL;
		}

		public void setBackupDownloadURL(String backupDownloadURL) {
			this.backupDownloadURL = backupDownloadURL;
		}

		public String getBackupStartTimeUTC() {
			return this.backupStartTimeUTC;
		}

		public void setBackupStartTimeUTC(String backupStartTimeUTC) {
			this.backupStartTimeUTC = backupStartTimeUTC;
		}

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getBackupDBNames() {
			return this.backupDBNames;
		}

		public void setBackupDBNames(String backupDBNames) {
			this.backupDBNames = backupDBNames;
		}

		public Integer getBackupId() {
			return this.backupId;
		}

		public void setBackupId(Integer backupId) {
			this.backupId = backupId;
		}

		public String getBackupEndTimeUTC() {
			return this.backupEndTimeUTC;
		}

		public void setBackupEndTimeUTC(String backupEndTimeUTC) {
			this.backupEndTimeUTC = backupEndTimeUTC;
		}

		public String getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(String backupSize) {
			this.backupSize = backupSize;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}
	}

	@Override
	public DescribeBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupsResponseUnmarshaller.unmarshall(this, context);
	}
}
