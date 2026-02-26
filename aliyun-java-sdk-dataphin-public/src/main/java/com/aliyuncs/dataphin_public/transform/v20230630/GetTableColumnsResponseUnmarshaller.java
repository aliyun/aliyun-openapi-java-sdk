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
		getTableColumnsResponse.setSuccess(_ctx.booleanValue("GetTableColumnsResponse.Success"));
		getTableColumnsResponse.setHttpStatusCode(_ctx.integerValue("GetTableColumnsResponse.HttpStatusCode"));
		getTableColumnsResponse.setCode(_ctx.stringValue("GetTableColumnsResponse.Code"));
		getTableColumnsResponse.setMessage(_ctx.stringValue("GetTableColumnsResponse.Message"));

		List<Column> columnList = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("GetTableColumnsResponse.ColumnList.Length"); i++) {
			Column column = new Column();
			column.setGuid(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Guid"));
			column.setEnv(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Env"));
			column.setTableGuid(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].TableGuid"));
			column.setDataSourceId(_ctx.longValue("GetTableColumnsResponse.ColumnList["+ i +"].DataSourceId"));
			column.setDataSourceType(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DataSourceType"));
			column.setTableName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].TableName"));
			column.setSeqNumber(_ctx.integerValue("GetTableColumnsResponse.ColumnList["+ i +"].SeqNumber"));
			column.setName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Name"));
			column.setDisplayName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DisplayName"));
			column.setComment(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Comment"));
			column.setDataType(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DataType"));
			column.setNullable(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].Nullable"));
			column.setDefaultValue(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].DefaultValue"));
			column.setIsPrimaryKey(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].IsPrimaryKey"));
			column.setIsForeignKey(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].IsForeignKey"));
			column.setIsPartitionColumn(_ctx.booleanValue("GetTableColumnsResponse.ColumnList["+ i +"].IsPartitionColumn"));
			column.setCreator(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].Creator"));
			column.setLastModifier(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].LastModifier"));
			column.setVisitCount30d(_ctx.longValue("GetTableColumnsResponse.ColumnList["+ i +"].VisitCount30d"));
			column.setCreateTime(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].CreateTime"));
			column.setModifyTime(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].ModifyTime"));
			column.setClassifyId(_ctx.longValue("GetTableColumnsResponse.ColumnList["+ i +"].ClassifyId"));
			column.setClassifyName(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].ClassifyName"));
			column.setLevelAbbreviation(_ctx.stringValue("GetTableColumnsResponse.ColumnList["+ i +"].LevelAbbreviation"));

			columnList.add(column);
		}
		getTableColumnsResponse.setColumnList(columnList);
	 
	 	return getTableColumnsResponse;
	}
}