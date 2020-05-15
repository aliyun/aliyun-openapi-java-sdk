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

package com.aliyuncs.gdb.model.v20190903;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gdb.transform.v20190903.DescribeBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageNumber;

	private String pageSize;

	private List<Backup> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<Backup> getItems() {
		return this.items;
	}

	public void setItems(List<Backup> items) {
		this.items = items;
	}

	public static class Backup {

		private String backupId;

		private String dBInstanceId;

		private String backupStartTime;

		private String backupEndTime;

		private String backupType;

		private Integer backupSize;

		private String backupStatus;

		private String backupMethod;

		public String getBackupId() {
			return this.backupId;
		}

		public void setBackupId(String backupId) {
			this.backupId = backupId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public Integer getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Integer backupSize) {
			this.backupSize = backupSize;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
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
