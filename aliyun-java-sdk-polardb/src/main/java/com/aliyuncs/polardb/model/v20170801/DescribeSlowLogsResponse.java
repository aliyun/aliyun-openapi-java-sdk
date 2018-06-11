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
import com.aliyuncs.polardb.transform.v20170801.DescribeSlowLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogsResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String startTime;

	private String endTime;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<SQLSlowLog> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
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

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<SQLSlowLog> getItems() {
		return this.items;
	}

	public void setItems(List<SQLSlowLog> items) {
		this.items = items;
	}

	public static class SQLSlowLog {

		private Long slowLogId;

		private Long sQLId;

		private String dBName;

		private String sQLText;

		private Long mySQLTotalExecutionCounts;

		private Long mySQLTotalExecutionTimes;

		private Long maxExecutionTime;

		private Long totalLockTimes;

		private Long maxLockTime;

		private Long parseTotalRowCounts;

		private Long parseMaxRowCount;

		private Long returnTotalRowCounts;

		private Long returnMaxRowCount;

		private String createTime;

		private Long sQLServerTotalExecutionCounts;

		private Long sQLServerTotalExecutionTimes;

		private Long totalLogicalReadCounts;

		private Long totalPhysicalReadCounts;

		private String reportTime;

		private Long avgExecutionTime;

		public Long getSlowLogId() {
			return this.slowLogId;
		}

		public void setSlowLogId(Long slowLogId) {
			this.slowLogId = slowLogId;
		}

		public Long getSQLId() {
			return this.sQLId;
		}

		public void setSQLId(Long sQLId) {
			this.sQLId = sQLId;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Long getMySQLTotalExecutionCounts() {
			return this.mySQLTotalExecutionCounts;
		}

		public void setMySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
			this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
		}

		public Long getMySQLTotalExecutionTimes() {
			return this.mySQLTotalExecutionTimes;
		}

		public void setMySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
			this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
		}

		public Long getMaxExecutionTime() {
			return this.maxExecutionTime;
		}

		public void setMaxExecutionTime(Long maxExecutionTime) {
			this.maxExecutionTime = maxExecutionTime;
		}

		public Long getTotalLockTimes() {
			return this.totalLockTimes;
		}

		public void setTotalLockTimes(Long totalLockTimes) {
			this.totalLockTimes = totalLockTimes;
		}

		public Long getMaxLockTime() {
			return this.maxLockTime;
		}

		public void setMaxLockTime(Long maxLockTime) {
			this.maxLockTime = maxLockTime;
		}

		public Long getParseTotalRowCounts() {
			return this.parseTotalRowCounts;
		}

		public void setParseTotalRowCounts(Long parseTotalRowCounts) {
			this.parseTotalRowCounts = parseTotalRowCounts;
		}

		public Long getParseMaxRowCount() {
			return this.parseMaxRowCount;
		}

		public void setParseMaxRowCount(Long parseMaxRowCount) {
			this.parseMaxRowCount = parseMaxRowCount;
		}

		public Long getReturnTotalRowCounts() {
			return this.returnTotalRowCounts;
		}

		public void setReturnTotalRowCounts(Long returnTotalRowCounts) {
			this.returnTotalRowCounts = returnTotalRowCounts;
		}

		public Long getReturnMaxRowCount() {
			return this.returnMaxRowCount;
		}

		public void setReturnMaxRowCount(Long returnMaxRowCount) {
			this.returnMaxRowCount = returnMaxRowCount;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getSQLServerTotalExecutionCounts() {
			return this.sQLServerTotalExecutionCounts;
		}

		public void setSQLServerTotalExecutionCounts(Long sQLServerTotalExecutionCounts) {
			this.sQLServerTotalExecutionCounts = sQLServerTotalExecutionCounts;
		}

		public Long getSQLServerTotalExecutionTimes() {
			return this.sQLServerTotalExecutionTimes;
		}

		public void setSQLServerTotalExecutionTimes(Long sQLServerTotalExecutionTimes) {
			this.sQLServerTotalExecutionTimes = sQLServerTotalExecutionTimes;
		}

		public Long getTotalLogicalReadCounts() {
			return this.totalLogicalReadCounts;
		}

		public void setTotalLogicalReadCounts(Long totalLogicalReadCounts) {
			this.totalLogicalReadCounts = totalLogicalReadCounts;
		}

		public Long getTotalPhysicalReadCounts() {
			return this.totalPhysicalReadCounts;
		}

		public void setTotalPhysicalReadCounts(Long totalPhysicalReadCounts) {
			this.totalPhysicalReadCounts = totalPhysicalReadCounts;
		}

		public String getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(String reportTime) {
			this.reportTime = reportTime;
		}

		public Long getAvgExecutionTime() {
			return this.avgExecutionTime;
		}

		public void setAvgExecutionTime(Long avgExecutionTime) {
			this.avgExecutionTime = avgExecutionTime;
		}
	}

	@Override
	public DescribeSlowLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
