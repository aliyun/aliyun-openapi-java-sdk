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
public class ModifyReplicationJobAttributeRequest extends RpcAcsRequest<ModifyReplicationJobAttributeResponse> {
	   

	private String targetType;

	private String description;

	private Integer frequency;

	private String jobId;

	private String imageName;

	private Integer systemDiskSize;

	private String instanceType;

	private String containerRepository;

	private String containerTag;

	private String containerNamespace;

	private String launchTemplateId;

	private String resourceOwnerAccount;

	private List<SystemDiskPart> systemDiskParts;

	private String validTime;

	private Long ownerId;

	private List<DataDisk> dataDisks;

	private String launchTemplateVersion;

	private String scheduledStartTime;

	private String instanceId;

	private String instanceRamRole;

	private String name;

	private Integer maxNumberOfImageToKeep;
	public ModifyReplicationJobAttributeRequest() {
		super("smc", "2019-06-01", "ModifyReplicationJobAttribute", "smc");
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

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
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

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getContainerRepository() {
		return this.containerRepository;
	}

	public void setContainerRepository(String containerRepository) {
		this.containerRepository = containerRepository;
		if(containerRepository != null){
			putQueryParameter("ContainerRepository", containerRepository);
		}
	}

	public String getContainerTag() {
		return this.containerTag;
	}

	public void setContainerTag(String containerTag) {
		this.containerTag = containerTag;
		if(containerTag != null){
			putQueryParameter("ContainerTag", containerTag);
		}
	}

	public String getContainerNamespace() {
		return this.containerNamespace;
	}

	public void setContainerNamespace(String containerNamespace) {
		this.containerNamespace = containerNamespace;
		if(containerNamespace != null){
			putQueryParameter("ContainerNamespace", containerNamespace);
		}
	}

	public String getLaunchTemplateId() {
		return this.launchTemplateId;
	}

	public void setLaunchTemplateId(String launchTemplateId) {
		this.launchTemplateId = launchTemplateId;
		if(launchTemplateId != null){
			putQueryParameter("LaunchTemplateId", launchTemplateId);
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

	public List<SystemDiskPart> getSystemDiskParts() {
		return this.systemDiskParts;
	}

	public void setSystemDiskParts(List<SystemDiskPart> systemDiskParts) {
		this.systemDiskParts = systemDiskParts;	
		if (systemDiskParts != null) {
			for (int depth1 = 0; depth1 < systemDiskParts.size(); depth1++) {
				putQueryParameter("SystemDiskPart." + (depth1 + 1) + ".SizeBytes" , systemDiskParts.get(depth1).getSizeBytes());
				putQueryParameter("SystemDiskPart." + (depth1 + 1) + ".Block" , systemDiskParts.get(depth1).getBlock());
				putQueryParameter("SystemDiskPart." + (depth1 + 1) + ".Device" , systemDiskParts.get(depth1).getDevice());
			}
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
				if (dataDisks.get(depth1).getParts() != null) {
					for (int depth2 = 0; depth2 < dataDisks.get(depth1).getParts().size(); depth2++) {
						putQueryParameter("DataDisk." + (depth1 + 1) + ".Part." + (depth2 + 1) + ".SizeBytes" , dataDisks.get(depth1).getParts().get(depth2).getSizeBytes());
						putQueryParameter("DataDisk." + (depth1 + 1) + ".Part." + (depth2 + 1) + ".Block" , dataDisks.get(depth1).getParts().get(depth2).getBlock());
						putQueryParameter("DataDisk." + (depth1 + 1) + ".Part." + (depth2 + 1) + ".Device" , dataDisks.get(depth1).getParts().get(depth2).getDevice());
					}
				}
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Index" , dataDisks.get(depth1).getIndex());
			}
		}	
	}

	public String getLaunchTemplateVersion() {
		return this.launchTemplateVersion;
	}

	public void setLaunchTemplateVersion(String launchTemplateVersion) {
		this.launchTemplateVersion = launchTemplateVersion;
		if(launchTemplateVersion != null){
			putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
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

	public String getInstanceRamRole() {
		return this.instanceRamRole;
	}

	public void setInstanceRamRole(String instanceRamRole) {
		this.instanceRamRole = instanceRamRole;
		if(instanceRamRole != null){
			putQueryParameter("InstanceRamRole", instanceRamRole);
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

	public static class SystemDiskPart {

		private Long sizeBytes;

		private Boolean block;

		private String device;

		public Long getSizeBytes() {
			return this.sizeBytes;
		}

		public void setSizeBytes(Long sizeBytes) {
			this.sizeBytes = sizeBytes;
		}

		public Boolean getBlock() {
			return this.block;
		}

		public void setBlock(Boolean block) {
			this.block = block;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}
	}

	public static class DataDisk {

		private Integer size;

		private List<Part> parts;

		private Integer index;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public List<Part> getParts() {
			return this.parts;
		}

		public void setParts(List<Part> parts) {
			this.parts = parts;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public static class Part {

			private Long sizeBytes;

			private Boolean block;

			private String device;

			public Long getSizeBytes() {
				return this.sizeBytes;
			}

			public void setSizeBytes(Long sizeBytes) {
				this.sizeBytes = sizeBytes;
			}

			public Boolean getBlock() {
				return this.block;
			}

			public void setBlock(Boolean block) {
				this.block = block;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}
		}
	}

	@Override
	public Class<ModifyReplicationJobAttributeResponse> getResponseClass() {
		return ModifyReplicationJobAttributeResponse.class;
	}

}
