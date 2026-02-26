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

import com.aliyuncs.ims.model.v20190815.CreateUserResponse;
import com.aliyuncs.ims.model.v20190815.CreateUserResponse.User;
import com.aliyuncs.ims.model.v20190815.CreateUserResponse.User.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext _ctx) {
		
		createUserResponse.setRequestId(_ctx.stringValue("CreateUserResponse.RequestId"));

		User user = new User();
		user.setDisplayName(_ctx.stringValue("CreateUserResponse.User.DisplayName"));
		user.setUserPrincipalName(_ctx.stringValue("CreateUserResponse.User.UserPrincipalName"));
		user.setEmail(_ctx.stringValue("CreateUserResponse.User.Email"));
		user.setUpdateDate(_ctx.stringValue("CreateUserResponse.User.UpdateDate"));
		user.setMobilePhone(_ctx.stringValue("CreateUserResponse.User.MobilePhone"));
		user.setUserId(_ctx.stringValue("CreateUserResponse.User.UserId"));
		user.setComments(_ctx.stringValue("CreateUserResponse.User.Comments"));
		user.setLastLoginDate(_ctx.stringValue("CreateUserResponse.User.LastLoginDate"));
		user.setCreateDate(_ctx.stringValue("CreateUserResponse.User.CreateDate"));
		user.setProvisionType(_ctx.stringValue("CreateUserResponse.User.ProvisionType"));
		user.setExternalId(_ctx.stringValue("CreateUserResponse.User.ExternalId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("CreateUserResponse.User.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("CreateUserResponse.User.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("CreateUserResponse.User.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		user.setTags(tags);
		createUserResponse.setUser(user);
	 
	 	return createUserResponse;
	}
}