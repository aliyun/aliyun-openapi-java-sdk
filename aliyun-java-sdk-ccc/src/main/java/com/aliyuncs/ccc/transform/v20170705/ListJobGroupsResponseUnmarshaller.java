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

	public static ListJobGroupsResponse unmarshall(ListJobGroupsResponse listJobGroupsResponse, UnmarshallerContext context) {
		
		listJobGroupsResponse.setRequestId(context.stringValue("ListJobGroupsResponse.RequestId"));
		listJobGroupsResponse.setSuccess(context.booleanValue("ListJobGroupsResponse.Success"));
		listJobGroupsResponse.setCode(context.stringValue("ListJobGroupsResponse.Code"));
		listJobGroupsResponse.setMessage(context.stringValue("ListJobGroupsResponse.Message"));
		listJobGroupsResponse.setHttpStatusCode(context.integerValue("ListJobGroupsResponse.HttpStatusCode"));

		JobGroups jobGroups = new JobGroups();
		jobGroups.setTotalCount(context.integerValue("ListJobGroupsResponse.JobGroups.TotalCount"));
		jobGroups.setPageNumber(context.integerValue("ListJobGroupsResponse.JobGroups.PageNumber"));
		jobGroups.setPageSize(context.integerValue("ListJobGroupsResponse.JobGroups.PageSize"));

		List<JobGroup> list = new ArrayList<JobGroup>();
		for (int i = 0; i < context.lengthValue("ListJobGroupsResponse.JobGroups.List.Length"); i++) {
			JobGroup jobGroup = new JobGroup();
			jobGroup.setId(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Id"));
			jobGroup.setName(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Name"));
			jobGroup.setDescription(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Description"));
			jobGroup.setScenarioId(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ScenarioId"));
			jobGroup.setJobFilePath(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].JobFilePath"));
			jobGroup.setCreationTime(context.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].CreationTime"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			jobGroup.setCallingNumbers(callingNumbers);

			Strategy strategy = new Strategy();
			strategy.setId(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Id"));
			strategy.setName(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Name"));
			strategy.setDescription(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Description"));
			strategy.setType(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Type"));
			strategy.setStartTime(context.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(context.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.EndTime"));
			strategy.setRepeatBy(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RepeatBy"));
			strategy.setMaxAttemptsPerDay(context.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(context.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MinAttemptInterval"));
			strategy.setCustomized(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.Customized"));
			strategy.setRoutingStrategy(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RoutingStrategy"));
			strategy.setFollowUpStrategy(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.FollowUpStrategy"));
			strategy.setIsTemplate(context.booleanValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.IsTemplate"));

			List<String> repeatDays = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RepeatDays.Length"); j++) {
				repeatDays.add(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.RepeatDays["+ j +"]"));
			}
			strategy.setRepeatDays(repeatDays);

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < context.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);
			jobGroup.setStrategy(strategy);

			Progress progress = new Progress();
			progress.setTotalJobs(context.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalJobs"));
			progress.setStatus(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Status"));
			progress.setTotalNotAnswered(context.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalNotAnswered"));
			progress.setTotalCompleted(context.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalCompleted"));
			progress.setStartTime(context.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.StartTime"));
			progress.setDuration(context.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Duration"));

			List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
			for (int j = 0; j < context.lengthValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Key"));
				keyValuePair.setValue(context.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Value"));

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