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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeTemplatesListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTemplatesListResponse extends AcsResponse {

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

	private List<ItemsItem> items;

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

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String template;

		private Long totalConsume;

		private Float avgConsume;

		private Long totalCounts;

		private Float avgScanRows;

		private Long totalScanRows;

		private Long totalUpdateRows;

		private Float avgUpdateRows;

		private String sqlType;

		private String templateHash;

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public Long getTotalConsume() {
			return this.totalConsume;
		}

		public void setTotalConsume(Long totalConsume) {
			this.totalConsume = totalConsume;
		}

		public Float getAvgConsume() {
			return this.avgConsume;
		}

		public void setAvgConsume(Float avgConsume) {
			this.avgConsume = avgConsume;
		}

		public Long getTotalCounts() {
			return this.totalCounts;
		}

		public void setTotalCounts(Long totalCounts) {
			this.totalCounts = totalCounts;
		}

		public Float getAvgScanRows() {
			return this.avgScanRows;
		}

		public void setAvgScanRows(Float avgScanRows) {
			this.avgScanRows = avgScanRows;
		}

		public Long getTotalScanRows() {
			return this.totalScanRows;
		}

		public void setTotalScanRows(Long totalScanRows) {
			this.totalScanRows = totalScanRows;
		}

		public Long getTotalUpdateRows() {
			return this.totalUpdateRows;
		}

		public void setTotalUpdateRows(Long totalUpdateRows) {
			this.totalUpdateRows = totalUpdateRows;
		}

		public Float getAvgUpdateRows() {
			return this.avgUpdateRows;
		}

		public void setAvgUpdateRows(Float avgUpdateRows) {
			this.avgUpdateRows = avgUpdateRows;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public String getTemplateHash() {
			return this.templateHash;
		}

		public void setTemplateHash(String templateHash) {
			this.templateHash = templateHash;
		}
	}

	@Override
	public DescribeTemplatesListResponse getInstance(UnmarshallerContext context) {
		return	DescribeTemplatesListResponseUnmarshaller.unmarshall(this, context);
	}
}
