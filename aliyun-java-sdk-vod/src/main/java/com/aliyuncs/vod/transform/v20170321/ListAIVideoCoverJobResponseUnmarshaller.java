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
package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListAIVideoCoverJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIVideoCoverJobResponse.AIVideoCoverJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIVideoCoverJobResponseUnmarshaller {

	public static ListAIVideoCoverJobResponse unmarshall(ListAIVideoCoverJobResponse listAIVideoCoverJobResponse, UnmarshallerContext context) {
		
		listAIVideoCoverJobResponse.setRequestId(context.stringValue("ListAIVideoCoverJobResponse.RequestId"));

		List<String> nonExistAIVideoCoverJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIVideoCoverJobResponse.NonExistAIVideoCoverJobIds.Length"); i++) {
			nonExistAIVideoCoverJobIds.add(context.stringValue("ListAIVideoCoverJobResponse.NonExistAIVideoCoverJobIds["+ i +"]"));
		}
		listAIVideoCoverJobResponse.setNonExistAIVideoCoverJobIds(nonExistAIVideoCoverJobIds);

		List<AIVideoCoverJob> aIVideoCoverJobList = new ArrayList<AIVideoCoverJob>();
		for (int i = 0; i < context.lengthValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList.Length"); i++) {
			AIVideoCoverJob aIVideoCoverJob = new AIVideoCoverJob();
			aIVideoCoverJob.setJobId(context.stringValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList["+ i +"].JobId"));
			aIVideoCoverJob.setMediaId(context.stringValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList["+ i +"].MediaId"));
			aIVideoCoverJob.setStatus(context.stringValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList["+ i +"].Status"));
			aIVideoCoverJob.setCode(context.stringValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList["+ i +"].Code"));
			aIVideoCoverJob.setMessage(context.stringValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList["+ i +"].Message"));
			aIVideoCoverJob.setCreationTime(context.stringValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList["+ i +"].CreationTime"));
			aIVideoCoverJob.setData(context.stringValue("ListAIVideoCoverJobResponse.AIVideoCoverJobList["+ i +"].Data"));

			aIVideoCoverJobList.add(aIVideoCoverJob);
		}
		listAIVideoCoverJobResponse.setAIVideoCoverJobList(aIVideoCoverJobList);
	 
	 	return listAIVideoCoverJobResponse;
	}
}