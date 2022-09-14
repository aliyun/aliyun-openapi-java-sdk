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

package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListJobsResponse;
import com.aliyuncs.ehpc.model.v20170714.ListJobsResponse.JobInfo;
import com.aliyuncs.ehpc.model.v20170714.ListJobsResponse.JobInfo.Resources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setPageSize(_ctx.integerValue("ListJobsResponse.PageSize"));
		listJobsResponse.setPageNumber(_ctx.integerValue("ListJobsResponse.PageNumber"));
		listJobsResponse.setTotalCount(_ctx.integerValue("ListJobsResponse.TotalCount"));

		List<JobInfo> jobs = new ArrayList<JobInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Jobs.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setOwner(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Owner"));
			jobInfo.setComment(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Comment"));
			jobInfo.setState(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].State"));
			jobInfo.setStderr(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Stderr"));
			jobInfo.setPriority(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].Priority"));
			jobInfo.setShellPath(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].ShellPath"));
			jobInfo.setStdout(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Stdout"));
			jobInfo.setArrayRequest(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].ArrayRequest"));
			jobInfo.setStartTime(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].StartTime"));
			jobInfo.setLastModifyTime(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].LastModifyTime"));
			jobInfo.setName(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Name"));
			jobInfo.setId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Id"));
			jobInfo.setSubmitTime(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].SubmitTime"));

			Resources resources = new Resources();
			resources.setNodes(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].Resources.Nodes"));
			resources.setCores(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].Resources.Cores"));
			jobInfo.setResources(resources);

			jobs.add(jobInfo);
		}
		listJobsResponse.setJobs(jobs);
	 
	 	return listJobsResponse;
	}
}