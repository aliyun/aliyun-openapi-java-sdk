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

package com.aliyuncs.mindlive_biz.model.v20210214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mindlive_biz.transform.v20210214.RequestWarmUpVideoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RequestWarmUpVideoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<WarmUpVideo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<WarmUpVideo> getData() {
		return this.data;
	}

	public void setData(List<WarmUpVideo> data) {
		this.data = data;
	}

	public static class WarmUpVideo {

		private String configs;

		private String downloadUrl;

		private String resourceUuid;

		public String getConfigs() {
			return this.configs;
		}

		public void setConfigs(String configs) {
			this.configs = configs;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public String getResourceUuid() {
			return this.resourceUuid;
		}

		public void setResourceUuid(String resourceUuid) {
			this.resourceUuid = resourceUuid;
		}
	}

	@Override
	public RequestWarmUpVideoResponse getInstance(UnmarshallerContext context) {
		return	RequestWarmUpVideoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
