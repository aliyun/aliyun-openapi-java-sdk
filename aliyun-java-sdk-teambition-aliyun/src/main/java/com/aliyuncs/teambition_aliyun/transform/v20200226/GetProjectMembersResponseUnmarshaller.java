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

import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectMembersResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectMembersResponse.Member;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectMembersResponseUnmarshaller {

	public static GetProjectMembersResponse unmarshall(GetProjectMembersResponse getProjectMembersResponse, UnmarshallerContext _ctx) {
		
		getProjectMembersResponse.setRequestId(_ctx.stringValue("GetProjectMembersResponse.RequestId"));
		getProjectMembersResponse.setSuccessful(_ctx.booleanValue("GetProjectMembersResponse.Successful"));
		getProjectMembersResponse.setErrorCode(_ctx.stringValue("GetProjectMembersResponse.ErrorCode"));
		getProjectMembersResponse.setErrorMsg(_ctx.stringValue("GetProjectMembersResponse.ErrorMsg"));

		List<Member> object = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectMembersResponse.Object.Length"); i++) {
			Member member = new Member();
			member.setMemberId(_ctx.stringValue("GetProjectMembersResponse.Object["+ i +"].MemberId"));
			member.setUserId(_ctx.stringValue("GetProjectMembersResponse.Object["+ i +"].UserId"));
			member.setRole(_ctx.integerValue("GetProjectMembersResponse.Object["+ i +"].Role"));
			member.setName(_ctx.stringValue("GetProjectMembersResponse.Object["+ i +"].Name"));
			member.setAvatarUrl(_ctx.stringValue("GetProjectMembersResponse.Object["+ i +"].AvatarUrl"));
			member.setEmail(_ctx.stringValue("GetProjectMembersResponse.Object["+ i +"].Email"));
			member.setPhone(_ctx.stringValue("GetProjectMembersResponse.Object["+ i +"].Phone"));

			object.add(member);
		}
		getProjectMembersResponse.setObject(object);
	 
	 	return getProjectMembersResponse;
	}
}