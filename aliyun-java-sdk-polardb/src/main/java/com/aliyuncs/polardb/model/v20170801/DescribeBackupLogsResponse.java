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
import com.aliyuncs.polardb.transform.v20170801.DescribeBackupLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupLogsResponse extends AcsResponse {

	private String requestId;

	private String totalRecordCount;

	private String pageNumber;

	private String pageRecordCount;

	private List<BackupLog> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(String totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(String pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<BackupLog> getItems() {
		return this.items;
	}

	public void setItems(List<BackupLog> items) {
		this.items = items;
	}

	public static class BackupLog {

		private String backupLogId;

		private String backupLogName;

		private String backupLogStartTime;

		private String backupLogEndTime;

		private String backupLogSize;

		private String downloadLink;

		private String intranetDownloadLink;

		private String linkExpiredTime;

		public String getBackupLogId() {
			return this.backupLogId;
		}

		public void setBackupLogId(String backupLogId) {
			this.backupLogId = backupLogId;
		}

		public String getBackupLogName() {
			return this.backupLogName;
		}

		public void setBackupLogName(String backupLogName) {
			this.backupLogName = backupLogName;
		}

		public String getBackupLogStartTime() {
			return this.backupLogStartTime;
		}

		public void setBackupLogStartTime(String backupLogStartTime) {
			this.backupLogStartTime = backupLogStartTime;
		}

		public String getBackupLogEndTime() {
			return this.backupLogEndTime;
		}

		public void setBackupLogEndTime(String backupLogEndTime) {
			this.backupLogEndTime = backupLogEndTime;
		}

		public String getBackupLogSize() {
			return this.backupLogSize;
		}

		public void setBackupLogSize(String backupLogSize) {
			this.backupLogSize = backupLogSize;
		}

		public String getDownloadLink() {
			return this.downloadLink;
		}

		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}

		public String getIntranetDownloadLink() {
			return this.intranetDownloadLink;
		}

		public void setIntranetDownloadLink(String intranetDownloadLink) {
			this.intranetDownloadLink = intranetDownloadLink;
		}

		public String getLinkExpiredTime() {
			return this.linkExpiredTime;
		}

		public void setLinkExpiredTime(String linkExpiredTime) {
			this.linkExpiredTime = linkExpiredTime;
		}
	}

	@Override
	public DescribeBackupLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
