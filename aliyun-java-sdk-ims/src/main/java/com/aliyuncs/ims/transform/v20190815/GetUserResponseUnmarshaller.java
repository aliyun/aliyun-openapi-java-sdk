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

import com.aliyuncs.ims.model.v20190815.GetUserResponse;
import com.aliyuncs.ims.model.v20190815.GetUserResponse.User;
import com.aliyuncs.ims.model.v20190815.GetUserResponse.User.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));

		User user = new User();
		user.setDisplayName(_ctx.stringValue("GetUserResponse.User.DisplayName"));
		user.setUserPrincipalName(_ctx.stringValue("GetUserResponse.User.UserPrincipalName"));
		user.setEmail(_ctx.stringValue("GetUserResponse.User.Email"));
		user.setUpdateDate(_ctx.stringValue("GetUserResponse.User.UpdateDate"));
		user.setMobilePhone(_ctx.stringValue("GetUserResponse.User.MobilePhone"));
		user.setUserId(_ctx.stringValue("GetUserResponse.User.UserId"));
		user.setComments(_ctx.stringValue("GetUserResponse.User.Comments"));
		user.setLastLoginDate(_ctx.stringValue("GetUserResponse.User.LastLoginDate"));
		user.setCreateDate(_ctx.stringValue("GetUserResponse.User.CreateDate"));
		user.setProvisionType(_ctx.stringValue("GetUserResponse.User.ProvisionType"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetUserResponse.User.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetUserResponse.User.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		user.setTags(tags);
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}