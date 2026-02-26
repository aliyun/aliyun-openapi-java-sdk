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
import com.aliyuncs.rds.transform.v20140815.DescribeSQLLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogRecordsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private Long totalRecordCount;

	private List<SQLRecord> items;

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

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<SQLRecord> getItems() {
		return this.items;
	}

	public void setItems(List<SQLRecord> items) {
		this.items = items;
	}

	public static class SQLRecord {

		private String accountName;

		private String dBName;

		private String executeTime;

		private String hostAddress;

		private Long returnRowCounts;

		private String sQLText;

		private String threadID;

		private Long totalExecutionTimes;

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(String executeTime) {
			this.executeTime = executeTime;
		}

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public String getThreadID() {
			return this.threadID;
		}

		public void setThreadID(String threadID) {
			this.threadID = threadID;
		}

		public Long getTotalExecutionTimes() {
			return this.totalExecutionTimes;
		}

		public void setTotalExecutionTimes(Long totalExecutionTimes) {
			this.totalExecutionTimes = totalExecutionTimes;
		}
	}

	@Override
	public DescribeSQLLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
