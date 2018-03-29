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

		private String businessStatus;

		private String creationTime;

		private String expiredTime;

		private String status;

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

		public List<String> getCenIds() {
			return this.cenIds;
		}

		public void setCenIds(List<String> cenIds) {
			this.cenIds = cenIds;
		}
	}

	@Override
	public DescribeCenBandwidthPackagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenBandwidthPackagesResponseUnmarshaller.unmarshall(this, context);
	}
}
