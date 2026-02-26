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

import com.aliyuncs.devops.model.v20210625.CreateRepositoryResponse;
import com.aliyuncs.devops.model.v20210625.CreateRepositoryResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateRepositoryResponse.Result.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRepositoryResponseUnmarshaller {

	public static CreateRepositoryResponse unmarshall(CreateRepositoryResponse createRepositoryResponse, UnmarshallerContext _ctx) {
		
		createRepositoryResponse.setErrorMessage(_ctx.stringValue("CreateRepositoryResponse.errorMessage"));
		createRepositoryResponse.setRequestId(_ctx.stringValue("CreateRepositoryResponse.requestId"));
		createRepositoryResponse.setErrorCode(_ctx.stringValue("CreateRepositoryResponse.errorCode"));
		createRepositoryResponse.setSuccess(_ctx.booleanValue("CreateRepositoryResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateRepositoryResponse.result.id"));
		result.setDescription(_ctx.stringValue("CreateRepositoryResponse.result.description"));
		result.setDefaultBranch(_ctx.stringValue("CreateRepositoryResponse.result.defaultBranch"));
		result.setVisibilityLevel(_ctx.stringValue("CreateRepositoryResponse.result.visibilityLevel"));
		result.setSshUrlToRepo(_ctx.stringValue("CreateRepositoryResponse.result.sshUrlToRepo"));
		result.setHttpUrlToRepo(_ctx.stringValue("CreateRepositoryResponse.result.httpUrlToRepo"));
		result.setWebUrl(_ctx.stringValue("CreateRepositoryResponse.result.webUrl"));
		result.setName(_ctx.stringValue("CreateRepositoryResponse.result.name"));
		result.setNameWithNamespace(_ctx.stringValue("CreateRepositoryResponse.result.nameWithNamespace"));
		result.setPath(_ctx.stringValue("CreateRepositoryResponse.result.path"));
		result.setPathWithNamespace(_ctx.stringValue("CreateRepositoryResponse.result.pathWithNamespace"));
		result.setCreatedAt(_ctx.stringValue("CreateRepositoryResponse.result.createdAt"));
		result.setLastActivityAt(_ctx.stringValue("CreateRepositoryResponse.result.lastActivityAt"));
		result.setCreatorId(_ctx.longValue("CreateRepositoryResponse.result.creatorId"));
		result.setArchived(_ctx.booleanValue("CreateRepositoryResponse.result.archived"));
		result.setAvatar_url(_ctx.stringValue("CreateRepositoryResponse.result.avatar_url"));
		result.setDemoProject(_ctx.booleanValue("CreateRepositoryResponse.result.demoProject"));
		result.setImport_from_svn(_ctx.booleanValue("CreateRepositoryResponse.result.Import_from_svn"));

		Namespace namespace = new Namespace();
		namespace.setId(_ctx.longValue("CreateRepositoryResponse.result.namespace.id"));
		namespace.setName(_ctx.stringValue("CreateRepositoryResponse.result.namespace.name"));
		namespace.setPath(_ctx.stringValue("CreateRepositoryResponse.result.namespace.path"));
		namespace.setOwnerId(_ctx.longValue("CreateRepositoryResponse.result.namespace.ownerId"));
		namespace.setCreatedAt(_ctx.stringValue("CreateRepositoryResponse.result.namespace.createdAt"));
		namespace.setUpdatedAt(_ctx.stringValue("CreateRepositoryResponse.result.namespace.updatedAt"));
		namespace.setDescription(_ctx.stringValue("CreateRepositoryResponse.result.namespace.description"));
		namespace.setAvatar(_ctx.stringValue("CreateRepositoryResponse.result.namespace.avatar"));
		namespace.set_Public(_ctx.booleanValue("CreateRepositoryResponse.result.namespace.public"));
		namespace.setVisibilityLevel(_ctx.stringValue("CreateRepositoryResponse.result.namespace.visibilityLevel"));
		result.setNamespace(namespace);
		createRepositoryResponse.setResult(result);
	 
	 	return createRepositoryResponse;
	}
}