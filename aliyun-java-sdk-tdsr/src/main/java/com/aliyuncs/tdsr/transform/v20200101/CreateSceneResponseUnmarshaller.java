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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.CreateSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSceneResponseUnmarshaller {

	public static CreateSceneResponse unmarshall(CreateSceneResponse createSceneResponse, UnmarshallerContext _ctx) {
		
		createSceneResponse.setRequestId(_ctx.stringValue("CreateSceneResponse.RequestId"));
		createSceneResponse.setSceneId(_ctx.longValue("CreateSceneResponse.SceneId"));
		createSceneResponse.setSuccess(_ctx.booleanValue("CreateSceneResponse.Success"));
		createSceneResponse.setErrMessage(_ctx.stringValue("CreateSceneResponse.ErrMessage"));
	 
	 	return createSceneResponse;
	}
}