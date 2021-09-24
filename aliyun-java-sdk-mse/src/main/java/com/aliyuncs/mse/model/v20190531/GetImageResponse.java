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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String errorCode;

	private Boolean success;

	private String httpCode;

	private Data data;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String currentVersionFullShowName;

		private String maxVersionCode;

		private String maxVersionFullShowName;

		private String maxVersionChangelogUrl;

		public String getCurrentVersionFullShowName() {
			return this.currentVersionFullShowName;
		}

		public void setCurrentVersionFullShowName(String currentVersionFullShowName) {
			this.currentVersionFullShowName = currentVersionFullShowName;
		}

		public String getMaxVersionCode() {
			return this.maxVersionCode;
		}

		public void setMaxVersionCode(String maxVersionCode) {
			this.maxVersionCode = maxVersionCode;
		}

		public String getMaxVersionFullShowName() {
			return this.maxVersionFullShowName;
		}

		public void setMaxVersionFullShowName(String maxVersionFullShowName) {
			this.maxVersionFullShowName = maxVersionFullShowName;
		}

		public String getMaxVersionChangelogUrl() {
			return this.maxVersionChangelogUrl;
		}

		public void setMaxVersionChangelogUrl(String maxVersionChangelogUrl) {
			this.maxVersionChangelogUrl = maxVersionChangelogUrl;
		}
	}

	@Override
	public GetImageResponse getInstance(UnmarshallerContext context) {
		return	GetImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
