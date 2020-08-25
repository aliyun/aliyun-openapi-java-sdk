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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse;
import com.aliyuncs.sofa.model.v20190815.RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseUnmarshaller {

	public static RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse unmarshall(RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse, UnmarshallerContext _ctx) {
		
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setRequestId(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.RequestId"));
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setResultCode(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.ResultCode"));
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setResultMessage(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.ResultMessage"));
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setEmail(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.Email"));
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setId(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.Id"));
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.ResponseStatusCode"));
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setSubscribed(_ctx.booleanValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.Subscribed"));
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setType(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.Type"));

		User user = new User();
		user.setAccessLevel(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.AccessLevel"));
		user.setAvatarUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.AvatarUrl"));
		user.setBio(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Bio"));
		user.setCanCreateGroup(_ctx.booleanValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.CanCreateGroup"));
		user.setCanCreateProject(_ctx.booleanValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.CanCreateProject"));
		user.setColorSchemeId(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.ColorSchemeId"));
		user.setCreatedAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.CreatedAt"));
		user.setCurrentSignInAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.CurrentSignInAt"));
		user.setDepartment(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Department"));
		user.setEmail(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Email"));
		user.setExpiresAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.ExpiresAt"));
		user.setExternUid(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.ExternUid"));
		user.setId(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Id"));
		user.setIsAdmin(_ctx.booleanValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.IsAdmin"));
		user.setName(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Name"));
		user.setPrivateToken(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.PrivateToken"));
		user.setProjectsLimit(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.ProjectsLimit"));
		user.setRegistered(_ctx.booleanValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Registered"));
		user.setRole(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Role"));
		user.setState(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.State"));
		user.setThemeId(_ctx.longValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.ThemeId"));
		user.setUpdatedAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.UpdatedAt"));
		user.setUsername(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Username"));
		user.setWebsiteUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.WebsiteUrl"));
		user.setWebUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse.User.Identities["+ i +"]"));
		}
		user.setIdentities(identities);
		removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse.setUser(user);
	 
	 	return removeLinkeantcodeAntcodeRemovereviewssubscriptionResponse;
	}
}