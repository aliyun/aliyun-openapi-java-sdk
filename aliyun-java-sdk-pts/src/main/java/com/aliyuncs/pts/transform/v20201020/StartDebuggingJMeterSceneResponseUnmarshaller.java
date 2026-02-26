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

package com.aliyuncs.pts.transform.v20201020;

import com.aliyuncs.pts.model.v20201020.StartDebuggingJMeterSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartDebuggingJMeterSceneResponseUnmarshaller {

	public static StartDebuggingJMeterSceneResponse unmarshall(StartDebuggingJMeterSceneResponse startDebuggingJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		startDebuggingJMeterSceneResponse.setRequestId(_ctx.stringValue("StartDebuggingJMeterSceneResponse.RequestId"));
		startDebuggingJMeterSceneResponse.setMessage(_ctx.stringValue("StartDebuggingJMeterSceneResponse.Message"));
		startDebuggingJMeterSceneResponse.setReportId(_ctx.stringValue("StartDebuggingJMeterSceneResponse.ReportId"));
		startDebuggingJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("StartDebuggingJMeterSceneResponse.HttpStatusCode"));
		startDebuggingJMeterSceneResponse.setCode(_ctx.stringValue("StartDebuggingJMeterSceneResponse.Code"));
		startDebuggingJMeterSceneResponse.setSuccess(_ctx.booleanValue("StartDebuggingJMeterSceneResponse.Success"));
	 
	 	return startDebuggingJMeterSceneResponse;
	}
}