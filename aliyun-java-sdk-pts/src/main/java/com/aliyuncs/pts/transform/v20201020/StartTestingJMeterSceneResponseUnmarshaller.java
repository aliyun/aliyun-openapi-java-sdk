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

import com.aliyuncs.pts.model.v20201020.StartTestingJMeterSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartTestingJMeterSceneResponseUnmarshaller {

	public static StartTestingJMeterSceneResponse unmarshall(StartTestingJMeterSceneResponse startTestingJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		startTestingJMeterSceneResponse.setRequestId(_ctx.stringValue("StartTestingJMeterSceneResponse.RequestId"));
		startTestingJMeterSceneResponse.setMessage(_ctx.stringValue("StartTestingJMeterSceneResponse.Message"));
		startTestingJMeterSceneResponse.setReportId(_ctx.stringValue("StartTestingJMeterSceneResponse.ReportId"));
		startTestingJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("StartTestingJMeterSceneResponse.HttpStatusCode"));
		startTestingJMeterSceneResponse.setCode(_ctx.stringValue("StartTestingJMeterSceneResponse.Code"));
		startTestingJMeterSceneResponse.setSuccess(_ctx.booleanValue("StartTestingJMeterSceneResponse.Success"));
	 
	 	return startTestingJMeterSceneResponse;
	}
}