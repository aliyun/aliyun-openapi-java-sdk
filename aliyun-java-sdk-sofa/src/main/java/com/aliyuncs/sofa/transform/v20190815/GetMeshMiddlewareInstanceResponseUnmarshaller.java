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

import com.aliyuncs.sofa.model.v20190815.GetMeshMiddlewareInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMeshMiddlewareInstanceResponseUnmarshaller {

	public static GetMeshMiddlewareInstanceResponse unmarshall(GetMeshMiddlewareInstanceResponse getMeshMiddlewareInstanceResponse, UnmarshallerContext _ctx) {
		
		getMeshMiddlewareInstanceResponse.setRequestId(_ctx.stringValue("GetMeshMiddlewareInstanceResponse.RequestId"));
		getMeshMiddlewareInstanceResponse.setResultCode(_ctx.stringValue("GetMeshMiddlewareInstanceResponse.ResultCode"));
		getMeshMiddlewareInstanceResponse.setResultMessage(_ctx.stringValue("GetMeshMiddlewareInstanceResponse.ResultMessage"));
		getMeshMiddlewareInstanceResponse.setInstanceId(_ctx.stringValue("GetMeshMiddlewareInstanceResponse.InstanceId"));
		getMeshMiddlewareInstanceResponse.setTenantName(_ctx.stringValue("GetMeshMiddlewareInstanceResponse.TenantName"));
		getMeshMiddlewareInstanceResponse.setWorkspaceName(_ctx.stringValue("GetMeshMiddlewareInstanceResponse.WorkspaceName"));
	 
	 	return getMeshMiddlewareInstanceResponse;
	}
}