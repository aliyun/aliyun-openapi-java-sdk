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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyExpressConnectTrafficQosRequest extends RpcAcsRequest<ModifyExpressConnectTrafficQosResponse> {
	   

	private String clientToken;

	private List<RemoveInstanceList> removeInstanceLists;

	private List<AddInstanceList> addInstanceLists;

	private String qosId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String qosName;

	private String qosDescription;
	public ModifyExpressConnectTrafficQosRequest() {
		super("Vpc", "2016-04-28", "ModifyExpressConnectTrafficQos", "vpc");
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

	public List<RemoveInstanceList> getRemoveInstanceLists() {
		return this.removeInstanceLists;
	}

	public void setRemoveInstanceLists(List<RemoveInstanceList> removeInstanceLists) {
		this.removeInstanceLists = removeInstanceLists;	
		if (removeInstanceLists != null) {
			for (int depth1 = 0; depth1 < removeInstanceLists.size(); depth1++) {
				putQueryParameter("RemoveInstanceList." + (depth1 + 1) + ".InstanceId" , removeInstanceLists.get(depth1).getInstanceId());
				putQueryParameter("RemoveInstanceList." + (depth1 + 1) + ".InstanceType" , removeInstanceLists.get(depth1).getInstanceType());
			}
		}	
	}

	public List<AddInstanceList> getAddInstanceLists() {
		return this.addInstanceLists;
	}

	public void setAddInstanceLists(List<AddInstanceList> addInstanceLists) {
		this.addInstanceLists = addInstanceLists;	
		if (addInstanceLists != null) {
			for (int depth1 = 0; depth1 < addInstanceLists.size(); depth1++) {
				putQueryParameter("AddInstanceList." + (depth1 + 1) + ".InstanceId" , addInstanceLists.get(depth1).getInstanceId());
				putQueryParameter("AddInstanceList." + (depth1 + 1) + ".InstanceType" , addInstanceLists.get(depth1).getInstanceType());
			}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getQosName() {
		return this.qosName;
	}

	public void setQosName(String qosName) {
		this.qosName = qosName;
		if(qosName != null){
			putQueryParameter("QosName", qosName);
		}
	}

	public String getQosDescription() {
		return this.qosDescription;
	}

	public void setQosDescription(String qosDescription) {
		this.qosDescription = qosDescription;
		if(qosDescription != null){
			putQueryParameter("QosDescription", qosDescription);
		}
	}

	public static class RemoveInstanceList {

		private String instanceId;

		private String instanceType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	public static class AddInstanceList {

		private String instanceId;

		private String instanceType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public Class<ModifyExpressConnectTrafficQosResponse> getResponseClass() {
		return ModifyExpressConnectTrafficQosResponse.class;
	}

}
