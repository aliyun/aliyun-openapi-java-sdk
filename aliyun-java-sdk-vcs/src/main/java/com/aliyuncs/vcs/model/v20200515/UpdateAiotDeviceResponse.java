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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.UpdateAiotDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateAiotDeviceResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private AiotDevice aiotDevice;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AiotDevice getAiotDevice() {
		return this.aiotDevice;
	}

	public void setAiotDevice(AiotDevice aiotDevice) {
		this.aiotDevice = aiotDevice;
	}

	public static class AiotDevice {

		private String deviceId;

		private Long port;

		private String placeCode;

		private Float latitude;

		private String ownerApsID;

		private String isOnline;

		private String name;

		private String monitorAreaDesc;

		private String manufacturer;

		private String monitorDirection;

		private String iPV6Addr;

		private String password;

		private String iPAddr;

		private String iPv4Netmask;

		private String corpId;

		private Float longitude;

		private String firmwareVersion;

		private String mAC;

		private String deviceType;

		private String orgCode;

		private String serialNumber;

		private String capDirection;

		private String userId;

		private String model;

		private String iPv4Gateway;

		private String place;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public String getPlaceCode() {
			return this.placeCode;
		}

		public void setPlaceCode(String placeCode) {
			this.placeCode = placeCode;
		}

		public Float getLatitude() {
			return this.latitude;
		}

		public void setLatitude(Float latitude) {
			this.latitude = latitude;
		}

		public String getOwnerApsID() {
			return this.ownerApsID;
		}

		public void setOwnerApsID(String ownerApsID) {
			this.ownerApsID = ownerApsID;
		}

		public String getIsOnline() {
			return this.isOnline;
		}

		public void setIsOnline(String isOnline) {
			this.isOnline = isOnline;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMonitorAreaDesc() {
			return this.monitorAreaDesc;
		}

		public void setMonitorAreaDesc(String monitorAreaDesc) {
			this.monitorAreaDesc = monitorAreaDesc;
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getMonitorDirection() {
			return this.monitorDirection;
		}

		public void setMonitorDirection(String monitorDirection) {
			this.monitorDirection = monitorDirection;
		}

		public String getIPV6Addr() {
			return this.iPV6Addr;
		}

		public void setIPV6Addr(String iPV6Addr) {
			this.iPV6Addr = iPV6Addr;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getIPAddr() {
			return this.iPAddr;
		}

		public void setIPAddr(String iPAddr) {
			this.iPAddr = iPAddr;
		}

		public String getIPv4Netmask() {
			return this.iPv4Netmask;
		}

		public void setIPv4Netmask(String iPv4Netmask) {
			this.iPv4Netmask = iPv4Netmask;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public Float getLongitude() {
			return this.longitude;
		}

		public void setLongitude(Float longitude) {
			this.longitude = longitude;
		}

		public String getFirmwareVersion() {
			return this.firmwareVersion;
		}

		public void setFirmwareVersion(String firmwareVersion) {
			this.firmwareVersion = firmwareVersion;
		}

		public String getMAC() {
			return this.mAC;
		}

		public void setMAC(String mAC) {
			this.mAC = mAC;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getOrgCode() {
			return this.orgCode;
		}

		public void setOrgCode(String orgCode) {
			this.orgCode = orgCode;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getCapDirection() {
			return this.capDirection;
		}

		public void setCapDirection(String capDirection) {
			this.capDirection = capDirection;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getIPv4Gateway() {
			return this.iPv4Gateway;
		}

		public void setIPv4Gateway(String iPv4Gateway) {
			this.iPv4Gateway = iPv4Gateway;
		}

		public String getPlace() {
			return this.place;
		}

		public void setPlace(String place) {
			this.place = place;
		}
	}

	@Override
	public UpdateAiotDeviceResponse getInstance(UnmarshallerContext context) {
		return	UpdateAiotDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
