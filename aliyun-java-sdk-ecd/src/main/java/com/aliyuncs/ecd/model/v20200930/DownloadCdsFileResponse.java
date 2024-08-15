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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DownloadCdsFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DownloadCdsFileResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Boolean success;

	private DownloadFileModel downloadFileModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public DownloadFileModel getDownloadFileModel() {
		return this.downloadFileModel;
	}

	public void setDownloadFileModel(DownloadFileModel downloadFileModel) {
		this.downloadFileModel = downloadFileModel;
	}

	public static class DownloadFileModel {

		private String streamUrl;

		private String downloadUrl;

		private Long size;

		private String downloadType;

		private String expirationSecond;

		private String expirationTime;

		private String fileId;

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getDownloadType() {
			return this.downloadType;
		}

		public void setDownloadType(String downloadType) {
			this.downloadType = downloadType;
		}

		public String getExpirationSecond() {
			return this.expirationSecond;
		}

		public void setExpirationSecond(String expirationSecond) {
			this.expirationSecond = expirationSecond;
		}

		public String getExpirationTime() {
			return this.expirationTime;
		}

		public void setExpirationTime(String expirationTime) {
			this.expirationTime = expirationTime;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
	}

	@Override
	public DownloadCdsFileResponse getInstance(UnmarshallerContext context) {
		return	DownloadCdsFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
