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

import com.aliyuncs.imm.model.v20170906.ListPornBatchDetectJobsResponse;
import com.aliyuncs.imm.model.v20170906.ListPornBatchDetectJobsResponse.JobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPornBatchDetectJobsResponseUnmarshaller {

	public static ListPornBatchDetectJobsResponse unmarshall(ListPornBatchDetectJobsResponse listPornBatchDetectJobsResponse, UnmarshallerContext context) {
		
		listPornBatchDetectJobsResponse.setRequestId(context.stringValue("ListPornBatchDetectJobsResponse.RequestId"));
		listPornBatchDetectJobsResponse.setNextMarker(context.stringValue("ListPornBatchDetectJobsResponse.NextMarker"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < context.lengthValue("ListPornBatchDetectJobsResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setJobId(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].JobId"));
			jobsItem.setSrcUri(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].SrcUri"));
			jobsItem.setStatus(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].Status"));
			jobsItem.setTgtUri(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].TgtUri"));
			jobsItem.setNotifyTopicName(context.integerValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].NotifyTopicName"));
			jobsItem.setNotifyEndpoint(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].NotifyEndpoint"));
			jobsItem.setExternalID(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].ExternalID"));
			jobsItem.setCreateTime(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].CreateTime"));
			jobsItem.setFinishTime(context.stringValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].FinishTime"));
			jobsItem.setPercent(context.integerValue("ListPornBatchDetectJobsResponse.Jobs["+ i +"].Percent"));

			jobs.add(jobsItem);
		}
		listPornBatchDetectJobsResponse.setJobs(jobs);
	 
	 	return listPornBatchDetectJobsResponse;
	}
}