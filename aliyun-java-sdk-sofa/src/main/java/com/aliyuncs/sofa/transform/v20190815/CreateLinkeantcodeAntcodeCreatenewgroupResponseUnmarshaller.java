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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreatenewgroupResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreatenewgroupResponse.Permission;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreatenewgroupResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreatenewgroupResponse unmarshall(CreateLinkeantcodeAntcodeCreatenewgroupResponse createLinkeantcodeAntcodeCreatenewgroupResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreatenewgroupResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.RequestId"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.ResultCode"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.AvatarUrl"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.CreatedAt"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Description"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Id"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setMembersTotal(_ctx.longValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.MembersTotal"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Name"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Path"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setProjectsTotal(_ctx.longValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.ProjectsTotal"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.set_Public(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Public"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setSize(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Size"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.UpdatedAt"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.WebUrl"));

		Permission permission = new Permission();
		permission.setGroupAccess(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Permission.GroupAccess"));
		permission.setProjectAccess(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Permission.ProjectAccess"));
		permission.setReviewAccess(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Permission.ReviewAccess"));
		permission.setTenantAccess(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Permission.TenantAccess"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setPermission(permission);

		Tenant tenant = new Tenant();
		tenant.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant.CreatedAt"));
		tenant.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant.Id"));
		tenant.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant.Name"));
		tenant.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant.Path"));
		tenant.setPermission(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant.Permission"));
		tenant.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant.UpdatedAt"));
		tenant.setWhileListIp(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewgroupResponse.Tenant.WhileListIp"));
		createLinkeantcodeAntcodeCreatenewgroupResponse.setTenant(tenant);
	 
	 	return createLinkeantcodeAntcodeCreatenewgroupResponse;
	}
}