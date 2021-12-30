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

import com.aliyuncs.ccc.model.v20170705.GetJobGroupResponse;
import com.aliyuncs.ccc.model.v20170705.GetJobGroupResponse.JobGroup;
import com.aliyuncs.ccc.model.v20170705.GetJobGroupResponse.JobGroup.Progress;
import com.aliyuncs.ccc.model.v20170705.GetJobGroupResponse.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.GetJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.ccc.model.v20170705.GetJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobGroupResponseUnmarshaller {

	public static GetJobGroupResponse unmarshall(GetJobGroupResponse getJobGroupResponse, UnmarshallerContext _ctx) {
		
		getJobGroupResponse.setRequestId(_ctx.stringValue("GetJobGroupResponse.RequestId"));
		getJobGroupResponse.setSuccess(_ctx.booleanValue("GetJobGroupResponse.Success"));
		getJobGroupResponse.setCode(_ctx.stringValue("GetJobGroupResponse.Code"));
		getJobGroupResponse.setMessage(_ctx.stringValue("GetJobGroupResponse.Message"));
		getJobGroupResponse.setHttpStatusCode(_ctx.integerValue("GetJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setId(_ctx.stringValue("GetJobGroupResponse.JobGroup.Id"));
		jobGroup.setName(_ctx.stringValue("GetJobGroupResponse.JobGroup.Name"));
		jobGroup.setDescription(_ctx.stringValue("GetJobGroupResponse.JobGroup.Description"));
		jobGroup.setScenarioId(_ctx.stringValue("GetJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(_ctx.stringValue("GetJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(_ctx.longValue("GetJobGroupResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("GetJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setId(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.Id"));
		strategy.setName(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.Name"));
		strategy.setDescription(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.Description"));
		strategy.setType(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("GetJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("GetJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("GetJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("GetJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("GetJobGroupResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("GetJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("GetJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);

		Progress progress = new Progress();
		progress.setTotalJobs(_ctx.integerValue("GetJobGroupResponse.JobGroup.Progress.TotalJobs"));
		progress.setStatus(_ctx.stringValue("GetJobGroupResponse.JobGroup.Progress.Status"));
		progress.setTotalNotAnswered(_ctx.integerValue("GetJobGroupResponse.JobGroup.Progress.TotalNotAnswered"));
		progress.setTotalCompleted(_ctx.integerValue("GetJobGroupResponse.JobGroup.Progress.TotalCompleted"));
		progress.setStartTime(_ctx.longValue("GetJobGroupResponse.JobGroup.Progress.StartTime"));
		progress.setDuration(_ctx.integerValue("GetJobGroupResponse.JobGroup.Progress.Duration"));

		List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GetJobGroupResponse.JobGroup.Progress.Categories.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("GetJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("GetJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Value"));

			categories.add(keyValuePair);
		}
		progress.setCategories(categories);
		jobGroup.setProgress(progress);
		getJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return getJobGroupResponse;
	}
}