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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeNetworkInterfaceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInterfaceAttributeResponse extends AcsResponse {

	private String creationTime;

	private String vpcId;

	private String type;

	private String status;

	private String networkInterfaceTrafficMode;

	private String networkInterfaceName;

	private String macAddress;

	private Integer queuePairNumber;

	private String networkInterfaceId;

	private Long serviceID;

	private String instanceId;

	private String ownerId;

	private Boolean serviceManaged;

	private String vSwitchId;

	private String requestId;

	private String description;

	private String resourceGroupId;

	private String zoneId;

	private String privateIpAddress;

	private Integer queueNumber;

	private Boolean deleteOnRelease;

	private String tcpOptionAddressEnabled;

	private Boolean sourceDestCheck;

	private List<PrivateIpSet> privateIpSets;

	private List<Ipv6Set> ipv6Sets;

	private List<Ipv4PrefixSet> ipv4PrefixSets;

	private List<Ipv6PrefixSet> ipv6PrefixSets;

	private List<Tag> tags;

	private List<String> securityGroupIds;

	private AssociatedPublicIp associatedPublicIp;

	private Attachment attachment;

	private BondInterfaceSpecification bondInterfaceSpecification;

	private SlaveInterfaceSpecification slaveInterfaceSpecification;

	private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

	private ConnectionTrackingConfiguration connectionTrackingConfiguration;

	private EnhancedNetwork enhancedNetwork;

	private QoSConfig qoSConfig;

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNetworkInterfaceTrafficMode() {
		return this.networkInterfaceTrafficMode;
	}

	public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
		this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
	}

	public String getNetworkInterfaceName() {
		return this.networkInterfaceName;
	}

	public void setNetworkInterfaceName(String networkInterfaceName) {
		this.networkInterfaceName = networkInterfaceName;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Integer getQueuePairNumber() {
		return this.queuePairNumber;
	}

	public void setQueuePairNumber(Integer queuePairNumber) {
		this.queuePairNumber = queuePairNumber;
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
	}

	public Long getServiceID() {
		return this.serviceID;
	}

	public void setServiceID(Long serviceID) {
		this.serviceID = serviceID;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getServiceManaged() {
		return this.serviceManaged;
	}

	public void setServiceManaged(Boolean serviceManaged) {
		this.serviceManaged = serviceManaged;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}

	public Integer getQueueNumber() {
		return this.queueNumber;
	}

	public void setQueueNumber(Integer queueNumber) {
		this.queueNumber = queueNumber;
	}

	public Boolean getDeleteOnRelease() {
		return this.deleteOnRelease;
	}

	public void setDeleteOnRelease(Boolean deleteOnRelease) {
		this.deleteOnRelease = deleteOnRelease;
	}

	public String getTcpOptionAddressEnabled() {
		return this.tcpOptionAddressEnabled;
	}

	public void setTcpOptionAddressEnabled(String tcpOptionAddressEnabled) {
		this.tcpOptionAddressEnabled = tcpOptionAddressEnabled;
	}

	public Boolean getSourceDestCheck() {
		return this.sourceDestCheck;
	}

	public void setSourceDestCheck(Boolean sourceDestCheck) {
		this.sourceDestCheck = sourceDestCheck;
	}

	public List<PrivateIpSet> getPrivateIpSets() {
		return this.privateIpSets;
	}

	public void setPrivateIpSets(List<PrivateIpSet> privateIpSets) {
		this.privateIpSets = privateIpSets;
	}

	public List<Ipv6Set> getIpv6Sets() {
		return this.ipv6Sets;
	}

	public void setIpv6Sets(List<Ipv6Set> ipv6Sets) {
		this.ipv6Sets = ipv6Sets;
	}

	public List<Ipv4PrefixSet> getIpv4PrefixSets() {
		return this.ipv4PrefixSets;
	}

	public void setIpv4PrefixSets(List<Ipv4PrefixSet> ipv4PrefixSets) {
		this.ipv4PrefixSets = ipv4PrefixSets;
	}

	public List<Ipv6PrefixSet> getIpv6PrefixSets() {
		return this.ipv6PrefixSets;
	}

	public void setIpv6PrefixSets(List<Ipv6PrefixSet> ipv6PrefixSets) {
		this.ipv6PrefixSets = ipv6PrefixSets;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}

	public AssociatedPublicIp getAssociatedPublicIp() {
		return this.associatedPublicIp;
	}

	public void setAssociatedPublicIp(AssociatedPublicIp associatedPublicIp) {
		this.associatedPublicIp = associatedPublicIp;
	}

	public Attachment getAttachment() {
		return this.attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public BondInterfaceSpecification getBondInterfaceSpecification() {
		return this.bondInterfaceSpecification;
	}

	public void setBondInterfaceSpecification(BondInterfaceSpecification bondInterfaceSpecification) {
		this.bondInterfaceSpecification = bondInterfaceSpecification;
	}

	public SlaveInterfaceSpecification getSlaveInterfaceSpecification() {
		return this.slaveInterfaceSpecification;
	}

	public void setSlaveInterfaceSpecification(SlaveInterfaceSpecification slaveInterfaceSpecification) {
		this.slaveInterfaceSpecification = slaveInterfaceSpecification;
	}

	public NetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
		return this.networkInterfaceTrafficConfig;
	}

	public void setNetworkInterfaceTrafficConfig(NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
		this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;
	}

	public ConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
		return this.connectionTrackingConfiguration;
	}

	public void setConnectionTrackingConfiguration(ConnectionTrackingConfiguration connectionTrackingConfiguration) {
		this.connectionTrackingConfiguration = connectionTrackingConfiguration;
	}

	public EnhancedNetwork getEnhancedNetwork() {
		return this.enhancedNetwork;
	}

	public void setEnhancedNetwork(EnhancedNetwork enhancedNetwork) {
		this.enhancedNetwork = enhancedNetwork;
	}

	public QoSConfig getQoSConfig() {
		return this.qoSConfig;
	}

	public void setQoSConfig(QoSConfig qoSConfig) {
		this.qoSConfig = qoSConfig;
	}

	public static class PrivateIpSet {

		private String privateIpAddress;

		private Boolean primary;

		private AssociatedPublicIp1 associatedPublicIp1;

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public Boolean getPrimary() {
			return this.primary;
		}

		public void setPrimary(Boolean primary) {
			this.primary = primary;
		}

		public AssociatedPublicIp1 getAssociatedPublicIp1() {
			return this.associatedPublicIp1;
		}

		public void setAssociatedPublicIp1(AssociatedPublicIp1 associatedPublicIp1) {
			this.associatedPublicIp1 = associatedPublicIp1;
		}

		public static class AssociatedPublicIp1 {

			private String publicIpAddress;

			private String allocationId;

			public String getPublicIpAddress() {
				return this.publicIpAddress;
			}

			public void setPublicIpAddress(String publicIpAddress) {
				this.publicIpAddress = publicIpAddress;
			}

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}
		}
	}

	public static class Ipv6Set {

		private String ipv6Address;

		public String getIpv6Address() {
			return this.ipv6Address;
		}

		public void setIpv6Address(String ipv6Address) {
			this.ipv6Address = ipv6Address;
		}
	}

	public static class Ipv4PrefixSet {

		private String ipv4Prefix;

		public String getIpv4Prefix() {
			return this.ipv4Prefix;
		}

		public void setIpv4Prefix(String ipv4Prefix) {
			this.ipv4Prefix = ipv4Prefix;
		}
	}

	public static class Ipv6PrefixSet {

		private String ipv6Prefix;

		public String getIpv6Prefix() {
			return this.ipv6Prefix;
		}

		public void setIpv6Prefix(String ipv6Prefix) {
			this.ipv6Prefix = ipv6Prefix;
		}
	}

	public static class Tag {

		private String tagValue;

		private String tagKey;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	public static class AssociatedPublicIp {

		private String publicIpAddress;

		private String allocationId;

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}
	}

	public static class Attachment {

		private Integer deviceIndex;

		private String instanceId;

		private String trunkNetworkInterfaceId;

		private Integer networkCardIndex;

		private List<String> memberNetworkInterfaceIds;

		public Integer getDeviceIndex() {
			return this.deviceIndex;
		}

		public void setDeviceIndex(Integer deviceIndex) {
			this.deviceIndex = deviceIndex;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTrunkNetworkInterfaceId() {
			return this.trunkNetworkInterfaceId;
		}

		public void setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
			this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
		}

		public Integer getNetworkCardIndex() {
			return this.networkCardIndex;
		}

		public void setNetworkCardIndex(Integer networkCardIndex) {
			this.networkCardIndex = networkCardIndex;
		}

		public List<String> getMemberNetworkInterfaceIds() {
			return this.memberNetworkInterfaceIds;
		}

		public void setMemberNetworkInterfaceIds(List<String> memberNetworkInterfaceIds) {
			this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
		}
	}

	public static class BondInterfaceSpecification {

		private String bondMode;

		private List<SlaveInterfaceSpecificationSet> slaveInterfaceSpecification2;

		public String getBondMode() {
			return this.bondMode;
		}

		public void setBondMode(String bondMode) {
			this.bondMode = bondMode;
		}

		public List<SlaveInterfaceSpecificationSet> getSlaveInterfaceSpecification2() {
			return this.slaveInterfaceSpecification2;
		}

		public void setSlaveInterfaceSpecification2(List<SlaveInterfaceSpecificationSet> slaveInterfaceSpecification2) {
			this.slaveInterfaceSpecification2 = slaveInterfaceSpecification2;
		}

		public static class SlaveInterfaceSpecificationSet {

			private String slaveNetworkInterfaceId;

			private String workState;

			private String bondNetworkInterfaceId;

			public String getSlaveNetworkInterfaceId() {
				return this.slaveNetworkInterfaceId;
			}

			public void setSlaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
				this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
			}

			public String getWorkState() {
				return this.workState;
			}

			public void setWorkState(String workState) {
				this.workState = workState;
			}

			public String getBondNetworkInterfaceId() {
				return this.bondNetworkInterfaceId;
			}

			public void setBondNetworkInterfaceId(String bondNetworkInterfaceId) {
				this.bondNetworkInterfaceId = bondNetworkInterfaceId;
			}
		}
	}

	public static class SlaveInterfaceSpecification {

		private String slaveNetworkInterfaceId;

		private String workState;

		private String bondNetworkInterfaceId;

		public String getSlaveNetworkInterfaceId() {
			return this.slaveNetworkInterfaceId;
		}

		public void setSlaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
			this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
		}

		public String getWorkState() {
			return this.workState;
		}

		public void setWorkState(String workState) {
			this.workState = workState;
		}

		public String getBondNetworkInterfaceId() {
			return this.bondNetworkInterfaceId;
		}

		public void setBondNetworkInterfaceId(String bondNetworkInterfaceId) {
			this.bondNetworkInterfaceId = bondNetworkInterfaceId;
		}
	}

	public static class NetworkInterfaceTrafficConfig {

		private String networkInterfaceTrafficMode;

		private Integer queueNumber;

		private Integer queuePairNumber;

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

	public static class EnhancedNetwork {

		private Boolean enableSriov;

		private Boolean enableRss;

		private Integer virtualFunctionTotalQueueNumber;

		private Integer virtualFunctionQuantity;

		public Boolean getEnableSriov() {
			return this.enableSriov;
		}

		public void setEnableSriov(Boolean enableSriov) {
			this.enableSriov = enableSriov;
		}

		public Boolean getEnableRss() {
			return this.enableRss;
		}

		public void setEnableRss(Boolean enableRss) {
			this.enableRss = enableRss;
		}

		public Integer getVirtualFunctionTotalQueueNumber() {
			return this.virtualFunctionTotalQueueNumber;
		}

		public void setVirtualFunctionTotalQueueNumber(Integer virtualFunctionTotalQueueNumber) {
			this.virtualFunctionTotalQueueNumber = virtualFunctionTotalQueueNumber;
		}

		public Integer getVirtualFunctionQuantity() {
			return this.virtualFunctionQuantity;
		}

		public void setVirtualFunctionQuantity(Integer virtualFunctionQuantity) {
			this.virtualFunctionQuantity = virtualFunctionQuantity;
		}
	}

	public static class QoSConfig {

		private Boolean enableQoS;

		private QoS qoS;

		public Boolean getEnableQoS() {
			return this.enableQoS;
		}

		public void setEnableQoS(Boolean enableQoS) {
			this.enableQoS = enableQoS;
		}

		public QoS getQoS() {
			return this.qoS;
		}

		public void setQoS(QoS qoS) {
			this.qoS = qoS;
		}

		public static class QoS {

			private Long bandwidthTx;

			private Long bandwidthRx;

			private Long ppsTx;

			private Long ppsRx;

			private Long concurrentConnections;

			public Long getBandwidthTx() {
				return this.bandwidthTx;
			}

			public void setBandwidthTx(Long bandwidthTx) {
				this.bandwidthTx = bandwidthTx;
			}

			public Long getBandwidthRx() {
				return this.bandwidthRx;
			}

			public void setBandwidthRx(Long bandwidthRx) {
				this.bandwidthRx = bandwidthRx;
			}

			public Long getPpsTx() {
				return this.ppsTx;
			}

			public void setPpsTx(Long ppsTx) {
				this.ppsTx = ppsTx;
			}

			public Long getPpsRx() {
				return this.ppsRx;
			}

			public void setPpsRx(Long ppsRx) {
				this.ppsRx = ppsRx;
			}

			public Long getConcurrentConnections() {
				return this.concurrentConnections;
			}

			public void setConcurrentConnections(Long concurrentConnections) {
				this.concurrentConnections = concurrentConnections;
			}
		}
	}

	@Override
	public DescribeNetworkInterfaceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkInterfaceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
