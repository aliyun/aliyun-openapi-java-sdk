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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeUsersResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeUsersResponse.IdentitiesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeUsersResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeUsersResponse unmarshall(CreateLinkeantcodeAntcodeUsersResponse createLinkeantcodeAntcodeUsersResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeUsersResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.RequestId"));
		createLinkeantcodeAntcodeUsersResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.ResultCode"));
		createLinkeantcodeAntcodeUsersResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.ResultMessage"));
		createLinkeantcodeAntcodeUsersResponse.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.AvatarUrl"));
		createLinkeantcodeAntcodeUsersResponse.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.Bio"));
		createLinkeantcodeAntcodeUsersResponse.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeUsersResponse.CanCreateGroup"));
		createLinkeantcodeAntcodeUsersResponse.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeUsersResponse.CanCreateProject"));
		createLinkeantcodeAntcodeUsersResponse.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeUsersResponse.ColorSchemeId"));
		createLinkeantcodeAntcodeUsersResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.CreatedAt"));
		createLinkeantcodeAntcodeUsersResponse.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.CurrentSignInAt"));
		createLinkeantcodeAntcodeUsersResponse.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.Department"));
		createLinkeantcodeAntcodeUsersResponse.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.Email"));
		createLinkeantcodeAntcodeUsersResponse.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.ExternUid"));
		createLinkeantcodeAntcodeUsersResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeUsersResponse.Id"));
		createLinkeantcodeAntcodeUsersResponse.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeUsersResponse.IsAdmin"));
		createLinkeantcodeAntcodeUsersResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.Name"));
		createLinkeantcodeAntcodeUsersResponse.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.PrivateToken"));
		createLinkeantcodeAntcodeUsersResponse.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeUsersResponse.ProjectsLimit"));
		createLinkeantcodeAntcodeUsersResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeUsersResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeUsersResponse.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeUsersResponse.Role"));
		createLinkeantcodeAntcodeUsersResponse.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.State"));
		createLinkeantcodeAntcodeUsersResponse.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeUsersResponse.ThemeId"));
		createLinkeantcodeAntcodeUsersResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.UpdatedAt"));
		createLinkeantcodeAntcodeUsersResponse.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.Username"));
		createLinkeantcodeAntcodeUsersResponse.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.WebsiteUrl"));
		createLinkeantcodeAntcodeUsersResponse.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.WebUrl"));

		List<IdentitiesItem> identities = new ArrayList<IdentitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeUsersResponse.Identities.Length"); i++) {
			IdentitiesItem identitiesItem = new IdentitiesItem();
			identitiesItem.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.Identities["+ i +"].ExternUid"));
			identitiesItem.setProvider(_ctx.stringValue("CreateLinkeantcodeAntcodeUsersResponse.Identities["+ i +"].Provider"));

			identities.add(identitiesItem);
		}
		createLinkeantcodeAntcodeUsersResponse.setIdentities(identities);
	 
	 	return createLinkeantcodeAntcodeUsersResponse;
	}
}