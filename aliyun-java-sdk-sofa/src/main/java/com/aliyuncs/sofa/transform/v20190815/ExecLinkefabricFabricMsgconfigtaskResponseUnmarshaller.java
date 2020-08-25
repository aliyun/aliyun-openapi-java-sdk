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

import com.aliyuncs.sofa.model.v20190815.ExecLinkefabricFabricMsgconfigtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkefabricFabricMsgconfigtaskResponseUnmarshaller {

	public static ExecLinkefabricFabricMsgconfigtaskResponse unmarshall(ExecLinkefabricFabricMsgconfigtaskResponse execLinkefabricFabricMsgconfigtaskResponse, UnmarshallerContext _ctx) {
		
		execLinkefabricFabricMsgconfigtaskResponse.setRequestId(_ctx.stringValue("ExecLinkefabricFabricMsgconfigtaskResponse.RequestId"));
		execLinkefabricFabricMsgconfigtaskResponse.setResultCode(_ctx.stringValue("ExecLinkefabricFabricMsgconfigtaskResponse.ResultCode"));
		execLinkefabricFabricMsgconfigtaskResponse.setResultMessage(_ctx.stringValue("ExecLinkefabricFabricMsgconfigtaskResponse.ResultMessage"));
		execLinkefabricFabricMsgconfigtaskResponse.setData(_ctx.booleanValue("ExecLinkefabricFabricMsgconfigtaskResponse.Data"));
		execLinkefabricFabricMsgconfigtaskResponse.setMessage(_ctx.stringValue("ExecLinkefabricFabricMsgconfigtaskResponse.Message"));
		execLinkefabricFabricMsgconfigtaskResponse.setResponseStatusCode(_ctx.longValue("ExecLinkefabricFabricMsgconfigtaskResponse.ResponseStatusCode"));
		execLinkefabricFabricMsgconfigtaskResponse.setSuccess(_ctx.booleanValue("ExecLinkefabricFabricMsgconfigtaskResponse.Success"));
	 
	 	return execLinkefabricFabricMsgconfigtaskResponse;
	}
}