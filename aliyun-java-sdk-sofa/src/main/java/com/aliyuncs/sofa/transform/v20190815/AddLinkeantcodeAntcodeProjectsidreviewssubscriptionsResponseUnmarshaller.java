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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse unmarshall(AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.RequestId"));
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.ResultCode"));
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.ResultMessage"));
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.Email"));
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.Id"));
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setSubscribed(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.Subscribed"));
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.Type"));

		User user = new User();
		user.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.AccessLevel"));
		user.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.AvatarUrl"));
		user.setBio(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Bio"));
		user.setCanCreateGroup(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.CanCreateGroup"));
		user.setCanCreateProject(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.CanCreateProject"));
		user.setColorSchemeId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.ColorSchemeId"));
		user.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.CreatedAt"));
		user.setCurrentSignInAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.CurrentSignInAt"));
		user.setDepartment(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Department"));
		user.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Email"));
		user.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.ExpiresAt"));
		user.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.ExternUid"));
		user.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Id"));
		user.setIsAdmin(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.IsAdmin"));
		user.setName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Name"));
		user.setPrivateToken(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.PrivateToken"));
		user.setProjectsLimit(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.ProjectsLimit"));
		user.setRegistered(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Registered"));
		user.setRole(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Role"));
		user.setState(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.State"));
		user.setThemeId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.ThemeId"));
		user.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.UpdatedAt"));
		user.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Username"));
		user.setWebsiteUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.WebsiteUrl"));
		user.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.User.Identities["+ i +"]"));
		}
		user.setIdentities(identities);
		addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse.setUser(user);
	 
	 	return addLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse;
	}
}