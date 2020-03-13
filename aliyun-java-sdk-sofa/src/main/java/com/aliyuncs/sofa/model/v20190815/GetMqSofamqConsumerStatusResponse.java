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
import com.aliyuncs.sofa.transform.v20190815.GetMqSofamqConsumerStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMqSofamqConsumerStatusResponse extends AcsResponse {

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

		private String consumeModel;

		private String consumeTps;

		private Long delayTime;

		private String instanceId;

		private Long lastTimestamp;

		private Boolean online;

		private Boolean rebalanceOk;

		private Boolean subscriptionSame;

		private Long totalDiff;

		private List<ConnectionSetItem> connectionSet;

		private List<ConsumerConnectionInfoListItem> consumerConnectionInfoList;

		private List<DetailInTopicListItem> detailInTopicList;

		public String getConsumeModel() {
			return this.consumeModel;
		}

		public void setConsumeModel(String consumeModel) {
			this.consumeModel = consumeModel;
		}

		public String getConsumeTps() {
			return this.consumeTps;
		}

		public void setConsumeTps(String consumeTps) {
			this.consumeTps = consumeTps;
		}

		public Long getDelayTime() {
			return this.delayTime;
		}

		public void setDelayTime(Long delayTime) {
			this.delayTime = delayTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public Boolean getRebalanceOk() {
			return this.rebalanceOk;
		}

		public void setRebalanceOk(Boolean rebalanceOk) {
			this.rebalanceOk = rebalanceOk;
		}

		public Boolean getSubscriptionSame() {
			return this.subscriptionSame;
		}

		public void setSubscriptionSame(Boolean subscriptionSame) {
			this.subscriptionSame = subscriptionSame;
		}

		public Long getTotalDiff() {
			return this.totalDiff;
		}

		public void setTotalDiff(Long totalDiff) {
			this.totalDiff = totalDiff;
		}

		public List<ConnectionSetItem> getConnectionSet() {
			return this.connectionSet;
		}

		public void setConnectionSet(List<ConnectionSetItem> connectionSet) {
			this.connectionSet = connectionSet;
		}

		public List<ConsumerConnectionInfoListItem> getConsumerConnectionInfoList() {
			return this.consumerConnectionInfoList;
		}

		public void setConsumerConnectionInfoList(List<ConsumerConnectionInfoListItem> consumerConnectionInfoList) {
			this.consumerConnectionInfoList = consumerConnectionInfoList;
		}

		public List<DetailInTopicListItem> getDetailInTopicList() {
			return this.detailInTopicList;
		}

		public void setDetailInTopicList(List<DetailInTopicListItem> detailInTopicList) {
			this.detailInTopicList = detailInTopicList;
		}

		public static class ConnectionSetItem {

			private String clientAddr;

			private String clientId;

			private String language;

			private String remoteIp;

			private String version;

			public String getClientAddr() {
				return this.clientAddr;
			}

			public void setClientAddr(String clientAddr) {
				this.clientAddr = clientAddr;
			}

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getRemoteIp() {
				return this.remoteIp;
			}

			public void setRemoteIp(String remoteIp) {
				this.remoteIp = remoteIp;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}

		public static class ConsumerConnectionInfoListItem {

			private String clientId;

			private String connection;

			private String consumeType;

			private String language;

			private Long lastTimestamp;

			private String messageModel;

			private Long startTimestamp;

			private Long threadCount;

			private String version;

			private List<JstackItem> jstack;

			private List<RunningDataListItem> runningDataList;

			private List<SubscriptionSetItem> subscriptionSet;

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

			public String getConsumeType() {
				return this.consumeType;
			}

			public void setConsumeType(String consumeType) {
				this.consumeType = consumeType;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public Long getLastTimestamp() {
				return this.lastTimestamp;
			}

			public void setLastTimestamp(Long lastTimestamp) {
				this.lastTimestamp = lastTimestamp;
			}

			public String getMessageModel() {
				return this.messageModel;
			}

			public void setMessageModel(String messageModel) {
				this.messageModel = messageModel;
			}

			public Long getStartTimestamp() {
				return this.startTimestamp;
			}

			public void setStartTimestamp(Long startTimestamp) {
				this.startTimestamp = startTimestamp;
			}

			public Long getThreadCount() {
				return this.threadCount;
			}

			public void setThreadCount(Long threadCount) {
				this.threadCount = threadCount;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public List<JstackItem> getJstack() {
				return this.jstack;
			}

			public void setJstack(List<JstackItem> jstack) {
				this.jstack = jstack;
			}

			public List<RunningDataListItem> getRunningDataList() {
				return this.runningDataList;
			}

			public void setRunningDataList(List<RunningDataListItem> runningDataList) {
				this.runningDataList = runningDataList;
			}

			public List<SubscriptionSetItem> getSubscriptionSet() {
				return this.subscriptionSet;
			}

			public void setSubscriptionSet(List<SubscriptionSetItem> subscriptionSet) {
				this.subscriptionSet = subscriptionSet;
			}

			public static class JstackItem {

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

			public static class RunningDataListItem {

				private Long diff;

				private Long failedCountPerHour;

				private String failedTps;

				private String groupId;

				private String okTps;

				private String rt;

				private String topic;

				public Long getDiff() {
					return this.diff;
				}

				public void setDiff(Long diff) {
					this.diff = diff;
				}

				public Long getFailedCountPerHour() {
					return this.failedCountPerHour;
				}

				public void setFailedCountPerHour(Long failedCountPerHour) {
					this.failedCountPerHour = failedCountPerHour;
				}

				public String getFailedTps() {
					return this.failedTps;
				}

				public void setFailedTps(String failedTps) {
					this.failedTps = failedTps;
				}

				public String getGroupId() {
					return this.groupId;
				}

				public void setGroupId(String groupId) {
					this.groupId = groupId;
				}

				public String getOkTps() {
					return this.okTps;
				}

				public void setOkTps(String okTps) {
					this.okTps = okTps;
				}

				public String getRt() {
					return this.rt;
				}

				public void setRt(String rt) {
					this.rt = rt;
				}

				public String getTopic() {
					return this.topic;
				}

				public void setTopic(String topic) {
					this.topic = topic;
				}
			}

			public static class SubscriptionSetItem {

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
		}

		public static class DetailInTopicListItem {

			private Long delayTime;

			private Long lastTimestamp;

			private String topic;

			private Long totalDiff;

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

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public Long getTotalDiff() {
				return this.totalDiff;
			}

			public void setTotalDiff(Long totalDiff) {
				this.totalDiff = totalDiff;
			}
		}
	}

	@Override
	public GetMqSofamqConsumerStatusResponse getInstance(UnmarshallerContext context) {
		return	GetMqSofamqConsumerStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
