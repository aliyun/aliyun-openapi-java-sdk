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
import com.aliyuncs.cloudesl.transform.v20200201.DescribeStoreStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStoreStatisticsResponse extends AcsResponse {

	private String errorMessage;

	private String errorCode;

	private String message;

	private String dynamicCode;

	private String code;

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private List<StoreStatisticsInfo> storeStatisticsInfoList;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public List<StoreStatisticsInfo> getStoreStatisticsInfoList() {
		return this.storeStatisticsInfoList;
	}

	public void setStoreStatisticsInfoList(List<StoreStatisticsInfo> storeStatisticsInfoList) {
		this.storeStatisticsInfoList = storeStatisticsInfoList;
	}

	public static class StoreStatisticsInfo {

		private Integer sendFailEsl;

		private Integer displayFailEsl;

		private String storeName;

		private Integer activeApDevice;

		private Integer updateFailureEsl;

		private Integer updateEsl;

		private Integer offlineEslDevice;

		private String statisticsTime;

		private String storeId;

		private Integer bindEsl;

		private Integer abnormalEsl;

		private Integer lowBatteryEsl;

		private Integer bindItem;

		public Integer getSendFailEsl() {
			return this.sendFailEsl;
		}

		public void setSendFailEsl(Integer sendFailEsl) {
			this.sendFailEsl = sendFailEsl;
		}

		public Integer getDisplayFailEsl() {
			return this.displayFailEsl;
		}

		public void setDisplayFailEsl(Integer displayFailEsl) {
			this.displayFailEsl = displayFailEsl;
		}

		public String getStoreName() {
			return this.storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public Integer getActiveApDevice() {
			return this.activeApDevice;
		}

		public void setActiveApDevice(Integer activeApDevice) {
			this.activeApDevice = activeApDevice;
		}

		public Integer getUpdateFailureEsl() {
			return this.updateFailureEsl;
		}

		public void setUpdateFailureEsl(Integer updateFailureEsl) {
			this.updateFailureEsl = updateFailureEsl;
		}

		public Integer getUpdateEsl() {
			return this.updateEsl;
		}

		public void setUpdateEsl(Integer updateEsl) {
			this.updateEsl = updateEsl;
		}

		public Integer getOfflineEslDevice() {
			return this.offlineEslDevice;
		}

		public void setOfflineEslDevice(Integer offlineEslDevice) {
			this.offlineEslDevice = offlineEslDevice;
		}

		public String getStatisticsTime() {
			return this.statisticsTime;
		}

		public void setStatisticsTime(String statisticsTime) {
			this.statisticsTime = statisticsTime;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public Integer getBindEsl() {
			return this.bindEsl;
		}

		public void setBindEsl(Integer bindEsl) {
			this.bindEsl = bindEsl;
		}

		public Integer getAbnormalEsl() {
			return this.abnormalEsl;
		}

		public void setAbnormalEsl(Integer abnormalEsl) {
			this.abnormalEsl = abnormalEsl;
		}

		public Integer getLowBatteryEsl() {
			return this.lowBatteryEsl;
		}

		public void setLowBatteryEsl(Integer lowBatteryEsl) {
			this.lowBatteryEsl = lowBatteryEsl;
		}

		public Integer getBindItem() {
			return this.bindItem;
		}

		public void setBindItem(Integer bindItem) {
			this.bindItem = bindItem;
		}
	}

	@Override
	public DescribeStoreStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeStoreStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
