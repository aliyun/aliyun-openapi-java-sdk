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

import com.aliyuncs.pts.model.v20201020.UpdatePtsSceneBaseLineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePtsSceneBaseLineResponseUnmarshaller {

	public static UpdatePtsSceneBaseLineResponse unmarshall(UpdatePtsSceneBaseLineResponse updatePtsSceneBaseLineResponse, UnmarshallerContext _ctx) {
		
		updatePtsSceneBaseLineResponse.setRequestId(_ctx.stringValue("UpdatePtsSceneBaseLineResponse.RequestId"));
		updatePtsSceneBaseLineResponse.setMessage(_ctx.stringValue("UpdatePtsSceneBaseLineResponse.Message"));
		updatePtsSceneBaseLineResponse.setHttpStatusCode(_ctx.integerValue("UpdatePtsSceneBaseLineResponse.HttpStatusCode"));
		updatePtsSceneBaseLineResponse.setCode(_ctx.stringValue("UpdatePtsSceneBaseLineResponse.Code"));
		updatePtsSceneBaseLineResponse.setSuccess(_ctx.booleanValue("UpdatePtsSceneBaseLineResponse.Success"));
	 
	 	return updatePtsSceneBaseLineResponse;
	}
}