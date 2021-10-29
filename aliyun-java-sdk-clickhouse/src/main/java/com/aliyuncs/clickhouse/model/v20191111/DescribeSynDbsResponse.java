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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeSynDbsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSynDbsResponse extends AcsResponse {

	private String requestId;

	private List<SynDb> synDbs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SynDb> getSynDbs() {
		return this.synDbs;
	}

	public void setSynDbs(List<SynDb> synDbs) {
		this.synDbs = synDbs;
	}

	public static class SynDb {

		private String rdsId;

		private String synDb;

		private Boolean synStatus;

		private String errorMsg;

		private String rdsUserName;

		private String rdsPassword;

		public String getRdsId() {
			return this.rdsId;
		}

		public void setRdsId(String rdsId) {
			this.rdsId = rdsId;
		}

		public String getSynDb() {
			return this.synDb;
		}

		public void setSynDb(String synDb) {
			this.synDb = synDb;
		}

		public Boolean getSynStatus() {
			return this.synStatus;
		}

		public void setSynStatus(Boolean synStatus) {
			this.synStatus = synStatus;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getRdsUserName() {
			return this.rdsUserName;
		}

		public void setRdsUserName(String rdsUserName) {
			this.rdsUserName = rdsUserName;
		}

		public String getRdsPassword() {
			return this.rdsPassword;
		}

		public void setRdsPassword(String rdsPassword) {
			this.rdsPassword = rdsPassword;
		}
	}

	@Override
	public DescribeSynDbsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSynDbsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
