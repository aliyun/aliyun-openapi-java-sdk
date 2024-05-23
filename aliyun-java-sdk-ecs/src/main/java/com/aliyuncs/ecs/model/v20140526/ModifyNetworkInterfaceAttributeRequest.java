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
public class ModifyNetworkInterfaceAttributeRequest extends RpcAcsRequest<ModifyNetworkInterfaceAttributeResponse> {
	   

	private Integer queueNumber;

	private Long resourceOwnerId;

	private List<String> securityGroupIds;

	private String description;

	private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

	private String networkInterfaceName;

	private Integer txQueueSize;

	private Boolean deleteOnRelease;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer rxQueueSize;

	private Long ownerId;

	private ConnectionTrackingConfiguration connectionTrackingConfiguration;

	private String networkInterfaceId;
	public ModifyNetworkInterfaceAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyNetworkInterfaceAttribute", "ecs");
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

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;	
		if (securityGroupIds != null) {
			for (int i = 0; i < securityGroupIds.size(); i++) {
				putQueryParameter("SecurityGroupId." + (i + 1) , securityGroupIds.get(i));
			}
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

	public NetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
		return this.networkInterfaceTrafficConfig;
	}

	public void setNetworkInterfaceTrafficConfig(NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
		this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;	
		if (networkInterfaceTrafficConfig != null) {
			
				putQueryParameter("NetworkInterfaceTrafficConfig.NetworkInterfaceTrafficMode" , networkInterfaceTrafficConfig.getNetworkInterfaceTrafficMode());
				putQueryParameter("NetworkInterfaceTrafficConfig.QueueNumber" , networkInterfaceTrafficConfig.getQueueNumber());
				putQueryParameter("NetworkInterfaceTrafficConfig.QueuePairNumber" , networkInterfaceTrafficConfig.getQueuePairNumber());
				putQueryParameter("NetworkInterfaceTrafficConfig.RxQueueSize" , networkInterfaceTrafficConfig.getRxQueueSize());
				putQueryParameter("NetworkInterfaceTrafficConfig.TxQueueSize" , networkInterfaceTrafficConfig.getTxQueueSize());
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

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putQueryParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	public static class NetworkInterfaceTrafficConfig {

		private String networkInterfaceTrafficMode;

		private Integer queueNumber;

		private Integer queuePairNumber;

		private Integer rxQueueSize;

		private Integer txQueueSize;

		public String getNetworkInterfaceTrafficMode() {
			return this.networkInterfaceTrafficMode;
		}

		public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
			this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
		}

		public Integer getQueueNumber() {
			return this.queueNumber;
		}

		public void setQueueNumber(Integer queueNumber) {
			this.queueNumber = queueNumber;
		}

		public Integer getQueuePairNumber() {
			return this.queuePairNumber;
		}

		public void setQueuePairNumber(Integer queuePairNumber) {
			this.queuePairNumber = queuePairNumber;
		}

		public Integer getRxQueueSize() {
			return this.rxQueueSize;
		}

		public void setRxQueueSize(Integer rxQueueSize) {
			this.rxQueueSize = rxQueueSize;
		}

		public Integer getTxQueueSize() {
			return this.txQueueSize;
		}

		public void setTxQueueSize(Integer txQueueSize) {
			this.txQueueSize = txQueueSize;
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
	public Class<ModifyNetworkInterfaceAttributeResponse> getResponseClass() {
		return ModifyNetworkInterfaceAttributeResponse.class;
	}

}
