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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.CreateSourcePolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateSourcePolicyResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String errorName;

	private String requestId;

	private Integer httpCode;

	private Data data;

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

	public String getErrorName() {
		return this.errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String accessId;

		private String policy;

		private String signature;

		private String dir;

		private String host;

		private String expire;

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

		public String getDir() {
			return this.dir;
		}

		public void setDir(String dir) {
			this.dir = dir;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getExpire() {
			return this.expire;
		}

		public void setExpire(String expire) {
			this.expire = expire;
		}
	}

	@Override
	public CreateSourcePolicyResponse getInstance(UnmarshallerContext context) {
		return	CreateSourcePolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
