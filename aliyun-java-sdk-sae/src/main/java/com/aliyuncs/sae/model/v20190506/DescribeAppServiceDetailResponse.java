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
import com.aliyuncs.sae.transform.v20190506.DescribeAppServiceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppServiceDetailResponse extends AcsResponse {

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

		private String group;

		private String serviceName;

		private String version;

		private String serviceType;

		private String edasAppName;

		private Map<Object,Object> metadata;

		private String springApplicationName;

		private String dubboApplicationName;

		private List<Method> methods;

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getEdasAppName() {
			return this.edasAppName;
		}

		public void setEdasAppName(String edasAppName) {
			this.edasAppName = edasAppName;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public String getSpringApplicationName() {
			return this.springApplicationName;
		}

		public void setSpringApplicationName(String springApplicationName) {
			this.springApplicationName = springApplicationName;
		}

		public String getDubboApplicationName() {
			return this.dubboApplicationName;
		}

		public void setDubboApplicationName(String dubboApplicationName) {
			this.dubboApplicationName = dubboApplicationName;
		}

		public List<Method> getMethods() {
			return this.methods;
		}

		public void setMethods(List<Method> methods) {
			this.methods = methods;
		}

		public static class Method {

			private String methodController;

			private String returnType;

			private String returnDetails;

			private String name;

			private String nameDetail;

			private List<ParameterDefinition> parameterDefinitions;

			private List<String> parameterDetails;

			private List<String> requestMethods;

			private List<String> parameterTypes;

			private List<String> paths;

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

			public String getNameDetail() {
				return this.nameDetail;
			}

			public void setNameDetail(String nameDetail) {
				this.nameDetail = nameDetail;
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

			public List<String> getRequestMethods() {
				return this.requestMethods;
			}

			public void setRequestMethods(List<String> requestMethods) {
				this.requestMethods = requestMethods;
			}

			public List<String> getParameterTypes() {
				return this.parameterTypes;
			}

			public void setParameterTypes(List<String> parameterTypes) {
				this.parameterTypes = parameterTypes;
			}

			public List<String> getPaths() {
				return this.paths;
			}

			public void setPaths(List<String> paths) {
				this.paths = paths;
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
	public DescribeAppServiceDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppServiceDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
