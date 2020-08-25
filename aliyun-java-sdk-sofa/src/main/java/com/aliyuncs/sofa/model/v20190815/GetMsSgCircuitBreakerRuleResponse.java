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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetMsSgCircuitBreakerRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMsSgCircuitBreakerRuleResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private Long startIndex;

	private Long totalSize;

	private List<RuleModelsItem> ruleModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public List<RuleModelsItem> getRuleModels() {
		return this.ruleModels;
	}

	public void setRuleModels(List<RuleModelsItem> ruleModels) {
		this.ruleModels = ruleModels;
	}

	public static class RuleModelsItem {

		private String dataId;

		private Long gmtModified;

		private String id;

		private String instanceId;

		private String mode;

		private String name;

		private String operator;

		private String serviceType;

		private Long status;

		private List<ConditionsItem> conditions;

		private List<String> appNames;

		private Config config;

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
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

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public List<ConditionsItem> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<ConditionsItem> conditions) {
			this.conditions = conditions;
		}

		public List<String> getAppNames() {
			return this.appNames;
		}

		public void setAppNames(List<String> appNames) {
			this.appNames = appNames;
		}

		public Config getConfig() {
			return this.config;
		}

		public void setConfig(Config config) {
			this.config = config;
		}

		public static class ConditionsItem {

			private String field;

			private String operation;

			private String type;

			private List<String> value;

			public String getField() {
				return this.field;
			}

			public void setField(String field) {
				this.field = field;
			}

			public String getOperation() {
				return this.operation;
			}

			public void setOperation(String operation) {
				this.operation = operation;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<String> getValue() {
				return this.value;
			}

			public void setValue(List<String> value) {
				this.value = value;
			}
		}

		public static class Config {

			private Long errorPercentThreshold;

			private Long providerTimeout;

			private Long requestVolumeThreshold;

			private Long sleepWindow;

			private Long totalMetricWindow;

			public Long getErrorPercentThreshold() {
				return this.errorPercentThreshold;
			}

			public void setErrorPercentThreshold(Long errorPercentThreshold) {
				this.errorPercentThreshold = errorPercentThreshold;
			}

			public Long getProviderTimeout() {
				return this.providerTimeout;
			}

			public void setProviderTimeout(Long providerTimeout) {
				this.providerTimeout = providerTimeout;
			}

			public Long getRequestVolumeThreshold() {
				return this.requestVolumeThreshold;
			}

			public void setRequestVolumeThreshold(Long requestVolumeThreshold) {
				this.requestVolumeThreshold = requestVolumeThreshold;
			}

			public Long getSleepWindow() {
				return this.sleepWindow;
			}

			public void setSleepWindow(Long sleepWindow) {
				this.sleepWindow = sleepWindow;
			}

			public Long getTotalMetricWindow() {
				return this.totalMetricWindow;
			}

			public void setTotalMetricWindow(Long totalMetricWindow) {
				this.totalMetricWindow = totalMetricWindow;
			}
		}
	}

	@Override
	public GetMsSgCircuitBreakerRuleResponse getInstance(UnmarshallerContext context) {
		return	GetMsSgCircuitBreakerRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
