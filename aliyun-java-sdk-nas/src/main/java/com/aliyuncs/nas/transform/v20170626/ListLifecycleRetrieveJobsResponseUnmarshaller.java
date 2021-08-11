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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.ListLifecycleRetrieveJobsResponse;
import com.aliyuncs.nas.model.v20170626.ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLifecycleRetrieveJobsResponseUnmarshaller {

	public static ListLifecycleRetrieveJobsResponse unmarshall(ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobsResponse, UnmarshallerContext _ctx) {
		
		listLifecycleRetrieveJobsResponse.setRequestId(_ctx.stringValue("ListLifecycleRetrieveJobsResponse.RequestId"));
		listLifecycleRetrieveJobsResponse.setTotalCount(_ctx.integerValue("ListLifecycleRetrieveJobsResponse.TotalCount"));
		listLifecycleRetrieveJobsResponse.setPageSize(_ctx.integerValue("ListLifecycleRetrieveJobsResponse.PageSize"));
		listLifecycleRetrieveJobsResponse.setPageNumber(_ctx.integerValue("ListLifecycleRetrieveJobsResponse.PageNumber"));

		List<LifecycleRetrieveJob> lifecycleRetrieveJobs = new ArrayList<LifecycleRetrieveJob>();
		for (int i = 0; i < _ctx.lengthValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs.Length"); i++) {
			LifecycleRetrieveJob lifecycleRetrieveJob = new LifecycleRetrieveJob();
			lifecycleRetrieveJob.setStatus(_ctx.stringValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].Status"));
			lifecycleRetrieveJob.setCreateTime(_ctx.stringValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].CreateTime"));
			lifecycleRetrieveJob.setRetrievedFileCount(_ctx.longValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].RetrievedFileCount"));
			lifecycleRetrieveJob.setUpdateTime(_ctx.stringValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].UpdateTime"));
			lifecycleRetrieveJob.setFileSystemId(_ctx.stringValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].FileSystemId"));
			lifecycleRetrieveJob.setJobId(_ctx.stringValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].JobId"));
			lifecycleRetrieveJob.setDiscoveredFileCount(_ctx.longValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].DiscoveredFileCount"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("ListLifecycleRetrieveJobsResponse.LifecycleRetrieveJobs["+ i +"].Paths["+ j +"]"));
			}
			lifecycleRetrieveJob.setPaths(paths);

			lifecycleRetrieveJobs.add(lifecycleRetrieveJob);
		}
		listLifecycleRetrieveJobsResponse.setLifecycleRetrieveJobs(lifecycleRetrieveJobs);
	 
	 	return listLifecycleRetrieveJobsResponse;
	}
}