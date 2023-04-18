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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBInstanceRequest extends RpcAcsRequest<CreateDBInstanceResponse> {
	   

	private String engineVersion;

	private String dBInstanceCategory;

	private String storageType;

	private String resourceGroupId;

	private String dBInstanceDescription;

	private String serverlessMode;

	private List<Tag> tags;

	private String period;

	private Long ownerId;

	private String dBInstanceClass;

	private String securityIPList;

	private String vSwitchId;

	private String privateIpAddress;

	private String zoneId;

	private String instanceNetworkType;

	private String clientToken;

	private String instanceSpec;

	private Long storageSize;

	private String segStorageType;

	private String masterNodeNum;

	private String segNodeNum;

	private String engine;

	private Boolean createSampleData;

	private String dBInstanceGroupCount;

	private String dBInstanceMode;

	private String usedTime;

	private String vPCId;

	private Integer serverlessResource;

	private Integer idleTime;

	private String payType;
	public CreateDBInstanceRequest() {
		super("gpdb", "2016-05-03", "CreateDBInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
		}
	}

	public String getDBInstanceCategory() {
		return this.dBInstanceCategory;
	}

	public void setDBInstanceCategory(String dBInstanceCategory) {
		this.dBInstanceCategory = dBInstanceCategory;
		if(dBInstanceCategory != null){
			putQueryParameter("DBInstanceCategory", dBInstanceCategory);
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

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public String getServerlessMode() {
		return this.serverlessMode;
	}

	public void setServerlessMode(String serverlessMode) {
		this.serverlessMode = serverlessMode;
		if(serverlessMode != null){
			putQueryParameter("ServerlessMode", serverlessMode);
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

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
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

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
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

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
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

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
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

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
		}
	}

	public Long getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
		if(storageSize != null){
			putQueryParameter("StorageSize", storageSize.toString());
		}
	}

	public String getSegStorageType() {
		return this.segStorageType;
	}

	public void setSegStorageType(String segStorageType) {
		this.segStorageType = segStorageType;
		if(segStorageType != null){
			putQueryParameter("SegStorageType", segStorageType);
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

	public String getSegNodeNum() {
		return this.segNodeNum;
	}

	public void setSegNodeNum(String segNodeNum) {
		this.segNodeNum = segNodeNum;
		if(segNodeNum != null){
			putQueryParameter("SegNodeNum", segNodeNum);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public Boolean getCreateSampleData() {
		return this.createSampleData;
	}

	public void setCreateSampleData(Boolean createSampleData) {
		this.createSampleData = createSampleData;
		if(createSampleData != null){
			putQueryParameter("CreateSampleData", createSampleData.toString());
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

	public String getDBInstanceMode() {
		return this.dBInstanceMode;
	}

	public void setDBInstanceMode(String dBInstanceMode) {
		this.dBInstanceMode = dBInstanceMode;
		if(dBInstanceMode != null){
			putQueryParameter("DBInstanceMode", dBInstanceMode);
		}
	}

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
		}
	}

	public Integer getServerlessResource() {
		return this.serverlessResource;
	}

	public void setServerlessResource(Integer serverlessResource) {
		this.serverlessResource = serverlessResource;
		if(serverlessResource != null){
			putQueryParameter("ServerlessResource", serverlessResource.toString());
		}
	}

	public Integer getIdleTime() {
		return this.idleTime;
	}

	public void setIdleTime(Integer idleTime) {
		this.idleTime = idleTime;
		if(idleTime != null){
			putQueryParameter("IdleTime", idleTime.toString());
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
	public Class<CreateDBInstanceResponse> getResponseClass() {
		return CreateDBInstanceResponse.class;
	}

}
