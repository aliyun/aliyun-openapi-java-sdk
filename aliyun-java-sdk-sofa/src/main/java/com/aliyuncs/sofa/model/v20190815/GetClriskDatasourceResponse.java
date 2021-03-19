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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetClriskDatasourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClriskDatasourceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private DataSource dataSource;

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

	public DataSource getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public static class DataSource {

		private String columnSplit;

		private String dataSourceConfigId;

		private String dataSourceConfigName;

		private String dataSourceId;

		private String dataSourceName;

		private String dbSharding;

		private String fieldList;

		private String fileEncoding;

		private String filePath;

		private String fileProperties;

		private String fileProtocol;

		private String fileRegMatchType;

		private String fileTemplateId;

		private String fileTemplateName;

		private String gmtCreate;

		private String gmtModified;

		private String jsonText;

		private String lastModifier;

		private String relatedTableId;

		private String relatedTableName;

		private String shardingGroovyScript;

		private String sqlText;

		private String status;

		private String type;

		private String creator;

		public String getColumnSplit() {
			return this.columnSplit;
		}

		public void setColumnSplit(String columnSplit) {
			this.columnSplit = columnSplit;
		}

		public String getDataSourceConfigId() {
			return this.dataSourceConfigId;
		}

		public void setDataSourceConfigId(String dataSourceConfigId) {
			this.dataSourceConfigId = dataSourceConfigId;
		}

		public String getDataSourceConfigName() {
			return this.dataSourceConfigName;
		}

		public void setDataSourceConfigName(String dataSourceConfigName) {
			this.dataSourceConfigName = dataSourceConfigName;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getDbSharding() {
			return this.dbSharding;
		}

		public void setDbSharding(String dbSharding) {
			this.dbSharding = dbSharding;
		}

		public String getFieldList() {
			return this.fieldList;
		}

		public void setFieldList(String fieldList) {
			this.fieldList = fieldList;
		}

		public String getFileEncoding() {
			return this.fileEncoding;
		}

		public void setFileEncoding(String fileEncoding) {
			this.fileEncoding = fileEncoding;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileProperties() {
			return this.fileProperties;
		}

		public void setFileProperties(String fileProperties) {
			this.fileProperties = fileProperties;
		}

		public String getFileProtocol() {
			return this.fileProtocol;
		}

		public void setFileProtocol(String fileProtocol) {
			this.fileProtocol = fileProtocol;
		}

		public String getFileRegMatchType() {
			return this.fileRegMatchType;
		}

		public void setFileRegMatchType(String fileRegMatchType) {
			this.fileRegMatchType = fileRegMatchType;
		}

		public String getFileTemplateId() {
			return this.fileTemplateId;
		}

		public void setFileTemplateId(String fileTemplateId) {
			this.fileTemplateId = fileTemplateId;
		}

		public String getFileTemplateName() {
			return this.fileTemplateName;
		}

		public void setFileTemplateName(String fileTemplateName) {
			this.fileTemplateName = fileTemplateName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getJsonText() {
			return this.jsonText;
		}

		public void setJsonText(String jsonText) {
			this.jsonText = jsonText;
		}

		public String getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(String lastModifier) {
			this.lastModifier = lastModifier;
		}

		public String getRelatedTableId() {
			return this.relatedTableId;
		}

		public void setRelatedTableId(String relatedTableId) {
			this.relatedTableId = relatedTableId;
		}

		public String getRelatedTableName() {
			return this.relatedTableName;
		}

		public void setRelatedTableName(String relatedTableName) {
			this.relatedTableName = relatedTableName;
		}

		public String getShardingGroovyScript() {
			return this.shardingGroovyScript;
		}

		public void setShardingGroovyScript(String shardingGroovyScript) {
			this.shardingGroovyScript = shardingGroovyScript;
		}

		public String getSqlText() {
			return this.sqlText;
		}

		public void setSqlText(String sqlText) {
			this.sqlText = sqlText;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}
	}

	@Override
	public GetClriskDatasourceResponse getInstance(UnmarshallerContext context) {
		return	GetClriskDatasourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
