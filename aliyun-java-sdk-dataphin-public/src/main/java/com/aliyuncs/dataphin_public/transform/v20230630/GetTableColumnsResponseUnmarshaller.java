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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetTableColumnsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableColumnsResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableColumnsResponseUnmarshaller {

	public static GetTableColumnsResponse unmarshall(GetTableColumnsResponse getTableColumnsResponse, UnmarshallerContext _ctx) {
		
		getTableColumnsResponse.setRequestId(_ctx.stringValue("GetTableColumnsResponse.RequestId"));
		getTableColumnsResponse.setMessage(_ctx.stringValue("GetTableColumnsResponse.Message"));
		getTableColumnsResponse.setHttpStatusCode(_ctx.integerValue("GetTableColumnsResponse.HttpStatusCode"));
		getTableColumnsResponse.setCode(_ctx.stringValue("GetTableColumnsResponse.Code"));
		getTableColumnsResponse.setSuccess(_ctx.booleanValue("GetTableColumnsResponse.Success"));

		List<Column> columnList = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("GetTableColumnsResponse.ColumnList.Length"); i++) {
			Column column = new Column();
			column.setLevelAbbreviation(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].LevelAbbreviation"));
			column.setComment(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Comment"));
			column.setModifyTime(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].ModifyTime"));
			column.setLastModifier(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].LastModifier"));
			column.setCreateTime(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].CreateTime"));
			column.setGuid(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Guid"));
			column.setCreator(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Creator"));
			column.setEnv(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Env"));
			column.setSeqNumber(_ctx.integerValue("GetTableColumnsResponse.ColumnList["+ i +"].SeqNumber"));
			column.setName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Name"));
			column.setVisitCount30d(_ctx.longValue("GetTableColumnsResponse.ColumnList["+ i +"].VisitCount30d"));
			column.setTableName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].TableName"));
			column.setDefaultValue(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DefaultValue"));
			column.setTableGuid(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].TableGuid"));
			column.setClassifyName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].ClassifyName"));
			column.setClassifyId(_ctx.longValue("GetTableColumnsResponse.ColumnList["+ i +"].ClassifyId"));
			column.setIsPartitionColumn(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].IsPartitionColumn"));
			column.setDataSourceType(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DataSourceType"));
			column.setDisplayName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DisplayName"));
			column.setDataType(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DataType"));
			column.setIsForeignKey(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].IsForeignKey"));
			column.setDataSourceId(_ctx.longValue("GetTableColumnsResponse.ColumnList["+ i +"].DataSourceId"));
			column.setNullable(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].Nullable"));
			column.setIsPrimaryKey(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].IsPrimaryKey"));

			columnList.add(column);
		}
		getTableColumnsResponse.setColumnList(columnList);
	 
	 	return getTableColumnsResponse;
	}
}