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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListApprovalSchemasForApprovalProcessesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApprovalSchemasForApprovalProcessesResponse extends AcsResponse {

	private String requestId;

	private List<Data> processes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getProcesses() {
		return this.processes;
	}

	public void setProcesses(List<Data> processes) {
		this.processes = processes;
	}

	public static class Data {

		private String processId;

		private List<SchemasItem> schemas;

		public String getProcessId() {
			return this.processId;
		}

		public void setProcessId(String processId) {
			this.processId = processId;
		}

		public List<SchemasItem> getSchemas() {
			return this.schemas;
		}

		public void setSchemas(List<SchemasItem> schemas) {
			this.schemas = schemas;
		}

		public static class SchemasItem {

			private String createTime;

			private String schemaId;

			private String schemaName;

			private String description;

			private String schemaContent;

			private Long schemaVersion;

			private String policyType;

			private Boolean isDefault;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getSchemaId() {
				return this.schemaId;
			}

			public void setSchemaId(String schemaId) {
				this.schemaId = schemaId;
			}

			public String getSchemaName() {
				return this.schemaName;
			}

			public void setSchemaName(String schemaName) {
				this.schemaName = schemaName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSchemaContent() {
				return this.schemaContent;
			}

			public void setSchemaContent(String schemaContent) {
				this.schemaContent = schemaContent;
			}

			public Long getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(Long schemaVersion) {
				this.schemaVersion = schemaVersion;
			}

			public String getPolicyType() {
				return this.policyType;
			}

			public void setPolicyType(String policyType) {
				this.policyType = policyType;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}
		}
	}

	@Override
	public ListApprovalSchemasForApprovalProcessesResponse getInstance(UnmarshallerContext context) {
		return	ListApprovalSchemasForApprovalProcessesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
