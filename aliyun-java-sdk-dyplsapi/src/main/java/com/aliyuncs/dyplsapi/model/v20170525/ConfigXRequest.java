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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfigXRequest extends RpcAcsRequest<ConfigXResponse> {
	   

	private Long resourceOwnerId;

	private Long callerParentId;

	private String smsAbility;

	private String telX;

	private String sequenceMode;

	@SerializedName("sequenceCalls")
	private List<SequenceCalls> sequenceCalls;

	private String reqId;

	private String gNFlag;

	private String callAbility;

	private String customerPoolKey;

	private String smsSignMode;

	private String resourceOwnerAccount;

	private Long ownerId;
	public ConfigXRequest() {
		super("Dyplsapi", "2017-05-25", "ConfigX", "dypls");
		setProtocol(ProtocolType.HTTPS);
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

	public Long getCallerParentId() {
		return this.callerParentId;
	}

	public void setCallerParentId(Long callerParentId) {
		this.callerParentId = callerParentId;
		if(callerParentId != null){
			putQueryParameter("CallerParentId", callerParentId.toString());
		}
	}

	public String getSmsAbility() {
		return this.smsAbility;
	}

	public void setSmsAbility(String smsAbility) {
		this.smsAbility = smsAbility;
		if(smsAbility != null){
			putQueryParameter("SmsAbility", smsAbility);
		}
	}

	public String getTelX() {
		return this.telX;
	}

	public void setTelX(String telX) {
		this.telX = telX;
		if(telX != null){
			putQueryParameter("TelX", telX);
		}
	}

	public String getSequenceMode() {
		return this.sequenceMode;
	}

	public void setSequenceMode(String sequenceMode) {
		this.sequenceMode = sequenceMode;
		if(sequenceMode != null){
			putQueryParameter("SequenceMode", sequenceMode);
		}
	}

	public List<SequenceCalls> getSequenceCalls() {
		return this.sequenceCalls;
	}

	public void setSequenceCalls(List<SequenceCalls> sequenceCalls) {
		this.sequenceCalls = sequenceCalls;	
		if (sequenceCalls != null) {
			putQueryParameter("SequenceCalls" , new Gson().toJson(sequenceCalls));
		}	
	}

	public String getReqId() {
		return this.reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
		if(reqId != null){
			putQueryParameter("ReqId", reqId);
		}
	}

	public String getGNFlag() {
		return this.gNFlag;
	}

	public void setGNFlag(String gNFlag) {
		this.gNFlag = gNFlag;
		if(gNFlag != null){
			putQueryParameter("GNFlag", gNFlag);
		}
	}

	public String getCallAbility() {
		return this.callAbility;
	}

	public void setCallAbility(String callAbility) {
		this.callAbility = callAbility;
		if(callAbility != null){
			putQueryParameter("CallAbility", callAbility);
		}
	}

	public String getCustomerPoolKey() {
		return this.customerPoolKey;
	}

	public void setCustomerPoolKey(String customerPoolKey) {
		this.customerPoolKey = customerPoolKey;
		if(customerPoolKey != null){
			putQueryParameter("CustomerPoolKey", customerPoolKey);
		}
	}

	public String getSmsSignMode() {
		return this.smsSignMode;
	}

	public void setSmsSignMode(String smsSignMode) {
		this.smsSignMode = smsSignMode;
		if(smsSignMode != null){
			putQueryParameter("SmsSignMode", smsSignMode);
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

	public static class SequenceCalls {

		@SerializedName("SequenceCallNoPlayCode")
		private String sequenceCallNoPlayCode;

		@SerializedName("SequenceCalledNo")
		private String sequenceCalledNo;

		@SerializedName("SequenceCalledPlayCode")
		private String sequenceCalledPlayCode;

		public String getSequenceCallNoPlayCode() {
			return this.sequenceCallNoPlayCode;
		}

		public void setSequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
			this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
		}

		public String getSequenceCalledNo() {
			return this.sequenceCalledNo;
		}

		public void setSequenceCalledNo(String sequenceCalledNo) {
			this.sequenceCalledNo = sequenceCalledNo;
		}

		public String getSequenceCalledPlayCode() {
			return this.sequenceCalledPlayCode;
		}

		public void setSequenceCalledPlayCode(String sequenceCalledPlayCode) {
			this.sequenceCalledPlayCode = sequenceCalledPlayCode;
		}
	}

	@Override
	public Class<ConfigXResponse> getResponseClass() {
		return ConfigXResponse.class;
	}

}
