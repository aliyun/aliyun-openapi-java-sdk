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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjectreviewtaskResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeProjectreviewtaskResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeProjectreviewtaskResponse unmarshall(CreateLinkeantcodeAntcodeProjectreviewtaskResponse createLinkeantcodeAntcodeProjectreviewtaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.RequestId"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.ResultCode"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.ResultMessage"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.CreatedAt"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setGlobPattern(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.GlobPattern"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Id"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setIsOwner(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.IsOwner"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setReviewId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.ReviewId"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setRole(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Role"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setScore(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Score"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.State"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.UpdatedAt"));
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setWeight(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Weight"));

		Reviewer reviewer = new Reviewer();
		reviewer.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.AccessLevel"));
		reviewer.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.AvatarUrl"));
		reviewer.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Bio"));
		reviewer.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CanCreateGroup"));
		reviewer.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CanCreateProject"));
		reviewer.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ColorSchemeId"));
		reviewer.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CreatedAt"));
		reviewer.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CurrentSignInAt"));
		reviewer.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Department"));
		reviewer.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Email"));
		reviewer.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ExpiresAt"));
		reviewer.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ExternUid"));
		reviewer.setId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Id"));
		reviewer.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.IsAdmin"));
		reviewer.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Name"));
		reviewer.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.PrivateToken"));
		reviewer.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ProjectsLimit"));
		reviewer.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Registered"));
		reviewer.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Role"));
		reviewer.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.State"));
		reviewer.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ThemeId"));
		reviewer.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.UpdatedAt"));
		reviewer.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Username"));
		reviewer.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.WebsiteUrl"));
		reviewer.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Identities["+ i +"]"));
		}
		reviewer.setIdentities(identities);
		createLinkeantcodeAntcodeProjectreviewtaskResponse.setReviewer(reviewer);
	 
	 	return createLinkeantcodeAntcodeProjectreviewtaskResponse;
	}
}