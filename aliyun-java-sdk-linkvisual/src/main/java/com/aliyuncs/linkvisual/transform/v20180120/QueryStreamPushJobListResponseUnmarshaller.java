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

import com.aliyuncs.linkvisual.model.v20180120.QueryStreamPushJobListResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryStreamPushJobListResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryStreamPushJobListResponse.Data.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStreamPushJobListResponseUnmarshaller {

	public static QueryStreamPushJobListResponse unmarshall(QueryStreamPushJobListResponse queryStreamPushJobListResponse, UnmarshallerContext _ctx) {
		
		queryStreamPushJobListResponse.setRequestId(_ctx.stringValue("QueryStreamPushJobListResponse.RequestId"));
		queryStreamPushJobListResponse.setCode(_ctx.stringValue("QueryStreamPushJobListResponse.Code"));
		queryStreamPushJobListResponse.setErrorMessage(_ctx.stringValue("QueryStreamPushJobListResponse.ErrorMessage"));
		queryStreamPushJobListResponse.setSuccess(_ctx.booleanValue("QueryStreamPushJobListResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryStreamPushJobListResponse.Data.Total"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryStreamPushJobListResponse.Data.JobList.Length"); i++) {
			Job job = new Job();
			job.setPushUrl(_ctx.stringValue("QueryStreamPushJobListResponse.Data.JobList["+ i +"].PushUrl"));
			job.setStreamType(_ctx.integerValue("QueryStreamPushJobListResponse.Data.JobList["+ i +"].StreamType"));
			job.setJobId(_ctx.stringValue("QueryStreamPushJobListResponse.Data.JobList["+ i +"].JobId"));
			job.setCreateTime(_ctx.integerValue("QueryStreamPushJobListResponse.Data.JobList["+ i +"].CreateTime"));
			job.setPushStatus(_ctx.integerValue("QueryStreamPushJobListResponse.Data.JobList["+ i +"].PushStatus"));
			job.setJobType(_ctx.integerValue("QueryStreamPushJobListResponse.Data.JobList["+ i +"].JobType"));

			jobList.add(job);
		}
		data.setJobList(jobList);
		queryStreamPushJobListResponse.setData(data);
	 
	 	return queryStreamPushJobListResponse;
	}
}