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

package com.aliyuncs.ons.model.v20180516;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180516.OnsTraceGetResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsTraceGetResultResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private TraceData traceData;

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

	public TraceData getTraceData() {
		return this.traceData;
	}

	public void setTraceData(TraceData traceData) {
		this.traceData = traceData;
	}

	public static class TraceData {

		private String queryId;

		private String userId;

		private String topic;

		private String msgId;

		private String msgKey;

		private String status;

		private Long createTime;

		private Long updateTime;

		private List<TraceMapDo> traceList;

		public String getQueryId() {
			return this.queryId;
		}

		public void setQueryId(String queryId) {
			this.queryId = queryId;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public List<TraceMapDo> getTraceList() {
			return this.traceList;
		}

		public void setTraceList(List<TraceMapDo> traceList) {
			this.traceList = traceList;
		}

		public static class TraceMapDo {

			private Long pubTime;

			private String topic;

			private String pubGroupName;

			private String msgId;

			private String tag;

			private String msgKey;

			private String bornHost;

			private Integer costTime;

			private String status;

			private List<SubMapDo> subList;

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

			public String getPubGroupName() {
				return this.pubGroupName;
			}

			public void setPubGroupName(String pubGroupName) {
				this.pubGroupName = pubGroupName;
			}

			public String getMsgId() {
				return this.msgId;
			}

			public void setMsgId(String msgId) {
				this.msgId = msgId;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getMsgKey() {
				return this.msgKey;
			}

			public void setMsgKey(String msgKey) {
				this.msgKey = msgKey;
			}

			public String getBornHost() {
				return this.bornHost;
			}

			public void setBornHost(String bornHost) {
				this.bornHost = bornHost;
			}

			public Integer getCostTime() {
				return this.costTime;
			}

			public void setCostTime(Integer costTime) {
				this.costTime = costTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<SubMapDo> getSubList() {
				return this.subList;
			}

			public void setSubList(List<SubMapDo> subList) {
				this.subList = subList;
			}

			public static class SubMapDo {

				private String subGroupName;

				private Integer successCount;

				private Integer failCount;

				private List<SubClientInfoDo> clientList;

				public String getSubGroupName() {
					return this.subGroupName;
				}

				public void setSubGroupName(String subGroupName) {
					this.subGroupName = subGroupName;
				}

				public Integer getSuccessCount() {
					return this.successCount;
				}

				public void setSuccessCount(Integer successCount) {
					this.successCount = successCount;
				}

				public Integer getFailCount() {
					return this.failCount;
				}

				public void setFailCount(Integer failCount) {
					this.failCount = failCount;
				}

				public List<SubClientInfoDo> getClientList() {
					return this.clientList;
				}

				public void setClientList(List<SubClientInfoDo> clientList) {
					this.clientList = clientList;
				}

				public static class SubClientInfoDo {

					private String subGroupName;

					private Long subTime;

					private String clientHost;

					private Integer reconsumeTimes;

					private Integer costTime;

					private String status;

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

					public String getClientHost() {
						return this.clientHost;
					}

					public void setClientHost(String clientHost) {
						this.clientHost = clientHost;
					}

					public Integer getReconsumeTimes() {
						return this.reconsumeTimes;
					}

					public void setReconsumeTimes(Integer reconsumeTimes) {
						this.reconsumeTimes = reconsumeTimes;
					}

					public Integer getCostTime() {
						return this.costTime;
					}

					public void setCostTime(Integer costTime) {
						this.costTime = costTime;
					}

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}
				}
			}
		}
	}

	@Override
	public OnsTraceGetResultResponse getInstance(UnmarshallerContext context) {
		return	OnsTraceGetResultResponseUnmarshaller.unmarshall(this, context);
	}
}
