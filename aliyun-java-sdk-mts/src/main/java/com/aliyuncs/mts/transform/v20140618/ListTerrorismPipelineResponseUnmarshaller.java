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

import com.aliyuncs.mts.model.v20140618.ListTerrorismPipelineResponse;
import com.aliyuncs.mts.model.v20140618.ListTerrorismPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.ListTerrorismPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTerrorismPipelineResponseUnmarshaller {

	public static ListTerrorismPipelineResponse unmarshall(ListTerrorismPipelineResponse listTerrorismPipelineResponse, UnmarshallerContext context) {
		
		listTerrorismPipelineResponse.setRequestId(context.stringValue("ListTerrorismPipelineResponse.RequestId"));
		listTerrorismPipelineResponse.setTotalCount(context.longValue("ListTerrorismPipelineResponse.TotalCount"));
		listTerrorismPipelineResponse.setPageNumber(context.longValue("ListTerrorismPipelineResponse.PageNumber"));
		listTerrorismPipelineResponse.setPageSize(context.longValue("ListTerrorismPipelineResponse.PageSize"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < context.lengthValue("ListTerrorismPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(context.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(context.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(context.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(context.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].Priority"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(context.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueue(context.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].NotifyConfig.Queue"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		listTerrorismPipelineResponse.setPipelineList(pipelineList);
	 
	 	return listTerrorismPipelineResponse;
	}
}