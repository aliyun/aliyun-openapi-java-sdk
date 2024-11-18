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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupsResponse extends AcsResponse {

	private String totalRecordCount;

	private String pageRecordCount;

	private String requestId;

	private String pageNumber;

	private String totalLevel2BackupSize;

	private List<Backup> items;

	public String getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(String totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(String pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTotalLevel2BackupSize() {
		return this.totalLevel2BackupSize;
	}

	public void setTotalLevel2BackupSize(String totalLevel2BackupSize) {
		this.totalLevel2BackupSize = totalLevel2BackupSize;
	}

	public List<Backup> getItems() {
		return this.items;
	}

	public void setItems(List<Backup> items) {
		this.items = items;
	}

	public static class Backup {

		private String backupSetSize;

		private String consistentTime;

		private String storeStatus;

		private String backupStatus;

		private String backupType;

		private String backupStartTime;

		private String expectExpireTime;

		private String expectExpireType;

		private String isAvail;

		private String backupEndTime;

		private String backupId;

		private String dBClusterId;

		private String backupsLevel;

		private String backupMode;

		private String backupMethod;

		public String getBackupSetSize() {
			return this.backupSetSize;
		}

		public void setBackupSetSize(String backupSetSize) {
			this.backupSetSize = backupSetSize;
		}

		public String getConsistentTime() {
			return this.consistentTime;
		}

		public void setConsistentTime(String consistentTime) {
			this.consistentTime = consistentTime;
		}

		public String getStoreStatus() {
			return this.storeStatus;
		}

		public void setStoreStatus(String storeStatus) {
			this.storeStatus = storeStatus;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getExpectExpireTime() {
			return this.expectExpireTime;
		}

		public void setExpectExpireTime(String expectExpireTime) {
			this.expectExpireTime = expectExpireTime;
		}

		public String getExpectExpireType() {
			return this.expectExpireType;
		}

		public void setExpectExpireType(String expectExpireType) {
			this.expectExpireType = expectExpireType;
		}

		public String getIsAvail() {
			return this.isAvail;
		}

		public void setIsAvail(String isAvail) {
			this.isAvail = isAvail;
		}

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getBackupId() {
			return this.backupId;
		}

		public void setBackupId(String backupId) {
			this.backupId = backupId;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getBackupsLevel() {
			return this.backupsLevel;
		}

		public void setBackupsLevel(String backupsLevel) {
			this.backupsLevel = backupsLevel;
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
