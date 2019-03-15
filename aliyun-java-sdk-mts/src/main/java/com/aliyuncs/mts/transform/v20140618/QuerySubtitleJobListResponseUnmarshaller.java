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

	public static QuerySubtitleJobListResponse unmarshall(QuerySubtitleJobListResponse querySubtitleJobListResponse, UnmarshallerContext context) {
		
		querySubtitleJobListResponse.setRequestId(context.stringValue("QuerySubtitleJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QuerySubtitleJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(context.stringValue("QuerySubtitleJobListResponse.NonExistJobIds["+ i +"]"));
		}
		querySubtitleJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QuerySubtitleJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].JobId"));
			job.setInputConfig(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].InputConfig"));
			job.setOutputConfig(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].OutputConfig"));
			job.setUserData(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].UserData"));
			job.setState(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].State"));

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("QuerySubtitleJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			jobList.add(job);
		}
		querySubtitleJobListResponse.setJobList(jobList);
	 
	 	return querySubtitleJobListResponse;
	}
}