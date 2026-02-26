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
import com.aliyuncs.gpdb.transform.v20160503.DescribeWaitingSQLInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWaitingSQLInfoResponse extends AcsResponse {

	private String requestId;

	private String database;

	private List<Item> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String pID;

		private String user;

		private String sQLStmt;

		private String application;

		private String notGrantLocks;

		private String blockedByPID;

		private String blockedByUser;

		private String blockedBySQLStmt;

		private String blockedByApplication;

		private String grantLocks;

		public String getPID() {
			return this.pID;
		}

		public void setPID(String pID) {
			this.pID = pID;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getSQLStmt() {
			return this.sQLStmt;
		}

		public void setSQLStmt(String sQLStmt) {
			this.sQLStmt = sQLStmt;
		}

		public String getApplication() {
			return this.application;
		}

		public void setApplication(String application) {
			this.application = application;
		}

		public String getNotGrantLocks() {
			return this.notGrantLocks;
		}

		public void setNotGrantLocks(String notGrantLocks) {
			this.notGrantLocks = notGrantLocks;
		}

		public String getBlockedByPID() {
			return this.blockedByPID;
		}

		public void setBlockedByPID(String blockedByPID) {
			this.blockedByPID = blockedByPID;
		}

		public String getBlockedByUser() {
			return this.blockedByUser;
		}

		public void setBlockedByUser(String blockedByUser) {
			this.blockedByUser = blockedByUser;
		}

		public String getBlockedBySQLStmt() {
			return this.blockedBySQLStmt;
		}

		public void setBlockedBySQLStmt(String blockedBySQLStmt) {
			this.blockedBySQLStmt = blockedBySQLStmt;
		}

		public String getBlockedByApplication() {
			return this.blockedByApplication;
		}

		public void setBlockedByApplication(String blockedByApplication) {
			this.blockedByApplication = blockedByApplication;
		}

		public String getGrantLocks() {
			return this.grantLocks;
		}

		public void setGrantLocks(String grantLocks) {
			this.grantLocks = grantLocks;
		}
	}

	@Override
	public DescribeWaitingSQLInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeWaitingSQLInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
