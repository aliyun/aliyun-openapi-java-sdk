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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse;
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario;
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario.Survey;
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario.Survey.Flow;
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario.Survey.IntentNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenarioTemplatesResponseUnmarshaller {

	public static ListScenarioTemplatesResponse unmarshall(ListScenarioTemplatesResponse listScenarioTemplatesResponse, UnmarshallerContext _ctx) {
		
		listScenarioTemplatesResponse.setRequestId(_ctx.stringValue("ListScenarioTemplatesResponse.RequestId"));
		listScenarioTemplatesResponse.setSuccess(_ctx.booleanValue("ListScenarioTemplatesResponse.Success"));
		listScenarioTemplatesResponse.setCode(_ctx.stringValue("ListScenarioTemplatesResponse.Code"));
		listScenarioTemplatesResponse.setMessage(_ctx.stringValue("ListScenarioTemplatesResponse.Message"));
		listScenarioTemplatesResponse.setHttpStatusCode(_ctx.integerValue("ListScenarioTemplatesResponse.HttpStatusCode"));

		List<Scenario> scenarioTemplates = new ArrayList<Scenario>();
		for (int i = 0; i < _ctx.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates.Length"); i++) {
			Scenario scenario = new Scenario();
			scenario.setId(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Id"));
			scenario.setName(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Name"));
			scenario.setDescription(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Description"));
			scenario.setType(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Type"));
			scenario.setIsTemplate(_ctx.booleanValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].IsTemplate"));

			List<Survey> surveys = new ArrayList<Survey>();
			for (int j = 0; j < _ctx.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys.Length"); j++) {
				Survey survey = new Survey();
				survey.setId(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Id"));
				survey.setName(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Name"));
				survey.setDescription(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Description"));
				survey.setRole(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Role"));
				survey.setRound(_ctx.integerValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Round"));
				survey.setBeebotId(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].BeebotId"));
				survey.setGlobalQuestions(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].GlobalQuestions"));

				Flow flow = new Flow();
				flow.setFlowId(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Flow.FlowId"));
				flow.setIsPublished(_ctx.booleanValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Flow.IsPublished"));
				flow.setFlowJson(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Flow.FlowJson"));
				survey.setFlow(flow);

				List<IntentNode> intents = new ArrayList<IntentNode>();
				for (int k = 0; k < _ctx.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Intents.Length"); k++) {
					IntentNode intentNode = new IntentNode();
					intentNode.setNodeId(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Intents["+ k +"].NodeId"));
					intentNode.setIntentId(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Intents["+ k +"].IntentId"));

					intents.add(intentNode);
				}
				survey.setIntents(intents);

				surveys.add(survey);
			}
			scenario.setSurveys(surveys);

			List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Variables.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Variables["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Variables["+ j +"].Value"));

				variables.add(keyValuePair);
			}
			scenario.setVariables(variables);

			scenarioTemplates.add(scenario);
		}
		listScenarioTemplatesResponse.setScenarioTemplates(scenarioTemplates);
	 
	 	return listScenarioTemplatesResponse;
	}
}