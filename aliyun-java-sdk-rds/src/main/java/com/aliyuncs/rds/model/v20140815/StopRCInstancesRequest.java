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
public class StopRCInstancesRequest extends RpcAcsRequest<StopRCInstancesResponse> {
	   

	private Boolean forceStop;

	@SerializedName("instanceIds")
	private List<String> instanceIds;

	private String batchOptimization;
	public StopRCInstancesRequest() {
		super("Rds", "2014-08-15", "StopRCInstances", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getForceStop() {
		return this.forceStop;
	}

	public void setForceStop(Boolean forceStop) {
		this.forceStop = forceStop;
		if(forceStop != null){
			putQueryParameter("ForceStop", forceStop.toString());
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			putQueryParameter("InstanceIds" , new Gson().toJson(instanceIds));
		}	
	}

	public String getBatchOptimization() {
		return this.batchOptimization;
	}

	public void setBatchOptimization(String batchOptimization) {
		this.batchOptimization = batchOptimization;
		if(batchOptimization != null){
			putQueryParameter("BatchOptimization", batchOptimization);
		}
	}

	@Override
	public Class<StopRCInstancesResponse> getResponseClass() {
		return StopRCInstancesResponse.class;
	}

}
