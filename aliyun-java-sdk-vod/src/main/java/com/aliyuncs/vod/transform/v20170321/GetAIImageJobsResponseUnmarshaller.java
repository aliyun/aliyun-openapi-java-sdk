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

import com.aliyuncs.vod.model.v20170321.GetAIImageJobsResponse;
import com.aliyuncs.vod.model.v20170321.GetAIImageJobsResponse.AIImageJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIImageJobsResponseUnmarshaller {

	public static GetAIImageJobsResponse unmarshall(GetAIImageJobsResponse getAIImageJobsResponse, UnmarshallerContext _ctx) {
		
		getAIImageJobsResponse.setRequestId(_ctx.stringValue("GetAIImageJobsResponse.RequestId"));

		List<AIImageJob> aIImageJobList = new ArrayList<AIImageJob>();
		for (int i = 0; i < _ctx.lengthValue("GetAIImageJobsResponse.AIImageJobList.Length"); i++) {
			AIImageJob aIImageJob = new AIImageJob();
			aIImageJob.setCreationTime(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].CreationTime"));
			aIImageJob.setJobId(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].JobId"));
			aIImageJob.setTemplateId(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].TemplateId"));
			aIImageJob.setVideoId(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].VideoId"));
			aIImageJob.setAIImageResult(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].AIImageResult"));
			aIImageJob.setUserData(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].UserData"));
			aIImageJob.setCode(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].Code"));
			aIImageJob.setMessage(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].Message"));
			aIImageJob.setStatus(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].Status"));
			aIImageJob.setTemplateConfig(_ctx.stringValue("GetAIImageJobsResponse.AIImageJobList["+ i +"].TemplateConfig"));

			aIImageJobList.add(aIImageJob);
		}
		getAIImageJobsResponse.setAIImageJobList(aIImageJobList);
	 
	 	return getAIImageJobsResponse;
	}
}