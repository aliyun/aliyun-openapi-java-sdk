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
public class DeleteConsumerGroupRequest extends RpcAcsRequest<DeleteConsumerGroupResponse> {
	   

	private String consumerGroupID;

	private String subscriptionInstanceId;

	private String ownerId;
	public DeleteConsumerGroupRequest() {
		super("Dts", "2018-08-01", "DeleteConsumerGroup", "dts");
		setMethod(MethodType.POST);
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

	@Override
	public Class<DeleteConsumerGroupResponse> getResponseClass() {
		return DeleteConsumerGroupResponse.class;
	}

}
