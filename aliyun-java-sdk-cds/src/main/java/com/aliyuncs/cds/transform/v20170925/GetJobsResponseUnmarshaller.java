/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cds.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cds.model.v20170925.GetJobsResponse;
import com.aliyuncs.cds.model.v20170925.GetJobsResponse.Job;
import com.aliyuncs.cds.model.v20170925.GetJobsResponse.Job.LastFailedBuild;
import com.aliyuncs.cds.model.v20170925.GetJobsResponse.Job.LastSuccessfulBuild;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobsResponseUnmarshaller {

	public static GetJobsResponse unmarshall(GetJobsResponse getJobsResponse, UnmarshallerContext context) {
		
		getJobsResponse.setRequestId(context.stringValue("GetJobsResponse.RequestId"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("GetJobsResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobName(context.stringValue("GetJobsResponse.Jobs["+ i +"].JobName"));
			job.setSuccessRate(context.floatValue("GetJobsResponse.Jobs["+ i +"].SuccessRate"));
			job.setTotalBuilds(context.integerValue("GetJobsResponse.Jobs["+ i +"].TotalBuilds"));

			LastFailedBuild lastFailedBuild = new LastFailedBuild();
			lastFailedBuild.setBuildNumber(context.stringValue("GetJobsResponse.Jobs["+ i +"].LastFailedBuild.BuildNumber"));
			lastFailedBuild.setDuration(context.longValue("GetJobsResponse.Jobs["+ i +"].LastFailedBuild.Duration"));
			lastFailedBuild.setStartTime(context.longValue("GetJobsResponse.Jobs["+ i +"].LastFailedBuild.StartTime"));
			lastFailedBuild.setLog(context.stringValue("GetJobsResponse.Jobs["+ i +"].LastFailedBuild.Log"));
			lastFailedBuild.setBuildEnv(context.stringValue("GetJobsResponse.Jobs["+ i +"].LastFailedBuild.BuildEnv"));
			job.setLastFailedBuild(lastFailedBuild);

			LastSuccessfulBuild lastSuccessfulBuild = new LastSuccessfulBuild();
			lastSuccessfulBuild.setBuildNumber(context.integerValue("GetJobsResponse.Jobs["+ i +"].LastSuccessfulBuild.BuildNumber"));
			lastSuccessfulBuild.setDuration(context.integerValue("GetJobsResponse.Jobs["+ i +"].LastSuccessfulBuild.Duration"));
			lastSuccessfulBuild.setStartTime(context.longValue("GetJobsResponse.Jobs["+ i +"].LastSuccessfulBuild.StartTime"));
			lastSuccessfulBuild.setLog(context.stringValue("GetJobsResponse.Jobs["+ i +"].LastSuccessfulBuild.Log"));
			lastSuccessfulBuild.setBuildEnv(context.stringValue("GetJobsResponse.Jobs["+ i +"].LastSuccessfulBuild.BuildEnv"));
			job.setLastSuccessfulBuild(lastSuccessfulBuild);

			jobs.add(job);
		}
		getJobsResponse.setJobs(jobs);
	 
	 	return getJobsResponse;
	}
}