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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeAddreviewssubscriptionsResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse unmarshall(AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse addLinkeantcodeAntcodeAddreviewssubscriptionsResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.RequestId"));
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.ResultCode"));
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.ResultMessage"));
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.Email"));
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.Id"));
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setSubscribed(_ctx.booleanValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.Subscribed"));
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setType(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.Type"));

		User user = new User();
		user.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.AccessLevel"));
		user.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.AvatarUrl"));
		user.setBio(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Bio"));
		user.setCanCreateGroup(_ctx.booleanValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.CanCreateGroup"));
		user.setCanCreateProject(_ctx.booleanValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.CanCreateProject"));
		user.setColorSchemeId(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.ColorSchemeId"));
		user.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.CreatedAt"));
		user.setCurrentSignInAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.CurrentSignInAt"));
		user.setDepartment(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Department"));
		user.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Email"));
		user.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.ExpiresAt"));
		user.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.ExternUid"));
		user.setId(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Id"));
		user.setIsAdmin(_ctx.booleanValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.IsAdmin"));
		user.setName(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Name"));
		user.setPrivateToken(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.PrivateToken"));
		user.setProjectsLimit(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.ProjectsLimit"));
		user.setRegistered(_ctx.booleanValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Registered"));
		user.setRole(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Role"));
		user.setState(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.State"));
		user.setThemeId(_ctx.longValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.ThemeId"));
		user.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.UpdatedAt"));
		user.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Username"));
		user.setWebsiteUrl(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.WebsiteUrl"));
		user.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse.User.Identities["+ i +"]"));
		}
		user.setIdentities(identities);
		addLinkeantcodeAntcodeAddreviewssubscriptionsResponse.setUser(user);
	 
	 	return addLinkeantcodeAntcodeAddreviewssubscriptionsResponse;
	}
}