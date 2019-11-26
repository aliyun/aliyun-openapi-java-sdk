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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TestTtsVoiceRequest extends RpcAcsRequest<TestTtsVoiceResponse> {
	   

	private Long resourceOwnerId;

	private String voiceSpeed;

	private String voiceVolume;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private String voiceStyle;

	private String tts;

	private String voiceType;
	public TestTtsVoiceRequest() {
		super("Dyvms", "2017-06-20", "TestTtsVoice", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getVoiceSpeed() {
		return this.voiceSpeed;
	}

	public void setVoiceSpeed(String voiceSpeed) {
		this.voiceSpeed = voiceSpeed;
		if(voiceSpeed != null){
			putQueryParameter("VoiceSpeed", voiceSpeed);
		}
	}

	public String getVoiceVolume() {
		return this.voiceVolume;
	}

	public void setVoiceVolume(String voiceVolume) {
		this.voiceVolume = voiceVolume;
		if(voiceVolume != null){
			putQueryParameter("VoiceVolume", voiceVolume);
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

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
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

	public String getVoiceStyle() {
		return this.voiceStyle;
	}

	public void setVoiceStyle(String voiceStyle) {
		this.voiceStyle = voiceStyle;
		if(voiceStyle != null){
			putQueryParameter("VoiceStyle", voiceStyle);
		}
	}

	public String getTts() {
		return this.tts;
	}

	public void setTts(String tts) {
		this.tts = tts;
		if(tts != null){
			putQueryParameter("Tts", tts);
		}
	}

	public String getVoiceType() {
		return this.voiceType;
	}

	public void setVoiceType(String voiceType) {
		this.voiceType = voiceType;
		if(voiceType != null){
			putQueryParameter("VoiceType", voiceType);
		}
	}

	@Override
	public Class<TestTtsVoiceResponse> getResponseClass() {
		return TestTtsVoiceResponse.class;
	}

}
