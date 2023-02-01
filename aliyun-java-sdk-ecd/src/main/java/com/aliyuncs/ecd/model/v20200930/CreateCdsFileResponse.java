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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.CreateCdsFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCdsFileResponse extends AcsResponse {

	private String requestId;

	private List<FileModel> fileModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FileModel> getFileModels() {
		return this.fileModels;
	}

	public void setFileModels(List<FileModel> fileModels) {
		this.fileModels = fileModels;
	}

	public static class FileModel {

		private String uploadId;

		private String uploadUrl;

		private String accessKeyId;

		private String fileId;

		private String uploadType;

		private String expirationSeconds;

		private String accessTokenExpirationMillis;

		private String accessKeySecret;

		private String resourceUrl;

		private String endPoint;

		private String accessToken;

		private String bucket;

		private List<Info> headerInfo;

		public String getUploadId() {
			return this.uploadId;
		}

		public void setUploadId(String uploadId) {
			this.uploadId = uploadId;
		}

		public String getUploadUrl() {
			return this.uploadUrl;
		}

		public void setUploadUrl(String uploadUrl) {
			this.uploadUrl = uploadUrl;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getUploadType() {
			return this.uploadType;
		}

		public void setUploadType(String uploadType) {
			this.uploadType = uploadType;
		}

		public String getExpirationSeconds() {
			return this.expirationSeconds;
		}

		public void setExpirationSeconds(String expirationSeconds) {
			this.expirationSeconds = expirationSeconds;
		}

		public String getAccessTokenExpirationMillis() {
			return this.accessTokenExpirationMillis;
		}

		public void setAccessTokenExpirationMillis(String accessTokenExpirationMillis) {
			this.accessTokenExpirationMillis = accessTokenExpirationMillis;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getResourceUrl() {
			return this.resourceUrl;
		}

		public void setResourceUrl(String resourceUrl) {
			this.resourceUrl = resourceUrl;
		}

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public String getAccessToken() {
			return this.accessToken;
		}

		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public List<Info> getHeaderInfo() {
			return this.headerInfo;
		}

		public void setHeaderInfo(List<Info> headerInfo) {
			this.headerInfo = headerInfo;
		}

		public static class Info {

			private String date;

			private String authorization;

			public String getDate() {
				return this.date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public String getAuthorization() {
				return this.authorization;
			}

			public void setAuthorization(String authorization) {
				this.authorization = authorization;
			}
		}
	}

	@Override
	public CreateCdsFileResponse getInstance(UnmarshallerContext context) {
		return	CreateCdsFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
