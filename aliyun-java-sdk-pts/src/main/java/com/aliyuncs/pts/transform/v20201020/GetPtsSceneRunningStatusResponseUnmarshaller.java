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

import com.aliyuncs.pts.model.v20201020.GetPtsSceneRunningStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPtsSceneRunningStatusResponseUnmarshaller {

	public static GetPtsSceneRunningStatusResponse unmarshall(GetPtsSceneRunningStatusResponse getPtsSceneRunningStatusResponse, UnmarshallerContext _ctx) {
		
		getPtsSceneRunningStatusResponse.setRequestId(_ctx.stringValue("GetPtsSceneRunningStatusResponse.RequestId"));
		getPtsSceneRunningStatusResponse.setSuccess(_ctx.booleanValue("GetPtsSceneRunningStatusResponse.Success"));
		getPtsSceneRunningStatusResponse.setCode(_ctx.stringValue("GetPtsSceneRunningStatusResponse.Code"));
		getPtsSceneRunningStatusResponse.setMessage(_ctx.stringValue("GetPtsSceneRunningStatusResponse.Message"));
		getPtsSceneRunningStatusResponse.setHttpStatusCode(_ctx.integerValue("GetPtsSceneRunningStatusResponse.HttpStatusCode"));
		getPtsSceneRunningStatusResponse.setSceneName(_ctx.stringValue("GetPtsSceneRunningStatusResponse.SceneName"));
		getPtsSceneRunningStatusResponse.setStatus(_ctx.stringValue("GetPtsSceneRunningStatusResponse.Status"));
		getPtsSceneRunningStatusResponse.setCreateTime(_ctx.stringValue("GetPtsSceneRunningStatusResponse.CreateTime"));
		getPtsSceneRunningStatusResponse.setModifiedTime(_ctx.stringValue("GetPtsSceneRunningStatusResponse.ModifiedTime"));
	 
	 	return getPtsSceneRunningStatusResponse;
	}
}