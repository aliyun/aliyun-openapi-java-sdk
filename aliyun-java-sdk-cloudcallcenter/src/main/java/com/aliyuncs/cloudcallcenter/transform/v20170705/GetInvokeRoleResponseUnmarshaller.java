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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetInvokeRoleResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetInvokeRoleResponse.ServiceRole;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInvokeRoleResponseUnmarshaller {

	public static GetInvokeRoleResponse unmarshall(GetInvokeRoleResponse getInvokeRoleResponse, UnmarshallerContext context) {
		
		getInvokeRoleResponse.setRequestId(context.stringValue("GetInvokeRoleResponse.RequestId"));
		getInvokeRoleResponse.setSuccess(context.booleanValue("GetInvokeRoleResponse.Success"));
		getInvokeRoleResponse.setCode(context.stringValue("GetInvokeRoleResponse.Code"));
		getInvokeRoleResponse.setMessage(context.stringValue("GetInvokeRoleResponse.Message"));
		getInvokeRoleResponse.setHttpStatusCode(context.integerValue("GetInvokeRoleResponse.HttpStatusCode"));
		getInvokeRoleResponse.setHasRole(context.booleanValue("GetInvokeRoleResponse.HasRole"));

		ServiceRole serviceRole = new ServiceRole();
		serviceRole.setRoleName(context.stringValue("GetInvokeRoleResponse.ServiceRole.RoleName"));
		serviceRole.setArn(context.stringValue("GetInvokeRoleResponse.ServiceRole.Arn"));
		getInvokeRoleResponse.setServiceRole(serviceRole);
	 
	 	return getInvokeRoleResponse;
	}
}