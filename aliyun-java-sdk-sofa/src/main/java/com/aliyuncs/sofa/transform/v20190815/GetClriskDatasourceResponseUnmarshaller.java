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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetClriskDatasourceResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskDatasourceResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskDatasourceResponseUnmarshaller {

	public static GetClriskDatasourceResponse unmarshall(GetClriskDatasourceResponse getClriskDatasourceResponse, UnmarshallerContext _ctx) {
		
		getClriskDatasourceResponse.setRequestId(_ctx.stringValue("GetClriskDatasourceResponse.RequestId"));
		getClriskDatasourceResponse.setResultCode(_ctx.stringValue("GetClriskDatasourceResponse.ResultCode"));
		getClriskDatasourceResponse.setResultMessage(_ctx.stringValue("GetClriskDatasourceResponse.ResultMessage"));

		DataSource dataSource = new DataSource();
		dataSource.setColumnSplit(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.ColumnSplit"));
		dataSource.setDataSourceConfigId(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.DataSourceConfigId"));
		dataSource.setDataSourceConfigName(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.DataSourceConfigName"));
		dataSource.setDataSourceId(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.DataSourceId"));
		dataSource.setDataSourceName(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.DataSourceName"));
		dataSource.setDbSharding(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.DbSharding"));
		dataSource.setFieldList(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FieldList"));
		dataSource.setFileEncoding(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FileEncoding"));
		dataSource.setFilePath(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FilePath"));
		dataSource.setFileProperties(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FileProperties"));
		dataSource.setFileProtocol(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FileProtocol"));
		dataSource.setFileRegMatchType(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FileRegMatchType"));
		dataSource.setFileTemplateId(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FileTemplateId"));
		dataSource.setFileTemplateName(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.FileTemplateName"));
		dataSource.setGmtCreate(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.GmtCreate"));
		dataSource.setGmtModified(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.GmtModified"));
		dataSource.setJsonText(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.JsonText"));
		dataSource.setLastModifier(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.LastModifier"));
		dataSource.setRelatedTableId(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.RelatedTableId"));
		dataSource.setRelatedTableName(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.RelatedTableName"));
		dataSource.setShardingGroovyScript(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.ShardingGroovyScript"));
		dataSource.setSqlText(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.SqlText"));
		dataSource.setStatus(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.Status"));
		dataSource.setType(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.Type"));
		dataSource.setCreator(_ctx.stringValue("GetClriskDatasourceResponse.DataSource.Creator"));
		getClriskDatasourceResponse.setDataSource(dataSource);
	 
	 	return getClriskDatasourceResponse;
	}
}