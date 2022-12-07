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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePrePayOrderRequest extends RpcAcsRequest<CreatePrePayOrderResponse> {
	   

	private Integer ioMax;

	private Integer eipMax;

	private String specType;

	private String resourceGroupId;

	private List<Tag> tags;

	private Integer partitionNum;

	private Integer diskSize;

	private String ioMaxSpec;

	private String diskType;

	private Integer topicQuota;

	private Integer deployType;
	public CreatePrePayOrderRequest() {
		super("alikafka", "2019-09-16", "CreatePrePayOrder", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public Integer getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Integer diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putQueryParameter("DiskSize", diskSize.toString());
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

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putQueryParameter("DiskType", diskType);
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

	public Integer getDeployType() {
		return this.deployType;
	}

	public void setDeployType(Integer deployType) {
		this.deployType = deployType;
		if(deployType != null){
			putQueryParameter("DeployType", deployType.toString());
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreatePrePayOrderResponse> getResponseClass() {
		return CreatePrePayOrderResponse.class;
	}

}
