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
import com.aliyuncs.gpdb.transform.v20160503.DescribeActiveSQLRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveSQLRecordsResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private List<Query> queries;

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

	public List<Query> getQueries() {
		return this.queries;
	}

	public void setQueries(List<Query> queries) {
		this.queries = queries;
	}

	public static class Query {

		private String pID;

		private String sessionID;

		private String state;

		private String queryStart;

		private String queryDuration;

		private String query;

		private String user;

		private String database;

		private String clientAddr;

		private String sqlTruncated;

		private String sqlTruncatedThreshold;

		public String getPID() {
			return this.pID;
		}

		public void setPID(String pID) {
			this.pID = pID;
		}

		public String getSessionID() {
			return this.sessionID;
		}

		public void setSessionID(String sessionID) {
			this.sessionID = sessionID;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getQueryStart() {
			return this.queryStart;
		}

		public void setQueryStart(String queryStart) {
			this.queryStart = queryStart;
		}

		public String getQueryDuration() {
			return this.queryDuration;
		}

		public void setQueryDuration(String queryDuration) {
			this.queryDuration = queryDuration;
		}

		public String getQuery() {
			return this.query;
		}

		public void setQuery(String query) {
			this.query = query;
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

		public String getClientAddr() {
			return this.clientAddr;
		}

		public void setClientAddr(String clientAddr) {
			this.clientAddr = clientAddr;
		}

		public String getSqlTruncated() {
			return this.sqlTruncated;
		}

		public void setSqlTruncated(String sqlTruncated) {
			this.sqlTruncated = sqlTruncated;
		}

		public String getSqlTruncatedThreshold() {
			return this.sqlTruncatedThreshold;
		}

		public void setSqlTruncatedThreshold(String sqlTruncatedThreshold) {
			this.sqlTruncatedThreshold = sqlTruncatedThreshold;
		}
	}

	@Override
	public DescribeActiveSQLRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveSQLRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
