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
import com.aliyuncs.vcs.transform.v20200515.ListNVRDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNVRDeviceResponse extends AcsResponse {

	private String requestId;

	private String total;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String corpId;

		private String projectName;

		private String deviceSn;

		private String channel;

		private String datasourceType;

		private String streamStatus;

		private String registrationTime;

		private String accessQuota;

		private String deviceType;

		private String type;

		private String regionName;

		private String deviceCode;

		private String deviceStatus;

		private String comptureStatus;

		private String deviceName;

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getDeviceSn() {
			return this.deviceSn;
		}

		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}

		public String getDatasourceType() {
			return this.datasourceType;
		}

		public void setDatasourceType(String datasourceType) {
			this.datasourceType = datasourceType;
		}

		public String getStreamStatus() {
			return this.streamStatus;
		}

		public void setStreamStatus(String streamStatus) {
			this.streamStatus = streamStatus;
		}

		public String getRegistrationTime() {
			return this.registrationTime;
		}

		public void setRegistrationTime(String registrationTime) {
			this.registrationTime = registrationTime;
		}

		public String getAccessQuota() {
			return this.accessQuota;
		}

		public void setAccessQuota(String accessQuota) {
			this.accessQuota = accessQuota;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getDeviceCode() {
			return this.deviceCode;
		}

		public void setDeviceCode(String deviceCode) {
			this.deviceCode = deviceCode;
		}

		public String getDeviceStatus() {
			return this.deviceStatus;
		}

		public void setDeviceStatus(String deviceStatus) {
			this.deviceStatus = deviceStatus;
		}

		public String getComptureStatus() {
			return this.comptureStatus;
		}

		public void setComptureStatus(String comptureStatus) {
			this.comptureStatus = comptureStatus;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
	}

	@Override
	public ListNVRDeviceResponse getInstance(UnmarshallerContext context) {
		return	ListNVRDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
