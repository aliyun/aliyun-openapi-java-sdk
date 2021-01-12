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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetServiceMethodPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceMethodPageResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private String requestId;

	private String httpCode;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer totalSize;

		private Integer pageSize;

		private List<Method> result;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
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

			private String name;

			private String returnType;

			private String methodController;

			private String nameDetail;

			private String returnDetails;

			private String parameterTypes;

			private String parameterNames;

			private String parameterDetails;

			private String requestMethods;

			private String paths;

			private String parameterDefinitions;

			private ReturnDefinition returnDefinition;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getReturnType() {
				return this.returnType;
			}

			public void setReturnType(String returnType) {
				this.returnType = returnType;
			}

			public String getMethodController() {
				return this.methodController;
			}

			public void setMethodController(String methodController) {
				this.methodController = methodController;
			}

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

			public String getParameterTypes() {
				return this.parameterTypes;
			}

			public void setParameterTypes(String parameterTypes) {
				this.parameterTypes = parameterTypes;
			}

			public String getParameterNames() {
				return this.parameterNames;
			}

			public void setParameterNames(String parameterNames) {
				this.parameterNames = parameterNames;
			}

			public String getParameterDetails() {
				return this.parameterDetails;
			}

			public void setParameterDetails(String parameterDetails) {
				this.parameterDetails = parameterDetails;
			}

			public String getRequestMethods() {
				return this.requestMethods;
			}

			public void setRequestMethods(String requestMethods) {
				this.requestMethods = requestMethods;
			}

			public String getPaths() {
				return this.paths;
			}

			public void setPaths(String paths) {
				this.paths = paths;
			}

			public String getParameterDefinitions() {
				return this.parameterDefinitions;
			}

			public void setParameterDefinitions(String parameterDefinitions) {
				this.parameterDefinitions = parameterDefinitions;
			}

			public ReturnDefinition getReturnDefinition() {
				return this.returnDefinition;
			}

			public void setReturnDefinition(ReturnDefinition returnDefinition) {
				this.returnDefinition = returnDefinition;
			}

			public static class ReturnDefinition {

				private String id;

				private String type;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
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
