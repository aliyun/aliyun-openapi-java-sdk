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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetUploadDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUploadDetailsResponse extends AcsResponse {

	private String requestId;

	private List<UploadDetail> uploadDetails;

	private List<String> nonExistMediaIds;

	private List<String> forbiddenMediaIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UploadDetail> getUploadDetails() {
		return this.uploadDetails;
	}

	public void setUploadDetails(List<UploadDetail> uploadDetails) {
		this.uploadDetails = uploadDetails;
	}

	public List<String> getNonExistMediaIds() {
		return this.nonExistMediaIds;
	}

	public void setNonExistMediaIds(List<String> nonExistMediaIds) {
		this.nonExistMediaIds = nonExistMediaIds;
	}

	public List<String> getForbiddenMediaIds() {
		return this.forbiddenMediaIds;
	}

	public void setForbiddenMediaIds(List<String> forbiddenMediaIds) {
		this.forbiddenMediaIds = forbiddenMediaIds;
	}

	public static class UploadDetail {

		private String mediaId;

		private String title;

		private Long fileSize;

		private String status;

		private String uploadStatus;

		private String creationTime;

		private String modificationTime;

		private String completionTime;

		private Long uploadSize;

		private Float uploadRatio;

		private String uploadIP;

		private String uploadSource;

		private String deviceModel;

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUploadStatus() {
			return this.uploadStatus;
		}

		public void setUploadStatus(String uploadStatus) {
			this.uploadStatus = uploadStatus;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getCompletionTime() {
			return this.completionTime;
		}

		public void setCompletionTime(String completionTime) {
			this.completionTime = completionTime;
		}

		public Long getUploadSize() {
			return this.uploadSize;
		}

		public void setUploadSize(Long uploadSize) {
			this.uploadSize = uploadSize;
		}

		public Float getUploadRatio() {
			return this.uploadRatio;
		}

		public void setUploadRatio(Float uploadRatio) {
			this.uploadRatio = uploadRatio;
		}

		public String getUploadIP() {
			return this.uploadIP;
		}

		public void setUploadIP(String uploadIP) {
			this.uploadIP = uploadIP;
		}

		public String getUploadSource() {
			return this.uploadSource;
		}

		public void setUploadSource(String uploadSource) {
			this.uploadSource = uploadSource;
		}

		public String getDeviceModel() {
			return this.deviceModel;
		}

		public void setDeviceModel(String deviceModel) {
			this.deviceModel = deviceModel;
		}
	}

	@Override
	public GetUploadDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetUploadDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
