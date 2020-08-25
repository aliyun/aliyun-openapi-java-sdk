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

import com.aliyuncs.sofa.model.v20190815.ExecLinkefabricFabricPostdrmtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkefabricFabricPostdrmtaskResponseUnmarshaller {

	public static ExecLinkefabricFabricPostdrmtaskResponse unmarshall(ExecLinkefabricFabricPostdrmtaskResponse execLinkefabricFabricPostdrmtaskResponse, UnmarshallerContext _ctx) {
		
		execLinkefabricFabricPostdrmtaskResponse.setRequestId(_ctx.stringValue("ExecLinkefabricFabricPostdrmtaskResponse.RequestId"));
		execLinkefabricFabricPostdrmtaskResponse.setResultCode(_ctx.stringValue("ExecLinkefabricFabricPostdrmtaskResponse.ResultCode"));
		execLinkefabricFabricPostdrmtaskResponse.setResultMessage(_ctx.stringValue("ExecLinkefabricFabricPostdrmtaskResponse.ResultMessage"));
		execLinkefabricFabricPostdrmtaskResponse.setData(_ctx.booleanValue("ExecLinkefabricFabricPostdrmtaskResponse.Data"));
		execLinkefabricFabricPostdrmtaskResponse.setMessage(_ctx.stringValue("ExecLinkefabricFabricPostdrmtaskResponse.Message"));
		execLinkefabricFabricPostdrmtaskResponse.setResponseStatusCode(_ctx.longValue("ExecLinkefabricFabricPostdrmtaskResponse.ResponseStatusCode"));
		execLinkefabricFabricPostdrmtaskResponse.setSuccess(_ctx.booleanValue("ExecLinkefabricFabricPostdrmtaskResponse.Success"));
	 
	 	return execLinkefabricFabricPostdrmtaskResponse;
	}
}