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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricSwconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkefabricFabricSwconfigsResponseUnmarshaller {

	public static ConfirmLinkefabricFabricSwconfigsResponse unmarshall(ConfirmLinkefabricFabricSwconfigsResponse confirmLinkefabricFabricSwconfigsResponse, UnmarshallerContext _ctx) {
		
		confirmLinkefabricFabricSwconfigsResponse.setRequestId(_ctx.stringValue("ConfirmLinkefabricFabricSwconfigsResponse.RequestId"));
		confirmLinkefabricFabricSwconfigsResponse.setResultCode(_ctx.stringValue("ConfirmLinkefabricFabricSwconfigsResponse.ResultCode"));
		confirmLinkefabricFabricSwconfigsResponse.setResultMessage(_ctx.stringValue("ConfirmLinkefabricFabricSwconfigsResponse.ResultMessage"));
		confirmLinkefabricFabricSwconfigsResponse.setData(_ctx.stringValue("ConfirmLinkefabricFabricSwconfigsResponse.Data"));
		confirmLinkefabricFabricSwconfigsResponse.setMessage(_ctx.stringValue("ConfirmLinkefabricFabricSwconfigsResponse.Message"));
		confirmLinkefabricFabricSwconfigsResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkefabricFabricSwconfigsResponse.ResponseStatusCode"));
		confirmLinkefabricFabricSwconfigsResponse.setSuccess(_ctx.booleanValue("ConfirmLinkefabricFabricSwconfigsResponse.Success"));
	 
	 	return confirmLinkefabricFabricSwconfigsResponse;
	}
}