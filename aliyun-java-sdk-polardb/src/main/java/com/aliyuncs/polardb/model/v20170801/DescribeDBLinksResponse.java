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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBLinksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBLinksResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceName;

	private List<DBLinkInfosItem> dBLinkInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public List<DBLinkInfosItem> getDBLinkInfos() {
		return this.dBLinkInfos;
	}

	public void setDBLinkInfos(List<DBLinkInfosItem> dBLinkInfos) {
		this.dBLinkInfos = dBLinkInfos;
	}

	public static class DBLinkInfosItem {

		private String targetDBInstanceName;

		private String dBInstanceName;

		private String targetDBName;

		private String targetAccount;

		private String dBLinkName;

		private String sourceDBName;

		public String getTargetDBInstanceName() {
			return this.targetDBInstanceName;
		}

		public void setTargetDBInstanceName(String targetDBInstanceName) {
			this.targetDBInstanceName = targetDBInstanceName;
		}

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public String getTargetDBName() {
			return this.targetDBName;
		}

		public void setTargetDBName(String targetDBName) {
			this.targetDBName = targetDBName;
		}

		public String getTargetAccount() {
			return this.targetAccount;
		}

		public void setTargetAccount(String targetAccount) {
			this.targetAccount = targetAccount;
		}

		public String getDBLinkName() {
			return this.dBLinkName;
		}

		public void setDBLinkName(String dBLinkName) {
			this.dBLinkName = dBLinkName;
		}

		public String getSourceDBName() {
			return this.sourceDBName;
		}

		public void setSourceDBName(String sourceDBName) {
			this.sourceDBName = sourceDBName;
		}
	}

	@Override
	public DescribeDBLinksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBLinksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
