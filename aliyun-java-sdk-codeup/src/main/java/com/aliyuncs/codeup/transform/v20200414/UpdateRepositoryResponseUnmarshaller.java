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

import com.aliyuncs.codeup.model.v20200414.UpdateRepositoryResponse;
import com.aliyuncs.codeup.model.v20200414.UpdateRepositoryResponse.Result;
import com.aliyuncs.codeup.model.v20200414.UpdateRepositoryResponse.Result.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRepositoryResponseUnmarshaller {

	public static UpdateRepositoryResponse unmarshall(UpdateRepositoryResponse updateRepositoryResponse, UnmarshallerContext _ctx) {
		
		updateRepositoryResponse.setRequestId(_ctx.stringValue("UpdateRepositoryResponse.RequestId"));
		updateRepositoryResponse.setErrorCode(_ctx.stringValue("UpdateRepositoryResponse.ErrorCode"));
		updateRepositoryResponse.setErrorMessage(_ctx.stringValue("UpdateRepositoryResponse.ErrorMessage"));
		updateRepositoryResponse.setSuccess(_ctx.booleanValue("UpdateRepositoryResponse.Success"));

		Result result = new Result();
		result.setArchive(_ctx.booleanValue("UpdateRepositoryResponse.Result.Archive"));
		result.setAvatarUrl(_ctx.stringValue("UpdateRepositoryResponse.Result.AvatarUrl"));
		result.setCreatedAt(_ctx.stringValue("UpdateRepositoryResponse.Result.CreatedAt"));
		result.setCreatorId(_ctx.longValue("UpdateRepositoryResponse.Result.CreatorId"));
		result.setDefaultBranch(_ctx.stringValue("UpdateRepositoryResponse.Result.DefaultBranch"));
		result.setDescription(_ctx.stringValue("UpdateRepositoryResponse.Result.Description"));
		result.setHttpUrlToRepo(_ctx.stringValue("UpdateRepositoryResponse.Result.HttpUrlToRepo"));
		result.setId(_ctx.longValue("UpdateRepositoryResponse.Result.Id"));
		result.setLastActivityAt(_ctx.stringValue("UpdateRepositoryResponse.Result.LastActivityAt"));
		result.setName(_ctx.stringValue("UpdateRepositoryResponse.Result.Name"));
		result.setNameWithNamespace(_ctx.stringValue("UpdateRepositoryResponse.Result.NameWithNamespace"));
		result.setPath(_ctx.stringValue("UpdateRepositoryResponse.Result.Path"));
		result.setPathWithNamespace(_ctx.stringValue("UpdateRepositoryResponse.Result.PathWithNamespace"));
		result.setSshUrlToRepo(_ctx.stringValue("UpdateRepositoryResponse.Result.SshUrlToRepo"));
		result.setVisibilityLevel(_ctx.stringValue("UpdateRepositoryResponse.Result.VisibilityLevel"));
		result.setWebUrl(_ctx.stringValue("UpdateRepositoryResponse.Result.WebUrl"));

		Namespace namespace = new Namespace();
		namespace.setAvatar(_ctx.stringValue("UpdateRepositoryResponse.Result.Namespace.Avatar"));
		namespace.setCreatedAt(_ctx.stringValue("UpdateRepositoryResponse.Result.Namespace.CreatedAt"));
		namespace.setDescription(_ctx.stringValue("UpdateRepositoryResponse.Result.Namespace.Description"));
		namespace.setId(_ctx.longValue("UpdateRepositoryResponse.Result.Namespace.Id"));
		namespace.setName(_ctx.stringValue("UpdateRepositoryResponse.Result.Namespace.Name"));
		namespace.setOwnerId(_ctx.longValue("UpdateRepositoryResponse.Result.Namespace.OwnerId"));
		namespace.setPath(_ctx.stringValue("UpdateRepositoryResponse.Result.Namespace.Path"));
		namespace.set_Public(_ctx.booleanValue("UpdateRepositoryResponse.Result.Namespace.Public"));
		namespace.setUpdatedAt(_ctx.stringValue("UpdateRepositoryResponse.Result.Namespace.UpdatedAt"));
		namespace.setVisibilityLevel(_ctx.stringValue("UpdateRepositoryResponse.Result.Namespace.VisibilityLevel"));
		result.setNamespace(namespace);
		updateRepositoryResponse.setResult(result);
	 
	 	return updateRepositoryResponse;
	}
}