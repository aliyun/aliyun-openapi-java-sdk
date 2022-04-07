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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeSlowLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogRecordsResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private String engine;

	private List<LogRecords> items;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public List<LogRecords> getItems() {
		return this.items;
	}

	public void setItems(List<LogRecords> items) {
		this.items = items;
	}

	public static class LogRecords {

		private String executionStartTime;

		private String hostAddress;

		private String queryTimes;

		private String tableName;

		private String sQLText;

		private Long returnRowCounts;

		private Long keysExamined;

		private String dBName;

		private Long docsExamined;

		private String accountName;

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

		public String getQueryTimes() {
			return this.queryTimes;
		}

		public void setQueryTimes(String queryTimes) {
			this.queryTimes = queryTimes;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public Long getKeysExamined() {
			return this.keysExamined;
		}

		public void setKeysExamined(Long keysExamined) {
			this.keysExamined = keysExamined;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public Long getDocsExamined() {
			return this.docsExamined;
		}

		public void setDocsExamined(Long docsExamined) {
			this.docsExamined = docsExamined;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
	}

	@Override
	public DescribeSlowLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
