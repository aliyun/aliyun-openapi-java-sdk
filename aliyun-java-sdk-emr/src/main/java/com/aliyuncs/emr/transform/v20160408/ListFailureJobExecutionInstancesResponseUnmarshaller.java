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

import com.aliyuncs.emr.model.v20160408.ListFailureJobExecutionInstancesResponse;
import com.aliyuncs.emr.model.v20160408.ListFailureJobExecutionInstancesResponse.JobInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFailureJobExecutionInstancesResponseUnmarshaller {

	public static ListFailureJobExecutionInstancesResponse unmarshall(ListFailureJobExecutionInstancesResponse listFailureJobExecutionInstancesResponse, UnmarshallerContext context) {
		
		listFailureJobExecutionInstancesResponse.setRequestId(context.stringValue("ListFailureJobExecutionInstancesResponse.RequestId"));

		List<JobInstance> jobInstances = new ArrayList<JobInstance>();
		for (int i = 0; i < context.lengthValue("ListFailureJobExecutionInstancesResponse.JobInstances.Length"); i++) {
			JobInstance jobInstance = new JobInstance();
			jobInstance.setId(context.stringValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].Id"));
			jobInstance.setJobName(context.stringValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].JobName"));
			jobInstance.setStartTime(context.longValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].StartTime"));
			jobInstance.setRunTime(context.integerValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].RunTime"));
			jobInstance.setJobType(context.stringValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].JobType"));
			jobInstance.setJobId(context.stringValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].JobId"));
			jobInstance.setClusterId(context.stringValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].ClusterId"));
			jobInstance.setStatus(context.stringValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].Status"));
			jobInstance.setRetryInfo(context.stringValue("ListFailureJobExecutionInstancesResponse.JobInstances["+ i +"].RetryInfo"));

			jobInstances.add(jobInstance);
		}
		listFailureJobExecutionInstancesResponse.setJobInstances(jobInstances);
	 
	 	return listFailureJobExecutionInstancesResponse;
	}
}