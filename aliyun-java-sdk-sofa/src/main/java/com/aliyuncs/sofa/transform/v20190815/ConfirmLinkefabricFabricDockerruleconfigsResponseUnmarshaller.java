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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricDockerruleconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkefabricFabricDockerruleconfigsResponseUnmarshaller {

	public static ConfirmLinkefabricFabricDockerruleconfigsResponse unmarshall(ConfirmLinkefabricFabricDockerruleconfigsResponse confirmLinkefabricFabricDockerruleconfigsResponse, UnmarshallerContext _ctx) {
		
		confirmLinkefabricFabricDockerruleconfigsResponse.setRequestId(_ctx.stringValue("ConfirmLinkefabricFabricDockerruleconfigsResponse.RequestId"));
		confirmLinkefabricFabricDockerruleconfigsResponse.setResultCode(_ctx.stringValue("ConfirmLinkefabricFabricDockerruleconfigsResponse.ResultCode"));
		confirmLinkefabricFabricDockerruleconfigsResponse.setResultMessage(_ctx.stringValue("ConfirmLinkefabricFabricDockerruleconfigsResponse.ResultMessage"));
		confirmLinkefabricFabricDockerruleconfigsResponse.setData(_ctx.stringValue("ConfirmLinkefabricFabricDockerruleconfigsResponse.Data"));
		confirmLinkefabricFabricDockerruleconfigsResponse.setMessage(_ctx.stringValue("ConfirmLinkefabricFabricDockerruleconfigsResponse.Message"));
		confirmLinkefabricFabricDockerruleconfigsResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkefabricFabricDockerruleconfigsResponse.ResponseStatusCode"));
		confirmLinkefabricFabricDockerruleconfigsResponse.setSuccess(_ctx.booleanValue("ConfirmLinkefabricFabricDockerruleconfigsResponse.Success"));
	 
	 	return confirmLinkefabricFabricDockerruleconfigsResponse;
	}
}