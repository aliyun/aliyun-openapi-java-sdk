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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListFlowJobResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowJobResponse.Job;
import com.aliyuncs.emr.model.v20160408.ListFlowJobResponse.Job.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowJobResponseUnmarshaller {

	public static ListFlowJobResponse unmarshall(ListFlowJobResponse listFlowJobResponse, UnmarshallerContext _ctx) {
		
		listFlowJobResponse.setRequestId(_ctx.stringValue("ListFlowJobResponse.RequestId"));
		listFlowJobResponse.setPageNumber(_ctx.integerValue("ListFlowJobResponse.PageNumber"));
		listFlowJobResponse.setPageSize(_ctx.integerValue("ListFlowJobResponse.PageSize"));
		listFlowJobResponse.setTotal(_ctx.integerValue("ListFlowJobResponse.Total"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowJobResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setId(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].Id"));
			job.setGmtCreate(_ctx.longValue("ListFlowJobResponse.JobList["+ i +"].GmtCreate"));
			job.setGmtModified(_ctx.longValue("ListFlowJobResponse.JobList["+ i +"].GmtModified"));
			job.setName(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].Name"));
			job.setType(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].Type"));
			job.setDescription(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].Description"));
			job.setFailAct(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].FailAct"));
			job.setMaxRetry(_ctx.integerValue("ListFlowJobResponse.JobList["+ i +"].MaxRetry"));
			job.setRetryInterval(_ctx.longValue("ListFlowJobResponse.JobList["+ i +"].RetryInterval"));
			job.setParams(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].Params"));
			job.setParamConf(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].ParamConf"));
			job.setCustomVariables(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].CustomVariables"));
			job.setEnvConf(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].EnvConf"));
			job.setRunConf(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].RunConf"));
			job.setMonitorConf(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].MonitorConf"));
			job.setCategoryId(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].CategoryId"));
			job.setMode(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].mode"));
			job.setAdhoc(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].Adhoc"));
			job.setAlertConf(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].AlertConf"));
			job.setLastInstanceDetail(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].LastInstanceDetail"));

			List<Resource> resourceList = new ArrayList<Resource>();
			for (int j = 0; j < _ctx.lengthValue("ListFlowJobResponse.JobList["+ i +"].ResourceList.Length"); j++) {
				Resource resource = new Resource();
				resource.setPath(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].ResourceList["+ j +"].Path"));
				resource.setAlias(_ctx.stringValue("ListFlowJobResponse.JobList["+ i +"].ResourceList["+ j +"].Alias"));

				resourceList.add(resource);
			}
			job.setResourceList(resourceList);

			jobList.add(job);
		}
		listFlowJobResponse.setJobList(jobList);
	 
	 	return listFlowJobResponse;
	}
}