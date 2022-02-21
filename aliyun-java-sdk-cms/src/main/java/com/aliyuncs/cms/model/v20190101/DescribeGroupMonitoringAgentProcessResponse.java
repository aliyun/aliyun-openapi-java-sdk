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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeGroupMonitoringAgentProcessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupMonitoringAgentProcessResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String pageNumber;

	private String pageSize;

	private String total;

	private List<Process> processes;

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

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<Process> getProcesses() {
		return this.processes;
	}

	public void setProcesses(List<Process> processes) {
		this.processes = processes;
	}

	public static class Process {

		private String processName;

		private String matchExpressFilterRelation;

		private String groupId;

		private String id;

		private List<MatchExpressItem> matchExpress;

		private List<AlertConfigItem> alertConfig;

		public String getProcessName() {
			return this.processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public String getMatchExpressFilterRelation() {
			return this.matchExpressFilterRelation;
		}

		public void setMatchExpressFilterRelation(String matchExpressFilterRelation) {
			this.matchExpressFilterRelation = matchExpressFilterRelation;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<MatchExpressItem> getMatchExpress() {
			return this.matchExpress;
		}

		public void setMatchExpress(List<MatchExpressItem> matchExpress) {
			this.matchExpress = matchExpress;
		}

		public List<AlertConfigItem> getAlertConfig() {
			return this.alertConfig;
		}

		public void setAlertConfig(List<AlertConfigItem> alertConfig) {
			this.alertConfig = alertConfig;
		}

		public static class MatchExpressItem {

			private String value;

			private String name;

			private String function;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getFunction() {
				return this.function;
			}

			public void setFunction(String function) {
				this.function = function;
			}
		}

		public static class AlertConfigItem {

			private String comparisonOperator;

			private String silenceTime;

			private String webhook;

			private String times;

			private String escalationsLevel;

			private String noEffectiveInterval;

			private String effectiveInterval;

			private String threshold;

			private String statistics;

			public String getComparisonOperator() {
				return this.comparisonOperator;
			}

			public void setComparisonOperator(String comparisonOperator) {
				this.comparisonOperator = comparisonOperator;
			}

			public String getSilenceTime() {
				return this.silenceTime;
			}

			public void setSilenceTime(String silenceTime) {
				this.silenceTime = silenceTime;
			}

			public String getWebhook() {
				return this.webhook;
			}

			public void setWebhook(String webhook) {
				this.webhook = webhook;
			}

			public String getTimes() {
				return this.times;
			}

			public void setTimes(String times) {
				this.times = times;
			}

			public String getEscalationsLevel() {
				return this.escalationsLevel;
			}

			public void setEscalationsLevel(String escalationsLevel) {
				this.escalationsLevel = escalationsLevel;
			}

			public String getNoEffectiveInterval() {
				return this.noEffectiveInterval;
			}

			public void setNoEffectiveInterval(String noEffectiveInterval) {
				this.noEffectiveInterval = noEffectiveInterval;
			}

			public String getEffectiveInterval() {
				return this.effectiveInterval;
			}

			public void setEffectiveInterval(String effectiveInterval) {
				this.effectiveInterval = effectiveInterval;
			}

			public String getThreshold() {
				return this.threshold;
			}

			public void setThreshold(String threshold) {
				this.threshold = threshold;
			}

			public String getStatistics() {
				return this.statistics;
			}

			public void setStatistics(String statistics) {
				this.statistics = statistics;
			}
		}
	}

	@Override
	public DescribeGroupMonitoringAgentProcessResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupMonitoringAgentProcessResponseUnmarshaller.unmarshall(this, context);
	}
}
