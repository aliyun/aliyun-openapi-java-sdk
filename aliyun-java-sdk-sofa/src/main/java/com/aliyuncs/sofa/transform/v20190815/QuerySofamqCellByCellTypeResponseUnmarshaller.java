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

import com.aliyuncs.sofa.model.v20190815.QuerySofamqCellByCellTypeResponse;
import com.aliyuncs.sofa.model.v20190815.QuerySofamqCellByCellTypeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySofamqCellByCellTypeResponseUnmarshaller {

	public static QuerySofamqCellByCellTypeResponse unmarshall(QuerySofamqCellByCellTypeResponse querySofamqCellByCellTypeResponse, UnmarshallerContext _ctx) {
		
		querySofamqCellByCellTypeResponse.setRequestId(_ctx.stringValue("QuerySofamqCellByCellTypeResponse.RequestId"));
		querySofamqCellByCellTypeResponse.setResultCode(_ctx.stringValue("QuerySofamqCellByCellTypeResponse.ResultCode"));
		querySofamqCellByCellTypeResponse.setResultMessage(_ctx.stringValue("QuerySofamqCellByCellTypeResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySofamqCellByCellTypeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCellType(_ctx.stringValue("QuerySofamqCellByCellTypeResponse.Data["+ i +"].CellType"));

			List<String> data1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QuerySofamqCellByCellTypeResponse.Data["+ i +"].Data.Length"); j++) {
				data1.add(_ctx.stringValue("QuerySofamqCellByCellTypeResponse.Data["+ i +"].Data["+ j +"]"));
			}
			dataItem.setData1(data1);

			data.add(dataItem);
		}
		querySofamqCellByCellTypeResponse.setData(data);
	 
	 	return querySofamqCellByCellTypeResponse;
	}
}