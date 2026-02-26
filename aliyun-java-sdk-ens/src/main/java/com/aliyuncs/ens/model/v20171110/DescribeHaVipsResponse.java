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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeHaVipsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHaVipsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageSize;

	private String pageNumber;

	private List<HaVip> haVips;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<HaVip> getHaVips() {
		return this.haVips;
	}

	public void setHaVips(List<HaVip> haVips) {
		this.haVips = haVips;
	}

	public static class HaVip {

		private String status;

		private String creationTime;

		private String description;

		private String haVipId;

		private String name;

		private String ensRegionId;

		private String networkId;

		private String vSwitchId;

		private String ipAddress;

		private List<Eip> associatedEipAddresses;

		private List<Relation> associatedInstances;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getHaVipId() {
			return this.haVipId;
		}

		public void setHaVipId(String haVipId) {
			this.haVipId = haVipId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getNetworkId() {
			return this.networkId;
		}

		public void setNetworkId(String networkId) {
			this.networkId = networkId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public List<Eip> getAssociatedEipAddresses() {
			return this.associatedEipAddresses;
		}

		public void setAssociatedEipAddresses(List<Eip> associatedEipAddresses) {
			this.associatedEipAddresses = associatedEipAddresses;
		}

		public List<Relation> getAssociatedInstances() {
			return this.associatedInstances;
		}

		public void setAssociatedInstances(List<Relation> associatedInstances) {
			this.associatedInstances = associatedInstances;
		}

		public static class Eip {

			private String eipId;

			private String eip;

			public String getEipId() {
				return this.eipId;
			}

			public void setEipId(String eipId) {
				this.eipId = eipId;
			}

			public String getEip() {
				return this.eip;
			}

			public void setEip(String eip) {
				this.eip = eip;
			}
		}

		public static class Relation {

			private String instanceId;

			private String instanceType;

			private String ipAddress;

			private String status;

			private String creationTime;

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

			public String getIpAddress() {
				return this.ipAddress;
			}

			public void setIpAddress(String ipAddress) {
				this.ipAddress = ipAddress;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}
		}
	}

	@Override
	public DescribeHaVipsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHaVipsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
