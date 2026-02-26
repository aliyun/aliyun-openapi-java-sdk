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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.UpdateRepositoryResponse;
import com.aliyuncs.devops.model.v20210625.UpdateRepositoryResponse.Result;
import com.aliyuncs.devops.model.v20210625.UpdateRepositoryResponse.Result.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRepositoryResponseUnmarshaller {

	public static UpdateRepositoryResponse unmarshall(UpdateRepositoryResponse updateRepositoryResponse, UnmarshallerContext _ctx) {
		
		updateRepositoryResponse.setRequestId(_ctx.stringValue("UpdateRepositoryResponse.requestId"));
		updateRepositoryResponse.setErrorMessage(_ctx.stringValue("UpdateRepositoryResponse.errorMessage"));
		updateRepositoryResponse.setErrorCode(_ctx.stringValue("UpdateRepositoryResponse.errorCode"));
		updateRepositoryResponse.setSuccess(_ctx.booleanValue("UpdateRepositoryResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("UpdateRepositoryResponse.result.id"));
		result.setName(_ctx.stringValue("UpdateRepositoryResponse.result.name"));
		result.setNameWithNamespace(_ctx.stringValue("UpdateRepositoryResponse.result.nameWithNamespace"));
		result.setPath(_ctx.stringValue("UpdateRepositoryResponse.result.path"));
		result.setPathWithNamespace(_ctx.stringValue("UpdateRepositoryResponse.result.pathWithNamespace"));
		result.setDescription(_ctx.stringValue("UpdateRepositoryResponse.result.description"));
		result.setDefaultBranch(_ctx.stringValue("UpdateRepositoryResponse.result.defaultBranch"));
		result.setVisibilityLevel(_ctx.integerValue("UpdateRepositoryResponse.result.visibilityLevel"));
		result.setSshUrlToRepo(_ctx.stringValue("UpdateRepositoryResponse.result.sshUrlToRepo"));
		result.setHttpUrlToRepo(_ctx.stringValue("UpdateRepositoryResponse.result.httpUrlToRepo"));
		result.setWebUrl(_ctx.stringValue("UpdateRepositoryResponse.result.webUrl"));
		result.setIssuesEnabled(_ctx.booleanValue("UpdateRepositoryResponse.result.issuesEnabled"));
		result.setMergeRequestsEnabled(_ctx.booleanValue("UpdateRepositoryResponse.result.mergeRequestsEnabled"));
		result.setBuildsEnabled(_ctx.booleanValue("UpdateRepositoryResponse.result.buildsEnabled"));
		result.setWikiEnabled(_ctx.booleanValue("UpdateRepositoryResponse.result.wikiEnabled"));
		result.setSnippetsEnabled(_ctx.booleanValue("UpdateRepositoryResponse.result.snippetsEnabled"));
		result.setCreatedAt(_ctx.stringValue("UpdateRepositoryResponse.result.createdAt"));
		result.setLastActivityAt(_ctx.stringValue("UpdateRepositoryResponse.result.lastActivityAt"));
		result.setCreatorId(_ctx.longValue("UpdateRepositoryResponse.result.creatorId"));
		result.setArchived(_ctx.booleanValue("UpdateRepositoryResponse.result.archived"));
		result.setAvatarUrl(_ctx.stringValue("UpdateRepositoryResponse.result.avatarUrl"));

		Namespace namespace = new Namespace();
		namespace.setId(_ctx.longValue("UpdateRepositoryResponse.result.namespace.id"));
		namespace.setName(_ctx.stringValue("UpdateRepositoryResponse.result.namespace.name"));
		namespace.setPath(_ctx.stringValue("UpdateRepositoryResponse.result.namespace.path"));
		namespace.setOwnerId(_ctx.longValue("UpdateRepositoryResponse.result.namespace.ownerId"));
		namespace.setCreatedAt(_ctx.stringValue("UpdateRepositoryResponse.result.namespace.createdAt"));
		namespace.setUpdatedAt(_ctx.stringValue("UpdateRepositoryResponse.result.namespace.updatedAt"));
		namespace.setDescription(_ctx.stringValue("UpdateRepositoryResponse.result.namespace.description"));
		namespace.setAvatar(_ctx.stringValue("UpdateRepositoryResponse.result.namespace.avatar"));
		namespace.setVisibilityLevel(_ctx.integerValue("UpdateRepositoryResponse.result.namespace.visibilityLevel"));
		result.setNamespace(namespace);
		updateRepositoryResponse.setResult(result);
	 
	 	return updateRepositoryResponse;
	}
}