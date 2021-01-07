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

import com.aliyuncs.airec.model.v20201126.ModifySceneResponse;
import com.aliyuncs.airec.model.v20201126.ModifySceneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySceneResponseUnmarshaller {

	public static ModifySceneResponse unmarshall(ModifySceneResponse modifySceneResponse, UnmarshallerContext _ctx) {
		
		modifySceneResponse.setRequestId(_ctx.stringValue("ModifySceneResponse.requestId"));
		modifySceneResponse.setCode(_ctx.stringValue("ModifySceneResponse.code"));
		modifySceneResponse.setMessage(_ctx.stringValue("ModifySceneResponse.message"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("ModifySceneResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifySceneResponse.result.gmtModified"));
		result.setSceneId(_ctx.stringValue("ModifySceneResponse.result.sceneId"));
		result.setStatus(_ctx.stringValue("ModifySceneResponse.result.status"));
		modifySceneResponse.setResult(result);
	 
	 	return modifySceneResponse;
	}
}