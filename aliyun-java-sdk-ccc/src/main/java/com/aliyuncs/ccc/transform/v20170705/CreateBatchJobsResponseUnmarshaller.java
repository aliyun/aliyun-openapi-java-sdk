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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.CreateBatchJobsResponse;
import com.aliyuncs.ccc.model.v20170705.CreateBatchJobsResponse.JobGroup;
import com.aliyuncs.ccc.model.v20170705.CreateBatchJobsResponse.JobGroup.Strategy;
import com.aliyuncs.ccc.model.v20170705.CreateBatchJobsResponse.JobGroup.Strategy.TimeFrame;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBatchJobsResponseUnmarshaller {

	public static CreateBatchJobsResponse unmarshall(CreateBatchJobsResponse createBatchJobsResponse, UnmarshallerContext context) {
		
		createBatchJobsResponse.setRequestId(context.stringValue("CreateBatchJobsResponse.RequestId"));
		createBatchJobsResponse.setSuccess(context.booleanValue("CreateBatchJobsResponse.Success"));
		createBatchJobsResponse.setCode(context.stringValue("CreateBatchJobsResponse.Code"));
		createBatchJobsResponse.setMessage(context.stringValue("CreateBatchJobsResponse.Message"));
		createBatchJobsResponse.setHttpStatusCode(context.integerValue("CreateBatchJobsResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(context.stringValue("CreateBatchJobsResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(context.stringValue("CreateBatchJobsResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(context.stringValue("CreateBatchJobsResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(context.stringValue("CreateBatchJobsResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(context.stringValue("CreateBatchJobsResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(context.longValue("CreateBatchJobsResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateBatchJobsResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("CreateBatchJobsResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(context.longValue("CreateBatchJobsResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("CreateBatchJobsResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("CreateBatchJobsResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("CreateBatchJobsResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("CreateBatchJobsResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateBatchJobsResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("CreateBatchJobsResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		createBatchJobsResponse.setJobGroup(jobGroup);
	 
	 	return createBatchJobsResponse;
	}
}