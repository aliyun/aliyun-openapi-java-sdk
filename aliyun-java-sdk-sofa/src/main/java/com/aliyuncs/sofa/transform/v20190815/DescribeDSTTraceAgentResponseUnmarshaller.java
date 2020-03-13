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

import com.aliyuncs.sofa.model.v20190815.DescribeDSTTraceAgentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDSTTraceAgentResponseUnmarshaller {

	public static DescribeDSTTraceAgentResponse unmarshall(DescribeDSTTraceAgentResponse describeDSTTraceAgentResponse, UnmarshallerContext _ctx) {
		
		describeDSTTraceAgentResponse.setRequestId(_ctx.stringValue("DescribeDSTTraceAgentResponse.RequestId"));
		describeDSTTraceAgentResponse.setResultCode(_ctx.stringValue("DescribeDSTTraceAgentResponse.ResultCode"));
		describeDSTTraceAgentResponse.setResultMessage(_ctx.stringValue("DescribeDSTTraceAgentResponse.ResultMessage"));
		describeDSTTraceAgentResponse.setStartStatus(_ctx.stringValue("DescribeDSTTraceAgentResponse.StartStatus"));
	 
	 	return describeDSTTraceAgentResponse;
	}
}