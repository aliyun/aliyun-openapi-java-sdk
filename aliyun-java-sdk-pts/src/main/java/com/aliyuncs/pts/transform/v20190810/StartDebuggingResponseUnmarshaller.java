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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.StartDebuggingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartDebuggingResponseUnmarshaller {

	public static StartDebuggingResponse unmarshall(StartDebuggingResponse startDebuggingResponse, UnmarshallerContext _ctx) {
		
		startDebuggingResponse.setRequestId(_ctx.stringValue("StartDebuggingResponse.RequestId"));
		startDebuggingResponse.setCode(_ctx.stringValue("StartDebuggingResponse.Code"));
		startDebuggingResponse.setMessage(_ctx.stringValue("StartDebuggingResponse.Message"));
		startDebuggingResponse.setHttpStatusCode(_ctx.integerValue("StartDebuggingResponse.HttpStatusCode"));
		startDebuggingResponse.setSuccess(_ctx.booleanValue("StartDebuggingResponse.Success"));
		startDebuggingResponse.setReportId(_ctx.stringValue("StartDebuggingResponse.ReportId"));
	 
	 	return startDebuggingResponse;
	}
}