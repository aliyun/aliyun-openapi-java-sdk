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

import com.aliyuncs.sofa.model.v20190815.ExecLinkefabricFabricHeaddrmtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkefabricFabricHeaddrmtaskResponseUnmarshaller {

	public static ExecLinkefabricFabricHeaddrmtaskResponse unmarshall(ExecLinkefabricFabricHeaddrmtaskResponse execLinkefabricFabricHeaddrmtaskResponse, UnmarshallerContext _ctx) {
		
		execLinkefabricFabricHeaddrmtaskResponse.setRequestId(_ctx.stringValue("ExecLinkefabricFabricHeaddrmtaskResponse.RequestId"));
		execLinkefabricFabricHeaddrmtaskResponse.setResultCode(_ctx.stringValue("ExecLinkefabricFabricHeaddrmtaskResponse.ResultCode"));
		execLinkefabricFabricHeaddrmtaskResponse.setResultMessage(_ctx.stringValue("ExecLinkefabricFabricHeaddrmtaskResponse.ResultMessage"));
		execLinkefabricFabricHeaddrmtaskResponse.setData(_ctx.booleanValue("ExecLinkefabricFabricHeaddrmtaskResponse.Data"));
		execLinkefabricFabricHeaddrmtaskResponse.setMessage(_ctx.stringValue("ExecLinkefabricFabricHeaddrmtaskResponse.Message"));
		execLinkefabricFabricHeaddrmtaskResponse.setResponseStatusCode(_ctx.longValue("ExecLinkefabricFabricHeaddrmtaskResponse.ResponseStatusCode"));
		execLinkefabricFabricHeaddrmtaskResponse.setSuccess(_ctx.booleanValue("ExecLinkefabricFabricHeaddrmtaskResponse.Success"));
	 
	 	return execLinkefabricFabricHeaddrmtaskResponse;
	}
}