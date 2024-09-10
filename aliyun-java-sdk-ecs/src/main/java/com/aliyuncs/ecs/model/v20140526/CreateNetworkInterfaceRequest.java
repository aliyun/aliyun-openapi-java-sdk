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
public class CreateNetworkInterfaceRequest extends RpcAcsRequest<CreateNetworkInterfaceResponse> {
	   

	private Integer queueNumber;

	private Long resourceOwnerId;

	private List<String> ipv4Prefixs;

	private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

	private Integer secondaryPrivateIpAddressCount;

	private String businessType;

	private String resourceGroupId;

	private EnhancedNetwork enhancedNetwork;

	private List<Tag> tags;

	private String networkInterfaceName;

	private Boolean visible;

	private Integer ipv6AddressCount;

	private Integer rxQueueSize;

	private Long ownerId;

	private String vSwitchId;

	private List<String> privateIpAddresss;

	private List<String> ipv6Addresss;

	private String clientToken;

	private List<String> ipv6Prefixs;

	private String securityGroupId;

	private String description;

	private Integer ipv6PrefixCount;

	private String instanceType;

	private Integer txQueueSize;

	private Boolean deleteOnRelease;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer queuePairNumber;

	private List<String> securityGroupIdss;

	private String networkInterfaceTrafficMode;

	private Integer ipv4PrefixCount;

	private ConnectionTrackingConfiguration connectionTrackingConfiguration;

	private String primaryIpAddress;
	public CreateNetworkInterfaceRequest() {
		super("Ecs", "2014-05-26", "CreateNetworkInterface", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getQueueNumber() {
		return this.queueNumber;
	}

	public void setQueueNumber(Integer queueNumber) {
		this.queueNumber = queueNumber;
		if(queueNumber != null){
			putQueryParameter("QueueNumber", queueNumber.toString());
		}
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

	public List<String> getIpv4Prefixs() {
		return this.ipv4Prefixs;
	}

	public void setIpv4Prefixs(List<String> ipv4Prefixs) {
		this.ipv4Prefixs = ipv4Prefixs;	
		if (ipv4Prefixs != null) {
			for (int i = 0; i < ipv4Prefixs.size(); i++) {
				putQueryParameter("Ipv4Prefix." + (i + 1) , ipv4Prefixs.get(i));
			}
		}	
	}

	public NetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
		return this.networkInterfaceTrafficConfig;
	}

	public void setNetworkInterfaceTrafficConfig(NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
		this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;	
		if (networkInterfaceTrafficConfig != null) {
			
				putQueryParameter("NetworkInterfaceTrafficConfig.QueueNumber" , networkInterfaceTrafficConfig.getQueueNumber());
				putQueryParameter("NetworkInterfaceTrafficConfig.NetworkInterfaceTrafficMode" , networkInterfaceTrafficConfig.getNetworkInterfaceTrafficMode());
				putQueryParameter("NetworkInterfaceTrafficConfig.QueuePairNumber" , networkInterfaceTrafficConfig.getQueuePairNumber());
				putQueryParameter("NetworkInterfaceTrafficConfig.TxQueueSize" , networkInterfaceTrafficConfig.getTxQueueSize());
				putQueryParameter("NetworkInterfaceTrafficConfig.RxQueueSize" , networkInterfaceTrafficConfig.getRxQueueSize());
		}	
	}

	public Integer getSecondaryPrivateIpAddressCount() {
		return this.secondaryPrivateIpAddressCount;
	}

	public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
		this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
		if(secondaryPrivateIpAddressCount != null){
			putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount.toString());
		}
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType);
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

	public EnhancedNetwork getEnhancedNetwork() {
		return this.enhancedNetwork;
	}

	public void setEnhancedNetwork(EnhancedNetwork enhancedNetwork) {
		this.enhancedNetwork = enhancedNetwork;	
		if (enhancedNetwork != null) {
			
				putQueryParameter("EnhancedNetwork.EnableSriov" , enhancedNetwork.getEnableSriov());
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

	public String getNetworkInterfaceName() {
		return this.networkInterfaceName;
	}

	public void setNetworkInterfaceName(String networkInterfaceName) {
		this.networkInterfaceName = networkInterfaceName;
		if(networkInterfaceName != null){
			putQueryParameter("NetworkInterfaceName", networkInterfaceName);
		}
	}

	public Boolean getVisible() {
		return this.visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
		if(visible != null){
			putQueryParameter("Visible", visible.toString());
		}
	}

	public Integer getIpv6AddressCount() {
		return this.ipv6AddressCount;
	}

	public void setIpv6AddressCount(Integer ipv6AddressCount) {
		this.ipv6AddressCount = ipv6AddressCount;
		if(ipv6AddressCount != null){
			putQueryParameter("Ipv6AddressCount", ipv6AddressCount.toString());
		}
	}

	public Integer getRxQueueSize() {
		return this.rxQueueSize;
	}

	public void setRxQueueSize(Integer rxQueueSize) {
		this.rxQueueSize = rxQueueSize;
		if(rxQueueSize != null){
			putQueryParameter("RxQueueSize", rxQueueSize.toString());
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public List<String> getPrivateIpAddresss() {
		return this.privateIpAddresss;
	}

	public void setPrivateIpAddresss(List<String> privateIpAddresss) {
		this.privateIpAddresss = privateIpAddresss;	
		if (privateIpAddresss != null) {
			for (int i = 0; i < privateIpAddresss.size(); i++) {
				putQueryParameter("PrivateIpAddress." + (i + 1) , privateIpAddresss.get(i));
			}
		}	
	}

	public List<String> getIpv6Addresss() {
		return this.ipv6Addresss;
	}

	public void setIpv6Addresss(List<String> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;	
		if (ipv6Addresss != null) {
			for (int i = 0; i < ipv6Addresss.size(); i++) {
				putQueryParameter("Ipv6Address." + (i + 1) , ipv6Addresss.get(i));
			}
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

	public List<String> getIpv6Prefixs() {
		return this.ipv6Prefixs;
	}

	public void setIpv6Prefixs(List<String> ipv6Prefixs) {
		this.ipv6Prefixs = ipv6Prefixs;	
		if (ipv6Prefixs != null) {
			for (int i = 0; i < ipv6Prefixs.size(); i++) {
				putQueryParameter("Ipv6Prefix." + (i + 1) , ipv6Prefixs.get(i));
			}
		}	
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
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

	public Integer getIpv6PrefixCount() {
		return this.ipv6PrefixCount;
	}

	public void setIpv6PrefixCount(Integer ipv6PrefixCount) {
		this.ipv6PrefixCount = ipv6PrefixCount;
		if(ipv6PrefixCount != null){
			putQueryParameter("Ipv6PrefixCount", ipv6PrefixCount.toString());
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

	public Integer getTxQueueSize() {
		return this.txQueueSize;
	}

	public void setTxQueueSize(Integer txQueueSize) {
		this.txQueueSize = txQueueSize;
		if(txQueueSize != null){
			putQueryParameter("TxQueueSize", txQueueSize.toString());
		}
	}

	public Boolean getDeleteOnRelease() {
		return this.deleteOnRelease;
	}

	public void setDeleteOnRelease(Boolean deleteOnRelease) {
		this.deleteOnRelease = deleteOnRelease;
		if(deleteOnRelease != null){
			putQueryParameter("DeleteOnRelease", deleteOnRelease.toString());
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

	public Integer getQueuePairNumber() {
		return this.queuePairNumber;
	}

	public void setQueuePairNumber(Integer queuePairNumber) {
		this.queuePairNumber = queuePairNumber;
		if(queuePairNumber != null){
			putQueryParameter("QueuePairNumber", queuePairNumber.toString());
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

	public String getNetworkInterfaceTrafficMode() {
		return this.networkInterfaceTrafficMode;
	}

	public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
		this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
		if(networkInterfaceTrafficMode != null){
			putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
		}
	}

	public Integer getIpv4PrefixCount() {
		return this.ipv4PrefixCount;
	}

	public void setIpv4PrefixCount(Integer ipv4PrefixCount) {
		this.ipv4PrefixCount = ipv4PrefixCount;
		if(ipv4PrefixCount != null){
			putQueryParameter("Ipv4PrefixCount", ipv4PrefixCount.toString());
		}
	}

	public ConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
		return this.connectionTrackingConfiguration;
	}

	public void setConnectionTrackingConfiguration(ConnectionTrackingConfiguration connectionTrackingConfiguration) {
		this.connectionTrackingConfiguration = connectionTrackingConfiguration;	
		if (connectionTrackingConfiguration != null) {
			
				putQueryParameter("ConnectionTrackingConfiguration.TcpEstablishedTimeout" , connectionTrackingConfiguration.getTcpEstablishedTimeout());
				putQueryParameter("ConnectionTrackingConfiguration.TcpClosedAndTimeWaitTimeout" , connectionTrackingConfiguration.getTcpClosedAndTimeWaitTimeout());
				putQueryParameter("ConnectionTrackingConfiguration.UdpTimeout" , connectionTrackingConfiguration.getUdpTimeout());
		}	
	}

	public String getPrimaryIpAddress() {
		return this.primaryIpAddress;
	}

	public void setPrimaryIpAddress(String primaryIpAddress) {
		this.primaryIpAddress = primaryIpAddress;
		if(primaryIpAddress != null){
			putQueryParameter("PrimaryIpAddress", primaryIpAddress);
		}
	}

	public static class NetworkInterfaceTrafficConfig {

		private Integer queueNumber;

		private String networkInterfaceTrafficMode;

		private Integer queuePairNumber;

		private Integer txQueueSize;

		private Integer rxQueueSize;

		public Integer getQueueNumber() {
			return this.queueNumber;
		}

		public void setQueueNumber(Integer queueNumber) {
			this.queueNumber = queueNumber;
		}

		public String getNetworkInterfaceTrafficMode() {
			return this.networkInterfaceTrafficMode;
		}

		public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
			this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
		}

		public Integer getQueuePairNumber() {
			return this.queuePairNumber;
		}

		public void setQueuePairNumber(Integer queuePairNumber) {
			this.queuePairNumber = queuePairNumber;
		}

		public Integer getTxQueueSize() {
			return this.txQueueSize;
		}

		public void setTxQueueSize(Integer txQueueSize) {
			this.txQueueSize = txQueueSize;
		}

		public Integer getRxQueueSize() {
			return this.rxQueueSize;
		}

		public void setRxQueueSize(Integer rxQueueSize) {
			this.rxQueueSize = rxQueueSize;
		}
	}

	public static class EnhancedNetwork {

		private Boolean enableSriov;

		public Boolean getEnableSriov() {
			return this.enableSriov;
		}

		public void setEnableSriov(Boolean enableSriov) {
			this.enableSriov = enableSriov;
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

	public static class ConnectionTrackingConfiguration {

		private Integer tcpEstablishedTimeout;

		private Integer tcpClosedAndTimeWaitTimeout;

		private Integer udpTimeout;

		public Integer getTcpEstablishedTimeout() {
			return this.tcpEstablishedTimeout;
		}

		public void setTcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
			this.tcpEstablishedTimeout = tcpEstablishedTimeout;
		}

		public Integer getTcpClosedAndTimeWaitTimeout() {
			return this.tcpClosedAndTimeWaitTimeout;
		}

		public void setTcpClosedAndTimeWaitTimeout(Integer tcpClosedAndTimeWaitTimeout) {
			this.tcpClosedAndTimeWaitTimeout = tcpClosedAndTimeWaitTimeout;
		}

		public Integer getUdpTimeout() {
			return this.udpTimeout;
		}

		public void setUdpTimeout(Integer udpTimeout) {
			this.udpTimeout = udpTimeout;
		}
	}

	@Override
	public Class<CreateNetworkInterfaceResponse> getResponseClass() {
		return CreateNetworkInterfaceResponse.class;
	}

}
