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

import com.aliyuncs.devops.model.v20210625.ListProjectMembersResponse;
import com.aliyuncs.devops.model.v20210625.ListProjectMembersResponse.Member;
import com.aliyuncs.devops.model.v20210625.ListProjectMembersResponse.Member.Division;
import com.aliyuncs.devops.model.v20210625.ListProjectMembersResponse.Member.OrganizationUserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectMembersResponseUnmarshaller {

	public static ListProjectMembersResponse unmarshall(ListProjectMembersResponse listProjectMembersResponse, UnmarshallerContext _ctx) {
		
		listProjectMembersResponse.setRequestId(_ctx.stringValue("ListProjectMembersResponse.requestId"));
		listProjectMembersResponse.setErrorMsg(_ctx.stringValue("ListProjectMembersResponse.errorMsg"));
		listProjectMembersResponse.setErrorCode(_ctx.stringValue("ListProjectMembersResponse.errorCode"));
		listProjectMembersResponse.setSuccess(_ctx.booleanValue("ListProjectMembersResponse.success"));

		List<Member> members = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectMembersResponse.members.Length"); i++) {
			Member member = new Member();
			member.setAccount(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].account"));
			member.setAvatar(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].avatar"));
			member.setDingTalkId(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].dingTalkId"));
			member.setDisplayName(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].displayName"));
			member.setDisplayNickName(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].displayNickName"));
			member.setDisplayRealName(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].displayRealName"));
			member.setEmail(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].email"));
			member.setGender(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].gender"));
			member.setIdentifier(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].identifier"));
			member.setMobile(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].mobile"));
			member.setNameEn(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].nameEn"));
			member.setNickName(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].nickName"));
			member.setNickNamePinyin(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].nickNamePinyin"));
			member.setRealName(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].realName"));
			member.setRealNamePinyin(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].realNamePinyin"));
			member.setStamp(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].stamp"));
			member.setTbRoleId(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].tbRoleId"));
			member.setRoleName(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].roleName"));

			Division division = new Division();
			division.setIdentifier(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].division.identifier"));
			member.setDivision(division);

			OrganizationUserInfo organizationUserInfo = new OrganizationUserInfo();
			organizationUserInfo.setOrganizationIdentifier(_ctx.stringValue("ListProjectMembersResponse.members["+ i +"].organizationUserInfo.organizationIdentifier"));
			member.setOrganizationUserInfo(organizationUserInfo);

			members.add(member);
		}
		listProjectMembersResponse.setMembers(members);
	 
	 	return listProjectMembersResponse;
	}
}