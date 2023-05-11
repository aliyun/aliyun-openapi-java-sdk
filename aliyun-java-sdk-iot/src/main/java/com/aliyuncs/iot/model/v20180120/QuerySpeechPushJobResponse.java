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
import com.aliyuncs.iot.transform.v20180120.QuerySpeechPushJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySpeechPushJobResponse extends AcsResponse {

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

		private Integer total;

		private Integer pageId;

		private Integer pageSize;

		private List<Items> list;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageId() {
			return this.pageId;
		}

		public void setPageId(Integer pageId) {
			this.pageId = pageId;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Items> getList() {
			return this.list;
		}

		public void setList(List<Items> list) {
			this.list = list;
		}

		public static class Items {

			private String code;

			private Long expiredTime;

			private String pushMode;

			private String iotId;

			private String status;

			private Long createdTime;

			private Integer totalDeviceNum;

			private Integer successDeviceNum;

			private Boolean speechStatus;

			private Integer failDeviceNum;

			private Integer speechNum;

			private Integer runningDeviceNum;

			private String groupId;

			private String groupName;

			private String productKey;

			private String deviceName;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public Long getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(Long expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getPushMode() {
				return this.pushMode;
			}

			public void setPushMode(String pushMode) {
				this.pushMode = pushMode;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(Long createdTime) {
				this.createdTime = createdTime;
			}

			public Integer getTotalDeviceNum() {
				return this.totalDeviceNum;
			}

			public void setTotalDeviceNum(Integer totalDeviceNum) {
				this.totalDeviceNum = totalDeviceNum;
			}

			public Integer getSuccessDeviceNum() {
				return this.successDeviceNum;
			}

			public void setSuccessDeviceNum(Integer successDeviceNum) {
				this.successDeviceNum = successDeviceNum;
			}

			public Boolean getSpeechStatus() {
				return this.speechStatus;
			}

			public void setSpeechStatus(Boolean speechStatus) {
				this.speechStatus = speechStatus;
			}

			public Integer getFailDeviceNum() {
				return this.failDeviceNum;
			}

			public void setFailDeviceNum(Integer failDeviceNum) {
				this.failDeviceNum = failDeviceNum;
			}

			public Integer getSpeechNum() {
				return this.speechNum;
			}

			public void setSpeechNum(Integer speechNum) {
				this.speechNum = speechNum;
			}

			public Integer getRunningDeviceNum() {
				return this.runningDeviceNum;
			}

			public void setRunningDeviceNum(Integer runningDeviceNum) {
				this.runningDeviceNum = runningDeviceNum;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
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
		}
	}

	@Override
	public QuerySpeechPushJobResponse getInstance(UnmarshallerContext context) {
		return	QuerySpeechPushJobResponseUnmarshaller.unmarshall(this, context);
	}
}
