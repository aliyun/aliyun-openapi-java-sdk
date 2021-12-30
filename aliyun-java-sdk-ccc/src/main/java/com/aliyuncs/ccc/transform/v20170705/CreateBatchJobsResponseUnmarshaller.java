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
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBatchJobsResponseUnmarshaller {

	public static CreateBatchJobsResponse unmarshall(CreateBatchJobsResponse createBatchJobsResponse, UnmarshallerContext _ctx) {
		
		createBatchJobsResponse.setRequestId(_ctx.stringValue("CreateBatchJobsResponse.RequestId"));
		createBatchJobsResponse.setSuccess(_ctx.booleanValue("CreateBatchJobsResponse.Success"));
		createBatchJobsResponse.setCode(_ctx.stringValue("CreateBatchJobsResponse.Code"));
		createBatchJobsResponse.setMessage(_ctx.stringValue("CreateBatchJobsResponse.Message"));
		createBatchJobsResponse.setHttpStatusCode(_ctx.integerValue("CreateBatchJobsResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(_ctx.longValue("CreateBatchJobsResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateBatchJobsResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("CreateBatchJobsResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("CreateBatchJobsResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("CreateBatchJobsResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("CreateBatchJobsResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("CreateBatchJobsResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateBatchJobsResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("CreateBatchJobsResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("CreateBatchJobsResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		createBatchJobsResponse.setJobGroup(jobGroup);
	 
	 	return createBatchJobsResponse;
	}
}