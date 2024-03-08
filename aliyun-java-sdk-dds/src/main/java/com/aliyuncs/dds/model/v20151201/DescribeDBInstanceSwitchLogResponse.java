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
import com.aliyuncs.dds.transform.v20151201.DescribeDBInstanceSwitchLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSwitchLogResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private Long totalCount;

	private Long pageSize;

	private Long pageNumber;

	private List<LogItemsItem> logItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<LogItemsItem> getLogItems() {
		return this.logItems;
	}

	public void setLogItems(List<LogItemsItem> logItems) {
		this.logItems = logItems;
	}

	public static class LogItemsItem {

		private String switchStatus;

		private String switchTime;

		private String switchCode;

		private String nodeId;

		public String getSwitchStatus() {
			return this.switchStatus;
		}

		public void setSwitchStatus(String switchStatus) {
			this.switchStatus = switchStatus;
		}

		public String getSwitchTime() {
			return this.switchTime;
		}

		public void setSwitchTime(String switchTime) {
			this.switchTime = switchTime;
		}

		public String getSwitchCode() {
			return this.switchCode;
		}

		public void setSwitchCode(String switchCode) {
			this.switchCode = switchCode;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}
	}

	@Override
	public DescribeDBInstanceSwitchLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSwitchLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
