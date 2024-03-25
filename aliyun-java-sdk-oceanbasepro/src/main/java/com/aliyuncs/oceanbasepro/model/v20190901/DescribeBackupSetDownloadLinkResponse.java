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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeBackupSetDownloadLinkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSetDownloadLinkResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long downloadTaskId;

		private String downloadTaskStatus;

		private String downloadTaskCreateTime;

		private String backupRestorableTime;

		private String backupSetId;

		private String internalUrl;

		private String urlExpiredTime;

		private Long urlAliveTime;

		public Long getDownloadTaskId() {
			return this.downloadTaskId;
		}

		public void setDownloadTaskId(Long downloadTaskId) {
			this.downloadTaskId = downloadTaskId;
		}

		public String getDownloadTaskStatus() {
			return this.downloadTaskStatus;
		}

		public void setDownloadTaskStatus(String downloadTaskStatus) {
			this.downloadTaskStatus = downloadTaskStatus;
		}

		public String getDownloadTaskCreateTime() {
			return this.downloadTaskCreateTime;
		}

		public void setDownloadTaskCreateTime(String downloadTaskCreateTime) {
			this.downloadTaskCreateTime = downloadTaskCreateTime;
		}

		public String getBackupRestorableTime() {
			return this.backupRestorableTime;
		}

		public void setBackupRestorableTime(String backupRestorableTime) {
			this.backupRestorableTime = backupRestorableTime;
		}

		public String getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(String backupSetId) {
			this.backupSetId = backupSetId;
		}

		public String getInternalUrl() {
			return this.internalUrl;
		}

		public void setInternalUrl(String internalUrl) {
			this.internalUrl = internalUrl;
		}

		public String getUrlExpiredTime() {
			return this.urlExpiredTime;
		}

		public void setUrlExpiredTime(String urlExpiredTime) {
			this.urlExpiredTime = urlExpiredTime;
		}

		public Long getUrlAliveTime() {
			return this.urlAliveTime;
		}

		public void setUrlAliveTime(Long urlAliveTime) {
			this.urlAliveTime = urlAliveTime;
		}
	}

	@Override
	public DescribeBackupSetDownloadLinkResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupSetDownloadLinkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
