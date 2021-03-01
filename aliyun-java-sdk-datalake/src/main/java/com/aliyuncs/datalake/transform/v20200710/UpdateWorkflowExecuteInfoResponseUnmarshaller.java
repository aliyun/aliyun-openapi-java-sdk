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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.UpdateWorkflowExecuteInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWorkflowExecuteInfoResponseUnmarshaller {

	public static UpdateWorkflowExecuteInfoResponse unmarshall(UpdateWorkflowExecuteInfoResponse updateWorkflowExecuteInfoResponse, UnmarshallerContext _ctx) {
		
		updateWorkflowExecuteInfoResponse.setRequestId(_ctx.stringValue("UpdateWorkflowExecuteInfoResponse.RequestId"));
		updateWorkflowExecuteInfoResponse.setData(_ctx.booleanValue("UpdateWorkflowExecuteInfoResponse.Data"));
		updateWorkflowExecuteInfoResponse.setSuccess(_ctx.stringValue("UpdateWorkflowExecuteInfoResponse.Success"));
	 
	 	return updateWorkflowExecuteInfoResponse;
	}
}