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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListScenarioParametersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListScenarioParametersResponse.ScenarioParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenarioParametersResponseUnmarshaller {

	public static ListScenarioParametersResponse unmarshall(ListScenarioParametersResponse listScenarioParametersResponse, UnmarshallerContext context) {
		
		listScenarioParametersResponse.setRequestId(context.stringValue("ListScenarioParametersResponse.RequestId"));
		listScenarioParametersResponse.setSuccess(context.booleanValue("ListScenarioParametersResponse.Success"));
		listScenarioParametersResponse.setCode(context.stringValue("ListScenarioParametersResponse.Code"));
		listScenarioParametersResponse.setMessage(context.stringValue("ListScenarioParametersResponse.Message"));
		listScenarioParametersResponse.setHttpStatusCode(context.integerValue("ListScenarioParametersResponse.HttpStatusCode"));

		List<ScenarioParameter> scenarioParameters = new ArrayList<ScenarioParameter>();
		for (int i = 0; i < context.lengthValue("ListScenarioParametersResponse.ScenarioParameters.Length"); i++) {
			ScenarioParameter scenarioParameter = new ScenarioParameter();
			scenarioParameter.setId(context.stringValue("ListScenarioParametersResponse.ScenarioParameters["+ i +"].Id"));
			scenarioParameter.setScenarioId(context.stringValue("ListScenarioParametersResponse.ScenarioParameters["+ i +"].ScenarioId"));
			scenarioParameter.setName(context.stringValue("ListScenarioParametersResponse.ScenarioParameters["+ i +"].Name"));
			scenarioParameter.setTitle(context.stringValue("ListScenarioParametersResponse.ScenarioParameters["+ i +"].Title"));
			scenarioParameter.setDescription(context.stringValue("ListScenarioParametersResponse.ScenarioParameters["+ i +"].Description"));
			scenarioParameter.setType(context.integerValue("ListScenarioParametersResponse.ScenarioParameters["+ i +"].Type"));
			scenarioParameter.setDefaultValue(context.stringValue("ListScenarioParametersResponse.ScenarioParameters["+ i +"].DefaultValue"));

			scenarioParameters.add(scenarioParameter);
		}
		listScenarioParametersResponse.setScenarioParameters(scenarioParameters);
	 
	 	return listScenarioParametersResponse;
	}
}