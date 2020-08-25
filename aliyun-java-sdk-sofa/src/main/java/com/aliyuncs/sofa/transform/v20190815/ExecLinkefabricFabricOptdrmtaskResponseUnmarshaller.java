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

import com.aliyuncs.sofa.model.v20190815.ExecLinkefabricFabricOptdrmtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkefabricFabricOptdrmtaskResponseUnmarshaller {

	public static ExecLinkefabricFabricOptdrmtaskResponse unmarshall(ExecLinkefabricFabricOptdrmtaskResponse execLinkefabricFabricOptdrmtaskResponse, UnmarshallerContext _ctx) {
		
		execLinkefabricFabricOptdrmtaskResponse.setRequestId(_ctx.stringValue("ExecLinkefabricFabricOptdrmtaskResponse.RequestId"));
		execLinkefabricFabricOptdrmtaskResponse.setResultCode(_ctx.stringValue("ExecLinkefabricFabricOptdrmtaskResponse.ResultCode"));
		execLinkefabricFabricOptdrmtaskResponse.setResultMessage(_ctx.stringValue("ExecLinkefabricFabricOptdrmtaskResponse.ResultMessage"));
		execLinkefabricFabricOptdrmtaskResponse.setData(_ctx.booleanValue("ExecLinkefabricFabricOptdrmtaskResponse.Data"));
		execLinkefabricFabricOptdrmtaskResponse.setMessage(_ctx.stringValue("ExecLinkefabricFabricOptdrmtaskResponse.Message"));
		execLinkefabricFabricOptdrmtaskResponse.setResponseStatusCode(_ctx.longValue("ExecLinkefabricFabricOptdrmtaskResponse.ResponseStatusCode"));
		execLinkefabricFabricOptdrmtaskResponse.setSuccess(_ctx.booleanValue("ExecLinkefabricFabricOptdrmtaskResponse.Success"));
	 
	 	return execLinkefabricFabricOptdrmtaskResponse;
	}
}