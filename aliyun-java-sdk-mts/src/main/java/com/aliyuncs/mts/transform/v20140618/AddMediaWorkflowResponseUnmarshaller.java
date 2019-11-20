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

import com.aliyuncs.mts.model.v20140618.AddMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.AddMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMediaWorkflowResponseUnmarshaller {

	public static AddMediaWorkflowResponse unmarshall(AddMediaWorkflowResponse addMediaWorkflowResponse, UnmarshallerContext _ctx) {
		
		addMediaWorkflowResponse.setRequestId(_ctx.stringValue("AddMediaWorkflowResponse.RequestId"));

		MediaWorkflow mediaWorkflow = new MediaWorkflow();
		mediaWorkflow.setMediaWorkflowId(_ctx.stringValue("AddMediaWorkflowResponse.MediaWorkflow.MediaWorkflowId"));
		mediaWorkflow.setName(_ctx.stringValue("AddMediaWorkflowResponse.MediaWorkflow.Name"));
		mediaWorkflow.setTopology(_ctx.stringValue("AddMediaWorkflowResponse.MediaWorkflow.Topology"));
		mediaWorkflow.setTriggerMode(_ctx.stringValue("AddMediaWorkflowResponse.MediaWorkflow.TriggerMode"));
		mediaWorkflow.setState(_ctx.stringValue("AddMediaWorkflowResponse.MediaWorkflow.State"));
		mediaWorkflow.setCreationTime(_ctx.stringValue("AddMediaWorkflowResponse.MediaWorkflow.CreationTime"));
		addMediaWorkflowResponse.setMediaWorkflow(mediaWorkflow);
	 
	 	return addMediaWorkflowResponse;
	}
}