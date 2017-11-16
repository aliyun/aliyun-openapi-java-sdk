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

import com.aliyuncs.mts.model.v20140618.AddTerrorismPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddTerrorismPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddTerrorismPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTerrorismPipelineResponseUnmarshaller {

	public static AddTerrorismPipelineResponse unmarshall(AddTerrorismPipelineResponse addTerrorismPipelineResponse, UnmarshallerContext context) {
		
		addTerrorismPipelineResponse.setRequestId(context.stringValue("AddTerrorismPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("AddTerrorismPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("AddTerrorismPipelineResponse.Pipeline.Name"));
		pipeline.setPriority(context.integerValue("AddTerrorismPipelineResponse.Pipeline.Priority"));
		pipeline.setState(context.stringValue("AddTerrorismPipelineResponse.Pipeline.State"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("AddTerrorismPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(context.stringValue("AddTerrorismPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		addTerrorismPipelineResponse.setPipeline(pipeline);
	 
	 	return addTerrorismPipelineResponse;
	}
}