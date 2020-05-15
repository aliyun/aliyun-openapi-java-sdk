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

import com.aliyuncs.sofa.model.v20190815.GetDTXMiddlewareInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDTXMiddlewareInstanceResponseUnmarshaller {

	public static GetDTXMiddlewareInstanceResponse unmarshall(GetDTXMiddlewareInstanceResponse getDTXMiddlewareInstanceResponse, UnmarshallerContext _ctx) {
		
		getDTXMiddlewareInstanceResponse.setRequestId(_ctx.stringValue("GetDTXMiddlewareInstanceResponse.RequestId"));
		getDTXMiddlewareInstanceResponse.setResultCode(_ctx.stringValue("GetDTXMiddlewareInstanceResponse.ResultCode"));
		getDTXMiddlewareInstanceResponse.setResultMessage(_ctx.stringValue("GetDTXMiddlewareInstanceResponse.ResultMessage"));
		getDTXMiddlewareInstanceResponse.setData(_ctx.stringValue("GetDTXMiddlewareInstanceResponse.Data"));
		getDTXMiddlewareInstanceResponse.setSuccess(_ctx.booleanValue("GetDTXMiddlewareInstanceResponse.Success"));
	 
	 	return getDTXMiddlewareInstanceResponse;
	}
}