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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeDbListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDbListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private List<DB> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DB> getData() {
		return this.data;
	}

	public void setData(List<DB> data) {
		this.data = data;
	}

	public static class DB {

		private String dBName;

		private String dBDescription;

		private String dBInstanceName;

		private String characterSetName;

		private List<Account> accounts;

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getDBDescription() {
			return this.dBDescription;
		}

		public void setDBDescription(String dBDescription) {
			this.dBDescription = dBDescription;
		}

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public String getCharacterSetName() {
			return this.characterSetName;
		}

		public void setCharacterSetName(String characterSetName) {
			this.characterSetName = characterSetName;
		}

		public List<Account> getAccounts() {
			return this.accounts;
		}

		public void setAccounts(List<Account> accounts) {
			this.accounts = accounts;
		}

		public static class Account {

			private String accountName;

			private String accountPrivilege;

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getAccountPrivilege() {
				return this.accountPrivilege;
			}

			public void setAccountPrivilege(String accountPrivilege) {
				this.accountPrivilege = accountPrivilege;
			}
		}
	}

	@Override
	public DescribeDbListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDbListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
