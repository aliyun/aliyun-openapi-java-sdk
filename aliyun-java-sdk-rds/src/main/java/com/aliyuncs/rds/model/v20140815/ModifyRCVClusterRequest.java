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
public class ModifyRCVClusterRequest extends RpcAcsRequest<ModifyRCVClusterResponse> {
	   

	private String clusterId;

	@SerializedName("supportDiskPerformanceLevel")
	private List<String> supportDiskPerformanceLevel;
	public ModifyRCVClusterRequest() {
		super("Rds", "2014-08-15", "ModifyRCVCluster", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public List<String> getSupportDiskPerformanceLevel() {
		return this.supportDiskPerformanceLevel;
	}

	public void setSupportDiskPerformanceLevel(List<String> supportDiskPerformanceLevel) {
		this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;	
		if (supportDiskPerformanceLevel != null) {
			putQueryParameter("SupportDiskPerformanceLevel" , new Gson().toJson(supportDiskPerformanceLevel));
		}	
	}

	@Override
	public Class<ModifyRCVClusterResponse> getResponseClass() {
		return ModifyRCVClusterResponse.class;
	}

}
