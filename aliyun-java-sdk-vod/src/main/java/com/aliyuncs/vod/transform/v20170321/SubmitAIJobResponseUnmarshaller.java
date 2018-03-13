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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.SubmitAIJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIJobResponse.AIJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIJobResponseUnmarshaller {

	public static SubmitAIJobResponse unmarshall(SubmitAIJobResponse submitAIJobResponse, UnmarshallerContext context) {
		
		submitAIJobResponse.setRequestId(context.stringValue("SubmitAIJobResponse.RequestId"));

		List<AIJob> aIJobList = new ArrayList<AIJob>();
		for (int i = 0; i < context.lengthValue("SubmitAIJobResponse.AIJobList.Length"); i++) {
			AIJob aIJob = new AIJob();
			aIJob.setJobId(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].JobId"));
			aIJob.setType(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].Type"));
			aIJob.setMediaId(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].MediaId"));
			aIJob.setStatus(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].Status"));
			aIJob.setCode(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].Code"));
			aIJob.setMessage(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].Message"));
			aIJob.setCreationTime(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].CreationTime"));
			aIJob.setData(context.stringValue("SubmitAIJobResponse.AIJobList["+ i +"].Data"));

			aIJobList.add(aIJob);
		}
		submitAIJobResponse.setAIJobList(aIJobList);
	 
	 	return submitAIJobResponse;
	}
}