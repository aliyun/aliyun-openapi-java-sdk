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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsAnalysisResourceQuotasRequest extends RpcAcsRequest<DescribeRdsAnalysisResourceQuotasResponse> {
	   

	private Long resourceOwnerId;

	private String clusterCategory;

	private String rdsInstanceId;

	private String nodeClass;

	private String storageType;

	private String resourceGroupId;

	private String clusterMode;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer nodeCount;
	public DescribeRdsAnalysisResourceQuotasRequest() {
		super("adb", "2019-03-15", "DescribeRdsAnalysisResourceQuotas", "ads");
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

	public String getClusterCategory() {
		return this.clusterCategory;
	}

	public void setClusterCategory(String clusterCategory) {
		this.clusterCategory = clusterCategory;
		if(clusterCategory != null){
			putQueryParameter("ClusterCategory", clusterCategory);
		}
	}

	public String getRdsInstanceId() {
		return this.rdsInstanceId;
	}

	public void setRdsInstanceId(String rdsInstanceId) {
		this.rdsInstanceId = rdsInstanceId;
		if(rdsInstanceId != null){
			putQueryParameter("RdsInstanceId", rdsInstanceId);
		}
	}

	public String getNodeClass() {
		return this.nodeClass;
	}

	public void setNodeClass(String nodeClass) {
		this.nodeClass = nodeClass;
		if(nodeClass != null){
			putQueryParameter("NodeClass", nodeClass);
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
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

	public String getClusterMode() {
		return this.clusterMode;
	}

	public void setClusterMode(String clusterMode) {
		this.clusterMode = clusterMode;
		if(clusterMode != null){
			putQueryParameter("ClusterMode", clusterMode);
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

	public Integer getNodeCount() {
		return this.nodeCount;
	}

	public void setNodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
		if(nodeCount != null){
			putQueryParameter("NodeCount", nodeCount.toString());
		}
	}

	@Override
	public Class<DescribeRdsAnalysisResourceQuotasResponse> getResponseClass() {
		return DescribeRdsAnalysisResourceQuotasResponse.class;
	}

}
