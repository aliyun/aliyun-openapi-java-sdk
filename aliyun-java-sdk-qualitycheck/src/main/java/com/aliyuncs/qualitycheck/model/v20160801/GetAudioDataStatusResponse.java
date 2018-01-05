/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.qualitycheck.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20160801.GetAudioDataStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAudioDataStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer count;

	private Integer overallStatus;

	private List<TaskAsrResult> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getOverallStatus() {
		return this.overallStatus;
	}

	public void setOverallStatus(Integer overallStatus) {
		this.overallStatus = overallStatus;
	}

	public List<TaskAsrResult> getData() {
		return this.data;
	}

	public void setData(List<TaskAsrResult> data) {
		this.data = data;
	}

	public static class TaskAsrResult {

		private String tid;

		private Integer statusCode;

		private String statusMsg;

		private AsrResult asrResult;

		public String getTid() {
			return this.tid;
		}

		public void setTid(String tid) {
			this.tid = tid;
		}

		public Integer getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(Integer statusCode) {
			this.statusCode = statusCode;
		}

		public String getStatusMsg() {
			return this.statusMsg;
		}

		public void setStatusMsg(String statusMsg) {
			this.statusMsg = statusMsg;
		}

		public AsrResult getAsrResult() {
			return this.asrResult;
		}

		public void setAsrResult(AsrResult asrResult) {
			this.asrResult = asrResult;
		}

		public static class AsrResult {

			private String asrstatus;

			private String asrStatusCode;

			private String errorMessage;

			private List<SentenceResult> sentenceResults;

			public String getAsrstatus() {
				return this.asrstatus;
			}

			public void setAsrstatus(String asrstatus) {
				this.asrstatus = asrstatus;
			}

			public String getAsrStatusCode() {
				return this.asrStatusCode;
			}

			public void setAsrStatusCode(String asrStatusCode) {
				this.asrStatusCode = asrStatusCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public List<SentenceResult> getSentenceResults() {
				return this.sentenceResults;
			}

			public void setSentenceResults(List<SentenceResult> sentenceResults) {
				this.sentenceResults = sentenceResults;
			}

			public static class SentenceResult {

				private Integer beginTime;

				private Integer endTime;

				private Integer channelId;

				private String text;

				private Integer emotionValue;

				private Integer silenceDuration;

				private Integer speechRate;

				private String speakerId;

				private String agentId;

				private String channelKey;

				public Integer getBeginTime() {
					return this.beginTime;
				}

				public void setBeginTime(Integer beginTime) {
					this.beginTime = beginTime;
				}

				public Integer getEndTime() {
					return this.endTime;
				}

				public void setEndTime(Integer endTime) {
					this.endTime = endTime;
				}

				public Integer getChannelId() {
					return this.channelId;
				}

				public void setChannelId(Integer channelId) {
					this.channelId = channelId;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public Integer getEmotionValue() {
					return this.emotionValue;
				}

				public void setEmotionValue(Integer emotionValue) {
					this.emotionValue = emotionValue;
				}

				public Integer getSilenceDuration() {
					return this.silenceDuration;
				}

				public void setSilenceDuration(Integer silenceDuration) {
					this.silenceDuration = silenceDuration;
				}

				public Integer getSpeechRate() {
					return this.speechRate;
				}

				public void setSpeechRate(Integer speechRate) {
					this.speechRate = speechRate;
				}

				public String getSpeakerId() {
					return this.speakerId;
				}

				public void setSpeakerId(String speakerId) {
					this.speakerId = speakerId;
				}

				public String getAgentId() {
					return this.agentId;
				}

				public void setAgentId(String agentId) {
					this.agentId = agentId;
				}

				public String getChannelKey() {
					return this.channelKey;
				}

				public void setChannelKey(String channelKey) {
					this.channelKey = channelKey;
				}
			}
		}
	}

	@Override
	public GetAudioDataStatusResponse getInstance(UnmarshallerContext context) {
		return	GetAudioDataStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
