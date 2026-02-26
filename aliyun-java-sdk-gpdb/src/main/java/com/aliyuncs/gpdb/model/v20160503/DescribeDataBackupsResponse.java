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
import com.aliyuncs.gpdb.transform.v20160503.DescribeDataBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataBackupsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private Long totalBackupSize;

	private List<Backup> items;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalBackupSize() {
		return this.totalBackupSize;
	}

	public void setTotalBackupSize(Long totalBackupSize) {
		this.totalBackupSize = totalBackupSize;
	}

	public List<Backup> getItems() {
		return this.items;
	}

	public void setItems(List<Backup> items) {
		this.items = items;
	}

	public static class Backup {

		private String dataType;

		private Long consistentTime;

		private String backupStatus;

		private String backupStartTime;

		private String backupEndTime;

		private String backupEndTimeLocal;

		private String backupSetId;

		private String baksetName;

		private Long backupSize;

		private String backupMode;

		private String backupStartTimeLocal;

		private String dBInstanceId;

		private String backupMethod;

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public Long getConsistentTime() {
			return this.consistentTime;
		}

		public void setConsistentTime(Long consistentTime) {
			this.consistentTime = consistentTime;
		}

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

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getBackupEndTimeLocal() {
			return this.backupEndTimeLocal;
		}

		public void setBackupEndTimeLocal(String backupEndTimeLocal) {
			this.backupEndTimeLocal = backupEndTimeLocal;
		}

		public String getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(String backupSetId) {
			this.backupSetId = backupSetId;
		}

		public String getBaksetName() {
			return this.baksetName;
		}

		public void setBaksetName(String baksetName) {
			this.baksetName = baksetName;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getBackupStartTimeLocal() {
			return this.backupStartTimeLocal;
		}

		public void setBackupStartTimeLocal(String backupStartTimeLocal) {
			this.backupStartTimeLocal = backupStartTimeLocal;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}
	}

	@Override
	public DescribeDataBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataBackupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
