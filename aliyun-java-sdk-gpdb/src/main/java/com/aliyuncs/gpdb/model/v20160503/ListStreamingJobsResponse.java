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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListStreamingJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStreamingJobsResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<Items> jobItems;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

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

	public List<Items> getJobItems() {
		return this.jobItems;
	}

	public void setJobItems(List<Items> jobItems) {
		this.jobItems = jobItems;
	}

	public static class Items {

		private String status;

		private String account;

		private String modifyTime;

		private String destSchema;

		private String mode;

		private String createTime;

		private String consistency;

		private String jobName;

		private String jobDescription;

		private String destDatabase;

		private String dataSourceName;

		private String fallbackOffset;

		private String destTable;

		private String errorMessage;

		private String jobId;

		private String dataSourceId;

		private String writeMode;

		private String password;

		private List<String> updateColumns;

		private List<String> srcColumns;

		private List<String> destColumns;

		private List<String> matchColumns;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getDestSchema() {
			return this.destSchema;
		}

		public void setDestSchema(String destSchema) {
			this.destSchema = destSchema;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getConsistency() {
			return this.consistency;
		}

		public void setConsistency(String consistency) {
			this.consistency = consistency;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getJobDescription() {
			return this.jobDescription;
		}

		public void setJobDescription(String jobDescription) {
			this.jobDescription = jobDescription;
		}

		public String getDestDatabase() {
			return this.destDatabase;
		}

		public void setDestDatabase(String destDatabase) {
			this.destDatabase = destDatabase;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getFallbackOffset() {
			return this.fallbackOffset;
		}

		public void setFallbackOffset(String fallbackOffset) {
			this.fallbackOffset = fallbackOffset;
		}

		public String getDestTable() {
			return this.destTable;
		}

		public void setDestTable(String destTable) {
			this.destTable = destTable;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getWriteMode() {
			return this.writeMode;
		}

		public void setWriteMode(String writeMode) {
			this.writeMode = writeMode;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<String> getUpdateColumns() {
			return this.updateColumns;
		}

		public void setUpdateColumns(List<String> updateColumns) {
			this.updateColumns = updateColumns;
		}

		public List<String> getSrcColumns() {
			return this.srcColumns;
		}

		public void setSrcColumns(List<String> srcColumns) {
			this.srcColumns = srcColumns;
		}

		public List<String> getDestColumns() {
			return this.destColumns;
		}

		public void setDestColumns(List<String> destColumns) {
			this.destColumns = destColumns;
		}

		public List<String> getMatchColumns() {
			return this.matchColumns;
		}

		public void setMatchColumns(List<String> matchColumns) {
			this.matchColumns = matchColumns;
		}
	}

	@Override
	public ListStreamingJobsResponse getInstance(UnmarshallerContext context) {
		return	ListStreamingJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
