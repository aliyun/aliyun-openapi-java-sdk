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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioParameterResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioParameterResponse.ScenarioParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScenarioParameterResponseUnmarshaller {

	public static CreateScenarioParameterResponse unmarshall(CreateScenarioParameterResponse createScenarioParameterResponse, UnmarshallerContext context) {
		
		createScenarioParameterResponse.setRequestId(context.stringValue("CreateScenarioParameterResponse.RequestId"));
		createScenarioParameterResponse.setSuccess(context.booleanValue("CreateScenarioParameterResponse.Success"));
		createScenarioParameterResponse.setCode(context.stringValue("CreateScenarioParameterResponse.Code"));
		createScenarioParameterResponse.setMessage(context.stringValue("CreateScenarioParameterResponse.Message"));
		createScenarioParameterResponse.setHttpStatusCode(context.integerValue("CreateScenarioParameterResponse.HttpStatusCode"));

		List<ScenarioParameter> scenarioParameters = new ArrayList<ScenarioParameter>();
		for (int i = 0; i < context.lengthValue("CreateScenarioParameterResponse.ScenarioParameters.Length"); i++) {
			ScenarioParameter scenarioParameter = new ScenarioParameter();
			scenarioParameter.setId(context.stringValue("CreateScenarioParameterResponse.ScenarioParameters["+ i +"].Id"));
			scenarioParameter.setScenarioId(context.stringValue("CreateScenarioParameterResponse.ScenarioParameters["+ i +"].ScenarioId"));
			scenarioParameter.setName(context.stringValue("CreateScenarioParameterResponse.ScenarioParameters["+ i +"].Name"));
			scenarioParameter.setTitle(context.stringValue("CreateScenarioParameterResponse.ScenarioParameters["+ i +"].Title"));
			scenarioParameter.setDescription(context.stringValue("CreateScenarioParameterResponse.ScenarioParameters["+ i +"].Description"));
			scenarioParameter.setType(context.integerValue("CreateScenarioParameterResponse.ScenarioParameters["+ i +"].Type"));
			scenarioParameter.setDefaultValue(context.stringValue("CreateScenarioParameterResponse.ScenarioParameters["+ i +"].DefaultValue"));

			scenarioParameters.add(scenarioParameter);
		}
		createScenarioParameterResponse.setScenarioParameters(scenarioParameters);
	 
	 	return createScenarioParameterResponse;
	}
}