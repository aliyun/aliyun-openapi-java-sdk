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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetConsistencySnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConsistencySnapshotResponse extends AcsResponse {

	private String requestId;

	private ConsistencyResult consistencyResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ConsistencyResult getConsistencyResult() {
		return this.consistencyResult;
	}

	public void setConsistencyResult(ConsistencyResult consistencyResult) {
		this.consistencyResult = consistencyResult;
	}

	public static class ConsistencyResult {

		private Long judgeTimestamp;

		private Long lastSlsShardWatermarkTimestamp;

		private Long lastAgentInfoTimestamp;

		private String barrierPointsLastTimestampMap;

		private Long lastBarrierTimestamp;

		private List<AgentHeartbeatInfo> agentHeartbeatInfos;

		private SlsShardWatermarkBean slsShardWatermarkBean;

		public Long getJudgeTimestamp() {
			return this.judgeTimestamp;
		}

		public void setJudgeTimestamp(Long judgeTimestamp) {
			this.judgeTimestamp = judgeTimestamp;
		}

		public Long getLastSlsShardWatermarkTimestamp() {
			return this.lastSlsShardWatermarkTimestamp;
		}

		public void setLastSlsShardWatermarkTimestamp(Long lastSlsShardWatermarkTimestamp) {
			this.lastSlsShardWatermarkTimestamp = lastSlsShardWatermarkTimestamp;
		}

		public Long getLastAgentInfoTimestamp() {
			return this.lastAgentInfoTimestamp;
		}

		public void setLastAgentInfoTimestamp(Long lastAgentInfoTimestamp) {
			this.lastAgentInfoTimestamp = lastAgentInfoTimestamp;
		}

		public String getBarrierPointsLastTimestampMap() {
			return this.barrierPointsLastTimestampMap;
		}

		public void setBarrierPointsLastTimestampMap(String barrierPointsLastTimestampMap) {
			this.barrierPointsLastTimestampMap = barrierPointsLastTimestampMap;
		}

		public Long getLastBarrierTimestamp() {
			return this.lastBarrierTimestamp;
		}

		public void setLastBarrierTimestamp(Long lastBarrierTimestamp) {
			this.lastBarrierTimestamp = lastBarrierTimestamp;
		}

		public List<AgentHeartbeatInfo> getAgentHeartbeatInfos() {
			return this.agentHeartbeatInfos;
		}

		public void setAgentHeartbeatInfos(List<AgentHeartbeatInfo> agentHeartbeatInfos) {
			this.agentHeartbeatInfos = agentHeartbeatInfos;
		}

		public SlsShardWatermarkBean getSlsShardWatermarkBean() {
			return this.slsShardWatermarkBean;
		}

		public void setSlsShardWatermarkBean(SlsShardWatermarkBean slsShardWatermarkBean) {
			this.slsShardWatermarkBean = slsShardWatermarkBean;
		}

		public static class AgentHeartbeatInfo {

			private String regionId;

			private String appType;

			private String pid;

			private String ip;

			private Long startTimestamp;

			private String hostname;

			private String procId;

			private String agentVersion;

			private Long lastHeartbeatTime;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAppType() {
				return this.appType;
			}

			public void setAppType(String appType) {
				this.appType = appType;
			}

			public String getPid() {
				return this.pid;
			}

			public void setPid(String pid) {
				this.pid = pid;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public Long getStartTimestamp() {
				return this.startTimestamp;
			}

			public void setStartTimestamp(Long startTimestamp) {
				this.startTimestamp = startTimestamp;
			}

			public String getHostname() {
				return this.hostname;
			}

			public void setHostname(String hostname) {
				this.hostname = hostname;
			}

			public String getProcId() {
				return this.procId;
			}

			public void setProcId(String procId) {
				this.procId = procId;
			}

			public String getAgentVersion() {
				return this.agentVersion;
			}

			public void setAgentVersion(String agentVersion) {
				this.agentVersion = agentVersion;
			}

			public Long getLastHeartbeatTime() {
				return this.lastHeartbeatTime;
			}

			public void setLastHeartbeatTime(Long lastHeartbeatTime) {
				this.lastHeartbeatTime = lastHeartbeatTime;
			}
		}

		public static class SlsShardWatermarkBean {

			private String pid;

			private String userId;

			private String regionId;

			private String appType;

			private List<CheckPointResponse> checkPointResponses;

			private List<Integer> cursorUpdateTimes;

			public String getPid() {
				return this.pid;
			}

			public void setPid(String pid) {
				this.pid = pid;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAppType() {
				return this.appType;
			}

			public void setAppType(String appType) {
				this.appType = appType;
			}

			public List<CheckPointResponse> getCheckPointResponses() {
				return this.checkPointResponses;
			}

			public void setCheckPointResponses(List<CheckPointResponse> checkPointResponses) {
				this.checkPointResponses = checkPointResponses;
			}

			public List<Integer> getCursorUpdateTimes() {
				return this.cursorUpdateTimes;
			}

			public void setCursorUpdateTimes(List<Integer> cursorUpdateTimes) {
				this.cursorUpdateTimes = cursorUpdateTimes;
			}

			public static class CheckPointResponse {

				private Integer shard;

				private String checkPoint;

				private Long updateTime;

				private String consumer;

				public Integer getShard() {
					return this.shard;
				}

				public void setShard(Integer shard) {
					this.shard = shard;
				}

				public String getCheckPoint() {
					return this.checkPoint;
				}

				public void setCheckPoint(String checkPoint) {
					this.checkPoint = checkPoint;
				}

				public Long getUpdateTime() {
					return this.updateTime;
				}

				public void setUpdateTime(Long updateTime) {
					this.updateTime = updateTime;
				}

				public String getConsumer() {
					return this.consumer;
				}

				public void setConsumer(String consumer) {
					this.consumer = consumer;
				}
			}
		}
	}

	@Override
	public GetConsistencySnapshotResponse getInstance(UnmarshallerContext context) {
		return	GetConsistencySnapshotResponseUnmarshaller.unmarshall(this, context);
	}
}
