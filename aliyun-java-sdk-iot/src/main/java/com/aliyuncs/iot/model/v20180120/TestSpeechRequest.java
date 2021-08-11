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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TestSpeechRequest extends RpcAcsRequest<TestSpeechResponse> {
	   

	private String voice;

	private String projectCode;

	private String audioFormat;

	private String iotInstanceId;

	private String text;

	private String speechType;

	private Integer volume;

	private Integer speechRate;
	public TestSpeechRequest() {
		super("Iot", "2018-01-20", "TestSpeech", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVoice() {
		return this.voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
		if(voice != null){
			putBodyParameter("Voice", voice);
		}
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
		if(projectCode != null){
			putBodyParameter("ProjectCode", projectCode);
		}
	}

	public String getAudioFormat() {
		return this.audioFormat;
	}

	public void setAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
		if(audioFormat != null){
			putBodyParameter("AudioFormat", audioFormat);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	public String getSpeechType() {
		return this.speechType;
	}

	public void setSpeechType(String speechType) {
		this.speechType = speechType;
		if(speechType != null){
			putBodyParameter("SpeechType", speechType);
		}
	}

	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
		if(volume != null){
			putBodyParameter("Volume", volume.toString());
		}
	}

	public Integer getSpeechRate() {
		return this.speechRate;
	}

	public void setSpeechRate(Integer speechRate) {
		this.speechRate = speechRate;
		if(speechRate != null){
			putBodyParameter("SpeechRate", speechRate.toString());
		}
	}

	@Override
	public Class<TestSpeechResponse> getResponseClass() {
		return TestSpeechResponse.class;
	}

}
