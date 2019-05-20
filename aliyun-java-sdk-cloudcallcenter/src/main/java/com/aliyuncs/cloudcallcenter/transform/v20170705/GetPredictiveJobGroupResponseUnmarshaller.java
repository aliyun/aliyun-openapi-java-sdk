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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobGroupResponse.JobGroup;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Progress;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPredictiveJobGroupResponseUnmarshaller {

	public static GetPredictiveJobGroupResponse unmarshall(GetPredictiveJobGroupResponse getPredictiveJobGroupResponse, UnmarshallerContext context) {
		
		getPredictiveJobGroupResponse.setRequestId(context.stringValue("GetPredictiveJobGroupResponse.RequestId"));
		getPredictiveJobGroupResponse.setSuccess(context.booleanValue("GetPredictiveJobGroupResponse.Success"));
		getPredictiveJobGroupResponse.setCode(context.stringValue("GetPredictiveJobGroupResponse.Code"));
		getPredictiveJobGroupResponse.setMessage(context.stringValue("GetPredictiveJobGroupResponse.Message"));
		getPredictiveJobGroupResponse.setHttpStatusCode(context.integerValue("GetPredictiveJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setInstanceId(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.InstanceId"));
		jobGroup.setSkillGroupId(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.SkillGroupId"));
		jobGroup.setSkillGroupName(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.SkillGroupName"));
		jobGroup.setName(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Name"));
		jobGroup.setDescription(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Description"));
		jobGroup.setCreationTime(context.longValue("GetPredictiveJobGroupResponse.JobGroup.CreationTime"));

		Progress progress = new Progress();
		progress.setTotalJobs(context.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.TotalJobs"));
		progress.setStatus(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Status"));
		progress.setTotalNotAnswered(context.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.TotalNotAnswered"));
		progress.setTotalCompleted(context.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.TotalCompleted"));
		progress.setStartTime(context.longValue("GetPredictiveJobGroupResponse.JobGroup.Progress.StartTime"));
		progress.setDuration(context.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Duration"));

		List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Categories.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Value"));

			categories.add(keyValuePair);
		}
		progress.setCategories(categories);
		jobGroup.setProgress(progress);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStartTime(context.longValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setMaxAttemptsPerDay(context.integerValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		getPredictiveJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return getPredictiveJobGroupResponse;
	}
}