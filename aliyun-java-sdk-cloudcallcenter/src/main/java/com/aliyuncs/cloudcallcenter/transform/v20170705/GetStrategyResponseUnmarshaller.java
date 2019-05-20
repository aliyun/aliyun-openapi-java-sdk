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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetStrategyResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetStrategyResponse.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetStrategyResponse.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStrategyResponseUnmarshaller {

	public static GetStrategyResponse unmarshall(GetStrategyResponse getStrategyResponse, UnmarshallerContext context) {
		
		getStrategyResponse.setRequestId(context.stringValue("GetStrategyResponse.RequestId"));
		getStrategyResponse.setSuccess(context.booleanValue("GetStrategyResponse.Success"));
		getStrategyResponse.setCode(context.stringValue("GetStrategyResponse.Code"));
		getStrategyResponse.setMessage(context.stringValue("GetStrategyResponse.Message"));
		getStrategyResponse.setHttpStatusCode(context.integerValue("GetStrategyResponse.HttpStatusCode"));

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("GetStrategyResponse.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("GetStrategyResponse.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("GetStrategyResponse.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("GetStrategyResponse.Strategy.Type"));
		strategy.setStartTime(context.longValue("GetStrategyResponse.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("GetStrategyResponse.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("GetStrategyResponse.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("GetStrategyResponse.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("GetStrategyResponse.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("GetStrategyResponse.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("GetStrategyResponse.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("GetStrategyResponse.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("GetStrategyResponse.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetStrategyResponse.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("GetStrategyResponse.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("GetStrategyResponse.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("GetStrategyResponse.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("GetStrategyResponse.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		getStrategyResponse.setStrategy(strategy);
	 
	 	return getStrategyResponse;
	}
}