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
import com.aliyuncs.rds.transform.v20140815.DecribeSqlLogDumpStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DecribeSqlLogDumpStatusResponse extends AcsResponse {

	private String requestId;

	private Integer dBInstanceID;

	private String dBInstanceName;

	private String isEnableSqlLogDump;

	private List<SqlLogDumpStatus> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDBInstanceID() {
		return this.dBInstanceID;
	}

	public void setDBInstanceID(Integer dBInstanceID) {
		this.dBInstanceID = dBInstanceID;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public String getIsEnableSqlLogDump() {
		return this.isEnableSqlLogDump;
	}

	public void setIsEnableSqlLogDump(String isEnableSqlLogDump) {
		this.isEnableSqlLogDump = isEnableSqlLogDump;
	}

	public List<SqlLogDumpStatus> getItems() {
		return this.items;
	}

	public void setItems(List<SqlLogDumpStatus> items) {
		this.items = items;
	}

	public static class SqlLogDumpStatus {

		private String dumpStartTime;

		private String jobName;

		private String createTime;

		private String updateTime;

		private Long processRows;

		private Long totalRows;

		private String jobStatus;

		private String failMsg;

		private Integer status;

		private String errorCode;

		public String getDumpStartTime() {
			return this.dumpStartTime;
		}

		public void setDumpStartTime(String dumpStartTime) {
			this.dumpStartTime = dumpStartTime;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Long getProcessRows() {
			return this.processRows;
		}

		public void setProcessRows(Long processRows) {
			this.processRows = processRows;
		}

		public Long getTotalRows() {
			return this.totalRows;
		}

		public void setTotalRows(Long totalRows) {
			this.totalRows = totalRows;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getFailMsg() {
			return this.failMsg;
		}

		public void setFailMsg(String failMsg) {
			this.failMsg = failMsg;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
	}

	@Override
	public DecribeSqlLogDumpStatusResponse getInstance(UnmarshallerContext context) {
		return	DecribeSqlLogDumpStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
