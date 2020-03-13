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

import com.aliyuncs.sofa.model.v20190815.DescribeDSTTraceResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTraceResponse.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDSTTraceResponseUnmarshaller {

	public static DescribeDSTTraceResponse unmarshall(DescribeDSTTraceResponse describeDSTTraceResponse, UnmarshallerContext _ctx) {
		
		describeDSTTraceResponse.setRequestId(_ctx.stringValue("DescribeDSTTraceResponse.RequestId"));
		describeDSTTraceResponse.setResultCode(_ctx.stringValue("DescribeDSTTraceResponse.ResultCode"));
		describeDSTTraceResponse.setResultMessage(_ctx.stringValue("DescribeDSTTraceResponse.ResultMessage"));

		Trace trace = new Trace();
		trace.setCollected(_ctx.booleanValue("DescribeDSTTraceResponse.Trace.Collected"));
		trace.setCollectedDescription(_ctx.stringValue("DescribeDSTTraceResponse.Trace.CollectedDescription"));
		trace.setCollectedName(_ctx.stringValue("DescribeDSTTraceResponse.Trace.CollectedName"));
		trace.setTraceId(_ctx.stringValue("DescribeDSTTraceResponse.Trace.TraceId"));
		describeDSTTraceResponse.setTrace(trace);
	 
	 	return describeDSTTraceResponse;
	}
}