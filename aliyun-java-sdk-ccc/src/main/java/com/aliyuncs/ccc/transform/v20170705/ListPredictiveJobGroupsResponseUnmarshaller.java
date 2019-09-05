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

	public static ListPredictiveJobGroupsResponse unmarshall(ListPredictiveJobGroupsResponse listPredictiveJobGroupsResponse, UnmarshallerContext _ctx) {
		
		listPredictiveJobGroupsResponse.setRequestId(_ctx.stringValue("ListPredictiveJobGroupsResponse.RequestId"));
		listPredictiveJobGroupsResponse.setSuccess(_ctx.booleanValue("ListPredictiveJobGroupsResponse.Success"));
		listPredictiveJobGroupsResponse.setCode(_ctx.stringValue("ListPredictiveJobGroupsResponse.Code"));
		listPredictiveJobGroupsResponse.setMessage(_ctx.stringValue("ListPredictiveJobGroupsResponse.Message"));
		listPredictiveJobGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListPredictiveJobGroupsResponse.HttpStatusCode"));

		JobGroups jobGroups = new JobGroups();
		jobGroups.setTotalCount(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.TotalCount"));
		jobGroups.setPageNumber(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.PageNumber"));
		jobGroups.setPageSize(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.PageSize"));

		List<JobGroup> list = new ArrayList<JobGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListPredictiveJobGroupsResponse.JobGroups.List.Length"); i++) {
			JobGroup jobGroup = new JobGroup();
			jobGroup.setJobGroupId(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].JobGroupId"));
			jobGroup.setInstanceId(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].InstanceId"));
			jobGroup.setSkillGroupId(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].SkillGroupId"));
			jobGroup.setSkillGroupName(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].SkillGroupName"));
			jobGroup.setTaskType(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].TaskType"));
			jobGroup.setOccupancyRate(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].OccupancyRate"));
			jobGroup.setStartTime(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].StartTime"));
			jobGroup.setEndTime(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].EndTime"));
			jobGroup.setName(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Name"));
			jobGroup.setDescription(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Description"));
			jobGroup.setCreationTime(_ctx.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].CreationTime"));

			Strategy strategy = new Strategy();
			strategy.setStrategyId(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.StrategyId"));
			strategy.setStartTime(_ctx.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(_ctx.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.EndTime"));
			strategy.setMaxAttemptsPerDay(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MaxAttemptsPerDay"));
			strategy.setMinAttemptInterval(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.MinAttemptInterval"));

			List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
			for (int j = 0; j < _ctx.lengthValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime.Length"); j++) {
				TimeFrame timeFrame = new TimeFrame();
				timeFrame.setBeginTime(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].BeginTime"));
				timeFrame.setEndTime(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Strategy.WorkingTime["+ j +"].EndTime"));

				workingTime.add(timeFrame);
			}
			strategy.setWorkingTime(workingTime);
			jobGroup.setStrategy(strategy);

			Progress progress = new Progress();
			progress.setTotalJobs(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalJobs"));
			progress.setStatus(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Status"));
			progress.setTotalNotAnswered(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalNotAnswered"));
			progress.setTotalCompleted(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalCompleted"));
			progress.setStartTime(_ctx.longValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.StartTime"));
			progress.setDuration(_ctx.integerValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Duration"));

			List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListPredictiveJobGroupsResponse.JobGroups.List["+ i +"].Progress.Categories["+ j +"].Value"));

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