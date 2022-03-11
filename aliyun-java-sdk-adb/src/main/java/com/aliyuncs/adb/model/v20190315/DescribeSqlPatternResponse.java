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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeSqlPatternResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlPatternResponse extends AcsResponse {

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private String requestId;

	private List<ItemsItem> items;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String avgStageCount;

		private String maxCpuTime;

		private String accessIP;

		private String avgScanSize;

		private String maxScanSize;

		private String maxPeakMemory;

		private String avgCpuTime;

		private String user;

		private String avgPeakMemory;

		private String maxStageCount;

		private String maxTaskCount;

		private String instanceName;

		private String queryCount;

		private String reportDate;

		private String pattern;

		private String avgTaskCount;

		public String getAvgStageCount() {
			return this.avgStageCount;
		}

		public void setAvgStageCount(String avgStageCount) {
			this.avgStageCount = avgStageCount;
		}

		public String getMaxCpuTime() {
			return this.maxCpuTime;
		}

		public void setMaxCpuTime(String maxCpuTime) {
			this.maxCpuTime = maxCpuTime;
		}

		public String getAccessIP() {
			return this.accessIP;
		}

		public void setAccessIP(String accessIP) {
			this.accessIP = accessIP;
		}

		public String getAvgScanSize() {
			return this.avgScanSize;
		}

		public void setAvgScanSize(String avgScanSize) {
			this.avgScanSize = avgScanSize;
		}

		public String getMaxScanSize() {
			return this.maxScanSize;
		}

		public void setMaxScanSize(String maxScanSize) {
			this.maxScanSize = maxScanSize;
		}

		public String getMaxPeakMemory() {
			return this.maxPeakMemory;
		}

		public void setMaxPeakMemory(String maxPeakMemory) {
			this.maxPeakMemory = maxPeakMemory;
		}

		public String getAvgCpuTime() {
			return this.avgCpuTime;
		}

		public void setAvgCpuTime(String avgCpuTime) {
			this.avgCpuTime = avgCpuTime;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getAvgPeakMemory() {
			return this.avgPeakMemory;
		}

		public void setAvgPeakMemory(String avgPeakMemory) {
			this.avgPeakMemory = avgPeakMemory;
		}

		public String getMaxStageCount() {
			return this.maxStageCount;
		}

		public void setMaxStageCount(String maxStageCount) {
			this.maxStageCount = maxStageCount;
		}

		public String getMaxTaskCount() {
			return this.maxTaskCount;
		}

		public void setMaxTaskCount(String maxTaskCount) {
			this.maxTaskCount = maxTaskCount;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getQueryCount() {
			return this.queryCount;
		}

		public void setQueryCount(String queryCount) {
			this.queryCount = queryCount;
		}

		public String getReportDate() {
			return this.reportDate;
		}

		public void setReportDate(String reportDate) {
			this.reportDate = reportDate;
		}

		public String getPattern() {
			return this.pattern;
		}

		public void setPattern(String pattern) {
			this.pattern = pattern;
		}

		public String getAvgTaskCount() {
			return this.avgTaskCount;
		}

		public void setAvgTaskCount(String avgTaskCount) {
			this.avgTaskCount = avgTaskCount;
		}
	}

	@Override
	public DescribeSqlPatternResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlPatternResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
