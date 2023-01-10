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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetFullRequestSampleByInstanceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFullRequestSampleByInstanceIdResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Long code;

	private Boolean success;

	private List<Item> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Item> getData() {
		return this.data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public static class Item {

		private Long timestamp;

		private String sqlId;

		private String sql;

		private String database;

		private Double rt;

		private String user;

		private Double lockWaitTime;

		private Double logicalRead;

		private Double physicalSyncRead;

		private Double physicalAsyncRead;

		private Long rowsExamined;

		private Long rowsReturned;

		private String originHost;

		private Long scanRows;

		private Long updateRows;

		private String sqlType;

		private Long scnt;

		private Long rows;

		private Long frows;

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getSqlId() {
			return this.sqlId;
		}

		public void setSqlId(String sqlId) {
			this.sqlId = sqlId;
		}

		public String getSql() {
			return this.sql;
		}

		public void setSql(String sql) {
			this.sql = sql;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public Double getRt() {
			return this.rt;
		}

		public void setRt(Double rt) {
			this.rt = rt;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public Double getLockWaitTime() {
			return this.lockWaitTime;
		}

		public void setLockWaitTime(Double lockWaitTime) {
			this.lockWaitTime = lockWaitTime;
		}

		public Double getLogicalRead() {
			return this.logicalRead;
		}

		public void setLogicalRead(Double logicalRead) {
			this.logicalRead = logicalRead;
		}

		public Double getPhysicalSyncRead() {
			return this.physicalSyncRead;
		}

		public void setPhysicalSyncRead(Double physicalSyncRead) {
			this.physicalSyncRead = physicalSyncRead;
		}

		public Double getPhysicalAsyncRead() {
			return this.physicalAsyncRead;
		}

		public void setPhysicalAsyncRead(Double physicalAsyncRead) {
			this.physicalAsyncRead = physicalAsyncRead;
		}

		public Long getRowsExamined() {
			return this.rowsExamined;
		}

		public void setRowsExamined(Long rowsExamined) {
			this.rowsExamined = rowsExamined;
		}

		public Long getRowsReturned() {
			return this.rowsReturned;
		}

		public void setRowsReturned(Long rowsReturned) {
			this.rowsReturned = rowsReturned;
		}

		public String getOriginHost() {
			return this.originHost;
		}

		public void setOriginHost(String originHost) {
			this.originHost = originHost;
		}

		public Long getScanRows() {
			return this.scanRows;
		}

		public void setScanRows(Long scanRows) {
			this.scanRows = scanRows;
		}

		public Long getUpdateRows() {
			return this.updateRows;
		}

		public void setUpdateRows(Long updateRows) {
			this.updateRows = updateRows;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public Long getScnt() {
			return this.scnt;
		}

		public void setScnt(Long scnt) {
			this.scnt = scnt;
		}

		public Long getRows() {
			return this.rows;
		}

		public void setRows(Long rows) {
			this.rows = rows;
		}

		public Long getFrows() {
			return this.frows;
		}

		public void setFrows(Long frows) {
			this.frows = frows;
		}
	}

	@Override
	public GetFullRequestSampleByInstanceIdResponse getInstance(UnmarshallerContext context) {
		return	GetFullRequestSampleByInstanceIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
