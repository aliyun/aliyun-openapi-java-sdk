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

package com.aliyuncs.eipanycast.model.v20200309;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eipanycast.transform.v20200309.ListAnycastEipAddressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAnycastEipAddressesResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private List<Anycast> anycastList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<Anycast> getAnycastList() {
		return this.anycastList;
	}

	public void setAnycastList(List<Anycast> anycastList) {
		this.anycastList = anycastList;
	}

	public static class Anycast {

		private String status;

		private String createTime;

		private String anycastId;

		private Long aliUid;

		private String bid;

		private String serviceLocation;

		private String instanceChargeType;

		private String ipAddress;

		private Integer bandwidth;

		private String description;

		private String internetChargeType;

		private String businessStatus;

		private String name;

		private Integer serviceManaged;

		private List<AnycastEipBindInfo> anycastEipBindInfoList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAnycastId() {
			return this.anycastId;
		}

		public void setAnycastId(String anycastId) {
			this.anycastId = anycastId;
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

		public String getServiceLocation() {
			return this.serviceLocation;
		}

		public void setServiceLocation(String serviceLocation) {
			this.serviceLocation = serviceLocation;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
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

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Integer serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public List<AnycastEipBindInfo> getAnycastEipBindInfoList() {
			return this.anycastEipBindInfoList;
		}

		public void setAnycastEipBindInfoList(List<AnycastEipBindInfo> anycastEipBindInfoList) {
			this.anycastEipBindInfoList = anycastEipBindInfoList;
		}

		public static class AnycastEipBindInfo {

			private String bindInstanceType;

			private String bindTime;

			private String bindInstanceRegionId;

			private String bindInstanceId;

			public String getBindInstanceType() {
				return this.bindInstanceType;
			}

			public void setBindInstanceType(String bindInstanceType) {
				this.bindInstanceType = bindInstanceType;
			}

			public String getBindTime() {
				return this.bindTime;
			}

			public void setBindTime(String bindTime) {
				this.bindTime = bindTime;
			}

			public String getBindInstanceRegionId() {
				return this.bindInstanceRegionId;
			}

			public void setBindInstanceRegionId(String bindInstanceRegionId) {
				this.bindInstanceRegionId = bindInstanceRegionId;
			}

			public String getBindInstanceId() {
				return this.bindInstanceId;
			}

			public void setBindInstanceId(String bindInstanceId) {
				this.bindInstanceId = bindInstanceId;
			}
		}
	}

	@Override
	public ListAnycastEipAddressesResponse getInstance(UnmarshallerContext context) {
		return	ListAnycastEipAddressesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
