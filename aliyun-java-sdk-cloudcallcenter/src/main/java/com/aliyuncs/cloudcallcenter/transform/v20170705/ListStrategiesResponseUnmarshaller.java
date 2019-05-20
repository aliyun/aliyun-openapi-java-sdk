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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListStrategiesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListStrategiesResponse.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListStrategiesResponse.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStrategiesResponseUnmarshaller {

	public static ListStrategiesResponse unmarshall(ListStrategiesResponse listStrategiesResponse, UnmarshallerContext context) {
		
		listStrategiesResponse.setRequestId(context.stringValue("ListStrategiesResponse.RequestId"));
		listStrategiesResponse.setSuccess(context.booleanValue("ListStrategiesResponse.Success"));
		listStrategiesResponse.setCode(context.stringValue("ListStrategiesResponse.Code"));
		listStrategiesResponse.setMessage(context.stringValue("ListStrategiesResponse.Message"));
		listStrategiesResponse.setHttpStatusCode(context.integerValue("ListStrategiesResponse.HttpStatusCode"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < context.lengthValue("ListStrategiesResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setStrategyId(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].StrategyId"));
			strategy.setStrategyName(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].StrategyName"));
			strategy.setStrategyDescription(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].StrategyDescription"));
			strategy.setType(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].Type"));
			strategy.setStartTime(context.longValue("ListStrategiesResponse.Strategies["+ i +"].StartTime"));
			strategy.setEndTime(context.longValue("ListStrategiesResponse.Strategies["+ i +"].EndTime"));
			strategy.setRepeatBy(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].RepeatBy"));
			strategy.setMaxAttemptsPerDay(context.integerValue("ListStrategiesResponse.Strategies["+ i +"].MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(context.integerValue("ListStrategiesResponse.Strategies["+ i +"].MinAttemptInterval"));
			strategy.setCustomized(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].Customized"));
			strategy.setRoutingStrategy(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].RoutingStrategy"));
			strategy.setFollowUpStrategy(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].FollowUpStrategy"));
			strategy.setIsTemplate(context.booleanValue("ListStrategiesResponse.Strategies["+ i +"].IsTemplate"));

			List<String> repeatDays = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListStrategiesResponse.Strategies["+ i +"].RepeatDays.Length"); j++) {
				repeatDays.add(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].RepeatDays["+ j +"]"));
			}
			strategy.setRepeatDays(repeatDays);

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < context.lengthValue("ListStrategiesResponse.Strategies["+ i +"].WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(context.stringValue("ListStrategiesResponse.Strategies["+ i +"].WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);

			strategies.add(strategy);
		}
		listStrategiesResponse.setStrategies(strategies);
	 
	 	return listStrategiesResponse;
	}
}