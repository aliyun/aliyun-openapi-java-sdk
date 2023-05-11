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
import com.aliyuncs.iot.transform.v20180120.BatchImportVehicleDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchImportVehicleDeviceResponse extends AcsResponse {

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

		private Long applyId;

		private List<InvalidDetailListItem> invalidDetailList;

		private List<String> invalidManufacturerList;

		private List<String> invalidDeviceModelList;

		private List<String> invalidDeviceIdList;

		private List<String> repeatedDeviceIdList;

		private List<String> invalidDeviceNameList;

		private List<String> repeatedDeviceNameList;

		public Long getApplyId() {
			return this.applyId;
		}

		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}

		public List<InvalidDetailListItem> getInvalidDetailList() {
			return this.invalidDetailList;
		}

		public void setInvalidDetailList(List<InvalidDetailListItem> invalidDetailList) {
			this.invalidDetailList = invalidDetailList;
		}

		public List<String> getInvalidManufacturerList() {
			return this.invalidManufacturerList;
		}

		public void setInvalidManufacturerList(List<String> invalidManufacturerList) {
			this.invalidManufacturerList = invalidManufacturerList;
		}

		public List<String> getInvalidDeviceModelList() {
			return this.invalidDeviceModelList;
		}

		public void setInvalidDeviceModelList(List<String> invalidDeviceModelList) {
			this.invalidDeviceModelList = invalidDeviceModelList;
		}

		public List<String> getInvalidDeviceIdList() {
			return this.invalidDeviceIdList;
		}

		public void setInvalidDeviceIdList(List<String> invalidDeviceIdList) {
			this.invalidDeviceIdList = invalidDeviceIdList;
		}

		public List<String> getRepeatedDeviceIdList() {
			return this.repeatedDeviceIdList;
		}

		public void setRepeatedDeviceIdList(List<String> repeatedDeviceIdList) {
			this.repeatedDeviceIdList = repeatedDeviceIdList;
		}

		public List<String> getInvalidDeviceNameList() {
			return this.invalidDeviceNameList;
		}

		public void setInvalidDeviceNameList(List<String> invalidDeviceNameList) {
			this.invalidDeviceNameList = invalidDeviceNameList;
		}

		public List<String> getRepeatedDeviceNameList() {
			return this.repeatedDeviceNameList;
		}

		public void setRepeatedDeviceNameList(List<String> repeatedDeviceNameList) {
			this.repeatedDeviceNameList = repeatedDeviceNameList;
		}

		public static class InvalidDetailListItem {

			private String manufacturer;

			private String deviceModel;

			private String deviceId;

			private String deviceName;

			private String errorMsg;

			public String getManufacturer() {
				return this.manufacturer;
			}

			public void setManufacturer(String manufacturer) {
				this.manufacturer = manufacturer;
			}

			public String getDeviceModel() {
				return this.deviceModel;
			}

			public void setDeviceModel(String deviceModel) {
				this.deviceModel = deviceModel;
			}

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

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}
		}
	}

	@Override
	public BatchImportVehicleDeviceResponse getInstance(UnmarshallerContext context) {
		return	BatchImportVehicleDeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
