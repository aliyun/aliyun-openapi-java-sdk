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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListAuthorizedDataServiceApiDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthorizedDataServiceApiDetailsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Result result;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long totalCount;

		private List<ApiAuthDetail> data;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ApiAuthDetail> getData() {
			return this.data;
		}

		public void setData(List<ApiAuthDetail> data) {
			this.data = data;
		}

		public static class ApiAuthDetail {

			private Long apiId;

			private String apiName;

			private Long appId;

			private Long projectId;

			private String description;

			private String devAuthPeriod;

			private String prodAuthPeriod;

			private String authType;

			private List<DevReturnParameters> authorizedDevReturnParameters;

			private List<ProdReturnParameters> authorizedProdReturnParameters;

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public Long getAppId() {
				return this.appId;
			}

			public void setAppId(Long appId) {
				this.appId = appId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDevAuthPeriod() {
				return this.devAuthPeriod;
			}

			public void setDevAuthPeriod(String devAuthPeriod) {
				this.devAuthPeriod = devAuthPeriod;
			}

			public String getProdAuthPeriod() {
				return this.prodAuthPeriod;
			}

			public void setProdAuthPeriod(String prodAuthPeriod) {
				this.prodAuthPeriod = prodAuthPeriod;
			}

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}

			public List<DevReturnParameters> getAuthorizedDevReturnParameters() {
				return this.authorizedDevReturnParameters;
			}

			public void setAuthorizedDevReturnParameters(List<DevReturnParameters> authorizedDevReturnParameters) {
				this.authorizedDevReturnParameters = authorizedDevReturnParameters;
			}

			public List<ProdReturnParameters> getAuthorizedProdReturnParameters() {
				return this.authorizedProdReturnParameters;
			}

			public void setAuthorizedProdReturnParameters(List<ProdReturnParameters> authorizedProdReturnParameters) {
				this.authorizedProdReturnParameters = authorizedProdReturnParameters;
			}

			public static class DevReturnParameters {

				private String parameterName;

				private Integer parameterDataType;

				private String parameterDescription;

				private String exampleValue;

				private Integer isAuthorized;

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public Integer getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(Integer parameterDataType) {
					this.parameterDataType = parameterDataType;
				}

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}

				public Integer getIsAuthorized() {
					return this.isAuthorized;
				}

				public void setIsAuthorized(Integer isAuthorized) {
					this.isAuthorized = isAuthorized;
				}
			}

			public static class ProdReturnParameters {

				private String parameterName;

				private Integer parameterDataType;

				private String parameterDescription;

				private String exampleValue;

				private Integer isAuthorized;

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public Integer getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(Integer parameterDataType) {
					this.parameterDataType = parameterDataType;
				}

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}

				public Integer getIsAuthorized() {
					return this.isAuthorized;
				}

				public void setIsAuthorized(Integer isAuthorized) {
					this.isAuthorized = isAuthorized;
				}
			}
		}
	}

	@Override
	public ListAuthorizedDataServiceApiDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListAuthorizedDataServiceApiDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
