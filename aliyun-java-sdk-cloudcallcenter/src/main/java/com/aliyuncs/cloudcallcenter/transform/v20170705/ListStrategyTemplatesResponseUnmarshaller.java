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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListStrategyTemplatesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListStrategyTemplatesResponse.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListStrategyTemplatesResponse.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStrategyTemplatesResponseUnmarshaller {

	public static ListStrategyTemplatesResponse unmarshall(ListStrategyTemplatesResponse listStrategyTemplatesResponse, UnmarshallerContext context) {
		
		listStrategyTemplatesResponse.setRequestId(context.stringValue("ListStrategyTemplatesResponse.RequestId"));
		listStrategyTemplatesResponse.setSuccess(context.booleanValue("ListStrategyTemplatesResponse.Success"));
		listStrategyTemplatesResponse.setCode(context.stringValue("ListStrategyTemplatesResponse.Code"));
		listStrategyTemplatesResponse.setMessage(context.stringValue("ListStrategyTemplatesResponse.Message"));
		listStrategyTemplatesResponse.setHttpStatusCode(context.integerValue("ListStrategyTemplatesResponse.HttpStatusCode"));

		List<Strategy> strategyTemplates = new ArrayList<Strategy>();
		for (int i = 0; i < context.lengthValue("ListStrategyTemplatesResponse.StrategyTemplates.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setStrategyId(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].StrategyId"));
			strategy.setStrategyName(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].StrategyName"));
			strategy.setStrategyDescription(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].StrategyDescription"));
			strategy.setType(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].Type"));
			strategy.setStartTime(context.longValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].StartTime"));
			strategy.setEndTime(context.longValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].EndTime"));
			strategy.setRepeatBy(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].RepeatBy"));
			strategy.setMaxAttemptsPerDay(context.integerValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(context.integerValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].MinAttemptInterval"));
			strategy.setCustomized(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].Customized"));
			strategy.setRoutingStrategy(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].RoutingStrategy"));
			strategy.setFollowUpStrategy(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].FollowUpStrategy"));
			strategy.setIsTemplate(context.booleanValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].IsTemplate"));

			List<String> repeatDays = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].RepeatDays.Length"); j++) {
				repeatDays.add(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].RepeatDays["+ j +"]"));
			}
			strategy.setRepeatDays(repeatDays);

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < context.lengthValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(context.stringValue("ListStrategyTemplatesResponse.StrategyTemplates["+ i +"].WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);

			strategyTemplates.add(strategy);
		}
		listStrategyTemplatesResponse.setStrategyTemplates(strategyTemplates);
	 
	 	return listStrategyTemplatesResponse;
	}
}