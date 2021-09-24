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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGovernanceKubernetesClusterRequest extends RpcAcsRequest<CreateGovernanceKubernetesClusterResponse> {
	   

	private String clusterName;

	private String nameSpaceInfos;

	private String clusterId;

	private String k8sVersion;

	private Long pilotStartTime;
	public CreateGovernanceKubernetesClusterRequest() {
		super("mse", "2019-05-31", "CreateGovernanceKubernetesCluster");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public String getNameSpaceInfos() {
		return this.nameSpaceInfos;
	}

	public void setNameSpaceInfos(String nameSpaceInfos) {
		this.nameSpaceInfos = nameSpaceInfos;
		if(nameSpaceInfos != null){
			putQueryParameter("NameSpaceInfos", nameSpaceInfos);
		}
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

	public String getK8sVersion() {
		return this.k8sVersion;
	}

	public void setK8sVersion(String k8sVersion) {
		this.k8sVersion = k8sVersion;
		if(k8sVersion != null){
			putQueryParameter("K8sVersion", k8sVersion);
		}
	}

	public Long getPilotStartTime() {
		return this.pilotStartTime;
	}

	public void setPilotStartTime(Long pilotStartTime) {
		this.pilotStartTime = pilotStartTime;
		if(pilotStartTime != null){
			putQueryParameter("PilotStartTime", pilotStartTime.toString());
		}
	}

	@Override
	public Class<CreateGovernanceKubernetesClusterResponse> getResponseClass() {
		return CreateGovernanceKubernetesClusterResponse.class;
	}

}
