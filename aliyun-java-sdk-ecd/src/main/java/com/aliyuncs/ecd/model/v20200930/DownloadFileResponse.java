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
import com.aliyuncs.ecd.transform.v20200930.DownloadFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DownloadFileResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String fileId;

		private String downloadType;

		private String downloadUrl;

		private String streamsUrl;

		private Long expirationSecond;

		private String expirationTime;

		private Long size;

		private HeaderInfo headerInfo;

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getDownloadType() {
			return this.downloadType;
		}

		public void setDownloadType(String downloadType) {
			this.downloadType = downloadType;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public String getStreamsUrl() {
			return this.streamsUrl;
		}

		public void setStreamsUrl(String streamsUrl) {
			this.streamsUrl = streamsUrl;
		}

		public Long getExpirationSecond() {
			return this.expirationSecond;
		}

		public void setExpirationSecond(Long expirationSecond) {
			this.expirationSecond = expirationSecond;
		}

		public String getExpirationTime() {
			return this.expirationTime;
		}

		public void setExpirationTime(String expirationTime) {
			this.expirationTime = expirationTime;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public HeaderInfo getHeaderInfo() {
			return this.headerInfo;
		}

		public void setHeaderInfo(HeaderInfo headerInfo) {
			this.headerInfo = headerInfo;
		}

		public static class HeaderInfo {

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
	public DownloadFileResponse getInstance(UnmarshallerContext context) {
		return	DownloadFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
