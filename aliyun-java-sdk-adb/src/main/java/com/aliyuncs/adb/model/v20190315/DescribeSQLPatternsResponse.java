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
import com.aliyuncs.adb.transform.v20190315.DescribeSQLPatternsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLPatternsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String requestId;

	private List<PatternDetailsItem> patternDetails;

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

	public List<PatternDetailsItem> getPatternDetails() {
		return this.patternDetails;
	}

	public void setPatternDetails(List<PatternDetailsItem> patternDetails) {
		this.patternDetails = patternDetails;
	}

	public static class PatternDetailsItem {

		private String sQLPattern;

		private String patternId;

		private String user;

		private String accessIp;

		private String tables;

		private String patternCreationTime;

		private Double averageQueryTime;

		private Long maxQueryTime;

		private Double averageExecutionTime;

		private Long maxExecutionTime;

		private Double averagePeakMemory;

		private Long maxPeakMemory;

		private Double averageScanSize;

		private Long maxScanSize;

		private Long queryCount;

		private Long failedCount;

		private Boolean blockable;

		public String getSQLPattern() {
			return this.sQLPattern;
		}

		public void setSQLPattern(String sQLPattern) {
			this.sQLPattern = sQLPattern;
		}

		public String getPatternId() {
			return this.patternId;
		}

		public void setPatternId(String patternId) {
			this.patternId = patternId;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getAccessIp() {
			return this.accessIp;
		}

		public void setAccessIp(String accessIp) {
			this.accessIp = accessIp;
		}

		public String getTables() {
			return this.tables;
		}

		public void setTables(String tables) {
			this.tables = tables;
		}

		public String getPatternCreationTime() {
			return this.patternCreationTime;
		}

		public void setPatternCreationTime(String patternCreationTime) {
			this.patternCreationTime = patternCreationTime;
		}

		public Double getAverageQueryTime() {
			return this.averageQueryTime;
		}

		public void setAverageQueryTime(Double averageQueryTime) {
			this.averageQueryTime = averageQueryTime;
		}

		public Long getMaxQueryTime() {
			return this.maxQueryTime;
		}

		public void setMaxQueryTime(Long maxQueryTime) {
			this.maxQueryTime = maxQueryTime;
		}

		public Double getAverageExecutionTime() {
			return this.averageExecutionTime;
		}

		public void setAverageExecutionTime(Double averageExecutionTime) {
			this.averageExecutionTime = averageExecutionTime;
		}

		public Long getMaxExecutionTime() {
			return this.maxExecutionTime;
		}

		public void setMaxExecutionTime(Long maxExecutionTime) {
			this.maxExecutionTime = maxExecutionTime;
		}

		public Double getAveragePeakMemory() {
			return this.averagePeakMemory;
		}

		public void setAveragePeakMemory(Double averagePeakMemory) {
			this.averagePeakMemory = averagePeakMemory;
		}

		public Long getMaxPeakMemory() {
			return this.maxPeakMemory;
		}

		public void setMaxPeakMemory(Long maxPeakMemory) {
			this.maxPeakMemory = maxPeakMemory;
		}

		public Double getAverageScanSize() {
			return this.averageScanSize;
		}

		public void setAverageScanSize(Double averageScanSize) {
			this.averageScanSize = averageScanSize;
		}

		public Long getMaxScanSize() {
			return this.maxScanSize;
		}

		public void setMaxScanSize(Long maxScanSize) {
			this.maxScanSize = maxScanSize;
		}

		public Long getQueryCount() {
			return this.queryCount;
		}

		public void setQueryCount(Long queryCount) {
			this.queryCount = queryCount;
		}

		public Long getFailedCount() {
			return this.failedCount;
		}

		public void setFailedCount(Long failedCount) {
			this.failedCount = failedCount;
		}

		public Boolean getBlockable() {
			return this.blockable;
		}

		public void setBlockable(Boolean blockable) {
			this.blockable = blockable;
		}
	}

	@Override
	public DescribeSQLPatternsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLPatternsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
