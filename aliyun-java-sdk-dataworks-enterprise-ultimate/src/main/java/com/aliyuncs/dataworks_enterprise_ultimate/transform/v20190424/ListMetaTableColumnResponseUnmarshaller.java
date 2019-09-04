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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.ListMetaTableColumnResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.ListMetaTableColumnResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetaTableColumnResponseUnmarshaller {

	public static ListMetaTableColumnResponse unmarshall(ListMetaTableColumnResponse listMetaTableColumnResponse, UnmarshallerContext _ctx) {
		
		listMetaTableColumnResponse.setRequestId(_ctx.stringValue("ListMetaTableColumnResponse.RequestId"));
		listMetaTableColumnResponse.setErrCode(_ctx.longValue("ListMetaTableColumnResponse.ErrCode"));
		listMetaTableColumnResponse.setErrMsg(_ctx.stringValue("ListMetaTableColumnResponse.ErrMsg"));

		List<Column> columnList = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("ListMetaTableColumnResponse.ColumnList.Length"); i++) {
			Column column = new Column();
			column.setAppGuid(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].AppGuid"));
			column.setTableGuid(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].TableGuid"));
			column.setTableName(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].TableName"));
			column.setColumnGuid(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].ColumnGuid"));
			column.setColumnName(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].ColumnName"));
			column.setColumnType(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].ColumnType"));
			column.setSeqNumber(_ctx.integerValue("ListMetaTableColumnResponse.ColumnList["+ i +"].SeqNumber"));
			column.setIsPartitionCol(_ctx.integerValue("ListMetaTableColumnResponse.ColumnList["+ i +"].IsPartitionCol"));
			column.setIsPrimaryKey(_ctx.integerValue("ListMetaTableColumnResponse.ColumnList["+ i +"].IsPrimaryKey"));
			column.setIsNullable(_ctx.integerValue("ListMetaTableColumnResponse.ColumnList["+ i +"].IsNullable"));
			column.setComment(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].Comment"));
			column.setSafeLevel(_ctx.stringValue("ListMetaTableColumnResponse.ColumnList["+ i +"].SafeLevel"));

			columnList.add(column);
		}
		listMetaTableColumnResponse.setColumnList(columnList);
	 
	 	return listMetaTableColumnResponse;
	}
}