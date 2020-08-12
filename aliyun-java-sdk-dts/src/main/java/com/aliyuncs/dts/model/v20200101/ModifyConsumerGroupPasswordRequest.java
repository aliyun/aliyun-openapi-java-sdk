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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyConsumerGroupPasswordRequest extends RpcAcsRequest<ModifyConsumerGroupPasswordResponse> {
	   

	private String consumerGroupName;

	private String consumerGroupID;

	private String subscriptionInstanceId;

	private String ownerId;

	private String consumerGroupNewPassword;

	private String consumerGroupPassword;

	private String accountId;

	private String consumerGroupUserName;
	public ModifyConsumerGroupPasswordRequest() {
		super("Dts", "2020-01-01", "ModifyConsumerGroupPassword", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConsumerGroupName() {
		return this.consumerGroupName;
	}

	public void setConsumerGroupName(String consumerGroupName) {
		this.consumerGroupName = consumerGroupName;
		if(consumerGroupName != null){
			putQueryParameter("ConsumerGroupName", consumerGroupName);
		}
	}

	public String getConsumerGroupID() {
		return this.consumerGroupID;
	}

	public void setConsumerGroupID(String consumerGroupID) {
		this.consumerGroupID = consumerGroupID;
		if(consumerGroupID != null){
			putQueryParameter("ConsumerGroupID", consumerGroupID);
		}
	}

	public String getSubscriptionInstanceId() {
		return this.subscriptionInstanceId;
	}

	public void setSubscriptionInstanceId(String subscriptionInstanceId) {
		this.subscriptionInstanceId = subscriptionInstanceId;
		if(subscriptionInstanceId != null){
			putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getConsumerGroupNewPassword() {
		return this.consumerGroupNewPassword;
	}

	public void setConsumerGroupNewPassword(String consumerGroupNewPassword) {
		this.consumerGroupNewPassword = consumerGroupNewPassword;
		if(consumerGroupNewPassword != null){
			putQueryParameter("consumerGroupNewPassword", consumerGroupNewPassword);
		}
	}

	public String getConsumerGroupPassword() {
		return this.consumerGroupPassword;
	}

	public void setConsumerGroupPassword(String consumerGroupPassword) {
		this.consumerGroupPassword = consumerGroupPassword;
		if(consumerGroupPassword != null){
			putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getConsumerGroupUserName() {
		return this.consumerGroupUserName;
	}

	public void setConsumerGroupUserName(String consumerGroupUserName) {
		this.consumerGroupUserName = consumerGroupUserName;
		if(consumerGroupUserName != null){
			putQueryParameter("ConsumerGroupUserName", consumerGroupUserName);
		}
	}

	@Override
	public Class<ModifyConsumerGroupPasswordResponse> getResponseClass() {
		return ModifyConsumerGroupPasswordResponse.class;
	}

}
