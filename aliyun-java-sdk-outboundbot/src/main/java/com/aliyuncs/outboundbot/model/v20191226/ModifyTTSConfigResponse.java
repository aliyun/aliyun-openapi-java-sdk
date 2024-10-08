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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ModifyTTSConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyTTSConfigResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private TTSConfig tTSConfig;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public TTSConfig getTTSConfig() {
		return this.tTSConfig;
	}

	public void setTTSConfig(TTSConfig tTSConfig) {
		this.tTSConfig = tTSConfig;
	}

	public static class TTSConfig {

		private String voice;

		private String tTSConfigId;

		private String speechRate;

		private String volume;

		private String instanceId;

		private String scriptId;

		private String pitchRate;

		public String getVoice() {
			return this.voice;
		}

		public void setVoice(String voice) {
			this.voice = voice;
		}

		public String getTTSConfigId() {
			return this.tTSConfigId;
		}

		public void setTTSConfigId(String tTSConfigId) {
			this.tTSConfigId = tTSConfigId;
		}

		public String getSpeechRate() {
			return this.speechRate;
		}

		public void setSpeechRate(String speechRate) {
			this.speechRate = speechRate;
		}

		public String getVolume() {
			return this.volume;
		}

		public void setVolume(String volume) {
			this.volume = volume;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getPitchRate() {
			return this.pitchRate;
		}

		public void setPitchRate(String pitchRate) {
			this.pitchRate = pitchRate;
		}
	}

	@Override
	public ModifyTTSConfigResponse getInstance(UnmarshallerContext context) {
		return	ModifyTTSConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
