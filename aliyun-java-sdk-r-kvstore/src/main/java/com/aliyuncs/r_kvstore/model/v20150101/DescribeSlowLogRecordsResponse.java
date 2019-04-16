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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeSlowLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogRecordsResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String startTime;

	private String engine;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer pageRecordCount;

	private List<LogRecords> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<LogRecords> getItems() {
		return this.items;
	}

	public void setItems(List<LogRecords> items) {
		this.items = items;
	}

	public static class LogRecords {

		private String nodeId;

		private String iPAddress;

		private String dBName;

		private String dataBaseName;

		private String command;

		private Long elapsedTime;

		private String executeTime;

		private String account;

		private String accountName;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getDataBaseName() {
			return this.dataBaseName;
		}

		public void setDataBaseName(String dataBaseName) {
			this.dataBaseName = dataBaseName;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}

		public Long getElapsedTime() {
			return this.elapsedTime;
		}

		public void setElapsedTime(Long elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public String getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(String executeTime) {
			this.executeTime = executeTime;
		}

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
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
