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
import com.aliyuncs.vcs.transform.v20200515.ListDeviceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceGroupsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String totalCount;

		private List<ListItem> list;

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String deviceGroup;

			private String deviceName;

			private String deviceCode;

			private String bitRate;

			private String codingFormat;

			private String resolvingPower;

			private String dataSourceType;

			private String regionName;

			private String regionId;

			private String installAddress;

			private String deviceSn;

			private String deviceStatus;

			private String deviceStreamStatus;

			private String deviceComputeStatus;

			public String getDeviceGroup() {
				return this.deviceGroup;
			}

			public void setDeviceGroup(String deviceGroup) {
				this.deviceGroup = deviceGroup;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getDeviceCode() {
				return this.deviceCode;
			}

			public void setDeviceCode(String deviceCode) {
				this.deviceCode = deviceCode;
			}

			public String getBitRate() {
				return this.bitRate;
			}

			public void setBitRate(String bitRate) {
				this.bitRate = bitRate;
			}

			public String getCodingFormat() {
				return this.codingFormat;
			}

			public void setCodingFormat(String codingFormat) {
				this.codingFormat = codingFormat;
			}

			public String getResolvingPower() {
				return this.resolvingPower;
			}

			public void setResolvingPower(String resolvingPower) {
				this.resolvingPower = resolvingPower;
			}

			public String getDataSourceType() {
				return this.dataSourceType;
			}

			public void setDataSourceType(String dataSourceType) {
				this.dataSourceType = dataSourceType;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getInstallAddress() {
				return this.installAddress;
			}

			public void setInstallAddress(String installAddress) {
				this.installAddress = installAddress;
			}

			public String getDeviceSn() {
				return this.deviceSn;
			}

			public void setDeviceSn(String deviceSn) {
				this.deviceSn = deviceSn;
			}

			public String getDeviceStatus() {
				return this.deviceStatus;
			}

			public void setDeviceStatus(String deviceStatus) {
				this.deviceStatus = deviceStatus;
			}

			public String getDeviceStreamStatus() {
				return this.deviceStreamStatus;
			}

			public void setDeviceStreamStatus(String deviceStreamStatus) {
				this.deviceStreamStatus = deviceStreamStatus;
			}

			public String getDeviceComputeStatus() {
				return this.deviceComputeStatus;
			}

			public void setDeviceComputeStatus(String deviceComputeStatus) {
				this.deviceComputeStatus = deviceComputeStatus;
			}
		}
	}

	@Override
	public ListDeviceGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
