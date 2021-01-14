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

import com.aliyuncs.pts.model.v20201020.StartPtsSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartPtsSceneResponseUnmarshaller {

	public static StartPtsSceneResponse unmarshall(StartPtsSceneResponse startPtsSceneResponse, UnmarshallerContext _ctx) {
		
		startPtsSceneResponse.setRequestId(_ctx.stringValue("StartPtsSceneResponse.RequestId"));
		startPtsSceneResponse.setSuccess(_ctx.booleanValue("StartPtsSceneResponse.Success"));
		startPtsSceneResponse.setCode(_ctx.stringValue("StartPtsSceneResponse.Code"));
		startPtsSceneResponse.setMessage(_ctx.stringValue("StartPtsSceneResponse.Message"));
		startPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("StartPtsSceneResponse.HttpStatusCode"));
		startPtsSceneResponse.setPlanId(_ctx.stringValue("StartPtsSceneResponse.PlanId"));
	 
	 	return startPtsSceneResponse;
	}
}