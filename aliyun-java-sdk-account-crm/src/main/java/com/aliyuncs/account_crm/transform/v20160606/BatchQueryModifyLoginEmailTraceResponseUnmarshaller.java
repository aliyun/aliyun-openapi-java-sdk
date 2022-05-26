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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.BatchQueryModifyLoginEmailTraceResponse;
import com.aliyuncs.account_crm.model.v20160606.BatchQueryModifyLoginEmailTraceResponse.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchQueryModifyLoginEmailTraceResponseUnmarshaller {

	public static BatchQueryModifyLoginEmailTraceResponse unmarshall(BatchQueryModifyLoginEmailTraceResponse batchQueryModifyLoginEmailTraceResponse, UnmarshallerContext _ctx) {
		
		batchQueryModifyLoginEmailTraceResponse.setRequestId(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.RequestId"));
		batchQueryModifyLoginEmailTraceResponse.setCode(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Code"));
		batchQueryModifyLoginEmailTraceResponse.setMessage(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Message"));
		batchQueryModifyLoginEmailTraceResponse.setSuccess(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Success"));

		List<Trace> traces = new ArrayList<Trace>();
		for (int i = 0; i < _ctx.lengthValue("BatchQueryModifyLoginEmailTraceResponse.Traces.Length"); i++) {
			Trace trace = new Trace();
			trace.setStatus(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Traces["+ i +"].Status"));
			trace.setTraceNo(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Traces["+ i +"].TraceNo"));
			trace.setNewLoginEmail(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Traces["+ i +"].NewLoginEmail"));
			trace.setPk(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Traces["+ i +"].Pk"));
			trace.setOldLoginEmail(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Traces["+ i +"].OldLoginEmail"));
			trace.setNowLoginEmail(_ctx.stringValue("BatchQueryModifyLoginEmailTraceResponse.Traces["+ i +"].NowLoginEmail"));

			traces.add(trace);
		}
		batchQueryModifyLoginEmailTraceResponse.setTraces(traces);
	 
	 	return batchQueryModifyLoginEmailTraceResponse;
	}
}