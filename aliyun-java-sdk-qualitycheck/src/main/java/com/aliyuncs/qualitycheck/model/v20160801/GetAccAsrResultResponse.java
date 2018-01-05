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
import com.aliyuncs.qualitycheck.transform.v20160801.GetAccAsrResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccAsrResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer count;

	private List<AccAsrSentenceResult> data;

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

	public List<AccAsrSentenceResult> getData() {
		return this.data;
	}

	public void setData(List<AccAsrSentenceResult> data) {
		this.data = data;
	}

	public static class AccAsrSentenceResult {

		private String recordId;

		private String status;

		private String statusCode;

		private String errorMessage;

		private Long duration;

		private Integer interactiveCount;

		private List<SentenceResult> results;

		private ServiceEvStat serviceEvStat;

		private ClientEvStat clientEvStat;

		private ServiceSrStat serviceSrStat;

		private ClientSrStat clientSrStat;

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Integer getInteractiveCount() {
			return this.interactiveCount;
		}

		public void setInteractiveCount(Integer interactiveCount) {
			this.interactiveCount = interactiveCount;
		}

		public List<SentenceResult> getResults() {
			return this.results;
		}

		public void setResults(List<SentenceResult> results) {
			this.results = results;
		}

		public ServiceEvStat getServiceEvStat() {
			return this.serviceEvStat;
		}

		public void setServiceEvStat(ServiceEvStat serviceEvStat) {
			this.serviceEvStat = serviceEvStat;
		}

		public ClientEvStat getClientEvStat() {
			return this.clientEvStat;
		}

		public void setClientEvStat(ClientEvStat clientEvStat) {
			this.clientEvStat = clientEvStat;
		}

		public ServiceSrStat getServiceSrStat() {
			return this.serviceSrStat;
		}

		public void setServiceSrStat(ServiceSrStat serviceSrStat) {
			this.serviceSrStat = serviceSrStat;
		}

		public ClientSrStat getClientSrStat() {
			return this.clientSrStat;
		}

		public void setClientSrStat(ClientSrStat clientSrStat) {
			this.clientSrStat = clientSrStat;
		}

		public static class SentenceResult {

			private Long beginTime;

			private Long endTime;

			private Integer channelId;

			private String text;

			private Integer emotionValue;

			private Integer silenceDuration;

			private Integer speechRate;

			private String speakerId;

			private String agentId;

			private String channelKey;

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
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

		public static class ServiceEvStat {

			private Integer srole;

			private Float smaxEmotionValue;

			private Float sminEmotionValue;

			private Float savgEmotionValue;

			public Integer getSrole() {
				return this.srole;
			}

			public void setSrole(Integer srole) {
				this.srole = srole;
			}

			public Float getSmaxEmotionValue() {
				return this.smaxEmotionValue;
			}

			public void setSmaxEmotionValue(Float smaxEmotionValue) {
				this.smaxEmotionValue = smaxEmotionValue;
			}

			public Float getSminEmotionValue() {
				return this.sminEmotionValue;
			}

			public void setSminEmotionValue(Float sminEmotionValue) {
				this.sminEmotionValue = sminEmotionValue;
			}

			public Float getSavgEmotionValue() {
				return this.savgEmotionValue;
			}

			public void setSavgEmotionValue(Float savgEmotionValue) {
				this.savgEmotionValue = savgEmotionValue;
			}
		}

		public static class ClientEvStat {

			private Integer crole;

			private Float cmaxEmotionValue;

			private Float cminEmotionValue;

			private Float cavgEmotionValue;

			public Integer getCrole() {
				return this.crole;
			}

			public void setCrole(Integer crole) {
				this.crole = crole;
			}

			public Float getCmaxEmotionValue() {
				return this.cmaxEmotionValue;
			}

			public void setCmaxEmotionValue(Float cmaxEmotionValue) {
				this.cmaxEmotionValue = cmaxEmotionValue;
			}

			public Float getCminEmotionValue() {
				return this.cminEmotionValue;
			}

			public void setCminEmotionValue(Float cminEmotionValue) {
				this.cminEmotionValue = cminEmotionValue;
			}

			public Float getCavgEmotionValue() {
				return this.cavgEmotionValue;
			}

			public void setCavgEmotionValue(Float cavgEmotionValue) {
				this.cavgEmotionValue = cavgEmotionValue;
			}
		}

		public static class ServiceSrStat {

			private Integer srole;

			private Float smaxSpeechRate;

			private Float sminSpeechRate;

			private Float savgSpeechRate;

			public Integer getSrole() {
				return this.srole;
			}

			public void setSrole(Integer srole) {
				this.srole = srole;
			}

			public Float getSmaxSpeechRate() {
				return this.smaxSpeechRate;
			}

			public void setSmaxSpeechRate(Float smaxSpeechRate) {
				this.smaxSpeechRate = smaxSpeechRate;
			}

			public Float getSminSpeechRate() {
				return this.sminSpeechRate;
			}

			public void setSminSpeechRate(Float sminSpeechRate) {
				this.sminSpeechRate = sminSpeechRate;
			}

			public Float getSavgSpeechRate() {
				return this.savgSpeechRate;
			}

			public void setSavgSpeechRate(Float savgSpeechRate) {
				this.savgSpeechRate = savgSpeechRate;
			}
		}

		public static class ClientSrStat {

			private Integer crole;

			private Float cmaxSpeechRate;

			private Float cminSpeechRate;

			private Float cavgSpeechRate;

			public Integer getCrole() {
				return this.crole;
			}

			public void setCrole(Integer crole) {
				this.crole = crole;
			}

			public Float getCmaxSpeechRate() {
				return this.cmaxSpeechRate;
			}

			public void setCmaxSpeechRate(Float cmaxSpeechRate) {
				this.cmaxSpeechRate = cmaxSpeechRate;
			}

			public Float getCminSpeechRate() {
				return this.cminSpeechRate;
			}

			public void setCminSpeechRate(Float cminSpeechRate) {
				this.cminSpeechRate = cminSpeechRate;
			}

			public Float getCavgSpeechRate() {
				return this.cavgSpeechRate;
			}

			public void setCavgSpeechRate(Float cavgSpeechRate) {
				this.cavgSpeechRate = cavgSpeechRate;
			}
		}
	}

	@Override
	public GetAccAsrResultResponse getInstance(UnmarshallerContext context) {
		return	GetAccAsrResultResponseUnmarshaller.unmarshall(this, context);
	}
}
