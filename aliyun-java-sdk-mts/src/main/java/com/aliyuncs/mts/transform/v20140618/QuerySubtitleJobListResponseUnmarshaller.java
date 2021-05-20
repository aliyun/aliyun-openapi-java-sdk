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

import com.aliyuncs.mts.model.v20140618.QuerySubtitleJobListResponse;
import com.aliyuncs.mts.model.v20140618.QuerySubtitleJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QuerySubtitleJobListResponse.Job.MNSMessageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySubtitleJobListResponseUnmarshaller {

	public static QuerySubtitleJobListResponse unmarshall(QuerySubtitleJobListResponse querySubtitleJobListResponse, UnmarshallerContext _ctx) {
		
		querySubtitleJobListResponse.setRequestId(_ctx.stringValue("QuerySubtitleJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySubtitleJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(_ctx.stringValue("QuerySubtitleJobListResponse.NonExistJobIds["+ i +"]"));
		}
		querySubtitleJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QuerySubtitleJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setOutputConfig(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].OutputConfig"));
			job.setState(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].State"));
			job.setJobId(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].JobId"));
			job.setUserData(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].UserData"));
			job.setInputConfig(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].InputConfig"));

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			jobList.add(job);
		}
		querySubtitleJobListResponse.setJobList(jobList);
	 
	 	return querySubtitleJobListResponse;
	}
}