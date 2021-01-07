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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListSceneParametersResponse;
import com.aliyuncs.airec.model.v20201126.ListSceneParametersResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSceneParametersResponseUnmarshaller {

	public static ListSceneParametersResponse unmarshall(ListSceneParametersResponse listSceneParametersResponse, UnmarshallerContext _ctx) {
		
		listSceneParametersResponse.setCode(_ctx.stringValue("ListSceneParametersResponse.code"));
		listSceneParametersResponse.setMessage(_ctx.stringValue("ListSceneParametersResponse.message"));
		listSceneParametersResponse.setRequestId(_ctx.stringValue("ListSceneParametersResponse.requestId"));

		Result result = new Result();

		List<String> sceneId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListSceneParametersResponse.result.sceneId.Length"); i++) {
			sceneId.add(_ctx.stringValue("ListSceneParametersResponse.result.sceneId["+ i +"]"));
		}
		result.setSceneId(sceneId);

		List<String> traceId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListSceneParametersResponse.result.traceId.Length"); i++) {
			traceId.add(_ctx.stringValue("ListSceneParametersResponse.result.traceId["+ i +"]"));
		}
		result.setTraceId(traceId);
		listSceneParametersResponse.setResult(result);
	 
	 	return listSceneParametersResponse;
	}
}