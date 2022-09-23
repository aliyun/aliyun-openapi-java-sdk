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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListJobsWithFiltersResponse;
import com.aliyuncs.ehpc.model.v20180412.ListJobsWithFiltersResponse.JobInfo;
import com.aliyuncs.ehpc.model.v20180412.ListJobsWithFiltersResponse.JobInfo.Resources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsWithFiltersResponseUnmarshaller {

	public static ListJobsWithFiltersResponse unmarshall(ListJobsWithFiltersResponse listJobsWithFiltersResponse, UnmarshallerContext _ctx) {
		
		listJobsWithFiltersResponse.setRequestId(_ctx.stringValue("ListJobsWithFiltersResponse.RequestId"));
		listJobsWithFiltersResponse.setTotalCount(_ctx.integerValue("ListJobsWithFiltersResponse.TotalCount"));
		listJobsWithFiltersResponse.setPageSize(_ctx.longValue("ListJobsWithFiltersResponse.PageSize"));
		listJobsWithFiltersResponse.setPageNumber(_ctx.longValue("ListJobsWithFiltersResponse.PageNumber"));
		listJobsWithFiltersResponse.setSuccess(_ctx.booleanValue("ListJobsWithFiltersResponse.Success"));

		List<JobInfo> jobs = new ArrayList<JobInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsWithFiltersResponse.Jobs.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setOwner(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Owner"));
			jobInfo.setComment(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Comment"));
			jobInfo.setState(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].State"));
			jobInfo.setStderr(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Stderr"));
			jobInfo.setPriority(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Priority"));
			jobInfo.setShellPath(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].ShellPath"));
			jobInfo.setStdout(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Stdout"));
			jobInfo.setArrayRequest(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].ArrayRequest"));
			jobInfo.setStartTime(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].StartTime"));
			jobInfo.setLastModifyTime(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].LastModifyTime"));
			jobInfo.setNodeList(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].NodeList"));
			jobInfo.setName(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Name"));
			jobInfo.setId(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Id"));
			jobInfo.setSubmitTime(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].SubmitTime"));
			jobInfo.setQueue(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Queue"));
			jobInfo.setRerunable(_ctx.booleanValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Rerunable"));
			jobInfo.setVariableList(_ctx.stringValue("ListJobsWithFiltersResponse.Jobs["+ i +"].VariableList"));

			Resources resources = new Resources();
			resources.setNodes(_ctx.longValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Resources.Nodes"));
			resources.setCores(_ctx.longValue("ListJobsWithFiltersResponse.Jobs["+ i +"].Resources.Cores"));
			jobInfo.setResources(resources);

			jobs.add(jobInfo);
		}
		listJobsWithFiltersResponse.setJobs(jobs);
	 
	 	return listJobsWithFiltersResponse;
	}
}