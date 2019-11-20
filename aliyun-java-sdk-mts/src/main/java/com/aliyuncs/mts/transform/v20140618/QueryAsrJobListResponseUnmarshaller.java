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

import com.aliyuncs.mts.model.v20140618.QueryAsrJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryAsrJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryAsrJobListResponse.Job.AsrConfig;
import com.aliyuncs.mts.model.v20140618.QueryAsrJobListResponse.Job.AsrResult;
import com.aliyuncs.mts.model.v20140618.QueryAsrJobListResponse.Job.AsrResult.AsrText;
import com.aliyuncs.mts.model.v20140618.QueryAsrJobListResponse.Job.Input;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAsrJobListResponseUnmarshaller {

	public static QueryAsrJobListResponse unmarshall(QueryAsrJobListResponse queryAsrJobListResponse, UnmarshallerContext _ctx) {
		
		queryAsrJobListResponse.setRequestId(_ctx.stringValue("QueryAsrJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAsrJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryAsrJobListResponse.NonExistIds["+ i +"]"));
		}
		queryAsrJobListResponse.setNonExistIds(nonExistIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryAsrJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setId(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].Id"));
			job.setUserData(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].UserData"));
			job.setPipelineId(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].PipelineId"));
			job.setState(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].State"));
			job.setCode(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].Message"));
			job.setCreationTime(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].Input.Location"));
			input.setObject(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].Input.Object"));
			job.setInput(input);

			AsrConfig asrConfig = new AsrConfig();
			asrConfig.setScene(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].AsrConfig.Scene"));
			job.setAsrConfig(asrConfig);

			AsrResult asrResult = new AsrResult();
			asrResult.setDuration(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].AsrResult.Duration"));

			List<AsrText> asrTextList = new ArrayList<AsrText>();
			for (int j = 0; j < _ctx.lengthValue("QueryAsrJobListResponse.JobList["+ i +"].AsrResult.AsrTextList.Length"); j++) {
				AsrText asrText = new AsrText();
				asrText.setStartTime(_ctx.integerValue("QueryAsrJobListResponse.JobList["+ i +"].AsrResult.AsrTextList["+ j +"].StartTime"));
				asrText.setEndTime(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].AsrResult.AsrTextList["+ j +"].EndTime"));
				asrText.setChannelId(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].AsrResult.AsrTextList["+ j +"].ChannelId"));
				asrText.setSpeechRate(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].AsrResult.AsrTextList["+ j +"].SpeechRate"));
				asrText.setText(_ctx.stringValue("QueryAsrJobListResponse.JobList["+ i +"].AsrResult.AsrTextList["+ j +"].Text"));

				asrTextList.add(asrText);
			}
			asrResult.setAsrTextList(asrTextList);
			job.setAsrResult(asrResult);

			jobList.add(job);
		}
		queryAsrJobListResponse.setJobList(jobList);
	 
	 	return queryAsrJobListResponse;
	}
}