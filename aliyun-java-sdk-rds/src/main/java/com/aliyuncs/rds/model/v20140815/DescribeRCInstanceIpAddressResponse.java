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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCInstanceIpAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCInstanceIpAddressResponse extends AcsResponse {

	private String requestId;

	private String total;

	private List<RCInstanceListItem> rCInstanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<RCInstanceListItem> getRCInstanceList() {
		return this.rCInstanceList;
	}

	public void setRCInstanceList(List<RCInstanceListItem> rCInstanceList) {
		this.rCInstanceList = rCInstanceList;
	}

	public static class RCInstanceListItem {

		private String instanceId;

		private String instanceType;

		private String instanceName;

		private String instanceStatus;

		private List<IpAddressConfigItem> ipAddressConfig;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public List<IpAddressConfigItem> getIpAddressConfig() {
			return this.ipAddressConfig;
		}

		public void setIpAddressConfig(List<IpAddressConfigItem> ipAddressConfig) {
			this.ipAddressConfig = ipAddressConfig;
		}

		public static class IpAddressConfigItem {

			private String instanceIp;

			private Boolean isBgppack;

			private String ipVersion;

			private String ipStatus;

			private String regionId;

			private Integer elasticThreshold;

			private Integer blackholeThreshold;

			private Integer defenseBpsThreshold;

			private Integer defensePpsThreshold;

			private Integer isFullProtection;

			public String getInstanceIp() {
				return this.instanceIp;
			}

			public void setInstanceIp(String instanceIp) {
				this.instanceIp = instanceIp;
			}

			public Boolean getIsBgppack() {
				return this.isBgppack;
			}

			public void setIsBgppack(Boolean isBgppack) {
				this.isBgppack = isBgppack;
			}

			public String getIpVersion() {
				return this.ipVersion;
			}

			public void setIpVersion(String ipVersion) {
				this.ipVersion = ipVersion;
			}

			public String getIpStatus() {
				return this.ipStatus;
			}

			public void setIpStatus(String ipStatus) {
				this.ipStatus = ipStatus;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Integer getElasticThreshold() {
				return this.elasticThreshold;
			}

			public void setElasticThreshold(Integer elasticThreshold) {
				this.elasticThreshold = elasticThreshold;
			}

			public Integer getBlackholeThreshold() {
				return this.blackholeThreshold;
			}

			public void setBlackholeThreshold(Integer blackholeThreshold) {
				this.blackholeThreshold = blackholeThreshold;
			}

			public Integer getDefenseBpsThreshold() {
				return this.defenseBpsThreshold;
			}

			public void setDefenseBpsThreshold(Integer defenseBpsThreshold) {
				this.defenseBpsThreshold = defenseBpsThreshold;
			}

			public Integer getDefensePpsThreshold() {
				return this.defensePpsThreshold;
			}

			public void setDefensePpsThreshold(Integer defensePpsThreshold) {
				this.defensePpsThreshold = defensePpsThreshold;
			}

			public Integer getIsFullProtection() {
				return this.isFullProtection;
			}

			public void setIsFullProtection(Integer isFullProtection) {
				this.isFullProtection = isFullProtection;
			}
		}
	}

	@Override
	public DescribeRCInstanceIpAddressResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCInstanceIpAddressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
