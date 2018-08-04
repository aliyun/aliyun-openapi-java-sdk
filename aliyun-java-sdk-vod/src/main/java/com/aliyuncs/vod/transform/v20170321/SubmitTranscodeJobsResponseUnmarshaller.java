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

import com.aliyuncs.vod.model.v20170321.SubmitTranscodeJobsResponse;
import com.aliyuncs.vod.model.v20170321.SubmitTranscodeJobsResponse.TranscodeJob;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitTranscodeJobsResponseUnmarshaller {

	public static SubmitTranscodeJobsResponse unmarshall(SubmitTranscodeJobsResponse submitTranscodeJobsResponse, UnmarshallerContext context) {
		
		submitTranscodeJobsResponse.setRequestId(context.stringValue("SubmitTranscodeJobsResponse.RequestId"));

		List<TranscodeJob> transcodeJobs = new ArrayList<TranscodeJob>();
		for (int i = 0; i < context.lengthValue("SubmitTranscodeJobsResponse.TranscodeJobs.Length"); i++) {
			TranscodeJob transcodeJob = new TranscodeJob();
			transcodeJob.setJobId(context.stringValue("SubmitTranscodeJobsResponse.TranscodeJobs["+ i +"].JobId"));

			transcodeJobs.add(transcodeJob);
		}
		submitTranscodeJobsResponse.setTranscodeJobs(transcodeJobs);
	 
	 	return submitTranscodeJobsResponse;
	}
}