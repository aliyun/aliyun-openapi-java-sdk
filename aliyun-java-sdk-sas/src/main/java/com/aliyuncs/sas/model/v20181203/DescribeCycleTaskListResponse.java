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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeCycleTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCycleTaskListResponse extends AcsResponse {

	private String requestId;

	private List<CycleScheduleResponse> cycleScheduleResponseList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CycleScheduleResponse> getCycleScheduleResponseList() {
		return this.cycleScheduleResponseList;
	}

	public void setCycleScheduleResponseList(List<CycleScheduleResponse> cycleScheduleResponseList) {
		this.cycleScheduleResponseList = cycleScheduleResponseList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class CycleScheduleResponse {

		private String lastTaskId;

		private String configId;

		private Integer targetEndTime;

		private Long nextStartTimeStr;

		private String taskName;

		private String taskType;

		private Integer intervalPeriod;

		private Long firstDateStr;

		private String param;

		private String periodUnit;

		private Integer targetStartTime;

		private Integer enable;

		public String getLastTaskId() {
			return this.lastTaskId;
		}

		public void setLastTaskId(String lastTaskId) {
			this.lastTaskId = lastTaskId;
		}

		public String getConfigId() {
			return this.configId;
		}

		public void setConfigId(String configId) {
			this.configId = configId;
		}

		public Integer getTargetEndTime() {
			return this.targetEndTime;
		}

		public void setTargetEndTime(Integer targetEndTime) {
			this.targetEndTime = targetEndTime;
		}

		public Long getNextStartTimeStr() {
			return this.nextStartTimeStr;
		}

		public void setNextStartTimeStr(Long nextStartTimeStr) {
			this.nextStartTimeStr = nextStartTimeStr;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public Integer getIntervalPeriod() {
			return this.intervalPeriod;
		}

		public void setIntervalPeriod(Integer intervalPeriod) {
			this.intervalPeriod = intervalPeriod;
		}

		public Long getFirstDateStr() {
			return this.firstDateStr;
		}

		public void setFirstDateStr(Long firstDateStr) {
			this.firstDateStr = firstDateStr;
		}

		public String getParam() {
			return this.param;
		}

		public void setParam(String param) {
			this.param = param;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public Integer getTargetStartTime() {
			return this.targetStartTime;
		}

		public void setTargetStartTime(Integer targetStartTime) {
			this.targetStartTime = targetStartTime;
		}

		public Integer getEnable() {
			return this.enable;
		}

		public void setEnable(Integer enable) {
			this.enable = enable;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeCycleTaskListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCycleTaskListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
