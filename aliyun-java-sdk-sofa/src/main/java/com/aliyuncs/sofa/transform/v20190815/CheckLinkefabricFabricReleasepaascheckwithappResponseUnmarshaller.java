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

import com.aliyuncs.sofa.model.v20190815.CheckLinkefabricFabricReleasepaascheckwithappResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkefabricFabricReleasepaascheckwithappResponseUnmarshaller {

	public static CheckLinkefabricFabricReleasepaascheckwithappResponse unmarshall(CheckLinkefabricFabricReleasepaascheckwithappResponse checkLinkefabricFabricReleasepaascheckwithappResponse, UnmarshallerContext _ctx) {
		
		checkLinkefabricFabricReleasepaascheckwithappResponse.setRequestId(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckwithappResponse.RequestId"));
		checkLinkefabricFabricReleasepaascheckwithappResponse.setResultCode(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckwithappResponse.ResultCode"));
		checkLinkefabricFabricReleasepaascheckwithappResponse.setResultMessage(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckwithappResponse.ResultMessage"));
		checkLinkefabricFabricReleasepaascheckwithappResponse.setData(_ctx.booleanValue("CheckLinkefabricFabricReleasepaascheckwithappResponse.Data"));
		checkLinkefabricFabricReleasepaascheckwithappResponse.setMessage(_ctx.stringValue("CheckLinkefabricFabricReleasepaascheckwithappResponse.Message"));
		checkLinkefabricFabricReleasepaascheckwithappResponse.setResponseStatusCode(_ctx.longValue("CheckLinkefabricFabricReleasepaascheckwithappResponse.ResponseStatusCode"));
		checkLinkefabricFabricReleasepaascheckwithappResponse.setSuccess(_ctx.booleanValue("CheckLinkefabricFabricReleasepaascheckwithappResponse.Success"));
	 
	 	return checkLinkefabricFabricReleasepaascheckwithappResponse;
	}
}