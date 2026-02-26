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

import com.aliyuncs.eiam.model.v20211201.GetOrganizationalUnitResponse;
import com.aliyuncs.eiam.model.v20211201.GetOrganizationalUnitResponse.OrganizationalUnit;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrganizationalUnitResponseUnmarshaller {

	public static GetOrganizationalUnitResponse unmarshall(GetOrganizationalUnitResponse getOrganizationalUnitResponse, UnmarshallerContext _ctx) {
		
		getOrganizationalUnitResponse.setRequestId(_ctx.stringValue("GetOrganizationalUnitResponse.RequestId"));

		OrganizationalUnit organizationalUnit = new OrganizationalUnit();
		organizationalUnit.setOrganizationalUnitId(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.OrganizationalUnitId"));
		organizationalUnit.setOrganizationalUnitName(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.OrganizationalUnitName"));
		organizationalUnit.setParentId(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.ParentId"));
		organizationalUnit.setOrganizationalUnitExternalId(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.OrganizationalUnitExternalId"));
		organizationalUnit.setOrganizationalUnitSourceType(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.OrganizationalUnitSourceType"));
		organizationalUnit.setOrganizationalUnitSourceId(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.OrganizationalUnitSourceId"));
		organizationalUnit.setCreateTime(_ctx.longValue("GetOrganizationalUnitResponse.OrganizationalUnit.CreateTime"));
		organizationalUnit.setUpdateTime(_ctx.longValue("GetOrganizationalUnitResponse.OrganizationalUnit.UpdateTime"));
		organizationalUnit.setDescription(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.Description"));
		organizationalUnit.setInstanceId(_ctx.stringValue("GetOrganizationalUnitResponse.OrganizationalUnit.InstanceId"));
		organizationalUnit.setLeaf(_ctx.booleanValue("GetOrganizationalUnitResponse.OrganizationalUnit.Leaf"));
		getOrganizationalUnitResponse.setOrganizationalUnit(organizationalUnit);
	 
	 	return getOrganizationalUnitResponse;
	}
}