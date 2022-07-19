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

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private Data data;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private String msgKey;

		private Long updateTime;

		private Long createTime;

		private String userId;

		private String topic;

		private String instanceId;

		private String msgId;

		private String queryId;

		private List<TraceListItem> traceList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMsgKey() {
			return this.msgKey;
		}

		public void setMsgKey(String msgKey) {
			this.msgKey = msgKey;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
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

		public String getQueryId() {
			return this.queryId;
		}

		public void setQueryId(String queryId) {
			this.queryId = queryId;
		}

		public List<TraceListItem> getTraceList() {
			return this.traceList;
		}

		public void setTraceList(List<TraceListItem> traceList) {
			this.traceList = traceList;
		}

		public static class TraceListItem {

			private String status;

			private String msgKey;

			private Long pubTime;

			private String topic;

			private Long costTime;

			private String tag;

			private String msgId;

			private String pubGroupName;

			private String cell;

			private String bornHost;

			private List<SubListItem> subList;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMsgKey() {
				return this.msgKey;
			}

			public void setMsgKey(String msgKey) {
				this.msgKey = msgKey;
			}

			public Long getPubTime() {
				return this.pubTime;
			}

			public void setPubTime(Long pubTime) {
				this.pubTime = pubTime;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public Long getCostTime() {
				return this.costTime;
			}

			public void setCostTime(Long costTime) {
				this.costTime = costTime;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getMsgId() {
				return this.msgId;
			}

			public void setMsgId(String msgId) {
				this.msgId = msgId;
			}

			public String getPubGroupName() {
				return this.pubGroupName;
			}

			public void setPubGroupName(String pubGroupName) {
				this.pubGroupName = pubGroupName;
			}

			public String getCell() {
				return this.cell;
			}

			public void setCell(String cell) {
				this.cell = cell;
			}

			public String getBornHost() {
				return this.bornHost;
			}

			public void setBornHost(String bornHost) {
				this.bornHost = bornHost;
			}

			public List<SubListItem> getSubList() {
				return this.subList;
			}

			public void setSubList(List<SubListItem> subList) {
				this.subList = subList;
			}

			public static class SubListItem {

				private String subGroupName;

				private Long successCount;

				private Long failCount;

				private String cell;

				private List<ClientListItem> clientList;

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

				public Long getFailCount() {
					return this.failCount;
				}

				public void setFailCount(Long failCount) {
					this.failCount = failCount;
				}

				public String getCell() {
					return this.cell;
				}

				public void setCell(String cell) {
					this.cell = cell;
				}

				public List<ClientListItem> getClientList() {
					return this.clientList;
				}

				public void setClientList(List<ClientListItem> clientList) {
					this.clientList = clientList;
				}

				public static class ClientListItem {

					private String status;

					private Long subTime;

					private Long reconsumeTimes;

					private String clientHost;

					private String subGroupName;

					private Long costTime;

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}

					public Long getSubTime() {
						return this.subTime;
					}

					public void setSubTime(Long subTime) {
						this.subTime = subTime;
					}

					public Long getReconsumeTimes() {
						return this.reconsumeTimes;
					}

					public void setReconsumeTimes(Long reconsumeTimes) {
						this.reconsumeTimes = reconsumeTimes;
					}

					public String getClientHost() {
						return this.clientHost;
					}

					public void setClientHost(String clientHost) {
						this.clientHost = clientHost;
					}

					public String getSubGroupName() {
						return this.subGroupName;
					}

					public void setSubGroupName(String subGroupName) {
						this.subGroupName = subGroupName;
					}

					public Long getCostTime() {
						return this.costTime;
					}

					public void setCostTime(Long costTime) {
						this.costTime = costTime;
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
