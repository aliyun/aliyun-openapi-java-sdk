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
package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowListResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaWorkflowListResponseUnmarshaller {

	public static QueryMediaWorkflowListResponse unmarshall(QueryMediaWorkflowListResponse queryMediaWorkflowListResponse, UnmarshallerContext context) {
		
		queryMediaWorkflowListResponse.setRequestId(context.stringValue("QueryMediaWorkflowListResponse.RequestId"));

		List<String> nonExistMediaWorkflowIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaWorkflowListResponse.NonExistMediaWorkflowIds.Length"); i++) {
			nonExistMediaWorkflowIds.add(context.stringValue("QueryMediaWorkflowListResponse.NonExistMediaWorkflowIds["+ i +"]"));
		}
		queryMediaWorkflowListResponse.setNonExistMediaWorkflowIds(nonExistMediaWorkflowIds);

		List<MediaWorkflow> mediaWorkflowList = new ArrayList<MediaWorkflow>();
		for (int i = 0; i < context.lengthValue("QueryMediaWorkflowListResponse.MediaWorkflowList.Length"); i++) {
			MediaWorkflow mediaWorkflow = new MediaWorkflow();
			mediaWorkflow.setMediaWorkflowId(context.stringValue("QueryMediaWorkflowListResponse.MediaWorkflowList["+ i +"].MediaWorkflowId"));
			mediaWorkflow.setName(context.stringValue("QueryMediaWorkflowListResponse.MediaWorkflowList["+ i +"].Name"));
			mediaWorkflow.setTopology(context.stringValue("QueryMediaWorkflowListResponse.MediaWorkflowList["+ i +"].Topology"));
			mediaWorkflow.setState(context.stringValue("QueryMediaWorkflowListResponse.MediaWorkflowList["+ i +"].State"));
			mediaWorkflow.setCreationTime(context.stringValue("QueryMediaWorkflowListResponse.MediaWorkflowList["+ i +"].CreationTime"));

			mediaWorkflowList.add(mediaWorkflow);
		}
		queryMediaWorkflowListResponse.setMediaWorkflowList(mediaWorkflowList);
	 
	 	return queryMediaWorkflowListResponse;
	}
}