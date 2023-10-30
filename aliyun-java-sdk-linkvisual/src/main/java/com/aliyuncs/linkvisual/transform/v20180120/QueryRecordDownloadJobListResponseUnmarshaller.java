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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordDownloadJobListResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordDownloadJobListResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordDownloadJobListResponse.Data.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordDownloadJobListResponseUnmarshaller {

	public static QueryRecordDownloadJobListResponse unmarshall(QueryRecordDownloadJobListResponse queryRecordDownloadJobListResponse, UnmarshallerContext _ctx) {
		
		queryRecordDownloadJobListResponse.setRequestId(_ctx.stringValue("QueryRecordDownloadJobListResponse.RequestId"));
		queryRecordDownloadJobListResponse.setCode(_ctx.stringValue("QueryRecordDownloadJobListResponse.Code"));
		queryRecordDownloadJobListResponse.setErrorMessage(_ctx.stringValue("QueryRecordDownloadJobListResponse.ErrorMessage"));
		queryRecordDownloadJobListResponse.setSuccess(_ctx.booleanValue("QueryRecordDownloadJobListResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.Total"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryRecordDownloadJobListResponse.Data.JobList.Length"); i++) {
			Job job = new Job();
			job.setStatus(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].Status"));
			job.setType(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].Type"));
			job.setProgress(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].Progress"));
			job.setRecordType(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].RecordType"));
			job.setBeginTime(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].BeginTime"));
			job.setUrl(_ctx.stringValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].Url"));
			job.setFileName(_ctx.stringValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].FileName"));
			job.setEndTime(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].EndTime"));
			job.setStreamType(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].StreamType"));
			job.setJobId(_ctx.stringValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].JobId"));
			job.setJobErrorCode(_ctx.integerValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].JobErrorCode"));
			job.setIotId(_ctx.stringValue("QueryRecordDownloadJobListResponse.Data.JobList["+ i +"].IotId"));

			jobList.add(job);
		}
		data.setJobList(jobList);
		queryRecordDownloadJobListResponse.setData(data);
	 
	 	return queryRecordDownloadJobListResponse;
	}
}