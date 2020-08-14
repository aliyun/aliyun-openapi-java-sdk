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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teambition_aliyun.model.v20200226.ListScenarioFieldConfigResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.ListScenarioFieldConfigResponse.ScenarioFieldConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenarioFieldConfigResponseUnmarshaller {

	public static ListScenarioFieldConfigResponse unmarshall(ListScenarioFieldConfigResponse listScenarioFieldConfigResponse, UnmarshallerContext _ctx) {
		
		listScenarioFieldConfigResponse.setRequestId(_ctx.stringValue("ListScenarioFieldConfigResponse.RequestId"));
		listScenarioFieldConfigResponse.setSuccessful(_ctx.booleanValue("ListScenarioFieldConfigResponse.Successful"));
		listScenarioFieldConfigResponse.setErrorCode(_ctx.stringValue("ListScenarioFieldConfigResponse.ErrorCode"));
		listScenarioFieldConfigResponse.setErrorMsg(_ctx.stringValue("ListScenarioFieldConfigResponse.ErrorMsg"));

		List<ScenarioFieldConfig> object = new ArrayList<ScenarioFieldConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListScenarioFieldConfigResponse.Object.Length"); i++) {
			ScenarioFieldConfig scenarioFieldConfig = new ScenarioFieldConfig();
			scenarioFieldConfig.setId(_ctx.stringValue("ListScenarioFieldConfigResponse.Object["+ i +"].Id"));
			scenarioFieldConfig.setType(_ctx.stringValue("ListScenarioFieldConfigResponse.Object["+ i +"].Type"));

			object.add(scenarioFieldConfig);
		}
		listScenarioFieldConfigResponse.setObject(object);
	 
	 	return listScenarioFieldConfigResponse;
	}
}