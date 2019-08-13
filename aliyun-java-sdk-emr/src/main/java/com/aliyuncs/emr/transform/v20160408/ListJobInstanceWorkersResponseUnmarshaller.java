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

import com.aliyuncs.emr.model.v20160408.ListJobInstanceWorkersResponse;
import com.aliyuncs.emr.model.v20160408.ListJobInstanceWorkersResponse.JobInstanceWorkerInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobInstanceWorkersResponseUnmarshaller {

	public static ListJobInstanceWorkersResponse unmarshall(ListJobInstanceWorkersResponse listJobInstanceWorkersResponse, UnmarshallerContext _ctx) {
		
		listJobInstanceWorkersResponse.setRequestId(_ctx.stringValue("ListJobInstanceWorkersResponse.RequestId"));

		List<JobInstanceWorkerInfo> jobInstanceWorkers = new ArrayList<JobInstanceWorkerInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListJobInstanceWorkersResponse.JobInstanceWorkers.Length"); i++) {
			JobInstanceWorkerInfo jobInstanceWorkerInfo = new JobInstanceWorkerInfo();
			jobInstanceWorkerInfo.setApplicationId(_ctx.stringValue("ListJobInstanceWorkersResponse.JobInstanceWorkers["+ i +"].ApplicationId"));
			jobInstanceWorkerInfo.setInstanceInfo(_ctx.stringValue("ListJobInstanceWorkersResponse.JobInstanceWorkers["+ i +"].InstanceInfo"));
			jobInstanceWorkerInfo.setContainerInfo(_ctx.stringValue("ListJobInstanceWorkersResponse.JobInstanceWorkers["+ i +"].ContainerInfo"));

			jobInstanceWorkers.add(jobInstanceWorkerInfo);
		}
		listJobInstanceWorkersResponse.setJobInstanceWorkers(jobInstanceWorkers);
	 
	 	return listJobInstanceWorkersResponse;
	}
}