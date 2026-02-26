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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListZkTrackResponse;
import com.aliyuncs.mse.model.v20190531.ListZkTrackResponse.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListZkTrackResponseUnmarshaller {

	public static ListZkTrackResponse unmarshall(ListZkTrackResponse listZkTrackResponse, UnmarshallerContext _ctx) {
		
		listZkTrackResponse.setRequestId(_ctx.stringValue("ListZkTrackResponse.RequestId"));
		listZkTrackResponse.setHttpCode(_ctx.stringValue("ListZkTrackResponse.HttpCode"));
		listZkTrackResponse.setPageSize(_ctx.longValue("ListZkTrackResponse.PageSize"));
		listZkTrackResponse.setPageNumber(_ctx.longValue("ListZkTrackResponse.PageNumber"));
		listZkTrackResponse.setTotalCount(_ctx.longValue("ListZkTrackResponse.TotalCount"));
		listZkTrackResponse.setMessage(_ctx.stringValue("ListZkTrackResponse.Message"));
		listZkTrackResponse.setErrorCode(_ctx.stringValue("ListZkTrackResponse.ErrorCode"));
		listZkTrackResponse.setSuccess(_ctx.booleanValue("ListZkTrackResponse.Success"));

		List<Trace> traces = new ArrayList<Trace>();
		for (int i = 0; i < _ctx.lengthValue("ListZkTrackResponse.Traces.Length"); i++) {
			Trace trace = new Trace();
			trace.setLogDate(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].LogDate"));
			trace.setTimestamp(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].Timestamp"));
			trace.setSessionId(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].SessionId"));
			trace.setPath(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].Path"));
			trace.setTraceType(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].TraceType"));
			trace.setOpType(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].OpType"));
			trace.setEventType(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].EventType"));
			trace.setDataType(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].DataType"));
			trace.setWatch(_ctx.booleanValue("ListZkTrackResponse.Traces["+ i +"].Watch"));
			trace.setAcl(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].Acl"));
			trace.setMultiSize(_ctx.longValue("ListZkTrackResponse.Traces["+ i +"].MultiSize"));
			trace.setResult(_ctx.stringValue("ListZkTrackResponse.Traces["+ i +"].Result"));
			trace.setTtl(_ctx.longValue("ListZkTrackResponse.Traces["+ i +"].Ttl"));
			trace.setFinished(_ctx.booleanValue("ListZkTrackResponse.Traces["+ i +"].Finished"));

			traces.add(trace);
		}
		listZkTrackResponse.setTraces(traces);
	 
	 	return listZkTrackResponse;
	}
}