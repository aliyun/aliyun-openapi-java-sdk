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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateStrategyResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateStrategyResponse.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateStrategyResponse.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStrategyResponseUnmarshaller {

	public static CreateStrategyResponse unmarshall(CreateStrategyResponse createStrategyResponse, UnmarshallerContext context) {
		
		createStrategyResponse.setRequestId(context.stringValue("CreateStrategyResponse.RequestId"));
		createStrategyResponse.setSuccess(context.booleanValue("CreateStrategyResponse.Success"));
		createStrategyResponse.setCode(context.stringValue("CreateStrategyResponse.Code"));
		createStrategyResponse.setMessage(context.stringValue("CreateStrategyResponse.Message"));
		createStrategyResponse.setHttpStatusCode(context.integerValue("CreateStrategyResponse.HttpStatusCode"));

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("CreateStrategyResponse.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("CreateStrategyResponse.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("CreateStrategyResponse.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("CreateStrategyResponse.Strategy.Type"));
		strategy.setStartTime(context.longValue("CreateStrategyResponse.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("CreateStrategyResponse.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("CreateStrategyResponse.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("CreateStrategyResponse.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("CreateStrategyResponse.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("CreateStrategyResponse.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("CreateStrategyResponse.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("CreateStrategyResponse.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("CreateStrategyResponse.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateStrategyResponse.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("CreateStrategyResponse.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("CreateStrategyResponse.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("CreateStrategyResponse.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("CreateStrategyResponse.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		createStrategyResponse.setStrategy(strategy);
	 
	 	return createStrategyResponse;
	}
}