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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetTableMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableMetaResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String description;

	private String resourceId;

	private String tableName;

	private String type;

	private String module;

	private Boolean canDelete;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private String url;

	private String tableMetaId;

	private String gmtImportedTime;

	private String config;

	private List<FieldsItem> fields;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Boolean getCanDelete() {
		return this.canDelete;
	}

	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTableMetaId() {
		return this.tableMetaId;
	}

	public void setTableMetaId(String tableMetaId) {
		this.tableMetaId = tableMetaId;
	}

	public String getGmtImportedTime() {
		return this.gmtImportedTime;
	}

	public void setGmtImportedTime(String gmtImportedTime) {
		this.gmtImportedTime = gmtImportedTime;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public List<FieldsItem> getFields() {
		return this.fields;
	}

	public void setFields(List<FieldsItem> fields) {
		this.fields = fields;
	}

	public static class FieldsItem {

		private String name;

		private String meaning;

		private String type;

		private Boolean isDimensionField;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMeaning() {
			return this.meaning;
		}

		public void setMeaning(String meaning) {
			this.meaning = meaning;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getIsDimensionField() {
			return this.isDimensionField;
		}

		public void setIsDimensionField(Boolean isDimensionField) {
			this.isDimensionField = isDimensionField;
		}
	}

	@Override
	public GetTableMetaResponse getInstance(UnmarshallerContext context) {
		return	GetTableMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
