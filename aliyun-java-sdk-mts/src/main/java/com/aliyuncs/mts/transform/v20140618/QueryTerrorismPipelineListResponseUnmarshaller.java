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

import com.aliyuncs.mts.model.v20140618.QueryTerrorismPipelineListResponse;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismPipelineListResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismPipelineListResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTerrorismPipelineListResponseUnmarshaller {

	public static QueryTerrorismPipelineListResponse unmarshall(QueryTerrorismPipelineListResponse queryTerrorismPipelineListResponse, UnmarshallerContext context) {
		
		queryTerrorismPipelineListResponse.setRequestId(context.stringValue("QueryTerrorismPipelineListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryTerrorismPipelineListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryTerrorismPipelineListResponse.NonExistIds["+ i +"]"));
		}
		queryTerrorismPipelineListResponse.setNonExistIds(nonExistIds);

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < context.lengthValue("QueryTerrorismPipelineListResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(context.stringValue("QueryTerrorismPipelineListResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(context.stringValue("QueryTerrorismPipelineListResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(context.stringValue("QueryTerrorismPipelineListResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(context.stringValue("QueryTerrorismPipelineListResponse.PipelineList["+ i +"].Priority"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(context.stringValue("QueryTerrorismPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueue(context.stringValue("QueryTerrorismPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Queue"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		queryTerrorismPipelineListResponse.setPipelineList(pipelineList);
	 
	 	return queryTerrorismPipelineListResponse;
	}
}