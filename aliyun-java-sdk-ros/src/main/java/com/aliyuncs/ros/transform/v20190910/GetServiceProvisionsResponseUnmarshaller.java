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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GetServiceProvisionsResponse;
import com.aliyuncs.ros.model.v20190910.GetServiceProvisionsResponse.ServiceProvision;
import com.aliyuncs.ros.model.v20190910.GetServiceProvisionsResponse.ServiceProvision.RoleProvision;
import com.aliyuncs.ros.model.v20190910.GetServiceProvisionsResponse.ServiceProvision.RoleProvision.Role;
import com.aliyuncs.ros.model.v20190910.GetServiceProvisionsResponse.ServiceProvision.RoleProvision.Role.ApiForCreation;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceProvisionsResponseUnmarshaller {

	public static GetServiceProvisionsResponse unmarshall(GetServiceProvisionsResponse getServiceProvisionsResponse, UnmarshallerContext _ctx) {
		
		getServiceProvisionsResponse.setRequestId(_ctx.stringValue("GetServiceProvisionsResponse.RequestId"));

		List<ServiceProvision> serviceProvisions = new ArrayList<ServiceProvision>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceProvisionsResponse.ServiceProvisions.Length"); i++) {
			ServiceProvision serviceProvision = new ServiceProvision();
			serviceProvision.setServiceName(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].ServiceName"));
			serviceProvision.setStatus(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].Status"));
			serviceProvision.setStatusReason(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].StatusReason"));
			serviceProvision.setAutoEnableService(_ctx.booleanValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].AutoEnableService"));
			serviceProvision.setEnableURL(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].EnableURL"));

			List<String> dependentServiceNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].DependentServiceNames.Length"); j++) {
				dependentServiceNames.add(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].DependentServiceNames["+ j +"]"));
			}
			serviceProvision.setDependentServiceNames(dependentServiceNames);

			RoleProvision roleProvision = new RoleProvision();
			roleProvision.setAuthorizationURL(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.AuthorizationURL"));

			List<Role> roles = new ArrayList<Role>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles.Length"); j++) {
				Role role = new Role();
				role.setRoleName(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles["+ j +"].RoleName"));
				role.setCreated(_ctx.booleanValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles["+ j +"].Created"));
				role.setFunction(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles["+ j +"].Function"));

				ApiForCreation apiForCreation = new ApiForCreation();
				apiForCreation.setApiProductId(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles["+ j +"].ApiForCreation.ApiProductId"));
				apiForCreation.setApiName(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles["+ j +"].ApiForCreation.ApiName"));
				apiForCreation.setApiType(_ctx.stringValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles["+ j +"].ApiForCreation.ApiType"));
				apiForCreation.setParameters(_ctx.mapValue("GetServiceProvisionsResponse.ServiceProvisions["+ i +"].RoleProvision.Roles["+ j +"].ApiForCreation.Parameters"));
				role.setApiForCreation(apiForCreation);

				roles.add(role);
			}
			roleProvision.setRoles(roles);
			serviceProvision.setRoleProvision(roleProvision);

			serviceProvisions.add(serviceProvision);
		}
		getServiceProvisionsResponse.setServiceProvisions(serviceProvisions);
	 
	 	return getServiceProvisionsResponse;
	}
}