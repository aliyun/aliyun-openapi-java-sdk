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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricShedulerconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkefabricFabricShedulerconfigsResponseUnmarshaller {

	public static ConfirmLinkefabricFabricShedulerconfigsResponse unmarshall(ConfirmLinkefabricFabricShedulerconfigsResponse confirmLinkefabricFabricShedulerconfigsResponse, UnmarshallerContext _ctx) {
		
		confirmLinkefabricFabricShedulerconfigsResponse.setRequestId(_ctx.stringValue("ConfirmLinkefabricFabricShedulerconfigsResponse.RequestId"));
		confirmLinkefabricFabricShedulerconfigsResponse.setResultCode(_ctx.stringValue("ConfirmLinkefabricFabricShedulerconfigsResponse.ResultCode"));
		confirmLinkefabricFabricShedulerconfigsResponse.setResultMessage(_ctx.stringValue("ConfirmLinkefabricFabricShedulerconfigsResponse.ResultMessage"));
		confirmLinkefabricFabricShedulerconfigsResponse.setData(_ctx.stringValue("ConfirmLinkefabricFabricShedulerconfigsResponse.Data"));
		confirmLinkefabricFabricShedulerconfigsResponse.setMessage(_ctx.stringValue("ConfirmLinkefabricFabricShedulerconfigsResponse.Message"));
		confirmLinkefabricFabricShedulerconfigsResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkefabricFabricShedulerconfigsResponse.ResponseStatusCode"));
		confirmLinkefabricFabricShedulerconfigsResponse.setSuccess(_ctx.booleanValue("ConfirmLinkefabricFabricShedulerconfigsResponse.Success"));
	 
	 	return confirmLinkefabricFabricShedulerconfigsResponse;
	}
}