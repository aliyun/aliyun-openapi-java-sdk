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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsOrganizationMembersResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsOrganizationMembersResponse.Member;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDevopsOrganizationMembersResponseUnmarshaller {

	public static GetDevopsOrganizationMembersResponse unmarshall(GetDevopsOrganizationMembersResponse getDevopsOrganizationMembersResponse, UnmarshallerContext _ctx) {
		
		getDevopsOrganizationMembersResponse.setRequestId(_ctx.stringValue("GetDevopsOrganizationMembersResponse.RequestId"));
		getDevopsOrganizationMembersResponse.setErrorMsg(_ctx.stringValue("GetDevopsOrganizationMembersResponse.ErrorMsg"));
		getDevopsOrganizationMembersResponse.setSuccessful(_ctx.booleanValue("GetDevopsOrganizationMembersResponse.Successful"));
		getDevopsOrganizationMembersResponse.setErrorCode(_ctx.stringValue("GetDevopsOrganizationMembersResponse.ErrorCode"));

		List<Member> object = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("GetDevopsOrganizationMembersResponse.Object.Length"); i++) {
			Member member = new Member();
			member.setEmail(_ctx.stringValue("GetDevopsOrganizationMembersResponse.Object["+ i +"].Email"));
			member.setAvatarUrl(_ctx.stringValue("GetDevopsOrganizationMembersResponse.Object["+ i +"].AvatarUrl"));
			member.setUserId(_ctx.stringValue("GetDevopsOrganizationMembersResponse.Object["+ i +"].UserId"));
			member.setMemberId(_ctx.stringValue("GetDevopsOrganizationMembersResponse.Object["+ i +"].MemberId"));
			member.setRole(_ctx.integerValue("GetDevopsOrganizationMembersResponse.Object["+ i +"].Role"));
			member.setName(_ctx.stringValue("GetDevopsOrganizationMembersResponse.Object["+ i +"].Name"));
			member.setPhone(_ctx.stringValue("GetDevopsOrganizationMembersResponse.Object["+ i +"].Phone"));

			object.add(member);
		}
		getDevopsOrganizationMembersResponse.setObject(object);
	 
	 	return getDevopsOrganizationMembersResponse;
	}
}