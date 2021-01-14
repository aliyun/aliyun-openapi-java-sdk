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

import com.aliyuncs.pts.model.v20201020.StopPtsSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopPtsSceneResponseUnmarshaller {

	public static StopPtsSceneResponse unmarshall(StopPtsSceneResponse stopPtsSceneResponse, UnmarshallerContext _ctx) {
		
		stopPtsSceneResponse.setRequestId(_ctx.stringValue("StopPtsSceneResponse.RequestId"));
		stopPtsSceneResponse.setMessage(_ctx.stringValue("StopPtsSceneResponse.Message"));
		stopPtsSceneResponse.setCode(_ctx.stringValue("StopPtsSceneResponse.Code"));
		stopPtsSceneResponse.setSuccess(_ctx.booleanValue("StopPtsSceneResponse.Success"));
		stopPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("StopPtsSceneResponse.HttpStatusCode"));
		stopPtsSceneResponse.setIsSuccess(_ctx.booleanValue("StopPtsSceneResponse.IsSuccess"));
	 
	 	return stopPtsSceneResponse;
	}
}