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
public class SuspendProcessesRequest extends RpcAcsRequest<SuspendProcessesResponse> {
	   

	private List<String> processes;

	private String resourceOwnerAccount;

	private String scalingGroupId;

	private Long ownerId;
	public SuspendProcessesRequest() {
		super("Ess", "2014-08-28", "SuspendProcesses", "ess");
		setMethod(MethodType.POST);
	}

	public List<String> getProcesses() {
		return this.processes;
	}

	public void setProcesses(List<String> processes) {
		this.processes = processes;
		if (processes != null) {
			for (int i = 0; i < processes.size(); i++) {
				putQueryParameter("Process." + (i + 1) , processes.get(i));
			}
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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
	public Class<SuspendProcessesResponse> getResponseClass() {
		return SuspendProcessesResponse.class;
	}

}
