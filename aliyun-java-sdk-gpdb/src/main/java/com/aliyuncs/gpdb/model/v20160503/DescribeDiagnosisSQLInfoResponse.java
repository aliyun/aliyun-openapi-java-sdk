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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDiagnosisSQLInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisSQLInfoResponse extends AcsResponse {

	private String requestId;

	private String queryID;

	private String sessionID;

	private Long startTime;

	private Integer duration;

	private String sQLStmt;

	private String user;

	private String database;

	private String status;

	private String queryPlan;

	private String textPlan;

	private String sortedMetrics;

	private String maxOutputRows;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getQueryID() {
		return this.queryID;
	}

	public void setQueryID(String queryID) {
		this.queryID = queryID;
	}

	public String getSessionID() {
		return this.sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getSQLStmt() {
		return this.sQLStmt;
	}

	public void setSQLStmt(String sQLStmt) {
		this.sQLStmt = sQLStmt;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQueryPlan() {
		return this.queryPlan;
	}

	public void setQueryPlan(String queryPlan) {
		this.queryPlan = queryPlan;
	}

	public String getTextPlan() {
		return this.textPlan;
	}

	public void setTextPlan(String textPlan) {
		this.textPlan = textPlan;
	}

	public String getSortedMetrics() {
		return this.sortedMetrics;
	}

	public void setSortedMetrics(String sortedMetrics) {
		this.sortedMetrics = sortedMetrics;
	}

	public String getMaxOutputRows() {
		return this.maxOutputRows;
	}

	public void setMaxOutputRows(String maxOutputRows) {
		this.maxOutputRows = maxOutputRows;
	}

	@Override
	public DescribeDiagnosisSQLInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosisSQLInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
