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

import com.aliyuncs.sofa.model.v20190815.GetLinkefabricFabricReleaseprodnotifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkefabricFabricReleaseprodnotifyResponseUnmarshaller {

	public static GetLinkefabricFabricReleaseprodnotifyResponse unmarshall(GetLinkefabricFabricReleaseprodnotifyResponse getLinkefabricFabricReleaseprodnotifyResponse, UnmarshallerContext _ctx) {
		
		getLinkefabricFabricReleaseprodnotifyResponse.setRequestId(_ctx.stringValue("GetLinkefabricFabricReleaseprodnotifyResponse.RequestId"));
		getLinkefabricFabricReleaseprodnotifyResponse.setResultCode(_ctx.stringValue("GetLinkefabricFabricReleaseprodnotifyResponse.ResultCode"));
		getLinkefabricFabricReleaseprodnotifyResponse.setResultMessage(_ctx.stringValue("GetLinkefabricFabricReleaseprodnotifyResponse.ResultMessage"));
		getLinkefabricFabricReleaseprodnotifyResponse.setData(_ctx.booleanValue("GetLinkefabricFabricReleaseprodnotifyResponse.Data"));
		getLinkefabricFabricReleaseprodnotifyResponse.setMessage(_ctx.stringValue("GetLinkefabricFabricReleaseprodnotifyResponse.Message"));
		getLinkefabricFabricReleaseprodnotifyResponse.setResponseStatusCode(_ctx.longValue("GetLinkefabricFabricReleaseprodnotifyResponse.ResponseStatusCode"));
		getLinkefabricFabricReleaseprodnotifyResponse.setSuccess(_ctx.booleanValue("GetLinkefabricFabricReleaseprodnotifyResponse.Success"));
	 
	 	return getLinkefabricFabricReleaseprodnotifyResponse;
	}
}