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

import com.aliyuncs.mts.model.v20140618.DeleteMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.DeleteMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMediaWorkflowResponseUnmarshaller {

	public static DeleteMediaWorkflowResponse unmarshall(DeleteMediaWorkflowResponse deleteMediaWorkflowResponse, UnmarshallerContext _ctx) {
		
		deleteMediaWorkflowResponse.setRequestId(_ctx.stringValue("DeleteMediaWorkflowResponse.RequestId"));

		MediaWorkflow mediaWorkflow = new MediaWorkflow();
		mediaWorkflow.setCreationTime(_ctx.stringValue("DeleteMediaWorkflowResponse.MediaWorkflow.CreationTime"));
		mediaWorkflow.setMediaWorkflowId(_ctx.stringValue("DeleteMediaWorkflowResponse.MediaWorkflow.MediaWorkflowId"));
		mediaWorkflow.setState(_ctx.stringValue("DeleteMediaWorkflowResponse.MediaWorkflow.State"));
		mediaWorkflow.setName(_ctx.stringValue("DeleteMediaWorkflowResponse.MediaWorkflow.Name"));
		mediaWorkflow.setTopology(_ctx.stringValue("DeleteMediaWorkflowResponse.MediaWorkflow.Topology"));
		deleteMediaWorkflowResponse.setMediaWorkflow(mediaWorkflow);
	 
	 	return deleteMediaWorkflowResponse;
	}
}