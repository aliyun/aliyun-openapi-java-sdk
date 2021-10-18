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
import com.aliyuncs.edas.transform.v20170801.GetMockRuleByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMockRuleByIdResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String region;

		private String consumerAppName;

		private String providerAppId;

		private String consumerAppId;

		private String accountId;

		private String extraJson;

		private String source;

		private String providerAppName;

		private String name;

		private Long id;

		private Boolean enable;

		private List<SpringCloudMockItem> scMockItems;

		private List<DubboMockItem> dubboMockItems;

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

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getExtraJson() {
			return this.extraJson;
		}

		public void setExtraJson(String extraJson) {
			this.extraJson = extraJson;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public List<SpringCloudMockItem> getScMockItems() {
			return this.scMockItems;
		}

		public void setScMockItems(List<SpringCloudMockItem> scMockItems) {
			this.scMockItems = scMockItems;
		}

		public List<DubboMockItem> getDubboMockItems() {
			return this.dubboMockItems;
		}

		public void setDubboMockItems(List<DubboMockItem> dubboMockItems) {
			this.dubboMockItems = dubboMockItems;
		}

		public static class SpringCloudMockItem {

			private String value;

			private String oper;

			private String executeCondition;

			private String path;

			private String method;

			private String exceptionClassName;

			private String serviceName;

			private String condition;

			private Long timeout;

			private List<ArgumentMockItem> argumentMockItems;

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

			public String getCondition() {
				return this.condition;
			}

			public void setCondition(String condition) {
				this.condition = condition;
			}

			public Long getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Long timeout) {
				this.timeout = timeout;
			}

			public List<ArgumentMockItem> getArgumentMockItems() {
				return this.argumentMockItems;
			}

			public void setArgumentMockItems(List<ArgumentMockItem> argumentMockItems) {
				this.argumentMockItems = argumentMockItems;
			}

			public static class ArgumentMockItem {

				private String type;

				private String name;

				private String operator;

				private String datum;

				private String cond;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getDatum() {
					return this.datum;
				}

				public void setDatum(String datum) {
					this.datum = datum;
				}

				public String getCond() {
					return this.cond;
				}

				public void setCond(String cond) {
					this.cond = cond;
				}
			}
		}

		public static class DubboMockItem {

			private String paramTypes;

			private String methodName;

			private String value;

			private String oper;

			private String exceptionMessage;

			private String executeCondition;

			private String version;

			private String path;

			private String exceptionClassName;

			private String serviceName;

			private String group;

			private String condition;

			private Long timeout;

			private List<ArgumentMockItem2> argumentMockItems1;

			public String getParamTypes() {
				return this.paramTypes;
			}

			public void setParamTypes(String paramTypes) {
				this.paramTypes = paramTypes;
			}

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

			public String getExceptionMessage() {
				return this.exceptionMessage;
			}

			public void setExceptionMessage(String exceptionMessage) {
				this.exceptionMessage = exceptionMessage;
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

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
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

			public String getCondition() {
				return this.condition;
			}

			public void setCondition(String condition) {
				this.condition = condition;
			}

			public Long getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Long timeout) {
				this.timeout = timeout;
			}

			public List<ArgumentMockItem2> getArgumentMockItems1() {
				return this.argumentMockItems1;
			}

			public void setArgumentMockItems1(List<ArgumentMockItem2> argumentMockItems1) {
				this.argumentMockItems1 = argumentMockItems1;
			}

			public static class ArgumentMockItem2 {

				private String type;

				private String name;

				private String operator;

				private String datum;

				private String cond;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getDatum() {
					return this.datum;
				}

				public void setDatum(String datum) {
					this.datum = datum;
				}

				public String getCond() {
					return this.cond;
				}

				public void setCond(String cond) {
					this.cond = cond;
				}
			}
		}
	}

	@Override
	public GetMockRuleByIdResponse getInstance(UnmarshallerContext context) {
		return	GetMockRuleByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
