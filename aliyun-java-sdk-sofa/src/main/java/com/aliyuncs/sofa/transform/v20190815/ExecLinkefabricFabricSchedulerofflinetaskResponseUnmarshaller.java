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

import com.aliyuncs.sofa.model.v20190815.ExecLinkefabricFabricSchedulerofflinetaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkefabricFabricSchedulerofflinetaskResponseUnmarshaller {

	public static ExecLinkefabricFabricSchedulerofflinetaskResponse unmarshall(ExecLinkefabricFabricSchedulerofflinetaskResponse execLinkefabricFabricSchedulerofflinetaskResponse, UnmarshallerContext _ctx) {
		
		execLinkefabricFabricSchedulerofflinetaskResponse.setRequestId(_ctx.stringValue("ExecLinkefabricFabricSchedulerofflinetaskResponse.RequestId"));
		execLinkefabricFabricSchedulerofflinetaskResponse.setResultCode(_ctx.stringValue("ExecLinkefabricFabricSchedulerofflinetaskResponse.ResultCode"));
		execLinkefabricFabricSchedulerofflinetaskResponse.setResultMessage(_ctx.stringValue("ExecLinkefabricFabricSchedulerofflinetaskResponse.ResultMessage"));
		execLinkefabricFabricSchedulerofflinetaskResponse.setData(_ctx.booleanValue("ExecLinkefabricFabricSchedulerofflinetaskResponse.Data"));
		execLinkefabricFabricSchedulerofflinetaskResponse.setMessage(_ctx.stringValue("ExecLinkefabricFabricSchedulerofflinetaskResponse.Message"));
		execLinkefabricFabricSchedulerofflinetaskResponse.setResponseStatusCode(_ctx.longValue("ExecLinkefabricFabricSchedulerofflinetaskResponse.ResponseStatusCode"));
		execLinkefabricFabricSchedulerofflinetaskResponse.setSuccess(_ctx.booleanValue("ExecLinkefabricFabricSchedulerofflinetaskResponse.Success"));
	 
	 	return execLinkefabricFabricSchedulerofflinetaskResponse;
	}
}