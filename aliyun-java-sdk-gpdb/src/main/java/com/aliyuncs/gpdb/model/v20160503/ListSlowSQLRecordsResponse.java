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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListSlowSQLRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSlowSQLRecordsResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<Item> items;

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

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String sqlTruncated;

		private String userName;

		private String optimizer;

		private String queryID;

		private String queryEndTime;

		private String sqlText;

		private Integer lockWaitTime;

		private Long cpuTimeMs;

		private Integer durationTime;

		private String dBName;

		private Integer queueWaitTime;

		private Long memBytes;

		private String queryStartTime;

		private Long spillBytes;

		private Integer sqlTruncatedThreshold;

		public String getSqlTruncated() {
			return this.sqlTruncated;
		}

		public void setSqlTruncated(String sqlTruncated) {
			this.sqlTruncated = sqlTruncated;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getOptimizer() {
			return this.optimizer;
		}

		public void setOptimizer(String optimizer) {
			this.optimizer = optimizer;
		}

		public String getQueryID() {
			return this.queryID;
		}

		public void setQueryID(String queryID) {
			this.queryID = queryID;
		}

		public String getQueryEndTime() {
			return this.queryEndTime;
		}

		public void setQueryEndTime(String queryEndTime) {
			this.queryEndTime = queryEndTime;
		}

		public String getSqlText() {
			return this.sqlText;
		}

		public void setSqlText(String sqlText) {
			this.sqlText = sqlText;
		}

		public Integer getLockWaitTime() {
			return this.lockWaitTime;
		}

		public void setLockWaitTime(Integer lockWaitTime) {
			this.lockWaitTime = lockWaitTime;
		}

		public Long getCpuTimeMs() {
			return this.cpuTimeMs;
		}

		public void setCpuTimeMs(Long cpuTimeMs) {
			this.cpuTimeMs = cpuTimeMs;
		}

		public Integer getDurationTime() {
			return this.durationTime;
		}

		public void setDurationTime(Integer durationTime) {
			this.durationTime = durationTime;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public Integer getQueueWaitTime() {
			return this.queueWaitTime;
		}

		public void setQueueWaitTime(Integer queueWaitTime) {
			this.queueWaitTime = queueWaitTime;
		}

		public Long getMemBytes() {
			return this.memBytes;
		}

		public void setMemBytes(Long memBytes) {
			this.memBytes = memBytes;
		}

		public String getQueryStartTime() {
			return this.queryStartTime;
		}

		public void setQueryStartTime(String queryStartTime) {
			this.queryStartTime = queryStartTime;
		}

		public Long getSpillBytes() {
			return this.spillBytes;
		}

		public void setSpillBytes(Long spillBytes) {
			this.spillBytes = spillBytes;
		}

		public Integer getSqlTruncatedThreshold() {
			return this.sqlTruncatedThreshold;
		}

		public void setSqlTruncatedThreshold(Integer sqlTruncatedThreshold) {
			this.sqlTruncatedThreshold = sqlTruncatedThreshold;
		}
	}

	@Override
	public ListSlowSQLRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListSlowSQLRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
