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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTTSConfigRequest extends RpcAcsRequest<ModifyTTSConfigResponse> {
	   

	private String voice;

	private String volume;

	private String instanceId;

	private String speechRate;
	public ModifyTTSConfigRequest() {
		super("VoiceNavigator", "2018-06-12", "ModifyTTSConfig", "voicebot");
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
			putQueryParameter("Voice", voice);
		}
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
		if(volume != null){
			putQueryParameter("Volume", volume);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSpeechRate() {
		return this.speechRate;
	}

	public void setSpeechRate(String speechRate) {
		this.speechRate = speechRate;
		if(speechRate != null){
			putQueryParameter("SpeechRate", speechRate);
		}
	}

	@Override
	public Class<ModifyTTSConfigResponse> getResponseClass() {
		return ModifyTTSConfigResponse.class;
	}

}
