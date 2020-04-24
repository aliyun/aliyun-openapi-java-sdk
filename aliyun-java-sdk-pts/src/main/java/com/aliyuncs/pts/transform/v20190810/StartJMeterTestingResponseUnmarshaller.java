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

import com.aliyuncs.pts.model.v20190810.StartJMeterTestingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartJMeterTestingResponseUnmarshaller {

	public static StartJMeterTestingResponse unmarshall(StartJMeterTestingResponse startJMeterTestingResponse, UnmarshallerContext _ctx) {
		
		startJMeterTestingResponse.setRequestId(_ctx.stringValue("StartJMeterTestingResponse.RequestId"));
		startJMeterTestingResponse.setMessage(_ctx.stringValue("StartJMeterTestingResponse.Message"));
		startJMeterTestingResponse.setCode(_ctx.stringValue("StartJMeterTestingResponse.Code"));
		startJMeterTestingResponse.setSuccess(_ctx.booleanValue("StartJMeterTestingResponse.Success"));
		startJMeterTestingResponse.setHttpStatusCode(_ctx.integerValue("StartJMeterTestingResponse.HttpStatusCode"));
		startJMeterTestingResponse.setPlanId(_ctx.stringValue("StartJMeterTestingResponse.PlanId"));
	 
	 	return startJMeterTestingResponse;
	}
}