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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioFromTemplateResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioFromTemplateResponse.Scenario;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.KeyValuePair;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Survey;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Survey.IntentNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScenarioFromTemplateResponseUnmarshaller {

	public static CreateScenarioFromTemplateResponse unmarshall(CreateScenarioFromTemplateResponse createScenarioFromTemplateResponse, UnmarshallerContext context) {
		
		createScenarioFromTemplateResponse.setRequestId(context.stringValue("CreateScenarioFromTemplateResponse.RequestId"));
		createScenarioFromTemplateResponse.setSuccess(context.booleanValue("CreateScenarioFromTemplateResponse.Success"));
		createScenarioFromTemplateResponse.setCode(context.stringValue("CreateScenarioFromTemplateResponse.Code"));
		createScenarioFromTemplateResponse.setMessage(context.stringValue("CreateScenarioFromTemplateResponse.Message"));
		createScenarioFromTemplateResponse.setHttpStatusCode(context.integerValue("CreateScenarioFromTemplateResponse.HttpStatusCode"));

		Scenario scenario = new Scenario();
		scenario.setScenarioId(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.ScenarioId"));
		scenario.setScenarioName(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.ScenarioName"));
		scenario.setScenarioDescription(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.ScenarioDescription"));
		scenario.setType(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Type"));
		scenario.setIsTemplate(context.booleanValue("CreateScenarioFromTemplateResponse.Scenario.IsTemplate"));
		scenario.setBeebotVersion(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.BeebotVersion"));

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.Type"));
		strategy.setStartTime(context.longValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		scenario.setStrategy(strategy);

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < context.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setSurveyId(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].SurveyId"));
			survey.setSurveyName(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].SurveyName"));
			survey.setSurveyDescription(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].SurveyDescription"));
			survey.setRole(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Role"));
			survey.setRound(context.integerValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Round"));
			survey.setBeebotId(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].BeebotId"));

			List<IntentNode> intents = new ArrayList<IntentNode>();
			for (int j = 0; j < context.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Intents.Length"); j++) {
				IntentNode intentNode = new IntentNode();
				intentNode.setNodeId(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].NodeId"));
				intentNode.setIntentId(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].IntentId"));

				intents.add(intentNode);
			}
			survey.setIntents(intents);

			surveys.add(survey);
		}
		scenario.setSurveys(surveys);

		List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Variables.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Variables["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("CreateScenarioFromTemplateResponse.Scenario.Variables["+ i +"].Value"));

			variables.add(keyValuePair);
		}
		scenario.setVariables(variables);
		createScenarioFromTemplateResponse.setScenario(scenario);
	 
	 	return createScenarioFromTemplateResponse;
	}
}