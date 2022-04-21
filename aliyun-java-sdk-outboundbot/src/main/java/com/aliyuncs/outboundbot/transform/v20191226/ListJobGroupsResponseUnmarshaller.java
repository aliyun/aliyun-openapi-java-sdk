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

import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsResponse.JobGroups;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsResponse.JobGroups.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsResponse.JobGroups.JobGroup.ExportProgress;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsResponse.JobGroups.JobGroup.Progress;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsResponse.JobGroups.JobGroup.Strategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobGroupsResponseUnmarshaller {

	public static ListJobGroupsResponse unmarshall(ListJobGroupsResponse listJobGroupsResponse, UnmarshallerContext _ctx) {
		
		listJobGroupsResponse.setRequestId(_ctx.stringValue("ListJobGroupsResponse.RequestId"));
		listJobGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListJobGroupsResponse.HttpStatusCode"));
		listJobGroupsResponse.setSuccess(_ctx.booleanValue("ListJobGroupsResponse.Success"));
		listJobGroupsResponse.setCode(_ctx.stringValue("ListJobGroupsResponse.Code"));
		listJobGroupsResponse.setMessage(_ctx.stringValue("ListJobGroupsResponse.Message"));
		listJobGroupsResponse.setAsyncTaskId(_ctx.stringValue("ListJobGroupsResponse.AsyncTaskId"));

		JobGroups jobGroups = new JobGroups();
		jobGroups.setPageNumber(_ctx.integerValue("ListJobGroupsResponse.JobGroups.PageNumber"));
		jobGroups.setPageSize(_ctx.integerValue("ListJobGroupsResponse.JobGroups.PageSize"));
		jobGroups.setTotalCount(_ctx.integerValue("ListJobGroupsResponse.JobGroups.TotalCount"));

		List<JobGroup> list = new ArrayList<JobGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListJobGroupsResponse.JobGroups.List.Length"); i++) {
			JobGroup jobGroup = new JobGroup();
			jobGroup.setStatus(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Status"));
			jobGroup.setJobGroupId(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].JobGroupId"));
			jobGroup.setCreationTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].CreationTime"));
			jobGroup.setJobGroupName(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].JobGroupName"));
			jobGroup.setTotalCallNum(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].TotalCallNum"));
			jobGroup.setScriptId(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ScriptId"));
			jobGroup.setJobGroupDescription(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].JobGroupDescription"));
			jobGroup.setJobDataParsingTaskId(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].JobDataParsingTaskId"));
			jobGroup.setScriptName(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ScriptName"));
			jobGroup.setScriptVersion(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ScriptVersion"));
			jobGroup.setModifyTime(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ModifyTime"));

			Progress progress = new Progress();
			progress.setTotalNotAnswered(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalNotAnswered"));
			progress.setStatus(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Status"));
			progress.setStartTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.StartTime"));
			progress.setFailedNum(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.FailedNum"));
			progress.setPausedNum(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.PausedNum"));
			progress.setCancelledNum(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.CancelledNum"));
			progress.setTotalJobs(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalJobs"));
			progress.setTotalCompleted(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.TotalCompleted"));
			progress.setDuration(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Duration"));
			progress.setExecutingNum(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.ExecutingNum"));
			progress.setScheduling(_ctx.integerValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Progress.Scheduling"));
			jobGroup.setProgress(progress);

			ExportProgress exportProgress = new ExportProgress();
			exportProgress.setStatus(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ExportProgress.Status"));
			exportProgress.setFileHttpUrl(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ExportProgress.FileHttpUrl"));
			exportProgress.setProgress(_ctx.stringValue("ListJobGroupsResponse.JobGroups.List["+ i +"].ExportProgress.Progress"));
			jobGroup.setExportProgress(exportProgress);

			Strategy strategy = new Strategy();
			strategy.setEndTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.EndTime"));
			strategy.setStartTime(_ctx.longValue("ListJobGroupsResponse.JobGroups.List["+ i +"].Strategy.StartTime"));
			jobGroup.setStrategy(strategy);

			list.add(jobGroup);
		}
		jobGroups.setList(list);
		listJobGroupsResponse.setJobGroups(jobGroups);
	 
	 	return listJobGroupsResponse;
	}
}