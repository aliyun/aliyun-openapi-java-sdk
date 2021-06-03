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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsScenarioFieldConfigResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsScenarioFieldConfigResponse.ScenarioFieldConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevopsScenarioFieldConfigResponseUnmarshaller {

	public static ListDevopsScenarioFieldConfigResponse unmarshall(ListDevopsScenarioFieldConfigResponse listDevopsScenarioFieldConfigResponse, UnmarshallerContext _ctx) {
		
		listDevopsScenarioFieldConfigResponse.setRequestId(_ctx.stringValue("ListDevopsScenarioFieldConfigResponse.RequestId"));
		listDevopsScenarioFieldConfigResponse.setSuccessful(_ctx.booleanValue("ListDevopsScenarioFieldConfigResponse.Successful"));
		listDevopsScenarioFieldConfigResponse.setErrorCode(_ctx.stringValue("ListDevopsScenarioFieldConfigResponse.ErrorCode"));
		listDevopsScenarioFieldConfigResponse.setErrorMsg(_ctx.stringValue("ListDevopsScenarioFieldConfigResponse.ErrorMsg"));

		List<ScenarioFieldConfig> object = new ArrayList<ScenarioFieldConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListDevopsScenarioFieldConfigResponse.Object.Length"); i++) {
			ScenarioFieldConfig scenarioFieldConfig = new ScenarioFieldConfig();
			scenarioFieldConfig.setId(_ctx.stringValue("ListDevopsScenarioFieldConfigResponse.Object["+ i +"].Id"));
			scenarioFieldConfig.setType(_ctx.stringValue("ListDevopsScenarioFieldConfigResponse.Object["+ i +"].Type"));
			scenarioFieldConfig.setName(_ctx.stringValue("ListDevopsScenarioFieldConfigResponse.Object["+ i +"].Name"));

			object.add(scenarioFieldConfig);
		}
		listDevopsScenarioFieldConfigResponse.setObject(object);
	 
	 	return listDevopsScenarioFieldConfigResponse;
	}
}