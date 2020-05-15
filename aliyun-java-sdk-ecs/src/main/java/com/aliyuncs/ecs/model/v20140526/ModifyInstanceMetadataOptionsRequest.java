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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceMetadataOptionsRequest extends RpcAcsRequest<ModifyInstanceMetadataOptionsResponse> {
	   

	private Long resourceOwnerId;

	private Integer httpPutResponseHopLimit;

	private String httpEndpoint;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String instanceId;

	private String httpTokens;
	public ModifyInstanceMetadataOptionsRequest() {
		super("Ecs", "2014-05-26", "ModifyInstanceMetadataOptions", "ecs");
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

	public Integer getHttpPutResponseHopLimit() {
		return this.httpPutResponseHopLimit;
	}

	public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
		this.httpPutResponseHopLimit = httpPutResponseHopLimit;
		if(httpPutResponseHopLimit != null){
			putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit.toString());
		}
	}

	public String getHttpEndpoint() {
		return this.httpEndpoint;
	}

	public void setHttpEndpoint(String httpEndpoint) {
		this.httpEndpoint = httpEndpoint;
		if(httpEndpoint != null){
			putQueryParameter("HttpEndpoint", httpEndpoint);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getHttpTokens() {
		return this.httpTokens;
	}

	public void setHttpTokens(String httpTokens) {
		this.httpTokens = httpTokens;
		if(httpTokens != null){
			putQueryParameter("HttpTokens", httpTokens);
		}
	}

	@Override
	public Class<ModifyInstanceMetadataOptionsResponse> getResponseClass() {
		return ModifyInstanceMetadataOptionsResponse.class;
	}

}
