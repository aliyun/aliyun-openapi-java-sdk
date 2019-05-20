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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupResponse.JobGroup;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupResponse.JobGroup.Progress;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupResponse.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobGroupResponseUnmarshaller {

	public static GetJobGroupResponse unmarshall(GetJobGroupResponse getJobGroupResponse, UnmarshallerContext context) {
		
		getJobGroupResponse.setRequestId(context.stringValue("GetJobGroupResponse.RequestId"));
		getJobGroupResponse.setSuccess(context.booleanValue("GetJobGroupResponse.Success"));
		getJobGroupResponse.setCode(context.stringValue("GetJobGroupResponse.Code"));
		getJobGroupResponse.setMessage(context.stringValue("GetJobGroupResponse.Message"));
		getJobGroupResponse.setHttpStatusCode(context.integerValue("GetJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setId(context.stringValue("GetJobGroupResponse.JobGroup.Id"));
		jobGroup.setName(context.stringValue("GetJobGroupResponse.JobGroup.Name"));
		jobGroup.setDescription(context.stringValue("GetJobGroupResponse.JobGroup.Description"));
		jobGroup.setScenarioId(context.stringValue("GetJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(context.stringValue("GetJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(context.longValue("GetJobGroupResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("GetJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setId(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.Id"));
		strategy.setName(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.Name"));
		strategy.setDescription(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.Description"));
		strategy.setType(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(context.longValue("GetJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(context.longValue("GetJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(context.integerValue("GetJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(context.integerValue("GetJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(context.booleanValue("GetJobGroupResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < context.lengthValue("GetJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(context.stringValue("GetJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);

		Progress progress = new Progress();
		progress.setTotalJobs(context.integerValue("GetJobGroupResponse.JobGroup.Progress.TotalJobs"));
		progress.setStatus(context.stringValue("GetJobGroupResponse.JobGroup.Progress.Status"));
		progress.setTotalNotAnswered(context.integerValue("GetJobGroupResponse.JobGroup.Progress.TotalNotAnswered"));
		progress.setTotalCompleted(context.integerValue("GetJobGroupResponse.JobGroup.Progress.TotalCompleted"));
		progress.setStartTime(context.longValue("GetJobGroupResponse.JobGroup.Progress.StartTime"));
		progress.setDuration(context.integerValue("GetJobGroupResponse.JobGroup.Progress.Duration"));

		List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GetJobGroupResponse.JobGroup.Progress.Categories.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GetJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GetJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Value"));

			categories.add(keyValuePair);
		}
		progress.setCategories(categories);
		jobGroup.setProgress(progress);
		getJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return getJobGroupResponse;
	}
}