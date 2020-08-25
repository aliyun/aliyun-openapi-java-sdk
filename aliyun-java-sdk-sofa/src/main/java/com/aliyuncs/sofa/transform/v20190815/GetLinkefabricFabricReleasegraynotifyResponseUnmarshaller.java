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

import com.aliyuncs.sofa.model.v20190815.GetLinkefabricFabricReleasegraynotifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkefabricFabricReleasegraynotifyResponseUnmarshaller {

	public static GetLinkefabricFabricReleasegraynotifyResponse unmarshall(GetLinkefabricFabricReleasegraynotifyResponse getLinkefabricFabricReleasegraynotifyResponse, UnmarshallerContext _ctx) {
		
		getLinkefabricFabricReleasegraynotifyResponse.setRequestId(_ctx.stringValue("GetLinkefabricFabricReleasegraynotifyResponse.RequestId"));
		getLinkefabricFabricReleasegraynotifyResponse.setResultCode(_ctx.stringValue("GetLinkefabricFabricReleasegraynotifyResponse.ResultCode"));
		getLinkefabricFabricReleasegraynotifyResponse.setResultMessage(_ctx.stringValue("GetLinkefabricFabricReleasegraynotifyResponse.ResultMessage"));
		getLinkefabricFabricReleasegraynotifyResponse.setData(_ctx.booleanValue("GetLinkefabricFabricReleasegraynotifyResponse.Data"));
		getLinkefabricFabricReleasegraynotifyResponse.setMessage(_ctx.stringValue("GetLinkefabricFabricReleasegraynotifyResponse.Message"));
		getLinkefabricFabricReleasegraynotifyResponse.setResponseStatusCode(_ctx.longValue("GetLinkefabricFabricReleasegraynotifyResponse.ResponseStatusCode"));
		getLinkefabricFabricReleasegraynotifyResponse.setSuccess(_ctx.booleanValue("GetLinkefabricFabricReleasegraynotifyResponse.Success"));
	 
	 	return getLinkefabricFabricReleasegraynotifyResponse;
	}
}