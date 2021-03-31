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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.UpdateRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRoleResponseUnmarshaller {

	public static UpdateRoleResponse unmarshall(UpdateRoleResponse updateRoleResponse, UnmarshallerContext _ctx) {
		
		updateRoleResponse.setRequestId(_ctx.stringValue("UpdateRoleResponse.RequestId"));
		updateRoleResponse.setMessage(_ctx.stringValue("UpdateRoleResponse.Message"));
		updateRoleResponse.setHttpStatusCode(_ctx.longValue("UpdateRoleResponse.HttpStatusCode"));
		updateRoleResponse.setCode(_ctx.stringValue("UpdateRoleResponse.Code"));
		updateRoleResponse.setSuccess(_ctx.booleanValue("UpdateRoleResponse.Success"));
	 
	 	return updateRoleResponse;
	}
}