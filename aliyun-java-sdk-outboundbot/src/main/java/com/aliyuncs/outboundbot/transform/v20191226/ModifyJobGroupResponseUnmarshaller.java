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

import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyJobGroupResponseUnmarshaller {

	public static ModifyJobGroupResponse unmarshall(ModifyJobGroupResponse modifyJobGroupResponse, UnmarshallerContext _ctx) {
		
		modifyJobGroupResponse.setRequestId(_ctx.stringValue("ModifyJobGroupResponse.RequestId"));
		modifyJobGroupResponse.setSuccess(_ctx.booleanValue("ModifyJobGroupResponse.Success"));
		modifyJobGroupResponse.setCode(_ctx.stringValue("ModifyJobGroupResponse.Code"));
		modifyJobGroupResponse.setMessage(_ctx.stringValue("ModifyJobGroupResponse.Message"));
		modifyJobGroupResponse.setHttpStatusCode(_ctx.integerValue("ModifyJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("ModifyJobGroupResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		modifyJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return modifyJobGroupResponse;
	}
}