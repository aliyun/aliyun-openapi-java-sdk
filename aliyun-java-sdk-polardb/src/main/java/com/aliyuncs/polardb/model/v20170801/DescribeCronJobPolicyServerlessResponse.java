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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeCronJobPolicyServerlessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCronJobPolicyServerlessResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DriverCronJobAttrbute> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
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

	public List<DriverCronJobAttrbute> getItems() {
		return this.items;
	}

	public void setItems(List<DriverCronJobAttrbute> items) {
		this.items = items;
	}

	public static class DriverCronJobAttrbute {

		private String jobId;

		private String dBClusterId;

		private String regionId;

		private String startTime;

		private String endTime;

		private String status;

		private String orderId;

		private String cronExpression;

		private String action;

		private String scaleMin;

		private String scaleMax;

		private String scaleRoNumMin;

		private String scaleRoNumMax;

		private String allowShutDown;

		private String secondsUntilAutoPause;

		private String scaleApRoNumMin;

		private String scaleApRoNumMax;

		private String serverlessRuleMode;

		private String serverlessRuleCpuEnlargeThreshold;

		private String serverlessRuleCpuShrinkThreshold;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getScaleMin() {
			return this.scaleMin;
		}

		public void setScaleMin(String scaleMin) {
			this.scaleMin = scaleMin;
		}

		public String getScaleMax() {
			return this.scaleMax;
		}

		public void setScaleMax(String scaleMax) {
			this.scaleMax = scaleMax;
		}

		public String getScaleRoNumMin() {
			return this.scaleRoNumMin;
		}

		public void setScaleRoNumMin(String scaleRoNumMin) {
			this.scaleRoNumMin = scaleRoNumMin;
		}

		public String getScaleRoNumMax() {
			return this.scaleRoNumMax;
		}

		public void setScaleRoNumMax(String scaleRoNumMax) {
			this.scaleRoNumMax = scaleRoNumMax;
		}

		public String getAllowShutDown() {
			return this.allowShutDown;
		}

		public void setAllowShutDown(String allowShutDown) {
			this.allowShutDown = allowShutDown;
		}

		public String getSecondsUntilAutoPause() {
			return this.secondsUntilAutoPause;
		}

		public void setSecondsUntilAutoPause(String secondsUntilAutoPause) {
			this.secondsUntilAutoPause = secondsUntilAutoPause;
		}

		public String getScaleApRoNumMin() {
			return this.scaleApRoNumMin;
		}

		public void setScaleApRoNumMin(String scaleApRoNumMin) {
			this.scaleApRoNumMin = scaleApRoNumMin;
		}

		public String getScaleApRoNumMax() {
			return this.scaleApRoNumMax;
		}

		public void setScaleApRoNumMax(String scaleApRoNumMax) {
			this.scaleApRoNumMax = scaleApRoNumMax;
		}

		public String getServerlessRuleMode() {
			return this.serverlessRuleMode;
		}

		public void setServerlessRuleMode(String serverlessRuleMode) {
			this.serverlessRuleMode = serverlessRuleMode;
		}

		public String getServerlessRuleCpuEnlargeThreshold() {
			return this.serverlessRuleCpuEnlargeThreshold;
		}

		public void setServerlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
			this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
		}

		public String getServerlessRuleCpuShrinkThreshold() {
			return this.serverlessRuleCpuShrinkThreshold;
		}

		public void setServerlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
			this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
		}
	}

	@Override
	public DescribeCronJobPolicyServerlessResponse getInstance(UnmarshallerContext context) {
		return	DescribeCronJobPolicyServerlessResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
