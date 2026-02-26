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

import com.aliyuncs.mts.model.v20140618.QueryTraceM3u8JobResponse;
import com.aliyuncs.mts.model.v20140618.QueryTraceM3u8JobResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTraceM3u8JobResponseUnmarshaller {

	public static QueryTraceM3u8JobResponse unmarshall(QueryTraceM3u8JobResponse queryTraceM3u8JobResponse, UnmarshallerContext _ctx) {
		
		queryTraceM3u8JobResponse.setRequestId(_ctx.stringValue("QueryTraceM3u8JobResponse.RequestId"));
		queryTraceM3u8JobResponse.setMessage(_ctx.stringValue("QueryTraceM3u8JobResponse.Message"));
		queryTraceM3u8JobResponse.setStatusCode(_ctx.longValue("QueryTraceM3u8JobResponse.StatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTraceM3u8JobResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGmtCreate(_ctx.longValue("QueryTraceM3u8JobResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.longValue("QueryTraceM3u8JobResponse.Data["+ i +"].GmtModified"));
			dataItem.setMediaId(_ctx.stringValue("QueryTraceM3u8JobResponse.Data["+ i +"].MediaId"));
			dataItem.setJobId(_ctx.stringValue("QueryTraceM3u8JobResponse.Data["+ i +"].JobId"));
			dataItem.setTrace(_ctx.stringValue("QueryTraceM3u8JobResponse.Data["+ i +"].Trace"));
			dataItem.setTraceId(_ctx.longValue("QueryTraceM3u8JobResponse.Data["+ i +"].TraceId"));
			dataItem.setOutput(_ctx.stringValue("QueryTraceM3u8JobResponse.Data["+ i +"].Output"));
			dataItem.setStatus(_ctx.stringValue("QueryTraceM3u8JobResponse.Data["+ i +"].Status"));
			dataItem.setUserData(_ctx.stringValue("QueryTraceM3u8JobResponse.Data["+ i +"].UserData"));
			dataItem.setUserId(_ctx.longValue("QueryTraceM3u8JobResponse.Data["+ i +"].UserId"));

			data.add(dataItem);
		}
		queryTraceM3u8JobResponse.setData(data);
	 
	 	return queryTraceM3u8JobResponse;
	}
}