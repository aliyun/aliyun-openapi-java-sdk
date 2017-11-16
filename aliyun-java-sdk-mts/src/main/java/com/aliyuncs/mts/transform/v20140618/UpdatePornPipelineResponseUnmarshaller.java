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

import com.aliyuncs.mts.model.v20140618.UpdatePornPipelineResponse;
import com.aliyuncs.mts.model.v20140618.UpdatePornPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.UpdatePornPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePornPipelineResponseUnmarshaller {

	public static UpdatePornPipelineResponse unmarshall(UpdatePornPipelineResponse updatePornPipelineResponse, UnmarshallerContext context) {
		
		updatePornPipelineResponse.setRequestId(context.stringValue("UpdatePornPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("UpdatePornPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("UpdatePornPipelineResponse.Pipeline.Name"));
		pipeline.setState(context.stringValue("UpdatePornPipelineResponse.Pipeline.State"));
		pipeline.setPriority(context.integerValue("UpdatePornPipelineResponse.Pipeline.Priority"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("UpdatePornPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(context.stringValue("UpdatePornPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		updatePornPipelineResponse.setPipeline(pipeline);
	 
	 	return updatePornPipelineResponse;
	}
}