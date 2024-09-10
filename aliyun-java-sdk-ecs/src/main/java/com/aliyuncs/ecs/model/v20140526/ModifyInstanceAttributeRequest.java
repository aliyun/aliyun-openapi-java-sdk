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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceAttributeRequest extends RpcAcsRequest<ModifyInstanceAttributeResponse> {
	   

	private Long resourceOwnerId;

	private Boolean recyclable;

	private Integer networkInterfaceQueueNumber;

	private String description;

	private Boolean deletionProtection;

	private String userData;

	private String password;

	private String hostName;

	private PrivateDnsNameOptions privateDnsNameOptions;

	private String cpuOptionsTopologyType;

	private Boolean enableJumboFrame;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String creditSpecification;

	private Long ownerId;

	private List<String> securityGroupIdss;

	private String instanceId;

	private String instanceName;

	private RemoteConnectionOptions remoteConnectionOptions;
	public ModifyInstanceAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyInstanceAttribute", "ecs");
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

	public Boolean getRecyclable() {
		return this.recyclable;
	}

	public void setRecyclable(Boolean recyclable) {
		this.recyclable = recyclable;
		if(recyclable != null){
			putQueryParameter("Recyclable", recyclable.toString());
		}
	}

	public Integer getNetworkInterfaceQueueNumber() {
		return this.networkInterfaceQueueNumber;
	}

	public void setNetworkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
		this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
		if(networkInterfaceQueueNumber != null){
			putQueryParameter("NetworkInterfaceQueueNumber", networkInterfaceQueueNumber.toString());
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

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
		if(deletionProtection != null){
			putQueryParameter("DeletionProtection", deletionProtection.toString());
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public PrivateDnsNameOptions getPrivateDnsNameOptions() {
		return this.privateDnsNameOptions;
	}

	public void setPrivateDnsNameOptions(PrivateDnsNameOptions privateDnsNameOptions) {
		this.privateDnsNameOptions = privateDnsNameOptions;	
		if (privateDnsNameOptions != null) {
			
				putQueryParameter("PrivateDnsNameOptions.HostnameType" , privateDnsNameOptions.getHostnameType());
				putQueryParameter("PrivateDnsNameOptions.EnableInstanceIdDnsARecord" , privateDnsNameOptions.getEnableInstanceIdDnsARecord());
				putQueryParameter("PrivateDnsNameOptions.EnableInstanceIdDnsAAAARecord" , privateDnsNameOptions.getEnableInstanceIdDnsAAAARecord());
				putQueryParameter("PrivateDnsNameOptions.EnableIpDnsARecord" , privateDnsNameOptions.getEnableIpDnsARecord());
				putQueryParameter("PrivateDnsNameOptions.EnableIpDnsPtrRecord" , privateDnsNameOptions.getEnableIpDnsPtrRecord());
		}	
	}

	public String getCpuOptionsTopologyType() {
		return this.cpuOptionsTopologyType;
	}

	public void setCpuOptionsTopologyType(String cpuOptionsTopologyType) {
		this.cpuOptionsTopologyType = cpuOptionsTopologyType;
		if(cpuOptionsTopologyType != null){
			putQueryParameter("CpuOptions.TopologyType", cpuOptionsTopologyType);
		}
	}

	public Boolean getEnableJumboFrame() {
		return this.enableJumboFrame;
	}

	public void setEnableJumboFrame(Boolean enableJumboFrame) {
		this.enableJumboFrame = enableJumboFrame;
		if(enableJumboFrame != null){
			putQueryParameter("EnableJumboFrame", enableJumboFrame.toString());
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

	public String getCreditSpecification() {
		return this.creditSpecification;
	}

	public void setCreditSpecification(String creditSpecification) {
		this.creditSpecification = creditSpecification;
		if(creditSpecification != null){
			putQueryParameter("CreditSpecification", creditSpecification);
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

	public List<String> getSecurityGroupIdss() {
		return this.securityGroupIdss;
	}

	public void setSecurityGroupIdss(List<String> securityGroupIdss) {
		this.securityGroupIdss = securityGroupIdss;	
		if (securityGroupIdss != null) {
			for (int i = 0; i < securityGroupIdss.size(); i++) {
				putQueryParameter("SecurityGroupIds." + (i + 1) , securityGroupIdss.get(i));
			}
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public RemoteConnectionOptions getRemoteConnectionOptions() {
		return this.remoteConnectionOptions;
	}

	public void setRemoteConnectionOptions(RemoteConnectionOptions remoteConnectionOptions) {
		this.remoteConnectionOptions = remoteConnectionOptions;	
		if (remoteConnectionOptions != null) {
			
				putQueryParameter("RemoteConnectionOptions.Password" , remoteConnectionOptions.getPassword());
				putQueryParameter("RemoteConnectionOptions.Type" , remoteConnectionOptions.getType());
		}	
	}

	public static class PrivateDnsNameOptions {

		private String hostnameType;

		private Boolean enableInstanceIdDnsARecord;

		private Boolean enableInstanceIdDnsAAAARecord;

		private Boolean enableIpDnsARecord;

		private Boolean enableIpDnsPtrRecord;

		public String getHostnameType() {
			return this.hostnameType;
		}

		public void setHostnameType(String hostnameType) {
			this.hostnameType = hostnameType;
		}

		public Boolean getEnableInstanceIdDnsARecord() {
			return this.enableInstanceIdDnsARecord;
		}

		public void setEnableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
			this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
		}

		public Boolean getEnableInstanceIdDnsAAAARecord() {
			return this.enableInstanceIdDnsAAAARecord;
		}

		public void setEnableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
			this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
		}

		public Boolean getEnableIpDnsARecord() {
			return this.enableIpDnsARecord;
		}

		public void setEnableIpDnsARecord(Boolean enableIpDnsARecord) {
			this.enableIpDnsARecord = enableIpDnsARecord;
		}

		public Boolean getEnableIpDnsPtrRecord() {
			return this.enableIpDnsPtrRecord;
		}

		public void setEnableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
			this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
		}
	}

	public static class RemoteConnectionOptions {

		private String password;

		private String type;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<ModifyInstanceAttributeResponse> getResponseClass() {
		return ModifyInstanceAttributeResponse.class;
	}

}
