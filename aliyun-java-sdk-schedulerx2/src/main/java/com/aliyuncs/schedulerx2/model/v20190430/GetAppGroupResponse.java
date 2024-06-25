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

package com.aliyuncs.schedulerx2.model.v20190430;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.GetAppGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppGroupResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private String appName;

		private String description;

		private Integer maxJobs;

		private String groupId;

		private String alarmJson;

		private String metricsThresholdJson;

		private String monitorConfigJson;

		private Integer maxConcurrency;

		private Integer curJobs;

		private Integer runningInstanceNum;

		private Integer readyInstanceNum;

		private Long appGroupId;

		private String appKey;

		private String xattrs;

		private String appVersion;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getMaxJobs() {
			return this.maxJobs;
		}

		public void setMaxJobs(Integer maxJobs) {
			this.maxJobs = maxJobs;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getAlarmJson() {
			return this.alarmJson;
		}

		public void setAlarmJson(String alarmJson) {
			this.alarmJson = alarmJson;
		}

		public String getMetricsThresholdJson() {
			return this.metricsThresholdJson;
		}

		public void setMetricsThresholdJson(String metricsThresholdJson) {
			this.metricsThresholdJson = metricsThresholdJson;
		}

		public String getMonitorConfigJson() {
			return this.monitorConfigJson;
		}

		public void setMonitorConfigJson(String monitorConfigJson) {
			this.monitorConfigJson = monitorConfigJson;
		}

		public Integer getMaxConcurrency() {
			return this.maxConcurrency;
		}

		public void setMaxConcurrency(Integer maxConcurrency) {
			this.maxConcurrency = maxConcurrency;
		}

		public Integer getCurJobs() {
			return this.curJobs;
		}

		public void setCurJobs(Integer curJobs) {
			this.curJobs = curJobs;
		}

		public Integer getRunningInstanceNum() {
			return this.runningInstanceNum;
		}

		public void setRunningInstanceNum(Integer runningInstanceNum) {
			this.runningInstanceNum = runningInstanceNum;
		}

		public Integer getReadyInstanceNum() {
			return this.readyInstanceNum;
		}

		public void setReadyInstanceNum(Integer readyInstanceNum) {
			this.readyInstanceNum = readyInstanceNum;
		}

		public Long getAppGroupId() {
			return this.appGroupId;
		}

		public void setAppGroupId(Long appGroupId) {
			this.appGroupId = appGroupId;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public String getXattrs() {
			return this.xattrs;
		}

		public void setXattrs(String xattrs) {
			this.xattrs = xattrs;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}
	}

	@Override
	public GetAppGroupResponse getInstance(UnmarshallerContext context) {
		return	GetAppGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
