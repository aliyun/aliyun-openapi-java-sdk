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

import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowListByNameResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowListByNameResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaWorkflowListByNameResponseUnmarshaller {

	public static QueryMediaWorkflowListByNameResponse unmarshall(QueryMediaWorkflowListByNameResponse queryMediaWorkflowListByNameResponse, UnmarshallerContext context) {
		
		queryMediaWorkflowListByNameResponse.setRequestId(context.stringValue("QueryMediaWorkflowListByNameResponse.RequestId"));

		List<String> nonExistMediaWorkflowNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaWorkflowListByNameResponse.NonExistMediaWorkflowNames.Length"); i++) {
			nonExistMediaWorkflowNames.add(context.stringValue("QueryMediaWorkflowListByNameResponse.NonExistMediaWorkflowNames["+ i +"]"));
		}
		queryMediaWorkflowListByNameResponse.setNonExistMediaWorkflowNames(nonExistMediaWorkflowNames);

		List<MediaWorkflow> mediaWorkflowList = new ArrayList<MediaWorkflow>();
		for (int i = 0; i < context.lengthValue("QueryMediaWorkflowListByNameResponse.MediaWorkflowList.Length"); i++) {
			MediaWorkflow mediaWorkflow = new MediaWorkflow();
			mediaWorkflow.setMediaWorkflowId(context.stringValue("QueryMediaWorkflowListByNameResponse.MediaWorkflowList["+ i +"].MediaWorkflowId"));
			mediaWorkflow.setName(context.stringValue("QueryMediaWorkflowListByNameResponse.MediaWorkflowList["+ i +"].Name"));
			mediaWorkflow.setTopology(context.stringValue("QueryMediaWorkflowListByNameResponse.MediaWorkflowList["+ i +"].Topology"));
			mediaWorkflow.setState(context.stringValue("QueryMediaWorkflowListByNameResponse.MediaWorkflowList["+ i +"].State"));
			mediaWorkflow.setCreationTime(context.stringValue("QueryMediaWorkflowListByNameResponse.MediaWorkflowList["+ i +"].CreationTime"));

			mediaWorkflowList.add(mediaWorkflow);
		}
		queryMediaWorkflowListByNameResponse.setMediaWorkflowList(mediaWorkflowList);
	 
	 	return queryMediaWorkflowListByNameResponse;
	}
}