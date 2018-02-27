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
package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListTagJobsResponse;
import com.aliyuncs.imm.model.v20170906.ListTagJobsResponse.JobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagJobsResponseUnmarshaller {

	public static ListTagJobsResponse unmarshall(ListTagJobsResponse listTagJobsResponse, UnmarshallerContext context) {
		
		listTagJobsResponse.setRequestId(context.stringValue("ListTagJobsResponse.RequestId"));
		listTagJobsResponse.setNextMarker(context.stringValue("ListTagJobsResponse.NextMarker"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < context.lengthValue("ListTagJobsResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setJobId(context.stringValue("ListTagJobsResponse.Jobs["+ i +"].JobId"));
			jobsItem.setSetId(context.stringValue("ListTagJobsResponse.Jobs["+ i +"].SetId"));
			jobsItem.setSrcUri(context.stringValue("ListTagJobsResponse.Jobs["+ i +"].SrcUri"));
			jobsItem.setStatus(context.stringValue("ListTagJobsResponse.Jobs["+ i +"].Status"));
			jobsItem.setPercent(context.integerValue("ListTagJobsResponse.Jobs["+ i +"].Percent"));
			jobsItem.setCreateTime(context.stringValue("ListTagJobsResponse.Jobs["+ i +"].CreateTime"));
			jobsItem.setFinishTime(context.stringValue("ListTagJobsResponse.Jobs["+ i +"].FinishTime"));

			jobs.add(jobsItem);
		}
		listTagJobsResponse.setJobs(jobs);
	 
	 	return listTagJobsResponse;
	}
}