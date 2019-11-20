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

import com.aliyuncs.mts.model.v20140618.DeactivateMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.DeactivateMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeactivateMediaWorkflowResponseUnmarshaller {

	public static DeactivateMediaWorkflowResponse unmarshall(DeactivateMediaWorkflowResponse deactivateMediaWorkflowResponse, UnmarshallerContext _ctx) {
		
		deactivateMediaWorkflowResponse.setRequestId(_ctx.stringValue("DeactivateMediaWorkflowResponse.RequestId"));

		MediaWorkflow mediaWorkflow = new MediaWorkflow();
		mediaWorkflow.setMediaWorkflowId(_ctx.stringValue("DeactivateMediaWorkflowResponse.MediaWorkflow.MediaWorkflowId"));
		mediaWorkflow.setName(_ctx.stringValue("DeactivateMediaWorkflowResponse.MediaWorkflow.Name"));
		mediaWorkflow.setTopology(_ctx.stringValue("DeactivateMediaWorkflowResponse.MediaWorkflow.Topology"));
		mediaWorkflow.setState(_ctx.stringValue("DeactivateMediaWorkflowResponse.MediaWorkflow.State"));
		mediaWorkflow.setCreationTime(_ctx.stringValue("DeactivateMediaWorkflowResponse.MediaWorkflow.CreationTime"));
		deactivateMediaWorkflowResponse.setMediaWorkflow(mediaWorkflow);
	 
	 	return deactivateMediaWorkflowResponse;
	}
}