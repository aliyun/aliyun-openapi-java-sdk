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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetScanSubDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetScanSubDevicesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<SubDevice> subDeviceList;

		public List<SubDevice> getSubDeviceList() {
			return this.subDeviceList;
		}

		public void setSubDeviceList(List<SubDevice> subDeviceList) {
			this.subDeviceList = subDeviceList;
		}

		public static class SubDevice {

			private String subDeviceIp;

			private String subDevicePort;

			private String deviceModel;

			private String deviceSn;

			private String firmwareVersion;

			private String deviceMac;

			private String manufacturer;

			private String associatedNvr;

			public String getSubDeviceIp() {
				return this.subDeviceIp;
			}

			public void setSubDeviceIp(String subDeviceIp) {
				this.subDeviceIp = subDeviceIp;
			}

			public String getSubDevicePort() {
				return this.subDevicePort;
			}

			public void setSubDevicePort(String subDevicePort) {
				this.subDevicePort = subDevicePort;
			}

			public String getDeviceModel() {
				return this.deviceModel;
			}

			public void setDeviceModel(String deviceModel) {
				this.deviceModel = deviceModel;
			}

			public String getDeviceSn() {
				return this.deviceSn;
			}

			public void setDeviceSn(String deviceSn) {
				this.deviceSn = deviceSn;
			}

			public String getFirmwareVersion() {
				return this.firmwareVersion;
			}

			public void setFirmwareVersion(String firmwareVersion) {
				this.firmwareVersion = firmwareVersion;
			}

			public String getDeviceMac() {
				return this.deviceMac;
			}

			public void setDeviceMac(String deviceMac) {
				this.deviceMac = deviceMac;
			}

			public String getManufacturer() {
				return this.manufacturer;
			}

			public void setManufacturer(String manufacturer) {
				this.manufacturer = manufacturer;
			}

			public String getAssociatedNvr() {
				return this.associatedNvr;
			}

			public void setAssociatedNvr(String associatedNvr) {
				this.associatedNvr = associatedNvr;
			}
		}
	}

	@Override
	public GetScanSubDevicesResponse getInstance(UnmarshallerContext context) {
		return	GetScanSubDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
