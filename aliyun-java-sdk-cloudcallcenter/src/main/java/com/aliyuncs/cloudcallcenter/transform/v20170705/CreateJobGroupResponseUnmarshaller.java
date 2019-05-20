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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateJobGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateJobGroupResponse.JobGroup;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobGroupResponseUnmarshaller {

	public static CreateJobGroupResponse unmarshall(CreateJobGroupResponse createJobGroupResponse, UnmarshallerContext context) {
		
		createJobGroupResponse.setRequestId(context.stringValue("CreateJobGroupResponse.RequestId"));
		createJobGroupResponse.setSuccess(context.booleanValue("CreateJobGroupResponse.Success"));
		createJobGroupResponse.setCode(context.stringValue("CreateJobGroupResponse.Code"));
		createJobGroupResponse.setMessage(context.stringValue("CreateJobGroupResponse.Message"));
		createJobGroupResponse.setHttpStatusCode(context.integerValue("CreateJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(context.stringValue("CreateJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(context.stringValue("CreateJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(context.stringValue("CreateJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(context.stringValue("CreateJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(context.stringValue("CreateJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(context.longValue("CreateJobGroupResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("CreateJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(context.longValue("CreateJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("CreateJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("CreateJobGroupResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		createJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return createJobGroupResponse;
	}
}