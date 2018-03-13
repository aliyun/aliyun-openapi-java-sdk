/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.ActivateMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.ActivateMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateMediaWorkflowResponseUnmarshaller {

	public static ActivateMediaWorkflowResponse unmarshall(ActivateMediaWorkflowResponse activateMediaWorkflowResponse, UnmarshallerContext context) {
		
		activateMediaWorkflowResponse.setRequestId(context.stringValue("ActivateMediaWorkflowResponse.RequestId"));

		MediaWorkflow mediaWorkflow = new MediaWorkflow();
		mediaWorkflow.setMediaWorkflowId(context.stringValue("ActivateMediaWorkflowResponse.MediaWorkflow.MediaWorkflowId"));
		mediaWorkflow.setName(context.stringValue("ActivateMediaWorkflowResponse.MediaWorkflow.Name"));
		mediaWorkflow.setTopology(context.stringValue("ActivateMediaWorkflowResponse.MediaWorkflow.Topology"));
		mediaWorkflow.setState(context.stringValue("ActivateMediaWorkflowResponse.MediaWorkflow.State"));
		mediaWorkflow.setCreationTime(context.stringValue("ActivateMediaWorkflowResponse.MediaWorkflow.CreationTime"));
		activateMediaWorkflowResponse.setMediaWorkflow(mediaWorkflow);
	 
	 	return activateMediaWorkflowResponse;
	}
}