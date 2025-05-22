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
import com.aliyuncs.rds.transform.v20140815.DescribeSlowLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogRecordsResponse extends AcsResponse {

	private Long cPUTime;

	private String dBInstanceId;

	private String engine;

	private Long lastRowsAffectedCount;

	private Long logicalIORead;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Long physicalIORead;

	private String requestId;

	private Long rowsAffectedCount;

	private String sQLHash;

	private Integer totalRecordCount;

	private String userName;

	private Long writesIOCount;

	private List<SQLSlowRecord> items;

	public Long getCPUTime() {
		return this.cPUTime;
	}

	public void setCPUTime(Long cPUTime) {
		this.cPUTime = cPUTime;
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

	public Long getLastRowsAffectedCount() {
		return this.lastRowsAffectedCount;
	}

	public void setLastRowsAffectedCount(Long lastRowsAffectedCount) {
		this.lastRowsAffectedCount = lastRowsAffectedCount;
	}

	public Long getLogicalIORead() {
		return this.logicalIORead;
	}

	public void setLogicalIORead(Long logicalIORead) {
		this.logicalIORead = logicalIORead;
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

	public Long getPhysicalIORead() {
		return this.physicalIORead;
	}

	public void setPhysicalIORead(Long physicalIORead) {
		this.physicalIORead = physicalIORead;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getRowsAffectedCount() {
		return this.rowsAffectedCount;
	}

	public void setRowsAffectedCount(Long rowsAffectedCount) {
		this.rowsAffectedCount = rowsAffectedCount;
	}

	public String getSQLHash() {
		return this.sQLHash;
	}

	public void setSQLHash(String sQLHash) {
		this.sQLHash = sQLHash;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getWritesIOCount() {
		return this.writesIOCount;
	}

	public void setWritesIOCount(Long writesIOCount) {
		this.writesIOCount = writesIOCount;
	}

	public List<SQLSlowRecord> getItems() {
		return this.items;
	}

	public void setItems(List<SQLSlowRecord> items) {
		this.items = items;
	}

	public static class SQLSlowRecord {

		private String applicationName;

		private String clientHostName;

		private Long cpuTime;

		private String dBName;

		private String executionStartTime;

		private String hostAddress;

		private Long lastRowsAffectedCount;

		private Long lockTimes;

		private Long logicalIORead;

		private Long parseRowCounts;

		private Long physicalIORead;

		private Long queryTimeMS;

		private Long queryTimes;

		private Long returnRowCounts;

		private Long rowsAffectedCount;

		private String sQLHash;

		private String sQLText;

		private String userName;

		private Long writeIOCount;

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getClientHostName() {
			return this.clientHostName;
		}

		public void setClientHostName(String clientHostName) {
			this.clientHostName = clientHostName;
		}

		public Long getCpuTime() {
			return this.cpuTime;
		}

		public void setCpuTime(Long cpuTime) {
			this.cpuTime = cpuTime;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getExecutionStartTime() {
			return this.executionStartTime;
		}

		public void setExecutionStartTime(String executionStartTime) {
			this.executionStartTime = executionStartTime;
		}

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
		}

		public Long getLastRowsAffectedCount() {
			return this.lastRowsAffectedCount;
		}

		public void setLastRowsAffectedCount(Long lastRowsAffectedCount) {
			this.lastRowsAffectedCount = lastRowsAffectedCount;
		}

		public Long getLockTimes() {
			return this.lockTimes;
		}

		public void setLockTimes(Long lockTimes) {
			this.lockTimes = lockTimes;
		}

		public Long getLogicalIORead() {
			return this.logicalIORead;
		}

		public void setLogicalIORead(Long logicalIORead) {
			this.logicalIORead = logicalIORead;
		}

		public Long getParseRowCounts() {
			return this.parseRowCounts;
		}

		public void setParseRowCounts(Long parseRowCounts) {
			this.parseRowCounts = parseRowCounts;
		}

		public Long getPhysicalIORead() {
			return this.physicalIORead;
		}

		public void setPhysicalIORead(Long physicalIORead) {
			this.physicalIORead = physicalIORead;
		}

		public Long getQueryTimeMS() {
			return this.queryTimeMS;
		}

		public void setQueryTimeMS(Long queryTimeMS) {
			this.queryTimeMS = queryTimeMS;
		}

		public Long getQueryTimes() {
			return this.queryTimes;
		}

		public void setQueryTimes(Long queryTimes) {
			this.queryTimes = queryTimes;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public Long getRowsAffectedCount() {
			return this.rowsAffectedCount;
		}

		public void setRowsAffectedCount(Long rowsAffectedCount) {
			this.rowsAffectedCount = rowsAffectedCount;
		}

		public String getSQLHash() {
			return this.sQLHash;
		}

		public void setSQLHash(String sQLHash) {
			this.sQLHash = sQLHash;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getWriteIOCount() {
			return this.writeIOCount;
		}

		public void setWriteIOCount(Long writeIOCount) {
			this.writeIOCount = writeIOCount;
		}
	}

	@Override
	public DescribeSlowLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
