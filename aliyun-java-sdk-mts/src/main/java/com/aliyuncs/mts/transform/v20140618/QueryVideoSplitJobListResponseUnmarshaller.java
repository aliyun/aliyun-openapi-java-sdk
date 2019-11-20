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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVideoSplitJobListResponseUnmarshaller {

	public static QueryVideoSplitJobListResponse unmarshall(QueryVideoSplitJobListResponse queryVideoSplitJobListResponse, UnmarshallerContext _ctx) {
		
		queryVideoSplitJobListResponse.setRequestId(_ctx.stringValue("QueryVideoSplitJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryVideoSplitJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryVideoSplitJobListResponse.NonExistIds["+ i +"]"));
		}
		queryVideoSplitJobListResponse.setNonExistIds(nonExistIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryVideoSplitJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setId(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Id"));
			job.setUserData(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].UserData"));
			job.setPipelineId(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].PipelineId"));
			job.setState(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].State"));
			job.setCode(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Message"));
			job.setCreationTime(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Input.Location"));
			input.setObject(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].Input.Object"));
			job.setInput(input);

			VideoSplitResult videoSplitResult = new VideoSplitResult();

			List<VideoSplit> videoSplitList = new ArrayList<VideoSplit>();
			for (int j = 0; j < _ctx.lengthValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList.Length"); j++) {
				VideoSplit videoSplit = new VideoSplit();
				videoSplit.setStartTime(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList["+ j +"].StartTime"));
				videoSplit.setEndTime(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList["+ j +"].EndTime"));
				videoSplit.setPath(_ctx.stringValue("QueryVideoSplitJobListResponse.JobList["+ i +"].VideoSplitResult.VideoSplitList["+ j +"].Path"));

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