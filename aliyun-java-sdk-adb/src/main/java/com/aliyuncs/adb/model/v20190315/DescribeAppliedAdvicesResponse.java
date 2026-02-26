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
import com.aliyuncs.adb.transform.v20190315.DescribeAppliedAdvicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppliedAdvicesResponse extends AcsResponse {

	private Long pageNumber;

	private Long pageSize;

	private String requestId;

	private Long totalCount;

	private List<ItemsItem> items;

	private List<String> schemaTableNames;

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public List<String> getSchemaTableNames() {
		return this.schemaTableNames;
	}

	public void setSchemaTableNames(List<String> schemaTableNames) {
		this.schemaTableNames = schemaTableNames;
	}

	public static class ItemsItem {

		private String adviceId;

		private String submitTime;

		private String submitStatus;

		private String sQL;

		private String rollbackSQL;

		private String jobStatus;

		private String benefit;

		private String buildSQL;

		private Long totalCount;

		private Long pageSize;

		private Long pageNumber;

		private String schemaName;

		private String tableName;

		public String getAdviceId() {
			return this.adviceId;
		}

		public void setAdviceId(String adviceId) {
			this.adviceId = adviceId;
		}

		public String getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(String submitTime) {
			this.submitTime = submitTime;
		}

		public String getSubmitStatus() {
			return this.submitStatus;
		}

		public void setSubmitStatus(String submitStatus) {
			this.submitStatus = submitStatus;
		}

		public String getSQL() {
			return this.sQL;
		}

		public void setSQL(String sQL) {
			this.sQL = sQL;
		}

		public String getRollbackSQL() {
			return this.rollbackSQL;
		}

		public void setRollbackSQL(String rollbackSQL) {
			this.rollbackSQL = rollbackSQL;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getBenefit() {
			return this.benefit;
		}

		public void setBenefit(String benefit) {
			this.benefit = benefit;
		}

		public String getBuildSQL() {
			return this.buildSQL;
		}

		public void setBuildSQL(String buildSQL) {
			this.buildSQL = buildSQL;
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

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}
	}

	@Override
	public DescribeAppliedAdvicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppliedAdvicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
