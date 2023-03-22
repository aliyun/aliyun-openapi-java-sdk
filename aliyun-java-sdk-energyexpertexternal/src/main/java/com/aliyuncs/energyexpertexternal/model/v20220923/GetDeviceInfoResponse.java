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

package com.aliyuncs.energyexpertexternal.model.v20220923;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.energyexpertexternal.transform.v20220923.GetDeviceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceInfoResponse extends AcsResponse {

	private String requestId;

	private Integer httpCode;

	private String code;

	private String errorMessage;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String deviceId;

		private String deviceName;

		private String firstTypeName;

		private String secondTypeName;

		private List<Record> recordList;

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

		public String getFirstTypeName() {
			return this.firstTypeName;
		}

		public void setFirstTypeName(String firstTypeName) {
			this.firstTypeName = firstTypeName;
		}

		public String getSecondTypeName() {
			return this.secondTypeName;
		}

		public void setSecondTypeName(String secondTypeName) {
			this.secondTypeName = secondTypeName;
		}

		public List<Record> getRecordList() {
			return this.recordList;
		}

		public void setRecordList(List<Record> recordList) {
			this.recordList = recordList;
		}

		public static class Record {

			private String statisticsDate;

			private String paramName;

			private String unit;

			private String identifier;

			private String type;

			private Double value;

			public String getStatisticsDate() {
				return this.statisticsDate;
			}

			public void setStatisticsDate(String statisticsDate) {
				this.statisticsDate = statisticsDate;
			}

			public String getParamName() {
				return this.paramName;
			}

			public void setParamName(String paramName) {
				this.paramName = paramName;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Double getValue() {
				return this.value;
			}

			public void setValue(Double value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetDeviceInfoResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
