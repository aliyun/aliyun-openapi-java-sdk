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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetCloudAssetDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCloudAssetDetailResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<InstancesItem> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<InstancesItem> getInstances() {
		return this.instances;
	}

	public void setInstances(List<InstancesItem> instances) {
		this.instances = instances;
	}

	public static class InstancesItem {

		private String regionId;

		private Integer vendor;

		private Integer assetType;

		private Integer assetSubType;

		private String instanceId;

		private String instanceName;

		private Long createdTime;

		private String internetIp;

		private String alarmStatus;

		private String riskStatus;

		private String assetTypeName;

		private String assetSubTypeName;

		private String securityInfo;

		private String detailLink;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getVendor() {
			return this.vendor;
		}

		public void setVendor(Integer vendor) {
			this.vendor = vendor;
		}

		public Integer getAssetType() {
			return this.assetType;
		}

		public void setAssetType(Integer assetType) {
			this.assetType = assetType;
		}

		public Integer getAssetSubType() {
			return this.assetSubType;
		}

		public void setAssetSubType(Integer assetSubType) {
			this.assetSubType = assetSubType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(String alarmStatus) {
			this.alarmStatus = alarmStatus;
		}

		public String getRiskStatus() {
			return this.riskStatus;
		}

		public void setRiskStatus(String riskStatus) {
			this.riskStatus = riskStatus;
		}

		public String getAssetTypeName() {
			return this.assetTypeName;
		}

		public void setAssetTypeName(String assetTypeName) {
			this.assetTypeName = assetTypeName;
		}

		public String getAssetSubTypeName() {
			return this.assetSubTypeName;
		}

		public void setAssetSubTypeName(String assetSubTypeName) {
			this.assetSubTypeName = assetSubTypeName;
		}

		public String getSecurityInfo() {
			return this.securityInfo;
		}

		public void setSecurityInfo(String securityInfo) {
			this.securityInfo = securityInfo;
		}

		public String getDetailLink() {
			return this.detailLink;
		}

		public void setDetailLink(String detailLink) {
			this.detailLink = detailLink;
		}
	}

	@Override
	public GetCloudAssetDetailResponse getInstance(UnmarshallerContext context) {
		return	GetCloudAssetDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
