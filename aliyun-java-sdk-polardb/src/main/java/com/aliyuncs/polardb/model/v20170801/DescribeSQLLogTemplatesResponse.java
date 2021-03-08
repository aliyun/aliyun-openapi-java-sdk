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
import com.aliyuncs.polardb.transform.v20170801.DescribeSQLLogTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogTemplatesResponse extends AcsResponse {

	private Integer maxRecordsPerPage;

	private Integer itemsNumbers;

	private String requestId;

	private String endTime;

	private Integer dBInstanceID;

	private String startTime;

	private Integer totalRecords;

	private String finish;

	private Integer pageNumbers;

	private String jobId;

	private String pagingID;

	private String dBInstanceName;

	private List<Template> items;

	public Integer getMaxRecordsPerPage() {
		return this.maxRecordsPerPage;
	}

	public void setMaxRecordsPerPage(Integer maxRecordsPerPage) {
		this.maxRecordsPerPage = maxRecordsPerPage;
	}

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getDBInstanceID() {
		return this.dBInstanceID;
	}

	public void setDBInstanceID(Integer dBInstanceID) {
		this.dBInstanceID = dBInstanceID;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getTotalRecords() {
		return this.totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public String getFinish() {
		return this.finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public Integer getPageNumbers() {
		return this.pageNumbers;
	}

	public void setPageNumbers(Integer pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getPagingID() {
		return this.pagingID;
	}

	public void setPagingID(String pagingID) {
		this.pagingID = pagingID;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public List<Template> getItems() {
		return this.items;
	}

	public void setItems(List<Template> items) {
		this.items = items;
	}

	public static class Template {

		private Float avgScanRows;

		private String templateHash;

		private Float avgConsume;

		private Long totalScanRows;

		private Long totalUpdateRows;

		private Long totalCounts;

		private String sqlType;

		private Float avgUpdateRows;

		private Integer itemID;

		private String template;

		private Long totalConsume;

		public Float getAvgScanRows() {
			return this.avgScanRows;
		}

		public void setAvgScanRows(Float avgScanRows) {
			this.avgScanRows = avgScanRows;
		}

		public String getTemplateHash() {
			return this.templateHash;
		}

		public void setTemplateHash(String templateHash) {
			this.templateHash = templateHash;
		}

		public Float getAvgConsume() {
			return this.avgConsume;
		}

		public void setAvgConsume(Float avgConsume) {
			this.avgConsume = avgConsume;
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

		public Long getTotalCounts() {
			return this.totalCounts;
		}

		public void setTotalCounts(Long totalCounts) {
			this.totalCounts = totalCounts;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public Float getAvgUpdateRows() {
			return this.avgUpdateRows;
		}

		public void setAvgUpdateRows(Float avgUpdateRows) {
			this.avgUpdateRows = avgUpdateRows;
		}

		public Integer getItemID() {
			return this.itemID;
		}

		public void setItemID(Integer itemID) {
			this.itemID = itemID;
		}

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
	}

	@Override
	public DescribeSQLLogTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
