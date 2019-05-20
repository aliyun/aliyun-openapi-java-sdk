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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyBatchJobsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyBatchJobsResponse.JobGroup;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyBatchJobsResponse.JobGroup.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyBatchJobsResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBatchJobsResponseUnmarshaller {

	public static ModifyBatchJobsResponse unmarshall(ModifyBatchJobsResponse modifyBatchJobsResponse, UnmarshallerContext context) {
		
		modifyBatchJobsResponse.setRequestId(context.stringValue("ModifyBatchJobsResponse.RequestId"));
		modifyBatchJobsResponse.setSuccess(context.booleanValue("ModifyBatchJobsResponse.Success"));
		modifyBatchJobsResponse.setCode(context.stringValue("ModifyBatchJobsResponse.Code"));
		modifyBatchJobsResponse.setMessage(context.stringValue("ModifyBatchJobsResponse.Message"));
		modifyBatchJobsResponse.setHttpStatusCode(context.integerValue("ModifyBatchJobsResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(context.stringValue("ModifyBatchJobsResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(context.stringValue("ModifyBatchJobsResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(context.stringValue("ModifyBatchJobsResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(context.stringValue("ModifyBatchJobsResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(context.stringValue("ModifyBatchJobsResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(context.longValue("ModifyBatchJobsResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyBatchJobsResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("ModifyBatchJobsResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(context.longValue("ModifyBatchJobsResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("ModifyBatchJobsResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("ModifyBatchJobsResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("ModifyBatchJobsResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("ModifyBatchJobsResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyBatchJobsResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("ModifyBatchJobsResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("ModifyBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		modifyBatchJobsResponse.setJobGroup(jobGroup);
	 
	 	return modifyBatchJobsResponse;
	}
}