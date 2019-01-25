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

	public static GetRefPackageJobResponse unmarshall(GetRefPackageJobResponse getRefPackageJobResponse, UnmarshallerContext context) {
		
		getRefPackageJobResponse.setRequestId(context.stringValue("GetRefPackageJobResponse.RequestId"));
		getRefPackageJobResponse.setPageIndex(context.integerValue("GetRefPackageJobResponse.PageIndex"));
		getRefPackageJobResponse.setPageSize(context.integerValue("GetRefPackageJobResponse.PageSize"));
		getRefPackageJobResponse.setTotalCount(context.longValue("GetRefPackageJobResponse.TotalCount"));
		getRefPackageJobResponse.setTotalPage(context.integerValue("GetRefPackageJobResponse.TotalPage"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("GetRefPackageJobResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobName(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].JobName"));
			job.setProjectName(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].ProjectName"));
			job.setJobType(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].JobType"));
			job.setApiType(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].ApiType"));
			job.setCode(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Code"));
			job.setPlanJson(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].PlanJson"));
			job.setProperties(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Properties"));
			job.setPackages(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Packages"));
			job.setIsCommitted(context.booleanValue("GetRefPackageJobResponse.Jobs["+ i +"].IsCommitted"));
			job.setCreator(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Creator"));
			job.setCreateTime(context.longValue("GetRefPackageJobResponse.Jobs["+ i +"].CreateTime"));
			job.setModifier(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Modifier"));
			job.setModifyTime(context.longValue("GetRefPackageJobResponse.Jobs["+ i +"].ModifyTime"));
			job.setDescription(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].Description"));
			job.setEngineVersion(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].EngineVersion"));
			job.setClusterId(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].ClusterId"));
			job.setQueueName(context.stringValue("GetRefPackageJobResponse.Jobs["+ i +"].QueueName"));
			job.setFolderId(context.longValue("GetRefPackageJobResponse.Jobs["+ i +"].FolderId"));

			jobs.add(job);
		}
		getRefPackageJobResponse.setJobs(jobs);
	 
	 	return getRefPackageJobResponse;
	}
}