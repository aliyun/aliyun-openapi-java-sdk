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

import com.aliyuncs.pts.model.v20201020.StopDebuggingJMeterSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopDebuggingJMeterSceneResponseUnmarshaller {

	public static StopDebuggingJMeterSceneResponse unmarshall(StopDebuggingJMeterSceneResponse stopDebuggingJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		stopDebuggingJMeterSceneResponse.setRequestId(_ctx.stringValue("StopDebuggingJMeterSceneResponse.RequestId"));
		stopDebuggingJMeterSceneResponse.setMessage(_ctx.stringValue("StopDebuggingJMeterSceneResponse.Message"));
		stopDebuggingJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("StopDebuggingJMeterSceneResponse.HttpStatusCode"));
		stopDebuggingJMeterSceneResponse.setCode(_ctx.stringValue("StopDebuggingJMeterSceneResponse.Code"));
		stopDebuggingJMeterSceneResponse.setSuccess(_ctx.booleanValue("StopDebuggingJMeterSceneResponse.Success"));
	 
	 	return stopDebuggingJMeterSceneResponse;
	}
}