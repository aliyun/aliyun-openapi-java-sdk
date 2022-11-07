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
import com.aliyuncs.ga.transform.v20191120.ListAcceleratorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAcceleratorsResponse extends AcsResponse {

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

		private String dnsName;

		private String type;

		private String secondDnsName;

		private String spec;

		private String state;

		private Long createTime;

		private String cenId;

		private String ddosId;

		private String regionId;

		private String instanceChargeType;

		private String acceleratorId;

		private String description;

		private Integer bandwidth;

		private String bandwidthBillingType;

		private Long expiredTime;

		private String name;

		private String resourceGroupId;

		private List<TagsItem> tags;

		private BasicBandwidthPackage basicBandwidthPackage;

		private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

		private IpSetConfig ipSetConfig;

		public String getDnsName() {
			return this.dnsName;
		}

		public void setDnsName(String dnsName) {
			this.dnsName = dnsName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSecondDnsName() {
			return this.secondDnsName;
		}

		public void setSecondDnsName(String secondDnsName) {
			this.secondDnsName = secondDnsName;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
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

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getDdosId() {
			return this.ddosId;
		}

		public void setDdosId(String ddosId) {
			this.ddosId = ddosId;
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

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getBandwidthBillingType() {
			return this.bandwidthBillingType;
		}

		public void setBandwidthBillingType(String bandwidthBillingType) {
			this.bandwidthBillingType = bandwidthBillingType;
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

		public IpSetConfig getIpSetConfig() {
			return this.ipSetConfig;
		}

		public void setIpSetConfig(IpSetConfig ipSetConfig) {
			this.ipSetConfig = ipSetConfig;
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

		public static class IpSetConfig {

			private String accessMode;

			public String getAccessMode() {
				return this.accessMode;
			}

			public void setAccessMode(String accessMode) {
				this.accessMode = accessMode;
			}
		}
	}

	@Override
	public ListAcceleratorsResponse getInstance(UnmarshallerContext context) {
		return	ListAcceleratorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
