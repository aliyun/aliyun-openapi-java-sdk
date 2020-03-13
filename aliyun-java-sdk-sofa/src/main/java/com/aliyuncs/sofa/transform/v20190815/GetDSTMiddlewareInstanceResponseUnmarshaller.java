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

import com.aliyuncs.sofa.model.v20190815.GetDSTMiddlewareInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDSTMiddlewareInstanceResponseUnmarshaller {

	public static GetDSTMiddlewareInstanceResponse unmarshall(GetDSTMiddlewareInstanceResponse getDSTMiddlewareInstanceResponse, UnmarshallerContext _ctx) {
		
		getDSTMiddlewareInstanceResponse.setRequestId(_ctx.stringValue("GetDSTMiddlewareInstanceResponse.RequestId"));
		getDSTMiddlewareInstanceResponse.setResultCode(_ctx.stringValue("GetDSTMiddlewareInstanceResponse.ResultCode"));
		getDSTMiddlewareInstanceResponse.setResultMessage(_ctx.stringValue("GetDSTMiddlewareInstanceResponse.ResultMessage"));
		getDSTMiddlewareInstanceResponse.setInstanceId(_ctx.stringValue("GetDSTMiddlewareInstanceResponse.InstanceId"));
		getDSTMiddlewareInstanceResponse.setTenantName(_ctx.stringValue("GetDSTMiddlewareInstanceResponse.TenantName"));
		getDSTMiddlewareInstanceResponse.setWorkspaceName(_ctx.stringValue("GetDSTMiddlewareInstanceResponse.WorkspaceName"));
	 
	 	return getDSTMiddlewareInstanceResponse;
	}
}