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

import com.aliyuncs.eiam.model.v20211201.GetRootOrganizationalUnitResponse;
import com.aliyuncs.eiam.model.v20211201.GetRootOrganizationalUnitResponse.OrganizationalUnit;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRootOrganizationalUnitResponseUnmarshaller {

	public static GetRootOrganizationalUnitResponse unmarshall(GetRootOrganizationalUnitResponse getRootOrganizationalUnitResponse, UnmarshallerContext _ctx) {
		
		getRootOrganizationalUnitResponse.setRequestId(_ctx.stringValue("GetRootOrganizationalUnitResponse.RequestId"));

		OrganizationalUnit organizationalUnit = new OrganizationalUnit();
		organizationalUnit.setInstanceId(_ctx.stringValue("GetRootOrganizationalUnitResponse.OrganizationalUnit.InstanceId"));
		organizationalUnit.setOrganizationalUnitId(_ctx.stringValue("GetRootOrganizationalUnitResponse.OrganizationalUnit.OrganizationalUnitId"));
		organizationalUnit.setOrganizationalUnitName(_ctx.stringValue("GetRootOrganizationalUnitResponse.OrganizationalUnit.OrganizationalUnitName"));
		organizationalUnit.setCreateTime(_ctx.longValue("GetRootOrganizationalUnitResponse.OrganizationalUnit.CreateTime"));
		organizationalUnit.setUpdateTime(_ctx.longValue("GetRootOrganizationalUnitResponse.OrganizationalUnit.UpdateTime"));
		organizationalUnit.setDescription(_ctx.stringValue("GetRootOrganizationalUnitResponse.OrganizationalUnit.Description"));
		getRootOrganizationalUnitResponse.setOrganizationalUnit(organizationalUnit);
	 
	 	return getRootOrganizationalUnitResponse;
	}
}