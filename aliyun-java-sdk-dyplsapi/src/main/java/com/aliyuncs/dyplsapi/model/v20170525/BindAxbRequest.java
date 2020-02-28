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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindAxbRequest extends RpcAcsRequest<BindAxbResponse> {
	   

	private Long resourceOwnerId;

	private Integer callDisplayType;

	private String phoneNoX;

	private String ringConfig;

	private String phoneNoB;

	private String phoneNoA;

	private String expectCity;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String outOrderId;

	private String poolKey;

	private String expiration;

	private Boolean isRecordingEnabled;

	private String outId;

	private String callRestrict;
	public BindAxbRequest() {
		super("Dyplsapi", "2017-05-25", "BindAxb", "dypls");
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

	public Integer getCallDisplayType() {
		return this.callDisplayType;
	}

	public void setCallDisplayType(Integer callDisplayType) {
		this.callDisplayType = callDisplayType;
		if(callDisplayType != null){
			putQueryParameter("CallDisplayType", callDisplayType.toString());
		}
	}

	public String getPhoneNoX() {
		return this.phoneNoX;
	}

	public void setPhoneNoX(String phoneNoX) {
		this.phoneNoX = phoneNoX;
		if(phoneNoX != null){
			putQueryParameter("PhoneNoX", phoneNoX);
		}
	}

	public String getRingConfig() {
		return this.ringConfig;
	}

	public void setRingConfig(String ringConfig) {
		this.ringConfig = ringConfig;
		if(ringConfig != null){
			putQueryParameter("RingConfig", ringConfig);
		}
	}

	public String getPhoneNoB() {
		return this.phoneNoB;
	}

	public void setPhoneNoB(String phoneNoB) {
		this.phoneNoB = phoneNoB;
		if(phoneNoB != null){
			putQueryParameter("PhoneNoB", phoneNoB);
		}
	}

	public String getPhoneNoA() {
		return this.phoneNoA;
	}

	public void setPhoneNoA(String phoneNoA) {
		this.phoneNoA = phoneNoA;
		if(phoneNoA != null){
			putQueryParameter("PhoneNoA", phoneNoA);
		}
	}

	public String getExpectCity() {
		return this.expectCity;
	}

	public void setExpectCity(String expectCity) {
		this.expectCity = expectCity;
		if(expectCity != null){
			putQueryParameter("ExpectCity", expectCity);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
		if(outOrderId != null){
			putQueryParameter("OutOrderId", outOrderId);
		}
	}

	public String getPoolKey() {
		return this.poolKey;
	}

	public void setPoolKey(String poolKey) {
		this.poolKey = poolKey;
		if(poolKey != null){
			putQueryParameter("PoolKey", poolKey);
		}
	}

	public String getExpiration() {
		return this.expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
		if(expiration != null){
			putQueryParameter("Expiration", expiration);
		}
	}

	public Boolean getIsRecordingEnabled() {
		return this.isRecordingEnabled;
	}

	public void setIsRecordingEnabled(Boolean isRecordingEnabled) {
		this.isRecordingEnabled = isRecordingEnabled;
		if(isRecordingEnabled != null){
			putQueryParameter("IsRecordingEnabled", isRecordingEnabled.toString());
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

	public String getCallRestrict() {
		return this.callRestrict;
	}

	public void setCallRestrict(String callRestrict) {
		this.callRestrict = callRestrict;
		if(callRestrict != null){
			putQueryParameter("CallRestrict", callRestrict);
		}
	}

	@Override
	public Class<BindAxbResponse> getResponseClass() {
		return BindAxbResponse.class;
	}

}
