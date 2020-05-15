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
import com.aliyuncs.sofa.transform.v20190815.QueryTSTopologyInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSTopologyInstanceResponse extends AcsResponse {

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

		private Long baseVersion;

		private Long processId;

		private List<EdgesItem> edges;

		private List<NodesItem> nodes;

		public Long getBaseVersion() {
			return this.baseVersion;
		}

		public void setBaseVersion(Long baseVersion) {
			this.baseVersion = baseVersion;
		}

		public Long getProcessId() {
			return this.processId;
		}

		public void setProcessId(Long processId) {
			this.processId = processId;
		}

		public List<EdgesItem> getEdges() {
			return this.edges;
		}

		public void setEdges(List<EdgesItem> edges) {
			this.edges = edges;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public static class EdgesItem {

			private Boolean conditionValue;

			private String source;

			private String status;

			private String target;

			public Boolean getConditionValue() {
				return this.conditionValue;
			}

			public void setConditionValue(Boolean conditionValue) {
				this.conditionValue = conditionValue;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}
		}

		public static class NodesItem {

			private Long activityId;

			private Long activityInstanceId;

			private String app;

			private Boolean canSuspend;

			private String comment;

			private String condition;

			private Long consume;

			private Long createTimestamp;

			private Long curSharding;

			private String gmtBegin;

			private String gmtEnd;

			private Long id;

			private Boolean isInShardingGateway;

			private String jobDes;

			private Long jobId;

			private String jobType;

			private Boolean lock;

			private String name;

			private Boolean needConfirm;

			private Long parallelCount;

			private Long parentActivityInstanceId;

			private String status;

			private String subProcessRequestId;

			private Long succeedShardingNum;

			private String topologyStatus;

			private Long totalShardingNum;

			private String type;

			private List<ActivityEventsItem> activityEvents;

			private List<EventsItem> events;

			public Long getActivityId() {
				return this.activityId;
			}

			public void setActivityId(Long activityId) {
				this.activityId = activityId;
			}

			public Long getActivityInstanceId() {
				return this.activityInstanceId;
			}

			public void setActivityInstanceId(Long activityInstanceId) {
				this.activityInstanceId = activityInstanceId;
			}

			public String getApp() {
				return this.app;
			}

			public void setApp(String app) {
				this.app = app;
			}

			public Boolean getCanSuspend() {
				return this.canSuspend;
			}

			public void setCanSuspend(Boolean canSuspend) {
				this.canSuspend = canSuspend;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getCondition() {
				return this.condition;
			}

			public void setCondition(String condition) {
				this.condition = condition;
			}

			public Long getConsume() {
				return this.consume;
			}

			public void setConsume(Long consume) {
				this.consume = consume;
			}

			public Long getCreateTimestamp() {
				return this.createTimestamp;
			}

			public void setCreateTimestamp(Long createTimestamp) {
				this.createTimestamp = createTimestamp;
			}

			public Long getCurSharding() {
				return this.curSharding;
			}

			public void setCurSharding(Long curSharding) {
				this.curSharding = curSharding;
			}

			public String getGmtBegin() {
				return this.gmtBegin;
			}

			public void setGmtBegin(String gmtBegin) {
				this.gmtBegin = gmtBegin;
			}

			public String getGmtEnd() {
				return this.gmtEnd;
			}

			public void setGmtEnd(String gmtEnd) {
				this.gmtEnd = gmtEnd;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Boolean getIsInShardingGateway() {
				return this.isInShardingGateway;
			}

			public void setIsInShardingGateway(Boolean isInShardingGateway) {
				this.isInShardingGateway = isInShardingGateway;
			}

			public String getJobDes() {
				return this.jobDes;
			}

			public void setJobDes(String jobDes) {
				this.jobDes = jobDes;
			}

			public Long getJobId() {
				return this.jobId;
			}

			public void setJobId(Long jobId) {
				this.jobId = jobId;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public Boolean getLock() {
				return this.lock;
			}

			public void setLock(Boolean lock) {
				this.lock = lock;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getNeedConfirm() {
				return this.needConfirm;
			}

			public void setNeedConfirm(Boolean needConfirm) {
				this.needConfirm = needConfirm;
			}

			public Long getParallelCount() {
				return this.parallelCount;
			}

			public void setParallelCount(Long parallelCount) {
				this.parallelCount = parallelCount;
			}

			public Long getParentActivityInstanceId() {
				return this.parentActivityInstanceId;
			}

			public void setParentActivityInstanceId(Long parentActivityInstanceId) {
				this.parentActivityInstanceId = parentActivityInstanceId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSubProcessRequestId() {
				return this.subProcessRequestId;
			}

			public void setSubProcessRequestId(String subProcessRequestId) {
				this.subProcessRequestId = subProcessRequestId;
			}

			public Long getSucceedShardingNum() {
				return this.succeedShardingNum;
			}

			public void setSucceedShardingNum(Long succeedShardingNum) {
				this.succeedShardingNum = succeedShardingNum;
			}

			public String getTopologyStatus() {
				return this.topologyStatus;
			}

			public void setTopologyStatus(String topologyStatus) {
				this.topologyStatus = topologyStatus;
			}

			public Long getTotalShardingNum() {
				return this.totalShardingNum;
			}

			public void setTotalShardingNum(Long totalShardingNum) {
				this.totalShardingNum = totalShardingNum;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<ActivityEventsItem> getActivityEvents() {
				return this.activityEvents;
			}

			public void setActivityEvents(List<ActivityEventsItem> activityEvents) {
				this.activityEvents = activityEvents;
			}

			public List<EventsItem> getEvents() {
				return this.events;
			}

			public void setEvents(List<EventsItem> events) {
				this.events = events;
			}

			public static class ActivityEventsItem {

				private Long activityId;

				private String extra;

				private Long id;

				private Long processId;

				private String type;

				public Long getActivityId() {
					return this.activityId;
				}

				public void setActivityId(Long activityId) {
					this.activityId = activityId;
				}

				public String getExtra() {
					return this.extra;
				}

				public void setExtra(String extra) {
					this.extra = extra;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Long getProcessId() {
					return this.processId;
				}

				public void setProcessId(Long processId) {
					this.processId = processId;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class EventsItem {

				private Long activityId;

				private String extra;

				private Long id;

				private Long processId;

				private String type;

				public Long getActivityId() {
					return this.activityId;
				}

				public void setActivityId(Long activityId) {
					this.activityId = activityId;
				}

				public String getExtra() {
					return this.extra;
				}

				public void setExtra(String extra) {
					this.extra = extra;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Long getProcessId() {
					return this.processId;
				}

				public void setProcessId(Long processId) {
					this.processId = processId;
				}

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
	public QueryTSTopologyInstanceResponse getInstance(UnmarshallerContext context) {
		return	QueryTSTopologyInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
