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

package com.aliyuncs.ddi.transform.v20200617;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddi.model.v20200617.ListFlowJobsResponse;
import com.aliyuncs.ddi.model.v20200617.ListFlowJobsResponse.Job;
import com.aliyuncs.ddi.model.v20200617.ListFlowJobsResponse.Job.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowJobsResponseUnmarshaller {

	public static ListFlowJobsResponse unmarshall(ListFlowJobsResponse listFlowJobsResponse, UnmarshallerContext _ctx) {
		
		listFlowJobsResponse.setRequestId(_ctx.stringValue("ListFlowJobsResponse.RequestId"));
		listFlowJobsResponse.setPageNumber(_ctx.integerValue("ListFlowJobsResponse.PageNumber"));
		listFlowJobsResponse.setPageSize(_ctx.integerValue("ListFlowJobsResponse.PageSize"));
		listFlowJobsResponse.setTotal(_ctx.integerValue("ListFlowJobsResponse.Total"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowJobsResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setAdhoc(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].Adhoc"));
			job.setAlertConf(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].AlertConf"));
			job.setCategoryId(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].CategoryId"));
			job.setCustomVariables(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].CustomVariables"));
			job.setDescription(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].Description"));
			job.setEnvConf(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].EnvConf"));
			job.setFailAct(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].FailAct"));
			job.setGmtCreate(_ctx.longValue("ListFlowJobsResponse.JobList["+ i +"].GmtCreate"));
			job.setGmtModified(_ctx.longValue("ListFlowJobsResponse.JobList["+ i +"].GmtModified"));
			job.setId(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].Id"));
			job.setLastInstanceDetail(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].LastInstanceDetail"));
			job.setMaxRetry(_ctx.integerValue("ListFlowJobsResponse.JobList["+ i +"].MaxRetry"));
			job.setMonitorConf(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].MonitorConf"));
			job.setName(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].Name"));
			job.setParamConf(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].ParamConf"));
			job.setParams(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].Params"));
			job.setRetryInterval(_ctx.longValue("ListFlowJobsResponse.JobList["+ i +"].RetryInterval"));
			job.setRunConf(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].RunConf"));
			job.setType(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].Type"));
			job.setMode(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].Mode"));

			List<Resource> resourceList = new ArrayList<Resource>();
			for (int j = 0; j < _ctx.lengthValue("ListFlowJobsResponse.JobList["+ i +"].ResourceList.Length"); j++) {
				Resource resource = new Resource();
				resource.setAlias(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].ResourceList["+ j +"].Alias"));
				resource.setPath(_ctx.stringValue("ListFlowJobsResponse.JobList["+ i +"].ResourceList["+ j +"].Path"));

				resourceList.add(resource);
			}
			job.setResourceList(resourceList);

			jobList.add(job);
		}
		listFlowJobsResponse.setJobList(jobList);
	 
	 	return listFlowJobsResponse;
	}
}