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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeantcodeAntcodeSnippetsResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeantcodeAntcodeSnippetsResponse.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeantcodeAntcodeSnippetsResponseUnmarshaller {

	public static SaveLinkeantcodeAntcodeSnippetsResponse unmarshall(SaveLinkeantcodeAntcodeSnippetsResponse saveLinkeantcodeAntcodeSnippetsResponse, UnmarshallerContext _ctx) {
		
		saveLinkeantcodeAntcodeSnippetsResponse.setRequestId(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.RequestId"));
		saveLinkeantcodeAntcodeSnippetsResponse.setResultCode(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.ResultCode"));
		saveLinkeantcodeAntcodeSnippetsResponse.setResultMessage(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.ResultMessage"));
		saveLinkeantcodeAntcodeSnippetsResponse.setContent(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Content"));
		saveLinkeantcodeAntcodeSnippetsResponse.setCreatedAt(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.CreatedAt"));
		saveLinkeantcodeAntcodeSnippetsResponse.setDescription(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Description"));
		saveLinkeantcodeAntcodeSnippetsResponse.setExpiresAt(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.ExpiresAt"));
		saveLinkeantcodeAntcodeSnippetsResponse.setFileName(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.FileName"));
		saveLinkeantcodeAntcodeSnippetsResponse.setId(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.Id"));
		saveLinkeantcodeAntcodeSnippetsResponse.setLabels(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Labels"));
		saveLinkeantcodeAntcodeSnippetsResponse.setLanguage(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Language"));
		saveLinkeantcodeAntcodeSnippetsResponse.setProjectId(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.ProjectId"));
		saveLinkeantcodeAntcodeSnippetsResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.ResponseStatusCode"));
		saveLinkeantcodeAntcodeSnippetsResponse.setTitle(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Title"));
		saveLinkeantcodeAntcodeSnippetsResponse.setType(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Type"));
		saveLinkeantcodeAntcodeSnippetsResponse.setUpdatedAt(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.UpdatedAt"));
		saveLinkeantcodeAntcodeSnippetsResponse.setVisibilityLevel(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.VisibilityLevel"));

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Registered"));
		author.setRole(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Role"));
		author.setState(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.State"));
		author.setThemeId(_ctx.longValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("SaveLinkeantcodeAntcodeSnippetsResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		saveLinkeantcodeAntcodeSnippetsResponse.setAuthor(author);
	 
	 	return saveLinkeantcodeAntcodeSnippetsResponse;
	}
}