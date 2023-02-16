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

package com.aliyuncs.eventbridge.model.v20200401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.ListApiDestinationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApiDestinationsResponse extends AcsResponse {

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

		private List<ApiDestinationsItem> apiDestinations;

		public List<ApiDestinationsItem> getApiDestinations() {
			return this.apiDestinations;
		}

		public void setApiDestinations(List<ApiDestinationsItem> apiDestinations) {
			this.apiDestinations = apiDestinations;
		}

		public static class ApiDestinationsItem {

			private String apiDestinationName;

			private String connectionName;

			private String description;

			private Long gmtCreate;

			private Long invocationRateLimitPerSecond;

			private HttpApiParameters httpApiParameters;

			public String getApiDestinationName() {
				return this.apiDestinationName;
			}

			public void setApiDestinationName(String apiDestinationName) {
				this.apiDestinationName = apiDestinationName;
			}

			public String getConnectionName() {
				return this.connectionName;
			}

			public void setConnectionName(String connectionName) {
				this.connectionName = connectionName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getInvocationRateLimitPerSecond() {
				return this.invocationRateLimitPerSecond;
			}

			public void setInvocationRateLimitPerSecond(Long invocationRateLimitPerSecond) {
				this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
			}

			public HttpApiParameters getHttpApiParameters() {
				return this.httpApiParameters;
			}

			public void setHttpApiParameters(HttpApiParameters httpApiParameters) {
				this.httpApiParameters = httpApiParameters;
			}

			public static class HttpApiParameters {

				private String endpoint;

				private String method;

				private List<ApiParametersItem> apiParameters;

				public String getEndpoint() {
					return this.endpoint;
				}

				public void setEndpoint(String endpoint) {
					this.endpoint = endpoint;
				}

				public String getBizMethod() {
					return this.method;
				}

				public void setBizMethod(String method) {
					this.method = method;
				}

				public List<ApiParametersItem> getApiParameters() {
					return this.apiParameters;
				}

				public void setApiParameters(List<ApiParametersItem> apiParameters) {
					this.apiParameters = apiParameters;
				}

				public static class ApiParametersItem {

					private String name;

					private String description;

					private String type;

					private String defaultValue;

					private String in;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getIn() {
						return this.in;
					}

					public void setIn(String in) {
						this.in = in;
					}
				}
			}
		}
	}

	@Override
	public ListApiDestinationsResponse getInstance(UnmarshallerContext context) {
		return	ListApiDestinationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
