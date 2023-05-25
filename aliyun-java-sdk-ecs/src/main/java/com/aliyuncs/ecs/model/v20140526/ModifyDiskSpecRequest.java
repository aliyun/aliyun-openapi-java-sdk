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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDiskSpecRequest extends RpcAcsRequest<ModifyDiskSpecResponse> {
	   

	private Long resourceOwnerId;

	private String diskCategory;

	private String diskId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String performanceLevel;

	private String ownerAccount;

	private PerformanceControlOptions performanceControlOptions;

	private Long ownerId;

	private Long provisionedIops;
	public ModifyDiskSpecRequest() {
		super("Ecs", "2014-05-26", "ModifyDiskSpec", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
		if(diskCategory != null){
			putQueryParameter("DiskCategory", diskCategory);
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getPerformanceLevel() {
		return this.performanceLevel;
	}

	public void setPerformanceLevel(String performanceLevel) {
		this.performanceLevel = performanceLevel;
		if(performanceLevel != null){
			putQueryParameter("PerformanceLevel", performanceLevel);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public PerformanceControlOptions getPerformanceControlOptions() {
		return this.performanceControlOptions;
	}

	public void setPerformanceControlOptions(PerformanceControlOptions performanceControlOptions) {
		this.performanceControlOptions = performanceControlOptions;	
		if (performanceControlOptions != null) {
			
				putQueryParameter("PerformanceControlOptions.IOPS" , performanceControlOptions.getIOPS());
				putQueryParameter("PerformanceControlOptions.Throughput" , performanceControlOptions.getThroughput());
				putQueryParameter("PerformanceControlOptions.Recover" , performanceControlOptions.getRecover());
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

	public Long getProvisionedIops() {
		return this.provisionedIops;
	}

	public void setProvisionedIops(Long provisionedIops) {
		this.provisionedIops = provisionedIops;
		if(provisionedIops != null){
			putQueryParameter("ProvisionedIops", provisionedIops.toString());
		}
	}

	public static class PerformanceControlOptions {

		private Integer iOPS;

		private Integer throughput;

		private String recover;

		public Integer getIOPS() {
			return this.iOPS;
		}

		public void setIOPS(Integer iOPS) {
			this.iOPS = iOPS;
		}

		public Integer getThroughput() {
			return this.throughput;
		}

		public void setThroughput(Integer throughput) {
			this.throughput = throughput;
		}

		public String getRecover() {
			return this.recover;
		}

		public void setRecover(String recover) {
			this.recover = recover;
		}
	}

	@Override
	public Class<ModifyDiskSpecResponse> getResponseClass() {
		return ModifyDiskSpecResponse.class;
	}

}
