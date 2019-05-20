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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetJobDataOssUploadParamsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobDataOssUploadParamsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private UploadParams uploadParams;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public UploadParams getUploadParams() {
		return this.uploadParams;
	}

	public void setUploadParams(UploadParams uploadParams) {
		this.uploadParams = uploadParams;
	}

	public static class UploadParams {

		private String accessId;

		private String policy;

		private String signature;

		private String folder;

		private String host;

		private Integer expire;

		public String getAccessId() {
			return this.accessId;
		}

		public void setAccessId(String accessId) {
			this.accessId = accessId;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getSignature() {
			return this.signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public String getFolder() {
			return this.folder;
		}

		public void setFolder(String folder) {
			this.folder = folder;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Integer getExpire() {
			return this.expire;
		}

		public void setExpire(Integer expire) {
			this.expire = expire;
		}
	}

	@Override
	public GetJobDataOssUploadParamsResponse getInstance(UnmarshallerContext context) {
		return	GetJobDataOssUploadParamsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
