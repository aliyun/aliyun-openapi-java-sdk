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

import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsAsyncResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsAsyncResponse.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsAsyncResponse.JobGroup.ExportProgress;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsAsyncResponse.JobGroup.Progress;
import com.aliyuncs.outboundbot.model.v20191226.ListJobGroupsAsyncResponse.JobGroup.Strategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobGroupsAsyncResponseUnmarshaller {

	public static ListJobGroupsAsyncResponse unmarshall(ListJobGroupsAsyncResponse listJobGroupsAsyncResponse, UnmarshallerContext _ctx) {
		
		listJobGroupsAsyncResponse.setRequestId(_ctx.stringValue("ListJobGroupsAsyncResponse.RequestId"));
		listJobGroupsAsyncResponse.setSuccess(_ctx.booleanValue("ListJobGroupsAsyncResponse.Success"));
		listJobGroupsAsyncResponse.setCode(_ctx.stringValue("ListJobGroupsAsyncResponse.Code"));
		listJobGroupsAsyncResponse.setMessage(_ctx.stringValue("ListJobGroupsAsyncResponse.Message"));
		listJobGroupsAsyncResponse.setHttpStatusCode(_ctx.integerValue("ListJobGroupsAsyncResponse.HttpStatusCode"));
		listJobGroupsAsyncResponse.setTotalCount(_ctx.integerValue("ListJobGroupsAsyncResponse.TotalCount"));
		listJobGroupsAsyncResponse.setPageNumber(_ctx.integerValue("ListJobGroupsAsyncResponse.PageNumber"));
		listJobGroupsAsyncResponse.setPageSize(_ctx.integerValue("ListJobGroupsAsyncResponse.PageSize"));
		listJobGroupsAsyncResponse.setVaild(_ctx.booleanValue("ListJobGroupsAsyncResponse.Vaild"));
		listJobGroupsAsyncResponse.setTimeout(_ctx.booleanValue("ListJobGroupsAsyncResponse.Timeout"));

		List<JobGroup> jobGroups = new ArrayList<JobGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListJobGroupsAsyncResponse.JobGroups.Length"); i++) {
			JobGroup jobGroup = new JobGroup();
			jobGroup.setJobGroupId(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].JobGroupId"));
			jobGroup.setJobGroupName(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].JobGroupName"));
			jobGroup.setJobGroupDescription(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].JobGroupDescription"));
			jobGroup.setScriptId(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].ScriptId"));
			jobGroup.setScriptName(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].ScriptName"));
			jobGroup.setCreationTime(_ctx.longValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].CreationTime"));
			jobGroup.setStatus(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Status"));
			jobGroup.setJobDataParsingTaskId(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].JobDataParsingTaskId"));
			jobGroup.setModifyTime(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].ModifyTime"));
			jobGroup.setScriptVersion(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].ScriptVersion"));
			jobGroup.setTotalCallNum(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].TotalCallNum"));

			Strategy strategy = new Strategy();
			strategy.setStartTime(_ctx.longValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Strategy.StartTime"));
			strategy.setEndTime(_ctx.longValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Strategy.EndTime"));
			jobGroup.setStrategy(strategy);

			Progress progress = new Progress();
			progress.setTotalJobs(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.TotalJobs"));
			progress.setStatus(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.Status"));
			progress.setTotalNotAnswered(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.TotalNotAnswered"));
			progress.setTotalCompleted(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.TotalCompleted"));
			progress.setStartTime(_ctx.longValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.StartTime"));
			progress.setDuration(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.Duration"));
			progress.setExecutingNum(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.ExecutingNum"));
			progress.setCancelledNum(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.CancelledNum"));
			progress.setScheduling(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.Scheduling"));
			progress.setFailedNum(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.FailedNum"));
			progress.setPausedNum(_ctx.integerValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].Progress.PausedNum"));
			jobGroup.setProgress(progress);

			ExportProgress exportProgress = new ExportProgress();
			exportProgress.setFileHttpUrl(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].ExportProgress.FileHttpUrl"));
			exportProgress.setProgress(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].ExportProgress.Progress"));
			exportProgress.setStatus(_ctx.stringValue("ListJobGroupsAsyncResponse.JobGroups["+ i +"].ExportProgress.Status"));
			jobGroup.setExportProgress(exportProgress);

			jobGroups.add(jobGroup);
		}
		listJobGroupsAsyncResponse.setJobGroups(jobGroups);
	 
	 	return listJobGroupsAsyncResponse;
	}
}