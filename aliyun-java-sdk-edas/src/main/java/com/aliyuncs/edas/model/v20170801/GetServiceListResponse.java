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
import com.aliyuncs.edas.transform.v20170801.GetServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceListResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Boolean success;

	private List<MseServiceResponse> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public List<MseServiceResponse> getData() {
		return this.data;
	}

	public void setData(List<MseServiceResponse> data) {
		this.data = data;
	}

	public static class MseServiceResponse {

		private String serviceName;

		private String edasAppName;

		private String dubboApplicationName;

		private String springApplicationName;

		private String serviceType;

		private String registryType;

		private String version;

		private String group;

		private String metadata;

		private List<Method> methods;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getEdasAppName() {
			return this.edasAppName;
		}

		public void setEdasAppName(String edasAppName) {
			this.edasAppName = edasAppName;
		}

		public String getDubboApplicationName() {
			return this.dubboApplicationName;
		}

		public void setDubboApplicationName(String dubboApplicationName) {
			this.dubboApplicationName = dubboApplicationName;
		}

		public String getSpringApplicationName() {
			return this.springApplicationName;
		}

		public void setSpringApplicationName(String springApplicationName) {
			this.springApplicationName = springApplicationName;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getMetadata() {
			return this.metadata;
		}

		public void setMetadata(String metadata) {
			this.metadata = metadata;
		}

		public List<Method> getMethods() {
			return this.methods;
		}

		public void setMethods(List<Method> methods) {
			this.methods = methods;
		}

		public static class Method {

			private String name;

			private String returnType;

			private String methodController;

			private String parameterNames;

			private String nameDetail;

			private String returnDetails;

			private String parameterTypes;

			private String parameterDetails;

			private String requestMethods;

			private String parameterDetails1;

			private String requestMethods2;

			private String paths;

			private String parameterDefinitions;

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

			public String getParameterNames() {
				return this.parameterNames;
			}

			public void setParameterNames(String parameterNames) {
				this.parameterNames = parameterNames;
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

			public String getParameterDetails1() {
				return this.parameterDetails1;
			}

			public void setParameterDetails1(String parameterDetails1) {
				this.parameterDetails1 = parameterDetails1;
			}

			public String getRequestMethods2() {
				return this.requestMethods2;
			}

			public void setRequestMethods2(String requestMethods2) {
				this.requestMethods2 = requestMethods2;
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
		}
	}

	@Override
	public GetServiceListResponse getInstance(UnmarshallerContext context) {
		return	GetServiceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
