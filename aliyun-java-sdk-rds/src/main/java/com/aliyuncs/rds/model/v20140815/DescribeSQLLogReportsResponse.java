/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeSQLLogReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogReportsResponse extends AcsResponse {

	private String requestId;

	private String totalRecordCount;

	private String pageNumber;

	private String pageRecordCount;

	private List<SQLReport> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(String totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(String pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<SQLReport> getItems() {
		return this.items;
	}

	public void setItems(List<SQLReport> items) {
		this.items = items;
	}

	public static class SQLReport {

		private String sQLText;

		private String totalExecutionCounts;

		private String returnTotalRowCounts;

		private String totalExecutionTimes;

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public String getTotalExecutionCounts() {
			return this.totalExecutionCounts;
		}

		public void setTotalExecutionCounts(String totalExecutionCounts) {
			this.totalExecutionCounts = totalExecutionCounts;
		}

		public String getReturnTotalRowCounts() {
			return this.returnTotalRowCounts;
		}

		public void setReturnTotalRowCounts(String returnTotalRowCounts) {
			this.returnTotalRowCounts = returnTotalRowCounts;
		}

		public String getTotalExecutionTimes() {
			return this.totalExecutionTimes;
		}

		public void setTotalExecutionTimes(String totalExecutionTimes) {
			this.totalExecutionTimes = totalExecutionTimes;
		}
	}

	@Override
	public DescribeSQLLogReportsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogReportsResponseUnmarshaller.unmarshall(this, context);
	}
}
