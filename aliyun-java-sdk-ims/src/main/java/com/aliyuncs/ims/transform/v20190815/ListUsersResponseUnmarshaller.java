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

package com.aliyuncs.ims.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.ListUsersResponse;
import com.aliyuncs.ims.model.v20190815.ListUsersResponse.User;
import com.aliyuncs.ims.model.v20190815.ListUsersResponse.User.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setIsTruncated(_ctx.booleanValue("ListUsersResponse.IsTruncated"));
		listUsersResponse.setMarker(_ctx.stringValue("ListUsersResponse.Marker"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setDisplayName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].DisplayName"));
			user.setUserPrincipalName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserPrincipalName"));
			user.setEmail(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Email"));
			user.setUpdateDate(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UpdateDate"));
			user.setMobilePhone(_ctx.stringValue("ListUsersResponse.Users["+ i +"].MobilePhone"));
			user.setUserId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserId"));
			user.setComments(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Comments"));
			user.setLastLoginDate(_ctx.stringValue("ListUsersResponse.Users["+ i +"].LastLoginDate"));
			user.setCreateDate(_ctx.stringValue("ListUsersResponse.Users["+ i +"].CreateDate"));
			user.setProvisionType(_ctx.stringValue("ListUsersResponse.Users["+ i +"].ProvisionType"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Users["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			user.setTags(tags);

			users.add(user);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}