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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.CreateEnvHttpTrafficControlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateEnvHttpTrafficControlResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String accountId;

		private String appId;

		private String envName;

		private Long labelAdviceId;

		private String labelType;

		private Long pointcutId;

		private String regionId;

		private String tenantId;

		private Spec spec;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public Long getLabelAdviceId() {
			return this.labelAdviceId;
		}

		public void setLabelAdviceId(Long labelAdviceId) {
			this.labelAdviceId = labelAdviceId;
		}

		public String getLabelType() {
			return this.labelType;
		}

		public void setLabelType(String labelType) {
			this.labelType = labelType;
		}

		public Long getPointcutId() {
			return this.pointcutId;
		}

		public void setPointcutId(Long pointcutId) {
			this.pointcutId = pointcutId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Spec getSpec() {
			return this.spec;
		}

		public void setSpec(Spec spec) {
			this.spec = spec;
		}

		public static class Spec {

			private String conditionType;

			private Long order;

			private Integer percent;

			private String triggerPolicy;

			private String type;

			private String url;

			private Map<Object,Object> selector;

			private String serviceName;

			private String group;

			private String version;

			private String methodName;

			private String className;

			private Boolean transmitSwitch;

			private Integer transmitLevel;

			private List<ConditionsItem> conditions;

			private List<PurposesItem> purposes;

			private List<String> paramTypes;

			public String getConditionType() {
				return this.conditionType;
			}

			public void setConditionType(String conditionType) {
				this.conditionType = conditionType;
			}

			public Long getOrder() {
				return this.order;
			}

			public void setOrder(Long order) {
				this.order = order;
			}

			public Integer getPercent() {
				return this.percent;
			}

			public void setPercent(Integer percent) {
				this.percent = percent;
			}

			public String getTriggerPolicy() {
				return this.triggerPolicy;
			}

			public void setTriggerPolicy(String triggerPolicy) {
				this.triggerPolicy = triggerPolicy;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Map<Object,Object> getSelector() {
				return this.selector;
			}

			public void setSelector(Map<Object,Object> selector) {
				this.selector = selector;
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

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getClassName() {
				return this.className;
			}

			public void setClassName(String className) {
				this.className = className;
			}

			public Boolean getTransmitSwitch() {
				return this.transmitSwitch;
			}

			public void setTransmitSwitch(Boolean transmitSwitch) {
				this.transmitSwitch = transmitSwitch;
			}

			public Integer getTransmitLevel() {
				return this.transmitLevel;
			}

			public void setTransmitLevel(Integer transmitLevel) {
				this.transmitLevel = transmitLevel;
			}

			public List<ConditionsItem> getConditions() {
				return this.conditions;
			}

			public void setConditions(List<ConditionsItem> conditions) {
				this.conditions = conditions;
			}

			public List<PurposesItem> getPurposes() {
				return this.purposes;
			}

			public void setPurposes(List<PurposesItem> purposes) {
				this.purposes = purposes;
			}

			public List<String> getParamTypes() {
				return this.paramTypes;
			}

			public void setParamTypes(List<String> paramTypes) {
				this.paramTypes = paramTypes;
			}

			public static class ConditionsItem {

				private Long id;

				private String strategy;

				private String type;

				private Integer index;

				private String key;

				private String operator;

				private List<String> values;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getStrategy() {
					return this.strategy;
				}

				public void setStrategy(String strategy) {
					this.strategy = strategy;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
			}

			public static class PurposesItem {

				private String type;

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
	public CreateEnvHttpTrafficControlResponse getInstance(UnmarshallerContext context) {
		return	CreateEnvHttpTrafficControlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
