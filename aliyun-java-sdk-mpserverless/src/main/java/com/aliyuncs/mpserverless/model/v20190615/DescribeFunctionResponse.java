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

package com.aliyuncs.mpserverless.model.v20190615;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpserverless.transform.v20190615.DescribeFunctionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFunctionResponse extends AcsResponse {

	private String httpStatusCode;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Function function;

	private Deployment deployment;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Function getFunction() {
		return this.function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public Deployment getDeployment() {
		return this.deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	public static class Function {

		private String name;

		private String desc;

		private String createdAt;

		private String modifiedAt;

		private Spec spec;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getModifiedAt() {
			return this.modifiedAt;
		}

		public void setModifiedAt(String modifiedAt) {
			this.modifiedAt = modifiedAt;
		}

		public Spec getSpec() {
			return this.spec;
		}

		public void setSpec(Spec spec) {
			this.spec = spec;
		}

		public static class Spec {

			private String runtime;

			private String memory;

			private String timeout;

			public String getRuntime() {
				return this.runtime;
			}

			public void setRuntime(String runtime) {
				this.runtime = runtime;
			}

			public String getMemory() {
				return this.memory;
			}

			public void setMemory(String memory) {
				this.memory = memory;
			}

			public String getTimeout() {
				return this.timeout;
			}

			public void setTimeout(String timeout) {
				this.timeout = timeout;
			}
		}
	}

	public static class Deployment {

		private String deploymentId;

		private String versionNo;

		private String createdAt;

		private String modifiedAt;

		private String downloadSignedUrl;

		public String getDeploymentId() {
			return this.deploymentId;
		}

		public void setDeploymentId(String deploymentId) {
			this.deploymentId = deploymentId;
		}

		public String getVersionNo() {
			return this.versionNo;
		}

		public void setVersionNo(String versionNo) {
			this.versionNo = versionNo;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getModifiedAt() {
			return this.modifiedAt;
		}

		public void setModifiedAt(String modifiedAt) {
			this.modifiedAt = modifiedAt;
		}

		public String getDownloadSignedUrl() {
			return this.downloadSignedUrl;
		}

		public void setDownloadSignedUrl(String downloadSignedUrl) {
			this.downloadSignedUrl = downloadSignedUrl;
		}
	}

	@Override
	public DescribeFunctionResponse getInstance(UnmarshallerContext context) {
		return	DescribeFunctionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
