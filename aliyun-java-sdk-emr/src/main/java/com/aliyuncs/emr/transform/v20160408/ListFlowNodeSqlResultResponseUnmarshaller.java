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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListFlowNodeSqlResultResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowNodeSqlResultResponse.Row;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowNodeSqlResultResponseUnmarshaller {

	public static ListFlowNodeSqlResultResponse unmarshall(ListFlowNodeSqlResultResponse listFlowNodeSqlResultResponse, UnmarshallerContext _ctx) {
		
		listFlowNodeSqlResultResponse.setRequestId(_ctx.stringValue("ListFlowNodeSqlResultResponse.RequestId"));
		listFlowNodeSqlResultResponse.setEnd(_ctx.booleanValue("ListFlowNodeSqlResultResponse.End"));

		List<String> headerList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowNodeSqlResultResponse.HeaderList.Length"); i++) {
			headerList.add(_ctx.stringValue("ListFlowNodeSqlResultResponse.HeaderList["+ i +"]"));
		}
		listFlowNodeSqlResultResponse.setHeaderList(headerList);

		List<Row> rowList = new ArrayList<Row>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowNodeSqlResultResponse.RowList.Length"); i++) {
			Row row = new Row();
			row.setRowIndex(_ctx.integerValue("ListFlowNodeSqlResultResponse.RowList["+ i +"].RowIndex"));

			List<String> rowItemList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFlowNodeSqlResultResponse.RowList["+ i +"].RowItemList.Length"); j++) {
				rowItemList.add(_ctx.stringValue("ListFlowNodeSqlResultResponse.RowList["+ i +"].RowItemList["+ j +"]"));
			}
			row.setRowItemList(rowItemList);

			rowList.add(row);
		}
		listFlowNodeSqlResultResponse.setRowList(rowList);
	 
	 	return listFlowNodeSqlResultResponse;
	}
}