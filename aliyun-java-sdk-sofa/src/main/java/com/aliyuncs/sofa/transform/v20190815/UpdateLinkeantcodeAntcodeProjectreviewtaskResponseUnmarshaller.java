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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectreviewtaskResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeProjectreviewtaskResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeProjectreviewtaskResponse unmarshall(UpdateLinkeantcodeAntcodeProjectreviewtaskResponse updateLinkeantcodeAntcodeProjectreviewtaskResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.RequestId"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.ResultCode"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.ResultMessage"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.CreatedAt"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setGlobPattern(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.GlobPattern"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Id"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setIsOwner(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.IsOwner"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setReviewId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.ReviewId"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setRole(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Role"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setScore(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Score"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.State"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setWeight(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Weight"));

		Reviewer reviewer = new Reviewer();
		reviewer.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.AccessLevel"));
		reviewer.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.AvatarUrl"));
		reviewer.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Bio"));
		reviewer.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CanCreateGroup"));
		reviewer.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CanCreateProject"));
		reviewer.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ColorSchemeId"));
		reviewer.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CreatedAt"));
		reviewer.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CurrentSignInAt"));
		reviewer.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Department"));
		reviewer.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Email"));
		reviewer.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ExpiresAt"));
		reviewer.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ExternUid"));
		reviewer.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Id"));
		reviewer.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.IsAdmin"));
		reviewer.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Name"));
		reviewer.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.PrivateToken"));
		reviewer.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ProjectsLimit"));
		reviewer.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Registered"));
		reviewer.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Role"));
		reviewer.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.State"));
		reviewer.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ThemeId"));
		reviewer.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.UpdatedAt"));
		reviewer.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Username"));
		reviewer.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.WebsiteUrl"));
		reviewer.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Identities["+ i +"]"));
		}
		reviewer.setIdentities(identities);
		updateLinkeantcodeAntcodeProjectreviewtaskResponse.setReviewer(reviewer);
	 
	 	return updateLinkeantcodeAntcodeProjectreviewtaskResponse;
	}
}