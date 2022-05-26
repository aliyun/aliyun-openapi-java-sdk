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

import com.aliyuncs.account_crm.model.v20160606.BatchQueryCreateAccountTraceResponse;
import com.aliyuncs.account_crm.model.v20160606.BatchQueryCreateAccountTraceResponse.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchQueryCreateAccountTraceResponseUnmarshaller {

	public static BatchQueryCreateAccountTraceResponse unmarshall(BatchQueryCreateAccountTraceResponse batchQueryCreateAccountTraceResponse, UnmarshallerContext _ctx) {
		
		batchQueryCreateAccountTraceResponse.setRequestId(_ctx.stringValue("BatchQueryCreateAccountTraceResponse.RequestId"));
		batchQueryCreateAccountTraceResponse.setCode(_ctx.stringValue("BatchQueryCreateAccountTraceResponse.Code"));
		batchQueryCreateAccountTraceResponse.setMessage(_ctx.stringValue("BatchQueryCreateAccountTraceResponse.Message"));
		batchQueryCreateAccountTraceResponse.setSuccess(_ctx.booleanValue("BatchQueryCreateAccountTraceResponse.Success"));

		List<Trace> traces = new ArrayList<Trace>();
		for (int i = 0; i < _ctx.lengthValue("BatchQueryCreateAccountTraceResponse.Traces.Length"); i++) {
			Trace trace = new Trace();
			trace.setStatus(_ctx.stringValue("BatchQueryCreateAccountTraceResponse.Traces["+ i +"].Status"));
			trace.setTraceNo(_ctx.stringValue("BatchQueryCreateAccountTraceResponse.Traces["+ i +"].TraceNo"));
			trace.setPk(_ctx.stringValue("BatchQueryCreateAccountTraceResponse.Traces["+ i +"].Pk"));
			trace.setNowLoginEmail(_ctx.stringValue("BatchQueryCreateAccountTraceResponse.Traces["+ i +"].NowLoginEmail"));

			traces.add(trace);
		}
		batchQueryCreateAccountTraceResponse.setTraces(traces);
	 
	 	return batchQueryCreateAccountTraceResponse;
	}
}