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

package com.aliyuncs.gwlb.model.v20240415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gwlb.transform.v20240415.ListLoadBalancersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLoadBalancersResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<Data> loadBalancers;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public List<Data> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<Data> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	public static class Data {

		private String addressIpVersion;

		private String createTime;

		private Boolean crossZoneEnabled;

		private String loadBalancerBusinessStatus;

		private String loadBalancerId;

		private String loadBalancerName;

		private String loadBalancerStatus;

		private String resourceGroupId;

		private String vpcId;

		private List<TagModel> tags;

		private List<ZoneEniModel> zoneMappings;

		public String getAddressIpVersion() {
			return this.addressIpVersion;
		}

		public void setAddressIpVersion(String addressIpVersion) {
			this.addressIpVersion = addressIpVersion;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getCrossZoneEnabled() {
			return this.crossZoneEnabled;
		}

		public void setCrossZoneEnabled(Boolean crossZoneEnabled) {
			this.crossZoneEnabled = crossZoneEnabled;
		}

		public String getLoadBalancerBusinessStatus() {
			return this.loadBalancerBusinessStatus;
		}

		public void setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
			this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getLoadBalancerName() {
			return this.loadBalancerName;
		}

		public void setLoadBalancerName(String loadBalancerName) {
			this.loadBalancerName = loadBalancerName;
		}

		public String getLoadBalancerStatus() {
			return this.loadBalancerStatus;
		}

		public void setLoadBalancerStatus(String loadBalancerStatus) {
			this.loadBalancerStatus = loadBalancerStatus;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<TagModel> getTags() {
			return this.tags;
		}

		public void setTags(List<TagModel> tags) {
			this.tags = tags;
		}

		public List<ZoneEniModel> getZoneMappings() {
			return this.zoneMappings;
		}

		public void setZoneMappings(List<ZoneEniModel> zoneMappings) {
			this.zoneMappings = zoneMappings;
		}

		public static class TagModel {

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

		public static class ZoneEniModel {

			private String vSwitchId;

			private String zoneId;

			private List<EniModels> loadBalancerAddresses;

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public List<EniModels> getLoadBalancerAddresses() {
				return this.loadBalancerAddresses;
			}

			public void setLoadBalancerAddresses(List<EniModels> loadBalancerAddresses) {
				this.loadBalancerAddresses = loadBalancerAddresses;
			}

			public static class EniModels {

				private String eniId;

				private String privateIpv4Address;

				public String getEniId() {
					return this.eniId;
				}

				public void setEniId(String eniId) {
					this.eniId = eniId;
				}

				public String getPrivateIpv4Address() {
					return this.privateIpv4Address;
				}

				public void setPrivateIpv4Address(String privateIpv4Address) {
					this.privateIpv4Address = privateIpv4Address;
				}
			}
		}
	}

	@Override
	public ListLoadBalancersResponse getInstance(UnmarshallerContext context) {
		return	ListLoadBalancersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
