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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SmartCallRequest extends RpcAcsRequest<SmartCallResponse> {
	   

	private Long resourceOwnerId;

	private String voiceCodeParam;

	private Boolean earlyMediaAsr;

	private Integer speed;

	private String asrBaseId;

	private Integer sessionTimeout;

	private String dynamicId;

	private String calledNumber;

	private Integer ttsSpeed;

	private String voiceCode;

	private String calledShowNumber;

	private Integer actionCodeTimeBreak;

	private Boolean ttsConf;

	private Boolean actionCodeBreak;

	private String resourceOwnerAccount;

	private Boolean recordFlag;

	private Long ownerId;

	private Integer ttsVolume;

	private Integer volume;

	private Integer muteTime;

	private String outId;

	private String asrModelId;

	private Integer pauseTime;

	private String ttsStyle;
	public SmartCallRequest() {
		super("Dyvmsapi", "2017-05-25", "SmartCall", "dyvms");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getVoiceCodeParam() {
		return this.voiceCodeParam;
	}

	public void setVoiceCodeParam(String voiceCodeParam) {
		this.voiceCodeParam = voiceCodeParam;
		if(voiceCodeParam != null){
			putQueryParameter("VoiceCodeParam", voiceCodeParam);
		}
	}

	public Boolean getEarlyMediaAsr() {
		return this.earlyMediaAsr;
	}

	public void setEarlyMediaAsr(Boolean earlyMediaAsr) {
		this.earlyMediaAsr = earlyMediaAsr;
		if(earlyMediaAsr != null){
			putQueryParameter("EarlyMediaAsr", earlyMediaAsr.toString());
		}
	}

	public Integer getSpeed() {
		return this.speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
		if(speed != null){
			putQueryParameter("Speed", speed.toString());
		}
	}

	public String getAsrBaseId() {
		return this.asrBaseId;
	}

	public void setAsrBaseId(String asrBaseId) {
		this.asrBaseId = asrBaseId;
		if(asrBaseId != null){
			putQueryParameter("AsrBaseId", asrBaseId);
		}
	}

	public Integer getSessionTimeout() {
		return this.sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
		if(sessionTimeout != null){
			putQueryParameter("SessionTimeout", sessionTimeout.toString());
		}
	}

	public String getDynamicId() {
		return this.dynamicId;
	}

	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
		if(dynamicId != null){
			putQueryParameter("DynamicId", dynamicId);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public Integer getTtsSpeed() {
		return this.ttsSpeed;
	}

	public void setTtsSpeed(Integer ttsSpeed) {
		this.ttsSpeed = ttsSpeed;
		if(ttsSpeed != null){
			putQueryParameter("TtsSpeed", ttsSpeed.toString());
		}
	}

	public String getVoiceCode() {
		return this.voiceCode;
	}

	public void setVoiceCode(String voiceCode) {
		this.voiceCode = voiceCode;
		if(voiceCode != null){
			putQueryParameter("VoiceCode", voiceCode);
		}
	}

	public String getCalledShowNumber() {
		return this.calledShowNumber;
	}

	public void setCalledShowNumber(String calledShowNumber) {
		this.calledShowNumber = calledShowNumber;
		if(calledShowNumber != null){
			putQueryParameter("CalledShowNumber", calledShowNumber);
		}
	}

	public Integer getActionCodeTimeBreak() {
		return this.actionCodeTimeBreak;
	}

	public void setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
		this.actionCodeTimeBreak = actionCodeTimeBreak;
		if(actionCodeTimeBreak != null){
			putQueryParameter("ActionCodeTimeBreak", actionCodeTimeBreak.toString());
		}
	}

	public Boolean getTtsConf() {
		return this.ttsConf;
	}

	public void setTtsConf(Boolean ttsConf) {
		this.ttsConf = ttsConf;
		if(ttsConf != null){
			putQueryParameter("TtsConf", ttsConf.toString());
		}
	}

	public Boolean getActionCodeBreak() {
		return this.actionCodeBreak;
	}

	public void setActionCodeBreak(Boolean actionCodeBreak) {
		this.actionCodeBreak = actionCodeBreak;
		if(actionCodeBreak != null){
			putQueryParameter("ActionCodeBreak", actionCodeBreak.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Boolean getRecordFlag() {
		return this.recordFlag;
	}

	public void setRecordFlag(Boolean recordFlag) {
		this.recordFlag = recordFlag;
		if(recordFlag != null){
			putQueryParameter("RecordFlag", recordFlag.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getTtsVolume() {
		return this.ttsVolume;
	}

	public void setTtsVolume(Integer ttsVolume) {
		this.ttsVolume = ttsVolume;
		if(ttsVolume != null){
			putQueryParameter("TtsVolume", ttsVolume.toString());
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

	public Integer getMuteTime() {
		return this.muteTime;
	}

	public void setMuteTime(Integer muteTime) {
		this.muteTime = muteTime;
		if(muteTime != null){
			putQueryParameter("MuteTime", muteTime.toString());
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	public String getAsrModelId() {
		return this.asrModelId;
	}

	public void setAsrModelId(String asrModelId) {
		this.asrModelId = asrModelId;
		if(asrModelId != null){
			putQueryParameter("AsrModelId", asrModelId);
		}
	}

	public Integer getPauseTime() {
		return this.pauseTime;
	}

	public void setPauseTime(Integer pauseTime) {
		this.pauseTime = pauseTime;
		if(pauseTime != null){
			putQueryParameter("PauseTime", pauseTime.toString());
		}
	}

	public String getTtsStyle() {
		return this.ttsStyle;
	}

	public void setTtsStyle(String ttsStyle) {
		this.ttsStyle = ttsStyle;
		if(ttsStyle != null){
			putQueryParameter("TtsStyle", ttsStyle);
		}
	}

	@Override
	public Class<SmartCallResponse> getResponseClass() {
		return SmartCallResponse.class;
	}

}
