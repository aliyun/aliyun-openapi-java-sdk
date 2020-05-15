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

import com.aliyuncs.sofa.model.v20190815.SetLinkeLinktWorkflowstatusreachableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeLinktWorkflowstatusreachableResponseUnmarshaller {

	public static SetLinkeLinktWorkflowstatusreachableResponse unmarshall(SetLinkeLinktWorkflowstatusreachableResponse setLinkeLinktWorkflowstatusreachableResponse, UnmarshallerContext _ctx) {
		
		setLinkeLinktWorkflowstatusreachableResponse.setRequestId(_ctx.stringValue("SetLinkeLinktWorkflowstatusreachableResponse.RequestId"));
		setLinkeLinktWorkflowstatusreachableResponse.setResultCode(_ctx.stringValue("SetLinkeLinktWorkflowstatusreachableResponse.ResultCode"));
		setLinkeLinktWorkflowstatusreachableResponse.setResultMessage(_ctx.stringValue("SetLinkeLinktWorkflowstatusreachableResponse.ResultMessage"));
		setLinkeLinktWorkflowstatusreachableResponse.setData(_ctx.booleanValue("SetLinkeLinktWorkflowstatusreachableResponse.Data"));
		setLinkeLinktWorkflowstatusreachableResponse.setErrorCode(_ctx.longValue("SetLinkeLinktWorkflowstatusreachableResponse.ErrorCode"));
		setLinkeLinktWorkflowstatusreachableResponse.setErrorMessage(_ctx.stringValue("SetLinkeLinktWorkflowstatusreachableResponse.ErrorMessage"));
		setLinkeLinktWorkflowstatusreachableResponse.setSuccess(_ctx.booleanValue("SetLinkeLinktWorkflowstatusreachableResponse.Success"));
	 
	 	return setLinkeLinktWorkflowstatusreachableResponse;
	}
}