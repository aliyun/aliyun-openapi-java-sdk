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

import com.aliyuncs.opensearch.model.v20171225.CreateABTestExperimentResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateABTestExperimentResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateABTestExperimentResponseUnmarshaller {

	public static CreateABTestExperimentResponse unmarshall(CreateABTestExperimentResponse createABTestExperimentResponse, UnmarshallerContext _ctx) {
		
		createABTestExperimentResponse.setRequestId(_ctx.stringValue("CreateABTestExperimentResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateABTestExperimentResponse.result.id"));
		result.setName(_ctx.stringValue("CreateABTestExperimentResponse.result.name"));
		result.setParams(_ctx.mapValue("CreateABTestExperimentResponse.result.params"));
		result.setCreated(_ctx.integerValue("CreateABTestExperimentResponse.result.created"));
		result.setUpdated(_ctx.integerValue("CreateABTestExperimentResponse.result.updated"));
		result.setOnline(_ctx.booleanValue("CreateABTestExperimentResponse.result.online"));
		result.setTraffic(_ctx.integerValue("CreateABTestExperimentResponse.result.traffic"));
		createABTestExperimentResponse.setResult(result);
	 
	 	return createABTestExperimentResponse;
	}
}