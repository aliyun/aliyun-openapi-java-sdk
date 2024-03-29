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

import com.aliyuncs.opensearch.model.v20171225.UpdateABTestExperimentResponse;
import com.aliyuncs.opensearch.model.v20171225.UpdateABTestExperimentResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateABTestExperimentResponseUnmarshaller {

	public static UpdateABTestExperimentResponse unmarshall(UpdateABTestExperimentResponse updateABTestExperimentResponse, UnmarshallerContext _ctx) {
		
		updateABTestExperimentResponse.setRequestId(_ctx.stringValue("UpdateABTestExperimentResponse.requestId"));

		Result result = new Result();
		result.setCreated(_ctx.integerValue("UpdateABTestExperimentResponse.result.created"));
		result.setParams(_ctx.mapValue("UpdateABTestExperimentResponse.result.params"));
		result.setTraffic(_ctx.integerValue("UpdateABTestExperimentResponse.result.traffic"));
		result.setOnline(_ctx.booleanValue("UpdateABTestExperimentResponse.result.online"));
		result.setName(_ctx.stringValue("UpdateABTestExperimentResponse.result.name"));
		result.setUpdated(_ctx.integerValue("UpdateABTestExperimentResponse.result.updated"));
		result.setId(_ctx.stringValue("UpdateABTestExperimentResponse.result.id"));
		updateABTestExperimentResponse.setResult(result);
	 
	 	return updateABTestExperimentResponse;
	}
}