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
import com.aliyuncs.iovcc.transform.v20180501.DescribeDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceResponse extends AcsResponse {

	private String requestId;

	private DeviceInfo deviceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public static class DeviceInfo {

		private String deviceId;

		private String deviceType;

		private Integer usageType;

		private String usageTypeDesc;

		private String deviceModel;

		private Long deviceModelId;

		private String deviceProduct;

		private Long deviceBrandId;

		private String deviceBrand;

		private String uuid;

		private String vin;

		private String serialNumber;

		private String macAddress;

		private String hardwareId;

		private String softwareId;

		private String region;

		private String name;

		private String attributes;

		private String projectId;

		private String osPlatform;

		private String status;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public Integer getUsageType() {
			return this.usageType;
		}

		public void setUsageType(Integer usageType) {
			this.usageType = usageType;
		}

		public String getUsageTypeDesc() {
			return this.usageTypeDesc;
		}

		public void setUsageTypeDesc(String usageTypeDesc) {
			this.usageTypeDesc = usageTypeDesc;
		}

		public String getDeviceModel() {
			return this.deviceModel;
		}

		public void setDeviceModel(String deviceModel) {
			this.deviceModel = deviceModel;
		}

		public Long getDeviceModelId() {
			return this.deviceModelId;
		}

		public void setDeviceModelId(Long deviceModelId) {
			this.deviceModelId = deviceModelId;
		}

		public String getDeviceProduct() {
			return this.deviceProduct;
		}

		public void setDeviceProduct(String deviceProduct) {
			this.deviceProduct = deviceProduct;
		}

		public Long getDeviceBrandId() {
			return this.deviceBrandId;
		}

		public void setDeviceBrandId(Long deviceBrandId) {
			this.deviceBrandId = deviceBrandId;
		}

		public String getDeviceBrand() {
			return this.deviceBrand;
		}

		public void setDeviceBrand(String deviceBrand) {
			this.deviceBrand = deviceBrand;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getVin() {
			return this.vin;
		}

		public void setVin(String vin) {
			this.vin = vin;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}

		public String getHardwareId() {
			return this.hardwareId;
		}

		public void setHardwareId(String hardwareId) {
			this.hardwareId = hardwareId;
		}

		public String getSoftwareId() {
			return this.softwareId;
		}

		public void setSoftwareId(String softwareId) {
			this.softwareId = softwareId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAttributes() {
			return this.attributes;
		}

		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getOsPlatform() {
			return this.osPlatform;
		}

		public void setOsPlatform(String osPlatform) {
			this.osPlatform = osPlatform;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeDeviceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
