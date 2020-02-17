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

/**
 * @author auto create
 * @version 
 */
public class DetachDBInstancesRequest extends RpcAcsRequest<DetachDBInstancesResponse> {
	   

	private String scalingGroupId;

	private String resourceOwnerAccount;

	private List<String> dBInstances;

	private Long ownerId;

	private Boolean forceDetach;
	public DetachDBInstancesRequest() {
		super("Ess", "2014-08-28", "DetachDBInstances", "ess");
		setMethod(MethodType.POST);
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

	public Boolean getForceDetach() {
		return this.forceDetach;
	}

	public void setForceDetach(Boolean forceDetach) {
		this.forceDetach = forceDetach;
		if(forceDetach != null){
			putQueryParameter("ForceDetach", forceDetach.toString());
		}
	}

	@Override
	public Class<DetachDBInstancesResponse> getResponseClass() {
		return DetachDBInstancesResponse.class;
	}

}
