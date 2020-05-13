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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListAssistDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAssistDevicesResponse extends AcsResponse {

	private String requestId;

	private Integer pageIndex;

	private Integer perPage;

	private Integer totalCount;

	private List<DevicesItem> devices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPerPage() {
		return this.perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DevicesItem> getDevices() {
		return this.devices;
	}

	public void setDevices(List<DevicesItem> devices) {
		this.devices = devices;
	}

	public static class DevicesItem {

		private String deviceId;

		private String deviceName;

		private String serialNumber;

		private String hardwareId;

		private String uUID;

		private String vIN;

		private Long accessTime;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getHardwareId() {
			return this.hardwareId;
		}

		public void setHardwareId(String hardwareId) {
			this.hardwareId = hardwareId;
		}

		public String getUUID() {
			return this.uUID;
		}

		public void setUUID(String uUID) {
			this.uUID = uUID;
		}

		public String getVIN() {
			return this.vIN;
		}

		public void setVIN(String vIN) {
			this.vIN = vIN;
		}

		public Long getAccessTime() {
			return this.accessTime;
		}

		public void setAccessTime(Long accessTime) {
			this.accessTime = accessTime;
		}
	}

	@Override
	public ListAssistDevicesResponse getInstance(UnmarshallerContext context) {
		return	ListAssistDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
