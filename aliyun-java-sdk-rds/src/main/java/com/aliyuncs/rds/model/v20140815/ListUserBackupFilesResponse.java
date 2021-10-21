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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ListUserBackupFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserBackupFilesResponse extends AcsResponse {

	private String requestId;

	private List<RecordsItem> records;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordsItem> getRecords() {
		return this.records;
	}

	public void setRecords(List<RecordsItem> records) {
		this.records = records;
	}

	public static class RecordsItem {

		private String status;

		private String creationTime;

		private String finishTime;

		private String comment;

		private String ossFilePath;

		private String ossBucket;

		private String modificationTime;

		private Long ossFileSize;

		private String ossFileName;

		private String engineVersion;

		private String backupId;

		private String restoreSize;

		private String zoneId;

		private Integer retention;

		private String dBInstanceId;

		private String engine;

		private String ossUrl;

		private String ossFileMetaData;

		private String binlogInfo;

		private String reason;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getOssFilePath() {
			return this.ossFilePath;
		}

		public void setOssFilePath(String ossFilePath) {
			this.ossFilePath = ossFilePath;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public Long getOssFileSize() {
			return this.ossFileSize;
		}

		public void setOssFileSize(Long ossFileSize) {
			this.ossFileSize = ossFileSize;
		}

		public String getOssFileName() {
			return this.ossFileName;
		}

		public void setOssFileName(String ossFileName) {
			this.ossFileName = ossFileName;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getBackupId() {
			return this.backupId;
		}

		public void setBackupId(String backupId) {
			this.backupId = backupId;
		}

		public String getRestoreSize() {
			return this.restoreSize;
		}

		public void setRestoreSize(String restoreSize) {
			this.restoreSize = restoreSize;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getRetention() {
			return this.retention;
		}

		public void setRetention(Integer retention) {
			this.retention = retention;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getOssUrl() {
			return this.ossUrl;
		}

		public void setOssUrl(String ossUrl) {
			this.ossUrl = ossUrl;
		}

		public String getOssFileMetaData() {
			return this.ossFileMetaData;
		}

		public void setOssFileMetaData(String ossFileMetaData) {
			this.ossFileMetaData = ossFileMetaData;
		}

		public String getBinlogInfo() {
			return this.binlogInfo;
		}

		public void setBinlogInfo(String binlogInfo) {
			this.binlogInfo = binlogInfo;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public ListUserBackupFilesResponse getInstance(UnmarshallerContext context) {
		return	ListUserBackupFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
