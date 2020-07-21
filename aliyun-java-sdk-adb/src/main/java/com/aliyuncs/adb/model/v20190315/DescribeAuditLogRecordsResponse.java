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
import com.aliyuncs.adb.transform.v20190315.DescribeAuditLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditLogRecordsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageNumber;

	private String pageSize;

	private String dBClusterId;

	private List<SlowLogRecord> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<SlowLogRecord> getItems() {
		return this.items;
	}

	public void setItems(List<SlowLogRecord> items) {
		this.items = items;
	}

	public static class SlowLogRecord {

		private String hostAddress;

		private String dBName;

		private String sQLText;

		private String sQLType;

		private String connId;

		private String executeTime;

		private String succeed;

		private String totalTime;

		private String processID;

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
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

		public String getSQLType() {
			return this.sQLType;
		}

		public void setSQLType(String sQLType) {
			this.sQLType = sQLType;
		}

		public String getConnId() {
			return this.connId;
		}

		public void setConnId(String connId) {
			this.connId = connId;
		}

		public String getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(String executeTime) {
			this.executeTime = executeTime;
		}

		public String getSucceed() {
			return this.succeed;
		}

		public void setSucceed(String succeed) {
			this.succeed = succeed;
		}

		public String getTotalTime() {
			return this.totalTime;
		}

		public void setTotalTime(String totalTime) {
			this.totalTime = totalTime;
		}

		public String getProcessID() {
			return this.processID;
		}

		public void setProcessID(String processID) {
			this.processID = processID;
		}
	}

	@Override
	public DescribeAuditLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
