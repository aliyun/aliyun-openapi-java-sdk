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

import com.aliyuncs.ccc.model.v20170705.GetScenarioResponse;
import com.aliyuncs.ccc.model.v20170705.GetScenarioResponse.Scenario;
import com.aliyuncs.ccc.model.v20170705.GetScenarioResponse.Scenario.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.GetScenarioResponse.Scenario.Strategy;
import com.aliyuncs.ccc.model.v20170705.GetScenarioResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.ccc.model.v20170705.GetScenarioResponse.Scenario.Survey;
import com.aliyuncs.ccc.model.v20170705.GetScenarioResponse.Scenario.Survey.IntentNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScenarioResponseUnmarshaller {

	public static GetScenarioResponse unmarshall(GetScenarioResponse getScenarioResponse, UnmarshallerContext _ctx) {
		
		getScenarioResponse.setRequestId(_ctx.stringValue("GetScenarioResponse.RequestId"));
		getScenarioResponse.setSuccess(_ctx.booleanValue("GetScenarioResponse.Success"));
		getScenarioResponse.setCode(_ctx.stringValue("GetScenarioResponse.Code"));
		getScenarioResponse.setMessage(_ctx.stringValue("GetScenarioResponse.Message"));
		getScenarioResponse.setHttpStatusCode(_ctx.integerValue("GetScenarioResponse.HttpStatusCode"));

		Scenario scenario = new Scenario();
		scenario.setId(_ctx.stringValue("GetScenarioResponse.Scenario.Id"));
		scenario.setName(_ctx.stringValue("GetScenarioResponse.Scenario.Name"));
		scenario.setDescription(_ctx.stringValue("GetScenarioResponse.Scenario.Description"));
		scenario.setType(_ctx.stringValue("GetScenarioResponse.Scenario.Type"));
		scenario.setIsTemplate(_ctx.booleanValue("GetScenarioResponse.Scenario.IsTemplate"));

		Strategy strategy = new Strategy();
		strategy.setId(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.Id"));
		strategy.setName(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.Name"));
		strategy.setDescription(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.Description"));
		strategy.setType(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("GetScenarioResponse.Scenario.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("GetScenarioResponse.Scenario.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("GetScenarioResponse.Scenario.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("GetScenarioResponse.Scenario.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("GetScenarioResponse.Scenario.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetScenarioResponse.Scenario.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("GetScenarioResponse.Scenario.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("GetScenarioResponse.Scenario.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		scenario.setStrategy(strategy);

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < _ctx.lengthValue("GetScenarioResponse.Scenario.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setId(_ctx.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Id"));
			survey.setName(_ctx.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Name"));
			survey.setDescription(_ctx.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Description"));
			survey.setRole(_ctx.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Role"));
			survey.setRound(_ctx.integerValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Round"));
			survey.setBeebotId(_ctx.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].BeebotId"));

			List<IntentNode> intents = new ArrayList<IntentNode>();
			for (int j = 0; j < _ctx.lengthValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Intents.Length"); j++) {
				IntentNode intentNode = new IntentNode();
				intentNode.setNodeId(_ctx.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].NodeId"));
				intentNode.setIntentId(_ctx.stringValue("GetScenarioResponse.Scenario.Surveys["+ i +"].Intents["+ j +"].IntentId"));

				intents.add(intentNode);
			}
			survey.setIntents(intents);

			surveys.add(survey);
		}
		scenario.setSurveys(surveys);

		List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GetScenarioResponse.Scenario.Variables.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("GetScenarioResponse.Scenario.Variables["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("GetScenarioResponse.Scenario.Variables["+ i +"].Value"));

			variables.add(keyValuePair);
		}
		scenario.setVariables(variables);
		getScenarioResponse.setScenario(scenario);
	 
	 	return getScenarioResponse;
	}
}