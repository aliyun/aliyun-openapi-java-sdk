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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListClriskDatasourceResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskDatasourceResponse.DataSourceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskDatasourceResponseUnmarshaller {

	public static ListClriskDatasourceResponse unmarshall(ListClriskDatasourceResponse listClriskDatasourceResponse, UnmarshallerContext _ctx) {
		
		listClriskDatasourceResponse.setRequestId(_ctx.stringValue("ListClriskDatasourceResponse.RequestId"));
		listClriskDatasourceResponse.setResultCode(_ctx.stringValue("ListClriskDatasourceResponse.ResultCode"));
		listClriskDatasourceResponse.setResultMessage(_ctx.stringValue("ListClriskDatasourceResponse.ResultMessage"));
		listClriskDatasourceResponse.setPageCount(_ctx.longValue("ListClriskDatasourceResponse.PageCount"));
		listClriskDatasourceResponse.setPageNumber(_ctx.longValue("ListClriskDatasourceResponse.PageNumber"));
		listClriskDatasourceResponse.setPageSize(_ctx.longValue("ListClriskDatasourceResponse.PageSize"));
		listClriskDatasourceResponse.setTotalCount(_ctx.longValue("ListClriskDatasourceResponse.TotalCount"));

		List<DataSourceListItem> dataSourceList = new ArrayList<DataSourceListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskDatasourceResponse.DataSourceList.Length"); i++) {
			DataSourceListItem dataSourceListItem = new DataSourceListItem();
			dataSourceListItem.setColumnSplit(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].ColumnSplit"));
			dataSourceListItem.setDataSourceConfigId(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].DataSourceConfigId"));
			dataSourceListItem.setDataSourceConfigName(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].DataSourceConfigName"));
			dataSourceListItem.setDataSourceId(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].DataSourceId"));
			dataSourceListItem.setDataSourceName(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].DataSourceName"));
			dataSourceListItem.setDbSharding(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].DbSharding"));
			dataSourceListItem.setFieldList(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FieldList"));
			dataSourceListItem.setFileEncoding(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FileEncoding"));
			dataSourceListItem.setFilePath(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FilePath"));
			dataSourceListItem.setFileProperties(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FileProperties"));
			dataSourceListItem.setFileProtocol(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FileProtocol"));
			dataSourceListItem.setFileRegMatchType(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FileRegMatchType"));
			dataSourceListItem.setFileTemplateId(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FileTemplateId"));
			dataSourceListItem.setFileTemplateName(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].FileTemplateName"));
			dataSourceListItem.setGmtCreate(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].GmtCreate"));
			dataSourceListItem.setGmtModified(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].GmtModified"));
			dataSourceListItem.setJsonText(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].JsonText"));
			dataSourceListItem.setLastModifier(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].LastModifier"));
			dataSourceListItem.setRelatedTableId(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].RelatedTableId"));
			dataSourceListItem.setRelatedTableName(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].RelatedTableName"));
			dataSourceListItem.setShardingGroovyScript(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].ShardingGroovyScript"));
			dataSourceListItem.setSqlText(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].SqlText"));
			dataSourceListItem.setStatus(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].Status"));
			dataSourceListItem.setType(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].Type"));
			dataSourceListItem.setCreator(_ctx.stringValue("ListClriskDatasourceResponse.DataSourceList["+ i +"].Creator"));

			dataSourceList.add(dataSourceListItem);
		}
		listClriskDatasourceResponse.setDataSourceList(dataSourceList);
	 
	 	return listClriskDatasourceResponse;
	}
}