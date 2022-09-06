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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QuerySpeechLicenseDeviceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySpeechLicenseDeviceListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer pageId;

		private Integer total;

		private List<Item> deviceList;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageId() {
			return this.pageId;
		}

		public void setPageId(Integer pageId) {
			this.pageId = pageId;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Item> getDeviceList() {
			return this.deviceList;
		}

		public void setDeviceList(List<Item> deviceList) {
			this.deviceList = deviceList;
		}

		public static class Item {

			private String productName;

			private String productKey;

			private String deviceName;

			private Long expiryTime;

			private String iotId;

			private String licenseStatus;

			private String deviceStatus;

			private Boolean inSpecifiedGroup;

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public Long getExpiryTime() {
				return this.expiryTime;
			}

			public void setExpiryTime(Long expiryTime) {
				this.expiryTime = expiryTime;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}

			public String getLicenseStatus() {
				return this.licenseStatus;
			}

			public void setLicenseStatus(String licenseStatus) {
				this.licenseStatus = licenseStatus;
			}

			public String getDeviceStatus() {
				return this.deviceStatus;
			}

			public void setDeviceStatus(String deviceStatus) {
				this.deviceStatus = deviceStatus;
			}

			public Boolean getInSpecifiedGroup() {
				return this.inSpecifiedGroup;
			}

			public void setInSpecifiedGroup(Boolean inSpecifiedGroup) {
				this.inSpecifiedGroup = inSpecifiedGroup;
			}
		}
	}

	@Override
	public QuerySpeechLicenseDeviceListResponse getInstance(UnmarshallerContext context) {
		return	QuerySpeechLicenseDeviceListResponseUnmarshaller.unmarshall(this, context);
	}
}
