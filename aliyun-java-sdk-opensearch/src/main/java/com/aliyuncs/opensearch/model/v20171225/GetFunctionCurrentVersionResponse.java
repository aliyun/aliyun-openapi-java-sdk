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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.GetFunctionCurrentVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFunctionCurrentVersionResponse extends AcsResponse {

	private String status;

	private Long httpCode;

	private String requestId;

	private String message;

	private String code;

	private Long latency;

	private Result result;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Long httpCode) {
		this.httpCode = httpCode;
	}

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

	public Long getLatency() {
		return this.latency;
	}

	public void setLatency(Long latency) {
		this.latency = latency;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String functionName;

		private String functionType;

		private String modelType;

		private Long versionId;

		private String versionName;

		private VersionConfig versionConfig;

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getFunctionType() {
			return this.functionType;
		}

		public void setFunctionType(String functionType) {
			this.functionType = functionType;
		}

		public String getModelType() {
			return this.modelType;
		}

		public void setModelType(String modelType) {
			this.modelType = modelType;
		}

		public Long getVersionId() {
			return this.versionId;
		}

		public void setVersionId(Long versionId) {
			this.versionId = versionId;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public VersionConfig getVersionConfig() {
			return this.versionConfig;
		}

		public void setVersionConfig(VersionConfig versionConfig) {
			this.versionConfig = versionConfig;
		}

		public static class VersionConfig {

			private List<CreateParametersItem> createParameters;

			private List<DependsItem> depends;

			private List<UsageParametersItem> usageParameters;

			public List<CreateParametersItem> getCreateParameters() {
				return this.createParameters;
			}

			public void setCreateParameters(List<CreateParametersItem> createParameters) {
				this.createParameters = createParameters;
			}

			public List<DependsItem> getDepends() {
				return this.depends;
			}

			public void setDepends(List<DependsItem> depends) {
				this.depends = depends;
			}

			public List<UsageParametersItem> getUsageParameters() {
				return this.usageParameters;
			}

			public void setUsageParameters(List<UsageParametersItem> usageParameters) {
				this.usageParameters = usageParameters;
			}

			public static class CreateParametersItem {

				private String name;

				private String required;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getRequired() {
					return this.required;
				}

				public void setRequired(String required) {
					this.required = required;
				}
			}

			public static class DependsItem {

				private String condition;

				private String dependency;

				private String description;

				public String getCondition() {
					return this.condition;
				}

				public void setCondition(String condition) {
					this.condition = condition;
				}

				public String getDependency() {
					return this.dependency;
				}

				public void setDependency(String dependency) {
					this.dependency = dependency;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}

			public static class UsageParametersItem {

				private String name;

				private String required;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getRequired() {
					return this.required;
				}

				public void setRequired(String required) {
					this.required = required;
				}
			}
		}
	}

	@Override
	public GetFunctionCurrentVersionResponse getInstance(UnmarshallerContext context) {
		return	GetFunctionCurrentVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
