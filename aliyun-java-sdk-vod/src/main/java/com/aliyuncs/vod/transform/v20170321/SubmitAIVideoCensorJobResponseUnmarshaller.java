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

import com.aliyuncs.vod.model.v20170321.SubmitAIVideoCensorJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIVideoCensorJobResponse.AIVideoCensorJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIVideoCensorJobResponseUnmarshaller {

	public static SubmitAIVideoCensorJobResponse unmarshall(SubmitAIVideoCensorJobResponse submitAIVideoCensorJobResponse, UnmarshallerContext context) {
		
		submitAIVideoCensorJobResponse.setRequestId(context.stringValue("SubmitAIVideoCensorJobResponse.RequestId"));

		AIVideoCensorJob aIVideoCensorJob = new AIVideoCensorJob();
		aIVideoCensorJob.setJobId(context.stringValue("SubmitAIVideoCensorJobResponse.AIVideoCensorJob.JobId"));
		aIVideoCensorJob.setMediaId(context.stringValue("SubmitAIVideoCensorJobResponse.AIVideoCensorJob.MediaId"));
		aIVideoCensorJob.setStatus(context.stringValue("SubmitAIVideoCensorJobResponse.AIVideoCensorJob.Status"));
		aIVideoCensorJob.setCode(context.stringValue("SubmitAIVideoCensorJobResponse.AIVideoCensorJob.Code"));
		aIVideoCensorJob.setMessage(context.stringValue("SubmitAIVideoCensorJobResponse.AIVideoCensorJob.Message"));
		aIVideoCensorJob.setCreationTime(context.stringValue("SubmitAIVideoCensorJobResponse.AIVideoCensorJob.CreationTime"));
		aIVideoCensorJob.setData(context.stringValue("SubmitAIVideoCensorJobResponse.AIVideoCensorJob.Data"));
		submitAIVideoCensorJobResponse.setAIVideoCensorJob(aIVideoCensorJob);
	 
	 	return submitAIVideoCensorJobResponse;
	}
}