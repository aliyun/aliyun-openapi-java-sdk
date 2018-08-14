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

import com.aliyuncs.ccc.model.v20170705.ModifyScenarioResponse;
import com.aliyuncs.ccc.model.v20170705.ModifyScenarioResponse.Scenario;
import com.aliyuncs.ccc.model.v20170705.ModifyScenarioResponse.Scenario.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ModifyScenarioResponse.Scenario.Strategy;
import com.aliyuncs.ccc.model.v20170705.ModifyScenarioResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.ccc.model.v20170705.ModifyScenarioResponse.Scenario.Survey;
import com.aliyuncs.ccc.model.v20170705.ModifyScenarioResponse.Scenario.Survey.IntentNode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyScenarioResponseUnmarshaller {

	public static ModifyScenarioResponse unmarshall(ModifyScenarioResponse modifyScenarioResponse, UnmarshallerContext context) {
		
		modifyScenarioResponse.setRequestId(context.stringValue("ModifyScenarioResponse.RequestId"));
		modifyScenarioResponse.setSuccess(context.booleanValue("ModifyScenarioResponse.Success"));
		modifyScenarioResponse.setCode(context.stringValue("ModifyScenarioResponse.Code"));
		modifyScenarioResponse.setMessage(context.stringValue("ModifyScenarioResponse.Message"));
		modifyScenarioResponse.setHttpStatusCode(context.integerValue("ModifyScenarioResponse.HttpStatusCode"));

		Scenario scenario = new Scenario();
		scenario.setScenarioId(context.stringValue("ModifyScenarioResponse.Scenario.ScenarioId"));
		scenario.setScenarioName(context.stringValue("ModifyScenarioResponse.Scenario.ScenarioName"));
		scenario.setScenarioDescription(context.stringValue("ModifyScenarioResponse.Scenario.ScenarioDescription"));
		scenario.setType(context.stringValue("ModifyScenarioResponse.Scenario.Type"));
		scenario.setIsTemplate(context.booleanValue("ModifyScenarioResponse.Scenario.IsTemplate"));

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.Type"));
		strategy.setStartTime(context.longValue("ModifyScenarioResponse.Scenario.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("ModifyScenarioResponse.Scenario.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("ModifyScenarioResponse.Scenario.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("ModifyScenarioResponse.Scenario.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("ModifyScenarioResponse.Scenario.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyScenarioResponse.Scenario.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("ModifyScenarioResponse.Scenario.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("ModifyScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		scenario.setStrategy(strategy);

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < context.lengthValue("ModifyScenarioResponse.Scenario.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setSurveyId(context.stringValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].SurveyId"));
			survey.setSurveyName(context.stringValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].SurveyName"));
			survey.setSurveyDescription(context.stringValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].SurveyDescription"));
			survey.setRole(context.stringValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].Role"));
			survey.setRound(context.integerValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].Round"));
			survey.setBeebotId(context.stringValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].BeebotId"));

			List<IntentNode> intents = new ArrayList<IntentNode>();
			for (int j = 0; j < context.lengthValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].Intents.Length"); j++) {
				IntentNode intentNode = new IntentNode();
				intentNode.setNodeId(context.stringValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].NodeId"));
				intentNode.setIntentId(context.stringValue("ModifyScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].IntentId"));

				intents.add(intentNode);
			}
			survey.setIntents(intents);

			surveys.add(survey);
		}
		scenario.setSurveys(surveys);

		List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("ModifyScenarioResponse.Scenario.Variables.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("ModifyScenarioResponse.Scenario.Variables["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("ModifyScenarioResponse.Scenario.Variables["+ i +"].Value"));

			variables.add(keyValuePair);
		}
		scenario.setVariables(variables);
		modifyScenarioResponse.setScenario(scenario);
	 
	 	return modifyScenarioResponse;
	}
}