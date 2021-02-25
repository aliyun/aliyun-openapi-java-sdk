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

import com.aliyuncs.pts.model.v20201020.CreatePtsSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePtsSceneResponseUnmarshaller {

	public static CreatePtsSceneResponse unmarshall(CreatePtsSceneResponse createPtsSceneResponse, UnmarshallerContext _ctx) {
		
		createPtsSceneResponse.setRequestId(_ctx.stringValue("CreatePtsSceneResponse.RequestId"));
		createPtsSceneResponse.setSuccess(_ctx.booleanValue("CreatePtsSceneResponse.Success"));
		createPtsSceneResponse.setCode(_ctx.stringValue("CreatePtsSceneResponse.Code"));
		createPtsSceneResponse.setMessage(_ctx.stringValue("CreatePtsSceneResponse.Message"));
		createPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("CreatePtsSceneResponse.HttpStatusCode"));
		createPtsSceneResponse.setSceneId(_ctx.stringValue("CreatePtsSceneResponse.SceneId"));
	 
	 	return createPtsSceneResponse;
	}
}