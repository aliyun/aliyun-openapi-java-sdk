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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem.Group_infos;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem.Group_infos.GroupInfo;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem.Group_infos.GroupRole;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem.Repository_infos;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem.Repository_infos.RepositoryInfo;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem.Repository_infos.RepositoryRole;
import com.aliyuncs.devops.model.v20210625.ListUserResourcesResponse.ResultItem.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserResourcesResponseUnmarshaller {

	public static ListUserResourcesResponse unmarshall(ListUserResourcesResponse listUserResourcesResponse, UnmarshallerContext _ctx) {
		
		listUserResourcesResponse.setRequestId(_ctx.stringValue("ListUserResourcesResponse.requestId"));
		listUserResourcesResponse.setSuccess(_ctx.booleanValue("ListUserResourcesResponse.success"));
		listUserResourcesResponse.setErrorMessage(_ctx.stringValue("ListUserResourcesResponse.errorMessage"));
		listUserResourcesResponse.setErrorCode(_ctx.stringValue("ListUserResourcesResponse.errorCode"));
		listUserResourcesResponse.setTotal(_ctx.longValue("ListUserResourcesResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserResourcesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();

			UserInfo userInfo = new UserInfo();
			userInfo.setId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].userInfo.id"));
			userInfo.setName(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].userInfo.name"));
			userInfo.setUsername(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].userInfo.username"));
			userInfo.setState(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].userInfo.state"));
			userInfo.setAvatarUrl(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].userInfo.avatarUrl"));
			userInfo.setEmail(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].userInfo.email"));
			resultItem.setUserInfo(userInfo);

			List<Group_infos> groupInfos = new ArrayList<Group_infos>();
			for (int j = 0; j < _ctx.lengthValue("ListUserResourcesResponse.result["+ i +"].groupInfos.Length"); j++) {
				Group_infos group_infos = new Group_infos();

				GroupInfo groupInfo = new GroupInfo();
				groupInfo.setId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.id"));
				groupInfo.setName(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.name"));
				groupInfo.setPath(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.path"));
				groupInfo.setNameWithNamespace(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.nameWithNamespace"));
				groupInfo.setPathWithNamespace(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.pathWithNamespace"));
				groupInfo.setParentId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.parentId"));
				groupInfo.setOwnerId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.ownerId"));
				groupInfo.setCreatedAt(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.createdAt"));
				groupInfo.setUpdatedAt(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.updatedAt"));
				groupInfo.setVisibilityLevel(_ctx.integerValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.visibilityLevel"));
				groupInfo.setDescription(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupInfo.description"));
				group_infos.setGroupInfo(groupInfo);

				GroupRole groupRole = new GroupRole();
				groupRole.setSourceId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupRole.sourceId"));
				groupRole.setSourceType(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupRole.sourceType"));
				groupRole.setAccessLevel(_ctx.integerValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupRole.accessLevel"));
				groupRole.setCnRoleName(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupRole.cnRoleName"));
				groupRole.setEnRoleName(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].groupInfos["+ j +"].groupRole.enRoleName"));
				group_infos.setGroupRole(groupRole);

				groupInfos.add(group_infos);
			}
			resultItem.setGroupInfos(groupInfos);

			List<Repository_infos> repositoryInfos = new ArrayList<Repository_infos>();
			for (int j = 0; j < _ctx.lengthValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos.Length"); j++) {
				Repository_infos repository_infos = new Repository_infos();

				RepositoryInfo repositoryInfo = new RepositoryInfo();
				repositoryInfo.setId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.id"));
				repositoryInfo.setName(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.name"));
				repositoryInfo.setPath(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.path"));
				repositoryInfo.setDescription(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.description"));
				repositoryInfo.setNameWithNamespace(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.nameWithNamespace"));
				repositoryInfo.setPathWithNamespace(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.pathWithNamespace"));
				repositoryInfo.setVisibilityLevel(_ctx.integerValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.visibilityLevel"));
				repositoryInfo.setLastActivityAt(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.lastActivityAt"));
				repositoryInfo.setNamespaceId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.namespaceId"));
				repositoryInfo.setAccessLevel(_ctx.integerValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.accessLevel"));
				repositoryInfo.setCreatedAt(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.createdAt"));
				repositoryInfo.setUpdatedAt(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.updatedAt"));
				repositoryInfo.setArchived(_ctx.booleanValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.archived"));
				repositoryInfo.setCreatorId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.creatorId"));
				repositoryInfo.setEncrypted(_ctx.booleanValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryInfo.encrypted"));
				repository_infos.setRepositoryInfo(repositoryInfo);

				RepositoryRole repositoryRole = new RepositoryRole();
				repositoryRole.setSourceId(_ctx.longValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryRole.sourceId"));
				repositoryRole.setSourceType(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryRole.sourceType"));
				repositoryRole.setAccessLevel(_ctx.integerValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryRole.accessLevel"));
				repositoryRole.setCnRoleName(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryRole.cnRoleName"));
				repositoryRole.setEnRoleName(_ctx.stringValue("ListUserResourcesResponse.result["+ i +"].repositoryInfos["+ j +"].repositoryRole.enRoleName"));
				repository_infos.setRepositoryRole(repositoryRole);

				repositoryInfos.add(repository_infos);
			}
			resultItem.setRepositoryInfos(repositoryInfos);

			result.add(resultItem);
		}
		listUserResourcesResponse.setResult(result);
	 
	 	return listUserResourcesResponse;
	}
}