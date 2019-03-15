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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryVideoGifJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryVideoGifJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryVideoGifJobListResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.QueryVideoGifJobListResponse.Job.VideoGifResult;
import com.aliyuncs.mts.model.v20140618.QueryVideoGifJobListResponse.Job.VideoGifResult.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVideoGifJobListResponseUnmarshaller {

	public static QueryVideoGifJobListResponse unmarshall(QueryVideoGifJobListResponse queryVideoGifJobListResponse, UnmarshallerContext context) {
		
		queryVideoGifJobListResponse.setRequestId(context.stringValue("QueryVideoGifJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryVideoGifJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryVideoGifJobListResponse.NonExistIds["+ i +"]"));
		}
		queryVideoGifJobListResponse.setNonExistIds(nonExistIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QueryVideoGifJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setId(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Id"));
			job.setUserData(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].UserData"));
			job.setPipelineId(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].PipelineId"));
			job.setState(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].State"));
			job.setCode(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Message"));
			job.setCreationTime(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Input.Object"));
			job.setInput(input);

			VideoGifResult videoGifResult = new VideoGifResult();

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].VideoGifResult.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].VideoGifResult.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].VideoGifResult.OutputFile.Object"));
			videoGifResult.setOutputFile(outputFile);
			job.setVideoGifResult(videoGifResult);

			jobList.add(job);
		}
		queryVideoGifJobListResponse.setJobList(jobList);
	 
	 	return queryVideoGifJobListResponse;
	}
}