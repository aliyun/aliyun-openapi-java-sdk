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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeDatabaseSlowLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseSlowLogRecordsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private Long physicalIORead;

	private String engine;

	private List<SlowLog> slowLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPhysicalIORead() {
		return this.physicalIORead;
	}

	public void setPhysicalIORead(Long physicalIORead) {
		this.physicalIORead = physicalIORead;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public List<SlowLog> getSlowLogs() {
		return this.slowLogs;
	}

	public void setSlowLogs(List<SlowLog> slowLogs) {
		this.slowLogs = slowLogs;
	}

	public static class SlowLog {

		private String hostAddress;

		private Long queryTimes;

		private String sQLText;

		private Long queryTimeMS;

		private Long lockTimes;

		private String executionStartTime;

		private Long returnRowCounts;

		private Long parseRowCounts;

		private String dBName;

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
		}

		public Long getQueryTimes() {
			return this.queryTimes;
		}

		public void setQueryTimes(Long queryTimes) {
			this.queryTimes = queryTimes;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Long getQueryTimeMS() {
			return this.queryTimeMS;
		}

		public void setQueryTimeMS(Long queryTimeMS) {
			this.queryTimeMS = queryTimeMS;
		}

		public Long getLockTimes() {
			return this.lockTimes;
		}

		public void setLockTimes(Long lockTimes) {
			this.lockTimes = lockTimes;
		}

		public String getExecutionStartTime() {
			return this.executionStartTime;
		}

		public void setExecutionStartTime(String executionStartTime) {
			this.executionStartTime = executionStartTime;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public Long getParseRowCounts() {
			return this.parseRowCounts;
		}

		public void setParseRowCounts(Long parseRowCounts) {
			this.parseRowCounts = parseRowCounts;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}
	}

	@Override
	public DescribeDatabaseSlowLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabaseSlowLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
