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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobGroupResponseUnmarshaller {

	public static CreateJobGroupResponse unmarshall(CreateJobGroupResponse createJobGroupResponse, UnmarshallerContext _ctx) {
		
		createJobGroupResponse.setRequestId(_ctx.stringValue("CreateJobGroupResponse.RequestId"));
		createJobGroupResponse.setSuccess(_ctx.booleanValue("CreateJobGroupResponse.Success"));
		createJobGroupResponse.setCode(_ctx.stringValue("CreateJobGroupResponse.Code"));
		createJobGroupResponse.setMessage(_ctx.stringValue("CreateJobGroupResponse.Message"));
		createJobGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("CreateJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("CreateJobGroupResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		createJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return createJobGroupResponse;
	}
}