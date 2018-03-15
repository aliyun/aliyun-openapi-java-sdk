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

		private String vbrId;

		private String creationTime;

		private String activationTime;

		private String terminationTime;

		private String recoveryTime;

		private String status;

		private Integer vlanId;

		private String circuitCode;

		private String routeTableId;

		private String vlanInterfaceId;

		private String localGatewayIp;

		private String peerGatewayIp;

		private String peeringSubnetMask;

		private String physicalConnectionId;

		private String physicalConnectionStatus;

		private String physicalConnectionBusinessStatus;

		private String physicalConnectionOwnerUid;

		private String accessPointId;

		private String name;

		private String description;

		private List<AssociatedPhysicalConnection> associatedPhysicalConnections;

		private List<AssociatedCen> associatedCens;

		public String getVbrId() {
			return this.vbrId;
		}

		public void setVbrId(String vbrId) {
			this.vbrId = vbrId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getActivationTime() {
			return this.activationTime;
		}

		public void setActivationTime(String activationTime) {
			this.activationTime = activationTime;
		}

		public String getTerminationTime() {
			return this.terminationTime;
		}

		public void setTerminationTime(String terminationTime) {
			this.terminationTime = terminationTime;
		}

		public String getRecoveryTime() {
			return this.recoveryTime;
		}

		public void setRecoveryTime(String recoveryTime) {
			this.recoveryTime = recoveryTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(Integer vlanId) {
			this.vlanId = vlanId;
		}

		public String getCircuitCode() {
			return this.circuitCode;
		}

		public void setCircuitCode(String circuitCode) {
			this.circuitCode = circuitCode;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getVlanInterfaceId() {
			return this.vlanInterfaceId;
		}

		public void setVlanInterfaceId(String vlanInterfaceId) {
			this.vlanInterfaceId = vlanInterfaceId;
		}

		public String getLocalGatewayIp() {
			return this.localGatewayIp;
		}

		public void setLocalGatewayIp(String localGatewayIp) {
			this.localGatewayIp = localGatewayIp;
		}

		public String getPeerGatewayIp() {
			return this.peerGatewayIp;
		}

		public void setPeerGatewayIp(String peerGatewayIp) {
			this.peerGatewayIp = peerGatewayIp;
		}

		public String getPeeringSubnetMask() {
			return this.peeringSubnetMask;
		}

		public void setPeeringSubnetMask(String peeringSubnetMask) {
			this.peeringSubnetMask = peeringSubnetMask;
		}

		public String getPhysicalConnectionId() {
			return this.physicalConnectionId;
		}

		public void setPhysicalConnectionId(String physicalConnectionId) {
			this.physicalConnectionId = physicalConnectionId;
		}

		public String getPhysicalConnectionStatus() {
			return this.physicalConnectionStatus;
		}

		public void setPhysicalConnectionStatus(String physicalConnectionStatus) {
			this.physicalConnectionStatus = physicalConnectionStatus;
		}

		public String getPhysicalConnectionBusinessStatus() {
			return this.physicalConnectionBusinessStatus;
		}

		public void setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
			this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
		}

		public String getPhysicalConnectionOwnerUid() {
			return this.physicalConnectionOwnerUid;
		}

		public void setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
			this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

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

		public static class AssociatedPhysicalConnection {

			private String circuitCode;

			private String vlanInterfaceId;

			private String localGatewayIp;

			private String peerGatewayIp;

			private String peeringSubnetMask;

			private String physicalConnectionId;

			private String physicalConnectionStatus;

			private String physicalConnectionBusinessStatus;

			private String physicalConnectionOwnerUid;

			private String vlanId;

			public String getCircuitCode() {
				return this.circuitCode;
			}

			public void setCircuitCode(String circuitCode) {
				this.circuitCode = circuitCode;
			}

			public String getVlanInterfaceId() {
				return this.vlanInterfaceId;
			}

			public void setVlanInterfaceId(String vlanInterfaceId) {
				this.vlanInterfaceId = vlanInterfaceId;
			}

			public String getLocalGatewayIp() {
				return this.localGatewayIp;
			}

			public void setLocalGatewayIp(String localGatewayIp) {
				this.localGatewayIp = localGatewayIp;
			}

			public String getPeerGatewayIp() {
				return this.peerGatewayIp;
			}

			public void setPeerGatewayIp(String peerGatewayIp) {
				this.peerGatewayIp = peerGatewayIp;
			}

			public String getPeeringSubnetMask() {
				return this.peeringSubnetMask;
			}

			public void setPeeringSubnetMask(String peeringSubnetMask) {
				this.peeringSubnetMask = peeringSubnetMask;
			}

			public String getPhysicalConnectionId() {
				return this.physicalConnectionId;
			}

			public void setPhysicalConnectionId(String physicalConnectionId) {
				this.physicalConnectionId = physicalConnectionId;
			}

			public String getPhysicalConnectionStatus() {
				return this.physicalConnectionStatus;
			}

			public void setPhysicalConnectionStatus(String physicalConnectionStatus) {
				this.physicalConnectionStatus = physicalConnectionStatus;
			}

			public String getPhysicalConnectionBusinessStatus() {
				return this.physicalConnectionBusinessStatus;
			}

			public void setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
				this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
			}

			public String getPhysicalConnectionOwnerUid() {
				return this.physicalConnectionOwnerUid;
			}

			public void setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
				this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
			}

			public String getVlanId() {
				return this.vlanId;
			}

			public void setVlanId(String vlanId) {
				this.vlanId = vlanId;
			}
		}

		public static class AssociatedCen {

			private String cenId;

			private Long cenOwnerId;

			private String cenStatus;

			public String getCenId() {
				return this.cenId;
			}

			public void setCenId(String cenId) {
				this.cenId = cenId;
			}

			public Long getCenOwnerId() {
				return this.cenOwnerId;
			}

			public void setCenOwnerId(Long cenOwnerId) {
				this.cenOwnerId = cenOwnerId;
			}

			public String getCenStatus() {
				return this.cenStatus;
			}

			public void setCenStatus(String cenStatus) {
				this.cenStatus = cenStatus;
			}
		}
	}

	@Override
	public DescribeVirtualBorderRoutersResponse getInstance(UnmarshallerContext context) {
		return	DescribeVirtualBorderRoutersResponseUnmarshaller.unmarshall(this, context);
	}
}
