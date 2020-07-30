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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teambition_aliyun.model.v20200226.GetOrganizationMembersResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.GetOrganizationMembersResponse.Member;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrganizationMembersResponseUnmarshaller {

	public static GetOrganizationMembersResponse unmarshall(GetOrganizationMembersResponse getOrganizationMembersResponse, UnmarshallerContext _ctx) {
		
		getOrganizationMembersResponse.setRequestId(_ctx.stringValue("GetOrganizationMembersResponse.RequestId"));
		getOrganizationMembersResponse.setSuccessful(_ctx.booleanValue("GetOrganizationMembersResponse.Successful"));
		getOrganizationMembersResponse.setErrorCode(_ctx.stringValue("GetOrganizationMembersResponse.ErrorCode"));
		getOrganizationMembersResponse.setErrorMsg(_ctx.stringValue("GetOrganizationMembersResponse.ErrorMsg"));

		List<Member> object = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("GetOrganizationMembersResponse.Object.Length"); i++) {
			Member member = new Member();
			member.setMemberId(_ctx.stringValue("GetOrganizationMembersResponse.Object["+ i +"].MemberId"));
			member.setUserId(_ctx.stringValue("GetOrganizationMembersResponse.Object["+ i +"].UserId"));
			member.setRole(_ctx.integerValue("GetOrganizationMembersResponse.Object["+ i +"].Role"));
			member.setName(_ctx.stringValue("GetOrganizationMembersResponse.Object["+ i +"].Name"));
			member.setAvatarUrl(_ctx.stringValue("GetOrganizationMembersResponse.Object["+ i +"].AvatarUrl"));
			member.setEmail(_ctx.stringValue("GetOrganizationMembersResponse.Object["+ i +"].Email"));
			member.setPhone(_ctx.stringValue("GetOrganizationMembersResponse.Object["+ i +"].Phone"));

			object.add(member);
		}
		getOrganizationMembersResponse.setObject(object);
	 
	 	return getOrganizationMembersResponse;
	}
}