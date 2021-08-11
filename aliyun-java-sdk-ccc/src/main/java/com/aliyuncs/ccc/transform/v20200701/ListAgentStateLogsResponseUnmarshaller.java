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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListAgentStateLogsResponse;
import com.aliyuncs.ccc.model.v20200701.ListAgentStateLogsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentStateLogsResponseUnmarshaller {

	public static ListAgentStateLogsResponse unmarshall(ListAgentStateLogsResponse listAgentStateLogsResponse, UnmarshallerContext _ctx) {
		
		listAgentStateLogsResponse.setRequestId(_ctx.stringValue("ListAgentStateLogsResponse.RequestId"));
		listAgentStateLogsResponse.setCode(_ctx.stringValue("ListAgentStateLogsResponse.Code"));
		listAgentStateLogsResponse.setHttpStatusCode(_ctx.integerValue("ListAgentStateLogsResponse.HttpStatusCode"));
		listAgentStateLogsResponse.setMessage(_ctx.stringValue("ListAgentStateLogsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentStateLogsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDuration(_ctx.longValue("ListAgentStateLogsResponse.Data["+ i +"].Duration"));
			dataItem.setStartTime(_ctx.longValue("ListAgentStateLogsResponse.Data["+ i +"].StartTime"));
			dataItem.setState(_ctx.stringValue("ListAgentStateLogsResponse.Data["+ i +"].State"));
			dataItem.setStateCode(_ctx.stringValue("ListAgentStateLogsResponse.Data["+ i +"].StateCode"));

			data.add(dataItem);
		}
		listAgentStateLogsResponse.setData(data);
	 
	 	return listAgentStateLogsResponse;
	}
}