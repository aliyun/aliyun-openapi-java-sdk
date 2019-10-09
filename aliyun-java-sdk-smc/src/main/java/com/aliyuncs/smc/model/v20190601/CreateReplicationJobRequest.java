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

package com.aliyuncs.smc.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateReplicationJobRequest extends RpcAcsRequest<CreateReplicationJobResponse> {
	   

	private String targetType;

	private String clientToken;

	private String description;

	private Integer frequency;

	private String replicationParameters;

	private String imageName;

	private Integer systemDiskSize;

	private List<Tag> tags;

	private Integer netMode;

	private String sourceId;

	private Boolean runOnce;

	private String resourceOwnerAccount;

	private String validTime;

	private Long ownerId;

	private List<DataDisk> dataDisks;

	private String vSwitchId;

	private String scheduledStartTime;

	private String instanceId;

	private String vpcId;

	private String name;

	private Integer maxNumberOfImageToKeep;
	public CreateReplicationJobRequest() {
		super("smc", "2019-06-01", "CreateReplicationJob", "smc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putQueryParameter("Frequency", frequency.toString());
		}
	}

	public String getReplicationParameters() {
		return this.replicationParameters;
	}

	public void setReplicationParameters(String replicationParameters) {
		this.replicationParameters = replicationParameters;
		if(replicationParameters != null){
			putQueryParameter("ReplicationParameters", replicationParameters);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
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

	public Integer getNetMode() {
		return this.netMode;
	}

	public void setNetMode(Integer netMode) {
		this.netMode = netMode;
		if(netMode != null){
			putQueryParameter("NetMode", netMode.toString());
		}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putQueryParameter("SourceId", sourceId);
		}
	}

	public Boolean getRunOnce() {
		return this.runOnce;
	}

	public void setRunOnce(Boolean runOnce) {
		this.runOnce = runOnce;
		if(runOnce != null){
			putQueryParameter("RunOnce", runOnce.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getValidTime() {
		return this.validTime;
	}

	public void setValidTime(String validTime) {
		this.validTime = validTime;
		if(validTime != null){
			putQueryParameter("ValidTime", validTime);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;	
		if (dataDisks != null) {
			for (int depth1 = 0; depth1 < dataDisks.size(); depth1++) {
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Index" , dataDisks.get(depth1).getIndex());
			}
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

	public String getScheduledStartTime() {
		return this.scheduledStartTime;
	}

	public void setScheduledStartTime(String scheduledStartTime) {
		this.scheduledStartTime = scheduledStartTime;
		if(scheduledStartTime != null){
			putQueryParameter("ScheduledStartTime", scheduledStartTime);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getMaxNumberOfImageToKeep() {
		return this.maxNumberOfImageToKeep;
	}

	public void setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
		this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
		if(maxNumberOfImageToKeep != null){
			putQueryParameter("MaxNumberOfImageToKeep", maxNumberOfImageToKeep.toString());
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

	public static class DataDisk {

		private Integer size;

		private Integer index;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}
	}

	@Override
	public Class<CreateReplicationJobResponse> getResponseClass() {
		return CreateReplicationJobResponse.class;
	}

}
