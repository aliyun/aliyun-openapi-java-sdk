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
import com.aliyuncs.vpc.transform.v20160428.DescribeExpressCloudConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressCloudConnectionsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ExpressCloudConnectionType> expressCloudConnectionSet;

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

	public List<ExpressCloudConnectionType> getExpressCloudConnectionSet() {
		return this.expressCloudConnectionSet;
	}

	public void setExpressCloudConnectionSet(List<ExpressCloudConnectionType> expressCloudConnectionSet) {
		this.expressCloudConnectionSet = expressCloudConnectionSet;
	}

	public static class ExpressCloudConnectionType {

		private String instanceId;

		private String status;

		private String name;

		private String description;

		private String gmtCreate;

		private String gmtModify;

		private String peerCity;

		private String peerLocation;

		private String portType;

		private Integer bandwidth;

		private Integer distance;

		private String redundantEccId;

		private String circuitCode;

		private String isp;

		private String type;

		private String idcSP;

		private String businessStatus;

		private String hasReservationData;

		private String reservationBandwidth;

		private String reservationInternetChargeType;

		private String reservationActiveTime;

		private String reservationOrderType;

		private String applicationType;

		private String applicationId;

		private String applicationStatus;

		private String applicationBandwidth;

		private String endTime;

		private String chargeType;

		private String contactTel;

		private String contactMail;

		private String iDCardNo;

		private String estimatedTime;

		private String bgpAs;

		private String peIp;

		private String ceIp;

		private String constructionPeriod;

		private List<VirtualBorderRouterModel> virtualBorderRouterModels;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getPeerCity() {
			return this.peerCity;
		}

		public void setPeerCity(String peerCity) {
			this.peerCity = peerCity;
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

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public Integer getDistance() {
			return this.distance;
		}

		public void setDistance(Integer distance) {
			this.distance = distance;
		}

		public String getRedundantEccId() {
			return this.redundantEccId;
		}

		public void setRedundantEccId(String redundantEccId) {
			this.redundantEccId = redundantEccId;
		}

		public String getCircuitCode() {
			return this.circuitCode;
		}

		public void setCircuitCode(String circuitCode) {
			this.circuitCode = circuitCode;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIdcSP() {
			return this.idcSP;
		}

		public void setIdcSP(String idcSP) {
			this.idcSP = idcSP;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
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

		public String getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(String applicationType) {
			this.applicationType = applicationType;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getApplicationStatus() {
			return this.applicationStatus;
		}

		public void setApplicationStatus(String applicationStatus) {
			this.applicationStatus = applicationStatus;
		}

		public String getApplicationBandwidth() {
			return this.applicationBandwidth;
		}

		public void setApplicationBandwidth(String applicationBandwidth) {
			this.applicationBandwidth = applicationBandwidth;
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

		public String getContactTel() {
			return this.contactTel;
		}

		public void setContactTel(String contactTel) {
			this.contactTel = contactTel;
		}

		public String getContactMail() {
			return this.contactMail;
		}

		public void setContactMail(String contactMail) {
			this.contactMail = contactMail;
		}

		public String getIDCardNo() {
			return this.iDCardNo;
		}

		public void setIDCardNo(String iDCardNo) {
			this.iDCardNo = iDCardNo;
		}

		public String getEstimatedTime() {
			return this.estimatedTime;
		}

		public void setEstimatedTime(String estimatedTime) {
			this.estimatedTime = estimatedTime;
		}

		public String getBgpAs() {
			return this.bgpAs;
		}

		public void setBgpAs(String bgpAs) {
			this.bgpAs = bgpAs;
		}

		public String getPeIp() {
			return this.peIp;
		}

		public void setPeIp(String peIp) {
			this.peIp = peIp;
		}

		public String getCeIp() {
			return this.ceIp;
		}

		public void setCeIp(String ceIp) {
			this.ceIp = ceIp;
		}

		public String getConstructionPeriod() {
			return this.constructionPeriod;
		}

		public void setConstructionPeriod(String constructionPeriod) {
			this.constructionPeriod = constructionPeriod;
		}

		public List<VirtualBorderRouterModel> getVirtualBorderRouterModels() {
			return this.virtualBorderRouterModels;
		}

		public void setVirtualBorderRouterModels(List<VirtualBorderRouterModel> virtualBorderRouterModels) {
			this.virtualBorderRouterModels = virtualBorderRouterModels;
		}

		public static class VirtualBorderRouterModel {

			private String instanceId;

			private String accessPointId;

			private String physicalConnectionId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getAccessPointId() {
				return this.accessPointId;
			}

			public void setAccessPointId(String accessPointId) {
				this.accessPointId = accessPointId;
			}

			public String getPhysicalConnectionId() {
				return this.physicalConnectionId;
			}

			public void setPhysicalConnectionId(String physicalConnectionId) {
				this.physicalConnectionId = physicalConnectionId;
			}
		}
	}

	@Override
	public DescribeExpressCloudConnectionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressCloudConnectionsResponseUnmarshaller.unmarshall(this, context);
	}
}
