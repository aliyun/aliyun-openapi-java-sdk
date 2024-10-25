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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateExpressConnectTrafficQosQueueRequest extends RpcAcsRequest<CreateExpressConnectTrafficQosQueueResponse> {
	   

	private String queueName;

	private String clientToken;

	private String queueDescription;

	private String qosId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String queueType;

	private Long ownerId;

	private String bandwidthPercent;
	public CreateExpressConnectTrafficQosQueueRequest() {
		super("Vpc", "2016-04-28", "CreateExpressConnectTrafficQosQueue", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueueName() {
		return this.queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
		if(queueName != null){
			putQueryParameter("QueueName", queueName);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getQueueDescription() {
		return this.queueDescription;
	}

	public void setQueueDescription(String queueDescription) {
		this.queueDescription = queueDescription;
		if(queueDescription != null){
			putQueryParameter("QueueDescription", queueDescription);
		}
	}

	public String getQosId() {
		return this.qosId;
	}

	public void setQosId(String qosId) {
		this.qosId = qosId;
		if(qosId != null){
			putQueryParameter("QosId", qosId);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getQueueType() {
		return this.queueType;
	}

	public void setQueueType(String queueType) {
		this.queueType = queueType;
		if(queueType != null){
			putQueryParameter("QueueType", queueType);
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

	public String getBandwidthPercent() {
		return this.bandwidthPercent;
	}

	public void setBandwidthPercent(String bandwidthPercent) {
		this.bandwidthPercent = bandwidthPercent;
		if(bandwidthPercent != null){
			putQueryParameter("BandwidthPercent", bandwidthPercent);
		}
	}

	@Override
	public Class<CreateExpressConnectTrafficQosQueueResponse> getResponseClass() {
		return CreateExpressConnectTrafficQosQueueResponse.class;
	}

}
