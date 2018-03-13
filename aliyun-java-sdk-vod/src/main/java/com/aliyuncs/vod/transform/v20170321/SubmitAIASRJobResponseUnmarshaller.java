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

import com.aliyuncs.vod.model.v20170321.SubmitAIASRJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIASRJobResponse.AIASRJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIASRJobResponseUnmarshaller {

	public static SubmitAIASRJobResponse unmarshall(SubmitAIASRJobResponse submitAIASRJobResponse, UnmarshallerContext context) {
		
		submitAIASRJobResponse.setRequestId(context.stringValue("SubmitAIASRJobResponse.RequestId"));

		AIASRJob aIASRJob = new AIASRJob();
		aIASRJob.setJobId(context.stringValue("SubmitAIASRJobResponse.AIASRJob.JobId"));
		aIASRJob.setMediaId(context.stringValue("SubmitAIASRJobResponse.AIASRJob.MediaId"));
		aIASRJob.setStatus(context.stringValue("SubmitAIASRJobResponse.AIASRJob.Status"));
		aIASRJob.setCode(context.stringValue("SubmitAIASRJobResponse.AIASRJob.Code"));
		aIASRJob.setMessage(context.stringValue("SubmitAIASRJobResponse.AIASRJob.Message"));
		aIASRJob.setCreationTime(context.stringValue("SubmitAIASRJobResponse.AIASRJob.CreationTime"));
		aIASRJob.setData(context.stringValue("SubmitAIASRJobResponse.AIASRJob.Data"));
		submitAIASRJobResponse.setAIASRJob(aIASRJob);
	 
	 	return submitAIASRJobResponse;
	}
}