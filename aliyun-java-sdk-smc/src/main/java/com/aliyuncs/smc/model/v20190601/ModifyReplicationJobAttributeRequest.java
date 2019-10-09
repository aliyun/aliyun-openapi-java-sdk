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

	private String resourceOwnerAccount;

	private Long ownerId;

	private List<DataDisk> dataDisks;

	private String scheduledStartTime;

	private String instanceId;

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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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
	public Class<ModifyReplicationJobAttributeResponse> getResponseClass() {
		return ModifyReplicationJobAttributeResponse.class;
	}

}
