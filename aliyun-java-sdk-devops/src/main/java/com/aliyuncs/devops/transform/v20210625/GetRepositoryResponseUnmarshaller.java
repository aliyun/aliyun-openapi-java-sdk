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

import com.aliyuncs.devops.model.v20210625.GetRepositoryResponse;
import com.aliyuncs.devops.model.v20210625.GetRepositoryResponse.Repository;
import com.aliyuncs.devops.model.v20210625.GetRepositoryResponse.Repository.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryResponseUnmarshaller {

	public static GetRepositoryResponse unmarshall(GetRepositoryResponse getRepositoryResponse, UnmarshallerContext _ctx) {
		
		getRepositoryResponse.setRequestId(_ctx.stringValue("GetRepositoryResponse.requestId"));
		getRepositoryResponse.setErrorCode(_ctx.stringValue("GetRepositoryResponse.errorCode"));
		getRepositoryResponse.setErrorMessage(_ctx.stringValue("GetRepositoryResponse.errorMessage"));
		getRepositoryResponse.setSuccess(_ctx.booleanValue("GetRepositoryResponse.success"));

		Repository repository = new Repository();
		repository.setArchive(_ctx.booleanValue("GetRepositoryResponse.repository.archive"));
		repository.setAvatarUrl(_ctx.stringValue("GetRepositoryResponse.repository.avatarUrl"));
		repository.setCreatedAt(_ctx.stringValue("GetRepositoryResponse.repository.createdAt"));
		repository.setCreatorId(_ctx.longValue("GetRepositoryResponse.repository.creatorId"));
		repository.setDefaultBranch(_ctx.stringValue("GetRepositoryResponse.repository.defaultBranch"));
		repository.setDemoProjectStatus(_ctx.booleanValue("GetRepositoryResponse.repository.demoProjectStatus"));
		repository.setDescription(_ctx.stringValue("GetRepositoryResponse.repository.description"));
		repository.setHttpUrlToRepository(_ctx.stringValue("GetRepositoryResponse.repository.httpUrlToRepository"));
		repository.setId(_ctx.longValue("GetRepositoryResponse.repository.id"));
		repository.setLastActivityAt(_ctx.stringValue("GetRepositoryResponse.repository.lastActivityAt"));
		repository.setName(_ctx.stringValue("GetRepositoryResponse.repository.name"));
		repository.setNameWithNamespace(_ctx.stringValue("GetRepositoryResponse.repository.nameWithNamespace"));
		repository.setPath(_ctx.stringValue("GetRepositoryResponse.repository.path"));
		repository.setPathWithNamespace(_ctx.stringValue("GetRepositoryResponse.repository.pathWithNamespace"));
		repository.setSshUrlToRepository(_ctx.stringValue("GetRepositoryResponse.repository.sshUrlToRepository"));
		repository.setVisibilityLevel(_ctx.integerValue("GetRepositoryResponse.repository.visibilityLevel"));
		repository.setWebUrl(_ctx.stringValue("GetRepositoryResponse.repository.webUrl"));

		Namespace namespace = new Namespace();
		namespace.setId(_ctx.longValue("GetRepositoryResponse.repository.namespace.id"));
		namespace.setAvatar(_ctx.stringValue("GetRepositoryResponse.repository.namespace.avatar"));
		namespace.setCreatedAt(_ctx.stringValue("GetRepositoryResponse.repository.namespace.createdAt"));
		namespace.setDescription(_ctx.stringValue("GetRepositoryResponse.repository.namespace.description"));
		namespace.setName(_ctx.stringValue("GetRepositoryResponse.repository.namespace.name"));
		namespace.setOwnerId(_ctx.longValue("GetRepositoryResponse.repository.namespace.ownerId"));
		namespace.setPath(_ctx.stringValue("GetRepositoryResponse.repository.namespace.path"));
		namespace.setUpdatedAt(_ctx.stringValue("GetRepositoryResponse.repository.namespace.updatedAt"));
		namespace.setVisibilityLevel(_ctx.integerValue("GetRepositoryResponse.repository.namespace.visibilityLevel"));
		repository.setNamespace(namespace);
		getRepositoryResponse.setRepository(repository);
	 
	 	return getRepositoryResponse;
	}
}