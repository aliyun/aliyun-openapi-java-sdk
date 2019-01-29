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

package com.aliyuncs.cloudesl.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20180801.DescribeAlarmsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AlarmInfo> alarms;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<AlarmInfo> getAlarms() {
		return this.alarms;
	}

	public void setAlarms(List<AlarmInfo> alarms) {
		this.alarms = alarms;
	}

	public static class AlarmInfo {

		private String alarmId;

		private String alarmType;

		private String deviceType;

		private String deviceBarCode;

		private String deviceMac;

		private String errorType;

		private String itemBarCode;

		private String itemTitle;

		private String companyId;

		private String storeId;

		private String alarmTime;

		private String alarmStatus;

		private Long dealUserId;

		private String dealTime;

		private String vendor;

		private String model;

		public String getAlarmId() {
			return this.alarmId;
		}

		public void setAlarmId(String alarmId) {
			this.alarmId = alarmId;
		}

		public String getAlarmType() {
			return this.alarmType;
		}

		public void setAlarmType(String alarmType) {
			this.alarmType = alarmType;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getDeviceBarCode() {
			return this.deviceBarCode;
		}

		public void setDeviceBarCode(String deviceBarCode) {
			this.deviceBarCode = deviceBarCode;
		}

		public String getDeviceMac() {
			return this.deviceMac;
		}

		public void setDeviceMac(String deviceMac) {
			this.deviceMac = deviceMac;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getCompanyId() {
			return this.companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getAlarmTime() {
			return this.alarmTime;
		}

		public void setAlarmTime(String alarmTime) {
			this.alarmTime = alarmTime;
		}

		public String getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(String alarmStatus) {
			this.alarmStatus = alarmStatus;
		}

		public Long getDealUserId() {
			return this.dealUserId;
		}

		public void setDealUserId(Long dealUserId) {
			this.dealUserId = dealUserId;
		}

		public String getDealTime() {
			return this.dealTime;
		}

		public void setDealTime(String dealTime) {
			this.dealTime = dealTime;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}
	}

	@Override
	public DescribeAlarmsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlarmsResponseUnmarshaller.unmarshall(this, context);
	}
}
