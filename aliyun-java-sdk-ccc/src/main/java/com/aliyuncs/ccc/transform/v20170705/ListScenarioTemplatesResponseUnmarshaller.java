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
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario.Strategy;
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.ccc.model.v20170705.ListScenarioTemplatesResponse.Scenario.Survey;
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
			scenario.setScenarioId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].ScenarioId"));
			scenario.setScenarioName(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].ScenarioName"));
			scenario.setScenarioDescription(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].ScenarioDescription"));
			scenario.setType(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Type"));
			scenario.setIsTemplate(context.booleanValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].IsTemplate"));

			Strategy strategy = new Strategy();
			strategy.setStrategyId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.StrategyId"));
			strategy.setStrategyName(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.StrategyName"));
			strategy.setStrategyDescription(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.StrategyDescription"));
			strategy.setType(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.Type"));
			strategy.setStartTime(context.longValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(context.longValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.EndTime"));
			strategy.setRepeatBy(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.RepeatBy"));
			strategy.setMaxAttemptsPerDay(context.integerValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(context.integerValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.MinAttemptInterval"));
			strategy.setCustomized(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.Customized"));
			strategy.setRoutingStrategy(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.RoutingStrategy"));
			strategy.setFollowUpStrategy(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.FollowUpStrategy"));
			strategy.setIsTemplate(context.booleanValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.IsTemplate"));

			List<String> repeatDays = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.RepeatDays.Length"); j++) {
				repeatDays.add(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.RepeatDays["+ j +"]"));
			}
			strategy.setRepeatDays(repeatDays);

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < context.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Strategy.WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);
			scenario.setStrategy(strategy);

			List<Survey> surveys = new ArrayList<Survey>();
			for (int j = 0; j < context.lengthValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys.Length"); j++) {
				Survey survey = new Survey();
				survey.setSurveyId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].SurveyId"));
				survey.setSurveyName(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].SurveyName"));
				survey.setSurveyDescription(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].SurveyDescription"));
				survey.setRole(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Role"));
				survey.setRound(context.integerValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].Round"));
				survey.setBeebotId(context.stringValue("ListScenarioTemplatesResponse.ScenarioTemplates["+ i +"].Surveys["+ j +"].BeebotId"));

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