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
public class ScalingClusterRequest extends RpcAcsRequest<ScalingClusterResponse> {
	   

	private String clusterSpecification;

	private Integer cpu;

	private String clusterId;

	private String instanceId;

	private Long memoryCapacity;

	private Integer instanceCount;
	public ScalingClusterRequest() {
		super("mse", "2019-05-31", "ScalingCluster", "mse");
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
			putBodyParameter("ClusterSpecification", clusterSpecification);
		}
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putBodyParameter("Cpu", cpu.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Long getMemoryCapacity() {
		return this.memoryCapacity;
	}

	public void setMemoryCapacity(Long memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
		if(memoryCapacity != null){
			putBodyParameter("MemoryCapacity", memoryCapacity.toString());
		}
	}

	public Integer getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(Integer instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putBodyParameter("InstanceCount", instanceCount.toString());
		}
	}

	@Override
	public Class<ScalingClusterResponse> getResponseClass() {
		return ScalingClusterResponse.class;
	}

}
