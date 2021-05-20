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
import com.aliyuncs.vcs.transform.v20200515.ListDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevicesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageSize;

		private Integer totalPage;

		private Integer pageNumber;

		private List<Record> records;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private Integer status;

			private String accessProtocolType;

			private String sipServerIp;

			private String coverImageUrl;

			private String createTime;

			private String latitude;

			private String vendor;

			private String longitude;

			private String sipGBId;

			private String deviceDirection;

			private String sipPassword;

			private String deviceType;

			private String deviceAddress;

			private String gbId;

			private String bitRate;

			private String deviceSite;

			private String sipServerPort;

			private String resolution;

			private String deviceName;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getAccessProtocolType() {
				return this.accessProtocolType;
			}

			public void setAccessProtocolType(String accessProtocolType) {
				this.accessProtocolType = accessProtocolType;
			}

			public String getSipServerIp() {
				return this.sipServerIp;
			}

			public void setSipServerIp(String sipServerIp) {
				this.sipServerIp = sipServerIp;
			}

			public String getCoverImageUrl() {
				return this.coverImageUrl;
			}

			public void setCoverImageUrl(String coverImageUrl) {
				this.coverImageUrl = coverImageUrl;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getLatitude() {
				return this.latitude;
			}

			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			public String getVendor() {
				return this.vendor;
			}

			public void setVendor(String vendor) {
				this.vendor = vendor;
			}

			public String getLongitude() {
				return this.longitude;
			}

			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

			public String getSipGBId() {
				return this.sipGBId;
			}

			public void setSipGBId(String sipGBId) {
				this.sipGBId = sipGBId;
			}

			public String getDeviceDirection() {
				return this.deviceDirection;
			}

			public void setDeviceDirection(String deviceDirection) {
				this.deviceDirection = deviceDirection;
			}

			public String getSipPassword() {
				return this.sipPassword;
			}

			public void setSipPassword(String sipPassword) {
				this.sipPassword = sipPassword;
			}

			public String getDeviceType() {
				return this.deviceType;
			}

			public void setDeviceType(String deviceType) {
				this.deviceType = deviceType;
			}

			public String getDeviceAddress() {
				return this.deviceAddress;
			}

			public void setDeviceAddress(String deviceAddress) {
				this.deviceAddress = deviceAddress;
			}

			public String getGbId() {
				return this.gbId;
			}

			public void setGbId(String gbId) {
				this.gbId = gbId;
			}

			public String getBitRate() {
				return this.bitRate;
			}

			public void setBitRate(String bitRate) {
				this.bitRate = bitRate;
			}

			public String getDeviceSite() {
				return this.deviceSite;
			}

			public void setDeviceSite(String deviceSite) {
				this.deviceSite = deviceSite;
			}

			public String getSipServerPort() {
				return this.sipServerPort;
			}

			public void setSipServerPort(String sipServerPort) {
				this.sipServerPort = sipServerPort;
			}

			public String getResolution() {
				return this.resolution;
			}

			public void setResolution(String resolution) {
				this.resolution = resolution;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}
		}
	}

	@Override
	public ListDevicesResponse getInstance(UnmarshallerContext context) {
		return	ListDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
