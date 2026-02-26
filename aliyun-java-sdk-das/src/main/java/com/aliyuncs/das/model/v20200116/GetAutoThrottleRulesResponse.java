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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetAutoThrottleRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAutoThrottleRulesResponse extends AcsResponse {

	private Long code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
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

		private Long totalAutoThrottleRulesCount;

		private Long enableAutoThrottleCount;

		private Long turnOffAutoThrottleCount;

		private Long neverEnableAutoThrottleOrReleasedInstanceCount;

		private List<EnableAutoThrottleListItem> enableAutoThrottleList;

		private List<TurnOffAutoThrottleListItem> turnOffAutoThrottleList;

		private List<String> neverEnableAutoThrottleOrReleasedInstanceIdList;

		public Long getTotalAutoThrottleRulesCount() {
			return this.totalAutoThrottleRulesCount;
		}

		public void setTotalAutoThrottleRulesCount(Long totalAutoThrottleRulesCount) {
			this.totalAutoThrottleRulesCount = totalAutoThrottleRulesCount;
		}

		public Long getEnableAutoThrottleCount() {
			return this.enableAutoThrottleCount;
		}

		public void setEnableAutoThrottleCount(Long enableAutoThrottleCount) {
			this.enableAutoThrottleCount = enableAutoThrottleCount;
		}

		public Long getTurnOffAutoThrottleCount() {
			return this.turnOffAutoThrottleCount;
		}

		public void setTurnOffAutoThrottleCount(Long turnOffAutoThrottleCount) {
			this.turnOffAutoThrottleCount = turnOffAutoThrottleCount;
		}

		public Long getNeverEnableAutoThrottleOrReleasedInstanceCount() {
			return this.neverEnableAutoThrottleOrReleasedInstanceCount;
		}

		public void setNeverEnableAutoThrottleOrReleasedInstanceCount(Long neverEnableAutoThrottleOrReleasedInstanceCount) {
			this.neverEnableAutoThrottleOrReleasedInstanceCount = neverEnableAutoThrottleOrReleasedInstanceCount;
		}

		public List<EnableAutoThrottleListItem> getEnableAutoThrottleList() {
			return this.enableAutoThrottleList;
		}

		public void setEnableAutoThrottleList(List<EnableAutoThrottleListItem> enableAutoThrottleList) {
			this.enableAutoThrottleList = enableAutoThrottleList;
		}

		public List<TurnOffAutoThrottleListItem> getTurnOffAutoThrottleList() {
			return this.turnOffAutoThrottleList;
		}

		public void setTurnOffAutoThrottleList(List<TurnOffAutoThrottleListItem> turnOffAutoThrottleList) {
			this.turnOffAutoThrottleList = turnOffAutoThrottleList;
		}

		public List<String> getNeverEnableAutoThrottleOrReleasedInstanceIdList() {
			return this.neverEnableAutoThrottleOrReleasedInstanceIdList;
		}

		public void setNeverEnableAutoThrottleOrReleasedInstanceIdList(List<String> neverEnableAutoThrottleOrReleasedInstanceIdList) {
			this.neverEnableAutoThrottleOrReleasedInstanceIdList = neverEnableAutoThrottleOrReleasedInstanceIdList;
		}

		public static class EnableAutoThrottleListItem {

			private Double abnormalDuration;

			private Double cpuUsage;

			private String cpuSessionRelation;

			private Long activeSessions;

			private Double maxThrottleTime;

			private String allowThrottleStartTime;

			private String allowThrottleEndTime;

			private Boolean visible;

			private Boolean autoKillSession;

			private String instanceId;

			private String userId;

			public Double getAbnormalDuration() {
				return this.abnormalDuration;
			}

			public void setAbnormalDuration(Double abnormalDuration) {
				this.abnormalDuration = abnormalDuration;
			}

			public Double getCpuUsage() {
				return this.cpuUsage;
			}

			public void setCpuUsage(Double cpuUsage) {
				this.cpuUsage = cpuUsage;
			}

			public String getCpuSessionRelation() {
				return this.cpuSessionRelation;
			}

			public void setCpuSessionRelation(String cpuSessionRelation) {
				this.cpuSessionRelation = cpuSessionRelation;
			}

			public Long getActiveSessions() {
				return this.activeSessions;
			}

			public void setActiveSessions(Long activeSessions) {
				this.activeSessions = activeSessions;
			}

			public Double getMaxThrottleTime() {
				return this.maxThrottleTime;
			}

			public void setMaxThrottleTime(Double maxThrottleTime) {
				this.maxThrottleTime = maxThrottleTime;
			}

			public String getAllowThrottleStartTime() {
				return this.allowThrottleStartTime;
			}

			public void setAllowThrottleStartTime(String allowThrottleStartTime) {
				this.allowThrottleStartTime = allowThrottleStartTime;
			}

			public String getAllowThrottleEndTime() {
				return this.allowThrottleEndTime;
			}

			public void setAllowThrottleEndTime(String allowThrottleEndTime) {
				this.allowThrottleEndTime = allowThrottleEndTime;
			}

			public Boolean getVisible() {
				return this.visible;
			}

			public void setVisible(Boolean visible) {
				this.visible = visible;
			}

			public Boolean getAutoKillSession() {
				return this.autoKillSession;
			}

			public void setAutoKillSession(Boolean autoKillSession) {
				this.autoKillSession = autoKillSession;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}

		public static class TurnOffAutoThrottleListItem {

			private Double abnormalDuration;

			private Double cpuUsage;

			private String allowThrottleEndTime;

			private String instanceId;

			private Boolean visible;

			private String cpuSessionRelation;

			private Boolean autoKillSession;

			private Long activeSessions;

			private Double maxThrottleTime;

			private String userId;

			private String allowThrottleStartTime;

			public Double getAbnormalDuration() {
				return this.abnormalDuration;
			}

			public void setAbnormalDuration(Double abnormalDuration) {
				this.abnormalDuration = abnormalDuration;
			}

			public Double getCpuUsage() {
				return this.cpuUsage;
			}

			public void setCpuUsage(Double cpuUsage) {
				this.cpuUsage = cpuUsage;
			}

			public String getAllowThrottleEndTime() {
				return this.allowThrottleEndTime;
			}

			public void setAllowThrottleEndTime(String allowThrottleEndTime) {
				this.allowThrottleEndTime = allowThrottleEndTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getVisible() {
				return this.visible;
			}

			public void setVisible(Boolean visible) {
				this.visible = visible;
			}

			public String getCpuSessionRelation() {
				return this.cpuSessionRelation;
			}

			public void setCpuSessionRelation(String cpuSessionRelation) {
				this.cpuSessionRelation = cpuSessionRelation;
			}

			public Boolean getAutoKillSession() {
				return this.autoKillSession;
			}

			public void setAutoKillSession(Boolean autoKillSession) {
				this.autoKillSession = autoKillSession;
			}

			public Long getActiveSessions() {
				return this.activeSessions;
			}

			public void setActiveSessions(Long activeSessions) {
				this.activeSessions = activeSessions;
			}

			public Double getMaxThrottleTime() {
				return this.maxThrottleTime;
			}

			public void setMaxThrottleTime(Double maxThrottleTime) {
				this.maxThrottleTime = maxThrottleTime;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getAllowThrottleStartTime() {
				return this.allowThrottleStartTime;
			}

			public void setAllowThrottleStartTime(String allowThrottleStartTime) {
				this.allowThrottleStartTime = allowThrottleStartTime;
			}
		}
	}

	@Override
	public GetAutoThrottleRulesResponse getInstance(UnmarshallerContext context) {
		return	GetAutoThrottleRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
