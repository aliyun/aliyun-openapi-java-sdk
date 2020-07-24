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

package com.aliyuncs.codeup.transform.v20200414;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.CreateRepositoryResponse;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryResponse.Result;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryResponse.Result.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRepositoryResponseUnmarshaller {

	public static CreateRepositoryResponse unmarshall(CreateRepositoryResponse createRepositoryResponse, UnmarshallerContext _ctx) {
		
		createRepositoryResponse.setRequestId(_ctx.stringValue("CreateRepositoryResponse.RequestId"));
		createRepositoryResponse.setErrorCode(_ctx.integerValue("CreateRepositoryResponse.ErrorCode"));
		createRepositoryResponse.setErrorMessage(_ctx.stringValue("CreateRepositoryResponse.ErrorMessage"));
		createRepositoryResponse.setSuccess(_ctx.booleanValue("CreateRepositoryResponse.Success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateRepositoryResponse.Result.Id"));
		result.setSshUrlToRepo(_ctx.stringValue("CreateRepositoryResponse.Result.SshUrlToRepo"));
		result.setDescription(_ctx.stringValue("CreateRepositoryResponse.Result.Description"));
		result.setDefaultBranch(_ctx.stringValue("CreateRepositoryResponse.Result.DefaultBranch"));
		result.set_Public(_ctx.booleanValue("CreateRepositoryResponse.Result.Public"));
		result.setVisibilityLevel(_ctx.stringValue("CreateRepositoryResponse.Result.VisibilityLevel"));
		result.setHttpUrlToRepo(_ctx.stringValue("CreateRepositoryResponse.Result.HttpUrlToRepo"));
		result.setWebUrl(_ctx.stringValue("CreateRepositoryResponse.Result.WebUrl"));
		result.setName(_ctx.stringValue("CreateRepositoryResponse.Result.Name"));
		result.setNameWithNamespace(_ctx.stringValue("CreateRepositoryResponse.Result.NameWithNamespace"));
		result.setPath(_ctx.stringValue("CreateRepositoryResponse.Result.Path"));
		result.setPathWithNamespace(_ctx.stringValue("CreateRepositoryResponse.Result.PathWithNamespace"));
		result.setIssuesEnableStatus(_ctx.booleanValue("CreateRepositoryResponse.Result.IssuesEnableStatus"));
		result.setMergeRequestEnableStatus(_ctx.booleanValue("CreateRepositoryResponse.Result.MergeRequestEnableStatus"));
		result.setBuildsEnableStatus(_ctx.booleanValue("CreateRepositoryResponse.Result.BuildsEnableStatus"));
		result.setWikiEnableStatus(_ctx.booleanValue("CreateRepositoryResponse.Result.WikiEnableStatus"));
		result.setSnippetsEnableStatus(_ctx.booleanValue("CreateRepositoryResponse.Result.SnippetsEnableStatus"));
		result.setCreatedAt(_ctx.stringValue("CreateRepositoryResponse.Result.CreatedAt"));
		result.setLastActivityAt(_ctx.stringValue("CreateRepositoryResponse.Result.LastActivityAt"));
		result.setCreatorId(_ctx.longValue("CreateRepositoryResponse.Result.CreatorId"));
		result.setArchive(_ctx.booleanValue("CreateRepositoryResponse.Result.Archive"));
		result.setAvatarUrl(_ctx.stringValue("CreateRepositoryResponse.Result.AvatarUrl"));
		result.setDemoProjectStatus(_ctx.booleanValue("CreateRepositoryResponse.Result.DemoProjectStatus"));

		List<String> tagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRepositoryResponse.Result.TagList.Length"); i++) {
			tagList.add(_ctx.stringValue("CreateRepositoryResponse.Result.TagList["+ i +"]"));
		}
		result.setTagList(tagList);

		Namespace namespace = new Namespace();
		namespace.setId(_ctx.longValue("CreateRepositoryResponse.Result.Namespace.Id"));
		namespace.setName(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.Name"));
		namespace.setPath(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.Path"));
		namespace.setOwnerId(_ctx.longValue("CreateRepositoryResponse.Result.Namespace.OwnerId"));
		namespace.setCreatedAt(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.CreatedAt"));
		namespace.setUpdatedAt(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.UpdatedAt"));
		namespace.setDescription(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.Description"));
		namespace.setState(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.State"));
		namespace.setAvatar(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.Avatar"));
		namespace.set_Public(_ctx.booleanValue("CreateRepositoryResponse.Result.Namespace.Public"));
		namespace.setVisibilityLevel(_ctx.stringValue("CreateRepositoryResponse.Result.Namespace.VisibilityLevel"));
		result.setNamespace(namespace);
		createRepositoryResponse.setResult(result);
	 
	 	return createRepositoryResponse;
	}
}