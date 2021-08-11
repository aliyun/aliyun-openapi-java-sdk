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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.GetQueryResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQueryResultResponse extends AcsResponse {

	private Long owner;

	private String id;

	private String regionId;

	private String gmtModified;

	private String gmtCreate;

	private String sql;

	private Boolean jobCompleted;

	private Integer progress;

	private Long duration;

	private String logs;

	private String schema;

	private String rows;

	private Integer rowCount;

	private String resultTmpTable;

	private String resultTmpDb;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String startTime;

	private String endTime;

	private String status;

	private Boolean rowCountOverLimit;

	public Long getOwner() {
		return this.owner;
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

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

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getLogs() {
		return this.logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}

	public String getSchema() {
		return this.schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getRows() {
		return this.rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public Integer getRowCount() {
		return this.rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public String getResultTmpTable() {
		return this.resultTmpTable;
	}

	public void setResultTmpTable(String resultTmpTable) {
		this.resultTmpTable = resultTmpTable;
	}

	public String getResultTmpDb() {
		return this.resultTmpDb;
	}

	public void setResultTmpDb(String resultTmpDb) {
		this.resultTmpDb = resultTmpDb;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getRowCountOverLimit() {
		return this.rowCountOverLimit;
	}

	public void setRowCountOverLimit(Boolean rowCountOverLimit) {
		this.rowCountOverLimit = rowCountOverLimit;
	}

	@Override
	public GetQueryResultResponse getInstance(UnmarshallerContext context) {
		return	GetQueryResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
