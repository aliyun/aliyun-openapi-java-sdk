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

import com.aliyuncs.vod.model.v20170321.SubmitAIVideoSummaryJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIVideoSummaryJobResponseUnmarshaller {

	public static SubmitAIVideoSummaryJobResponse unmarshall(SubmitAIVideoSummaryJobResponse submitAIVideoSummaryJobResponse, UnmarshallerContext context) {
		
		submitAIVideoSummaryJobResponse.setRequestId(context.stringValue("SubmitAIVideoSummaryJobResponse.RequestId"));

		AIVideoSummaryJob aIVideoSummaryJob = new AIVideoSummaryJob();
		aIVideoSummaryJob.setJobId(context.stringValue("SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob.JobId"));
		aIVideoSummaryJob.setMediaId(context.stringValue("SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob.MediaId"));
		aIVideoSummaryJob.setStatus(context.stringValue("SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob.Status"));
		aIVideoSummaryJob.setCode(context.stringValue("SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob.Code"));
		aIVideoSummaryJob.setMessage(context.stringValue("SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob.Message"));
		aIVideoSummaryJob.setCreationTime(context.stringValue("SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob.CreationTime"));
		aIVideoSummaryJob.setData(context.stringValue("SubmitAIVideoSummaryJobResponse.AIVideoSummaryJob.Data"));
		submitAIVideoSummaryJobResponse.setAIVideoSummaryJob(aIVideoSummaryJob);
	 
	 	return submitAIVideoSummaryJobResponse;
	}
}