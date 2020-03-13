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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktWorkflowstatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktWorkflowstatusResponseUnmarshaller {

	public static DeleteLinkeLinktWorkflowstatusResponse unmarshall(DeleteLinkeLinktWorkflowstatusResponse deleteLinkeLinktWorkflowstatusResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktWorkflowstatusResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktWorkflowstatusResponse.RequestId"));
		deleteLinkeLinktWorkflowstatusResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktWorkflowstatusResponse.ResultCode"));
		deleteLinkeLinktWorkflowstatusResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktWorkflowstatusResponse.ResultMessage"));
		deleteLinkeLinktWorkflowstatusResponse.setData(_ctx.booleanValue("DeleteLinkeLinktWorkflowstatusResponse.Data"));
		deleteLinkeLinktWorkflowstatusResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktWorkflowstatusResponse.ErrorCode"));
		deleteLinkeLinktWorkflowstatusResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktWorkflowstatusResponse.ErrorMessage"));
		deleteLinkeLinktWorkflowstatusResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktWorkflowstatusResponse.Success"));
	 
	 	return deleteLinkeLinktWorkflowstatusResponse;
	}
}