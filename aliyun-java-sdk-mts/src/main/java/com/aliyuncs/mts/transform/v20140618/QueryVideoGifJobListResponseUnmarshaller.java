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

	public static QueryVideoGifJobListResponse unmarshall(QueryVideoGifJobListResponse queryVideoGifJobListResponse, UnmarshallerContext _ctx) {
		
		queryVideoGifJobListResponse.setRequestId(_ctx.stringValue("QueryVideoGifJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryVideoGifJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryVideoGifJobListResponse.NonExistIds["+ i +"]"));
		}
		queryVideoGifJobListResponse.setNonExistIds(nonExistIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryVideoGifJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setCreationTime(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].CreationTime"));
			job.setState(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].State"));
			job.setUserData(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].UserData"));
			job.setCode(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Message"));
			job.setPipelineId(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].PipelineId"));
			job.setId(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Id"));

			VideoGifResult videoGifResult = new VideoGifResult();

			OutputFile outputFile = new OutputFile();
			outputFile.setObject(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].VideoGifResult.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].VideoGifResult.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].VideoGifResult.OutputFile.Bucket"));
			videoGifResult.setOutputFile(outputFile);
			job.setVideoGifResult(videoGifResult);

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryVideoGifJobListResponse.JobList["+ i +"].Input.Bucket"));
			job.setInput(input);

			jobList.add(job);
		}
		queryVideoGifJobListResponse.setJobList(jobList);
	 
	 	return queryVideoGifJobListResponse;
	}
}