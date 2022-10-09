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
import com.aliyuncs.ga.transform.v20191120.ListBasicAcceleratorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBasicAcceleratorsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<AcceleratorsItem> accelerators;

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

	public List<AcceleratorsItem> getAccelerators() {
		return this.accelerators;
	}

	public void setAccelerators(List<AcceleratorsItem> accelerators) {
		this.accelerators = accelerators;
	}

	public static class AcceleratorsItem {

		private String type;

		private String state;

		private Long createTime;

		private String regionId;

		private String instanceChargeType;

		private String acceleratorId;

		private String description;

		private Long expiredTime;

		private String name;

		private String basicEndpointGroupId;

		private String basicIpSetId;

		private String bandwidthBillingType;

		private BasicBandwidthPackage basicBandwidthPackage;

		private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBasicEndpointGroupId() {
			return this.basicEndpointGroupId;
		}

		public void setBasicEndpointGroupId(String basicEndpointGroupId) {
			this.basicEndpointGroupId = basicEndpointGroupId;
		}

		public String getBasicIpSetId() {
			return this.basicIpSetId;
		}

		public void setBasicIpSetId(String basicIpSetId) {
			this.basicIpSetId = basicIpSetId;
		}

		public String getBandwidthBillingType() {
			return this.bandwidthBillingType;
		}

		public void setBandwidthBillingType(String bandwidthBillingType) {
			this.bandwidthBillingType = bandwidthBillingType;
		}

		public BasicBandwidthPackage getBasicBandwidthPackage() {
			return this.basicBandwidthPackage;
		}

		public void setBasicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
			this.basicBandwidthPackage = basicBandwidthPackage;
		}

		public CrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
			return this.crossDomainBandwidthPackage;
		}

		public void setCrossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
			this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
		}

		public static class BasicBandwidthPackage {

			private Integer bandwidth;

			private String bandwidthType;

			private String instanceId;

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getBandwidthType() {
				return this.bandwidthType;
			}

			public void setBandwidthType(String bandwidthType) {
				this.bandwidthType = bandwidthType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}
		}

		public static class CrossDomainBandwidthPackage {

			private Integer bandwidth;

			private String instanceId;

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}
		}
	}

	@Override
	public ListBasicAcceleratorsResponse getInstance(UnmarshallerContext context) {
		return	ListBasicAcceleratorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
