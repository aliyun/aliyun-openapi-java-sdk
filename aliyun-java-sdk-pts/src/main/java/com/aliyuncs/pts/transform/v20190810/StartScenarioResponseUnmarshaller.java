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

import com.aliyuncs.pts.model.v20190810.StartScenarioResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartScenarioResponseUnmarshaller {

	public static StartScenarioResponse unmarshall(StartScenarioResponse startScenarioResponse, UnmarshallerContext _ctx) {
		
		startScenarioResponse.setRequestId(_ctx.stringValue("StartScenarioResponse.RequestId"));
		startScenarioResponse.setCode(_ctx.stringValue("StartScenarioResponse.Code"));
		startScenarioResponse.setMessage(_ctx.stringValue("StartScenarioResponse.Message"));
		startScenarioResponse.setRouteResponseBody(_ctx.mapValue("StartScenarioResponse.RouteResponseBody"));
		startScenarioResponse.setSuccess(_ctx.stringValue("StartScenarioResponse.Success"));
	 
	 	return startScenarioResponse;
	}
}