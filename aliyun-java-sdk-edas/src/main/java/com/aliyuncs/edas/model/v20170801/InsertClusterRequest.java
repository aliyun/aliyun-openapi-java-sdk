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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertClusterRequest extends RoaAcsRequest<InsertClusterResponse> {
	
	public InsertClusterRequest() {
		super("Edas", "2017-08-01", "InsertCluster", "edas");
		setUriPattern("/pop/v5/resource/cluster");
		setMethod(MethodType.POST);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer clusterType;

	private String iaasProvider;

	private String logicalRegionId;

	private String clusterName;

	private String vpcId;

	private Integer networkMode;

	private Integer oversoldFactor;

	public Integer getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(Integer clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType.toString());
		}
	}

	public String getIaasProvider() {
		return this.iaasProvider;
	}

	public void setIaasProvider(String iaasProvider) {
		this.iaasProvider = iaasProvider;
		if(iaasProvider != null){
			putQueryParameter("IaasProvider", iaasProvider);
		}
	}

	public String getLogicalRegionId() {
		return this.logicalRegionId;
	}

	public void setLogicalRegionId(String logicalRegionId) {
		this.logicalRegionId = logicalRegionId;
		if(logicalRegionId != null){
			putQueryParameter("LogicalRegionId", logicalRegionId);
		}
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Integer getNetworkMode() {
		return this.networkMode;
	}

	public void setNetworkMode(Integer networkMode) {
		this.networkMode = networkMode;
		if(networkMode != null){
			putQueryParameter("NetworkMode", networkMode.toString());
		}
	}

	public Integer getOversoldFactor() {
		return this.oversoldFactor;
	}

	public void setOversoldFactor(Integer oversoldFactor) {
		this.oversoldFactor = oversoldFactor;
		if(oversoldFactor != null){
			putQueryParameter("OversoldFactor", oversoldFactor.toString());
		}
	}

	@Override
	public Class<InsertClusterResponse> getResponseClass() {
		return InsertClusterResponse.class;
	}

}
