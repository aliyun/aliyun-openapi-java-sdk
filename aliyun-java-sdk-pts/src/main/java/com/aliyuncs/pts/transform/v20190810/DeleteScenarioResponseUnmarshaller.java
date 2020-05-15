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

import com.aliyuncs.pts.model.v20190810.DeleteScenarioResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteScenarioResponseUnmarshaller {

	public static DeleteScenarioResponse unmarshall(DeleteScenarioResponse deleteScenarioResponse, UnmarshallerContext _ctx) {
		
		deleteScenarioResponse.setRequestId(_ctx.stringValue("DeleteScenarioResponse.RequestId"));
		deleteScenarioResponse.setCode(_ctx.stringValue("DeleteScenarioResponse.Code"));
		deleteScenarioResponse.setMessage(_ctx.stringValue("DeleteScenarioResponse.Message"));
		deleteScenarioResponse.setRouteResponseBody(_ctx.mapValue("DeleteScenarioResponse.RouteResponseBody"));
		deleteScenarioResponse.setSuccess(_ctx.stringValue("DeleteScenarioResponse.Success"));
	 
	 	return deleteScenarioResponse;
	}
}