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

import com.aliyuncs.sofa.model.v20190815.GetDWSMetaHierarchystringResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSMetaHierarchystringResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.GetDWSMetaHierarchystringResponse.DataItem.ColumnsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSMetaHierarchystringResponseUnmarshaller {

	public static GetDWSMetaHierarchystringResponse unmarshall(GetDWSMetaHierarchystringResponse getDWSMetaHierarchystringResponse, UnmarshallerContext _ctx) {
		
		getDWSMetaHierarchystringResponse.setRequestId(_ctx.stringValue("GetDWSMetaHierarchystringResponse.RequestId"));
		getDWSMetaHierarchystringResponse.setResultCode(_ctx.stringValue("GetDWSMetaHierarchystringResponse.ResultCode"));
		getDWSMetaHierarchystringResponse.setResultMessage(_ctx.stringValue("GetDWSMetaHierarchystringResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSMetaHierarchystringResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTableName(_ctx.stringValue("GetDWSMetaHierarchystringResponse.Data["+ i +"].TableName"));

			List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetDWSMetaHierarchystringResponse.Data["+ i +"].Columns.Length"); j++) {
				ColumnsItem columnsItem = new ColumnsItem();
				columnsItem.setColumnName(_ctx.stringValue("GetDWSMetaHierarchystringResponse.Data["+ i +"].Columns["+ j +"].ColumnName"));

				List<String> columnDetailInfo = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetDWSMetaHierarchystringResponse.Data["+ i +"].Columns["+ j +"].ColumnDetailInfo.Length"); k++) {
					columnDetailInfo.add(_ctx.stringValue("GetDWSMetaHierarchystringResponse.Data["+ i +"].Columns["+ j +"].ColumnDetailInfo["+ k +"]"));
				}
				columnsItem.setColumnDetailInfo(columnDetailInfo);

				columns.add(columnsItem);
			}
			dataItem.setColumns(columns);

			data.add(dataItem);
		}
		getDWSMetaHierarchystringResponse.setData(data);
	 
	 	return getDWSMetaHierarchystringResponse;
	}
}