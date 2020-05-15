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
import com.aliyuncs.sofa.transform.v20190815.GetMqSofamqTraceResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMqSofamqTraceResultResponse extends AcsResponse {

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

		private Long createTime;

		private String instanceId;

		private String msgId;

		private String msgKey;

		private String queryId;

		private String status;

		private String topic;

		private Long updateTime;

		private String userId;

		private List<TraceListItem> traceList;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getMsgId() {
			return this.msgId;
		}

		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}

		public String getMsgKey() {
			return this.msgKey;
		}

		public void setMsgKey(String msgKey) {
			this.msgKey = msgKey;
		}

		public String getQueryId() {
			return this.queryId;
		}

		public void setQueryId(String queryId) {
			this.queryId = queryId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public List<TraceListItem> getTraceList() {
			return this.traceList;
		}

		public void setTraceList(List<TraceListItem> traceList) {
			this.traceList = traceList;
		}

		public static class TraceListItem {

			private String bornHost;

			private Long costTime;

			private String msgId;

			private String msgKey;

			private String pubGroupName;

			private Long pubTime;

			private String status;

			private String tag;

			private String topic;

			private List<SubListItem> subList;

			public String getBornHost() {
				return this.bornHost;
			}

			public void setBornHost(String bornHost) {
				this.bornHost = bornHost;
			}

			public Long getCostTime() {
				return this.costTime;
			}

			public void setCostTime(Long costTime) {
				this.costTime = costTime;
			}

			public String getMsgId() {
				return this.msgId;
			}

			public void setMsgId(String msgId) {
				this.msgId = msgId;
			}

			public String getMsgKey() {
				return this.msgKey;
			}

			public void setMsgKey(String msgKey) {
				this.msgKey = msgKey;
			}

			public String getPubGroupName() {
				return this.pubGroupName;
			}

			public void setPubGroupName(String pubGroupName) {
				this.pubGroupName = pubGroupName;
			}

			public Long getPubTime() {
				return this.pubTime;
			}

			public void setPubTime(Long pubTime) {
				this.pubTime = pubTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public List<SubListItem> getSubList() {
				return this.subList;
			}

			public void setSubList(List<SubListItem> subList) {
				this.subList = subList;
			}

			public static class SubListItem {

				private Long failCount;

				private String subGroupName;

				private Long successCount;

				private List<ClientListItem> clientList;

				public Long getFailCount() {
					return this.failCount;
				}

				public void setFailCount(Long failCount) {
					this.failCount = failCount;
				}

				public String getSubGroupName() {
					return this.subGroupName;
				}

				public void setSubGroupName(String subGroupName) {
					this.subGroupName = subGroupName;
				}

				public Long getSuccessCount() {
					return this.successCount;
				}

				public void setSuccessCount(Long successCount) {
					this.successCount = successCount;
				}

				public List<ClientListItem> getClientList() {
					return this.clientList;
				}

				public void setClientList(List<ClientListItem> clientList) {
					this.clientList = clientList;
				}

				public static class ClientListItem {

					private String clientHost;

					private Long costTime;

					private Long reconsumeTimes;

					private String status;

					private String subGroupName;

					private Long subTime;

					public String getClientHost() {
						return this.clientHost;
					}

					public void setClientHost(String clientHost) {
						this.clientHost = clientHost;
					}

					public Long getCostTime() {
						return this.costTime;
					}

					public void setCostTime(Long costTime) {
						this.costTime = costTime;
					}

					public Long getReconsumeTimes() {
						return this.reconsumeTimes;
					}

					public void setReconsumeTimes(Long reconsumeTimes) {
						this.reconsumeTimes = reconsumeTimes;
					}

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}

					public String getSubGroupName() {
						return this.subGroupName;
					}

					public void setSubGroupName(String subGroupName) {
						this.subGroupName = subGroupName;
					}

					public Long getSubTime() {
						return this.subTime;
					}

					public void setSubTime(Long subTime) {
						this.subTime = subTime;
					}
				}
			}
		}
	}

	@Override
	public GetMqSofamqTraceResultResponse getInstance(UnmarshallerContext context) {
		return	GetMqSofamqTraceResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
