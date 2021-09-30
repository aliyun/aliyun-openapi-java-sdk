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
import com.aliyuncs.vpc.transform.v20160428.DescribeRouterInterfacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouterInterfacesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<RouterInterfaceType> routerInterfaceSet;

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

	public List<RouterInterfaceType> getRouterInterfaceSet() {
		return this.routerInterfaceSet;
	}

	public void setRouterInterfaceSet(List<RouterInterfaceType> routerInterfaceSet) {
		this.routerInterfaceSet = routerInterfaceSet;
	}

	public static class RouterInterfaceType {

		private String reservationActiveTime;

		private String healthCheckTargetIp;

		private String status;

		private String creationTime;

		private String reservationOrderType;

		private String oppositeInterfaceId;

		private String spec;

		private String chargeType;

		private String routerInterfaceId;

		private Integer hcThreshold;

		private String oppositeRouterType;

		private String vpcInstanceId;

		private String oppositeInterfaceOwnerId;

		private String oppositeVpcInstanceId;

		private String reservationInternetChargeType;

		private Boolean crossBorder;

		private Integer bandwidth;

		private String description;

		private Integer hcRate;

		private String reservationBandwidth;

		private String name;

		private String oppositeRouterId;

		private String oppositeInterfaceSpec;

		private String routerId;

		private String oppositeInterfaceBusinessStatus;

		private String connectedTime;

		private String healthCheckSourceIp;

		private String oppositeInterfaceStatus;

		private String endTime;

		private String oppositeRegionId;

		private String oppositeAccessPointId;

		private String businessStatus;

		private Integer oppositeBandwidth;

		private String routerType;

		private String role;

		private String hasReservationData;

		private String accessPointId;

		private String ipv6Status;

		public String getReservationActiveTime() {
			return this.reservationActiveTime;
		}

		public void setReservationActiveTime(String reservationActiveTime) {
			this.reservationActiveTime = reservationActiveTime;
		}

		public String getHealthCheckTargetIp() {
			return this.healthCheckTargetIp;
		}

		public void setHealthCheckTargetIp(String healthCheckTargetIp) {
			this.healthCheckTargetIp = healthCheckTargetIp;
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

		public String getReservationOrderType() {
			return this.reservationOrderType;
		}

		public void setReservationOrderType(String reservationOrderType) {
			this.reservationOrderType = reservationOrderType;
		}

		public String getOppositeInterfaceId() {
			return this.oppositeInterfaceId;
		}

		public void setOppositeInterfaceId(String oppositeInterfaceId) {
			this.oppositeInterfaceId = oppositeInterfaceId;
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

		public String getRouterInterfaceId() {
			return this.routerInterfaceId;
		}

		public void setRouterInterfaceId(String routerInterfaceId) {
			this.routerInterfaceId = routerInterfaceId;
		}

		public Integer getHcThreshold() {
			return this.hcThreshold;
		}

		public void setHcThreshold(Integer hcThreshold) {
			this.hcThreshold = hcThreshold;
		}

		public String getOppositeRouterType() {
			return this.oppositeRouterType;
		}

		public void setOppositeRouterType(String oppositeRouterType) {
			this.oppositeRouterType = oppositeRouterType;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getOppositeInterfaceOwnerId() {
			return this.oppositeInterfaceOwnerId;
		}

		public void setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
			this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
		}

		public String getOppositeVpcInstanceId() {
			return this.oppositeVpcInstanceId;
		}

		public void setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
			this.oppositeVpcInstanceId = oppositeVpcInstanceId;
		}

		public String getReservationInternetChargeType() {
			return this.reservationInternetChargeType;
		}

		public void setReservationInternetChargeType(String reservationInternetChargeType) {
			this.reservationInternetChargeType = reservationInternetChargeType;
		}

		public Boolean getCrossBorder() {
			return this.crossBorder;
		}

		public void setCrossBorder(Boolean crossBorder) {
			this.crossBorder = crossBorder;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getHcRate() {
			return this.hcRate;
		}

		public void setHcRate(Integer hcRate) {
			this.hcRate = hcRate;
		}

		public String getReservationBandwidth() {
			return this.reservationBandwidth;
		}

		public void setReservationBandwidth(String reservationBandwidth) {
			this.reservationBandwidth = reservationBandwidth;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOppositeRouterId() {
			return this.oppositeRouterId;
		}

		public void setOppositeRouterId(String oppositeRouterId) {
			this.oppositeRouterId = oppositeRouterId;
		}

		public String getOppositeInterfaceSpec() {
			return this.oppositeInterfaceSpec;
		}

		public void setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
			this.oppositeInterfaceSpec = oppositeInterfaceSpec;
		}

		public String getRouterId() {
			return this.routerId;
		}

		public void setRouterId(String routerId) {
			this.routerId = routerId;
		}

		public String getOppositeInterfaceBusinessStatus() {
			return this.oppositeInterfaceBusinessStatus;
		}

		public void setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
			this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
		}

		public String getConnectedTime() {
			return this.connectedTime;
		}

		public void setConnectedTime(String connectedTime) {
			this.connectedTime = connectedTime;
		}

		public String getHealthCheckSourceIp() {
			return this.healthCheckSourceIp;
		}

		public void setHealthCheckSourceIp(String healthCheckSourceIp) {
			this.healthCheckSourceIp = healthCheckSourceIp;
		}

		public String getOppositeInterfaceStatus() {
			return this.oppositeInterfaceStatus;
		}

		public void setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
			this.oppositeInterfaceStatus = oppositeInterfaceStatus;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getOppositeRegionId() {
			return this.oppositeRegionId;
		}

		public void setOppositeRegionId(String oppositeRegionId) {
			this.oppositeRegionId = oppositeRegionId;
		}

		public String getOppositeAccessPointId() {
			return this.oppositeAccessPointId;
		}

		public void setOppositeAccessPointId(String oppositeAccessPointId) {
			this.oppositeAccessPointId = oppositeAccessPointId;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public Integer getOppositeBandwidth() {
			return this.oppositeBandwidth;
		}

		public void setOppositeBandwidth(Integer oppositeBandwidth) {
			this.oppositeBandwidth = oppositeBandwidth;
		}

		public String getRouterType() {
			return this.routerType;
		}

		public void setRouterType(String routerType) {
			this.routerType = routerType;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getHasReservationData() {
			return this.hasReservationData;
		}

		public void setHasReservationData(String hasReservationData) {
			this.hasReservationData = hasReservationData;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getIpv6Status() {
			return this.ipv6Status;
		}

		public void setIpv6Status(String ipv6Status) {
			this.ipv6Status = ipv6Status;
		}
	}

	@Override
	public DescribeRouterInterfacesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRouterInterfacesResponseUnmarshaller.unmarshall(this, context);
	}
}
