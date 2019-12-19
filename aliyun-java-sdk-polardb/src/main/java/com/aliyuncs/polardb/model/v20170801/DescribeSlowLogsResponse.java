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

	private String dBClusterId;

	private String startTime;

	private String endTime;

	private String engine;

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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
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

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
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

		private String dBNodeId;

		private Long parseMaxRowCount;

		private Long totalLockTimes;

		private String dBName;

		private Long maxExecutionTime;

		private String sQLHASH;

		private String sQLText;

		private String createTime;

		private Long totalExecutionTimes;

		private Long returnTotalRowCounts;

		private Long totalExecutionCounts;

		private Long maxLockTime;

		private Long returnMaxRowCount;

		private Long parseTotalRowCounts;

		public String getDBNodeId() {
			return this.dBNodeId;
		}

		public void setDBNodeId(String dBNodeId) {
			this.dBNodeId = dBNodeId;
		}

		public Long getParseMaxRowCount() {
			return this.parseMaxRowCount;
		}

		public void setParseMaxRowCount(Long parseMaxRowCount) {
			this.parseMaxRowCount = parseMaxRowCount;
		}

		public Long getTotalLockTimes() {
			return this.totalLockTimes;
		}

		public void setTotalLockTimes(Long totalLockTimes) {
			this.totalLockTimes = totalLockTimes;
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

		public String getSQLHASH() {
			return this.sQLHASH;
		}

		public void setSQLHASH(String sQLHASH) {
			this.sQLHASH = sQLHASH;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getTotalExecutionTimes() {
			return this.totalExecutionTimes;
		}

		public void setTotalExecutionTimes(Long totalExecutionTimes) {
			this.totalExecutionTimes = totalExecutionTimes;
		}

		public Long getReturnTotalRowCounts() {
			return this.returnTotalRowCounts;
		}

		public void setReturnTotalRowCounts(Long returnTotalRowCounts) {
			this.returnTotalRowCounts = returnTotalRowCounts;
		}

		public Long getTotalExecutionCounts() {
			return this.totalExecutionCounts;
		}

		public void setTotalExecutionCounts(Long totalExecutionCounts) {
			this.totalExecutionCounts = totalExecutionCounts;
		}

		public Long getMaxLockTime() {
			return this.maxLockTime;
		}

		public void setMaxLockTime(Long maxLockTime) {
			this.maxLockTime = maxLockTime;
		}

		public Long getReturnMaxRowCount() {
			return this.returnMaxRowCount;
		}

		public void setReturnMaxRowCount(Long returnMaxRowCount) {
			this.returnMaxRowCount = returnMaxRowCount;
		}

		public Long getParseTotalRowCounts() {
			return this.parseTotalRowCounts;
		}

		public void setParseTotalRowCounts(Long parseTotalRowCounts) {
			this.parseTotalRowCounts = parseTotalRowCounts;
		}
	}

	@Override
	public DescribeSlowLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
