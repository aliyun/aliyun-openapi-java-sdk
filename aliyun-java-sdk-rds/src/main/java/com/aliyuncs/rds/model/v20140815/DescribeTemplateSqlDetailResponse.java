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
import com.aliyuncs.rds.transform.v20140815.DescribeTemplateSqlDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTemplateSqlDetailResponse extends AcsResponse {

	private String requestId;

	private Integer dBInstanceID;

	private String dBInstanceName;

	private String startTime;

	private String endTime;

	private Integer totalRecords;

	private String pagingID;

	private Integer maxRecordsPerPage;

	private Integer pageNumbers;

	private Integer itemsNumbers;

	private List<TemplateSqlDetail> items;

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

	public Integer getTotalRecords() {
		return this.totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public String getPagingID() {
		return this.pagingID;
	}

	public void setPagingID(String pagingID) {
		this.pagingID = pagingID;
	}

	public Integer getMaxRecordsPerPage() {
		return this.maxRecordsPerPage;
	}

	public void setMaxRecordsPerPage(Integer maxRecordsPerPage) {
		this.maxRecordsPerPage = maxRecordsPerPage;
	}

	public Integer getPageNumbers() {
		return this.pageNumbers;
	}

	public void setPageNumbers(Integer pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public List<TemplateSqlDetail> getItems() {
		return this.items;
	}

	public void setItems(List<TemplateSqlDetail> items) {
		this.items = items;
	}

	public static class TemplateSqlDetail {

		private String dBName;

		private String accountName;

		private String hostAddress;

		private String sQLText;

		private Long consume;

		private Long scanRows;

		private Long updateRows;

		private Integer state;

		private String executeTime;

		private String threadID;

		private String sqlType;

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Long getConsume() {
			return this.consume;
		}

		public void setConsume(Long consume) {
			this.consume = consume;
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

		public Integer getState() {
			return this.state;
		}

		public void setState(Integer state) {
			this.state = state;
		}

		public String getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(String executeTime) {
			this.executeTime = executeTime;
		}

		public String getThreadID() {
			return this.threadID;
		}

		public void setThreadID(String threadID) {
			this.threadID = threadID;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}
	}

	@Override
	public DescribeTemplateSqlDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeTemplateSqlDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
