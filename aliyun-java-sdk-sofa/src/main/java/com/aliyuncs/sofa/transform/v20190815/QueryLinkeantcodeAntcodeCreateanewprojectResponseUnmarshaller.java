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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeCreateanewprojectResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeCreateanewprojectResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeCreateanewprojectResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeCreateanewprojectResponse unmarshall(QueryLinkeantcodeAntcodeCreateanewprojectResponse queryLinkeantcodeAntcodeCreateanewprojectResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.RequestId"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResultCode"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResultMessage"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setArchived(_ctx.booleanValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Archived"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setArtifacts(_ctx.booleanValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Artifacts"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.AvatarUrl"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setCheckEmail(_ctx.booleanValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.CheckEmail"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.CreatedAt"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setCreatorId(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.CreatorId"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setDefaultBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.DefaultBranch"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Description"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setEncoding(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Encoding"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setExceptBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ExceptBranch"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setHomepage(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Homepage"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setHttpUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.HttpUrlToRepo"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Id"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setImportStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ImportStatus"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setIsGray(_ctx.booleanValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.IsGray"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setIsReview(_ctx.booleanValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.IsReview"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setLastActivityAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.LastActivityAt"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Name"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setNameWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.NameWithNamespace"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Path"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setPathWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.PathWithNamespace"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.set_Public(_ctx.booleanValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Public"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setRepositorySize(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.RepositorySize"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setRepositorySizeLimit(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.RepositorySizeLimit"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResponsePage(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResponsePage"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResponsePageInfoNextPage(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResponsePageInfoNextPage"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResponsePageInfoPerPage(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResponsePageInfoPerPage"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResponsePageInfoPrevPage(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResponsePageInfoPrevPage"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResponsePageInfoTotal(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResponsePageInfoTotal"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResponsePageInfoTotalPages(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResponsePageInfoTotalPages"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setRunnersToken(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.RunnersToken"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setSshUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.SshUrlToRepo"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setVisibility(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Visibility"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setVisibilityLevel(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.VisibilityLevel"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.WebUrl"));

		List<String> tagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.TagList.Length"); i++) {
			tagList.add(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.TagList["+ i +"]"));
		}
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setTagList(tagList);

		Namespace namespace = new Namespace();
		namespace.setAvatar(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Avatar"));
		namespace.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.AvatarUrl"));
		namespace.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.CreatedAt"));
		namespace.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Description"));
		namespace.setId(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Id"));
		namespace.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Name"));
		namespace.setOwner(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Owner"));
		namespace.setOwnerId(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.OwnerId"));
		namespace.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Path"));
		namespace.setPermission(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Permission"));
		namespace.set_Public(_ctx.booleanValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Public"));
		namespace.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.State"));
		namespace.setTenant(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Tenant"));
		namespace.setType(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.Type"));
		namespace.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.UpdatedAt"));
		namespace.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Namespace.WebUrl"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setNamespace(namespace);

		Owner owner = new Owner();
		owner.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.AvatarUrl"));
		owner.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.CreatedAt"));
		owner.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.Email"));
		owner.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.ExternUid"));
		owner.setId(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.Id"));
		owner.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.Name"));
		owner.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.NotificationLevel"));
		owner.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.State"));
		owner.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.UpdatedAt"));
		owner.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.Username"));
		owner.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Owner.WebUrl"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setOwner(owner);

		Permission permission = new Permission();
		permission.setGroupAccess(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Permission.GroupAccess"));
		permission.setProjectAccess(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Permission.ProjectAccess"));
		permission.setReviewAccess(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Permission.ReviewAccess"));
		permission.setTenantAccess(_ctx.stringValue("QueryLinkeantcodeAntcodeCreateanewprojectResponse.Permission.TenantAccess"));
		queryLinkeantcodeAntcodeCreateanewprojectResponse.setPermission(permission);
	 
	 	return queryLinkeantcodeAntcodeCreateanewprojectResponse;
	}
}