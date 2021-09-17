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

package com.aliyuncs.dyplsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.GetSecretAsrDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecretAsrDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

		private String requestId;

		private String businessId;

		private String businessKey;

		private String code;

		private String msg;

		private Long bizDuration;

		private String type;

		private List<SecretAsrSentenceDTO> sentences;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getBusinessId() {
			return this.businessId;
		}

		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}

		public String getBusinessKey() {
			return this.businessKey;
		}

		public void setBusinessKey(String businessKey) {
			this.businessKey = businessKey;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public Long getBizDuration() {
			return this.bizDuration;
		}

		public void setBizDuration(Long bizDuration) {
			this.bizDuration = bizDuration;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<SecretAsrSentenceDTO> getSentences() {
			return this.sentences;
		}

		public void setSentences(List<SecretAsrSentenceDTO> sentences) {
			this.sentences = sentences;
		}

		public static class SecretAsrSentenceDTO {

			private Long endTime;

			private Long silenceDuration;

			private Long beginTime;

			private String text;

			private Integer channelId;

			private Integer speechRate;

			private String emotionValue;

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Long getSilenceDuration() {
				return this.silenceDuration;
			}

			public void setSilenceDuration(Long silenceDuration) {
				this.silenceDuration = silenceDuration;
			}

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getChannelId() {
				return this.channelId;
			}

			public void setChannelId(Integer channelId) {
				this.channelId = channelId;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public String getEmotionValue() {
				return this.emotionValue;
			}

			public void setEmotionValue(String emotionValue) {
				this.emotionValue = emotionValue;
			}
		}
	}

	@Override
	public GetSecretAsrDetailResponse getInstance(UnmarshallerContext context) {
		return	GetSecretAsrDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
