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

package com.aliyuncs.qualitycheck.model.v20190115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetPocTestReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPocTestReportResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String asrAccuracyRate;

		private Integer labelNum;

		private Boolean poc;

		private String audioBit;

		private Integer audioNum;

		private String audioSampleRate;

		private String audioTrack;

		private Integer characterNum;

		private String checkCost;

		private String modelName;

		private String pocTime;

		private String ruleInfo;

		private Integer ruleNum;

		private String ruleRealRate;

		public String getAsrAccuracyRate() {
			return this.asrAccuracyRate;
		}

		public void setAsrAccuracyRate(String asrAccuracyRate) {
			this.asrAccuracyRate = asrAccuracyRate;
		}

		public Integer getLabelNum() {
			return this.labelNum;
		}

		public void setLabelNum(Integer labelNum) {
			this.labelNum = labelNum;
		}

		public Boolean getPoc() {
			return this.poc;
		}

		public void setPoc(Boolean poc) {
			this.poc = poc;
		}

		public String getAudioBit() {
			return this.audioBit;
		}

		public void setAudioBit(String audioBit) {
			this.audioBit = audioBit;
		}

		public Integer getAudioNum() {
			return this.audioNum;
		}

		public void setAudioNum(Integer audioNum) {
			this.audioNum = audioNum;
		}

		public String getAudioSampleRate() {
			return this.audioSampleRate;
		}

		public void setAudioSampleRate(String audioSampleRate) {
			this.audioSampleRate = audioSampleRate;
		}

		public String getAudioTrack() {
			return this.audioTrack;
		}

		public void setAudioTrack(String audioTrack) {
			this.audioTrack = audioTrack;
		}

		public Integer getCharacterNum() {
			return this.characterNum;
		}

		public void setCharacterNum(Integer characterNum) {
			this.characterNum = characterNum;
		}

		public String getCheckCost() {
			return this.checkCost;
		}

		public void setCheckCost(String checkCost) {
			this.checkCost = checkCost;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getPocTime() {
			return this.pocTime;
		}

		public void setPocTime(String pocTime) {
			this.pocTime = pocTime;
		}

		public String getRuleInfo() {
			return this.ruleInfo;
		}

		public void setRuleInfo(String ruleInfo) {
			this.ruleInfo = ruleInfo;
		}

		public Integer getRuleNum() {
			return this.ruleNum;
		}

		public void setRuleNum(Integer ruleNum) {
			this.ruleNum = ruleNum;
		}

		public String getRuleRealRate() {
			return this.ruleRealRate;
		}

		public void setRuleRealRate(String ruleRealRate) {
			this.ruleRealRate = ruleRealRate;
		}
	}

	@Override
	public GetPocTestReportResponse getInstance(UnmarshallerContext context) {
		return	GetPocTestReportResponseUnmarshaller.unmarshall(this, context);
	}
}
