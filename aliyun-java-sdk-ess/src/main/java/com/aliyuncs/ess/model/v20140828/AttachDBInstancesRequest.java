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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AttachDBInstancesRequest extends RpcAcsRequest<AttachDBInstancesResponse> {
	   

	private String clientToken;

	private String scalingGroupId;

	private Boolean forceAttach;

	private String type;

	private String attachMode;

	private String resourceOwnerAccount;

	private List<String> dBInstances;

	private Long ownerId;
	public AttachDBInstancesRequest() {
		super("Ess", "2014-08-28", "AttachDBInstances", "ess");
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public Boolean getForceAttach() {
		return this.forceAttach;
	}

	public void setForceAttach(Boolean forceAttach) {
		this.forceAttach = forceAttach;
		if(forceAttach != null){
			putQueryParameter("ForceAttach", forceAttach.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getAttachMode() {
		return this.attachMode;
	}

	public void setAttachMode(String attachMode) {
		this.attachMode = attachMode;
		if(attachMode != null){
			putQueryParameter("AttachMode", attachMode);
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

	public List<String> getDBInstances() {
		return this.dBInstances;
	}

	public void setDBInstances(List<String> dBInstances) {
		this.dBInstances = dBInstances;	
		if (dBInstances != null) {
			for (int i = 0; i < dBInstances.size(); i++) {
				putQueryParameter("DBInstance." + (i + 1) , dBInstances.get(i));
			}
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

	@Override
	public Class<AttachDBInstancesResponse> getResponseClass() {
		return AttachDBInstancesResponse.class;
	}

}
