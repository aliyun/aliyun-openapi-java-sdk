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

import com.aliyuncs.vod.model.v20170321.GetAICaptionExtractionJobsResponse;
import com.aliyuncs.vod.model.v20170321.GetAICaptionExtractionJobsResponse.AICaptionExtractionJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAICaptionExtractionJobsResponseUnmarshaller {

	public static GetAICaptionExtractionJobsResponse unmarshall(GetAICaptionExtractionJobsResponse getAICaptionExtractionJobsResponse, UnmarshallerContext _ctx) {
		
		getAICaptionExtractionJobsResponse.setRequestId(_ctx.stringValue("GetAICaptionExtractionJobsResponse.RequestId"));

		List<AICaptionExtractionJob> aICaptionExtractionJobList = new ArrayList<AICaptionExtractionJob>();
		for (int i = 0; i < _ctx.lengthValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList.Length"); i++) {
			AICaptionExtractionJob aICaptionExtractionJob = new AICaptionExtractionJob();
			aICaptionExtractionJob.setCreationTime(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].CreationTime"));
			aICaptionExtractionJob.setJobId(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].JobId"));
			aICaptionExtractionJob.setVideoId(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].VideoId"));
			aICaptionExtractionJob.setAICaptionExtractionResult(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].AICaptionExtractionResult"));
			aICaptionExtractionJob.setUserData(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].UserData"));
			aICaptionExtractionJob.setCode(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].Code"));
			aICaptionExtractionJob.setMessage(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].Message"));
			aICaptionExtractionJob.setStatus(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].Status"));
			aICaptionExtractionJob.setTemplateConfig(_ctx.stringValue("GetAICaptionExtractionJobsResponse.AICaptionExtractionJobList["+ i +"].TemplateConfig"));

			aICaptionExtractionJobList.add(aICaptionExtractionJob);
		}
		getAICaptionExtractionJobsResponse.setAICaptionExtractionJobList(aICaptionExtractionJobList);
	 
	 	return getAICaptionExtractionJobsResponse;
	}
}