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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricSmartdeployconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkefabricFabricSmartdeployconfigsResponseUnmarshaller {

	public static ConfirmLinkefabricFabricSmartdeployconfigsResponse unmarshall(ConfirmLinkefabricFabricSmartdeployconfigsResponse confirmLinkefabricFabricSmartdeployconfigsResponse, UnmarshallerContext _ctx) {
		
		confirmLinkefabricFabricSmartdeployconfigsResponse.setRequestId(_ctx.stringValue("ConfirmLinkefabricFabricSmartdeployconfigsResponse.RequestId"));
		confirmLinkefabricFabricSmartdeployconfigsResponse.setResultCode(_ctx.stringValue("ConfirmLinkefabricFabricSmartdeployconfigsResponse.ResultCode"));
		confirmLinkefabricFabricSmartdeployconfigsResponse.setResultMessage(_ctx.stringValue("ConfirmLinkefabricFabricSmartdeployconfigsResponse.ResultMessage"));
		confirmLinkefabricFabricSmartdeployconfigsResponse.setData(_ctx.booleanValue("ConfirmLinkefabricFabricSmartdeployconfigsResponse.Data"));
		confirmLinkefabricFabricSmartdeployconfigsResponse.setMessage(_ctx.stringValue("ConfirmLinkefabricFabricSmartdeployconfigsResponse.Message"));
		confirmLinkefabricFabricSmartdeployconfigsResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkefabricFabricSmartdeployconfigsResponse.ResponseStatusCode"));
		confirmLinkefabricFabricSmartdeployconfigsResponse.setSuccess(_ctx.booleanValue("ConfirmLinkefabricFabricSmartdeployconfigsResponse.Success"));
	 
	 	return confirmLinkefabricFabricSmartdeployconfigsResponse;
	}
}