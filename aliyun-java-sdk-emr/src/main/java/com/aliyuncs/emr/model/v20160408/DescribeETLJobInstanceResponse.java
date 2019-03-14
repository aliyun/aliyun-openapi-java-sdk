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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeETLJobInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeETLJobInstanceResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String etlJobId;

	private String instanceStatus;

	private String triggerUser;

	private Long startTime;

	private Long endTime;

	private List<FlowRelation> flowRelationList;

	private List<StageInstance> stageInstanceList;

	private TriggerHistory triggerHistory;

	private Arguments arguments;

	private Metrics metrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEtlJobId() {
		return this.etlJobId;
	}

	public void setEtlJobId(String etlJobId) {
		this.etlJobId = etlJobId;
	}

	public String getInstanceStatus() {
		return this.instanceStatus;
	}

	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	public String getTriggerUser() {
		return this.triggerUser;
	}

	public void setTriggerUser(String triggerUser) {
		this.triggerUser = triggerUser;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public List<FlowRelation> getFlowRelationList() {
		return this.flowRelationList;
	}

	public void setFlowRelationList(List<FlowRelation> flowRelationList) {
		this.flowRelationList = flowRelationList;
	}

	public List<StageInstance> getStageInstanceList() {
		return this.stageInstanceList;
	}

	public void setStageInstanceList(List<StageInstance> stageInstanceList) {
		this.stageInstanceList = stageInstanceList;
	}

	public TriggerHistory getTriggerHistory() {
		return this.triggerHistory;
	}

	public void setTriggerHistory(TriggerHistory triggerHistory) {
		this.triggerHistory = triggerHistory;
	}

	public Arguments getArguments() {
		return this.arguments;
	}

	public void setArguments(Arguments arguments) {
		this.arguments = arguments;
	}

	public Metrics getMetrics() {
		return this.metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	public static class FlowRelation {

		private String flowJobId;

		private String flowJobInstanceId;

		public String getFlowJobId() {
			return this.flowJobId;
		}

		public void setFlowJobId(String flowJobId) {
			this.flowJobId = flowJobId;
		}

		public String getFlowJobInstanceId() {
			return this.flowJobInstanceId;
		}

		public void setFlowJobInstanceId(String flowJobInstanceId) {
			this.flowJobInstanceId = flowJobInstanceId;
		}
	}

	public static class StageInstance {

		private String id;

		private String name;

		private Long startTime;

		private Long endTime;

		private Metrics1 metrics1;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Metrics1 getMetrics1() {
			return this.metrics1;
		}

		public void setMetrics1(Metrics1 metrics1) {
			this.metrics1 = metrics1;
		}

		public static class Metrics1 {

			private Long totalTime;

			private Long recordsIn;

			private Long recordsOut;

			private Long recordsError;

			private String recordsRate;

			private Long vcores;

			private Long memSize;

			public Long getTotalTime() {
				return this.totalTime;
			}

			public void setTotalTime(Long totalTime) {
				this.totalTime = totalTime;
			}

			public Long getRecordsIn() {
				return this.recordsIn;
			}

			public void setRecordsIn(Long recordsIn) {
				this.recordsIn = recordsIn;
			}

			public Long getRecordsOut() {
				return this.recordsOut;
			}

			public void setRecordsOut(Long recordsOut) {
				this.recordsOut = recordsOut;
			}

			public Long getRecordsError() {
				return this.recordsError;
			}

			public void setRecordsError(Long recordsError) {
				this.recordsError = recordsError;
			}

			public String getRecordsRate() {
				return this.recordsRate;
			}

			public void setRecordsRate(String recordsRate) {
				this.recordsRate = recordsRate;
			}

			public Long getVcores() {
				return this.vcores;
			}

			public void setVcores(Long vcores) {
				this.vcores = vcores;
			}

			public Long getMemSize() {
				return this.memSize;
			}

			public void setMemSize(Long memSize) {
				this.memSize = memSize;
			}
		}
	}

	public static class TriggerHistory {

		private String historyId;

		private String triggerId;

		private String triggerType;

		private String fireState;

		private Long fireTime;

		public String getHistoryId() {
			return this.historyId;
		}

		public void setHistoryId(String historyId) {
			this.historyId = historyId;
		}

		public String getTriggerId() {
			return this.triggerId;
		}

		public void setTriggerId(String triggerId) {
			this.triggerId = triggerId;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public String getFireState() {
			return this.fireState;
		}

		public void setFireState(String fireState) {
			this.fireState = fireState;
		}

		public Long getFireTime() {
			return this.fireTime;
		}

		public void setFireTime(Long fireTime) {
			this.fireTime = fireTime;
		}
	}

	public static class Arguments {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Metrics {

		private Long totalTime;

		private Long recordsIn;

		private Long recordsOut;

		private Long recordsError;

		private String recordsRate;

		private Long vcores;

		private Long memSize;

		public Long getTotalTime() {
			return this.totalTime;
		}

		public void setTotalTime(Long totalTime) {
			this.totalTime = totalTime;
		}

		public Long getRecordsIn() {
			return this.recordsIn;
		}

		public void setRecordsIn(Long recordsIn) {
			this.recordsIn = recordsIn;
		}

		public Long getRecordsOut() {
			return this.recordsOut;
		}

		public void setRecordsOut(Long recordsOut) {
			this.recordsOut = recordsOut;
		}

		public Long getRecordsError() {
			return this.recordsError;
		}

		public void setRecordsError(Long recordsError) {
			this.recordsError = recordsError;
		}

		public String getRecordsRate() {
			return this.recordsRate;
		}

		public void setRecordsRate(String recordsRate) {
			this.recordsRate = recordsRate;
		}

		public Long getVcores() {
			return this.vcores;
		}

		public void setVcores(Long vcores) {
			this.vcores = vcores;
		}

		public Long getMemSize() {
			return this.memSize;
		}

		public void setMemSize(Long memSize) {
			this.memSize = memSize;
		}
	}

	@Override
	public DescribeETLJobInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeETLJobInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
