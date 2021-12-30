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

import com.aliyuncs.ccc.model.v20170705.ListScenariosResponse;
import com.aliyuncs.ccc.model.v20170705.ListScenariosResponse.Scenario;
import com.aliyuncs.ccc.model.v20170705.ListScenariosResponse.Scenario.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ListScenariosResponse.Scenario.Strategy;
import com.aliyuncs.ccc.model.v20170705.ListScenariosResponse.Scenario.Strategy.TimeFrame;
import com.aliyuncs.ccc.model.v20170705.ListScenariosResponse.Scenario.Survey;
import com.aliyuncs.ccc.model.v20170705.ListScenariosResponse.Scenario.Survey.IntentNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenariosResponseUnmarshaller {

	public static ListScenariosResponse unmarshall(ListScenariosResponse listScenariosResponse, UnmarshallerContext _ctx) {
		
		listScenariosResponse.setRequestId(_ctx.stringValue("ListScenariosResponse.RequestId"));
		listScenariosResponse.setSuccess(_ctx.booleanValue("ListScenariosResponse.Success"));
		listScenariosResponse.setCode(_ctx.stringValue("ListScenariosResponse.Code"));
		listScenariosResponse.setMessage(_ctx.stringValue("ListScenariosResponse.Message"));
		listScenariosResponse.setHttpStatusCode(_ctx.integerValue("ListScenariosResponse.HttpStatusCode"));

		List<Scenario> scenarios = new ArrayList<Scenario>();
		for (int i = 0; i < _ctx.lengthValue("ListScenariosResponse.Scenarios.Length"); i++) {
			Scenario scenario = new Scenario();
			scenario.setId(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Id"));
			scenario.setName(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Name"));
			scenario.setDescription(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Description"));
			scenario.setType(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Type"));
			scenario.setIsTemplate(_ctx.booleanValue("ListScenariosResponse.Scenarios["+ i +"].IsTemplate"));

			Strategy strategy = new Strategy();
			strategy.setId(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.Id"));
			strategy.setName(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.Name"));
			strategy.setDescription(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.Description"));
			strategy.setType(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.Type"));
			strategy.setStartTime(_ctx.longValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(_ctx.longValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.EndTime"));
			strategy.setRepeatBy(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.RepeatBy"));
			strategy.setMaxAttemptsPerDay(_ctx.integerValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(_ctx.integerValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.MinAttemptInterval"));
			strategy.setCustomized(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.Customized"));
			strategy.setRoutingStrategy(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.RoutingStrategy"));
			strategy.setFollowUpStrategy(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.FollowUpStrategy"));
			strategy.setIsTemplate(_ctx.booleanValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.IsTemplate"));

			List<String> repeatDays = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.RepeatDays.Length"); j++) {
				repeatDays.add(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.RepeatDays["+ j +"]"));
			}
			strategy.setRepeatDays(repeatDays);

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < _ctx.lengthValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Strategy.WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);
			scenario.setStrategy(strategy);

			List<Survey> surveys = new ArrayList<Survey>();
			for (int j = 0; j < _ctx.lengthValue("ListScenariosResponse.Scenarios["+ i +"].Surveys.Length"); j++) {
				Survey survey = new Survey();
				survey.setId(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Id"));
				survey.setName(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Name"));
				survey.setDescription(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Description"));
				survey.setRole(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Role"));
				survey.setRound(_ctx.integerValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Round"));
				survey.setBeebotId(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].BeebotId"));

				List<IntentNode> intents = new ArrayList<IntentNode>();
				for (int k = 0; k < _ctx.lengthValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Intents.Length"); k++) {
					IntentNode intentNode = new IntentNode();
					intentNode.setNodeId(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Intents["+ k +"].NodeId"));
					intentNode.setIntentId(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Surveys["+ j +"].Intents["+ k +"].IntentId"));

					intents.add(intentNode);
				}
				survey.setIntents(intents);

				surveys.add(survey);
			}
			scenario.setSurveys(surveys);

			List<KeyValuePair> variables = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListScenariosResponse.Scenarios["+ i +"].Variables.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Variables["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListScenariosResponse.Scenarios["+ i +"].Variables["+ j +"].Value"));

				variables.add(keyValuePair);
			}
			scenario.setVariables(variables);

			scenarios.add(scenario);
		}
		listScenariosResponse.setScenarios(scenarios);
	 
	 	return listScenariosResponse;
	}
}