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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteWaitingOrdersRequest extends RpcAcsRequest<DeleteWaitingOrdersResponse> {
	   

	private String clientToken;

	private String ownerAccount;

	private Long resourceGroupId;

	private List<String> waitingOrderIds;
	public DeleteWaitingOrdersRequest() {
		super("Ecs", "2016-03-14", "DeleteWaitingOrders", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(Long resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId.toString());
		}
	}

	public List<String> getWaitingOrderIds() {
		return this.waitingOrderIds;
	}

	public void setWaitingOrderIds(List<String> waitingOrderIds) {
		this.waitingOrderIds = waitingOrderIds;	
		if (waitingOrderIds != null) {
			for (int i = 0; i < waitingOrderIds.size(); i++) {
				putQueryParameter("WaitingOrderId." + (i + 1) , waitingOrderIds.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteWaitingOrdersResponse> getResponseClass() {
		return DeleteWaitingOrdersResponse.class;
	}

}
