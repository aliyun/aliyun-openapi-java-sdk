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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindBatchAxgRequest extends RpcAcsRequest<BindBatchAxgResponse> {
	   

	private Long resourceOwnerId;

	@SerializedName("axgBindList")
	private List<AxgBindList> axgBindList;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String poolKey;
	public BindBatchAxgRequest() {
		super("Dyplsapi", "2017-05-25", "BindBatchAxg", "dypls");
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

	public List<AxgBindList> getAxgBindList() {
		return this.axgBindList;
	}

	public void setAxgBindList(List<AxgBindList> axgBindList) {
		this.axgBindList = axgBindList;	
		if (axgBindList != null) {
			putQueryParameter("AxgBindList" , new Gson().toJson(axgBindList));
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

	public String getPoolKey() {
		return this.poolKey;
	}

	public void setPoolKey(String poolKey) {
		this.poolKey = poolKey;
		if(poolKey != null){
			putQueryParameter("PoolKey", poolKey);
		}
	}

	public static class AxgBindList {

		@SerializedName("PhoneNoB")
		private String phoneNoB;

		@SerializedName("PhoneNoA")
		private String phoneNoA;

		@SerializedName("ExpectCity")
		private String expectCity;

		@SerializedName("GroupId")
		private String groupId;

		@SerializedName("CallDisplayType")
		private Integer callDisplayType;

		@SerializedName("OutOrderId")
		private String outOrderId;

		@SerializedName("PhoneNoX")
		private String phoneNoX;

		@SerializedName("IsRecordingEnabled")
		private Boolean isRecordingEnabled;

		@SerializedName("OutId")
		private String outId;

		@SerializedName("Expiration")
		private String expiration;

		@SerializedName("RingConfig")
		private String ringConfig;

		@SerializedName("ASRStatus")
		private Boolean aSRStatus;

		@SerializedName("ASRModelId")
		private String aSRModelId;

		@SerializedName("CallRestrict")
		private String callRestrict;

		public String getPhoneNoB() {
			return this.phoneNoB;
		}

		public void setPhoneNoB(String phoneNoB) {
			this.phoneNoB = phoneNoB;
		}

		public String getPhoneNoA() {
			return this.phoneNoA;
		}

		public void setPhoneNoA(String phoneNoA) {
			this.phoneNoA = phoneNoA;
		}

		public String getExpectCity() {
			return this.expectCity;
		}

		public void setExpectCity(String expectCity) {
			this.expectCity = expectCity;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Integer getCallDisplayType() {
			return this.callDisplayType;
		}

		public void setCallDisplayType(Integer callDisplayType) {
			this.callDisplayType = callDisplayType;
		}

		public String getOutOrderId() {
			return this.outOrderId;
		}

		public void setOutOrderId(String outOrderId) {
			this.outOrderId = outOrderId;
		}

		public String getPhoneNoX() {
			return this.phoneNoX;
		}

		public void setPhoneNoX(String phoneNoX) {
			this.phoneNoX = phoneNoX;
		}

		public Boolean getIsRecordingEnabled() {
			return this.isRecordingEnabled;
		}

		public void setIsRecordingEnabled(Boolean isRecordingEnabled) {
			this.isRecordingEnabled = isRecordingEnabled;
		}

		public String getOutId() {
			return this.outId;
		}

		public void setOutId(String outId) {
			this.outId = outId;
		}

		public String getExpiration() {
			return this.expiration;
		}

		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}

		public String getRingConfig() {
			return this.ringConfig;
		}

		public void setRingConfig(String ringConfig) {
			this.ringConfig = ringConfig;
		}

		public Boolean getASRStatus() {
			return this.aSRStatus;
		}

		public void setASRStatus(Boolean aSRStatus) {
			this.aSRStatus = aSRStatus;
		}

		public String getASRModelId() {
			return this.aSRModelId;
		}

		public void setASRModelId(String aSRModelId) {
			this.aSRModelId = aSRModelId;
		}

		public String getCallRestrict() {
			return this.callRestrict;
		}

		public void setCallRestrict(String callRestrict) {
			this.callRestrict = callRestrict;
		}
	}

	@Override
	public Class<BindBatchAxgResponse> getResponseClass() {
		return BindBatchAxgResponse.class;
	}

}
