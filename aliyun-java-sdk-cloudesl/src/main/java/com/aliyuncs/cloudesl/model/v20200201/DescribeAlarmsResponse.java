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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeAlarmsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmsResponse extends AcsResponse {

	private String errorMessage;

	private String errorCode;

	private Integer pageSize;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private String dynamicCode;

	private String code;

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private List<AlarmInfo> alarms;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

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

	public List<AlarmInfo> getAlarms() {
		return this.alarms;
	}

	public void setAlarms(List<AlarmInfo> alarms) {
		this.alarms = alarms;
	}

	public static class AlarmInfo {

		private String remark;

		private String storeId;

		private String deviceBarCode;

		private String dealUserId;

		private String deviceType;

		private String itemTitle;

		private String alarmTime;

		private String errorType;

		private String deviceMac;

		private String alarmId;

		private String retryGmtCreate;

		private String retryGmtModified;

		private String itemBarCode;

		private Long retryTimes;

		private String dealTime;

		private String alarmType;

		private String alarmStatus;

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getDeviceBarCode() {
			return this.deviceBarCode;
		}

		public void setDeviceBarCode(String deviceBarCode) {
			this.deviceBarCode = deviceBarCode;
		}

		public String getDealUserId() {
			return this.dealUserId;
		}

		public void setDealUserId(String dealUserId) {
			this.dealUserId = dealUserId;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getAlarmTime() {
			return this.alarmTime;
		}

		public void setAlarmTime(String alarmTime) {
			this.alarmTime = alarmTime;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public String getDeviceMac() {
			return this.deviceMac;
		}

		public void setDeviceMac(String deviceMac) {
			this.deviceMac = deviceMac;
		}

		public String getAlarmId() {
			return this.alarmId;
		}

		public void setAlarmId(String alarmId) {
			this.alarmId = alarmId;
		}

		public String getRetryGmtCreate() {
			return this.retryGmtCreate;
		}

		public void setRetryGmtCreate(String retryGmtCreate) {
			this.retryGmtCreate = retryGmtCreate;
		}

		public String getRetryGmtModified() {
			return this.retryGmtModified;
		}

		public void setRetryGmtModified(String retryGmtModified) {
			this.retryGmtModified = retryGmtModified;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public Long getRetryTimes() {
			return this.retryTimes;
		}

		public void setRetryTimes(Long retryTimes) {
			this.retryTimes = retryTimes;
		}

		public String getDealTime() {
			return this.dealTime;
		}

		public void setDealTime(String dealTime) {
			this.dealTime = dealTime;
		}

		public String getAlarmType() {
			return this.alarmType;
		}

		public void setAlarmType(String alarmType) {
			this.alarmType = alarmType;
		}

		public String getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(String alarmStatus) {
			this.alarmStatus = alarmStatus;
		}
	}

	@Override
	public DescribeAlarmsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlarmsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
