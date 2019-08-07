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

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RpcAcsRequest<CreateClusterResponse> {
	
	public CreateClusterRequest() {
		super("mse", "2019-05-31", "CreateCluster", "mse");
	}

	private String clusterType;

	private String vSwitchId;

	private String memoryCapacity;

	private String instanceCount;

	private String vpcId;

	private String netType;

	private String diskCapacity;

	private String requestPars;

	private String cpu;

	private String likeEngines;

	private String appVersion;

	private String diskType;

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putBodyParameter("ClusterType", clusterType);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putBodyParameter("VSwitchId", vSwitchId);
		}
	}

	public String getMemoryCapacity() {
		return this.memoryCapacity;
	}

	public void setMemoryCapacity(String memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
		if(memoryCapacity != null){
			putBodyParameter("MemoryCapacity", memoryCapacity);
		}
	}

	public String getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(String instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putBodyParameter("InstanceCount", instanceCount);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putBodyParameter("NetType", netType);
		}
	}

	public String getDiskCapacity() {
		return this.diskCapacity;
	}

	public void setDiskCapacity(String diskCapacity) {
		this.diskCapacity = diskCapacity;
		if(diskCapacity != null){
			putBodyParameter("DiskCapacity", diskCapacity);
		}
	}

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putBodyParameter("RequestPars", requestPars);
		}
	}

	public String getCpu() {
		return this.cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putBodyParameter("Cpu", cpu);
		}
	}

	public String getLikeEngines() {
		return this.likeEngines;
	}

	public void setLikeEngines(String likeEngines) {
		this.likeEngines = likeEngines;
		if(likeEngines != null){
			putBodyParameter("LikeEngines", likeEngines);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putBodyParameter("AppVersion", appVersion);
		}
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putBodyParameter("DiskType", diskType);
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
