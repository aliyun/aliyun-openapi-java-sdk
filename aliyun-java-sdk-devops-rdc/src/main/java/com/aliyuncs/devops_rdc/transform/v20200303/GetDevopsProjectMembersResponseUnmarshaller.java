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

import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectMembersResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectMembersResponse.Member;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDevopsProjectMembersResponseUnmarshaller {

	public static GetDevopsProjectMembersResponse unmarshall(GetDevopsProjectMembersResponse getDevopsProjectMembersResponse, UnmarshallerContext _ctx) {
		
		getDevopsProjectMembersResponse.setRequestId(_ctx.stringValue("GetDevopsProjectMembersResponse.RequestId"));
		getDevopsProjectMembersResponse.setNextPageToken(_ctx.stringValue("GetDevopsProjectMembersResponse.NextPageToken"));
		getDevopsProjectMembersResponse.setErrorCode(_ctx.stringValue("GetDevopsProjectMembersResponse.ErrorCode"));
		getDevopsProjectMembersResponse.setErrorMsg(_ctx.stringValue("GetDevopsProjectMembersResponse.ErrorMsg"));
		getDevopsProjectMembersResponse.setSuccessful(_ctx.booleanValue("GetDevopsProjectMembersResponse.Successful"));
		getDevopsProjectMembersResponse.setTotal(_ctx.integerValue("GetDevopsProjectMembersResponse.Total"));

		List<Member> object = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("GetDevopsProjectMembersResponse.Object.Length"); i++) {
			Member member = new Member();
			member.setEmail(_ctx.stringValue("GetDevopsProjectMembersResponse.Object["+ i +"].Email"));
			member.setAvatarUrl(_ctx.stringValue("GetDevopsProjectMembersResponse.Object["+ i +"].AvatarUrl"));
			member.setUserId(_ctx.stringValue("GetDevopsProjectMembersResponse.Object["+ i +"].UserId"));
			member.setMemberId(_ctx.stringValue("GetDevopsProjectMembersResponse.Object["+ i +"].MemberId"));
			member.setRole(_ctx.integerValue("GetDevopsProjectMembersResponse.Object["+ i +"].Role"));
			member.setName(_ctx.stringValue("GetDevopsProjectMembersResponse.Object["+ i +"].Name"));
			member.setPhone(_ctx.stringValue("GetDevopsProjectMembersResponse.Object["+ i +"].Phone"));

			object.add(member);
		}
		getDevopsProjectMembersResponse.setObject(object);
	 
	 	return getDevopsProjectMembersResponse;
	}
}