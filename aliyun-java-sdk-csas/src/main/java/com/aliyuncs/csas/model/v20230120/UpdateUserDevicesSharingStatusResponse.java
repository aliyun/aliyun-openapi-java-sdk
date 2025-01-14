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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.UpdateUserDevicesSharingStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserDevicesSharingStatusResponse extends AcsResponse {

	private String requestId;

	private List<Data> devices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Data> devices) {
		this.devices = devices;
	}

	public static class Data {

		private String deviceTag;

		private String deviceType;

		private String deviceModel;

		private String deviceVersion;

		private String hostname;

		private String username;

		private String saseUserId;

		private String department;

		private String innerIP;

		private String srcIP;

		private String memory;

		private String cPU;

		private String disk;

		private String mac;

		private String appVersion;

		private String deviceBelong;

		private Boolean sharingStatus;

		private String deviceStatus;

		private String appStatus;

		private String paStatus;

		private String iaStatus;

		private String dlpStatus;

		private String nacStatus;

		private String createTime;

		private String updateTime;

		private List<NetInterfaceInfoItem> netInterfaceInfo;

		public String getDeviceTag() {
			return this.deviceTag;
		}

		public void setDeviceTag(String deviceTag) {
			this.deviceTag = deviceTag;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getDeviceModel() {
			return this.deviceModel;
		}

		public void setDeviceModel(String deviceModel) {
			this.deviceModel = deviceModel;
		}

		public String getDeviceVersion() {
			return this.deviceVersion;
		}

		public void setDeviceVersion(String deviceVersion) {
			this.deviceVersion = deviceVersion;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getSaseUserId() {
			return this.saseUserId;
		}

		public void setSaseUserId(String saseUserId) {
			this.saseUserId = saseUserId;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getInnerIP() {
			return this.innerIP;
		}

		public void setInnerIP(String innerIP) {
			this.innerIP = innerIP;
		}

		public String getSrcIP() {
			return this.srcIP;
		}

		public void setSrcIP(String srcIP) {
			this.srcIP = srcIP;
		}

		public String getMemory() {
			return this.memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}

		public String getCPU() {
			return this.cPU;
		}

		public void setCPU(String cPU) {
			this.cPU = cPU;
		}

		public String getDisk() {
			return this.disk;
		}

		public void setDisk(String disk) {
			this.disk = disk;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getDeviceBelong() {
			return this.deviceBelong;
		}

		public void setDeviceBelong(String deviceBelong) {
			this.deviceBelong = deviceBelong;
		}

		public Boolean getSharingStatus() {
			return this.sharingStatus;
		}

		public void setSharingStatus(Boolean sharingStatus) {
			this.sharingStatus = sharingStatus;
		}

		public String getDeviceStatus() {
			return this.deviceStatus;
		}

		public void setDeviceStatus(String deviceStatus) {
			this.deviceStatus = deviceStatus;
		}

		public String getAppStatus() {
			return this.appStatus;
		}

		public void setAppStatus(String appStatus) {
			this.appStatus = appStatus;
		}

		public String getPaStatus() {
			return this.paStatus;
		}

		public void setPaStatus(String paStatus) {
			this.paStatus = paStatus;
		}

		public String getIaStatus() {
			return this.iaStatus;
		}

		public void setIaStatus(String iaStatus) {
			this.iaStatus = iaStatus;
		}

		public String getDlpStatus() {
			return this.dlpStatus;
		}

		public void setDlpStatus(String dlpStatus) {
			this.dlpStatus = dlpStatus;
		}

		public String getNacStatus() {
			return this.nacStatus;
		}

		public void setNacStatus(String nacStatus) {
			this.nacStatus = nacStatus;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<NetInterfaceInfoItem> getNetInterfaceInfo() {
			return this.netInterfaceInfo;
		}

		public void setNetInterfaceInfo(List<NetInterfaceInfoItem> netInterfaceInfo) {
			this.netInterfaceInfo = netInterfaceInfo;
		}

		public static class NetInterfaceInfoItem {

			private String name;

			private String mac;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getMac() {
				return this.mac;
			}

			public void setMac(String mac) {
				this.mac = mac;
			}
		}
	}

	@Override
	public UpdateUserDevicesSharingStatusResponse getInstance(UnmarshallerContext context) {
		return	UpdateUserDevicesSharingStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
