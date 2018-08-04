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

import com.aliyuncs.mts.model.v20140618.QueryVideoSplitJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryVideoSplitJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryVideoSplitJobListResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.QueryVideoSplitJobListResponse.Job.VideoSplitResult;
import com.aliyuncs.mts.model.v20140618.QueryVideoSplitJobListResponse.Job.VideoSplitResult.VideoSplit;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVideoSplitJobListResponseUnmarshaller {

	public static QueryVideoSplitJobListResponse unmarshall(QueryVideoSplitJobListResponse queryVideoSplitJobListResponse, UnmarshallerContext context) {
		
		queryVideoSplitJobListResponse.setRequestId(context.stringValue("QueryVideoSplitJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryVideoSplitJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryVideoSplitJobListResponse.NonExistIds["+ i +"]"));
		}
		queryVideoSplitJobListResponse.setNonExistIds(nonExistIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QueryVideoSplitJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setId(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Id"));
			job.setUserData(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].UserData"));
			job.setPipelineId(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].PipelineId"));
			job.setState(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].State"));
			job.setCode(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Message"));
			job.setCreationTime(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Input.Object"));
			job.setInput(input);

			VideoSplitResult videoSplitResult = new VideoSplitResult();

			List<VideoSplit> videoSplitList = new ArrayList<VideoSplit>();
			for (int j = 0; j < context.lengthValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList.Length"); j++) {
				VideoSplit videoSplit = new VideoSplit();
				videoSplit.setStartTime(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList["+ j +"].StartTime"));
				videoSplit.setEndTime(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList["+ j +"].EndTime"));
				videoSplit.setPath(context.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList["+ j +"].Path"));

				videoSplitList.add(videoSplit);
			}
			videoSplitResult.setVideoSplitList(videoSplitList);
			job.setVideoSplitResult(videoSplitResult);

			jobList.add(job);
		}
		queryVideoSplitJobListResponse.setJobList(jobList);
	 
	 	return queryVideoSplitJobListResponse;
	}
}