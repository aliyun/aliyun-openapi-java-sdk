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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeDeviceModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceModelResponse extends AcsResponse {

	private String requestId;

	private DeviceModel deviceModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeviceModel getDeviceModel() {
		return this.deviceModel;
	}

	public void setDeviceModel(DeviceModel deviceModel) {
		this.deviceModel = deviceModel;
	}

	public static class DeviceModel {

		private Long deviceModelId;

		private String deviceType;

		private String hardwareType;

		private String deviceModel;

		private String deviceBrand;

		private Integer canCreateDeviceId;

		private Integer initUsageType;

		private String initUsageTypeDesc;

		private String description;

		private String projectId;

		private String securityChip;

		private String osPlatform;

		private String objectKey;

		private String deviceLogoUrl;

		private String deviceName;

		public Long getDeviceModelId() {
			return this.deviceModelId;
		}

		public void setDeviceModelId(Long deviceModelId) {
			this.deviceModelId = deviceModelId;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getHardwareType() {
			return this.hardwareType;
		}

		public void setHardwareType(String hardwareType) {
			this.hardwareType = hardwareType;
		}

		public String getDeviceModel() {
			return this.deviceModel;
		}

		public void setDeviceModel(String deviceModel) {
			this.deviceModel = deviceModel;
		}

		public String getDeviceBrand() {
			return this.deviceBrand;
		}

		public void setDeviceBrand(String deviceBrand) {
			this.deviceBrand = deviceBrand;
		}

		public Integer getCanCreateDeviceId() {
			return this.canCreateDeviceId;
		}

		public void setCanCreateDeviceId(Integer canCreateDeviceId) {
			this.canCreateDeviceId = canCreateDeviceId;
		}

		public Integer getInitUsageType() {
			return this.initUsageType;
		}

		public void setInitUsageType(Integer initUsageType) {
			this.initUsageType = initUsageType;
		}

		public String getInitUsageTypeDesc() {
			return this.initUsageTypeDesc;
		}

		public void setInitUsageTypeDesc(String initUsageTypeDesc) {
			this.initUsageTypeDesc = initUsageTypeDesc;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getSecurityChip() {
			return this.securityChip;
		}

		public void setSecurityChip(String securityChip) {
			this.securityChip = securityChip;
		}

		public String getOsPlatform() {
			return this.osPlatform;
		}

		public void setOsPlatform(String osPlatform) {
			this.osPlatform = osPlatform;
		}

		public String getObjectKey() {
			return this.objectKey;
		}

		public void setObjectKey(String objectKey) {
			this.objectKey = objectKey;
		}

		public String getDeviceLogoUrl() {
			return this.deviceLogoUrl;
		}

		public void setDeviceLogoUrl(String deviceLogoUrl) {
			this.deviceLogoUrl = deviceLogoUrl;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
	}

	@Override
	public DescribeDeviceModelResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceModelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
