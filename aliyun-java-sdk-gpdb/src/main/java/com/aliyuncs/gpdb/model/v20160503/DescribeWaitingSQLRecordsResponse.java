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
import com.aliyuncs.gpdb.transform.v20160503.DescribeWaitingSQLRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWaitingSQLRecordsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageNumber;

	private List<Item> items;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String status;

		private String sQLStmt;

		private String user;

		private Long waitingTime;

		private Long startTime;

		private String database;

		private String pID;

		private String sessionID;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public Long getWaitingTime() {
			return this.waitingTime;
		}

		public void setWaitingTime(Long waitingTime) {
			this.waitingTime = waitingTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

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
	}

	@Override
	public DescribeWaitingSQLRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWaitingSQLRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
