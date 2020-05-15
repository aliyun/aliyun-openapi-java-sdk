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

import com.aliyuncs.outboundbot.model.v20191226.CreateBatchJobsResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateBatchJobsResponse.BatchJob;
import com.aliyuncs.outboundbot.model.v20191226.CreateBatchJobsResponse.BatchJob.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.CreateBatchJobsResponse.BatchJob.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBatchJobsResponseUnmarshaller {

	public static CreateBatchJobsResponse unmarshall(CreateBatchJobsResponse createBatchJobsResponse, UnmarshallerContext _ctx) {
		
		createBatchJobsResponse.setRequestId(_ctx.stringValue("CreateBatchJobsResponse.RequestId"));
		createBatchJobsResponse.setSuccess(_ctx.booleanValue("CreateBatchJobsResponse.Success"));
		createBatchJobsResponse.setCode(_ctx.stringValue("CreateBatchJobsResponse.Code"));
		createBatchJobsResponse.setMessage(_ctx.stringValue("CreateBatchJobsResponse.Message"));
		createBatchJobsResponse.setHttpStatusCode(_ctx.integerValue("CreateBatchJobsResponse.HttpStatusCode"));

		BatchJob batchJob = new BatchJob();
		batchJob.setBatchJobId(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.BatchJobId"));
		batchJob.setJobGroupName(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.JobGroupName"));
		batchJob.setJobGroupDescription(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.JobGroupDescription"));
		batchJob.setScenarioId(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.ScenarioId"));
		batchJob.setJobFilePath(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.JobFilePath"));
		batchJob.setCreationTime(_ctx.longValue("CreateBatchJobsResponse.BatchJob.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateBatchJobsResponse.BatchJob.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.CallingNumbers["+ i +"]"));
		}
		batchJob.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.StrategyName"));
		strategy.setStrategyDescription(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.StrategyDescription"));
		strategy.setType(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("CreateBatchJobsResponse.BatchJob.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("CreateBatchJobsResponse.BatchJob.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("CreateBatchJobsResponse.BatchJob.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("CreateBatchJobsResponse.BatchJob.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("CreateBatchJobsResponse.BatchJob.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateBatchJobsResponse.BatchJob.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("CreateBatchJobsResponse.BatchJob.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("CreateBatchJobsResponse.BatchJob.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		batchJob.setStrategy(strategy);
		createBatchJobsResponse.setBatchJob(batchJob);
	 
	 	return createBatchJobsResponse;
	}
}