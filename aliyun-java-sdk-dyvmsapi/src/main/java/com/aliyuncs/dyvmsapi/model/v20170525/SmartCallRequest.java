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

/**
 * @author auto create
 * @version 
 */
public class SmartCallRequest extends RpcAcsRequest<SmartCallResponse> {
	
	public SmartCallRequest() {
		super("Dyvmsapi", "2017-05-25", "SmartCall");
	}

	private Long resourceOwnerId;

	private Boolean actionCodeBreak;

	private String resourceOwnerAccount;

	private Boolean recordFlag;

	private Long ownerId;

	private Integer speed;

	private Integer volume;

	private String dynamicId;

	private String calledNumber;

	private String voiceCode;

	private Integer muteTime;

	private String calledShowNumber;

	private String outId;

	private String asrModelId;

	private Integer pauseTime;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Integer getSpeed() {
		return this.speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
		if(speed != null){
			putQueryParameter("Speed", speed.toString());
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

	public String getVoiceCode() {
		return this.voiceCode;
	}

	public void setVoiceCode(String voiceCode) {
		this.voiceCode = voiceCode;
		if(voiceCode != null){
			putQueryParameter("VoiceCode", voiceCode);
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

	public String getCalledShowNumber() {
		return this.calledShowNumber;
	}

	public void setCalledShowNumber(String calledShowNumber) {
		this.calledShowNumber = calledShowNumber;
		if(calledShowNumber != null){
			putQueryParameter("CalledShowNumber", calledShowNumber);
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

	@Override
	public Class<SmartCallResponse> getResponseClass() {
		return SmartCallResponse.class;
	}

}
