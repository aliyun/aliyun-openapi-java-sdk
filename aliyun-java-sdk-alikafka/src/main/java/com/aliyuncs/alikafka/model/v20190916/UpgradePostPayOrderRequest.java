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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradePostPayOrderRequest extends RpcAcsRequest<UpgradePostPayOrderResponse> {
	   

	@SerializedName("serverlessConfig")
	private ServerlessConfig serverlessConfig;

	private Integer diskSize;

	private Integer ioMax;

	private Boolean eipModel;

	private String ioMaxSpec;

	private Integer topicQuota;

	private Integer eipMax;

	private String specType;

	private String instanceId;

	private Integer partitionNum;
	public UpgradePostPayOrderRequest() {
		super("alikafka", "2019-09-16", "UpgradePostPayOrder", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public ServerlessConfig getServerlessConfig() {
		return this.serverlessConfig;
	}

	public void setServerlessConfig(ServerlessConfig serverlessConfig) {
		this.serverlessConfig = serverlessConfig;	
		if (serverlessConfig != null) {
			putQueryParameter("ServerlessConfig" , new Gson().toJson(serverlessConfig));
		}	
	}

	public Integer getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Integer diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putQueryParameter("DiskSize", diskSize.toString());
		}
	}

	public Integer getIoMax() {
		return this.ioMax;
	}

	public void setIoMax(Integer ioMax) {
		this.ioMax = ioMax;
		if(ioMax != null){
			putQueryParameter("IoMax", ioMax.toString());
		}
	}

	public Boolean getEipModel() {
		return this.eipModel;
	}

	public void setEipModel(Boolean eipModel) {
		this.eipModel = eipModel;
		if(eipModel != null){
			putQueryParameter("EipModel", eipModel.toString());
		}
	}

	public String getIoMaxSpec() {
		return this.ioMaxSpec;
	}

	public void setIoMaxSpec(String ioMaxSpec) {
		this.ioMaxSpec = ioMaxSpec;
		if(ioMaxSpec != null){
			putQueryParameter("IoMaxSpec", ioMaxSpec);
		}
	}

	public Integer getTopicQuota() {
		return this.topicQuota;
	}

	public void setTopicQuota(Integer topicQuota) {
		this.topicQuota = topicQuota;
		if(topicQuota != null){
			putQueryParameter("TopicQuota", topicQuota.toString());
		}
	}

	public Integer getEipMax() {
		return this.eipMax;
	}

	public void setEipMax(Integer eipMax) {
		this.eipMax = eipMax;
		if(eipMax != null){
			putQueryParameter("EipMax", eipMax.toString());
		}
	}

	public String getSpecType() {
		return this.specType;
	}

	public void setSpecType(String specType) {
		this.specType = specType;
		if(specType != null){
			putQueryParameter("SpecType", specType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getPartitionNum() {
		return this.partitionNum;
	}

	public void setPartitionNum(Integer partitionNum) {
		this.partitionNum = partitionNum;
		if(partitionNum != null){
			putQueryParameter("PartitionNum", partitionNum.toString());
		}
	}

	public static class ServerlessConfig {

		@SerializedName("ReservedPublishCapacity")
		private Long reservedPublishCapacity;

		@SerializedName("ReservedSubscribeCapacity")
		private Long reservedSubscribeCapacity;

		public Long getReservedPublishCapacity() {
			return this.reservedPublishCapacity;
		}

		public void setReservedPublishCapacity(Long reservedPublishCapacity) {
			this.reservedPublishCapacity = reservedPublishCapacity;
		}

		public Long getReservedSubscribeCapacity() {
			return this.reservedSubscribeCapacity;
		}

		public void setReservedSubscribeCapacity(Long reservedSubscribeCapacity) {
			this.reservedSubscribeCapacity = reservedSubscribeCapacity;
		}
	}

	@Override
	public Class<UpgradePostPayOrderResponse> getResponseClass() {
		return UpgradePostPayOrderResponse.class;
	}

}
