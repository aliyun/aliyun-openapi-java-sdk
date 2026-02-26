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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetServiceMethodPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceMethodPageResponse extends AcsResponse {

	private Boolean success;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Integer code;

	private Data data;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalSize;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Method> result;

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Method> getResult() {
			return this.result;
		}

		public void setResult(List<Method> result) {
			this.result = result;
		}

		public static class Method {

			private String nameDetail;

			private String returnDetails;

			private String name;

			private String methodController;

			private String returnType;

			private List<ParameterDefinition> parameterDefinitions;

			private List<String> parameterDetails;

			private List<String> paths;

			private List<String> parameterTypes;

			private List<String> requestMethods;

			public String getNameDetail() {
				return this.nameDetail;
			}

			public void setNameDetail(String nameDetail) {
				this.nameDetail = nameDetail;
			}

			public String getReturnDetails() {
				return this.returnDetails;
			}

			public void setReturnDetails(String returnDetails) {
				this.returnDetails = returnDetails;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getMethodController() {
				return this.methodController;
			}

			public void setMethodController(String methodController) {
				this.methodController = methodController;
			}

			public String getReturnType() {
				return this.returnType;
			}

			public void setReturnType(String returnType) {
				this.returnType = returnType;
			}

			public List<ParameterDefinition> getParameterDefinitions() {
				return this.parameterDefinitions;
			}

			public void setParameterDefinitions(List<ParameterDefinition> parameterDefinitions) {
				this.parameterDefinitions = parameterDefinitions;
			}

			public List<String> getParameterDetails() {
				return this.parameterDetails;
			}

			public void setParameterDetails(List<String> parameterDetails) {
				this.parameterDetails = parameterDetails;
			}

			public List<String> getPaths() {
				return this.paths;
			}

			public void setPaths(List<String> paths) {
				this.paths = paths;
			}

			public List<String> getParameterTypes() {
				return this.parameterTypes;
			}

			public void setParameterTypes(List<String> parameterTypes) {
				this.parameterTypes = parameterTypes;
			}

			public List<String> getRequestMethods() {
				return this.requestMethods;
			}

			public void setRequestMethods(List<String> requestMethods) {
				this.requestMethods = requestMethods;
			}

			public static class ParameterDefinition {

				private String type;

				private String description;

				private String name;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public GetServiceMethodPageResponse getInstance(UnmarshallerContext context) {
		return	GetServiceMethodPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
