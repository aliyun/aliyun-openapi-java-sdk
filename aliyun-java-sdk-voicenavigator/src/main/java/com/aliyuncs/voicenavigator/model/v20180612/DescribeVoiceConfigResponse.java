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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.DescribeVoiceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVoiceConfigResponse extends AcsResponse {

	private String speechNoiseThreshold;

	private String asrCustomizationId;

	private String voice;

	private String requestId;

	private String asrClassVocabularyId;

	private String asrVocabularyId;

	private String asrAcousticModelId;

	private Integer volume;

	private Integer speechRate;

	private List<Ip> apesIpList;

	public String getSpeechNoiseThreshold() {
		return this.speechNoiseThreshold;
	}

	public void setSpeechNoiseThreshold(String speechNoiseThreshold) {
		this.speechNoiseThreshold = speechNoiseThreshold;
	}

	public String getAsrCustomizationId() {
		return this.asrCustomizationId;
	}

	public void setAsrCustomizationId(String asrCustomizationId) {
		this.asrCustomizationId = asrCustomizationId;
	}

	public String getVoice() {
		return this.voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAsrClassVocabularyId() {
		return this.asrClassVocabularyId;
	}

	public void setAsrClassVocabularyId(String asrClassVocabularyId) {
		this.asrClassVocabularyId = asrClassVocabularyId;
	}

	public String getAsrVocabularyId() {
		return this.asrVocabularyId;
	}

	public void setAsrVocabularyId(String asrVocabularyId) {
		this.asrVocabularyId = asrVocabularyId;
	}

	public String getAsrAcousticModelId() {
		return this.asrAcousticModelId;
	}

	public void setAsrAcousticModelId(String asrAcousticModelId) {
		this.asrAcousticModelId = asrAcousticModelId;
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

	public List<Ip> getApesIpList() {
		return this.apesIpList;
	}

	public void setApesIpList(List<Ip> apesIpList) {
		this.apesIpList = apesIpList;
	}

	public static class Ip {

		private String ip;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}
	}

	@Override
	public DescribeVoiceConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeVoiceConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
