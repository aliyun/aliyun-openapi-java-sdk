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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeCenBandwidthPackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenBandwidthPackagesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CenBandwidthPackage> cenBandwidthPackages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<CenBandwidthPackage> getCenBandwidthPackages() {
		return this.cenBandwidthPackages;
	}

	public void setCenBandwidthPackages(List<CenBandwidthPackage> cenBandwidthPackages) {
		this.cenBandwidthPackages = cenBandwidthPackages;
	}

	public static class CenBandwidthPackage {

		private String cenBandwidthPackageId;

		private String name;

		private String description;

		private Long bandwidth;

		private String bandwidthPackageChargeType;

		private String geographicRegionAId;

		private String geographicRegionBId;

		private String geographicSpanId;

		private String businessStatus;

		private String creationTime;

		private String expiredTime;

		private String status;

		private Boolean isCrossBorder;

		private String typeFor95;

		private String ratio;

		private String hasReservationData;

		private String reservationBandwidth;

		private String reservationInternetChargeType;

		private String reservationActiveTime;

		private String reservationOrderType;

		private List<OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimits;

		private List<Tag> tags;

		private List<String> cenIds;

		public String getCenBandwidthPackageId() {
			return this.cenBandwidthPackageId;
		}

		public void setCenBandwidthPackageId(String cenBandwidthPackageId) {
			this.cenBandwidthPackageId = cenBandwidthPackageId;
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

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getBandwidthPackageChargeType() {
			return this.bandwidthPackageChargeType;
		}

		public void setBandwidthPackageChargeType(String bandwidthPackageChargeType) {
			this.bandwidthPackageChargeType = bandwidthPackageChargeType;
		}

		public String getGeographicRegionAId() {
			return this.geographicRegionAId;
		}

		public void setGeographicRegionAId(String geographicRegionAId) {
			this.geographicRegionAId = geographicRegionAId;
		}

		public String getGeographicRegionBId() {
			return this.geographicRegionBId;
		}

		public void setGeographicRegionBId(String geographicRegionBId) {
			this.geographicRegionBId = geographicRegionBId;
		}

		public String getGeographicSpanId() {
			return this.geographicSpanId;
		}

		public void setGeographicSpanId(String geographicSpanId) {
			this.geographicSpanId = geographicSpanId;
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

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getIsCrossBorder() {
			return this.isCrossBorder;
		}

		public void setIsCrossBorder(Boolean isCrossBorder) {
			this.isCrossBorder = isCrossBorder;
		}

		public String getTypeFor95() {
			return this.typeFor95;
		}

		public void setTypeFor95(String typeFor95) {
			this.typeFor95 = typeFor95;
		}

		public String getRatio() {
			return this.ratio;
		}

		public void setRatio(String ratio) {
			this.ratio = ratio;
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

		public List<OrginInterRegionBandwidthLimit> getOrginInterRegionBandwidthLimits() {
			return this.orginInterRegionBandwidthLimits;
		}

		public void setOrginInterRegionBandwidthLimits(List<OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimits) {
			this.orginInterRegionBandwidthLimits = orginInterRegionBandwidthLimits;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getCenIds() {
			return this.cenIds;
		}

		public void setCenIds(List<String> cenIds) {
			this.cenIds = cenIds;
		}

		public static class OrginInterRegionBandwidthLimit {

			private String localRegionId;

			private String oppositeRegionId;

			private String geographicSpanId;

			private String bandwidthLimit;

			public String getLocalRegionId() {
				return this.localRegionId;
			}

			public void setLocalRegionId(String localRegionId) {
				this.localRegionId = localRegionId;
			}

			public String getOppositeRegionId() {
				return this.oppositeRegionId;
			}

			public void setOppositeRegionId(String oppositeRegionId) {
				this.oppositeRegionId = oppositeRegionId;
			}

			public String getGeographicSpanId() {
				return this.geographicSpanId;
			}

			public void setGeographicSpanId(String geographicSpanId) {
				this.geographicSpanId = geographicSpanId;
			}

			public String getBandwidthLimit() {
				return this.bandwidthLimit;
			}

			public void setBandwidthLimit(String bandwidthLimit) {
				this.bandwidthLimit = bandwidthLimit;
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
	}

	@Override
	public DescribeCenBandwidthPackagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenBandwidthPackagesResponseUnmarshaller.unmarshall(this, context);
	}
}
