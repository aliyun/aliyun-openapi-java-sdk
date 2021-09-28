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

import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobGroupResponse;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobGroupResponse.JobGroup;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Progress;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPredictiveJobGroupResponseUnmarshaller {

	public static GetPredictiveJobGroupResponse unmarshall(GetPredictiveJobGroupResponse getPredictiveJobGroupResponse, UnmarshallerContext _ctx) {
		
		getPredictiveJobGroupResponse.setRequestId(_ctx.stringValue("GetPredictiveJobGroupResponse.RequestId"));
		getPredictiveJobGroupResponse.setHttpStatusCode(_ctx.integerValue("GetPredictiveJobGroupResponse.HttpStatusCode"));
		getPredictiveJobGroupResponse.setCode(_ctx.stringValue("GetPredictiveJobGroupResponse.Code"));
		getPredictiveJobGroupResponse.setMessage(_ctx.stringValue("GetPredictiveJobGroupResponse.Message"));
		getPredictiveJobGroupResponse.setSuccess(_ctx.booleanValue("GetPredictiveJobGroupResponse.Success"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setCreationTime(_ctx.longValue("GetPredictiveJobGroupResponse.JobGroup.CreationTime"));
		jobGroup.setJobGroupId(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setDescription(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Description"));
		jobGroup.setSkillGroupId(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.SkillGroupId"));
		jobGroup.setSkillGroupName(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.SkillGroupName"));
		jobGroup.setInstanceId(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.InstanceId"));
		jobGroup.setName(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Name"));
		jobGroup.setRatio(_ctx.longValue("GetPredictiveJobGroupResponse.JobGroup.Ratio"));

		Progress progress = new Progress();
		progress.setStatus(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Status"));
		progress.setTotalNotAnswered(_ctx.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.TotalNotAnswered"));
		progress.setStartTime(_ctx.longValue("GetPredictiveJobGroupResponse.JobGroup.Progress.StartTime"));
		progress.setTotalJobs(_ctx.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.TotalJobs"));
		progress.setTotalCompleted(_ctx.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.TotalCompleted"));
		progress.setDuration(_ctx.integerValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Duration"));

		List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Categories.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Value"));

			categories.add(keyValuePair);
		}
		progress.setCategories(categories);
		jobGroup.setProgress(progress);

		Strategy strategy = new Strategy();
		strategy.setMinAttemptInterval(_ctx.integerValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setEndTime(_ctx.longValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setStartTime(_ctx.longValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setStrategyId(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setEndTime(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));
			timeFrame.setBeginTime(_ctx.stringValue("GetPredictiveJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		getPredictiveJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return getPredictiveJobGroupResponse;
	}
}