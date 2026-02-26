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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.GetOssConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOssConfigResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String endPoint;

		private String ossPolicy;

		private String ossSignature;

		private String accessKeyId;

		private String securityToken;

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public String getOssPolicy() {
			return this.ossPolicy;
		}

		public void setOssPolicy(String ossPolicy) {
			this.ossPolicy = ossPolicy;
		}

		public String getOssSignature() {
			return this.ossSignature;
		}

		public void setOssSignature(String ossSignature) {
			this.ossSignature = ossSignature;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getSecurityToken() {
			return this.securityToken;
		}

		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}
	}

	@Override
	public GetOssConfigResponse getInstance(UnmarshallerContext context) {
		return	GetOssConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
