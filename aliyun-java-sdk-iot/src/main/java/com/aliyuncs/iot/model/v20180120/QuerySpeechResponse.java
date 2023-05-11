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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QuerySpeechResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySpeechResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String speechCode;

		private String bizCode;

		private String voice;

		private Integer volume;

		private Integer speechRate;

		private String text;

		private String audioFormat;

		private String speechType;

		private Boolean enableSoundCode;

		private SoundCodeConfig soundCodeConfig;

		public String getSpeechCode() {
			return this.speechCode;
		}

		public void setSpeechCode(String speechCode) {
			this.speechCode = speechCode;
		}

		public String getBizCode() {
			return this.bizCode;
		}

		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}

		public String getVoice() {
			return this.voice;
		}

		public void setVoice(String voice) {
			this.voice = voice;
		}

		public Integer getVolume() {
			return this.volume;
		}

		public void setVolume(Integer volume) {
			this.volume = volume;
		}

		public Integer getSpeechRate() {
			return this.speechRate;
		}

		public void setSpeechRate(Integer speechRate) {
			this.speechRate = speechRate;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getAudioFormat() {
			return this.audioFormat;
		}

		public void setAudioFormat(String audioFormat) {
			this.audioFormat = audioFormat;
		}

		public String getSpeechType() {
			return this.speechType;
		}

		public void setSpeechType(String speechType) {
			this.speechType = speechType;
		}

		public Boolean getEnableSoundCode() {
			return this.enableSoundCode;
		}

		public void setEnableSoundCode(Boolean enableSoundCode) {
			this.enableSoundCode = enableSoundCode;
		}

		public SoundCodeConfig getSoundCodeConfig() {
			return this.soundCodeConfig;
		}

		public void setSoundCodeConfig(SoundCodeConfig soundCodeConfig) {
			this.soundCodeConfig = soundCodeConfig;
		}

		public static class SoundCodeConfig {

			private Integer additionalDuration;

			private String soundCodeContent;

			public Integer getAdditionalDuration() {
				return this.additionalDuration;
			}

			public void setAdditionalDuration(Integer additionalDuration) {
				this.additionalDuration = additionalDuration;
			}

			public String getSoundCodeContent() {
				return this.soundCodeContent;
			}

			public void setSoundCodeContent(String soundCodeContent) {
				this.soundCodeContent = soundCodeContent;
			}
		}
	}

	@Override
	public QuerySpeechResponse getInstance(UnmarshallerContext context) {
		return	QuerySpeechResponseUnmarshaller.unmarshall(this, context);
	}
}
