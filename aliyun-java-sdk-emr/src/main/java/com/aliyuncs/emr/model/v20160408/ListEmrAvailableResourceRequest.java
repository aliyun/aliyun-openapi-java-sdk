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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListEmrAvailableResourceRequest extends RpcAcsRequest<ListEmrAvailableResourceResponse> {
	
	public ListEmrAvailableResourceRequest() {
		super("Emr", "2016-04-08", "ListEmrAvailableResource", "emr");
	}

	private Long resourceOwnerId;

	private String clusterId;

	private String depositType;

	private String destinationResource;

	private String clusterType;

	private String spotStrategy;

	private String systemDiskType;

	private String netType;

	private String zoneId;

	private String instanceType;

	private String dataDiskType;

	private String instanceChargeType;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getDepositType() {
		return this.depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
		if(depositType != null){
			putQueryParameter("DepositType", depositType);
		}
	}

	public String getDestinationResource() {
		return this.destinationResource;
	}

	public void setDestinationResource(String destinationResource) {
		this.destinationResource = destinationResource;
		if(destinationResource != null){
			putQueryParameter("DestinationResource", destinationResource);
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

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public String getSystemDiskType() {
		return this.systemDiskType;
	}

	public void setSystemDiskType(String systemDiskType) {
		this.systemDiskType = systemDiskType;
		if(systemDiskType != null){
			putQueryParameter("SystemDiskType", systemDiskType);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getDataDiskType() {
		return this.dataDiskType;
	}

	public void setDataDiskType(String dataDiskType) {
		this.dataDiskType = dataDiskType;
		if(dataDiskType != null){
			putQueryParameter("DataDiskType", dataDiskType);
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	@Override
	public Class<ListEmrAvailableResourceResponse> getResponseClass() {
		return ListEmrAvailableResourceResponse.class;
	}

}
