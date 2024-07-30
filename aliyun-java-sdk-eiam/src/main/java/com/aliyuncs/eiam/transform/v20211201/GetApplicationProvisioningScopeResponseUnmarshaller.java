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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningScopeResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningScopeResponse.ApplicationProvisioningScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationProvisioningScopeResponseUnmarshaller {

	public static GetApplicationProvisioningScopeResponse unmarshall(GetApplicationProvisioningScopeResponse getApplicationProvisioningScopeResponse, UnmarshallerContext _ctx) {
		
		getApplicationProvisioningScopeResponse.setRequestId(_ctx.stringValue("GetApplicationProvisioningScopeResponse.RequestId"));

		ApplicationProvisioningScope applicationProvisioningScope = new ApplicationProvisioningScope();
		applicationProvisioningScope.setUsedQuota(_ctx.integerValue("GetApplicationProvisioningScopeResponse.ApplicationProvisioningScope.UsedQuota"));
		applicationProvisioningScope.setMaxQuota(_ctx.integerValue("GetApplicationProvisioningScopeResponse.ApplicationProvisioningScope.MaxQuota"));

		List<String> organizationalUnitIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationProvisioningScopeResponse.ApplicationProvisioningScope.OrganizationalUnitIds.Length"); i++) {
			organizationalUnitIds.add(_ctx.stringValue("GetApplicationProvisioningScopeResponse.ApplicationProvisioningScope.OrganizationalUnitIds["+ i +"]"));
		}
		applicationProvisioningScope.setOrganizationalUnitIds(organizationalUnitIds);

		List<String> groupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationProvisioningScopeResponse.ApplicationProvisioningScope.GroupIds.Length"); i++) {
			groupIds.add(_ctx.stringValue("GetApplicationProvisioningScopeResponse.ApplicationProvisioningScope.GroupIds["+ i +"]"));
		}
		applicationProvisioningScope.setGroupIds(groupIds);
		getApplicationProvisioningScopeResponse.setApplicationProvisioningScope(applicationProvisioningScope);
	 
	 	return getApplicationProvisioningScopeResponse;
	}
}