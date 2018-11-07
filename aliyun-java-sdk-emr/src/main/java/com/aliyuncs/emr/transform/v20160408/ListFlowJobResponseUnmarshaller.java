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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowJobResponseUnmarshaller {

	public static ListFlowJobResponse unmarshall(ListFlowJobResponse listFlowJobResponse, UnmarshallerContext context) {
		
		listFlowJobResponse.setRequestId(context.stringValue("ListFlowJobResponse.RequestId"));
		listFlowJobResponse.setPageNumber(context.integerValue("ListFlowJobResponse.PageNumber"));
		listFlowJobResponse.setPageSize(context.integerValue("ListFlowJobResponse.PageSize"));
		listFlowJobResponse.setTotal(context.integerValue("ListFlowJobResponse.Total"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("ListFlowJobResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setId(context.stringValue("ListFlowJobResponse.JobList["+ i +"].Id"));
			job.setGmtCreate(context.longValue("ListFlowJobResponse.JobList["+ i +"].GmtCreate"));
			job.setGmtModified(context.longValue("ListFlowJobResponse.JobList["+ i +"].GmtModified"));
			job.setName(context.stringValue("ListFlowJobResponse.JobList["+ i +"].Name"));
			job.setType(context.stringValue("ListFlowJobResponse.JobList["+ i +"].Type"));
			job.setDescription(context.stringValue("ListFlowJobResponse.JobList["+ i +"].Description"));
			job.setFailAct(context.stringValue("ListFlowJobResponse.JobList["+ i +"].FailAct"));
			job.setMaxRetry(context.integerValue("ListFlowJobResponse.JobList["+ i +"].MaxRetry"));
			job.setRetryInterval(context.longValue("ListFlowJobResponse.JobList["+ i +"].RetryInterval"));
			job.setParams(context.stringValue("ListFlowJobResponse.JobList["+ i +"].Params"));
			job.setParamConf(context.stringValue("ListFlowJobResponse.JobList["+ i +"].ParamConf"));
			job.setEnvConf(context.stringValue("ListFlowJobResponse.JobList["+ i +"].EnvConf"));
			job.setRunConf(context.stringValue("ListFlowJobResponse.JobList["+ i +"].RunConf"));
			job.setMonitorConf(context.stringValue("ListFlowJobResponse.JobList["+ i +"].MonitorConf"));
			job.setCategoryId(context.stringValue("ListFlowJobResponse.JobList["+ i +"].CategoryId"));
			job.setMode(context.stringValue("ListFlowJobResponse.JobList["+ i +"].mode"));

			List<Resource> resourceList = new ArrayList<Resource>();
			for (int j = 0; j < context.lengthValue("ListFlowJobResponse.JobList["+ i +"].ResourceList.Length"); j++) {
				Resource resource = new Resource();
				resource.setPath(context.stringValue("ListFlowJobResponse.JobList["+ i +"].ResourceList["+ j +"].Path"));
				resource.setAlias(context.stringValue("ListFlowJobResponse.JobList["+ i +"].ResourceList["+ j +"].Alias"));

				resourceList.add(resource);
			}
			job.setResourceList(resourceList);

			jobList.add(job);
		}
		listFlowJobResponse.setJobList(jobList);
	 
	 	return listFlowJobResponse;
	}
}