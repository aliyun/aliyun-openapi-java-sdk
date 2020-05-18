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
public class CreateClusterRequest extends RpcAcsRequest<CreateClusterResponse> {
	   

	private String clusterSpecification;

	private String pubSlbSpecification;

	private String privateSlbSpecification;

	private Integer instanceCount;

	private String clusterVersion;

	private String diskType;

	private String vSwitchId;

	private String clusterType;

	private String pubNetworkFlow;

	private String vpcId;

	private String netType;

	private String region;
	public CreateClusterRequest() {
		super("mse", "2019-05-31", "CreateCluster", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterSpecification() {
		return this.clusterSpecification;
	}

	public void setClusterSpecification(String clusterSpecification) {
		this.clusterSpecification = clusterSpecification;
		if(clusterSpecification != null){
			putQueryParameter("ClusterSpecification", clusterSpecification);
		}
	}

	public String getPubSlbSpecification() {
		return this.pubSlbSpecification;
	}

	public void setPubSlbSpecification(String pubSlbSpecification) {
		this.pubSlbSpecification = pubSlbSpecification;
		if(pubSlbSpecification != null){
			putQueryParameter("PubSlbSpecification", pubSlbSpecification);
		}
	}

	public String getPrivateSlbSpecification() {
		return this.privateSlbSpecification;
	}

	public void setPrivateSlbSpecification(String privateSlbSpecification) {
		this.privateSlbSpecification = privateSlbSpecification;
		if(privateSlbSpecification != null){
			putQueryParameter("PrivateSlbSpecification", privateSlbSpecification);
		}
	}

	public Integer getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(Integer instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putQueryParameter("InstanceCount", instanceCount.toString());
		}
	}

	public String getClusterVersion() {
		return this.clusterVersion;
	}

	public void setClusterVersion(String clusterVersion) {
		this.clusterVersion = clusterVersion;
		if(clusterVersion != null){
			putQueryParameter("ClusterVersion", clusterVersion);
		}
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putQueryParameter("DiskType", diskType);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
		}
	}

	public String getPubNetworkFlow() {
		return this.pubNetworkFlow;
	}

	public void setPubNetworkFlow(String pubNetworkFlow) {
		this.pubNetworkFlow = pubNetworkFlow;
		if(pubNetworkFlow != null){
			putQueryParameter("PubNetworkFlow", pubNetworkFlow);
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

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
