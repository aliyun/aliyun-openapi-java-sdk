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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetScenarioResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetScenarioResponse.Scenario;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetScenarioResponse.Scenario.KeyValuePair;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetScenarioResponse.Scenario.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetScenarioResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetScenarioResponse.Scenario.Survey;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetScenarioResponse.Scenario.Survey.IntentNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScenarioResponseUnmarshaller {

	public static GetScenarioResponse unmarshall(GetScenarioResponse getScenarioResponse, UnmarshallerContext context) {
		
		getScenarioResponse.setRequestId(context.stringValue("GetScenarioResponse.RequestId"));
		getScenarioResponse.setSuccess(context.booleanValue("GetScenarioResponse.Success"));
		getScenarioResponse.setCode(context.stringValue("GetScenarioResponse.Code"));
		getScenarioResponse.setMessage(context.stringValue("GetScenarioResponse.Message"));
		getScenarioResponse.setHttpStatusCode(context.integerValue("GetScenarioResponse.HttpStatusCode"));

		Scenario scenario = new Scenario();
		scenario.setId(context.stringValue("GetScenarioResponse.Scenario.Id"));
		scenario.setName(context.stringValue("GetScenarioResponse.Scenario.Name"));
		scenario.setDescription(context.stringValue("GetScenarioResponse.Scenario.Description"));
		scenario.setType(context.stringValue("GetScenarioResponse.Scenario.Type"));
		scenario.setIsTemplate(context.booleanValue("GetScenarioResponse.Scenario.IsTemplate"));
		scenario.setBeebotVersion(context.stringValue("GetScenarioResponse.Scenario.BeebotVersion"));

		Strategy strategy = new Strategy();
		strategy.setId(context.stringValue("GetScenarioResponse.Scenario.Strategy.Id"));
		strategy.setName(context.stringValue("GetScenarioResponse.Scenario.Strategy.Name"));
		strategy.setDescription(context.stringValue("GetScenarioResponse.Scenario.Strategy.Description"));
		strategy.setType(context.stringValue("GetScenarioResponse.Scenario.Strategy.Type"));
		strategy.setStartTime(context.longValue("GetScenarioResponse.Scenario.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("GetScenarioResponse.Scenario.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("GetScenarioResponse.Scenario.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("GetScenarioResponse.Scenario.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("GetScenarioResponse.Scenario.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("GetScenarioResponse.Scenario.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("GetScenarioResponse.Scenario.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("GetScenarioResponse.Scenario.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("GetScenarioResponse.Scenario.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetScenarioResponse.Scenario.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("GetScenarioResponse.Scenario.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("GetScenarioResponse.Scenario.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("GetScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("GetScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		scenario.setStrategy(strategy);

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < context.lengthValue("GetScenarioResponse.Scenario.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setId(context.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Id"));
			survey.setName(context.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Name"));
			survey.setDescription(context.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Description"));
			survey.setRole(context.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Role"));
			survey.setRound(context.integerValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Round"));
			survey.setBeebotId(context.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].BeebotId"));

			List<IntentNode> intents = new ArrayList<IntentNode>();
			for (int j = 0; j < context.lengthValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Intents.Length"); j++) {
				IntentNode intentNode = new IntentNode();
				intentNode.setNodeId(context.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].NodeId"));
				intentNode.setIntentId(context.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].IntentId"));

				intents.add(intentNode);
			}
			survey.setIntents(intents);

			surveys.add(survey);
		}
		scenario.setSurveys(surveys);

		List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GetScenarioResponse.Scenario.Variables.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GetScenarioResponse.Scenario.Variables["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GetScenarioResponse.Scenario.Variables["+ i +"].Value"));

			variables.add(keyValuePair);
		}
		scenario.setVariables(variables);
		getScenarioResponse.setScenario(scenario);
	 
	 	return getScenarioResponse;
	}
}