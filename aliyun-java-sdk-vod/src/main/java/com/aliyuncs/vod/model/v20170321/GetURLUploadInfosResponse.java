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
import com.aliyuncs.vod.transform.v20170321.GetURLUploadInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetURLUploadInfosResponse extends AcsResponse {

	private String requestId;

	private List<UrlUploadJobInfoDTO> uRLUploadInfoList;

	private List<String> nonExists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UrlUploadJobInfoDTO> getURLUploadInfoList() {
		return this.uRLUploadInfoList;
	}

	public void setURLUploadInfoList(List<UrlUploadJobInfoDTO> uRLUploadInfoList) {
		this.uRLUploadInfoList = uRLUploadInfoList;
	}

	public List<String> getNonExists() {
		return this.nonExists;
	}

	public void setNonExists(List<String> nonExists) {
		this.nonExists = nonExists;
	}

	public static class UrlUploadJobInfoDTO {

		private String jobId;

		private String uploadURL;

		private String mediaId;

		private String fileSize;

		private String status;

		private String userData;

		private String errorCode;

		private String errorMessage;

		private String creationTime;

		private String completeTime;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getUploadURL() {
			return this.uploadURL;
		}

		public void setUploadURL(String uploadURL) {
			this.uploadURL = uploadURL;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}
	}

	@Override
	public GetURLUploadInfosResponse getInstance(UnmarshallerContext context) {
		return	GetURLUploadInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
