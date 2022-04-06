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

import com.aliyuncs.arms.model.v20190808.QueryTracesResponse;
import com.aliyuncs.arms.model.v20190808.QueryTracesResponse.TraceListsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTracesResponseUnmarshaller {

	public static QueryTracesResponse unmarshall(QueryTracesResponse queryTracesResponse, UnmarshallerContext _ctx) {
		
		queryTracesResponse.setRequestId(_ctx.stringValue("QueryTracesResponse.RequestId"));

		List<TraceListsItem> traceLists = new ArrayList<TraceListsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTracesResponse.TraceLists.Length"); i++) {
			TraceListsItem traceListsItem = new TraceListsItem();
			traceListsItem.setTraceId(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].TraceId"));
			traceListsItem.setSpanId(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].SpanId"));
			traceListsItem.setParentSpanId(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].ParentSpanId"));
			traceListsItem.setStartTime(_ctx.longValue("QueryTracesResponse.TraceLists["+ i +"].StartTime"));
			traceListsItem.setDuration(_ctx.longValue("QueryTracesResponse.TraceLists["+ i +"].Duration"));
			traceListsItem.setKind(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].Kind"));
			traceListsItem.setPid(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].Pid"));
			traceListsItem.setServiceName(_ctx.longValue("QueryTracesResponse.TraceLists["+ i +"].ServiceName"));
			traceListsItem.setSpanName(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].SpanName"));
			traceListsItem.setIp(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].Ip"));
			traceListsItem.setHostname(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].Hostname"));
			traceListsItem.setSampleIds(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].SampleIds"));
			traceListsItem.setStatusCode(_ctx.integerValue("QueryTracesResponse.TraceLists["+ i +"].StatusCode"));
			traceListsItem.setStatusMessage(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].StatusMessage"));
			traceListsItem.setAttributes(_ctx.mapValue("QueryTracesResponse.TraceLists["+ i +"].Attributes"));
			traceListsItem.setResources(_ctx.mapValue("QueryTracesResponse.TraceLists["+ i +"].Resources"));
			traceListsItem.setEvents(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].Events"));
			traceListsItem.setLinks(_ctx.stringValue("QueryTracesResponse.TraceLists["+ i +"].Links"));
			traceListsItem.setHiddenAttributes(_ctx.mapValue("QueryTracesResponse.TraceLists["+ i +"].HiddenAttributes"));

			traceLists.add(traceListsItem);
		}
		queryTracesResponse.setTraceLists(traceLists);
	 
	 	return queryTracesResponse;
	}
}