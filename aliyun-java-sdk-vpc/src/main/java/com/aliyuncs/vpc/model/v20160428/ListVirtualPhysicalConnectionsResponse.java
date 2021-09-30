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
import com.aliyuncs.vpc.transform.v20160428.ListVirtualPhysicalConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVirtualPhysicalConnectionsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer totalCount;

	private Integer count;

	private List<VirtualPhysicalConnection> virtualPhysicalConnections;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<VirtualPhysicalConnection> getVirtualPhysicalConnections() {
		return this.virtualPhysicalConnections;
	}

	public void setVirtualPhysicalConnections(List<VirtualPhysicalConnection> virtualPhysicalConnections) {
		this.virtualPhysicalConnections = virtualPhysicalConnections;
	}

	public static class VirtualPhysicalConnection {

		private String type;

		private String status;

		private String creationTime;

		private String adLocation;

		private String reservationActiveTime;

		private String reservationOrderType;

		private String portNumber;

		private String spec;

		private String chargeType;

		private String reservationInternetChargeType;

		private String description;

		private Long bandwidth;

		private String enabledTime;

		private String lineOperator;

		private String peerLocation;

		private String redundantPhysicalConnectionId;

		private String name;

		private String circuitCode;

		private String endTime;

		private String portType;

		private String businessStatus;

		private String loaStatus;

		private String accessPointId;

		private String hasReservationData;

		private String physicalConnectionId;

		private String productType;

		private String parentPhysicalConnectionId;

		private String virtualPhysicalConnectionStatus;

		private String parentPhysicalConnectionAliUid;

		private String orderMode;

		private String aliUid;

		private String vlanId;

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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getAdLocation() {
			return this.adLocation;
		}

		public void setAdLocation(String adLocation) {
			this.adLocation = adLocation;
		}

		public String getReservationActiveTime() {
			return this.reservationActiveTime;
		}

		public void setReservationActiveTime(String reservationActiveTime) {
			this.reservationActiveTime = reservationActiveTime;
		}

		public String getReservationOrderType() {
			return this.reservationOrderType;
		}

		public void setReservationOrderType(String reservationOrderType) {
			this.reservationOrderType = reservationOrderType;
		}

		public String getPortNumber() {
			return this.portNumber;
		}

		public void setPortNumber(String portNumber) {
			this.portNumber = portNumber;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getReservationInternetChargeType() {
			return this.reservationInternetChargeType;
		}

		public void setReservationInternetChargeType(String reservationInternetChargeType) {
			this.reservationInternetChargeType = reservationInternetChargeType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getEnabledTime() {
			return this.enabledTime;
		}

		public void setEnabledTime(String enabledTime) {
			this.enabledTime = enabledTime;
		}

		public String getLineOperator() {
			return this.lineOperator;
		}

		public void setLineOperator(String lineOperator) {
			this.lineOperator = lineOperator;
		}

		public String getPeerLocation() {
			return this.peerLocation;
		}

		public void setPeerLocation(String peerLocation) {
			this.peerLocation = peerLocation;
		}

		public String getRedundantPhysicalConnectionId() {
			return this.redundantPhysicalConnectionId;
		}

		public void setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
			this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCircuitCode() {
			return this.circuitCode;
		}

		public void setCircuitCode(String circuitCode) {
			this.circuitCode = circuitCode;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getPortType() {
			return this.portType;
		}

		public void setPortType(String portType) {
			this.portType = portType;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getLoaStatus() {
			return this.loaStatus;
		}

		public void setLoaStatus(String loaStatus) {
			this.loaStatus = loaStatus;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getHasReservationData() {
			return this.hasReservationData;
		}

		public void setHasReservationData(String hasReservationData) {
			this.hasReservationData = hasReservationData;
		}

		public String getPhysicalConnectionId() {
			return this.physicalConnectionId;
		}

		public void setPhysicalConnectionId(String physicalConnectionId) {
			this.physicalConnectionId = physicalConnectionId;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getParentPhysicalConnectionId() {
			return this.parentPhysicalConnectionId;
		}

		public void setParentPhysicalConnectionId(String parentPhysicalConnectionId) {
			this.parentPhysicalConnectionId = parentPhysicalConnectionId;
		}

		public String getVirtualPhysicalConnectionStatus() {
			return this.virtualPhysicalConnectionStatus;
		}

		public void setVirtualPhysicalConnectionStatus(String virtualPhysicalConnectionStatus) {
			this.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
		}

		public String getParentPhysicalConnectionAliUid() {
			return this.parentPhysicalConnectionAliUid;
		}

		public void setParentPhysicalConnectionAliUid(String parentPhysicalConnectionAliUid) {
			this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
		}

		public String getOrderMode() {
			return this.orderMode;
		}

		public void setOrderMode(String orderMode) {
			this.orderMode = orderMode;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(String vlanId) {
			this.vlanId = vlanId;
		}
	}

	@Override
	public ListVirtualPhysicalConnectionsResponse getInstance(UnmarshallerContext context) {
		return	ListVirtualPhysicalConnectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
