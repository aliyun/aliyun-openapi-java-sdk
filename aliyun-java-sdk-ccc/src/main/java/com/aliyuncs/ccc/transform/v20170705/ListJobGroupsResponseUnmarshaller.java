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

import com.aliyuncs.ccc.model.v20170705.ListJobGroupsResponse;
import com.aliyuncs.ccc.model.v20170705.ListJobGroupsResponse.JobGroups;
import com.aliyuncs.ccc.model.v20170705.ListJobGroupsResponse.JobGroups.JobGroup;
import com.aliyuncs.ccc.model.v20170705.ListJobGroupsResponse.JobGroups.JobGroup.Progress;
import com.aliyuncs.ccc.model.v20170705.ListJobGroupsResponse.JobGroups.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ListJobGroupsResponse.JobGroups.JobGroup.Strategy;
import com.aliyuncs.ccc.model.v20170705.ListJobGroupsResponse.JobGroups.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobGroupsResponseUnmarshaller {

	public static ListJobGroupsResponse unmarshall(ListJobGroupsResponse listJobGroupsResponse, UnmarshallerContext _ctx) {
		
		listJobGroupsResponse.setRequestId(_ctx.stringValue("ListJobGroupsResponse.RequestId"));
		listJobGroupsResponse.setSuccess(_ctx.booleanValue("ListJobGroupsResponse.Success"));
		listJobGroupsResponse.setCode(_ctx.stringValue("ListJobGroupsResponse.Code"));
		listJobGroupsResponse.setMessage(_ctx.stringValue("ListJobGroupsResponse.Message"));
		listJobGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListJobGroupsResponse.HttpStatusCode"));

		JobGroups jobGroups = new JobGroups();
		jobGroups.setTotalCount(_ctx.integerValue("ListJobGroupsResponse.JobGroups.TotalCount"));
		jobGroups.setPageNumber(_ctx.integerValue("ListJobGroupsResponse.JobGroups.PageNumber"));
		jobGroups.setPageSize(_ctx.integerValue("ListJobGroupsResponse.JobGroups.PageSize"));

		List<JobGroup> list = new ArrayList<JobGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListJobGroupsResponse.JobGroups.List.Length"); i++) {
			JobGroup jobGroup = new JobGroup();
			jobGroup.setId(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Id"));
			jobGroup.setName(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Name"));
			jobGroup.setDescription(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Description"));
			jobGroup.setScenarioId(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ScenarioId"));
			jobGroup.setJobFilePath(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].JobFilePath"));
			jobGroup.setCreationTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].CreationTime"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			jobGroup.setCallingNumbers(callingNumbers);

			Strategy strategy = new Strategy();
			strategy.setId(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Id"));
			strategy.setName(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Name"));
			strategy.setDescription(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Description"));
			strategy.setType(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Type"));
			strategy.setStartTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.EndTime"));
			strategy.setRepeatBy(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RepeatBy"));
			strategy.setMaxAttemptsPerDay(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MinAttemptInterval"));
			strategy.setCustomized(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Customized"));
			strategy.setRoutingStrategy(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RoutingStrategy"));
			strategy.setFollowUpStrategy(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.FollowUpStrategy"));
			strategy.setIsTemplate(_ctx.booleanValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.IsTemplate"));

			List<String> repeatDays = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RepeatDays.Length"); j++) {
				repeatDays.add(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RepeatDays["+ j +"]"));
			}
			strategy.setRepeatDays(repeatDays);

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);
			jobGroup.setStrategy(strategy);

			Progress progress = new Progress();
			progress.setTotalJobs(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalJobs"));
			progress.setStatus(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Status"));
			progress.setTotalNotAnswered(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalNotAnswered"));
			progress.setTotalCompleted(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalCompleted"));
			progress.setStartTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.StartTime"));
			progress.setDuration(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Duration"));

			List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Value"));

				categories.add(keyValuePair);
			}
			progress.setCategories(categories);
			jobGroup.setProgress(progress);

			list.add(jobGroup);
		}
		jobGroups.setList(list);
		listJobGroupsResponse.setJobGroups(jobGroups);
	 
	 	return listJobGroupsResponse;
	}
}