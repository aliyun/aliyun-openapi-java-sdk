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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeRecoverytaskResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeRecoverytaskResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeRecoverytaskResponse unmarshall(CreateLinkeantcodeAntcodeRecoverytaskResponse createLinkeantcodeAntcodeRecoverytaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeRecoverytaskResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.RequestId"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.ResultCode"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.ResultMessage"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Branch"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setCompletedEventsCount(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.CompletedEventsCount"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.CreatedAt"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setEndTime(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.EndTime"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Id"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.ProjectId"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setPushedBy(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.PushedBy"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setStartTime(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.StartTime"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setStatus(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Status"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setTarget(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Target"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setTotalEventsCount(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.TotalEventsCount"));
		createLinkeantcodeAntcodeRecoverytaskResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.AccessLevel"));
		creator.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.AvatarUrl"));
		creator.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Bio"));
		creator.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CanCreateGroup"));
		creator.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CanCreateProject"));
		creator.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ColorSchemeId"));
		creator.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CreatedAt"));
		creator.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CurrentSignInAt"));
		creator.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Department"));
		creator.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Email"));
		creator.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ExpiresAt"));
		creator.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ExternUid"));
		creator.setId(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Id"));
		creator.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.IsAdmin"));
		creator.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Name"));
		creator.setNotificationLevel(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.NotificationLevel"));
		creator.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.PrivateToken"));
		creator.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ProjectsLimit"));
		creator.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Registered"));
		creator.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Role"));
		creator.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.State"));
		creator.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ThemeId"));
		creator.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.UpdatedAt"));
		creator.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Username"));
		creator.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.WebsiteUrl"));
		creator.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("CreateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Identities["+ i +"]"));
		}
		creator.setIdentities(identities);
		createLinkeantcodeAntcodeRecoverytaskResponse.setCreator(creator);
	 
	 	return createLinkeantcodeAntcodeRecoverytaskResponse;
	}
}