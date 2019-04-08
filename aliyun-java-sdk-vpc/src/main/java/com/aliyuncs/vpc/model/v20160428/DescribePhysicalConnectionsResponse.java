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
import com.aliyuncs.vpc.transform.v20160428.DescribePhysicalConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePhysicalConnectionsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<PhysicalConnectionType> physicalConnectionSet;

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

	public List<PhysicalConnectionType> getPhysicalConnectionSet() {
		return this.physicalConnectionSet;
	}

	public void setPhysicalConnectionSet(List<PhysicalConnectionType> physicalConnectionSet) {
		this.physicalConnectionSet = physicalConnectionSet;
	}

	public static class PhysicalConnectionType {

		private String physicalConnectionId;

		private String accessPointId;

		private String type;

		private String status;

		private String businessStatus;

		private String creationTime;

		private String enabledTime;

		private String lineOperator;

		private String spec;

		private String peerLocation;

		private String portType;

		private String redundantPhysicalConnectionId;

		private String name;

		private String description;

		private String adLocation;

		private String portNumber;

		private String circuitCode;

		private Long bandwidth;

		private String loaStatus;

		private String spec1;

		private String hasReservationData;

		private String reservationInternetChargeType;

		private String reservationActiveTime;

		private String reservationOrderType;

		private String endTime;

		private String chargeType;

		public String getPhysicalConnectionId() {
			return this.physicalConnectionId;
		}

		public void setPhysicalConnectionId(String physicalConnectionId) {
			this.physicalConnectionId = physicalConnectionId;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
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

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
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

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getPeerLocation() {
			return this.peerLocation;
		}

		public void setPeerLocation(String peerLocation) {
			this.peerLocation = peerLocation;
		}

		public String getPortType() {
			return this.portType;
		}

		public void setPortType(String portType) {
			this.portType = portType;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAdLocation() {
			return this.adLocation;
		}

		public void setAdLocation(String adLocation) {
			this.adLocation = adLocation;
		}

		public String getPortNumber() {
			return this.portNumber;
		}

		public void setPortNumber(String portNumber) {
			this.portNumber = portNumber;
		}

		public String getCircuitCode() {
			return this.circuitCode;
		}

		public void setCircuitCode(String circuitCode) {
			this.circuitCode = circuitCode;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getLoaStatus() {
			return this.loaStatus;
		}

		public void setLoaStatus(String loaStatus) {
			this.loaStatus = loaStatus;
		}

		public String getSpec1() {
			return this.spec1;
		}

		public void setSpec1(String spec1) {
			this.spec1 = spec1;
		}

		public String getHasReservationData() {
			return this.hasReservationData;
		}

		public void setHasReservationData(String hasReservationData) {
			this.hasReservationData = hasReservationData;
		}

		public String getReservationInternetChargeType() {
			return this.reservationInternetChargeType;
		}

		public void setReservationInternetChargeType(String reservationInternetChargeType) {
			this.reservationInternetChargeType = reservationInternetChargeType;
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

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}
	}

	@Override
	public DescribePhysicalConnectionsResponse getInstance(UnmarshallerContext context) {
		return	DescribePhysicalConnectionsResponseUnmarshaller.unmarshall(this, context);
	}
}
