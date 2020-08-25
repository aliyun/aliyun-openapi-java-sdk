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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse unmarshall(CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.RequestId"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ResultCode"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ResultMessage"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Branch"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setCompletedEventsCount(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.CompletedEventsCount"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.CreatedAt"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setEndTime(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.EndTime"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Id"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ProjectId"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setPushedBy(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.PushedBy"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setStartTime(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.StartTime"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setStatus(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Status"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setTarget(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Target"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setTotalEventsCount(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.TotalEventsCount"));
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.AccessLevel"));
		creator.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.AvatarUrl"));
		creator.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Bio"));
		creator.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CanCreateGroup"));
		creator.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CanCreateProject"));
		creator.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ColorSchemeId"));
		creator.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CreatedAt"));
		creator.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CurrentSignInAt"));
		creator.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Department"));
		creator.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Email"));
		creator.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ExpiresAt"));
		creator.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ExternUid"));
		creator.setId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Id"));
		creator.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.IsAdmin"));
		creator.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Name"));
		creator.setNotificationLevel(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.NotificationLevel"));
		creator.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.PrivateToken"));
		creator.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ProjectsLimit"));
		creator.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Registered"));
		creator.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Role"));
		creator.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.State"));
		creator.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ThemeId"));
		creator.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.UpdatedAt"));
		creator.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Username"));
		creator.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.WebsiteUrl"));
		creator.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Identities["+ i +"]"));
		}
		creator.setIdentities(identities);
		createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setCreator(creator);
	 
	 	return createLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse;
	}
}