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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSwapworkflowstatuspositionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktSwapworkflowstatuspositionResponseUnmarshaller {

	public static ExecLinkeLinktSwapworkflowstatuspositionResponse unmarshall(ExecLinkeLinktSwapworkflowstatuspositionResponse execLinkeLinktSwapworkflowstatuspositionResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktSwapworkflowstatuspositionResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktSwapworkflowstatuspositionResponse.RequestId"));
		execLinkeLinktSwapworkflowstatuspositionResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktSwapworkflowstatuspositionResponse.ResultCode"));
		execLinkeLinktSwapworkflowstatuspositionResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktSwapworkflowstatuspositionResponse.ResultMessage"));
		execLinkeLinktSwapworkflowstatuspositionResponse.setData(_ctx.booleanValue("ExecLinkeLinktSwapworkflowstatuspositionResponse.Data"));
		execLinkeLinktSwapworkflowstatuspositionResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktSwapworkflowstatuspositionResponse.ErrorCode"));
		execLinkeLinktSwapworkflowstatuspositionResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktSwapworkflowstatuspositionResponse.ErrorMessage"));
		execLinkeLinktSwapworkflowstatuspositionResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktSwapworkflowstatuspositionResponse.Success"));
	 
	 	return execLinkeLinktSwapworkflowstatuspositionResponse;
	}
}