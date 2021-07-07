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

	private String requestId;

	private String anycastId;

	private String ipAddress;

	private String name;

	private String description;

	private Integer bandwidth;

	private String instanceChargeType;

	private String internetChargeType;

	private String createTime;

	private String status;

	private String serviceLocation;

	private Long aliUid;

	private String bid;

	private String businessStatus;

	private List<AnycastEipBindInfo> anycastEipBindInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAnycastId() {
		return this.anycastId;
	}

	public void setAnycastId(String anycastId) {
		this.anycastId = anycastId;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getServiceLocation() {
		return this.serviceLocation;
	}

	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
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

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public List<AnycastEipBindInfo> getAnycastEipBindInfoList() {
		return this.anycastEipBindInfoList;
	}

	public void setAnycastEipBindInfoList(List<AnycastEipBindInfo> anycastEipBindInfoList) {
		this.anycastEipBindInfoList = anycastEipBindInfoList;
	}

	public static class AnycastEipBindInfo {

		private String bindInstanceId;

		private String bindInstanceType;

		private String bindTime;

		private String bindInstanceRegionId;

		public String getBindInstanceId() {
			return this.bindInstanceId;
		}

		public void setBindInstanceId(String bindInstanceId) {
			this.bindInstanceId = bindInstanceId;
		}

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
