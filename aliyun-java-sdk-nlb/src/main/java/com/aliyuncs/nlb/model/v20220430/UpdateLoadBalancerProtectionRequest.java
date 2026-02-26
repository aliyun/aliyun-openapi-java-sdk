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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLoadBalancerProtectionRequest extends RpcAcsRequest<UpdateLoadBalancerProtectionResponse> {
	   

	private String deletionProtectionReason;

	private String modificationProtectionReason;

	private String clientToken;

	private Boolean deletionProtectionEnabled;

	private Boolean dryRun;

	private String modificationProtectionStatus;

	private String loadBalancerId;
	public UpdateLoadBalancerProtectionRequest() {
		super("Nlb", "2022-04-30", "UpdateLoadBalancerProtection", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeletionProtectionReason() {
		return this.deletionProtectionReason;
	}

	public void setDeletionProtectionReason(String deletionProtectionReason) {
		this.deletionProtectionReason = deletionProtectionReason;
		if(deletionProtectionReason != null){
			putBodyParameter("DeletionProtectionReason", deletionProtectionReason);
		}
	}

	public String getModificationProtectionReason() {
		return this.modificationProtectionReason;
	}

	public void setModificationProtectionReason(String modificationProtectionReason) {
		this.modificationProtectionReason = modificationProtectionReason;
		if(modificationProtectionReason != null){
			putBodyParameter("ModificationProtectionReason", modificationProtectionReason);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public Boolean getDeletionProtectionEnabled() {
		return this.deletionProtectionEnabled;
	}

	public void setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
		this.deletionProtectionEnabled = deletionProtectionEnabled;
		if(deletionProtectionEnabled != null){
			putBodyParameter("DeletionProtectionEnabled", deletionProtectionEnabled.toString());
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getModificationProtectionStatus() {
		return this.modificationProtectionStatus;
	}

	public void setModificationProtectionStatus(String modificationProtectionStatus) {
		this.modificationProtectionStatus = modificationProtectionStatus;
		if(modificationProtectionStatus != null){
			putBodyParameter("ModificationProtectionStatus", modificationProtectionStatus);
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putBodyParameter("LoadBalancerId", loadBalancerId);
		}
	}

	@Override
	public Class<UpdateLoadBalancerProtectionResponse> getResponseClass() {
		return UpdateLoadBalancerProtectionResponse.class;
	}

}
