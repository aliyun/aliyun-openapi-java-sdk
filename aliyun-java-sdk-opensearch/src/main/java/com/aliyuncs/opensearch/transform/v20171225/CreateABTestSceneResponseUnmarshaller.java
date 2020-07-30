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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.CreateABTestSceneResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateABTestSceneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateABTestSceneResponseUnmarshaller {

	public static CreateABTestSceneResponse unmarshall(CreateABTestSceneResponse createABTestSceneResponse, UnmarshallerContext _ctx) {
		
		createABTestSceneResponse.setRequestId(_ctx.stringValue("CreateABTestSceneResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateABTestSceneResponse.result.id"));
		result.setName(_ctx.stringValue("CreateABTestSceneResponse.result.name"));
		result.setStatus(_ctx.integerValue("CreateABTestSceneResponse.result.status"));
		result.setCreated(_ctx.integerValue("CreateABTestSceneResponse.result.created"));
		result.setUpdated(_ctx.integerValue("CreateABTestSceneResponse.result.updated"));

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateABTestSceneResponse.result.values.Length"); i++) {
			values.add(_ctx.stringValue("CreateABTestSceneResponse.result.values["+ i +"]"));
		}
		result.setValues(values);
		createABTestSceneResponse.setResult(result);
	 
	 	return createABTestSceneResponse;
	}
}