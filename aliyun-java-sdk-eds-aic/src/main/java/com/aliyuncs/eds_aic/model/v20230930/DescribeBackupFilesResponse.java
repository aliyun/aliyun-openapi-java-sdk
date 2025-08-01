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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeBackupFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupFilesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private Long totalCount;

	private List<BackupFileInfoModel> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<BackupFileInfoModel> getData() {
		return this.data;
	}

	public void setData(List<BackupFileInfoModel> data) {
		this.data = data;
	}

	public static class BackupFileInfoModel {

		private String gmtCreated;

		private String gmtModified;

		private String backupFileId;

		private String backupFileName;

		private String instanceGroupId;

		private String androidInstanceId;

		private String androidInstanceName;

		private String taskId;

		private String endUserId;

		private String status;

		private String regionId;

		private Long fileSize;

		private String uploadType;

		private String uploadEndpoint;

		private String backupFilePath;

		private String description;

		private String extParams;

		private Boolean backupAll;

		private List<String> sourceFilePathList;

		private List<String> sourceAppInfoList;

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getBackupFileId() {
			return this.backupFileId;
		}

		public void setBackupFileId(String backupFileId) {
			this.backupFileId = backupFileId;
		}

		public String getBackupFileName() {
			return this.backupFileName;
		}

		public void setBackupFileName(String backupFileName) {
			this.backupFileName = backupFileName;
		}

		public String getInstanceGroupId() {
			return this.instanceGroupId;
		}

		public void setInstanceGroupId(String instanceGroupId) {
			this.instanceGroupId = instanceGroupId;
		}

		public String getAndroidInstanceId() {
			return this.androidInstanceId;
		}

		public void setAndroidInstanceId(String androidInstanceId) {
			this.androidInstanceId = androidInstanceId;
		}

		public String getAndroidInstanceName() {
			return this.androidInstanceName;
		}

		public void setAndroidInstanceName(String androidInstanceName) {
			this.androidInstanceName = androidInstanceName;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getUploadType() {
			return this.uploadType;
		}

		public void setUploadType(String uploadType) {
			this.uploadType = uploadType;
		}

		public String getUploadEndpoint() {
			return this.uploadEndpoint;
		}

		public void setUploadEndpoint(String uploadEndpoint) {
			this.uploadEndpoint = uploadEndpoint;
		}

		public String getBackupFilePath() {
			return this.backupFilePath;
		}

		public void setBackupFilePath(String backupFilePath) {
			this.backupFilePath = backupFilePath;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExtParams() {
			return this.extParams;
		}

		public void setExtParams(String extParams) {
			this.extParams = extParams;
		}

		public Boolean getBackupAll() {
			return this.backupAll;
		}

		public void setBackupAll(Boolean backupAll) {
			this.backupAll = backupAll;
		}

		public List<String> getSourceFilePathList() {
			return this.sourceFilePathList;
		}

		public void setSourceFilePathList(List<String> sourceFilePathList) {
			this.sourceFilePathList = sourceFilePathList;
		}

		public List<String> getSourceAppInfoList() {
			return this.sourceAppInfoList;
		}

		public void setSourceAppInfoList(List<String> sourceAppInfoList) {
			this.sourceAppInfoList = sourceAppInfoList;
		}
	}

	@Override
	public DescribeBackupFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
