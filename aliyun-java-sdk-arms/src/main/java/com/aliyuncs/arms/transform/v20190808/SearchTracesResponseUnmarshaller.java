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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.SearchTracesResponse;
import com.aliyuncs.arms.model.v20190808.SearchTracesResponse.TraceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTracesResponseUnmarshaller {

	public static SearchTracesResponse unmarshall(SearchTracesResponse searchTracesResponse, UnmarshallerContext _ctx) {
		
		searchTracesResponse.setRequestId(_ctx.stringValue("SearchTracesResponse.RequestId"));

		List<TraceInfo> traceInfos = new ArrayList<TraceInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchTracesResponse.TraceInfos.Length"); i++) {
			TraceInfo traceInfo = new TraceInfo();
			traceInfo.setTraceID(_ctx.stringValue("SearchTracesResponse.TraceInfos["+ i +"].TraceID"));
			traceInfo.setOperationName(_ctx.stringValue("SearchTracesResponse.TraceInfos["+ i +"].OperationName"));
			traceInfo.setServiceName(_ctx.stringValue("SearchTracesResponse.TraceInfos["+ i +"].ServiceName"));
			traceInfo.setServiceIp(_ctx.stringValue("SearchTracesResponse.TraceInfos["+ i +"].ServiceIp"));
			traceInfo.setDuration(_ctx.longValue("SearchTracesResponse.TraceInfos["+ i +"].Duration"));
			traceInfo.setTimestamp(_ctx.longValue("SearchTracesResponse.TraceInfos["+ i +"].Timestamp"));

			traceInfos.add(traceInfo);
		}
		searchTracesResponse.setTraceInfos(traceInfos);
	 
	 	return searchTracesResponse;
	}
}