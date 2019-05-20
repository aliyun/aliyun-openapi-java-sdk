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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyStrategyResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyStrategyResponse.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyStrategyResponse.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyStrategyResponseUnmarshaller {

	public static ModifyStrategyResponse unmarshall(ModifyStrategyResponse modifyStrategyResponse, UnmarshallerContext context) {
		
		modifyStrategyResponse.setRequestId(context.stringValue("ModifyStrategyResponse.RequestId"));
		modifyStrategyResponse.setSuccess(context.booleanValue("ModifyStrategyResponse.Success"));
		modifyStrategyResponse.setCode(context.stringValue("ModifyStrategyResponse.Code"));
		modifyStrategyResponse.setMessage(context.stringValue("ModifyStrategyResponse.Message"));
		modifyStrategyResponse.setHttpStatusCode(context.integerValue("ModifyStrategyResponse.HttpStatusCode"));

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("ModifyStrategyResponse.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("ModifyStrategyResponse.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("ModifyStrategyResponse.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("ModifyStrategyResponse.Strategy.Type"));
		strategy.setStartTime(context.longValue("ModifyStrategyResponse.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("ModifyStrategyResponse.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("ModifyStrategyResponse.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("ModifyStrategyResponse.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("ModifyStrategyResponse.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("ModifyStrategyResponse.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("ModifyStrategyResponse.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("ModifyStrategyResponse.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("ModifyStrategyResponse.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyStrategyResponse.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("ModifyStrategyResponse.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("ModifyStrategyResponse.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("ModifyStrategyResponse.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("ModifyStrategyResponse.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		modifyStrategyResponse.setStrategy(strategy);
	 
	 	return modifyStrategyResponse;
	}
}