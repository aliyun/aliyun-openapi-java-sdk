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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHighReliablePhysicalConnectionRequest extends RpcAcsRequest<CreateHighReliablePhysicalConnectionResponse> {
	   

	private Long resourceOwnerId;

	private String portType;

	private String clientToken;

	private String highReliableType;

	private String resourceGroupId;

	private List<Tag> tags;

	private String dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<ApList> apLists;

	private String acceptLanguage;

	private List<String> deviceAdvancedCapacitys;
	public CreateHighReliablePhysicalConnectionRequest() {
		super("Vpc", "2016-04-28", "CreateHighReliablePhysicalConnection", "vpc");
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

	public String getPortType() {
		return this.portType;
	}

	public void setPortType(String portType) {
		this.portType = portType;
		if(portType != null){
			putQueryParameter("PortType", portType);
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

	public String getHighReliableType() {
		return this.highReliableType;
	}

	public void setHighReliableType(String highReliableType) {
		this.highReliableType = highReliableType;
		if(highReliableType != null){
			putQueryParameter("HighReliableType", highReliableType);
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
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(String dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun);
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

	public List<ApList> getApLists() {
		return this.apLists;
	}

	public void setApLists(List<ApList> apLists) {
		this.apLists = apLists;	
		if (apLists != null) {
			for (int depth1 = 0; depth1 < apLists.size(); depth1++) {
				putQueryParameter("ApList." + (depth1 + 1) + ".Name" , apLists.get(depth1).getName());
				putQueryParameter("ApList." + (depth1 + 1) + ".Description" , apLists.get(depth1).getDescription());
				putQueryParameter("ApList." + (depth1 + 1) + ".RegionId" , apLists.get(depth1).getRegionId());
				putQueryParameter("ApList." + (depth1 + 1) + ".LineOperator" , apLists.get(depth1).getLineOperator());
				putQueryParameter("ApList." + (depth1 + 1) + ".AccessPointId" , apLists.get(depth1).getAccessPointId());
				putQueryParameter("ApList." + (depth1 + 1) + ".PortNum" , apLists.get(depth1).getPortNum());
				putQueryParameter("ApList." + (depth1 + 1) + ".Type" , apLists.get(depth1).getType());
				putQueryParameter("ApList." + (depth1 + 1) + ".Bandwidth" , apLists.get(depth1).getBandwidth());
				putQueryParameter("ApList." + (depth1 + 1) + ".PeerLocation" , apLists.get(depth1).getPeerLocation());
				putQueryParameter("ApList." + (depth1 + 1) + ".CircuitCode" , apLists.get(depth1).getCircuitCode());
				putQueryParameter("ApList." + (depth1 + 1) + ".OpticalModuleModel" , apLists.get(depth1).getOpticalModuleModel());
			}
		}	
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public List<String> getDeviceAdvancedCapacitys() {
		return this.deviceAdvancedCapacitys;
	}

	public void setDeviceAdvancedCapacitys(List<String> deviceAdvancedCapacitys) {
		this.deviceAdvancedCapacitys = deviceAdvancedCapacitys;	
		if (deviceAdvancedCapacitys != null) {
			for (int i = 0; i < deviceAdvancedCapacitys.size(); i++) {
				putQueryParameter("DeviceAdvancedCapacity." + (i + 1) , deviceAdvancedCapacitys.get(i));
			}
		}	
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class ApList {

		private String name;

		private String description;

		private String regionId;

		private String lineOperator;

		private String accessPointId;

		private Integer portNum;

		private String type;

		private Long bandwidth;

		private String peerLocation;

		private String circuitCode;

		private String opticalModuleModel;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getLineOperator() {
			return this.lineOperator;
		}

		public void setLineOperator(String lineOperator) {
			this.lineOperator = lineOperator;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public Integer getPortNum() {
			return this.portNum;
		}

		public void setPortNum(Integer portNum) {
			this.portNum = portNum;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getPeerLocation() {
			return this.peerLocation;
		}

		public void setPeerLocation(String peerLocation) {
			this.peerLocation = peerLocation;
		}

		public String getCircuitCode() {
			return this.circuitCode;
		}

		public void setCircuitCode(String circuitCode) {
			this.circuitCode = circuitCode;
		}

		public String getOpticalModuleModel() {
			return this.opticalModuleModel;
		}

		public void setOpticalModuleModel(String opticalModuleModel) {
			this.opticalModuleModel = opticalModuleModel;
		}
	}

	@Override
	public Class<CreateHighReliablePhysicalConnectionResponse> getResponseClass() {
		return CreateHighReliablePhysicalConnectionResponse.class;
	}

}
