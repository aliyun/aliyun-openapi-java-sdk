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

import com.aliyuncs.devops.model.v20210625.ListResourceMembersResponse;
import com.aliyuncs.devops.model.v20210625.ListResourceMembersResponse.ResourceMember;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceMembersResponseUnmarshaller {

	public static ListResourceMembersResponse unmarshall(ListResourceMembersResponse listResourceMembersResponse, UnmarshallerContext _ctx) {
		
		listResourceMembersResponse.setRequestId(_ctx.stringValue("ListResourceMembersResponse.requestId"));
		listResourceMembersResponse.setErrorMessage(_ctx.stringValue("ListResourceMembersResponse.errorMessage"));
		listResourceMembersResponse.setErrorCode(_ctx.stringValue("ListResourceMembersResponse.errorCode"));
		listResourceMembersResponse.setSuccess(_ctx.booleanValue("ListResourceMembersResponse.success"));

		List<ResourceMember> resourceMembers = new ArrayList<ResourceMember>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceMembersResponse.resourceMembers.Length"); i++) {
			ResourceMember resourceMember = new ResourceMember();
			resourceMember.setAccountId(_ctx.stringValue("ListResourceMembersResponse.resourceMembers["+ i +"].accountId"));
			resourceMember.setRoleName(_ctx.stringValue("ListResourceMembersResponse.resourceMembers["+ i +"].roleName"));
			resourceMember.setUsername(_ctx.stringValue("ListResourceMembersResponse.resourceMembers["+ i +"].username"));

			resourceMembers.add(resourceMember);
		}
		listResourceMembersResponse.setResourceMembers(resourceMembers);
	 
	 	return listResourceMembersResponse;
	}
}