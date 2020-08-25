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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeProjectreviewtaskResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeProjectreviewtaskResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeProjectreviewtaskResponse unmarshall(DeleteLinkeantcodeAntcodeProjectreviewtaskResponse deleteLinkeantcodeAntcodeProjectreviewtaskResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.RequestId"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.ResultCode"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setGlobPattern(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.GlobPattern"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Id"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setIsOwner(_ctx.booleanValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.IsOwner"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setReviewId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.ReviewId"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setRole(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Role"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setScore(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Score"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setState(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.State"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.UpdatedAt"));
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setWeight(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Weight"));

		Reviewer reviewer = new Reviewer();
		reviewer.setAccessLevel(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.AccessLevel"));
		reviewer.setAvatarUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.AvatarUrl"));
		reviewer.setBio(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Bio"));
		reviewer.setCanCreateGroup(_ctx.booleanValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CanCreateGroup"));
		reviewer.setCanCreateProject(_ctx.booleanValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CanCreateProject"));
		reviewer.setColorSchemeId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ColorSchemeId"));
		reviewer.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CreatedAt"));
		reviewer.setCurrentSignInAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.CurrentSignInAt"));
		reviewer.setDepartment(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Department"));
		reviewer.setEmail(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Email"));
		reviewer.setExpiresAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ExpiresAt"));
		reviewer.setExternUid(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ExternUid"));
		reviewer.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Id"));
		reviewer.setIsAdmin(_ctx.booleanValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.IsAdmin"));
		reviewer.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Name"));
		reviewer.setPrivateToken(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.PrivateToken"));
		reviewer.setProjectsLimit(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ProjectsLimit"));
		reviewer.setRegistered(_ctx.booleanValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Registered"));
		reviewer.setRole(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Role"));
		reviewer.setState(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.State"));
		reviewer.setThemeId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.ThemeId"));
		reviewer.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.UpdatedAt"));
		reviewer.setUsername(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Username"));
		reviewer.setWebsiteUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.WebsiteUrl"));
		reviewer.setWebUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectreviewtaskResponse.Reviewer.Identities["+ i +"]"));
		}
		reviewer.setIdentities(identities);
		deleteLinkeantcodeAntcodeProjectreviewtaskResponse.setReviewer(reviewer);
	 
	 	return deleteLinkeantcodeAntcodeProjectreviewtaskResponse;
	}
}