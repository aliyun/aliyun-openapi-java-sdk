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
package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListJobsResponse;
import com.aliyuncs.ehpc.model.v20170714.ListJobsResponse.JobInfo;
import com.aliyuncs.ehpc.model.v20170714.ListJobsResponse.JobInfo.Resources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext context) {
		
		listJobsResponse.setRequestId(context.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setTotalCount(context.integerValue("ListJobsResponse.TotalCount"));
		listJobsResponse.setPageNumber(context.integerValue("ListJobsResponse.PageNumber"));
		listJobsResponse.setPageSize(context.integerValue("ListJobsResponse.PageSize"));

		List<JobInfo> jobs = new ArrayList<JobInfo>();
		for (int i = 0; i < context.lengthValue("ListJobsResponse.Jobs.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setId(context.stringValue("ListJobsResponse.Jobs["+ i +"].Id"));
			jobInfo.setName(context.stringValue("ListJobsResponse.Jobs["+ i +"].Name"));
			jobInfo.setOwner(context.stringValue("ListJobsResponse.Jobs["+ i +"].Owner"));
			jobInfo.setPriority(context.integerValue("ListJobsResponse.Jobs["+ i +"].Priority"));
			jobInfo.setState(context.stringValue("ListJobsResponse.Jobs["+ i +"].State"));
			jobInfo.setSubmitTime(context.stringValue("ListJobsResponse.Jobs["+ i +"].SubmitTime"));
			jobInfo.setStartTime(context.stringValue("ListJobsResponse.Jobs["+ i +"].StartTime"));
			jobInfo.setLastModifyTime(context.stringValue("ListJobsResponse.Jobs["+ i +"].LastModifyTime"));
			jobInfo.setStdout(context.stringValue("ListJobsResponse.Jobs["+ i +"].Stdout"));
			jobInfo.setStderr(context.stringValue("ListJobsResponse.Jobs["+ i +"].Stderr"));
			jobInfo.setComment(context.stringValue("ListJobsResponse.Jobs["+ i +"].Comment"));
			jobInfo.setArrayRequest(context.stringValue("ListJobsResponse.Jobs["+ i +"].ArrayRequest"));

			Resources resources = new Resources();
			resources.setNodes(context.integerValue("ListJobsResponse.Jobs["+ i +"].Resources.Nodes"));
			resources.setCores(context.integerValue("ListJobsResponse.Jobs["+ i +"].Resources.Cores"));
			jobInfo.setResources(resources);

			jobs.add(jobInfo);
		}
		listJobsResponse.setJobs(jobs);
	 
	 	return listJobsResponse;
	}
}