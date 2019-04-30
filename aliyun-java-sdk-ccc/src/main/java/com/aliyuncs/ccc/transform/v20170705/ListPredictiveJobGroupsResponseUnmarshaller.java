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

import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobGroupsResponse;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobGroupsResponse.JobGroups;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobGroupsResponse.JobGroups.JobGroup;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobGroupsResponse.JobGroups.JobGroup.Progress;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobGroupsResponse.JobGroups.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobGroupsResponse.JobGroups.JobGroup.Strategy;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobGroupsResponse.JobGroups.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPredictiveJobGroupsResponseUnmarshaller {

	public static ListPredictiveJobGroupsResponse unmarshall(ListPredictiveJobGroupsResponse listPredictiveJobGroupsResponse, UnmarshallerContext context) {
		
		listPredictiveJobGroupsResponse.setRequestId(context.stringValue("ListPredictiveJobGroupsResponse.RequestId"));
		listPredictiveJobGroupsResponse.setSuccess(context.booleanValue("ListPredictiveJobGroupsResponse.Success"));
		listPredictiveJobGroupsResponse.setCode(context.stringValue("ListPredictiveJobGroupsResponse.Code"));
		listPredictiveJobGroupsResponse.setMessage(context.stringValue("ListPredictiveJobGroupsResponse.Message"));
		listPredictiveJobGroupsResponse.setHttpStatusCode(context.integerValue("ListPredictiveJobGroupsResponse.HttpStatusCode"));

		JobGroups jobGroups = new JobGroups();
		jobGroups.setTotalCount(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.TotalCount"));
		jobGroups.setPageNumber(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.PageNumber"));
		jobGroups.setPageSize(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.PageSize"));

		List<JobGroup> list = new ArrayList<JobGroup>();
		for (int i = 0; i < context.lengthValue("ListPredictiveJobGroupsResponse.JobGroups.List.Length"); i++) {
			JobGroup jobGroup = new JobGroup();
			jobGroup.setJobGroupId(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].JobGroupId"));
			jobGroup.setInstanceId(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].InstanceId"));
			jobGroup.setSkillGroupId(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].SkillGroupId"));
			jobGroup.setSkillGroupName(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].SkillGroupName"));
			jobGroup.setTaskType(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].TaskType"));
			jobGroup.setOccupancyRate(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].OccupancyRate"));
			jobGroup.setStartTime(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].StartTime"));
			jobGroup.setEndTime(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].EndTime"));
			jobGroup.setName(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Name"));
			jobGroup.setDescription(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Description"));
			jobGroup.setCreationTime(context.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].CreationTime"));

			Strategy strategy = new Strategy();
			strategy.setStrategyId(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.StrategyId"));
			strategy.setStartTime(context.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(context.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.EndTime"));
			strategy.setMaxAttemptsPerDay(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MinAttemptInterval"));

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);
			jobGroup.setStrategy(strategy);

			Progress progress = new Progress();
			progress.setTotalJobs(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalJobs"));
			progress.setStatus(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Status"));
			progress.setTotalNotAnswered(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalNotAnswered"));
			progress.setTotalCompleted(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalCompleted"));
			progress.setStartTime(context.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.StartTime"));
			progress.setDuration(context.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Duration"));

			List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Key"));
				keyValuePair.setValue(context.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Value"));

				categories.add(keyValuePair);
			}
			progress.setCategories(categories);
			jobGroup.setProgress(progress);

			list.add(jobGroup);
		}
		jobGroups.setList(list);
		listPredictiveJobGroupsResponse.setJobGroups(jobGroups);
	 
	 	return listPredictiveJobGroupsResponse;
	}
}