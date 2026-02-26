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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeSecretResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecretResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private String namespaceId;

		private Long secretId;

		private String secretName;

		private String secretType;

		private Map<Object,Object> secretData;

		private Long createTime;

		private Long updateTime;

		private List<RelateApp> relateApps;

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public Long getSecretId() {
			return this.secretId;
		}

		public void setSecretId(Long secretId) {
			this.secretId = secretId;
		}

		public String getSecretName() {
			return this.secretName;
		}

		public void setSecretName(String secretName) {
			this.secretName = secretName;
		}

		public String getSecretType() {
			return this.secretType;
		}

		public void setSecretType(String secretType) {
			this.secretType = secretType;
		}

		public Map<Object,Object> getSecretData() {
			return this.secretData;
		}

		public void setSecretData(Map<Object,Object> secretData) {
			this.secretData = secretData;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public List<RelateApp> getRelateApps() {
			return this.relateApps;
		}

		public void setRelateApps(List<RelateApp> relateApps) {
			this.relateApps = relateApps;
		}

		public static class RelateApp {

			private String appId;

			private String appName;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}
		}
	}

	@Override
	public DescribeSecretResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecretResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
