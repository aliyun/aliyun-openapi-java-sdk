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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeSlowLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogsResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
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

		private String sQLHASH;

		private String sQLIdStr;

		private String dBName;

		private String sQLText;

		private Long mySQLTotalExecutionCounts;

		private Long mySQLTotalExecutionTimes;

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

		private Long maxExecutionTime;

		private Long avgExecutionTime;

		private Long totalPhysicalReadCounts1;

		private Long avgPhysicalReadCounts;

		private Long maxPhysicalReadCounts;

		private Long minPhysicalReadCounts;

		private Long avgLogicalReadCounts;

		private Long maxLogicalReadCounts;

		private Long minLogicalReadCounts;

		private Long totalIOWriteCounts;

		private Long avgIOWriteCounts;

		private Long maxIOWriteCounts;

		private Long minIOWriteCounts;

		private Long totalRowsAffectedCounts;

		private Long avgRowsAffectedCounts;

		private Long maxRowsAffectedCounts;

		private Long minRowsAffectedCounts;

		private Long totalLastRowsAffectedCounts;

		private Long avgLastRowsAffectedCounts;

		private Long maxLastRowsAffectedCounts;

		private Long minLastRowsAffectedCounts;

		private Long sQLServerMinExecutionTime;

		private Long sQLServerAvgExecutionTime;

		private Long sQLServerTotalCpuTime;

		private Long sQLServerAvgCpuTime;

		private Long sQLServerMaxCpuTime;

		private Long sQLServerMinCpuTime;

		public Long getSlowLogId() {
			return this.slowLogId;
		}

		public void setSlowLogId(Long slowLogId) {
			this.slowLogId = slowLogId;
		}

		public String getSQLHASH() {
			return this.sQLHASH;
		}

		public void setSQLHASH(String sQLHASH) {
			this.sQLHASH = sQLHASH;
		}

		public String getSQLIdStr() {
			return this.sQLIdStr;
		}

		public void setSQLIdStr(String sQLIdStr) {
			this.sQLIdStr = sQLIdStr;
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

		public Long getMaxExecutionTime() {
			return this.maxExecutionTime;
		}

		public void setMaxExecutionTime(Long maxExecutionTime) {
			this.maxExecutionTime = maxExecutionTime;
		}

		public Long getAvgExecutionTime() {
			return this.avgExecutionTime;
		}

		public void setAvgExecutionTime(Long avgExecutionTime) {
			this.avgExecutionTime = avgExecutionTime;
		}

		public Long getTotalPhysicalReadCounts1() {
			return this.totalPhysicalReadCounts1;
		}

		public void setTotalPhysicalReadCounts1(Long totalPhysicalReadCounts1) {
			this.totalPhysicalReadCounts1 = totalPhysicalReadCounts1;
		}

		public Long getAvgPhysicalReadCounts() {
			return this.avgPhysicalReadCounts;
		}

		public void setAvgPhysicalReadCounts(Long avgPhysicalReadCounts) {
			this.avgPhysicalReadCounts = avgPhysicalReadCounts;
		}

		public Long getMaxPhysicalReadCounts() {
			return this.maxPhysicalReadCounts;
		}

		public void setMaxPhysicalReadCounts(Long maxPhysicalReadCounts) {
			this.maxPhysicalReadCounts = maxPhysicalReadCounts;
		}

		public Long getMinPhysicalReadCounts() {
			return this.minPhysicalReadCounts;
		}

		public void setMinPhysicalReadCounts(Long minPhysicalReadCounts) {
			this.minPhysicalReadCounts = minPhysicalReadCounts;
		}

		public Long getAvgLogicalReadCounts() {
			return this.avgLogicalReadCounts;
		}

		public void setAvgLogicalReadCounts(Long avgLogicalReadCounts) {
			this.avgLogicalReadCounts = avgLogicalReadCounts;
		}

		public Long getMaxLogicalReadCounts() {
			return this.maxLogicalReadCounts;
		}

		public void setMaxLogicalReadCounts(Long maxLogicalReadCounts) {
			this.maxLogicalReadCounts = maxLogicalReadCounts;
		}

		public Long getMinLogicalReadCounts() {
			return this.minLogicalReadCounts;
		}

		public void setMinLogicalReadCounts(Long minLogicalReadCounts) {
			this.minLogicalReadCounts = minLogicalReadCounts;
		}

		public Long getTotalIOWriteCounts() {
			return this.totalIOWriteCounts;
		}

		public void setTotalIOWriteCounts(Long totalIOWriteCounts) {
			this.totalIOWriteCounts = totalIOWriteCounts;
		}

		public Long getAvgIOWriteCounts() {
			return this.avgIOWriteCounts;
		}

		public void setAvgIOWriteCounts(Long avgIOWriteCounts) {
			this.avgIOWriteCounts = avgIOWriteCounts;
		}

		public Long getMaxIOWriteCounts() {
			return this.maxIOWriteCounts;
		}

		public void setMaxIOWriteCounts(Long maxIOWriteCounts) {
			this.maxIOWriteCounts = maxIOWriteCounts;
		}

		public Long getMinIOWriteCounts() {
			return this.minIOWriteCounts;
		}

		public void setMinIOWriteCounts(Long minIOWriteCounts) {
			this.minIOWriteCounts = minIOWriteCounts;
		}

		public Long getTotalRowsAffectedCounts() {
			return this.totalRowsAffectedCounts;
		}

		public void setTotalRowsAffectedCounts(Long totalRowsAffectedCounts) {
			this.totalRowsAffectedCounts = totalRowsAffectedCounts;
		}

		public Long getAvgRowsAffectedCounts() {
			return this.avgRowsAffectedCounts;
		}

		public void setAvgRowsAffectedCounts(Long avgRowsAffectedCounts) {
			this.avgRowsAffectedCounts = avgRowsAffectedCounts;
		}

		public Long getMaxRowsAffectedCounts() {
			return this.maxRowsAffectedCounts;
		}

		public void setMaxRowsAffectedCounts(Long maxRowsAffectedCounts) {
			this.maxRowsAffectedCounts = maxRowsAffectedCounts;
		}

		public Long getMinRowsAffectedCounts() {
			return this.minRowsAffectedCounts;
		}

		public void setMinRowsAffectedCounts(Long minRowsAffectedCounts) {
			this.minRowsAffectedCounts = minRowsAffectedCounts;
		}

		public Long getTotalLastRowsAffectedCounts() {
			return this.totalLastRowsAffectedCounts;
		}

		public void setTotalLastRowsAffectedCounts(Long totalLastRowsAffectedCounts) {
			this.totalLastRowsAffectedCounts = totalLastRowsAffectedCounts;
		}

		public Long getAvgLastRowsAffectedCounts() {
			return this.avgLastRowsAffectedCounts;
		}

		public void setAvgLastRowsAffectedCounts(Long avgLastRowsAffectedCounts) {
			this.avgLastRowsAffectedCounts = avgLastRowsAffectedCounts;
		}

		public Long getMaxLastRowsAffectedCounts() {
			return this.maxLastRowsAffectedCounts;
		}

		public void setMaxLastRowsAffectedCounts(Long maxLastRowsAffectedCounts) {
			this.maxLastRowsAffectedCounts = maxLastRowsAffectedCounts;
		}

		public Long getMinLastRowsAffectedCounts() {
			return this.minLastRowsAffectedCounts;
		}

		public void setMinLastRowsAffectedCounts(Long minLastRowsAffectedCounts) {
			this.minLastRowsAffectedCounts = minLastRowsAffectedCounts;
		}

		public Long getSQLServerMinExecutionTime() {
			return this.sQLServerMinExecutionTime;
		}

		public void setSQLServerMinExecutionTime(Long sQLServerMinExecutionTime) {
			this.sQLServerMinExecutionTime = sQLServerMinExecutionTime;
		}

		public Long getSQLServerAvgExecutionTime() {
			return this.sQLServerAvgExecutionTime;
		}

		public void setSQLServerAvgExecutionTime(Long sQLServerAvgExecutionTime) {
			this.sQLServerAvgExecutionTime = sQLServerAvgExecutionTime;
		}

		public Long getSQLServerTotalCpuTime() {
			return this.sQLServerTotalCpuTime;
		}

		public void setSQLServerTotalCpuTime(Long sQLServerTotalCpuTime) {
			this.sQLServerTotalCpuTime = sQLServerTotalCpuTime;
		}

		public Long getSQLServerAvgCpuTime() {
			return this.sQLServerAvgCpuTime;
		}

		public void setSQLServerAvgCpuTime(Long sQLServerAvgCpuTime) {
			this.sQLServerAvgCpuTime = sQLServerAvgCpuTime;
		}

		public Long getSQLServerMaxCpuTime() {
			return this.sQLServerMaxCpuTime;
		}

		public void setSQLServerMaxCpuTime(Long sQLServerMaxCpuTime) {
			this.sQLServerMaxCpuTime = sQLServerMaxCpuTime;
		}

		public Long getSQLServerMinCpuTime() {
			return this.sQLServerMinCpuTime;
		}

		public void setSQLServerMinCpuTime(Long sQLServerMinCpuTime) {
			this.sQLServerMinCpuTime = sQLServerMinCpuTime;
		}
	}

	@Override
	public DescribeSlowLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
