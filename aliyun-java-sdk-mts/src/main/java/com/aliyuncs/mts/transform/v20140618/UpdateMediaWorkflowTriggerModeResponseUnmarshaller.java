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

import com.aliyuncs.mts.model.v20140618.UpdateMediaWorkflowTriggerModeResponse;
import com.aliyuncs.mts.model.v20140618.UpdateMediaWorkflowTriggerModeResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMediaWorkflowTriggerModeResponseUnmarshaller {

	public static UpdateMediaWorkflowTriggerModeResponse unmarshall(UpdateMediaWorkflowTriggerModeResponse updateMediaWorkflowTriggerModeResponse, UnmarshallerContext context) {
		
		updateMediaWorkflowTriggerModeResponse.setRequestId(context.stringValue("UpdateMediaWorkflowTriggerModeResponse.RequestId"));

		MediaWorkflow mediaWorkflow = new MediaWorkflow();
		mediaWorkflow.setMediaWorkflowId(context.stringValue("UpdateMediaWorkflowTriggerModeResponse.MediaWorkflow.MediaWorkflowId"));
		mediaWorkflow.setName(context.stringValue("UpdateMediaWorkflowTriggerModeResponse.MediaWorkflow.Name"));
		mediaWorkflow.setTopology(context.stringValue("UpdateMediaWorkflowTriggerModeResponse.MediaWorkflow.Topology"));
		mediaWorkflow.setTriggerMode(context.stringValue("UpdateMediaWorkflowTriggerModeResponse.MediaWorkflow.TriggerMode"));
		mediaWorkflow.setState(context.stringValue("UpdateMediaWorkflowTriggerModeResponse.MediaWorkflow.State"));
		mediaWorkflow.setCreationTime(context.stringValue("UpdateMediaWorkflowTriggerModeResponse.MediaWorkflow.CreationTime"));
		updateMediaWorkflowTriggerModeResponse.setMediaWorkflow(mediaWorkflow);
	 
	 	return updateMediaWorkflowTriggerModeResponse;
	}
}