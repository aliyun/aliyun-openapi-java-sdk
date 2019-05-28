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

import com.aliyuncs.ccc.model.v20170705.CreateScenarioResponse;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioResponse.Scenario;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioResponse.Scenario.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioResponse.Scenario.Strategy;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioResponse.Scenario.Survey;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioResponse.Scenario.Survey.IntentNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScenarioResponseUnmarshaller {

	public static CreateScenarioResponse unmarshall(CreateScenarioResponse createScenarioResponse, UnmarshallerContext context) {
		
		createScenarioResponse.setRequestId(context.stringValue("CreateScenarioResponse.RequestId"));
		createScenarioResponse.setSuccess(context.booleanValue("CreateScenarioResponse.Success"));
		createScenarioResponse.setCode(context.stringValue("CreateScenarioResponse.Code"));
		createScenarioResponse.setMessage(context.stringValue("CreateScenarioResponse.Message"));
		createScenarioResponse.setHttpStatusCode(context.integerValue("CreateScenarioResponse.HttpStatusCode"));

		Scenario scenario = new Scenario();
		scenario.setScenarioId(context.stringValue("CreateScenarioResponse.Scenario.ScenarioId"));
		scenario.setScenarioName(context.stringValue("CreateScenarioResponse.Scenario.ScenarioName"));
		scenario.setScenarioDescription(context.stringValue("CreateScenarioResponse.Scenario.ScenarioDescription"));
		scenario.setType(context.stringValue("CreateScenarioResponse.Scenario.Type"));
		scenario.setIsTemplate(context.booleanValue("CreateScenarioResponse.Scenario.IsTemplate"));

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("CreateScenarioResponse.Scenario.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("CreateScenarioResponse.Scenario.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("CreateScenarioResponse.Scenario.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("CreateScenarioResponse.Scenario.Strategy.Type"));
		strategy.setStartTime(context.longValue("CreateScenarioResponse.Scenario.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("CreateScenarioResponse.Scenario.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("CreateScenarioResponse.Scenario.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("CreateScenarioResponse.Scenario.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("CreateScenarioResponse.Scenario.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("CreateScenarioResponse.Scenario.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("CreateScenarioResponse.Scenario.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("CreateScenarioResponse.Scenario.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("CreateScenarioResponse.Scenario.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateScenarioResponse.Scenario.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("CreateScenarioResponse.Scenario.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("CreateScenarioResponse.Scenario.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("CreateScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("CreateScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		scenario.setStrategy(strategy);

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < context.lengthValue("CreateScenarioResponse.Scenario.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setSurveyId(context.stringValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].SurveyId"));
			survey.setSurveyName(context.stringValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].SurveyName"));
			survey.setSurveyDescription(context.stringValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].SurveyDescription"));
			survey.setRole(context.stringValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].Role"));
			survey.setRound(context.integerValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].Round"));
			survey.setBeebotId(context.stringValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].BeebotId"));

			List<IntentNode> intents = new ArrayList<IntentNode>();
			for (int j = 0; j < context.lengthValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].Intents.Length"); j++) {
				IntentNode intentNode = new IntentNode();
				intentNode.setNodeId(context.stringValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].NodeId"));
				intentNode.setIntentId(context.stringValue("CreateScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].IntentId"));

				intents.add(intentNode);
			}
			survey.setIntents(intents);

			surveys.add(survey);
		}
		scenario.setSurveys(surveys);

		List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("CreateScenarioResponse.Scenario.Variables.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("CreateScenarioResponse.Scenario.Variables["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("CreateScenarioResponse.Scenario.Variables["+ i +"].Value"));

			variables.add(keyValuePair);
		}
		scenario.setVariables(variables);
		createScenarioResponse.setScenario(scenario);
	 
	 	return createScenarioResponse;
	}
}