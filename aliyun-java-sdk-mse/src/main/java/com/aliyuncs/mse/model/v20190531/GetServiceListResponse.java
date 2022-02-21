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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceListResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Integer code;

	private Boolean success;

	private List<MscServiceDetailResponse> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<MscServiceDetailResponse> getData() {
		return this.data;
	}

	public void setData(List<MscServiceDetailResponse> data) {
		this.data = data;
	}

	public static class MscServiceDetailResponse {

		private String edasAppName;

		private String dubboApplicationName;

		private String version;

		private String springApplicationName;

		private String registryType;

		private String serviceType;

		private String serviceName;

		private Map<Object,Object> metadata;

		private String group;

		private List<Method> methods;

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

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getSpringApplicationName() {
			return this.springApplicationName;
		}

		public void setSpringApplicationName(String springApplicationName) {
			this.springApplicationName = springApplicationName;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public List<Method> getMethods() {
			return this.methods;
		}

		public void setMethods(List<Method> methods) {
			this.methods = methods;
		}

		public static class Method {

			private String name;

			private String methodController;

			private String returnType;

			private List<String> paths;

			private List<String> parameterTypes;

			private List<String> requestMethods;

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
