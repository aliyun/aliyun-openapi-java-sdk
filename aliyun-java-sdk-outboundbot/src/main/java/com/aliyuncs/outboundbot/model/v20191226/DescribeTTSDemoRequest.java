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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeTTSDemoRequest extends RpcAcsRequest<DescribeTTSDemoResponse> {
	   

	private String voice;

	private String secretKey;

	private String scriptId;

	private String accessKey;

	private String engine;

	private String text;

	private Integer pitchRate;

	private String aliCustomizedVoice;

	private String nlsServiceType;

	private Integer volume;

	private String instanceId;

	private String appKey;

	private Integer speechRate;
	public DescribeTTSDemoRequest() {
		super("OutboundBot", "2019-12-26", "DescribeTTSDemo", "outboundbot");
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

	public String getSecretKey() {
		return this.secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
		if(secretKey != null){
			putQueryParameter("SecretKey", secretKey);
		}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
		}
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putQueryParameter("AccessKey", accessKey);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putQueryParameter("Text", text);
		}
	}

	public Integer getPitchRate() {
		return this.pitchRate;
	}

	public void setPitchRate(Integer pitchRate) {
		this.pitchRate = pitchRate;
		if(pitchRate != null){
			putQueryParameter("PitchRate", pitchRate.toString());
		}
	}

	public String getAliCustomizedVoice() {
		return this.aliCustomizedVoice;
	}

	public void setAliCustomizedVoice(String aliCustomizedVoice) {
		this.aliCustomizedVoice = aliCustomizedVoice;
		if(aliCustomizedVoice != null){
			putQueryParameter("AliCustomizedVoice", aliCustomizedVoice);
		}
	}

	public String getNlsServiceType() {
		return this.nlsServiceType;
	}

	public void setNlsServiceType(String nlsServiceType) {
		this.nlsServiceType = nlsServiceType;
		if(nlsServiceType != null){
			putQueryParameter("NlsServiceType", nlsServiceType);
		}
	}

	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
		if(volume != null){
			putQueryParameter("Volume", volume.toString());
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

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	public Integer getSpeechRate() {
		return this.speechRate;
	}

	public void setSpeechRate(Integer speechRate) {
		this.speechRate = speechRate;
		if(speechRate != null){
			putQueryParameter("SpeechRate", speechRate.toString());
		}
	}

	@Override
	public Class<DescribeTTSDemoResponse> getResponseClass() {
		return DescribeTTSDemoResponse.class;
	}

}
