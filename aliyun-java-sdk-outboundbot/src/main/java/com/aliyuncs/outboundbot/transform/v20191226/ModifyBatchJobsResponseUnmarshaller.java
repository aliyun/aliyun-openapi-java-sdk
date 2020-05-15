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

import com.aliyuncs.outboundbot.model.v20191226.ModifyBatchJobsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyBatchJobsResponse.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.ModifyBatchJobsResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.ModifyBatchJobsResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBatchJobsResponseUnmarshaller {

	public static ModifyBatchJobsResponse unmarshall(ModifyBatchJobsResponse modifyBatchJobsResponse, UnmarshallerContext _ctx) {
		
		modifyBatchJobsResponse.setRequestId(_ctx.stringValue("ModifyBatchJobsResponse.RequestId"));
		modifyBatchJobsResponse.setSuccess(_ctx.booleanValue("ModifyBatchJobsResponse.Success"));
		modifyBatchJobsResponse.setCode(_ctx.stringValue("ModifyBatchJobsResponse.Code"));
		modifyBatchJobsResponse.setMessage(_ctx.stringValue("ModifyBatchJobsResponse.Message"));
		modifyBatchJobsResponse.setHttpStatusCode(_ctx.integerValue("ModifyBatchJobsResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(_ctx.longValue("ModifyBatchJobsResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyBatchJobsResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("ModifyBatchJobsResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("ModifyBatchJobsResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("ModifyBatchJobsResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("ModifyBatchJobsResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("ModifyBatchJobsResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyBatchJobsResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("ModifyBatchJobsResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		modifyBatchJobsResponse.setJobGroup(jobGroup);
	 
	 	return modifyBatchJobsResponse;
	}
}