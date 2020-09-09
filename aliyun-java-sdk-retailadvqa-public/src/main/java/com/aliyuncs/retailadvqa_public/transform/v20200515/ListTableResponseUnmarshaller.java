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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.ListTableResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListTableResponse.DataItem;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListTableResponse.DataItem.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTableResponseUnmarshaller {

	public static ListTableResponse unmarshall(ListTableResponse listTableResponse, UnmarshallerContext _ctx) {
		
		listTableResponse.setRequestId(_ctx.stringValue("ListTableResponse.RequestId"));
		listTableResponse.setErrorCode(_ctx.stringValue("ListTableResponse.ErrorCode"));
		listTableResponse.setErrorDesc(_ctx.stringValue("ListTableResponse.ErrorDesc"));
		listTableResponse.setSuccess(_ctx.booleanValue("ListTableResponse.Success"));
		listTableResponse.setTraceId(_ctx.stringValue("ListTableResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTableResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTableName(_ctx.stringValue("ListTableResponse.Data["+ i +"].TableName"));

			List<Column> columns = new ArrayList<Column>();
			for (int j = 0; j < _ctx.lengthValue("ListTableResponse.Data["+ i +"].Columns.Length"); j++) {
				Column column = new Column();
				column.setName(_ctx.stringValue("ListTableResponse.Data["+ i +"].Columns["+ j +"].Name"));
				column.setColumnType(_ctx.stringValue("ListTableResponse.Data["+ i +"].Columns["+ j +"].ColumnType"));
				column.setComment(_ctx.stringValue("ListTableResponse.Data["+ i +"].Columns["+ j +"].Comment"));

				columns.add(column);
			}
			dataItem.setColumns(columns);

			data.add(dataItem);
		}
		listTableResponse.setData(data);
	 
	 	return listTableResponse;
	}
}