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

import com.aliyuncs.vod.model.v20170321.SubmitAIVideoTerrorismRecogJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIVideoTerrorismRecogJobResponseUnmarshaller {

	public static SubmitAIVideoTerrorismRecogJobResponse unmarshall(SubmitAIVideoTerrorismRecogJobResponse submitAIVideoTerrorismRecogJobResponse, UnmarshallerContext context) {
		
		submitAIVideoTerrorismRecogJobResponse.setRequestId(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.RequestId"));

		AIVideoTerrorismRecogJob aIVideoTerrorismRecogJob = new AIVideoTerrorismRecogJob();
		aIVideoTerrorismRecogJob.setJobId(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob.JobId"));
		aIVideoTerrorismRecogJob.setMediaId(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob.MediaId"));
		aIVideoTerrorismRecogJob.setStatus(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob.Status"));
		aIVideoTerrorismRecogJob.setCode(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob.Code"));
		aIVideoTerrorismRecogJob.setMessage(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob.Message"));
		aIVideoTerrorismRecogJob.setCreationTime(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob.CreationTime"));
		aIVideoTerrorismRecogJob.setData(context.stringValue("SubmitAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob.Data"));
		submitAIVideoTerrorismRecogJobResponse.setAIVideoTerrorismRecogJob(aIVideoTerrorismRecogJob);
	 
	 	return submitAIVideoTerrorismRecogJobResponse;
	}
}