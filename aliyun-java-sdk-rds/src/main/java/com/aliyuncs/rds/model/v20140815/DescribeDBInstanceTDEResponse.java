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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceTDEResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceTDEResponse extends AcsResponse {

	private String requestId;

	private String tDEMode;

	private String tDEStatus;

	private String encryptionKey;

	private List<Database> databases;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTDEMode() {
		return this.tDEMode;
	}

	public void setTDEMode(String tDEMode) {
		this.tDEMode = tDEMode;
	}

	public String getTDEStatus() {
		return this.tDEStatus;
	}

	public void setTDEStatus(String tDEStatus) {
		this.tDEStatus = tDEStatus;
	}

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public List<Database> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<Database> databases) {
		this.databases = databases;
	}

	public static class Database {

		private String dBName;

		private String tDEStatus;

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getTDEStatus() {
			return this.tDEStatus;
		}

		public void setTDEStatus(String tDEStatus) {
			this.tDEStatus = tDEStatus;
		}
	}

	@Override
	public DescribeDBInstanceTDEResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceTDEResponseUnmarshaller.unmarshall(this, context);
	}
}
