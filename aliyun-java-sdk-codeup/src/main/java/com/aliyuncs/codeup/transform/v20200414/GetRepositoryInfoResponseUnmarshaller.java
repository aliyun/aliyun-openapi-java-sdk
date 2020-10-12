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

import com.aliyuncs.codeup.model.v20200414.GetRepositoryInfoResponse;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryInfoResponse.Result;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryInfoResponse.Result.Namespace;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryInfoResponse.Result.Permissions;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryInfoResponse.Result.Permissions.GroupAccess;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryInfoResponse.Result.Permissions.ProjectAccess;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryInfoResponseUnmarshaller {

	public static GetRepositoryInfoResponse unmarshall(GetRepositoryInfoResponse getRepositoryInfoResponse, UnmarshallerContext _ctx) {
		
		getRepositoryInfoResponse.setRequestId(_ctx.stringValue("GetRepositoryInfoResponse.RequestId"));
		getRepositoryInfoResponse.setErrorCode(_ctx.integerValue("GetRepositoryInfoResponse.ErrorCode"));
		getRepositoryInfoResponse.setErrorMessage(_ctx.stringValue("GetRepositoryInfoResponse.ErrorMessage"));
		getRepositoryInfoResponse.setSuccess(_ctx.booleanValue("GetRepositoryInfoResponse.Success"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetRepositoryInfoResponse.Result.Id"));
		result.setSshUrlToRepo(_ctx.stringValue("GetRepositoryInfoResponse.Result.SshUrlToRepo"));
		result.setDescription(_ctx.stringValue("GetRepositoryInfoResponse.Result.Description"));
		result.setDefaultBranch(_ctx.stringValue("GetRepositoryInfoResponse.Result.DefaultBranch"));
		result.set_Public(_ctx.booleanValue("GetRepositoryInfoResponse.Result.Public"));
		result.setVisibilityLevel(_ctx.stringValue("GetRepositoryInfoResponse.Result.VisibilityLevel"));
		result.setHttpUrlToRepo(_ctx.stringValue("GetRepositoryInfoResponse.Result.HttpUrlToRepo"));
		result.setWebUrl(_ctx.stringValue("GetRepositoryInfoResponse.Result.WebUrl"));
		result.setName(_ctx.stringValue("GetRepositoryInfoResponse.Result.Name"));
		result.setNameWithNamespace(_ctx.stringValue("GetRepositoryInfoResponse.Result.NameWithNamespace"));
		result.setPath(_ctx.stringValue("GetRepositoryInfoResponse.Result.Path"));
		result.setPathWithNamespace(_ctx.stringValue("GetRepositoryInfoResponse.Result.PathWithNamespace"));
		result.setCreatedAt(_ctx.stringValue("GetRepositoryInfoResponse.Result.CreatedAt"));
		result.setLastActivityAt(_ctx.stringValue("GetRepositoryInfoResponse.Result.LastActivityAt"));
		result.setCreatorId(_ctx.longValue("GetRepositoryInfoResponse.Result.CreatorId"));
		result.setArchive(_ctx.booleanValue("GetRepositoryInfoResponse.Result.Archive"));
		result.setAvatarUrl(_ctx.stringValue("GetRepositoryInfoResponse.Result.AvatarUrl"));
		result.setDemoProjectStatus(_ctx.booleanValue("GetRepositoryInfoResponse.Result.DemoProjectStatus"));
		result.setAccessLevel(_ctx.integerValue("GetRepositoryInfoResponse.Result.AccessLevel"));
		result.setImportStatus(_ctx.stringValue("GetRepositoryInfoResponse.Result.ImportStatus"));
		result.setImportUrl(_ctx.stringValue("GetRepositoryInfoResponse.Result.ImportUrl"));
		result.setImportFromSubversion(_ctx.booleanValue("GetRepositoryInfoResponse.Result.ImportFromSubversion"));

		List<String> tagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRepositoryInfoResponse.Result.TagList.Length"); i++) {
			tagList.add(_ctx.stringValue("GetRepositoryInfoResponse.Result.TagList["+ i +"]"));
		}
		result.setTagList(tagList);

		Namespace namespace = new Namespace();
		namespace.setId(_ctx.longValue("GetRepositoryInfoResponse.Result.Namespace.Id"));
		namespace.setName(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.Name"));
		namespace.setPath(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.Path"));
		namespace.setOwnerId(_ctx.longValue("GetRepositoryInfoResponse.Result.Namespace.OwnerId"));
		namespace.setCreatedAt(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.CreatedAt"));
		namespace.setUpdatedAt(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.UpdatedAt"));
		namespace.setDescription(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.Description"));
		namespace.setState(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.State"));
		namespace.setAvatar(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.Avatar"));
		namespace.set_Public(_ctx.booleanValue("GetRepositoryInfoResponse.Result.Namespace.Public"));
		namespace.setVisibilityLevel(_ctx.stringValue("GetRepositoryInfoResponse.Result.Namespace.VisibilityLevel"));
		result.setNamespace(namespace);

		Permissions permissions = new Permissions();

		ProjectAccess projectAccess = new ProjectAccess();
		projectAccess.setAccessLevel(_ctx.integerValue("GetRepositoryInfoResponse.Result.Permissions.ProjectAccess.AccessLevel"));
		permissions.setProjectAccess(projectAccess);

		GroupAccess groupAccess = new GroupAccess();
		groupAccess.setAccessLevel(_ctx.integerValue("GetRepositoryInfoResponse.Result.Permissions.GroupAccess.AccessLevel"));
		permissions.setGroupAccess(groupAccess);
		result.setPermissions(permissions);
		getRepositoryInfoResponse.setResult(result);
	 
	 	return getRepositoryInfoResponse;
	}
}