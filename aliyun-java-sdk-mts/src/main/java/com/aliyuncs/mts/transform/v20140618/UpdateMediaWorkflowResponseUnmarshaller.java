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

import com.aliyuncs.mts.model.v20140618.UpdateMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.UpdateMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMediaWorkflowResponseUnmarshaller {

	public static UpdateMediaWorkflowResponse unmarshall(UpdateMediaWorkflowResponse updateMediaWorkflowResponse, UnmarshallerContext _ctx) {
		
		updateMediaWorkflowResponse.setRequestId(_ctx.stringValue("UpdateMediaWorkflowResponse.RequestId"));

		MediaWorkflow mediaWorkflow = new MediaWorkflow();
		mediaWorkflow.setMediaWorkflowId(_ctx.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.MediaWorkflowId"));
		mediaWorkflow.setName(_ctx.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.Name"));
		mediaWorkflow.setTopology(_ctx.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.Topology"));
		mediaWorkflow.setTriggerMode(_ctx.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.TriggerMode"));
		mediaWorkflow.setState(_ctx.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.State"));
		mediaWorkflow.setCreationTime(_ctx.stringValue("UpdateMediaWorkflowResponse.MediaWorkflow.CreationTime"));
		updateMediaWorkflowResponse.setMediaWorkflow(mediaWorkflow);
	 
	 	return updateMediaWorkflowResponse;
	}
}