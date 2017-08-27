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

import com.aliyuncs.vod.model.v20170321.SubmitAIVideoPornRecogJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIVideoPornRecogJobResponse.AIVideoPornRecogJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIVideoPornRecogJobResponseUnmarshaller {

	public static SubmitAIVideoPornRecogJobResponse unmarshall(SubmitAIVideoPornRecogJobResponse submitAIVideoPornRecogJobResponse, UnmarshallerContext context) {
		
		submitAIVideoPornRecogJobResponse.setRequestId(context.stringValue("SubmitAIVideoPornRecogJobResponse.RequestId"));

		AIVideoPornRecogJob aIVideoPornRecogJob = new AIVideoPornRecogJob();
		aIVideoPornRecogJob.setId(context.stringValue("SubmitAIVideoPornRecogJobResponse.AIVideoPornRecogJob.Id"));
		aIVideoPornRecogJob.setStatus(context.stringValue("SubmitAIVideoPornRecogJobResponse.AIVideoPornRecogJob.Status"));
		aIVideoPornRecogJob.setCode(context.stringValue("SubmitAIVideoPornRecogJobResponse.AIVideoPornRecogJob.Code"));
		aIVideoPornRecogJob.setMessage(context.stringValue("SubmitAIVideoPornRecogJobResponse.AIVideoPornRecogJob.Message"));
		aIVideoPornRecogJob.setCreationTime(context.stringValue("SubmitAIVideoPornRecogJobResponse.AIVideoPornRecogJob.CreationTime"));
		aIVideoPornRecogJob.setData(context.stringValue("SubmitAIVideoPornRecogJobResponse.AIVideoPornRecogJob.Data"));
		submitAIVideoPornRecogJobResponse.setAIVideoPornRecogJob(aIVideoPornRecogJob);
	 
	 	return submitAIVideoPornRecogJobResponse;
	}
}