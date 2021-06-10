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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetMetaTableColumnResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetMetaTableColumnResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableColumnResponseUnmarshaller {

	public static GetMetaTableColumnResponse unmarshall(GetMetaTableColumnResponse getMetaTableColumnResponse, UnmarshallerContext _ctx) {
		
		getMetaTableColumnResponse.setRequestId(_ctx.stringValue("GetMetaTableColumnResponse.RequestId"));
		getMetaTableColumnResponse.setErrorCode(_ctx.stringValue("GetMetaTableColumnResponse.ErrorCode"));
		getMetaTableColumnResponse.setErrorMessage(_ctx.stringValue("GetMetaTableColumnResponse.ErrorMessage"));
		getMetaTableColumnResponse.setSuccess(_ctx.booleanValue("GetMetaTableColumnResponse.Success"));

		List<Column> columnList = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableColumnResponse.ColumnList.Length"); i++) {
			Column column = new Column();
			column.setColumnType(_ctx.stringValue("GetMetaTableColumnResponse.ColumnList["+ i +"].ColumnType"));
			column.setAutoIncrement(_ctx.booleanValue("GetMetaTableColumnResponse.ColumnList["+ i +"].AutoIncrement"));
			column.setColumnId(_ctx.stringValue("GetMetaTableColumnResponse.ColumnList["+ i +"].ColumnId"));
			column.setColumnName(_ctx.stringValue("GetMetaTableColumnResponse.ColumnList["+ i +"].ColumnName"));
			column.setSecurityLevel(_ctx.stringValue("GetMetaTableColumnResponse.ColumnList["+ i +"].SecurityLevel"));
			column.setPrimaryKey(_ctx.stringValue("GetMetaTableColumnResponse.ColumnList["+ i +"].PrimaryKey"));
			column.setDescription(_ctx.stringValue("GetMetaTableColumnResponse.ColumnList["+ i +"].Description"));
			column.setDataPrecision(_ctx.integerValue("GetMetaTableColumnResponse.ColumnList["+ i +"].DataPrecision"));
			column.setDataScale(_ctx.integerValue("GetMetaTableColumnResponse.ColumnList["+ i +"].DataScale"));
			column.setPosition(_ctx.integerValue("GetMetaTableColumnResponse.ColumnList["+ i +"].Position"));
			column.setNullable(_ctx.booleanValue("GetMetaTableColumnResponse.ColumnList["+ i +"].Nullable"));
			column.setDataLength(_ctx.longValue("GetMetaTableColumnResponse.ColumnList["+ i +"].DataLength"));

			columnList.add(column);
		}
		getMetaTableColumnResponse.setColumnList(columnList);
	 
	 	return getMetaTableColumnResponse;
	}
}