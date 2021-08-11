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

package com.aliyuncs.datalake.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.ListQueryHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQueryHistoryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String sql;

		private Boolean jobCompleted;

		private Integer progress;

		private String startTime;

		private String endTime;

		private Long duration;

		private Integer rowCount;

		private String gmtCreate;

		private String gmtModified;

		private String id;

		private String resultTmpTable;

		private String owner;

		private String regionId;

		private String resultTmpDb;

		private String status;

		private Boolean success;

		private String errorMessage;

		private Long creator;

		private String creatorLoginName;

		private String rowCountOverLimit;

		private String resultOssPath;

		public String getSql() {
			return this.sql;
		}

		public void setSql(String sql) {
			this.sql = sql;
		}

		public Boolean getJobCompleted() {
			return this.jobCompleted;
		}

		public void setJobCompleted(Boolean jobCompleted) {
			this.jobCompleted = jobCompleted;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
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

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Integer getRowCount() {
			return this.rowCount;
		}

		public void setRowCount(Integer rowCount) {
			this.rowCount = rowCount;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getResultTmpTable() {
			return this.resultTmpTable;
		}

		public void setResultTmpTable(String resultTmpTable) {
			this.resultTmpTable = resultTmpTable;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResultTmpDb() {
			return this.resultTmpDb;
		}

		public void setResultTmpDb(String resultTmpDb) {
			this.resultTmpDb = resultTmpDb;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Long getCreator() {
			return this.creator;
		}

		public void setCreator(Long creator) {
			this.creator = creator;
		}

		public String getCreatorLoginName() {
			return this.creatorLoginName;
		}

		public void setCreatorLoginName(String creatorLoginName) {
			this.creatorLoginName = creatorLoginName;
		}

		public String getRowCountOverLimit() {
			return this.rowCountOverLimit;
		}

		public void setRowCountOverLimit(String rowCountOverLimit) {
			this.rowCountOverLimit = rowCountOverLimit;
		}

		public String getResultOssPath() {
			return this.resultOssPath;
		}

		public void setResultOssPath(String resultOssPath) {
			this.resultOssPath = resultOssPath;
		}
	}

	@Override
	public ListQueryHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListQueryHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
