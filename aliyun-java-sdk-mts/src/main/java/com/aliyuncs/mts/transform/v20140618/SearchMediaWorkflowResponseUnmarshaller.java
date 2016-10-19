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

import com.aliyuncs.mts.model.v20140618.SearchMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.SearchMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMediaWorkflowResponseUnmarshaller {

	public static SearchMediaWorkflowResponse unmarshall(SearchMediaWorkflowResponse searchMediaWorkflowResponse, UnmarshallerContext context) {
		
		searchMediaWorkflowResponse.setRequestId(context.stringValue("SearchMediaWorkflowResponse.RequestId"));
		searchMediaWorkflowResponse.setTotalCount(context.longValue("SearchMediaWorkflowResponse.TotalCount"));
		searchMediaWorkflowResponse.setPageNumber(context.longValue("SearchMediaWorkflowResponse.PageNumber"));
		searchMediaWorkflowResponse.setPageSize(context.longValue("SearchMediaWorkflowResponse.PageSize"));

		List<MediaWorkflow> mediaWorkflowList = new ArrayList<MediaWorkflow>();
		for (int i = 0; i < context.lengthValue("SearchMediaWorkflowResponse.MediaWorkflowList.Length"); i++) {
			MediaWorkflow mediaWorkflow = new MediaWorkflow();
			mediaWorkflow.setMediaWorkflowId(context.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].MediaWorkflowId"));
			mediaWorkflow.setName(context.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].Name"));
			mediaWorkflow.setTopology(context.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].Topology"));
			mediaWorkflow.setState(context.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].State"));
			mediaWorkflow.setCreationTime(context.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].CreationTime"));

			mediaWorkflowList.add(mediaWorkflow);
		}
		searchMediaWorkflowResponse.setMediaWorkflowList(mediaWorkflowList);
	 
	 	return searchMediaWorkflowResponse;
	}
}