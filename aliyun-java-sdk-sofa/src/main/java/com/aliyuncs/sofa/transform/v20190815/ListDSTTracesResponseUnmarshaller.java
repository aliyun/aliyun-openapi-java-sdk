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

import com.aliyuncs.sofa.model.v20190815.ListDSTTracesResponse;
import com.aliyuncs.sofa.model.v20190815.ListDSTTracesResponse.TracesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTTracesResponseUnmarshaller {

	public static ListDSTTracesResponse unmarshall(ListDSTTracesResponse listDSTTracesResponse, UnmarshallerContext _ctx) {
		
		listDSTTracesResponse.setRequestId(_ctx.stringValue("ListDSTTracesResponse.RequestId"));
		listDSTTracesResponse.setResultCode(_ctx.stringValue("ListDSTTracesResponse.ResultCode"));
		listDSTTracesResponse.setResultMessage(_ctx.stringValue("ListDSTTracesResponse.ResultMessage"));
		listDSTTracesResponse.setPageNumber(_ctx.longValue("ListDSTTracesResponse.PageNumber"));
		listDSTTracesResponse.setPageSize(_ctx.longValue("ListDSTTracesResponse.PageSize"));
		listDSTTracesResponse.setTotalCount(_ctx.longValue("ListDSTTracesResponse.TotalCount"));

		List<TracesItem> traces = new ArrayList<TracesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTTracesResponse.Traces.Length"); i++) {
			TracesItem tracesItem = new TracesItem();
			tracesItem.setCollected(_ctx.booleanValue("ListDSTTracesResponse.Traces["+ i +"].Collected"));
			tracesItem.setCollectedDescription(_ctx.stringValue("ListDSTTracesResponse.Traces["+ i +"].CollectedDescription"));
			tracesItem.setCollectedName(_ctx.stringValue("ListDSTTracesResponse.Traces["+ i +"].CollectedName"));
			tracesItem.setCollectedTime(_ctx.stringValue("ListDSTTracesResponse.Traces["+ i +"].CollectedTime"));
			tracesItem.setCollectedUserName(_ctx.stringValue("ListDSTTracesResponse.Traces["+ i +"].CollectedUserName"));
			tracesItem.setTraceId(_ctx.stringValue("ListDSTTracesResponse.Traces["+ i +"].TraceId"));

			traces.add(tracesItem);
		}
		listDSTTracesResponse.setTraces(traces);
	 
	 	return listDSTTracesResponse;
	}
}