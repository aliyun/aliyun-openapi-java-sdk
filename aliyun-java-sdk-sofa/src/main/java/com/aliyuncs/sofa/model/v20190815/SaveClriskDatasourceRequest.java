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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveClriskDatasourceRequest extends RpcAcsRequest<SaveClriskDatasourceResponse> {
	   

	private String fileEncoding;

	private String jsonText;

	private String dataSourceConfigId;

	private String type;

	private String dbSharding;

	private String fileProtocol;

	private String fileTemplateId;

	private String lineBreak;

	private String columnSplit;

	private String sqlText;

	private String filePath;

	private String relatedTableId;

	private String relatedTableName;

	private String dataSourceName;

	private List<FieldList> fieldLists;

	private String dataSourceConfigName;

	private String shardingGroovyScript;

	private String dataSourceId;

	private String fileProperties;

	private String fileTemplateName;
	public SaveClriskDatasourceRequest() {
		super("SOFA", "2019-08-15", "SaveClriskDatasource", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileEncoding() {
		return this.fileEncoding;
	}

	public void setFileEncoding(String fileEncoding) {
		this.fileEncoding = fileEncoding;
		if(fileEncoding != null){
			putBodyParameter("FileEncoding", fileEncoding);
		}
	}

	public String getJsonText() {
		return this.jsonText;
	}

	public void setJsonText(String jsonText) {
		this.jsonText = jsonText;
		if(jsonText != null){
			putBodyParameter("JsonText", jsonText);
		}
	}

	public String getDataSourceConfigId() {
		return this.dataSourceConfigId;
	}

	public void setDataSourceConfigId(String dataSourceConfigId) {
		this.dataSourceConfigId = dataSourceConfigId;
		if(dataSourceConfigId != null){
			putBodyParameter("DataSourceConfigId", dataSourceConfigId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getDbSharding() {
		return this.dbSharding;
	}

	public void setDbSharding(String dbSharding) {
		this.dbSharding = dbSharding;
		if(dbSharding != null){
			putBodyParameter("DbSharding", dbSharding);
		}
	}

	public String getFileProtocol() {
		return this.fileProtocol;
	}

	public void setFileProtocol(String fileProtocol) {
		this.fileProtocol = fileProtocol;
		if(fileProtocol != null){
			putBodyParameter("FileProtocol", fileProtocol);
		}
	}

	public String getFileTemplateId() {
		return this.fileTemplateId;
	}

	public void setFileTemplateId(String fileTemplateId) {
		this.fileTemplateId = fileTemplateId;
		if(fileTemplateId != null){
			putBodyParameter("FileTemplateId", fileTemplateId);
		}
	}

	public String getLineBreak() {
		return this.lineBreak;
	}

	public void setLineBreak(String lineBreak) {
		this.lineBreak = lineBreak;
		if(lineBreak != null){
			putBodyParameter("LineBreak", lineBreak);
		}
	}

	public String getColumnSplit() {
		return this.columnSplit;
	}

	public void setColumnSplit(String columnSplit) {
		this.columnSplit = columnSplit;
		if(columnSplit != null){
			putBodyParameter("ColumnSplit", columnSplit);
		}
	}

	public String getSqlText() {
		return this.sqlText;
	}

	public void setSqlText(String sqlText) {
		this.sqlText = sqlText;
		if(sqlText != null){
			putBodyParameter("SqlText", sqlText);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putBodyParameter("FilePath", filePath);
		}
	}

	public String getRelatedTableId() {
		return this.relatedTableId;
	}

	public void setRelatedTableId(String relatedTableId) {
		this.relatedTableId = relatedTableId;
		if(relatedTableId != null){
			putBodyParameter("RelatedTableId", relatedTableId);
		}
	}

	public String getRelatedTableName() {
		return this.relatedTableName;
	}

	public void setRelatedTableName(String relatedTableName) {
		this.relatedTableName = relatedTableName;
		if(relatedTableName != null){
			putBodyParameter("RelatedTableName", relatedTableName);
		}
	}

	public String getDataSourceName() {
		return this.dataSourceName;
	}

	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
		if(dataSourceName != null){
			putBodyParameter("DataSourceName", dataSourceName);
		}
	}

	public List<FieldList> getFieldLists() {
		return this.fieldLists;
	}

	public void setFieldLists(List<FieldList> fieldLists) {
		this.fieldLists = fieldLists;	
		if (fieldLists != null) {
			for (int depth1 = 0; depth1 < fieldLists.size(); depth1++) {
				putBodyParameter("FieldList." + (depth1 + 1) + ".FieldName" , fieldLists.get(depth1).getFieldName());
				putBodyParameter("FieldList." + (depth1 + 1) + ".FieldLength" , fieldLists.get(depth1).getFieldLength());
				putBodyParameter("FieldList." + (depth1 + 1) + ".FieldDesc" , fieldLists.get(depth1).getFieldDesc());
				putBodyParameter("FieldList." + (depth1 + 1) + ".FieldType" , fieldLists.get(depth1).getFieldType());
				putBodyParameter("FieldList." + (depth1 + 1) + ".FieldCategory" , fieldLists.get(depth1).getFieldCategory());
			}
		}	
	}

	public String getDataSourceConfigName() {
		return this.dataSourceConfigName;
	}

	public void setDataSourceConfigName(String dataSourceConfigName) {
		this.dataSourceConfigName = dataSourceConfigName;
		if(dataSourceConfigName != null){
			putBodyParameter("DataSourceConfigName", dataSourceConfigName);
		}
	}

	public String getShardingGroovyScript() {
		return this.shardingGroovyScript;
	}

	public void setShardingGroovyScript(String shardingGroovyScript) {
		this.shardingGroovyScript = shardingGroovyScript;
		if(shardingGroovyScript != null){
			putBodyParameter("ShardingGroovyScript", shardingGroovyScript);
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
		}
	}

	public String getFileProperties() {
		return this.fileProperties;
	}

	public void setFileProperties(String fileProperties) {
		this.fileProperties = fileProperties;
		if(fileProperties != null){
			putBodyParameter("FileProperties", fileProperties);
		}
	}

	public String getFileTemplateName() {
		return this.fileTemplateName;
	}

	public void setFileTemplateName(String fileTemplateName) {
		this.fileTemplateName = fileTemplateName;
		if(fileTemplateName != null){
			putBodyParameter("FileTemplateName", fileTemplateName);
		}
	}

	public static class FieldList {

		private String fieldName;

		private String fieldLength;

		private String fieldDesc;

		private String fieldType;

		private String fieldCategory;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldLength() {
			return this.fieldLength;
		}

		public void setFieldLength(String fieldLength) {
			this.fieldLength = fieldLength;
		}

		public String getFieldDesc() {
			return this.fieldDesc;
		}

		public void setFieldDesc(String fieldDesc) {
			this.fieldDesc = fieldDesc;
		}

		public String getFieldType() {
			return this.fieldType;
		}

		public void setFieldType(String fieldType) {
			this.fieldType = fieldType;
		}

		public String getFieldCategory() {
			return this.fieldCategory;
		}

		public void setFieldCategory(String fieldCategory) {
			this.fieldCategory = fieldCategory;
		}
	}

	@Override
	public Class<SaveClriskDatasourceResponse> getResponseClass() {
		return SaveClriskDatasourceResponse.class;
	}

}
