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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.GetRefPackageJobResponse;
import com.aliyuncs.foas.model.v20181111.GetRefPackageJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRefPackageJobResponseUnmarshaller {

	public static GetRefPackageJobResponse unmarshall(GetRefPackageJobResponse getRefPackageJobResponse, UnmarshallerContext _ctx) {
		
		getRefPackageJobResponse.setRequestId(_ctx.stringValue("GetRefPackageJobResponse.RequestId"));
		getRefPackageJobResponse.setPageIndex(_ctx.integerValue("GetRefPackageJobResponse.PageIndex"));
		getRefPackageJobResponse.setPageSize(_ctx.integerValue("GetRefPackageJobResponse.PageSize"));
		getRefPackageJobResponse.setTotalCount(_ctx.longValue("GetRefPackageJobResponse.TotalCount"));
		getRefPackageJobResponse.setTotalPage(_ctx.integerValue("GetRefPackageJobResponse.TotalPage"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("GetRefPackageJobResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobName(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].JobName"));
			job.setProjectName(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].ProjectName"));
			job.setJobType(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].JobType"));
			job.setApiType(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].ApiType"));
			job.setCode(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Code"));
			job.setPlanJson(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].PlanJson"));
			job.setProperties(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Properties"));
			job.setPackages(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Packages"));
			job.setIsCommitted(_ctx.booleanValue("GetRefPackageJobResponse.Jobs["+ i +"].IsCommitted"));
			job.setCreator(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Creator"));
			job.setCreateTime(_ctx.longValue("GetRefPackageJobResponse.Jobs["+ i +"].CreateTime"));
			job.setModifier(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Modifier"));
			job.setModifyTime(_ctx.longValue("GetRefPackageJobResponse.Jobs["+ i +"].ModifyTime"));
			job.setDescription(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Description"));
			job.setEngineVersion(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].EngineVersion"));
			job.setClusterId(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].ClusterId"));
			job.setQueueName(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].QueueName"));
			job.setFolderId(_ctx.longValue("GetRefPackageJobResponse.Jobs["+ i +"].FolderId"));
			job.setJobId(_ctx.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].JobId"));

			jobs.add(job);
		}
		getRefPackageJobResponse.setJobs(jobs);
	 
	 	return getRefPackageJobResponse;
	}
}