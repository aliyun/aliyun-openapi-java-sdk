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

import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsWithScenarioResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsWithScenarioResponse.JobGroups;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsWithScenarioResponse.JobGroups.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsWithScenarioResponse.JobGroups.JobGroup.Progress;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsWithScenarioResponse.JobGroups.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsWithScenarioResponse.JobGroups.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsWithScenarioResponse.JobGroups.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobGroupsWithScenarioResponseUnmarshaller {

	public static ListJobGroupsWithScenarioResponse unmarshall(ListJobGroupsWithScenarioResponse listJobGroupsWithScenarioResponse, UnmarshallerContext _ctx) {
		
		listJobGroupsWithScenarioResponse.setRequestId(_ctx.stringValue("ListJobGroupsWithScenarioResponse.RequestId"));
		listJobGroupsWithScenarioResponse.setSuccess(_ctx.booleanValue("ListJobGroupsWithScenarioResponse.Success"));
		listJobGroupsWithScenarioResponse.setCode(_ctx.stringValue("ListJobGroupsWithScenarioResponse.Code"));
		listJobGroupsWithScenarioResponse.setMessage(_ctx.stringValue("ListJobGroupsWithScenarioResponse.Message"));
		listJobGroupsWithScenarioResponse.setHttpStatusCode(_ctx.integerValue("ListJobGroupsWithScenarioResponse.HttpStatusCode"));

		JobGroups jobGroups = new JobGroups();
		jobGroups.setTotalCount(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.TotalCount"));
		jobGroups.setPageNumber(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.PageNumber"));
		jobGroups.setPageSize(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.PageSize"));

		List<JobGroup> list = new ArrayList<JobGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListJobGroupsWithScenarioResponse.JobGroups.List.Length"); i++) {
			JobGroup jobGroup = new JobGroup();
			jobGroup.setJobGroupId(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].JobGroupId"));
			jobGroup.setJobGroupName(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].JobGroupName"));
			jobGroup.setScenarioName(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].ScenarioName"));
			jobGroup.setJobGroupDescription(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].JobGroupDescription"));
			jobGroup.setScenarioId(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].ScenarioId"));
			jobGroup.setJobFilePath(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].JobFilePath"));
			jobGroup.setCreationTime(_ctx.longValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].CreationTime"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			jobGroup.setCallingNumbers(callingNumbers);

			Strategy strategy = new Strategy();
			strategy.setStrategyId(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.StrategyId"));
			strategy.setStrategyName(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.StrategyName"));
			strategy.setDescription(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.Description"));
			strategy.setType(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.Type"));
			strategy.setStartTime(_ctx.longValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(_ctx.longValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.EndTime"));
			strategy.setRepeatBy(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.RepeatBy"));
			strategy.setMaxAttemptsPerDay(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.MinAttemptInterval"));
			strategy.setCustomized(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.Customized"));
			strategy.setRoutingStrategy(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.RoutingStrategy"));
			strategy.setFollowUpStrategy(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.FollowUpStrategy"));
			strategy.setIsTemplate(_ctx.booleanValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.IsTemplate"));

			List<String> repeatDays = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.RepeatDays.Length"); j++) {
				repeatDays.add(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.RepeatDays["+ j +"]"));
			}
			strategy.setRepeatDays(repeatDays);

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);
			jobGroup.setStrategy(strategy);

			Progress progress = new Progress();
			progress.setTotalJobs(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.TotalJobs"));
			progress.setStatus(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.Status"));
			progress.setTotalNotAnswered(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.TotalNotAnswered"));
			progress.setTotalCompleted(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.TotalCompleted"));
			progress.setStartTime(_ctx.longValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.StartTime"));
			progress.setDuration(_ctx.integerValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.Duration"));

			List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.Categories.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListJobGroupsWithScenarioResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Value"));

				categories.add(keyValuePair);
			}
			progress.setCategories(categories);
			jobGroup.setProgress(progress);

			list.add(jobGroup);
		}
		jobGroups.setList(list);
		listJobGroupsWithScenarioResponse.setJobGroups(jobGroups);
	 
	 	return listJobGroupsWithScenarioResponse;
	}
}