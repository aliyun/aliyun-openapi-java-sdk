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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeSnippetsidResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeSnippetsidResponse.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeSnippetsidResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeSnippetsidResponse unmarshall(UpdateLinkeantcodeAntcodeSnippetsidResponse updateLinkeantcodeAntcodeSnippetsidResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeSnippetsidResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.RequestId"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.ResultCode"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.ResultMessage"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setContent(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Content"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.CreatedAt"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Description"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.ExpiresAt"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setFileName(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.FileName"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Id"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setLabels(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Labels"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setLanguage(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Language"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.ProjectId"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setTitle(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Title"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setType(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Type"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeSnippetsidResponse.setVisibilityLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.VisibilityLevel"));

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Registered"));
		author.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Role"));
		author.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.State"));
		author.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeSnippetsidResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		updateLinkeantcodeAntcodeSnippetsidResponse.setAuthor(author);
	 
	 	return updateLinkeantcodeAntcodeSnippetsidResponse;
	}
}