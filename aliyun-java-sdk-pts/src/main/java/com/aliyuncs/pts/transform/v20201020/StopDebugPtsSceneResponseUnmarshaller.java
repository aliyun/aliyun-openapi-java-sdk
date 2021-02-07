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

import com.aliyuncs.pts.model.v20201020.StopDebugPtsSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopDebugPtsSceneResponseUnmarshaller {

	public static StopDebugPtsSceneResponse unmarshall(StopDebugPtsSceneResponse stopDebugPtsSceneResponse, UnmarshallerContext _ctx) {
		
		stopDebugPtsSceneResponse.setRequestId(_ctx.stringValue("StopDebugPtsSceneResponse.RequestId"));
		stopDebugPtsSceneResponse.setCode(_ctx.stringValue("StopDebugPtsSceneResponse.Code"));
		stopDebugPtsSceneResponse.setMessage(_ctx.stringValue("StopDebugPtsSceneResponse.Message"));
		stopDebugPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("StopDebugPtsSceneResponse.HttpStatusCode"));
		stopDebugPtsSceneResponse.setSuccess(_ctx.booleanValue("StopDebugPtsSceneResponse.Success"));
	 
	 	return stopDebugPtsSceneResponse;
	}
}