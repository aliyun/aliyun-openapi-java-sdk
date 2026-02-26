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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListScenariosResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListScenariosResponse.Scenario;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenariosResponseUnmarshaller {

	public static ListScenariosResponse unmarshall(ListScenariosResponse listScenariosResponse, UnmarshallerContext _ctx) {
		
		listScenariosResponse.setRequestId(_ctx.stringValue("ListScenariosResponse.RequestId"));
		listScenariosResponse.setErrorCode(_ctx.stringValue("ListScenariosResponse.ErrorCode"));
		listScenariosResponse.setErrorMessage(_ctx.stringValue("ListScenariosResponse.ErrorMessage"));
		listScenariosResponse.setSuccess(_ctx.booleanValue("ListScenariosResponse.Success"));

		List<Scenario> scenarioList = new ArrayList<Scenario>();
		for (int i = 0; i < _ctx.lengthValue("ListScenariosResponse.ScenarioList.Length"); i++) {
			Scenario scenario = new Scenario();
			scenario.setId(_ctx.longValue("ListScenariosResponse.ScenarioList["+ i +"].Id"));
			scenario.setScenarioName(_ctx.stringValue("ListScenariosResponse.ScenarioList["+ i +"].ScenarioName"));
			scenario.setCreatorId(_ctx.stringValue("ListScenariosResponse.ScenarioList["+ i +"].CreatorId"));
			scenario.setDescription(_ctx.stringValue("ListScenariosResponse.ScenarioList["+ i +"].Description"));

			scenarioList.add(scenario);
		}
		listScenariosResponse.setScenarioList(scenarioList);
	 
	 	return listScenariosResponse;
	}
}