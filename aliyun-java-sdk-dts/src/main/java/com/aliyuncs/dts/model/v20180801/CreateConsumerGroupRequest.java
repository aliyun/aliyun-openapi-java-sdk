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

package com.aliyuncs.dts.model.v20180801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateConsumerGroupRequest extends RpcAcsRequest<CreateConsumerGroupResponse> {
	   

	private String consumerGroupName;

	private String subscriptionInstanceId;

	private String ownerId;

	private String consumerGroupPassword;

	private String consumerGroupUserName;
	public CreateConsumerGroupRequest() {
		super("Dts", "2018-08-01", "CreateConsumerGroup", "dts");
		setMethod(MethodType.POST);
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

	public String getConsumerGroupPassword() {
		return this.consumerGroupPassword;
	}

	public void setConsumerGroupPassword(String consumerGroupPassword) {
		this.consumerGroupPassword = consumerGroupPassword;
		if(consumerGroupPassword != null){
			putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
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
	public Class<CreateConsumerGroupResponse> getResponseClass() {
		return CreateConsumerGroupResponse.class;
	}

}
