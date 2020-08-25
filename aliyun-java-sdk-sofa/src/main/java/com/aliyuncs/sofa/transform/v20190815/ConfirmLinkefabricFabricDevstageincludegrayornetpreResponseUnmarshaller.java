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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkefabricFabricDevstageincludegrayornetpreResponseUnmarshaller {

	public static ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse unmarshall(ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse confirmLinkefabricFabricDevstageincludegrayornetpreResponse, UnmarshallerContext _ctx) {
		
		confirmLinkefabricFabricDevstageincludegrayornetpreResponse.setRequestId(_ctx.stringValue("ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse.RequestId"));
		confirmLinkefabricFabricDevstageincludegrayornetpreResponse.setResultCode(_ctx.stringValue("ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse.ResultCode"));
		confirmLinkefabricFabricDevstageincludegrayornetpreResponse.setResultMessage(_ctx.stringValue("ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse.ResultMessage"));
		confirmLinkefabricFabricDevstageincludegrayornetpreResponse.setData(_ctx.stringValue("ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse.Data"));
		confirmLinkefabricFabricDevstageincludegrayornetpreResponse.setMessage(_ctx.stringValue("ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse.Message"));
		confirmLinkefabricFabricDevstageincludegrayornetpreResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse.ResponseStatusCode"));
		confirmLinkefabricFabricDevstageincludegrayornetpreResponse.setSuccess(_ctx.booleanValue("ConfirmLinkefabricFabricDevstageincludegrayornetpreResponse.Success"));
	 
	 	return confirmLinkefabricFabricDevstageincludegrayornetpreResponse;
	}
}