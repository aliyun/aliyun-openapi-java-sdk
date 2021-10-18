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
import com.aliyuncs.edas.transform.v20170801.GetAccountMockRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountMockRuleResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalSize;

		private List<MseMockRules> result;

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

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<MseMockRules> getResult() {
			return this.result;
		}

		public void setResult(List<MseMockRules> result) {
			this.result = result;
		}

		public static class MseMockRules {

			private Integer status;

			private String region;

			private String consumerAppName;

			private String gmtCreate;

			private String providerAppId;

			private String consumerAppId;

			private String gmtModified;

			private String providerAppName;

			private String name;

			private Integer id;

			private Boolean enable;

			private List<DubboMockItem> dubboMockItems;

			private List<SpringCloudMockItem> scMockItems;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getConsumerAppName() {
				return this.consumerAppName;
			}

			public void setConsumerAppName(String consumerAppName) {
				this.consumerAppName = consumerAppName;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getProviderAppId() {
				return this.providerAppId;
			}

			public void setProviderAppId(String providerAppId) {
				this.providerAppId = providerAppId;
			}

			public String getConsumerAppId() {
				return this.consumerAppId;
			}

			public void setConsumerAppId(String consumerAppId) {
				this.consumerAppId = consumerAppId;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getProviderAppName() {
				return this.providerAppName;
			}

			public void setProviderAppName(String providerAppName) {
				this.providerAppName = providerAppName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public List<DubboMockItem> getDubboMockItems() {
				return this.dubboMockItems;
			}

			public void setDubboMockItems(List<DubboMockItem> dubboMockItems) {
				this.dubboMockItems = dubboMockItems;
			}

			public List<SpringCloudMockItem> getScMockItems() {
				return this.scMockItems;
			}

			public void setScMockItems(List<SpringCloudMockItem> scMockItems) {
				this.scMockItems = scMockItems;
			}

			public static class DubboMockItem {

				private String methodName;

				private String value;

				private String oper;

				private String executeCondition;

				private String version;

				private String exceptionClassName;

				private String serviceName;

				private String group;

				private List<String> paramTypes;

				public String getMethodName() {
					return this.methodName;
				}

				public void setMethodName(String methodName) {
					this.methodName = methodName;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getOper() {
					return this.oper;
				}

				public void setOper(String oper) {
					this.oper = oper;
				}

				public String getExecuteCondition() {
					return this.executeCondition;
				}

				public void setExecuteCondition(String executeCondition) {
					this.executeCondition = executeCondition;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getExceptionClassName() {
					return this.exceptionClassName;
				}

				public void setExceptionClassName(String exceptionClassName) {
					this.exceptionClassName = exceptionClassName;
				}

				public String getServiceName() {
					return this.serviceName;
				}

				public void setServiceName(String serviceName) {
					this.serviceName = serviceName;
				}

				public String getGroup() {
					return this.group;
				}

				public void setGroup(String group) {
					this.group = group;
				}

				public List<String> getParamTypes() {
					return this.paramTypes;
				}

				public void setParamTypes(List<String> paramTypes) {
					this.paramTypes = paramTypes;
				}
			}

			public static class SpringCloudMockItem {

				private String value;

				private String oper;

				private String executeCondition;

				private String path;

				private String method;

				private String exceptionClassName;

				private String serviceName;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getOper() {
					return this.oper;
				}

				public void setOper(String oper) {
					this.oper = oper;
				}

				public String getExecuteCondition() {
					return this.executeCondition;
				}

				public void setExecuteCondition(String executeCondition) {
					this.executeCondition = executeCondition;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getBizMethod() {
					return this.method;
				}

				public void setBizMethod(String method) {
					this.method = method;
				}

				public String getExceptionClassName() {
					return this.exceptionClassName;
				}

				public void setExceptionClassName(String exceptionClassName) {
					this.exceptionClassName = exceptionClassName;
				}

				public String getServiceName() {
					return this.serviceName;
				}

				public void setServiceName(String serviceName) {
					this.serviceName = serviceName;
				}
			}
		}
	}

	@Override
	public GetAccountMockRuleResponse getInstance(UnmarshallerContext context) {
		return	GetAccountMockRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
