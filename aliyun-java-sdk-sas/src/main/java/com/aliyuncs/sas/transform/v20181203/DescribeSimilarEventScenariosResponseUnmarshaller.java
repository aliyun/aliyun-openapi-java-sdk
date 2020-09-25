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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSimilarEventScenariosResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSimilarEventScenariosResponse.Scenario;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSimilarEventScenariosResponseUnmarshaller {

	public static DescribeSimilarEventScenariosResponse unmarshall(DescribeSimilarEventScenariosResponse describeSimilarEventScenariosResponse, UnmarshallerContext _ctx) {
		
		describeSimilarEventScenariosResponse.setRequestId(_ctx.stringValue("DescribeSimilarEventScenariosResponse.RequestId"));

		List<Scenario> scenarios = new ArrayList<Scenario>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSimilarEventScenariosResponse.Scenarios.Length"); i++) {
			Scenario scenario = new Scenario();
			scenario.setCode(_ctx.stringValue("DescribeSimilarEventScenariosResponse.Scenarios["+ i +"].Code"));

			scenarios.add(scenario);
		}
		describeSimilarEventScenariosResponse.setScenarios(scenarios);
	 
	 	return describeSimilarEventScenariosResponse;
	}
}