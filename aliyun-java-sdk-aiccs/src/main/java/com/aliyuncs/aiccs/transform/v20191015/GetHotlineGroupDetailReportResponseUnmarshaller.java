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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetHotlineGroupDetailReportResponse;
import com.aliyuncs.aiccs.model.v20191015.GetHotlineGroupDetailReportResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.GetHotlineGroupDetailReportResponse.Data.ColumnsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineGroupDetailReportResponseUnmarshaller {

	public static GetHotlineGroupDetailReportResponse unmarshall(GetHotlineGroupDetailReportResponse getHotlineGroupDetailReportResponse, UnmarshallerContext _ctx) {
		
		getHotlineGroupDetailReportResponse.setRequestId(_ctx.stringValue("GetHotlineGroupDetailReportResponse.RequestId"));
		getHotlineGroupDetailReportResponse.setCode(_ctx.stringValue("GetHotlineGroupDetailReportResponse.Code"));
		getHotlineGroupDetailReportResponse.setMessage(_ctx.stringValue("GetHotlineGroupDetailReportResponse.Message"));
		getHotlineGroupDetailReportResponse.setSuccess(_ctx.stringValue("GetHotlineGroupDetailReportResponse.Success"));

		Data data = new Data();
		data.setPage(_ctx.integerValue("GetHotlineGroupDetailReportResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("GetHotlineGroupDetailReportResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("GetHotlineGroupDetailReportResponse.Data.Total"));

		List<Map<Object, Object>> rows = _ctx.listMapValue("GetHotlineGroupDetailReportResponse.Data.Rows");
		data.setRows(rows);

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHotlineGroupDetailReportResponse.Data.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setTitle(_ctx.stringValue("GetHotlineGroupDetailReportResponse.Data.Columns["+ i +"].Title"));
			columnsItem.setKey(_ctx.stringValue("GetHotlineGroupDetailReportResponse.Data.Columns["+ i +"].Key"));

			columns.add(columnsItem);
		}
		data.setColumns(columns);
		getHotlineGroupDetailReportResponse.setData(data);
	 
	 	return getHotlineGroupDetailReportResponse;
	}
}