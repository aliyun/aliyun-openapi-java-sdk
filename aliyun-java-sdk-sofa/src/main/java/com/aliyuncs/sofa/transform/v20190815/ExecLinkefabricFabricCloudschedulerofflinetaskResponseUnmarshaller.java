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

import com.aliyuncs.sofa.model.v20190815.ExecLinkefabricFabricCloudschedulerofflinetaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkefabricFabricCloudschedulerofflinetaskResponseUnmarshaller {

	public static ExecLinkefabricFabricCloudschedulerofflinetaskResponse unmarshall(ExecLinkefabricFabricCloudschedulerofflinetaskResponse execLinkefabricFabricCloudschedulerofflinetaskResponse, UnmarshallerContext _ctx) {
		
		execLinkefabricFabricCloudschedulerofflinetaskResponse.setRequestId(_ctx.stringValue("ExecLinkefabricFabricCloudschedulerofflinetaskResponse.RequestId"));
		execLinkefabricFabricCloudschedulerofflinetaskResponse.setResultCode(_ctx.stringValue("ExecLinkefabricFabricCloudschedulerofflinetaskResponse.ResultCode"));
		execLinkefabricFabricCloudschedulerofflinetaskResponse.setResultMessage(_ctx.stringValue("ExecLinkefabricFabricCloudschedulerofflinetaskResponse.ResultMessage"));
		execLinkefabricFabricCloudschedulerofflinetaskResponse.setData(_ctx.booleanValue("ExecLinkefabricFabricCloudschedulerofflinetaskResponse.Data"));
		execLinkefabricFabricCloudschedulerofflinetaskResponse.setMessage(_ctx.stringValue("ExecLinkefabricFabricCloudschedulerofflinetaskResponse.Message"));
		execLinkefabricFabricCloudschedulerofflinetaskResponse.setResponseStatusCode(_ctx.longValue("ExecLinkefabricFabricCloudschedulerofflinetaskResponse.ResponseStatusCode"));
		execLinkefabricFabricCloudschedulerofflinetaskResponse.setSuccess(_ctx.booleanValue("ExecLinkefabricFabricCloudschedulerofflinetaskResponse.Success"));
	 
	 	return execLinkefabricFabricCloudschedulerofflinetaskResponse;
	}
}