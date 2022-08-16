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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsSqlAuditStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsSqlAuditStatusResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String extraSlsLogStore;

		private String dbName;

		private String detailed;

		private Boolean extraWriteEnabled;

		private String enabled;

		private Long extraAliUid;

		private String extraSlsProject;

		public String getExtraSlsLogStore() {
			return this.extraSlsLogStore;
		}

		public void setExtraSlsLogStore(String extraSlsLogStore) {
			this.extraSlsLogStore = extraSlsLogStore;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getDetailed() {
			return this.detailed;
		}

		public void setDetailed(String detailed) {
			this.detailed = detailed;
		}

		public Boolean getExtraWriteEnabled() {
			return this.extraWriteEnabled;
		}

		public void setExtraWriteEnabled(Boolean extraWriteEnabled) {
			this.extraWriteEnabled = extraWriteEnabled;
		}

		public String getEnabled() {
			return this.enabled;
		}

		public void setEnabled(String enabled) {
			this.enabled = enabled;
		}

		public Long getExtraAliUid() {
			return this.extraAliUid;
		}

		public void setExtraAliUid(Long extraAliUid) {
			this.extraAliUid = extraAliUid;
		}

		public String getExtraSlsProject() {
			return this.extraSlsProject;
		}

		public void setExtraSlsProject(String extraSlsProject) {
			this.extraSlsProject = extraSlsProject;
		}
	}

	@Override
	public DescribeDrdsSqlAuditStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsSqlAuditStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
