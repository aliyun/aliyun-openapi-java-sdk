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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeAuditRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditRecordsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalRecordCount;

	private String instanceName;

	private String startTime;

	private String endTime;

	private List<SQL> items;

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

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
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

	public List<SQL> getItems() {
		return this.items;
	}

	public void setItems(List<SQL> items) {
		this.items = items;
	}

	public static class SQL {

		private Integer hostAddress;

		private String databaseName;

		private String iPAddress;

		private String sQLText;

		private String sQLType;

		private String totalExecutionTimes;

		private String executeTime;

		private String accountName;

		public Integer getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(Integer hostAddress) {
			this.hostAddress = hostAddress;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
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

		public String getTotalExecutionTimes() {
			return this.totalExecutionTimes;
		}

		public void setTotalExecutionTimes(String totalExecutionTimes) {
			this.totalExecutionTimes = totalExecutionTimes;
		}

		public String getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(String executeTime) {
			this.executeTime = executeTime;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
	}

	@Override
	public DescribeAuditRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
