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
import com.aliyuncs.csas.transform.v20230120.ListApprovalProcessesForApprovalSchemasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApprovalProcessesForApprovalSchemasResponse extends AcsResponse {

	private String requestId;

	private List<Data> schemas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getSchemas() {
		return this.schemas;
	}

	public void setSchemas(List<Data> schemas) {
		this.schemas = schemas;
	}

	public static class Data {

		private String schemaId;

		private List<ProcessesItem> processes;

		public String getSchemaId() {
			return this.schemaId;
		}

		public void setSchemaId(String schemaId) {
			this.schemaId = schemaId;
		}

		public List<ProcessesItem> getProcesses() {
			return this.processes;
		}

		public void setProcesses(List<ProcessesItem> processes) {
			this.processes = processes;
		}

		public static class ProcessesItem {

			private String createTime;

			private String processId;

			private String processName;

			private String description;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getProcessId() {
				return this.processId;
			}

			public void setProcessId(String processId) {
				this.processId = processId;
			}

			public String getProcessName() {
				return this.processName;
			}

			public void setProcessName(String processName) {
				this.processName = processName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public ListApprovalProcessesForApprovalSchemasResponse getInstance(UnmarshallerContext context) {
		return	ListApprovalProcessesForApprovalSchemasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
