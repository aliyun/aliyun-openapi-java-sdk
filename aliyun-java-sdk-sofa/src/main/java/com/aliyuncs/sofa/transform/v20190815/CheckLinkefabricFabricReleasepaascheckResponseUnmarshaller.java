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

import com.aliyuncs.sofa.model.v20190815.CheckLinkefabricFabricReleasepaascheckResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkefabricFabricReleasepaascheckResponseUnmarshaller {

	public static CheckLinkefabricFabricReleasepaascheckResponse unmarshall(CheckLinkefabricFabricReleasepaascheckResponse checkLinkefabricFabricReleasepaascheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkefabricFabricReleasepaascheckResponse.setRequestId(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckResponse.RequestId"));
		checkLinkefabricFabricReleasepaascheckResponse.setResultCode(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckResponse.ResultCode"));
		checkLinkefabricFabricReleasepaascheckResponse.setResultMessage(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckResponse.ResultMessage"));
		checkLinkefabricFabricReleasepaascheckResponse.setData(_ctx.booleanValue("CheckLinkefabricFabricReleasepaascheckResponse.Data"));
		checkLinkefabricFabricReleasepaascheckResponse.setMessage(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckResponse.Message"));
		checkLinkefabricFabricReleasepaascheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkefabricFabricReleasepaascheckResponse.ResponseStatusCode"));
		checkLinkefabricFabricReleasepaascheckResponse.setSuccess(_ctx.booleanValue("CheckLinkefabricFabricReleasepaascheckResponse.Success"));
	 
	 	return checkLinkefabricFabricReleasepaascheckResponse;
	}
}