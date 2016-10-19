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

import com.aliyuncs.mts.model.v20140618.AddPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPipelineResponseUnmarshaller {

	public static AddPipelineResponse unmarshall(AddPipelineResponse addPipelineResponse, UnmarshallerContext context) {
		
		addPipelineResponse.setRequestId(context.stringValue("AddPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("AddPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("AddPipelineResponse.Pipeline.Name"));
		pipeline.setState(context.stringValue("AddPipelineResponse.Pipeline.State"));
		pipeline.setSpeed(context.stringValue("AddPipelineResponse.Pipeline.Speed"));
		pipeline.setRole(context.stringValue("AddPipelineResponse.Pipeline.Role"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("AddPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueueName(context.stringValue("AddPipelineResponse.Pipeline.NotifyConfig.QueueName"));
		pipeline.setNotifyConfig(notifyConfig);
		addPipelineResponse.setPipeline(pipeline);
	 
	 	return addPipelineResponse;
	}
}