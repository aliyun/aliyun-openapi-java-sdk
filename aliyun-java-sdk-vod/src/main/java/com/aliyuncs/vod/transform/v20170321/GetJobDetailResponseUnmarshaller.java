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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetJobDetailResponse;
import com.aliyuncs.vod.model.v20170321.GetJobDetailResponse.AIJobDetail;
import com.aliyuncs.vod.model.v20170321.GetJobDetailResponse.SnapshotJobDetail;
import com.aliyuncs.vod.model.v20170321.GetJobDetailResponse.TranscodeJobDetail;
import com.aliyuncs.vod.model.v20170321.GetJobDetailResponse.WorkflowTaskDetail;
import com.aliyuncs.vod.model.v20170321.GetJobDetailResponse.WorkflowTaskDetail.Workflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobDetailResponseUnmarshaller {

	public static GetJobDetailResponse unmarshall(GetJobDetailResponse getJobDetailResponse, UnmarshallerContext _ctx) {
		
		getJobDetailResponse.setRequestId(_ctx.stringValue("GetJobDetailResponse.RequestId"));
		getJobDetailResponse.setJobType(_ctx.stringValue("GetJobDetailResponse.JobType"));

		TranscodeJobDetail transcodeJobDetail = new TranscodeJobDetail();
		transcodeJobDetail.setJobId(_ctx.stringValue("GetJobDetailResponse.TranscodeJobDetail.JobId"));
		transcodeJobDetail.setUserId(_ctx.longValue("GetJobDetailResponse.TranscodeJobDetail.UserId"));
		transcodeJobDetail.setVideoId(_ctx.stringValue("GetJobDetailResponse.TranscodeJobDetail.VideoId"));
		transcodeJobDetail.setStatus(_ctx.stringValue("GetJobDetailResponse.TranscodeJobDetail.Status"));
		transcodeJobDetail.setTemplateId(_ctx.stringValue("GetJobDetailResponse.TranscodeJobDetail.TemplateId"));
		transcodeJobDetail.setDefinition(_ctx.stringValue("GetJobDetailResponse.TranscodeJobDetail.Definition"));
		transcodeJobDetail.setCreateTime(_ctx.stringValue("GetJobDetailResponse.TranscodeJobDetail.CreateTime"));
		transcodeJobDetail.setCompleteTime(_ctx.stringValue("GetJobDetailResponse.TranscodeJobDetail.CompleteTime"));
		getJobDetailResponse.setTranscodeJobDetail(transcodeJobDetail);

		SnapshotJobDetail snapshotJobDetail = new SnapshotJobDetail();
		snapshotJobDetail.setJobId(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.JobId"));
		snapshotJobDetail.setUserId(_ctx.longValue("GetJobDetailResponse.SnapshotJobDetail.UserId"));
		snapshotJobDetail.setVideoId(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.VideoId"));
		snapshotJobDetail.setStatus(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.Status"));
		snapshotJobDetail.setTrigger(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.Trigger"));
		snapshotJobDetail.setNormalConfig(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.NormalConfig"));
		snapshotJobDetail.setSpriteConfig(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.SpriteConfig"));
		snapshotJobDetail.setCreateTime(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.CreateTime"));
		snapshotJobDetail.setCompleteTime(_ctx.stringValue("GetJobDetailResponse.SnapshotJobDetail.CompleteTime"));
		getJobDetailResponse.setSnapshotJobDetail(snapshotJobDetail);

		AIJobDetail aIJobDetail = new AIJobDetail();
		aIJobDetail.setJobId(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.JobId"));
		aIJobDetail.setUserId(_ctx.longValue("GetJobDetailResponse.AIJobDetail.UserId"));
		aIJobDetail.setMediaId(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.MediaId"));
		aIJobDetail.setJobType(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.JobType"));
		aIJobDetail.setStatus(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.Status"));
		aIJobDetail.setTrigger(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.Trigger"));
		aIJobDetail.setTemplateConfig(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.TemplateConfig"));
		aIJobDetail.setCreateTime(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.CreateTime"));
		aIJobDetail.setCompleteTime(_ctx.stringValue("GetJobDetailResponse.AIJobDetail.CompleteTime"));
		getJobDetailResponse.setAIJobDetail(aIJobDetail);

		WorkflowTaskDetail workflowTaskDetail = new WorkflowTaskDetail();
		workflowTaskDetail.setTaskId(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.TaskId"));
		workflowTaskDetail.setStatus(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Status"));
		workflowTaskDetail.setTaskInput(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.TaskInput"));
		workflowTaskDetail.setCreateTime(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.CreateTime"));
		workflowTaskDetail.setFinishTime(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.FinishTime"));
		workflowTaskDetail.setActivityResults(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.ActivityResults"));
		workflowTaskDetail.setUserData(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.UserData"));

		Workflow workflow = new Workflow();
		workflow.setWorkflowId(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Workflow.WorkflowId"));
		workflow.setName(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Workflow.Name"));
		workflow.setStatus(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Workflow.Status"));
		workflow.setType(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Workflow.Type"));
		workflow.setCreateTime(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Workflow.CreateTime"));
		workflow.setModifiedTime(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Workflow.ModifiedTime"));
		workflow.setAppId(_ctx.stringValue("GetJobDetailResponse.WorkflowTaskDetail.Workflow.AppId"));
		workflowTaskDetail.setWorkflow(workflow);
		getJobDetailResponse.setWorkflowTaskDetail(workflowTaskDetail);
	 
	 	return getJobDetailResponse;
	}
}