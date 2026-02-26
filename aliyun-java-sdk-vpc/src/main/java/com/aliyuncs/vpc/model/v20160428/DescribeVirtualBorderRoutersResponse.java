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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVirtualBorderRoutersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVirtualBorderRoutersResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<VirtualBorderRouterType> virtualBorderRouterSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VirtualBorderRouterType> getVirtualBorderRouterSet() {
		return this.virtualBorderRouterSet;
	}

	public void setVirtualBorderRouterSet(List<VirtualBorderRouterType> virtualBorderRouterSet) {
		this.virtualBorderRouterSet = virtualBorderRouterSet;
	}

	public static class VirtualBorderRouterType {

		private String creationTime;

		private String status;

		private String type;

		private Long minTxInterval;

		private String peerIpv6GatewayIp;

		private String pConnVbrExpireTime;

		private String physicalConnectionOwnerUid;

		private String activationTime;

		private String physicalConnectionBusinessStatus;

		private String description;

		private String terminationTime;

		private Long minRxInterval;

		private String peerGatewayIp;

		private String name;

		private String vbrId;

		private Integer vlanId;

		private String vlanInterfaceId;

		private String circuitCode;

		private String localIpv6GatewayIp;

		private String localGatewayIp;

		private String peeringSubnetMask;

		private Boolean enableIpv6;

		private String routeTableId;

		private Long detectMultiplier;

		private String eccId;

		private String cloudBoxInstanceId;

		private String recoveryTime;

		private String physicalConnectionStatus;

		private String peeringIpv6SubnetMask;

		private String accessPointId;

		private String pConnVbrChargeType;

		private String physicalConnectionId;

		private Integer bandwidth;

		private String resourceGroupId;

		private String ecrId;

		private Boolean sitelinkEnable;

		private String ecrAttatchStatus;

		private String ecrOwnerId;

		private Integer mtu;

		private List<AssociatedPhysicalConnection> associatedPhysicalConnections;

		private List<AssociatedCen> associatedCens;

		private List<TagsItem> tags;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getMinTxInterval() {
			return this.minTxInterval;
		}

		public void setMinTxInterval(Long minTxInterval) {
			this.minTxInterval = minTxInterval;
		}

		public String getPeerIpv6GatewayIp() {
			return this.peerIpv6GatewayIp;
		}

		public void setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
			this.peerIpv6GatewayIp = peerIpv6GatewayIp;
		}

		public String getPConnVbrExpireTime() {
			return this.pConnVbrExpireTime;
		}

		public void setPConnVbrExpireTime(String pConnVbrExpireTime) {
			this.pConnVbrExpireTime = pConnVbrExpireTime;
		}

		public String getPhysicalConnectionOwnerUid() {
			return this.physicalConnectionOwnerUid;
		}

		public void setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
			this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
		}

		public String getActivationTime() {
			return this.activationTime;
		}

		public void setActivationTime(String activationTime) {
			this.activationTime = activationTime;
		}

		public String getPhysicalConnectionBusinessStatus() {
			return this.physicalConnectionBusinessStatus;
		}

		public void setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
			this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTerminationTime() {
			return this.terminationTime;
		}

		public void setTerminationTime(String terminationTime) {
			this.terminationTime = terminationTime;
		}

		public Long getMinRxInterval() {
			return this.minRxInterval;
		}

		public void setMinRxInterval(Long minRxInterval) {
			this.minRxInterval = minRxInterval;
		}

		public String getPeerGatewayIp() {
			return this.peerGatewayIp;
		}

		public void setPeerGatewayIp(String peerGatewayIp) {
			this.peerGatewayIp = peerGatewayIp;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVbrId() {
			return this.vbrId;
		}

		public void setVbrId(String vbrId) {
			this.vbrId = vbrId;
		}

		public Integer getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(Integer vlanId) {
			this.vlanId = vlanId;
		}

		public String getVlanInterfaceId() {
			return this.vlanInterfaceId;
		}

		public void setVlanInterfaceId(String vlanInterfaceId) {
			this.vlanInterfaceId = vlanInterfaceId;
		}

		public String getCircuitCode() {
			return this.circuitCode;
		}

		public void setCircuitCode(String circuitCode) {
			this.circuitCode = circuitCode;
		}

		public String getLocalIpv6GatewayIp() {
			return this.localIpv6GatewayIp;
		}

		public void setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
			this.localIpv6GatewayIp = localIpv6GatewayIp;
		}

		public String getLocalGatewayIp() {
			return this.localGatewayIp;
		}

		public void setLocalGatewayIp(String localGatewayIp) {
			this.localGatewayIp = localGatewayIp;
		}

		public String getPeeringSubnetMask() {
			return this.peeringSubnetMask;
		}

		public void setPeeringSubnetMask(String peeringSubnetMask) {
			this.peeringSubnetMask = peeringSubnetMask;
		}

		public Boolean getEnableIpv6() {
			return this.enableIpv6;
		}

		public void setEnableIpv6(Boolean enableIpv6) {
			this.enableIpv6 = enableIpv6;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public Long getDetectMultiplier() {
			return this.detectMultiplier;
		}

		public void setDetectMultiplier(Long detectMultiplier) {
			this.detectMultiplier = detectMultiplier;
		}

		public String getEccId() {
			return this.eccId;
		}

		public void setEccId(String eccId) {
			this.eccId = eccId;
		}

		public String getCloudBoxInstanceId() {
			return this.cloudBoxInstanceId;
		}

		public void setCloudBoxInstanceId(String cloudBoxInstanceId) {
			this.cloudBoxInstanceId = cloudBoxInstanceId;
		}

		public String getRecoveryTime() {
			return this.recoveryTime;
		}

		public void setRecoveryTime(String recoveryTime) {
			this.recoveryTime = recoveryTime;
		}

		public String getPhysicalConnectionStatus() {
			return this.physicalConnectionStatus;
		}

		public void setPhysicalConnectionStatus(String physicalConnectionStatus) {
			this.physicalConnectionStatus = physicalConnectionStatus;
		}

		public String getPeeringIpv6SubnetMask() {
			return this.peeringIpv6SubnetMask;
		}

		public void setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
			this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getPConnVbrChargeType() {
			return this.pConnVbrChargeType;
		}

		public void setPConnVbrChargeType(String pConnVbrChargeType) {
			this.pConnVbrChargeType = pConnVbrChargeType;
		}

		public String getPhysicalConnectionId() {
			return this.physicalConnectionId;
		}

		public void setPhysicalConnectionId(String physicalConnectionId) {
			this.physicalConnectionId = physicalConnectionId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getEcrId() {
			return this.ecrId;
		}

		public void setEcrId(String ecrId) {
			this.ecrId = ecrId;
		}

		public Boolean getSitelinkEnable() {
			return this.sitelinkEnable;
		}

		public void setSitelinkEnable(Boolean sitelinkEnable) {
			this.sitelinkEnable = sitelinkEnable;
		}

		public String getEcrAttatchStatus() {
			return this.ecrAttatchStatus;
		}

		public void setEcrAttatchStatus(String ecrAttatchStatus) {
			this.ecrAttatchStatus = ecrAttatchStatus;
		}

		public String getEcrOwnerId() {
			return this.ecrOwnerId;
		}

		public void setEcrOwnerId(String ecrOwnerId) {
			this.ecrOwnerId = ecrOwnerId;
		}

		public Integer getMtu() {
			return this.mtu;
		}

		public void setMtu(Integer mtu) {
			this.mtu = mtu;
		}

		public List<AssociatedPhysicalConnection> getAssociatedPhysicalConnections() {
			return this.associatedPhysicalConnections;
		}

		public void setAssociatedPhysicalConnections(List<AssociatedPhysicalConnection> associatedPhysicalConnections) {
			this.associatedPhysicalConnections = associatedPhysicalConnections;
		}

		public List<AssociatedCen> getAssociatedCens() {
			return this.associatedCens;
		}

		public void setAssociatedCens(List<AssociatedCen> associatedCens) {
			this.associatedCens = associatedCens;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class AssociatedPhysicalConnection {

			private String status;

			private String vlanInterfaceId;

			private String circuitCode;

			private String peerIpv6GatewayIp;

			private String localIpv6GatewayIp;

			private String physicalConnectionOwnerUid;

			private String localGatewayIp;

			private String physicalConnectionBusinessStatus;

			private String peeringSubnetMask;

			private Boolean enableIpv6;

			private String physicalConnectionStatus;

			private String peerGatewayIp;

			private String peeringIpv6SubnetMask;

			private String physicalConnectionId;

			private String vlanId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getVlanInterfaceId() {
				return this.vlanInterfaceId;
			}

			public void setVlanInterfaceId(String vlanInterfaceId) {
				this.vlanInterfaceId = vlanInterfaceId;
			}

			public String getCircuitCode() {
				return this.circuitCode;
			}

			public void setCircuitCode(String circuitCode) {
				this.circuitCode = circuitCode;
			}

			public String getPeerIpv6GatewayIp() {
				return this.peerIpv6GatewayIp;
			}

			public void setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
				this.peerIpv6GatewayIp = peerIpv6GatewayIp;
			}

			public String getLocalIpv6GatewayIp() {
				return this.localIpv6GatewayIp;
			}

			public void setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
				this.localIpv6GatewayIp = localIpv6GatewayIp;
			}

			public String getPhysicalConnectionOwnerUid() {
				return this.physicalConnectionOwnerUid;
			}

			public void setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
				this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
			}

			public String getLocalGatewayIp() {
				return this.localGatewayIp;
			}

			public void setLocalGatewayIp(String localGatewayIp) {
				this.localGatewayIp = localGatewayIp;
			}

			public String getPhysicalConnectionBusinessStatus() {
				return this.physicalConnectionBusinessStatus;
			}

			public void setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
				this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
			}

			public String getPeeringSubnetMask() {
				return this.peeringSubnetMask;
			}

			public void setPeeringSubnetMask(String peeringSubnetMask) {
				this.peeringSubnetMask = peeringSubnetMask;
			}

			public Boolean getEnableIpv6() {
				return this.enableIpv6;
			}

			public void setEnableIpv6(Boolean enableIpv6) {
				this.enableIpv6 = enableIpv6;
			}

			public String getPhysicalConnectionStatus() {
				return this.physicalConnectionStatus;
			}

			public void setPhysicalConnectionStatus(String physicalConnectionStatus) {
				this.physicalConnectionStatus = physicalConnectionStatus;
			}

			public String getPeerGatewayIp() {
				return this.peerGatewayIp;
			}

			public void setPeerGatewayIp(String peerGatewayIp) {
				this.peerGatewayIp = peerGatewayIp;
			}

			public String getPeeringIpv6SubnetMask() {
				return this.peeringIpv6SubnetMask;
			}

			public void setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
				this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
			}

			public String getPhysicalConnectionId() {
				return this.physicalConnectionId;
			}

			public void setPhysicalConnectionId(String physicalConnectionId) {
				this.physicalConnectionId = physicalConnectionId;
			}

			public String getVlanId() {
				return this.vlanId;
			}

			public void setVlanId(String vlanId) {
				this.vlanId = vlanId;
			}
		}

		public static class AssociatedCen {

			private Long cenOwnerId;

			private String cenId;

			private String cenStatus;

			public Long getCenOwnerId() {
				return this.cenOwnerId;
			}

			public void setCenOwnerId(Long cenOwnerId) {
				this.cenOwnerId = cenOwnerId;
			}

			public String getCenId() {
				return this.cenId;
			}

			public void setCenId(String cenId) {
				this.cenId = cenId;
			}

			public String getCenStatus() {
				return this.cenStatus;
			}

			public void setCenStatus(String cenStatus) {
				this.cenStatus = cenStatus;
			}
		}

		public static class TagsItem {

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
	}

	@Override
	public DescribeVirtualBorderRoutersResponse getInstance(UnmarshallerContext context) {
		return	DescribeVirtualBorderRoutersResponseUnmarshaller.unmarshall(this, context);
	}
}
