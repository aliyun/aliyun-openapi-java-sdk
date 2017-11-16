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

import com.aliyuncs.mts.model.v20140618.QueryVideoSummaryPipelineListResponse;
import com.aliyuncs.mts.model.v20140618.QueryVideoSummaryPipelineListResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.QueryVideoSummaryPipelineListResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVideoSummaryPipelineListResponseUnmarshaller {

	public static QueryVideoSummaryPipelineListResponse unmarshall(QueryVideoSummaryPipelineListResponse queryVideoSummaryPipelineListResponse, UnmarshallerContext context) {
		
		queryVideoSummaryPipelineListResponse.setRequestId(context.stringValue("QueryVideoSummaryPipelineListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryVideoSummaryPipelineListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryVideoSummaryPipelineListResponse.NonExistIds["+ i +"]"));
		}
		queryVideoSummaryPipelineListResponse.setNonExistIds(nonExistIds);

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < context.lengthValue("QueryVideoSummaryPipelineListResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(context.stringValue("QueryVideoSummaryPipelineListResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(context.stringValue("QueryVideoSummaryPipelineListResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(context.stringValue("QueryVideoSummaryPipelineListResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(context.stringValue("QueryVideoSummaryPipelineListResponse.PipelineList["+ i +"].Priority"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(context.stringValue("QueryVideoSummaryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueueName(context.stringValue("QueryVideoSummaryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.QueueName"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		queryVideoSummaryPipelineListResponse.setPipelineList(pipelineList);
	 
	 	return queryVideoSummaryPipelineListResponse;
	}
}