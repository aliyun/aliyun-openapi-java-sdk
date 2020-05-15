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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMSDdsJobsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSDdsJobsResponse.JobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSDdsJobsResponseUnmarshaller {

	public static QueryMSDdsJobsResponse unmarshall(QueryMSDdsJobsResponse queryMSDdsJobsResponse, UnmarshallerContext _ctx) {
		
		queryMSDdsJobsResponse.setRequestId(_ctx.stringValue("QueryMSDdsJobsResponse.RequestId"));
		queryMSDdsJobsResponse.setPageNum(_ctx.integerValue("QueryMSDdsJobsResponse.PageNum"));
		queryMSDdsJobsResponse.setPageSize(_ctx.integerValue("QueryMSDdsJobsResponse.PageSize"));
		queryMSDdsJobsResponse.setTotalCount(_ctx.integerValue("QueryMSDdsJobsResponse.TotalCount"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSDdsJobsResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setApp(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].App"));
			jobsItem.setCreationTime(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].CreationTime"));
			jobsItem.setCron(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].Cron"));
			jobsItem.setDes(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].Des"));
			jobsItem.setId(_ctx.integerValue("QueryMSDdsJobsResponse.Jobs["+ i +"].Id"));
			jobsItem.setInstanceId(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].InstanceId"));
			jobsItem.setName(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].Name"));
			jobsItem.setShardingCount(_ctx.integerValue("QueryMSDdsJobsResponse.Jobs["+ i +"].ShardingCount"));
			jobsItem.setStatus(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].Status"));
			jobsItem.setUpdateTime(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].UpdateTime"));

			List<String> customParams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMSDdsJobsResponse.Jobs["+ i +"].CustomParams.Length"); j++) {
				customParams.add(_ctx.stringValue("QueryMSDdsJobsResponse.Jobs["+ i +"].CustomParams["+ j +"]"));
			}
			jobsItem.setCustomParams(customParams);

			jobs.add(jobsItem);
		}
		queryMSDdsJobsResponse.setJobs(jobs);
	 
	 	return queryMSDdsJobsResponse;
	}
}