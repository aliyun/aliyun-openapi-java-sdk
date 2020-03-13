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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetDWSSubsTaskMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDWSSubsTaskMetricsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String consumer;

		private String group;

		private Long id;

		private String name;

		private String tableId;

		private Metric metric;

		public String getConsumer() {
			return this.consumer;
		}

		public void setConsumer(String consumer) {
			this.consumer = consumer;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTableId() {
			return this.tableId;
		}

		public void setTableId(String tableId) {
			this.tableId = tableId;
		}

		public Metric getMetric() {
			return this.metric;
		}

		public void setMetric(Metric metric) {
			this.metric = metric;
		}

		public static class Metric {

			private Long consumptionLatency;

			private Long consumptionRps;

			private Long dailyConsumedRecords;

			private String sampleTime;

			private String slowestPartition;

			public Long getConsumptionLatency() {
				return this.consumptionLatency;
			}

			public void setConsumptionLatency(Long consumptionLatency) {
				this.consumptionLatency = consumptionLatency;
			}

			public Long getConsumptionRps() {
				return this.consumptionRps;
			}

			public void setConsumptionRps(Long consumptionRps) {
				this.consumptionRps = consumptionRps;
			}

			public Long getDailyConsumedRecords() {
				return this.dailyConsumedRecords;
			}

			public void setDailyConsumedRecords(Long dailyConsumedRecords) {
				this.dailyConsumedRecords = dailyConsumedRecords;
			}

			public String getSampleTime() {
				return this.sampleTime;
			}

			public void setSampleTime(String sampleTime) {
				this.sampleTime = sampleTime;
			}

			public String getSlowestPartition() {
				return this.slowestPartition;
			}

			public void setSlowestPartition(String slowestPartition) {
				this.slowestPartition = slowestPartition;
			}
		}
	}

	@Override
	public GetDWSSubsTaskMetricsResponse getInstance(UnmarshallerContext context) {
		return	GetDWSSubsTaskMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
