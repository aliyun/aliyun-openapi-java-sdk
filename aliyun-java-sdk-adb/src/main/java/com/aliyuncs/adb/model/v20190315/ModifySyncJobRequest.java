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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySyncJobRequest extends RpcAcsRequest<ModifySyncJobResponse> {
	   

	private Long resourceOwnerId;

	private List<SourceDBCluster> sourceDBClusters;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String syncPlatform;

	private String ownerAccount;

	private Long ownerId;
	public ModifySyncJobRequest() {
		super("adb", "2019-03-15", "ModifySyncJob", "ads");
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

	public List<SourceDBCluster> getSourceDBClusters() {
		return this.sourceDBClusters;
	}

	public void setSourceDBClusters(List<SourceDBCluster> sourceDBClusters) {
		this.sourceDBClusters = sourceDBClusters;	
		if (sourceDBClusters != null) {
			for (int depth1 = 0; depth1 < sourceDBClusters.size(); depth1++) {
				putQueryParameter("SourceDBCluster." + (depth1 + 1) + ".JobId" , sourceDBClusters.get(depth1).getJobId());
				putQueryParameter("SourceDBCluster." + (depth1 + 1) + ".RegionId" , sourceDBClusters.get(depth1).getRegionId());
				putQueryParameter("SourceDBCluster." + (depth1 + 1) + ".OperateType" , sourceDBClusters.get(depth1).getOperateType());
				putQueryParameter("SourceDBCluster." + (depth1 + 1) + ".Type" , sourceDBClusters.get(depth1).getType());
				putQueryParameter("SourceDBCluster." + (depth1 + 1) + ".ClusterIds" , sourceDBClusters.get(depth1).getClusterIds());
			}
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getSyncPlatform() {
		return this.syncPlatform;
	}

	public void setSyncPlatform(String syncPlatform) {
		this.syncPlatform = syncPlatform;
		if(syncPlatform != null){
			putQueryParameter("SyncPlatform", syncPlatform);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public static class SourceDBCluster {

		private String jobId;

		private String regionId;

		private String operateType;

		private String type;

		private String clusterIds;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getClusterIds() {
			return this.clusterIds;
		}

		public void setClusterIds(String clusterIds) {
			this.clusterIds = clusterIds;
		}
	}

	@Override
	public Class<ModifySyncJobResponse> getResponseClass() {
		return ModifySyncJobResponse.class;
	}

}
