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

package com.aliyuncs.ons.model.v20190214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsConsumerStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsConsumerStatusResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float consumeTps;

		private String consumeModel;

		private Long totalDiff;

		private String instanceId;

		private Boolean subscriptionSame;

		private Long delayTime;

		private Long lastTimestamp;

		private Boolean online;

		private Boolean rebalanceOK;

		private List<ConnectionDo> connectionSet;

		private List<ConsumerConnectionInfoDo> consumerConnectionInfoList;

		private List<DetailInTopicDo> detailInTopicList;

		public Float getConsumeTps() {
			return this.consumeTps;
		}

		public void setConsumeTps(Float consumeTps) {
			this.consumeTps = consumeTps;
		}

		public String getConsumeModel() {
			return this.consumeModel;
		}

		public void setConsumeModel(String consumeModel) {
			this.consumeModel = consumeModel;
		}

		public Long getTotalDiff() {
			return this.totalDiff;
		}

		public void setTotalDiff(Long totalDiff) {
			this.totalDiff = totalDiff;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getSubscriptionSame() {
			return this.subscriptionSame;
		}

		public void setSubscriptionSame(Boolean subscriptionSame) {
			this.subscriptionSame = subscriptionSame;
		}

		public Long getDelayTime() {
			return this.delayTime;
		}

		public void setDelayTime(Long delayTime) {
			this.delayTime = delayTime;
		}

		public Long getLastTimestamp() {
			return this.lastTimestamp;
		}

		public void setLastTimestamp(Long lastTimestamp) {
			this.lastTimestamp = lastTimestamp;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public Boolean getRebalanceOK() {
			return this.rebalanceOK;
		}

		public void setRebalanceOK(Boolean rebalanceOK) {
			this.rebalanceOK = rebalanceOK;
		}

		public List<ConnectionDo> getConnectionSet() {
			return this.connectionSet;
		}

		public void setConnectionSet(List<ConnectionDo> connectionSet) {
			this.connectionSet = connectionSet;
		}

		public List<ConsumerConnectionInfoDo> getConsumerConnectionInfoList() {
			return this.consumerConnectionInfoList;
		}

		public void setConsumerConnectionInfoList(List<ConsumerConnectionInfoDo> consumerConnectionInfoList) {
			this.consumerConnectionInfoList = consumerConnectionInfoList;
		}

		public List<DetailInTopicDo> getDetailInTopicList() {
			return this.detailInTopicList;
		}

		public void setDetailInTopicList(List<DetailInTopicDo> detailInTopicList) {
			this.detailInTopicList = detailInTopicList;
		}

		public static class ConnectionDo {

			private String remoteIP;

			private String version;

			private String clientAddr;

			private String language;

			private String clientId;

			public String getRemoteIP() {
				return this.remoteIP;
			}

			public void setRemoteIP(String remoteIP) {
				this.remoteIP = remoteIP;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getClientAddr() {
				return this.clientAddr;
			}

			public void setClientAddr(String clientAddr) {
				this.clientAddr = clientAddr;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}
		}

		public static class ConsumerConnectionInfoDo {

			private String consumeModel;

			private Long lastTimeStamp;

			private Long startTimeStamp;

			private String language;

			private String clientId;

			private String connection;

			private String version;

			private String consumeType;

			private Integer threadCount;

			private List<ConsumerRunningDataDo> runningDataList;

			private List<SubscriptionData> subscriptionSet;

			private List<ThreadTrackDo> jstack;

			public String getConsumeModel() {
				return this.consumeModel;
			}

			public void setConsumeModel(String consumeModel) {
				this.consumeModel = consumeModel;
			}

			public Long getLastTimeStamp() {
				return this.lastTimeStamp;
			}

			public void setLastTimeStamp(Long lastTimeStamp) {
				this.lastTimeStamp = lastTimeStamp;
			}

			public Long getStartTimeStamp() {
				return this.startTimeStamp;
			}

			public void setStartTimeStamp(Long startTimeStamp) {
				this.startTimeStamp = startTimeStamp;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getConnection() {
				return this.connection;
			}

			public void setConnection(String connection) {
				this.connection = connection;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getConsumeType() {
				return this.consumeType;
			}

			public void setConsumeType(String consumeType) {
				this.consumeType = consumeType;
			}

			public Integer getThreadCount() {
				return this.threadCount;
			}

			public void setThreadCount(Integer threadCount) {
				this.threadCount = threadCount;
			}

			public List<ConsumerRunningDataDo> getRunningDataList() {
				return this.runningDataList;
			}

			public void setRunningDataList(List<ConsumerRunningDataDo> runningDataList) {
				this.runningDataList = runningDataList;
			}

			public List<SubscriptionData> getSubscriptionSet() {
				return this.subscriptionSet;
			}

			public void setSubscriptionSet(List<SubscriptionData> subscriptionSet) {
				this.subscriptionSet = subscriptionSet;
			}

			public List<ThreadTrackDo> getJstack() {
				return this.jstack;
			}

			public void setJstack(List<ThreadTrackDo> jstack) {
				this.jstack = jstack;
			}

			public static class ConsumerRunningDataDo {

				private String groupId;

				private Float rt;

				private String topic;

				private Long failedCountPerHour;

				private Float okTps;

				private Float failedTps;

				public String getGroupId() {
					return this.groupId;
				}

				public void setGroupId(String groupId) {
					this.groupId = groupId;
				}

				public Float getRt() {
					return this.rt;
				}

				public void setRt(Float rt) {
					this.rt = rt;
				}

				public String getTopic() {
					return this.topic;
				}

				public void setTopic(String topic) {
					this.topic = topic;
				}

				public Long getFailedCountPerHour() {
					return this.failedCountPerHour;
				}

				public void setFailedCountPerHour(Long failedCountPerHour) {
					this.failedCountPerHour = failedCountPerHour;
				}

				public Float getOkTps() {
					return this.okTps;
				}

				public void setOkTps(Float okTps) {
					this.okTps = okTps;
				}

				public Float getFailedTps() {
					return this.failedTps;
				}

				public void setFailedTps(Float failedTps) {
					this.failedTps = failedTps;
				}
			}

			public static class SubscriptionData {

				private String subString;

				private Long subVersion;

				private String topic;

				private List<String> tagsSet;

				public String getSubString() {
					return this.subString;
				}

				public void setSubString(String subString) {
					this.subString = subString;
				}

				public Long getSubVersion() {
					return this.subVersion;
				}

				public void setSubVersion(Long subVersion) {
					this.subVersion = subVersion;
				}

				public String getTopic() {
					return this.topic;
				}

				public void setTopic(String topic) {
					this.topic = topic;
				}

				public List<String> getTagsSet() {
					return this.tagsSet;
				}

				public void setTagsSet(List<String> tagsSet) {
					this.tagsSet = tagsSet;
				}
			}

			public static class ThreadTrackDo {

				private String thread;

				private List<String> trackList;

				public String getThread() {
					return this.thread;
				}

				public void setThread(String thread) {
					this.thread = thread;
				}

				public List<String> getTrackList() {
					return this.trackList;
				}

				public void setTrackList(List<String> trackList) {
					this.trackList = trackList;
				}
			}
		}

		public static class DetailInTopicDo {

			private Long delayTime;

			private Long totalDiff;

			private Long lastTimestamp;

			private String topic;

			public Long getDelayTime() {
				return this.delayTime;
			}

			public void setDelayTime(Long delayTime) {
				this.delayTime = delayTime;
			}

			public Long getTotalDiff() {
				return this.totalDiff;
			}

			public void setTotalDiff(Long totalDiff) {
				this.totalDiff = totalDiff;
			}

			public Long getLastTimestamp() {
				return this.lastTimestamp;
			}

			public void setLastTimestamp(Long lastTimestamp) {
				this.lastTimestamp = lastTimestamp;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}
		}
	}

	@Override
	public OnsConsumerStatusResponse getInstance(UnmarshallerContext context) {
		return	OnsConsumerStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
