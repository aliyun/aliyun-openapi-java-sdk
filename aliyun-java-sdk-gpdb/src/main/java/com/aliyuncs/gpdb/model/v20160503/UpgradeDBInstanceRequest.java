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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradeDBInstanceRequest extends RpcAcsRequest<UpgradeDBInstanceResponse> {
	   

	private String instanceSpec;

	private String storageSize;

	private String masterNodeNum;

	private Long upgradeType;

	private String resourceGroupId;

	private String segNodeNum;

	private String dBInstanceId;

	private String dBInstanceGroupCount;

	private Long ownerId;

	private String dBInstanceClass;

	private String payType;
	public UpgradeDBInstanceRequest() {
		super("gpdb", "2016-05-03", "UpgradeDBInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
		}
	}

	public String getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
		if(storageSize != null){
			putQueryParameter("StorageSize", storageSize);
		}
	}

	public String getMasterNodeNum() {
		return this.masterNodeNum;
	}

	public void setMasterNodeNum(String masterNodeNum) {
		this.masterNodeNum = masterNodeNum;
		if(masterNodeNum != null){
			putQueryParameter("MasterNodeNum", masterNodeNum);
		}
	}

	public Long getUpgradeType() {
		return this.upgradeType;
	}

	public void setUpgradeType(Long upgradeType) {
		this.upgradeType = upgradeType;
		if(upgradeType != null){
			putQueryParameter("UpgradeType", upgradeType.toString());
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

	public String getSegNodeNum() {
		return this.segNodeNum;
	}

	public void setSegNodeNum(String segNodeNum) {
		this.segNodeNum = segNodeNum;
		if(segNodeNum != null){
			putQueryParameter("SegNodeNum", segNodeNum);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getDBInstanceGroupCount() {
		return this.dBInstanceGroupCount;
	}

	public void setDBInstanceGroupCount(String dBInstanceGroupCount) {
		this.dBInstanceGroupCount = dBInstanceGroupCount;
		if(dBInstanceGroupCount != null){
			putQueryParameter("DBInstanceGroupCount", dBInstanceGroupCount);
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

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	@Override
	public Class<UpgradeDBInstanceResponse> getResponseClass() {
		return UpgradeDBInstanceResponse.class;
	}

}
