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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeNetworkInterfaceLiteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeNetworkInterfaceLiteResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String networkInterfaceId;

		private String status;

		private String type;

		private String vSwitchId;

		private String privateIpAddress;

		private String macAddress;

		private String networkInterfaceName;

		private String description;

		private String creationTime;

		private Long serviceID;

		private Boolean serviceManaged;

		private Long aliUid;

		private String bid;

		private String regionId;

		private List<PrivateIpSet> privateIpSets;

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}

		public String getNetworkInterfaceName() {
			return this.networkInterfaceName;
		}

		public void setNetworkInterfaceName(String networkInterfaceName) {
			this.networkInterfaceName = networkInterfaceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Long getServiceID() {
			return this.serviceID;
		}

		public void setServiceID(Long serviceID) {
			this.serviceID = serviceID;
		}

		public Boolean getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Boolean serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<PrivateIpSet> getPrivateIpSets() {
			return this.privateIpSets;
		}

		public void setPrivateIpSets(List<PrivateIpSet> privateIpSets) {
			this.privateIpSets = privateIpSets;
		}

		public static class PrivateIpSet {

			private String privateIpAddress;

			private Boolean primary;

			public String getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(String privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}

			public Boolean getPrimary() {
				return this.primary;
			}

			public void setPrimary(Boolean primary) {
				this.primary = primary;
			}
		}
	}

	@Override
	public OpsDescribeNetworkInterfaceLiteResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeNetworkInterfaceLiteResponseUnmarshaller.unmarshall(this, context);
	}
}
