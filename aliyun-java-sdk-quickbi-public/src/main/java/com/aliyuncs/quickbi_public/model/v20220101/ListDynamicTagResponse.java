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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.ListDynamicTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDynamicTagResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

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

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String organizationId;

		private String configId;

		private String configName;

		private String dsId;

		private String tableName;

		private String columnName;

		private Integer relatedAttribute;

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getConfigId() {
			return this.configId;
		}

		public void setConfigId(String configId) {
			this.configId = configId;
		}

		public String getConfigName() {
			return this.configName;
		}

		public void setConfigName(String configName) {
			this.configName = configName;
		}

		public String getDsId() {
			return this.dsId;
		}

		public void setDsId(String dsId) {
			this.dsId = dsId;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public Integer getRelatedAttribute() {
			return this.relatedAttribute;
		}

		public void setRelatedAttribute(Integer relatedAttribute) {
			this.relatedAttribute = relatedAttribute;
		}
	}

	@Override
	public ListDynamicTagResponse getInstance(UnmarshallerContext context) {
		return	ListDynamicTagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
