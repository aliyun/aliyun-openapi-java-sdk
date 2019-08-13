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

import com.aliyuncs.emr.model.v20160408.ListJobExecutionInstancesResponse;
import com.aliyuncs.emr.model.v20160408.ListJobExecutionInstancesResponse.JobInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobExecutionInstancesResponseUnmarshaller {

	public static ListJobExecutionInstancesResponse unmarshall(ListJobExecutionInstancesResponse listJobExecutionInstancesResponse, UnmarshallerContext _ctx) {
		
		listJobExecutionInstancesResponse.setRequestId(_ctx.stringValue("ListJobExecutionInstancesResponse.RequestId"));
		listJobExecutionInstancesResponse.setTotalCount(_ctx.integerValue("ListJobExecutionInstancesResponse.TotalCount"));
		listJobExecutionInstancesResponse.setPageNumber(_ctx.integerValue("ListJobExecutionInstancesResponse.PageNumber"));
		listJobExecutionInstancesResponse.setPageSize(_ctx.integerValue("ListJobExecutionInstancesResponse.PageSize"));

		List<JobInstance> jobInstances = new ArrayList<JobInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListJobExecutionInstancesResponse.JobInstances.Length"); i++) {
			JobInstance jobInstance = new JobInstance();
			jobInstance.setId(_ctx.stringValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].Id"));
			jobInstance.setJobName(_ctx.stringValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].JobName"));
			jobInstance.setStartTime(_ctx.longValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].StartTime"));
			jobInstance.setRunTime(_ctx.integerValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].RunTime"));
			jobInstance.setJobType(_ctx.stringValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].JobType"));
			jobInstance.setJobId(_ctx.stringValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].JobId"));
			jobInstance.setClusterId(_ctx.stringValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].ClusterId"));
			jobInstance.setStatus(_ctx.stringValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].Status"));
			jobInstance.setRetryInfo(_ctx.stringValue("ListJobExecutionInstancesResponse.JobInstances["+ i +"].RetryInfo"));

			jobInstances.add(jobInstance);
		}
		listJobExecutionInstancesResponse.setJobInstances(jobInstances);
	 
	 	return listJobExecutionInstancesResponse;
	}
}