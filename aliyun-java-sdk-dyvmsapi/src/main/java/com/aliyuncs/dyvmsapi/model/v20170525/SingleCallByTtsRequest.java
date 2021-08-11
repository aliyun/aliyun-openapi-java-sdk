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
import com.aliyuncs.dyvmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SingleCallByTtsRequest extends RpcAcsRequest<SingleCallByTtsResponse> {
	   

	private Long resourceOwnerId;

	private String ttsParam;

	private Integer speed;

	private String calledNumber;

	private String calledShowNumber;

	private String resourceOwnerAccount;

	private String ttsCode;

	private Integer playTimes;

	private Long ownerId;

	private Integer volume;

	private String outId;
	public SingleCallByTtsRequest() {
		super("Dyvmsapi", "2017-05-25", "SingleCallByTts", "dyvms");
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

	public String getTtsParam() {
		return this.ttsParam;
	}

	public void setTtsParam(String ttsParam) {
		this.ttsParam = ttsParam;
		if(ttsParam != null){
			putQueryParameter("TtsParam", ttsParam);
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

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getTtsCode() {
		return this.ttsCode;
	}

	public void setTtsCode(String ttsCode) {
		this.ttsCode = ttsCode;
		if(ttsCode != null){
			putQueryParameter("TtsCode", ttsCode);
		}
	}

	public Integer getPlayTimes() {
		return this.playTimes;
	}

	public void setPlayTimes(Integer playTimes) {
		this.playTimes = playTimes;
		if(playTimes != null){
			putQueryParameter("PlayTimes", playTimes.toString());
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

	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
		if(volume != null){
			putQueryParameter("Volume", volume.toString());
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

	@Override
	public Class<SingleCallByTtsResponse> getResponseClass() {
		return SingleCallByTtsResponse.class;
	}

}
