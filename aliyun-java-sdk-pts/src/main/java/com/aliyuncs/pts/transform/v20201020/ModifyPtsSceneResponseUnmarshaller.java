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

import com.aliyuncs.pts.model.v20201020.ModifyPtsSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPtsSceneResponseUnmarshaller {

	public static ModifyPtsSceneResponse unmarshall(ModifyPtsSceneResponse modifyPtsSceneResponse, UnmarshallerContext _ctx) {
		
		modifyPtsSceneResponse.setRequestId(_ctx.stringValue("ModifyPtsSceneResponse.RequestId"));
		modifyPtsSceneResponse.setSuccess(_ctx.booleanValue("ModifyPtsSceneResponse.Success"));
		modifyPtsSceneResponse.setCode(_ctx.stringValue("ModifyPtsSceneResponse.Code"));
		modifyPtsSceneResponse.setMessage(_ctx.stringValue("ModifyPtsSceneResponse.Message"));
		modifyPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("ModifyPtsSceneResponse.HttpStatusCode"));
	 
	 	return modifyPtsSceneResponse;
	}
}