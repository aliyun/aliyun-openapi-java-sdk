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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyJobGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyJobGroupResponse.JobGroup;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyJobGroupResponseUnmarshaller {

	public static ModifyJobGroupResponse unmarshall(ModifyJobGroupResponse modifyJobGroupResponse, UnmarshallerContext context) {
		
		modifyJobGroupResponse.setRequestId(context.stringValue("ModifyJobGroupResponse.RequestId"));
		modifyJobGroupResponse.setSuccess(context.booleanValue("ModifyJobGroupResponse.Success"));
		modifyJobGroupResponse.setCode(context.stringValue("ModifyJobGroupResponse.Code"));
		modifyJobGroupResponse.setMessage(context.stringValue("ModifyJobGroupResponse.Message"));
		modifyJobGroupResponse.setHttpStatusCode(context.integerValue("ModifyJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(context.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(context.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(context.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(context.stringValue("ModifyJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(context.stringValue("ModifyJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(context.longValue("ModifyJobGroupResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("ModifyJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(context.longValue("ModifyJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("ModifyJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("ModifyJobGroupResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		modifyJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return modifyJobGroupResponse;
	}
}