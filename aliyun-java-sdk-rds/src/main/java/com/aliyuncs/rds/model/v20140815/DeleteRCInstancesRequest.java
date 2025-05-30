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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteRCInstancesRequest extends RpcAcsRequest<DeleteRCInstancesResponse> {
	   

	private Boolean dryRun;

	@SerializedName("instanceId")
	private List<String> instanceId;

	private Boolean terminateSubscription;

	private Boolean force;
	public DeleteRCInstancesRequest() {
		super("Rds", "2014-08-15", "DeleteRCInstances", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<String> getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(List<String> instanceId) {
		this.instanceId = instanceId;	
		if (instanceId != null) {
			putQueryParameter("InstanceId" , new Gson().toJson(instanceId));
		}	
	}

	public Boolean getTerminateSubscription() {
		return this.terminateSubscription;
	}

	public void setTerminateSubscription(Boolean terminateSubscription) {
		this.terminateSubscription = terminateSubscription;
		if(terminateSubscription != null){
			putQueryParameter("TerminateSubscription", terminateSubscription.toString());
		}
	}

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
		}
	}

	@Override
	public Class<DeleteRCInstancesResponse> getResponseClass() {
		return DeleteRCInstancesResponse.class;
	}

}
