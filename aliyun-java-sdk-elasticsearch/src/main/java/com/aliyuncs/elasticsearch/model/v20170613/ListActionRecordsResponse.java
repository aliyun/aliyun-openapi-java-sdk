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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListActionRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListActionRecordsResponse extends AcsResponse {

	private String requestId;

	private List<ActionRecord> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ActionRecord> getResult() {
		return this.result;
	}

	public void setResult(List<ActionRecord> result) {
		this.result = result;
	}

	public static class ActionRecord {

		private String actionName;

		private Map<Object,Object> actionParams;

		private Long endTime;

		private String instanceId;

		private String process;

		private Map<Object,Object> recordDiff;

		private String requestId;

		private Long startTime;

		private String stateType;

		private String userId;

		private String userType;

		private String ownerId;

		private String userInfo;

		private String metaNow;

		private String metaOld;

		private List<StatusInfoItem> statusInfo;

		private List<String> actionResultAccessList;

		private List<String> recordIds;

		public String getActionName() {
			return this.actionName;
		}

		public void setActionName(String actionName) {
			this.actionName = actionName;
		}

		public Map<Object,Object> getActionParams() {
			return this.actionParams;
		}

		public void setActionParams(Map<Object,Object> actionParams) {
			this.actionParams = actionParams;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public Map<Object,Object> getRecordDiff() {
			return this.recordDiff;
		}

		public void setRecordDiff(Map<Object,Object> recordDiff) {
			this.recordDiff = recordDiff;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getStateType() {
			return this.stateType;
		}

		public void setStateType(String stateType) {
			this.stateType = stateType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getUserInfo() {
			return this.userInfo;
		}

		public void setUserInfo(String userInfo) {
			this.userInfo = userInfo;
		}

		public String getMetaNow() {
			return this.metaNow;
		}

		public void setMetaNow(String metaNow) {
			this.metaNow = metaNow;
		}

		public String getMetaOld() {
			return this.metaOld;
		}

		public void setMetaOld(String metaOld) {
			this.metaOld = metaOld;
		}

		public List<StatusInfoItem> getStatusInfo() {
			return this.statusInfo;
		}

		public void setStatusInfo(List<StatusInfoItem> statusInfo) {
			this.statusInfo = statusInfo;
		}

		public List<String> getActionResultAccessList() {
			return this.actionResultAccessList;
		}

		public void setActionResultAccessList(List<String> actionResultAccessList) {
			this.actionResultAccessList = actionResultAccessList;
		}

		public List<String> getRecordIds() {
			return this.recordIds;
		}

		public void setRecordIds(List<String> recordIds) {
			this.recordIds = recordIds;
		}

		public static class StatusInfoItem {

			private String subState;

			private Integer nodeCount;

			private Integer completeNodeCount;

			private String exception;

			private Long latencyMills;

			private String process;

			private Long startTime;

			private Long endTime;

			private String stateType;

			private List<SubStatusInfoItem> subStatusInfo;

			public String getSubState() {
				return this.subState;
			}

			public void setSubState(String subState) {
				this.subState = subState;
			}

			public Integer getNodeCount() {
				return this.nodeCount;
			}

			public void setNodeCount(Integer nodeCount) {
				this.nodeCount = nodeCount;
			}

			public Integer getCompleteNodeCount() {
				return this.completeNodeCount;
			}

			public void setCompleteNodeCount(Integer completeNodeCount) {
				this.completeNodeCount = completeNodeCount;
			}

			public String getException() {
				return this.exception;
			}

			public void setException(String exception) {
				this.exception = exception;
			}

			public Long getLatencyMills() {
				return this.latencyMills;
			}

			public void setLatencyMills(Long latencyMills) {
				this.latencyMills = latencyMills;
			}

			public String getProcess() {
				return this.process;
			}

			public void setProcess(String process) {
				this.process = process;
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

			public String getStateType() {
				return this.stateType;
			}

			public void setStateType(String stateType) {
				this.stateType = stateType;
			}

			public List<SubStatusInfoItem> getSubStatusInfo() {
				return this.subStatusInfo;
			}

			public void setSubStatusInfo(List<SubStatusInfoItem> subStatusInfo) {
				this.subStatusInfo = subStatusInfo;
			}

			public static class SubStatusInfoItem {

				private String subState;

				private Integer nodeCount;

				private Integer completeNodeCount;

				private String exception;

				private Long latencyMills;

				private String process;

				private Long startTime;

				private Long endTime;

				private String stateType;

				public String getSubState() {
					return this.subState;
				}

				public void setSubState(String subState) {
					this.subState = subState;
				}

				public Integer getNodeCount() {
					return this.nodeCount;
				}

				public void setNodeCount(Integer nodeCount) {
					this.nodeCount = nodeCount;
				}

				public Integer getCompleteNodeCount() {
					return this.completeNodeCount;
				}

				public void setCompleteNodeCount(Integer completeNodeCount) {
					this.completeNodeCount = completeNodeCount;
				}

				public String getException() {
					return this.exception;
				}

				public void setException(String exception) {
					this.exception = exception;
				}

				public Long getLatencyMills() {
					return this.latencyMills;
				}

				public void setLatencyMills(Long latencyMills) {
					this.latencyMills = latencyMills;
				}

				public String getProcess() {
					return this.process;
				}

				public void setProcess(String process) {
					this.process = process;
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

				public String getStateType() {
					return this.stateType;
				}

				public void setStateType(String stateType) {
					this.stateType = stateType;
				}
			}
		}
	}

	@Override
	public ListActionRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListActionRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
