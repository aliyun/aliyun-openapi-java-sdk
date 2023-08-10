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

package com.aliyuncs.adcp.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adcp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployPolicyInstanceRequest extends RpcAcsRequest<DeployPolicyInstanceResponse> {
	   

	private String clusterId;

	private String policyAction;

	@SerializedName("clusterIds")
	private List<String> clusterIds;

	private String policyName;

	@SerializedName("namespaces")
	private List<String> namespaces;
	public DeployPolicyInstanceRequest() {
		super("adcp", "2022-01-01", "DeployPolicyInstance", "adcp");
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

	public String getPolicyAction() {
		return this.policyAction;
	}

	public void setPolicyAction(String policyAction) {
		this.policyAction = policyAction;
		if(policyAction != null){
			putQueryParameter("PolicyAction", policyAction);
		}
	}

	public List<String> getClusterIds() {
		return this.clusterIds;
	}

	public void setClusterIds(List<String> clusterIds) {
		this.clusterIds = clusterIds;	
		if (clusterIds != null) {
			putQueryParameter("ClusterIds" , new Gson().toJson(clusterIds));
		}	
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		if(policyName != null){
			putQueryParameter("PolicyName", policyName);
		}
	}

	public List<String> getNamespaces() {
		return this.namespaces;
	}

	public void setNamespaces(List<String> namespaces) {
		this.namespaces = namespaces;	
		if (namespaces != null) {
			putQueryParameter("Namespaces" , new Gson().toJson(namespaces));
		}	
	}

	@Override
	public Class<DeployPolicyInstanceResponse> getResponseClass() {
		return DeployPolicyInstanceResponse.class;
	}

}
