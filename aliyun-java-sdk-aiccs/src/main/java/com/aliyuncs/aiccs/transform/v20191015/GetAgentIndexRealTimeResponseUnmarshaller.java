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

import com.aliyuncs.aiccs.model.v20191015.GetAgentIndexRealTimeResponse;
import com.aliyuncs.aiccs.model.v20191015.GetAgentIndexRealTimeResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.GetAgentIndexRealTimeResponse.Data.ColumnsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentIndexRealTimeResponseUnmarshaller {

	public static GetAgentIndexRealTimeResponse unmarshall(GetAgentIndexRealTimeResponse getAgentIndexRealTimeResponse, UnmarshallerContext _ctx) {
		
		getAgentIndexRealTimeResponse.setRequestId(_ctx.stringValue("GetAgentIndexRealTimeResponse.RequestId"));
		getAgentIndexRealTimeResponse.setMessage(_ctx.stringValue("GetAgentIndexRealTimeResponse.Message"));
		getAgentIndexRealTimeResponse.setCode(_ctx.stringValue("GetAgentIndexRealTimeResponse.Code"));
		getAgentIndexRealTimeResponse.setSuccess(_ctx.booleanValue("GetAgentIndexRealTimeResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("GetAgentIndexRealTimeResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("GetAgentIndexRealTimeResponse.Data.Total"));
		data.setPage(_ctx.integerValue("GetAgentIndexRealTimeResponse.Data.Page"));

		List<Map<Object, Object>> rows = _ctx.listMapValue("GetAgentIndexRealTimeResponse.Data.Rows");
		data.setRows(rows);

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAgentIndexRealTimeResponse.Data.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setKey(_ctx.stringValue("GetAgentIndexRealTimeResponse.Data.Columns["+ i +"].Key"));
			columnsItem.setTitle(_ctx.stringValue("GetAgentIndexRealTimeResponse.Data.Columns["+ i +"].Title"));

			columns.add(columnsItem);
		}
		data.setColumns(columns);
		getAgentIndexRealTimeResponse.setData(data);
	 
	 	return getAgentIndexRealTimeResponse;
	}
}