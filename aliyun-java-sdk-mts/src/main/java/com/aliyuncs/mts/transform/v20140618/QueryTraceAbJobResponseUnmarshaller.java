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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryTraceAbJobResponse;
import com.aliyuncs.mts.model.v20140618.QueryTraceAbJobResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTraceAbJobResponseUnmarshaller {

	public static QueryTraceAbJobResponse unmarshall(QueryTraceAbJobResponse queryTraceAbJobResponse, UnmarshallerContext _ctx) {
		
		queryTraceAbJobResponse.setRequestId(_ctx.stringValue("QueryTraceAbJobResponse.RequestId"));
		queryTraceAbJobResponse.setMessage(_ctx.stringValue("QueryTraceAbJobResponse.Message"));
		queryTraceAbJobResponse.setStatusCode(_ctx.longValue("QueryTraceAbJobResponse.StatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTraceAbJobResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCallback(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].Callback"));
			dataItem.setGmtCreate(_ctx.longValue("QueryTraceAbJobResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.longValue("QueryTraceAbJobResponse.Data["+ i +"].GmtModified"));
			dataItem.setInput(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].Input"));
			dataItem.setJobId(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].JobId"));
			dataItem.setLevel(_ctx.longValue("QueryTraceAbJobResponse.Data["+ i +"].Level"));
			dataItem.setMediaId(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].MediaId"));
			dataItem.setOutput(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].Output"));
			dataItem.setStatus(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].Status"));
			dataItem.setUserData(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].UserData"));
			dataItem.setUserId(_ctx.longValue("QueryTraceAbJobResponse.Data["+ i +"].UserId"));
			dataItem.setResult(_ctx.stringValue("QueryTraceAbJobResponse.Data["+ i +"].Result"));

			data.add(dataItem);
		}
		queryTraceAbJobResponse.setData(data);
	 
	 	return queryTraceAbJobResponse;
	}
}