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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetOrganizationMemberResponse;
import com.aliyuncs.devops.model.v20210625.GetOrganizationMemberResponse.Member;
import com.aliyuncs.devops.model.v20210625.GetOrganizationMemberResponse.Member.Identities;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrganizationMemberResponseUnmarshaller {

	public static GetOrganizationMemberResponse unmarshall(GetOrganizationMemberResponse getOrganizationMemberResponse, UnmarshallerContext _ctx) {
		
		getOrganizationMemberResponse.setRequestId(_ctx.stringValue("GetOrganizationMemberResponse.requestId"));
		getOrganizationMemberResponse.setErrorMessage(_ctx.stringValue("GetOrganizationMemberResponse.errorMessage"));
		getOrganizationMemberResponse.setErrorCode(_ctx.stringValue("GetOrganizationMemberResponse.errorCode"));
		getOrganizationMemberResponse.setSuccess(_ctx.booleanValue("GetOrganizationMemberResponse.success"));

		Member member = new Member();
		member.setAccountId(_ctx.stringValue("GetOrganizationMemberResponse.member.accountId"));
		member.setBirthday(_ctx.longValue("GetOrganizationMemberResponse.member.birthday"));
		member.setEmail(_ctx.stringValue("GetOrganizationMemberResponse.member.email"));
		member.setHiredDate(_ctx.longValue("GetOrganizationMemberResponse.member.hiredDate"));
		member.setJoinTime(_ctx.longValue("GetOrganizationMemberResponse.member.joinTime"));
		member.setLastVisitTime(_ctx.longValue("GetOrganizationMemberResponse.member.lastVisitTime"));
		member.setMobile(_ctx.stringValue("GetOrganizationMemberResponse.member.mobile"));
		member.setOrganizationMemberName(_ctx.stringValue("GetOrganizationMemberResponse.member.organizationMemberName"));
		member.setOrganizationRoleName(_ctx.stringValue("GetOrganizationMemberResponse.member.organizationRoleName"));
		member.setJobNumber(_ctx.stringValue("GetOrganizationMemberResponse.member.jobNumber"));
		member.setOrganizationRoleId(_ctx.stringValue("GetOrganizationMemberResponse.member.organizationRoleId"));
		member.setState(_ctx.stringValue("GetOrganizationMemberResponse.member.state"));

		List<String> deptLists = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOrganizationMemberResponse.member.deptLists.Length"); i++) {
			deptLists.add(_ctx.stringValue("GetOrganizationMemberResponse.member.deptLists["+ i +"]"));
		}
		member.setDeptLists(deptLists);

		Identities identities = new Identities();
		identities.setExternUid(_ctx.stringValue("GetOrganizationMemberResponse.member.identities.externUid"));
		identities.setProvider(_ctx.stringValue("GetOrganizationMemberResponse.member.identities.provider"));
		member.setIdentities(identities);
		getOrganizationMemberResponse.setMember(member);
	 
	 	return getOrganizationMemberResponse;
	}
}