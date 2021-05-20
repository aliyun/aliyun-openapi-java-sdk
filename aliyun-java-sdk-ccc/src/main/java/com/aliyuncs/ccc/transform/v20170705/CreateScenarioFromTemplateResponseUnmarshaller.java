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

import com.aliyuncs.ccc.model.v20170705.CreateScenarioFromTemplateResponse;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioFromTemplateResponse.Scenario;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Strategy;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Survey;
import com.aliyuncs.ccc.model.v20170705.CreateScenarioFromTemplateResponse.Scenario.Survey.IntentNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScenarioFromTemplateResponseUnmarshaller {

	public static CreateScenarioFromTemplateResponse unmarshall(CreateScenarioFromTemplateResponse createScenarioFromTemplateResponse, UnmarshallerContext _ctx) {
		
		createScenarioFromTemplateResponse.setRequestId(_ctx.stringValue("CreateScenarioFromTemplateResponse.RequestId"));
		createScenarioFromTemplateResponse.setSuccess(_ctx.booleanValue("CreateScenarioFromTemplateResponse.Success"));
		createScenarioFromTemplateResponse.setCode(_ctx.stringValue("CreateScenarioFromTemplateResponse.Code"));
		createScenarioFromTemplateResponse.setMessage(_ctx.stringValue("CreateScenarioFromTemplateResponse.Message"));
		createScenarioFromTemplateResponse.setHttpStatusCode(_ctx.integerValue("CreateScenarioFromTemplateResponse.HttpStatusCode"));

		Scenario scenario = new Scenario();
		scenario.setScenarioId(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.ScenarioId"));
		scenario.setScenarioName(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.ScenarioName"));
		scenario.setScenarioDescription(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.ScenarioDescription"));
		scenario.setType(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Type"));
		scenario.setIsTemplate(_ctx.booleanValue("CreateScenarioFromTemplateResponse.Scenario.IsTemplate"));

		Strategy strategy = new Strategy();
		strategy.setStrategyId(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StrategyName"));
		strategy.setStrategyDescription(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StrategyDescription"));
		strategy.setType(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		scenario.setStrategy(strategy);

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < _ctx.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setSurveyId(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].SurveyId"));
			survey.setSurveyName(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].SurveyName"));
			survey.setSurveyDescription(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].SurveyDescription"));
			survey.setRole(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Role"));
			survey.setRound(_ctx.integerValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Round"));
			survey.setBeebotId(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].BeebotId"));

			List<IntentNode> intents = new ArrayList<IntentNode>();
			for (int j = 0; j < _ctx.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Intents.Length"); j++) {
				IntentNode intentNode = new IntentNode();
				intentNode.setNodeId(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].NodeId"));
				intentNode.setIntentId(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].IntentId"));

				intents.add(intentNode);
			}
			survey.setIntents(intents);

			surveys.add(survey);
		}
		scenario.setSurveys(surveys);

		List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("CreateScenarioFromTemplateResponse.Scenario.Variables.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Variables["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("CreateScenarioFromTemplateResponse.Scenario.Variables["+ i +"].Value"));

			variables.add(keyValuePair);
		}
		scenario.setVariables(variables);
		createScenarioFromTemplateResponse.setScenario(scenario);
	 
	 	return createScenarioFromTemplateResponse;
	}
}