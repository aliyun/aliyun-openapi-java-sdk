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

	private String dBInstanceId;

	private String endTime;

	private String engine;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private String startTime;

	private Integer totalRecordCount;

	private List<SQLSlowLog> items;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<SQLSlowLog> getItems() {
		return this.items;
	}

	public void setItems(List<SQLSlowLog> items) {
		this.items = items;
	}

	public static class SQLSlowLog {

		private Long avgExecutionTime;

		private Long avgIOWriteCounts;

		private Long avgLastRowsAffectedCounts;

		private Long avgLogicalReadCounts;

		private Long avgPhysicalReadCounts;

		private Long avgRowsAffectedCounts;

		private String createTime;

		private String dBName;

		private Long maxExecutionTime;

		private Long maxExecutionTimeMS;

		private Long maxIOWriteCounts;

		private Long maxLastRowsAffectedCounts;

		private Long maxLockTime;

		private Long maxLockTimeMS;

		private Long maxLogicalReadCounts;

		private Long maxPhysicalReadCounts;

		private Long maxRowsAffectedCounts;

		private Long minIOWriteCounts;

		private Long minLastRowsAffectedCounts;

		private Long minLogicalReadCounts;

		private Long minPhysicalReadCounts;

		private Long minRowsAffectedCounts;

		private Long mySQLTotalExecutionCounts;

		private Long mySQLTotalExecutionTimes;

		private Long parseMaxRowCount;

		private Long parseTotalRowCounts;

		private String reportTime;

		private Long returnMaxRowCount;

		private Long returnTotalRowCounts;

		private String sQLHASH;

		private String sQLIdStr;

		private Long sQLServerAvgCpuTime;

		private Long sQLServerAvgExecutionTime;

		private Long sQLServerMaxCpuTime;

		private Long sQLServerMinCpuTime;

		private Long sQLServerMinExecutionTime;

		private Long sQLServerTotalCpuTime;

		private Long sQLServerTotalExecutionCounts;

		private Long sQLServerTotalExecutionTimes;

		private String sQLText;

		private Long slowLogId;

		private Long totalIOWriteCounts;

		private Long totalLastRowsAffectedCounts;

		private Long totalLockTimes;

		private Long totalLogicalReadCounts;

		private Long totalPhysicalReadCounts;

		private Long totalRowsAffectedCounts;

		public Long getAvgExecutionTime() {
			return this.avgExecutionTime;
		}

		public void setAvgExecutionTime(Long avgExecutionTime) {
			this.avgExecutionTime = avgExecutionTime;
		}

		public Long getAvgIOWriteCounts() {
			return this.avgIOWriteCounts;
		}

		public void setAvgIOWriteCounts(Long avgIOWriteCounts) {
			this.avgIOWriteCounts = avgIOWriteCounts;
		}

		public Long getAvgLastRowsAffectedCounts() {
			return this.avgLastRowsAffectedCounts;
		}

		public void setAvgLastRowsAffectedCounts(Long avgLastRowsAffectedCounts) {
			this.avgLastRowsAffectedCounts = avgLastRowsAffectedCounts;
		}

		public Long getAvgLogicalReadCounts() {
			return this.avgLogicalReadCounts;
		}

		public void setAvgLogicalReadCounts(Long avgLogicalReadCounts) {
			this.avgLogicalReadCounts = avgLogicalReadCounts;
		}

		public Long getAvgPhysicalReadCounts() {
			return this.avgPhysicalReadCounts;
		}

		public void setAvgPhysicalReadCounts(Long avgPhysicalReadCounts) {
			this.avgPhysicalReadCounts = avgPhysicalReadCounts;
		}

		public Long getAvgRowsAffectedCounts() {
			return this.avgRowsAffectedCounts;
		}

		public void setAvgRowsAffectedCounts(Long avgRowsAffectedCounts) {
			this.avgRowsAffectedCounts = avgRowsAffectedCounts;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public Long getMaxExecutionTime() {
			return this.maxExecutionTime;
		}

		public void setMaxExecutionTime(Long maxExecutionTime) {
			this.maxExecutionTime = maxExecutionTime;
		}

		public Long getMaxExecutionTimeMS() {
			return this.maxExecutionTimeMS;
		}

		public void setMaxExecutionTimeMS(Long maxExecutionTimeMS) {
			this.maxExecutionTimeMS = maxExecutionTimeMS;
		}

		public Long getMaxIOWriteCounts() {
			return this.maxIOWriteCounts;
		}

		public void setMaxIOWriteCounts(Long maxIOWriteCounts) {
			this.maxIOWriteCounts = maxIOWriteCounts;
		}

		public Long getMaxLastRowsAffectedCounts() {
			return this.maxLastRowsAffectedCounts;
		}

		public void setMaxLastRowsAffectedCounts(Long maxLastRowsAffectedCounts) {
			this.maxLastRowsAffectedCounts = maxLastRowsAffectedCounts;
		}

		public Long getMaxLockTime() {
			return this.maxLockTime;
		}

		public void setMaxLockTime(Long maxLockTime) {
			this.maxLockTime = maxLockTime;
		}

		public Long getMaxLockTimeMS() {
			return this.maxLockTimeMS;
		}

		public void setMaxLockTimeMS(Long maxLockTimeMS) {
			this.maxLockTimeMS = maxLockTimeMS;
		}

		public Long getMaxLogicalReadCounts() {
			return this.maxLogicalReadCounts;
		}

		public void setMaxLogicalReadCounts(Long maxLogicalReadCounts) {
			this.maxLogicalReadCounts = maxLogicalReadCounts;
		}

		public Long getMaxPhysicalReadCounts() {
			return this.maxPhysicalReadCounts;
		}

		public void setMaxPhysicalReadCounts(Long maxPhysicalReadCounts) {
			this.maxPhysicalReadCounts = maxPhysicalReadCounts;
		}

		public Long getMaxRowsAffectedCounts() {
			return this.maxRowsAffectedCounts;
		}

		public void setMaxRowsAffectedCounts(Long maxRowsAffectedCounts) {
			this.maxRowsAffectedCounts = maxRowsAffectedCounts;
		}

		public Long getMinIOWriteCounts() {
			return this.minIOWriteCounts;
		}

		public void setMinIOWriteCounts(Long minIOWriteCounts) {
			this.minIOWriteCounts = minIOWriteCounts;
		}

		public Long getMinLastRowsAffectedCounts() {
			return this.minLastRowsAffectedCounts;
		}

		public void setMinLastRowsAffectedCounts(Long minLastRowsAffectedCounts) {
			this.minLastRowsAffectedCounts = minLastRowsAffectedCounts;
		}

		public Long getMinLogicalReadCounts() {
			return this.minLogicalReadCounts;
		}

		public void setMinLogicalReadCounts(Long minLogicalReadCounts) {
			this.minLogicalReadCounts = minLogicalReadCounts;
		}

		public Long getMinPhysicalReadCounts() {
			return this.minPhysicalReadCounts;
		}

		public void setMinPhysicalReadCounts(Long minPhysicalReadCounts) {
			this.minPhysicalReadCounts = minPhysicalReadCounts;
		}

		public Long getMinRowsAffectedCounts() {
			return this.minRowsAffectedCounts;
		}

		public void setMinRowsAffectedCounts(Long minRowsAffectedCounts) {
			this.minRowsAffectedCounts = minRowsAffectedCounts;
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

		public Long getParseMaxRowCount() {
			return this.parseMaxRowCount;
		}

		public void setParseMaxRowCount(Long parseMaxRowCount) {
			this.parseMaxRowCount = parseMaxRowCount;
		}

		public Long getParseTotalRowCounts() {
			return this.parseTotalRowCounts;
		}

		public void setParseTotalRowCounts(Long parseTotalRowCounts) {
			this.parseTotalRowCounts = parseTotalRowCounts;
		}

		public String getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(String reportTime) {
			this.reportTime = reportTime;
		}

		public Long getReturnMaxRowCount() {
			return this.returnMaxRowCount;
		}

		public void setReturnMaxRowCount(Long returnMaxRowCount) {
			this.returnMaxRowCount = returnMaxRowCount;
		}

		public Long getReturnTotalRowCounts() {
			return this.returnTotalRowCounts;
		}

		public void setReturnTotalRowCounts(Long returnTotalRowCounts) {
			this.returnTotalRowCounts = returnTotalRowCounts;
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

		public Long getSQLServerAvgCpuTime() {
			return this.sQLServerAvgCpuTime;
		}

		public void setSQLServerAvgCpuTime(Long sQLServerAvgCpuTime) {
			this.sQLServerAvgCpuTime = sQLServerAvgCpuTime;
		}

		public Long getSQLServerAvgExecutionTime() {
			return this.sQLServerAvgExecutionTime;
		}

		public void setSQLServerAvgExecutionTime(Long sQLServerAvgExecutionTime) {
			this.sQLServerAvgExecutionTime = sQLServerAvgExecutionTime;
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

		public Long getSQLServerMinExecutionTime() {
			return this.sQLServerMinExecutionTime;
		}

		public void setSQLServerMinExecutionTime(Long sQLServerMinExecutionTime) {
			this.sQLServerMinExecutionTime = sQLServerMinExecutionTime;
		}

		public Long getSQLServerTotalCpuTime() {
			return this.sQLServerTotalCpuTime;
		}

		public void setSQLServerTotalCpuTime(Long sQLServerTotalCpuTime) {
			this.sQLServerTotalCpuTime = sQLServerTotalCpuTime;
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

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Long getSlowLogId() {
			return this.slowLogId;
		}

		public void setSlowLogId(Long slowLogId) {
			this.slowLogId = slowLogId;
		}

		public Long getTotalIOWriteCounts() {
			return this.totalIOWriteCounts;
		}

		public void setTotalIOWriteCounts(Long totalIOWriteCounts) {
			this.totalIOWriteCounts = totalIOWriteCounts;
		}

		public Long getTotalLastRowsAffectedCounts() {
			return this.totalLastRowsAffectedCounts;
		}

		public void setTotalLastRowsAffectedCounts(Long totalLastRowsAffectedCounts) {
			this.totalLastRowsAffectedCounts = totalLastRowsAffectedCounts;
		}

		public Long getTotalLockTimes() {
			return this.totalLockTimes;
		}

		public void setTotalLockTimes(Long totalLockTimes) {
			this.totalLockTimes = totalLockTimes;
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

		public Long getTotalRowsAffectedCounts() {
			return this.totalRowsAffectedCounts;
		}

		public void setTotalRowsAffectedCounts(Long totalRowsAffectedCounts) {
			this.totalRowsAffectedCounts = totalRowsAffectedCounts;
		}
	}

	@Override
	public DescribeSlowLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
