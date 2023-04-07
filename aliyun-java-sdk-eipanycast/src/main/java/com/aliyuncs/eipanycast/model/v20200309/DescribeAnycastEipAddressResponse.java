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
import com.aliyuncs.eipanycast.transform.v20200309.DescribeAnycastEipAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnycastEipAddressResponse extends AcsResponse {

	private String status;

	private String description;

	private String requestId;

	private String instanceChargeType;

	private String createTime;

	private String businessStatus;

	private String internetChargeType;

	private String name;

	private String anycastId;

	private String serviceLocation;

	private Integer bandwidth;

	private String ipAddress;

	private String bid;

	private Long aliUid;

	private List<AnycastEipBindInfo> anycastEipBindInfoList;

	private List<Tag> tags;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnycastId() {
		return this.anycastId;
	}

	public void setAnycastId(String anycastId) {
		this.anycastId = anycastId;
	}

	public String getServiceLocation() {
		return this.serviceLocation;
	}

	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public List<AnycastEipBindInfo> getAnycastEipBindInfoList() {
		return this.anycastEipBindInfoList;
	}

	public void setAnycastEipBindInfoList(List<AnycastEipBindInfo> anycastEipBindInfoList) {
		this.anycastEipBindInfoList = anycastEipBindInfoList;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class AnycastEipBindInfo {

		private String bindInstanceType;

		private String bindTime;

		private String status;

		private String bindInstanceRegionId;

		private String bindInstanceId;

		private String associationMode;

		private String privateIpAddress;

		private List<PopLocation> popLocations;

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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getAssociationMode() {
			return this.associationMode;
		}

		public void setAssociationMode(String associationMode) {
			this.associationMode = associationMode;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public List<PopLocation> getPopLocations() {
			return this.popLocations;
		}

		public void setPopLocations(List<PopLocation> popLocations) {
			this.popLocations = popLocations;
		}

		public static class PopLocation {

			private String popLocation;

			public String getPopLocation() {
				return this.popLocation;
			}

			public void setPopLocation(String popLocation) {
				this.popLocation = popLocation;
			}
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

	@Override
	public DescribeAnycastEipAddressResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnycastEipAddressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
