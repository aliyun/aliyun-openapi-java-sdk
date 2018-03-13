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

import com.aliyuncs.vod.model.v20170321.SubmitAIVideoCategoryJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIVideoCategoryJobResponseUnmarshaller {

	public static SubmitAIVideoCategoryJobResponse unmarshall(SubmitAIVideoCategoryJobResponse submitAIVideoCategoryJobResponse, UnmarshallerContext context) {
		
		submitAIVideoCategoryJobResponse.setRequestId(context.stringValue("SubmitAIVideoCategoryJobResponse.RequestId"));

		AIVideoCategoryJob aIVideoCategoryJob = new AIVideoCategoryJob();
		aIVideoCategoryJob.setJobId(context.stringValue("SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob.JobId"));
		aIVideoCategoryJob.setMediaId(context.stringValue("SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob.MediaId"));
		aIVideoCategoryJob.setStatus(context.stringValue("SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob.Status"));
		aIVideoCategoryJob.setCode(context.stringValue("SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob.Code"));
		aIVideoCategoryJob.setMessage(context.stringValue("SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob.Message"));
		aIVideoCategoryJob.setCreationTime(context.stringValue("SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob.CreationTime"));
		aIVideoCategoryJob.setData(context.stringValue("SubmitAIVideoCategoryJobResponse.AIVideoCategoryJob.Data"));
		submitAIVideoCategoryJobResponse.setAIVideoCategoryJob(aIVideoCategoryJob);
	 
	 	return submitAIVideoCategoryJobResponse;
	}
}