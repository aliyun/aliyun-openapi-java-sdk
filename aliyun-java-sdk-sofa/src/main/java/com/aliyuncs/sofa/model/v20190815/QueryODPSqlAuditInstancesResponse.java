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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryODPSqlAuditInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryODPSqlAuditInstancesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean slsOpened;

		private List<InstancesItem> instances;

		public Boolean getSlsOpened() {
			return this.slsOpened;
		}

		public void setSlsOpened(Boolean slsOpened) {
			this.slsOpened = slsOpened;
		}

		public List<InstancesItem> getInstances() {
			return this.instances;
		}

		public void setInstances(List<InstancesItem> instances) {
			this.instances = instances;
		}

		public static class InstancesItem {

			private String instanceId;

			private Long openedCount;

			private List<SchemasItem> schemas;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getOpenedCount() {
				return this.openedCount;
			}

			public void setOpenedCount(Long openedCount) {
				this.openedCount = openedCount;
			}

			public List<SchemasItem> getSchemas() {
				return this.schemas;
			}

			public void setSchemas(List<SchemasItem> schemas) {
				this.schemas = schemas;
			}

			public static class SchemasItem {

				private Boolean opened;

				private String schemaName;

				public Boolean getOpened() {
					return this.opened;
				}

				public void setOpened(Boolean opened) {
					this.opened = opened;
				}

				public String getSchemaName() {
					return this.schemaName;
				}

				public void setSchemaName(String schemaName) {
					this.schemaName = schemaName;
				}
			}
		}
	}

	@Override
	public QueryODPSqlAuditInstancesResponse getInstance(UnmarshallerContext context) {
		return	QueryODPSqlAuditInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
