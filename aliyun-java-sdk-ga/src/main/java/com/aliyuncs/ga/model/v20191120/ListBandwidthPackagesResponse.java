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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListBandwidthPackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBandwidthPackagesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<BandwidthPackage> bandwidthPackages;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public List<BandwidthPackage> getBandwidthPackages() {
		return this.bandwidthPackages;
	}

	public void setBandwidthPackages(List<BandwidthPackage> bandwidthPackages) {
		this.bandwidthPackages = bandwidthPackages;
	}

	public static class BandwidthPackage {

		private String type;

		private String bandwidthType;

		private String state;

		private String createTime;

		private String chargeType;

		private String regionId;

		private String cbnGeographicRegionIdA;

		private String bandwidthPackageId;

		private Integer bandwidth;

		private String description;

		private String expiredTime;

		private String cbnGeographicRegionIdB;

		private String name;

		private String billingType;

		private Integer ratio;

		private String resourceGroupId;

		private List<TagsItem> tags;

		private List<String> accelerators;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBandwidthType() {
			return this.bandwidthType;
		}

		public void setBandwidthType(String bandwidthType) {
			this.bandwidthType = bandwidthType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCbnGeographicRegionIdA() {
			return this.cbnGeographicRegionIdA;
		}

		public void setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
			this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
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

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getCbnGeographicRegionIdB() {
			return this.cbnGeographicRegionIdB;
		}

		public void setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
			this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBillingType() {
			return this.billingType;
		}

		public void setBillingType(String billingType) {
			this.billingType = billingType;
		}

		public Integer getRatio() {
			return this.ratio;
		}

		public void setRatio(Integer ratio) {
			this.ratio = ratio;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getAccelerators() {
			return this.accelerators;
		}

		public void setAccelerators(List<String> accelerators) {
			this.accelerators = accelerators;
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
	public ListBandwidthPackagesResponse getInstance(UnmarshallerContext context) {
		return	ListBandwidthPackagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
