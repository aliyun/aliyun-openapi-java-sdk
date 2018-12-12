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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeDatabaseBackupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseBackupResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String dBName;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private Long backupTotalSize;

	private List<Backup> backupItems;

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

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Long getBackupTotalSize() {
		return this.backupTotalSize;
	}

	public void setBackupTotalSize(Long backupTotalSize) {
		this.backupTotalSize = backupTotalSize;
	}

	public List<Backup> getBackupItems() {
		return this.backupItems;
	}

	public void setBackupItems(List<Backup> backupItems) {
		this.backupItems = backupItems;
	}

	public static class Backup {

		private Integer backupId;

		private String backupStatus;

		private String backupStartTime;

		private String backupEndTime;

		private String backupMode;

		private String backupDownloadURL;

		private Long backupSize;

		private Integer backupNodeNumber;

		private String backupNodeClass;

		public Integer getBackupId() {
			return this.backupId;
		}

		public void setBackupId(Integer backupId) {
			this.backupId = backupId;
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

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getBackupDownloadURL() {
			return this.backupDownloadURL;
		}

		public void setBackupDownloadURL(String backupDownloadURL) {
			this.backupDownloadURL = backupDownloadURL;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}

		public Integer getBackupNodeNumber() {
			return this.backupNodeNumber;
		}

		public void setBackupNodeNumber(Integer backupNodeNumber) {
			this.backupNodeNumber = backupNodeNumber;
		}

		public String getBackupNodeClass() {
			return this.backupNodeClass;
		}

		public void setBackupNodeClass(String backupNodeClass) {
			this.backupNodeClass = backupNodeClass;
		}
	}

	@Override
	public DescribeDatabaseBackupResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabaseBackupResponseUnmarshaller.unmarshall(this, context);
	}
}
