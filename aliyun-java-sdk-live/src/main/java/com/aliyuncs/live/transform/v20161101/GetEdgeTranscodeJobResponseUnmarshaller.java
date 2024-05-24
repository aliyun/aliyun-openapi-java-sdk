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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.GetEdgeTranscodeJobResponse;
import com.aliyuncs.live.model.v20161101.GetEdgeTranscodeJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEdgeTranscodeJobResponseUnmarshaller {

	public static GetEdgeTranscodeJobResponse unmarshall(GetEdgeTranscodeJobResponse getEdgeTranscodeJobResponse, UnmarshallerContext _ctx) {
		
		getEdgeTranscodeJobResponse.setRequestId(_ctx.stringValue("GetEdgeTranscodeJobResponse.RequestId"));

		Job job = new Job();
		job.setCreateTime(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.CreateTime"));
		job.setJobId(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.JobId"));
		job.setLastStartAt(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.LastStartAt"));
		job.setLastStopAt(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.LastStopAt"));
		job.setName(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.Name"));
		job.setStatus(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.Status"));
		job.setStreamInput(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.StreamInput"));
		job.setStreamOutput(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.StreamOutput"));
		job.setTemplateId(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.TemplateId"));
		job.setTemplateName(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.TemplateName"));
		job.setType(_ctx.stringValue("GetEdgeTranscodeJobResponse.Job.Type"));
		getEdgeTranscodeJobResponse.setJob(job);
	 
	 	return getEdgeTranscodeJobResponse;
	}
}