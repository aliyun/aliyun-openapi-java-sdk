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

import com.aliyuncs.mts.model.v20140618.UpdateMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.UpdateMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMediaWorkflowResponseUnmarshaller {

	public static UpdateMediaWorkflowResponse unmarshall(UpdateMediaWorkflowResponse updateMediaWorkflowResponse, UnmarshallerContext context) {
		
		updateMediaWorkflowResponse.setRequestId(context.stringValue("UpdateMediaWorkflowResponse.RequestId"));

		MediaWorkflow mediaWorkflow = new MediaWorkflow();
		mediaWorkflow.setMediaWorkflowId(context.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.MediaWorkflowId"));
		mediaWorkflow.setName(context.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.Name"));
		mediaWorkflow.setTopology(context.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.Topology"));
		mediaWorkflow.setTriggerMode(context.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.TriggerMode"));
		mediaWorkflow.setState(context.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.State"));
		mediaWorkflow.setCreationTime(context.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.CreationTime"));
		updateMediaWorkflowResponse.setMediaWorkflow(mediaWorkflow);
	 
	 	return updateMediaWorkflowResponse;
	}
}