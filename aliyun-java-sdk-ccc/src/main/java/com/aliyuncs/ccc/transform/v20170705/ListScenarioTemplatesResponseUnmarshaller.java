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

	public static ListScenarioTemplatesResponse unmarshall(ListScenarioTemplatesResponse listScenarioTemplatesResponse, UnmarshallerContext context) {
		
		listScenarioTemplatesResponse.setRequestId(context.stringValue("ListScenarioTemplatesResponse.RequestId"));
		listScenarioTemplatesResponse.setSuccess(context.booleanValue("ListScenarioTemplatesResponse.Success"));
		listScenarioTemplatesResponse.setCode(context.stringValue("ListScenarioTemplatesResponse.Code"));
		listScenarioTemplatesResponse.setMessage(context.stringValue("ListScenarioTemplatesResponse.Message"));
		listScenarioTemplatesResponse.setHttpStatusCode(context.integerValue("ListScenarioTemplatesResponse.HttpStatusCode"));

		List<Scenario> scenarioTemplates = new ArrayList<Scenario>();
		for (int i = 0; i < context.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates.Length"); i++) {
			Scenario scenario = new Scenario();
			scenario.setId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Id"));
			scenario.setName(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Name"));
			scenario.setDescription(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Description"));
			scenario.setType(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Type"));
			scenario.setIsTemplate(context.booleanValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].IsTemplate"));

			List<Survey> surveys = new ArrayList<Survey>();
			for (int j = 0; j < context.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys.Length"); j++) {
				Survey survey = new Survey();
				survey.setId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Id"));
				survey.setName(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Name"));
				survey.setDescription(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Description"));
				survey.setRole(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Role"));
				survey.setRound(context.integerValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Round"));
				survey.setBeebotId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].BeebotId"));
				survey.setGlobalQuestions(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].GlobalQuestions"));

				Flow flow = new Flow();
				flow.setFlowId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Flow.FlowId"));
				flow.setIsPublished(context.booleanValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Flow.IsPublished"));
				flow.setFlowJson(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Flow.FlowJson"));
				survey.setFlow(flow);

				List<IntentNode> intents = new ArrayList<IntentNode>();
				for (int k = 0; k < context.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Intents.Length"); k++) {
					IntentNode intentNode = new IntentNode();
					intentNode.setNodeId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Intents["+ k +"].NodeId"));
					intentNode.setIntentId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Intents["+ k +"].IntentId"));

					intents.add(intentNode);
				}
				survey.setIntents(intents);

				surveys.add(survey);
			}
			scenario.setSurveys(surveys);

			List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
			for (int j = 0; j < context.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Variables.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Variables["+ j +"].Key"));
				keyValuePair.setValue(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Variables["+ j +"].Value"));

				variables.add(keyValuePair);
			}
			scenario.setVariables(variables);

			scenarioTemplates.add(scenario);
		}
		listScenarioTemplatesResponse.setScenarioTemplates(scenarioTemplates);
	 
	 	return listScenarioTemplatesResponse;
	}
}