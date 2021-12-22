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

package com.aliyuncs.cciotgw.transform.v20210721;

import com.aliyuncs.cciotgw.model.v20210721.GetIpStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIpStatusResponseUnmarshaller {

	public static GetIpStatusResponse unmarshall(GetIpStatusResponse getIpStatusResponse, UnmarshallerContext _ctx) {
		
		getIpStatusResponse.setRequestId(_ctx.stringValue("GetIpStatusResponse.RequestId"));
		getIpStatusResponse.setCode(_ctx.stringValue("GetIpStatusResponse.Code"));
		getIpStatusResponse.setMessage(_ctx.stringValue("GetIpStatusResponse.Message"));
		getIpStatusResponse.setSuccess(_ctx.stringValue("GetIpStatusResponse.Success"));
		getIpStatusResponse.setStatus(_ctx.stringValue("GetIpStatusResponse.Status"));
	 
	 	return getIpStatusResponse;
	}
}