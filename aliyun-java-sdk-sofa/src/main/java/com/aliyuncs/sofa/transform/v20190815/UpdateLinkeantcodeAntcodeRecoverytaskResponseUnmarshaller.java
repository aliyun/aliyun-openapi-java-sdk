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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeRecoverytaskResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeRecoverytaskResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeRecoverytaskResponse unmarshall(UpdateLinkeantcodeAntcodeRecoverytaskResponse updateLinkeantcodeAntcodeRecoverytaskResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeRecoverytaskResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.RequestId"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.ResultCode"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.ResultMessage"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setBranch(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Branch"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setCompletedEventsCount(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.CompletedEventsCount"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.CreatedAt"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setEndTime(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.EndTime"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Id"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.ProjectId"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setPushedBy(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.PushedBy"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setStartTime(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.StartTime"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setStatus(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Status"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setTarget(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Target"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setTotalEventsCount(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.TotalEventsCount"));
		updateLinkeantcodeAntcodeRecoverytaskResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.AccessLevel"));
		creator.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.AvatarUrl"));
		creator.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Bio"));
		creator.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CanCreateGroup"));
		creator.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CanCreateProject"));
		creator.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ColorSchemeId"));
		creator.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CreatedAt"));
		creator.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.CurrentSignInAt"));
		creator.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Department"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Email"));
		creator.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ExpiresAt"));
		creator.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ExternUid"));
		creator.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Id"));
		creator.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.IsAdmin"));
		creator.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Name"));
		creator.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.PrivateToken"));
		creator.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ProjectsLimit"));
		creator.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Registered"));
		creator.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Role"));
		creator.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.State"));
		creator.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.ThemeId"));
		creator.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.UpdatedAt"));
		creator.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Username"));
		creator.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.WebsiteUrl"));
		creator.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeRecoverytaskResponse.Creator.Identities["+ i +"]"));
		}
		creator.setIdentities(identities);
		updateLinkeantcodeAntcodeRecoverytaskResponse.setCreator(creator);
	 
	 	return updateLinkeantcodeAntcodeRecoverytaskResponse;
	}
}