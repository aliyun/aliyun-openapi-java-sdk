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

package com.aliyuncs.mpserverless.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpserverless.transform.v20190930.DescribeFunctionResponseUnmarshaller;
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

	private LastDeployment lastDeployment;

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

	public LastDeployment getLastDeployment() {
		return this.lastDeployment;
	}

	public void setLastDeployment(LastDeployment lastDeployment) {
		this.lastDeployment = lastDeployment;
	}

	public static class Function {

		private String functionId;

		private String functionName;

		private String functionDesc;

		private String createTime;

		private String updateTime;

		private FunctionSpec functionSpec;

		public String getFunctionId() {
			return this.functionId;
		}

		public void setFunctionId(String functionId) {
			this.functionId = functionId;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getFunctionDesc() {
			return this.functionDesc;
		}

		public void setFunctionDesc(String functionDesc) {
			this.functionDesc = functionDesc;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public FunctionSpec getFunctionSpec() {
			return this.functionSpec;
		}

		public void setFunctionSpec(FunctionSpec functionSpec) {
			this.functionSpec = functionSpec;
		}

		public static class FunctionSpec {

			private String runtime;

			private String memory;

			private String timeout;

			private List<CustomVariable> customVariables;

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

			public List<CustomVariable> getCustomVariables() {
				return this.customVariables;
			}

			public void setCustomVariables(List<CustomVariable> customVariables) {
				this.customVariables = customVariables;
			}

			public static class CustomVariable {

				private String name;

				private String value;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	public static class LastDeployment {

		private String deploymentId;

		private String deploymentVersion;

		private String artifactDownloadUrl;

		private String createTime;

		private String updateTime;

		public String getDeploymentId() {
			return this.deploymentId;
		}

		public void setDeploymentId(String deploymentId) {
			this.deploymentId = deploymentId;
		}

		public String getDeploymentVersion() {
			return this.deploymentVersion;
		}

		public void setDeploymentVersion(String deploymentVersion) {
			this.deploymentVersion = deploymentVersion;
		}

		public String getArtifactDownloadUrl() {
			return this.artifactDownloadUrl;
		}

		public void setArtifactDownloadUrl(String artifactDownloadUrl) {
			this.artifactDownloadUrl = artifactDownloadUrl;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
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
