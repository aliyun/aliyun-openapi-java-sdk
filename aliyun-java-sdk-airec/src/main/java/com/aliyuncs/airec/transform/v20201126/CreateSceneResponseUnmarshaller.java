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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.CreateSceneResponse;
import com.aliyuncs.airec.model.v20201126.CreateSceneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSceneResponseUnmarshaller {

	public static CreateSceneResponse unmarshall(CreateSceneResponse createSceneResponse, UnmarshallerContext _ctx) {
		
		createSceneResponse.setCode(_ctx.stringValue("CreateSceneResponse.code"));
		createSceneResponse.setRequestId(_ctx.stringValue("CreateSceneResponse.requestId"));
		createSceneResponse.setMessage(_ctx.stringValue("CreateSceneResponse.message"));

		Result result = new Result();
		result.setGmtModified(_ctx.stringValue("CreateSceneResponse.result.gmtModified"));
		result.setSceneId(_ctx.stringValue("CreateSceneResponse.result.sceneId"));
		result.setGmtCreate(_ctx.stringValue("CreateSceneResponse.result.gmtCreate"));
		result.setStatus(_ctx.stringValue("CreateSceneResponse.result.status"));
		createSceneResponse.setResult(result);
	 
	 	return createSceneResponse;
	}
}