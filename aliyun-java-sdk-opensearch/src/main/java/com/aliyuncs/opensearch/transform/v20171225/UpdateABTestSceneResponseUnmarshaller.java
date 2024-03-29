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

import com.aliyuncs.opensearch.model.v20171225.UpdateABTestSceneResponse;
import com.aliyuncs.opensearch.model.v20171225.UpdateABTestSceneResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateABTestSceneResponseUnmarshaller {

	public static UpdateABTestSceneResponse unmarshall(UpdateABTestSceneResponse updateABTestSceneResponse, UnmarshallerContext _ctx) {
		
		updateABTestSceneResponse.setRequestId(_ctx.stringValue("UpdateABTestSceneResponse.requestId"));

		Result result = new Result();
		result.setCreated(_ctx.integerValue("UpdateABTestSceneResponse.result.created"));
		result.setParams(_ctx.mapValue("UpdateABTestSceneResponse.result.params"));
		result.setTraffic(_ctx.integerValue("UpdateABTestSceneResponse.result.traffic"));
		result.setOnline(_ctx.booleanValue("UpdateABTestSceneResponse.result.online"));
		result.setName(_ctx.stringValue("UpdateABTestSceneResponse.result.name"));
		result.setUpdated(_ctx.integerValue("UpdateABTestSceneResponse.result.updated"));
		result.setId(_ctx.stringValue("UpdateABTestSceneResponse.result.id"));
		updateABTestSceneResponse.setResult(result);
	 
	 	return updateABTestSceneResponse;
	}
}