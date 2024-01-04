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

import com.aliyuncs.devops.model.v20210625.ListOrganizationMembersResponse;
import com.aliyuncs.devops.model.v20210625.ListOrganizationMembersResponse.Member;
import com.aliyuncs.devops.model.v20210625.ListOrganizationMembersResponse.Member.Identities;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationMembersResponseUnmarshaller {

	public static ListOrganizationMembersResponse unmarshall(ListOrganizationMembersResponse listOrganizationMembersResponse, UnmarshallerContext _ctx) {
		
		listOrganizationMembersResponse.setRequestId(_ctx.stringValue("ListOrganizationMembersResponse.requestId"));
		listOrganizationMembersResponse.setErrorMessage(_ctx.stringValue("ListOrganizationMembersResponse.errorMessage"));
		listOrganizationMembersResponse.setSuccess(_ctx.booleanValue("ListOrganizationMembersResponse.success"));
		listOrganizationMembersResponse.setErrorCode(_ctx.stringValue("ListOrganizationMembersResponse.errorCode"));
		listOrganizationMembersResponse.setNextToken(_ctx.stringValue("ListOrganizationMembersResponse.nextToken"));
		listOrganizationMembersResponse.setTotalCount(_ctx.longValue("ListOrganizationMembersResponse.totalCount"));

		List<Member> members = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationMembersResponse.members.Length"); i++) {
			Member member = new Member();
			member.setAccountId(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].accountId"));
			member.setBirthday(_ctx.longValue("ListOrganizationMembersResponse.members["+ i +"].birthday"));
			member.setEmail(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].email"));
			member.setHiredDate(_ctx.longValue("ListOrganizationMembersResponse.members["+ i +"].hiredDate"));
			member.setJoinTime(_ctx.longValue("ListOrganizationMembersResponse.members["+ i +"].joinTime"));
			member.setLastVisitTime(_ctx.longValue("ListOrganizationMembersResponse.members["+ i +"].lastVisitTime"));
			member.setMobile(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].mobile"));
			member.setOrganizationMemberName(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].organizationMemberName"));
			member.setOrganizationRoleName(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].organizationRoleName"));
			member.setOrganizationRoleId(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].organizationRoleId"));
			member.setState(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].state"));

			List<String> deptLists = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListOrganizationMembersResponse.members["+ i +"].deptLists.Length"); j++) {
				deptLists.add(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].deptLists["+ j +"]"));
			}
			member.setDeptLists(deptLists);

			Identities identities = new Identities();
			identities.setExternUid(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].identities.externUid"));
			identities.setProvider(_ctx.stringValue("ListOrganizationMembersResponse.members["+ i +"].identities.provider"));
			member.setIdentities(identities);

			members.add(member);
		}
		listOrganizationMembersResponse.setMembers(members);
	 
	 	return listOrganizationMembersResponse;
	}
}