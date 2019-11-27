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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeRouterInterfaceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouterInterfaceAttributeResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String routerInterfaceId;

	private String oppositeRegionId;

	private String role;

	private String spec;

	private String name;

	private String description;

	private String routerId;

	private String routerType;

	private String creationTime;

	private String gmtModified;

	private String endTime;

	private String chargeType;

	private String status;

	private String businessStatus;

	private String connectedTime;

	private String oppositeInterfaceId;

	private String oppositeInterfaceSpec;

	private String oppositeInterfaceStatus;

	private String oppositeInterfaceBusinessStatus;

	private String oppositeRouterId;

	private String oppositeRouterType;

	private String oppositeInterfaceOwnerId;

	private String accessPointId;

	private String oppositeAccessPointId;

	private String healthCheckSourceIp;

	private String healthCheckTargetIp;

	private String oppositeVpcInstanceId;

	private Integer bandwidth;

	private String vpcInstanceId;

	private Integer oppositeBandwidth;

	private String hasReservationData;

	private String reservationBandwidth;

	private String reservationInternetChargeType;

	private String reservationActiveTime;

	private String reservationOrderType;

	private Boolean crossBorder;

	private Integer hcThreshold;

	private Integer hcRate;

	private String healthCheckStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRouterInterfaceId() {
		return this.routerInterfaceId;
	}

	public void setRouterInterfaceId(String routerInterfaceId) {
		this.routerInterfaceId = routerInterfaceId;
	}

	public String getOppositeRegionId() {
		return this.oppositeRegionId;
	}

	public void setOppositeRegionId(String oppositeRegionId) {
		this.oppositeRegionId = oppositeRegionId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
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

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
	}

	public String getRouterType() {
		return this.routerType;
	}

	public void setRouterType(String routerType) {
		this.routerType = routerType;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
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

	public String getConnectedTime() {
		return this.connectedTime;
	}

	public void setConnectedTime(String connectedTime) {
		this.connectedTime = connectedTime;
	}

	public String getOppositeInterfaceId() {
		return this.oppositeInterfaceId;
	}

	public void setOppositeInterfaceId(String oppositeInterfaceId) {
		this.oppositeInterfaceId = oppositeInterfaceId;
	}

	public String getOppositeInterfaceSpec() {
		return this.oppositeInterfaceSpec;
	}

	public void setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
		this.oppositeInterfaceSpec = oppositeInterfaceSpec;
	}

	public String getOppositeInterfaceStatus() {
		return this.oppositeInterfaceStatus;
	}

	public void setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
		this.oppositeInterfaceStatus = oppositeInterfaceStatus;
	}

	public String getOppositeInterfaceBusinessStatus() {
		return this.oppositeInterfaceBusinessStatus;
	}

	public void setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
		this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
	}

	public String getOppositeRouterId() {
		return this.oppositeRouterId;
	}

	public void setOppositeRouterId(String oppositeRouterId) {
		this.oppositeRouterId = oppositeRouterId;
	}

	public String getOppositeRouterType() {
		return this.oppositeRouterType;
	}

	public void setOppositeRouterType(String oppositeRouterType) {
		this.oppositeRouterType = oppositeRouterType;
	}

	public String getOppositeInterfaceOwnerId() {
		return this.oppositeInterfaceOwnerId;
	}

	public void setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
		this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
	}

	public String getAccessPointId() {
		return this.accessPointId;
	}

	public void setAccessPointId(String accessPointId) {
		this.accessPointId = accessPointId;
	}

	public String getOppositeAccessPointId() {
		return this.oppositeAccessPointId;
	}

	public void setOppositeAccessPointId(String oppositeAccessPointId) {
		this.oppositeAccessPointId = oppositeAccessPointId;
	}

	public String getHealthCheckSourceIp() {
		return this.healthCheckSourceIp;
	}

	public void setHealthCheckSourceIp(String healthCheckSourceIp) {
		this.healthCheckSourceIp = healthCheckSourceIp;
	}

	public String getHealthCheckTargetIp() {
		return this.healthCheckTargetIp;
	}

	public void setHealthCheckTargetIp(String healthCheckTargetIp) {
		this.healthCheckTargetIp = healthCheckTargetIp;
	}

	public String getOppositeVpcInstanceId() {
		return this.oppositeVpcInstanceId;
	}

	public void setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
		this.oppositeVpcInstanceId = oppositeVpcInstanceId;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getVpcInstanceId() {
		return this.vpcInstanceId;
	}

	public void setVpcInstanceId(String vpcInstanceId) {
		this.vpcInstanceId = vpcInstanceId;
	}

	public Integer getOppositeBandwidth() {
		return this.oppositeBandwidth;
	}

	public void setOppositeBandwidth(Integer oppositeBandwidth) {
		this.oppositeBandwidth = oppositeBandwidth;
	}

	public String getHasReservationData() {
		return this.hasReservationData;
	}

	public void setHasReservationData(String hasReservationData) {
		this.hasReservationData = hasReservationData;
	}

	public String getReservationBandwidth() {
		return this.reservationBandwidth;
	}

	public void setReservationBandwidth(String reservationBandwidth) {
		this.reservationBandwidth = reservationBandwidth;
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

	public Boolean getCrossBorder() {
		return this.crossBorder;
	}

	public void setCrossBorder(Boolean crossBorder) {
		this.crossBorder = crossBorder;
	}

	public Integer getHcThreshold() {
		return this.hcThreshold;
	}

	public void setHcThreshold(Integer hcThreshold) {
		this.hcThreshold = hcThreshold;
	}

	public Integer getHcRate() {
		return this.hcRate;
	}

	public void setHcRate(Integer hcRate) {
		this.hcRate = hcRate;
	}

	public String getHealthCheckStatus() {
		return this.healthCheckStatus;
	}

	public void setHealthCheckStatus(String healthCheckStatus) {
		this.healthCheckStatus = healthCheckStatus;
	}

	@Override
	public DescribeRouterInterfaceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRouterInterfaceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
