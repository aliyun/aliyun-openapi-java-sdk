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

import com.aliyuncs.linkvisual.model.v20180120.QueryStreamSnapshotJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryStreamSnapshotJobResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryStreamSnapshotJobResponse.Data.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStreamSnapshotJobResponseUnmarshaller {

	public static QueryStreamSnapshotJobResponse unmarshall(QueryStreamSnapshotJobResponse queryStreamSnapshotJobResponse, UnmarshallerContext _ctx) {
		
		queryStreamSnapshotJobResponse.setRequestId(_ctx.stringValue("QueryStreamSnapshotJobResponse.RequestId"));
		queryStreamSnapshotJobResponse.setCode(_ctx.stringValue("QueryStreamSnapshotJobResponse.Code"));
		queryStreamSnapshotJobResponse.setErrorMessage(_ctx.stringValue("QueryStreamSnapshotJobResponse.ErrorMessage"));
		queryStreamSnapshotJobResponse.setSuccess(_ctx.booleanValue("QueryStreamSnapshotJobResponse.Success"));

		Data data = new Data();

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryStreamSnapshotJobResponse.Data.JobList.Length"); i++) {
			Job job = new Job();
			job.setStreamType(_ctx.integerValue("QueryStreamSnapshotJobResponse.Data.JobList["+ i +"].StreamType"));
			job.setSnapshotInterval(_ctx.integerValue("QueryStreamSnapshotJobResponse.Data.JobList["+ i +"].SnapshotInterval"));

			jobList.add(job);
		}
		data.setJobList(jobList);
		queryStreamSnapshotJobResponse.setData(data);
	 
	 	return queryStreamSnapshotJobResponse;
	}
}