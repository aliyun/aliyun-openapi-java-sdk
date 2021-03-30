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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetHotlineAgentDetailReportResponse;
import com.aliyuncs.scsp.model.v20200702.GetHotlineAgentDetailReportResponse.Data;
import com.aliyuncs.scsp.model.v20200702.GetHotlineAgentDetailReportResponse.Data.ColumnsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineAgentDetailReportResponseUnmarshaller {

	public static GetHotlineAgentDetailReportResponse unmarshall(GetHotlineAgentDetailReportResponse getHotlineAgentDetailReportResponse, UnmarshallerContext _ctx) {
		
		getHotlineAgentDetailReportResponse.setRequestId(_ctx.stringValue("GetHotlineAgentDetailReportResponse.RequestId"));
		getHotlineAgentDetailReportResponse.setMessage(_ctx.stringValue("GetHotlineAgentDetailReportResponse.Message"));
		getHotlineAgentDetailReportResponse.setCode(_ctx.stringValue("GetHotlineAgentDetailReportResponse.Code"));
		getHotlineAgentDetailReportResponse.setSuccess(_ctx.stringValue("GetHotlineAgentDetailReportResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("GetHotlineAgentDetailReportResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("GetHotlineAgentDetailReportResponse.Data.Total"));
		data.setPage(_ctx.integerValue("GetHotlineAgentDetailReportResponse.Data.Page"));

		List<Map<Object, Object>> rows = _ctx.listMapValue("GetHotlineAgentDetailReportResponse.Data.Rows");
		data.setRows(rows);

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHotlineAgentDetailReportResponse.Data.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setTitle(_ctx.stringValue("GetHotlineAgentDetailReportResponse.Data.Columns["+ i +"].Title"));
			columnsItem.setKey(_ctx.stringValue("GetHotlineAgentDetailReportResponse.Data.Columns["+ i +"].Key"));

			columns.add(columnsItem);
		}
		data.setColumns(columns);
		getHotlineAgentDetailReportResponse.setData(data);
	 
	 	return getHotlineAgentDetailReportResponse;
	}
}