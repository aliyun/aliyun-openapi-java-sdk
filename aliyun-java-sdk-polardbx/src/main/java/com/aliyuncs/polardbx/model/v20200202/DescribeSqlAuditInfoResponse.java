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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeSqlAuditInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlAuditInfoResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean isEnabled;

		private String sLSProject;

		private String sLSLogStore;

		private String authenticated;

		private String auditToken;

		public Boolean getIsEnabled() {
			return this.isEnabled;
		}

		public void setIsEnabled(Boolean isEnabled) {
			this.isEnabled = isEnabled;
		}

		public String getSLSProject() {
			return this.sLSProject;
		}

		public void setSLSProject(String sLSProject) {
			this.sLSProject = sLSProject;
		}

		public String getSLSLogStore() {
			return this.sLSLogStore;
		}

		public void setSLSLogStore(String sLSLogStore) {
			this.sLSLogStore = sLSLogStore;
		}

		public String getAuthenticated() {
			return this.authenticated;
		}

		public void setAuthenticated(String authenticated) {
			this.authenticated = authenticated;
		}

		public String getAuditToken() {
			return this.auditToken;
		}

		public void setAuditToken(String auditToken) {
			this.auditToken = auditToken;
		}
	}

	@Override
	public DescribeSqlAuditInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlAuditInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
