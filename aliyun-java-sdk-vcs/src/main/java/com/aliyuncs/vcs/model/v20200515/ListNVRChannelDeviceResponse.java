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
import com.aliyuncs.vcs.transform.v20200515.ListNVRChannelDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNVRChannelDeviceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String total;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String deviceCode;

		private String deviceName;

		private String deviceType;

		private String datasourceType;

		private String deviceStatus;

		private String streamStatus;

		private String comptureStatus;

		private String deviceSn;

		private String sampleName;

		private String regionName;

		private String corpId;

		private String vap;

		private String projectName;

		public String getDeviceCode() {
			return this.deviceCode;
		}

		public void setDeviceCode(String deviceCode) {
			this.deviceCode = deviceCode;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getDatasourceType() {
			return this.datasourceType;
		}

		public void setDatasourceType(String datasourceType) {
			this.datasourceType = datasourceType;
		}

		public String getDeviceStatus() {
			return this.deviceStatus;
		}

		public void setDeviceStatus(String deviceStatus) {
			this.deviceStatus = deviceStatus;
		}

		public String getStreamStatus() {
			return this.streamStatus;
		}

		public void setStreamStatus(String streamStatus) {
			this.streamStatus = streamStatus;
		}

		public String getComptureStatus() {
			return this.comptureStatus;
		}

		public void setComptureStatus(String comptureStatus) {
			this.comptureStatus = comptureStatus;
		}

		public String getDeviceSn() {
			return this.deviceSn;
		}

		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
		}

		public String getSampleName() {
			return this.sampleName;
		}

		public void setSampleName(String sampleName) {
			this.sampleName = sampleName;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getVap() {
			return this.vap;
		}

		public void setVap(String vap) {
			this.vap = vap;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
	}

	@Override
	public ListNVRChannelDeviceResponse getInstance(UnmarshallerContext context) {
		return	ListNVRChannelDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
