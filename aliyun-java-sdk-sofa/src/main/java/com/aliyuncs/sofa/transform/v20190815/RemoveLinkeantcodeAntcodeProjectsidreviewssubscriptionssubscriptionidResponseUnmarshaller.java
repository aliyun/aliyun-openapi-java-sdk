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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse;
import com.aliyuncs.sofa.model.v20190815.RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseUnmarshaller {

	public static RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse unmarshall(RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse, UnmarshallerContext _ctx) {
		
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setRequestId(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.RequestId"));
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setResultCode(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.ResultCode"));
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setResultMessage(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.ResultMessage"));
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setEmail(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.Email"));
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setId(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.Id"));
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.ResponseStatusCode"));
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setSubscribed(_ctx.booleanValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.Subscribed"));
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setType(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.Type"));

		User user = new User();
		user.setAccessLevel(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.AccessLevel"));
		user.setAvatarUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.AvatarUrl"));
		user.setBio(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Bio"));
		user.setCanCreateGroup(_ctx.booleanValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.CanCreateGroup"));
		user.setCanCreateProject(_ctx.booleanValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.CanCreateProject"));
		user.setColorSchemeId(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.ColorSchemeId"));
		user.setCreatedAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.CreatedAt"));
		user.setCurrentSignInAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.CurrentSignInAt"));
		user.setDepartment(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Department"));
		user.setEmail(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Email"));
		user.setExpiresAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.ExpiresAt"));
		user.setExternUid(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.ExternUid"));
		user.setId(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Id"));
		user.setIsAdmin(_ctx.booleanValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.IsAdmin"));
		user.setName(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Name"));
		user.setPrivateToken(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.PrivateToken"));
		user.setProjectsLimit(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.ProjectsLimit"));
		user.setRegistered(_ctx.booleanValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Registered"));
		user.setRole(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Role"));
		user.setState(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.State"));
		user.setThemeId(_ctx.longValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.ThemeId"));
		user.setUpdatedAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.UpdatedAt"));
		user.setUsername(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Username"));
		user.setWebsiteUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.WebsiteUrl"));
		user.setWebUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.User.Identities["+ i +"]"));
		}
		user.setIdentities(identities);
		removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse.setUser(user);
	 
	 	return removeLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse;
	}
}