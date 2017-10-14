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

import com.aliyuncs.vod.model.v20170321.ListAIASRJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIASRJobResponse.AIASRJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIASRJobResponseUnmarshaller {

	public static ListAIASRJobResponse unmarshall(ListAIASRJobResponse listAIASRJobResponse, UnmarshallerContext context) {
		
		listAIASRJobResponse.setRequestId(context.stringValue("ListAIASRJobResponse.RequestId"));

		List<String> nonExistAIASRJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIASRJobResponse.NonExistAIASRJobIds.Length"); i++) {
			nonExistAIASRJobIds.add(context.stringValue("ListAIASRJobResponse.NonExistAIASRJobIds["+ i +"]"));
		}
		listAIASRJobResponse.setNonExistAIASRJobIds(nonExistAIASRJobIds);

		List<AIASRJob> aIASRJobList = new ArrayList<AIASRJob>();
		for (int i = 0; i < context.lengthValue("ListAIASRJobResponse.AIASRJobList.Length"); i++) {
			AIASRJob aIASRJob = new AIASRJob();
			aIASRJob.setJobId(context.stringValue("ListAIASRJobResponse.AIASRJobList["+ i +"].JobId"));
			aIASRJob.setMediaId(context.stringValue("ListAIASRJobResponse.AIASRJobList["+ i +"].MediaId"));
			aIASRJob.setStatus(context.stringValue("ListAIASRJobResponse.AIASRJobList["+ i +"].Status"));
			aIASRJob.setCode(context.stringValue("ListAIASRJobResponse.AIASRJobList["+ i +"].Code"));
			aIASRJob.setMessage(context.stringValue("ListAIASRJobResponse.AIASRJobList["+ i +"].Message"));
			aIASRJob.setCreationTime(context.stringValue("ListAIASRJobResponse.AIASRJobList["+ i +"].CreationTime"));
			aIASRJob.setData(context.stringValue("ListAIASRJobResponse.AIASRJobList["+ i +"].Data"));

			aIASRJobList.add(aIASRJob);
		}
		listAIASRJobResponse.setAIASRJobList(aIASRJobList);
	 
	 	return listAIASRJobResponse;
	}
}