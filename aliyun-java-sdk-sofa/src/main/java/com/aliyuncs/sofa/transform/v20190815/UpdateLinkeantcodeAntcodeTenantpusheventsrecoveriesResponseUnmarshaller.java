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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse unmarshall(UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.RequestId"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ResultCode"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ResultMessage"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setBranch(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Branch"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setCompletedEventsCount(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.CompletedEventsCount"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.CreatedAt"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setEndTime(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.EndTime"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Id"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ProjectId"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setPushedBy(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.PushedBy"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setStartTime(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.StartTime"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setStatus(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Status"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setTarget(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Target"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setTotalEventsCount(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.TotalEventsCount"));
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.AccessLevel"));
		creator.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.AvatarUrl"));
		creator.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Bio"));
		creator.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CanCreateGroup"));
		creator.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CanCreateProject"));
		creator.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ColorSchemeId"));
		creator.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CreatedAt"));
		creator.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.CurrentSignInAt"));
		creator.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Department"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Email"));
		creator.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ExpiresAt"));
		creator.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ExternUid"));
		creator.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Id"));
		creator.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.IsAdmin"));
		creator.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Name"));
		creator.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.PrivateToken"));
		creator.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ProjectsLimit"));
		creator.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Registered"));
		creator.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Role"));
		creator.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.State"));
		creator.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.ThemeId"));
		creator.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.UpdatedAt"));
		creator.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Username"));
		creator.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.WebsiteUrl"));
		creator.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.Creator.Identities["+ i +"]"));
		}
		creator.setIdentities(identities);
		updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse.setCreator(creator);
	 
	 	return updateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse;
	}
}