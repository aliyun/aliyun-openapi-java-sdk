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

import com.aliyuncs.sofa.model.v20190815.ListAKSAcrNamespaceRepoResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrNamespaceRepoResponse.RepoList;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrNamespaceRepoResponse.RepoList.ReposItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrNamespaceRepoResponse.RepoList.ReposItem.RepoDomainListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSAcrNamespaceRepoResponseUnmarshaller {

	public static ListAKSAcrNamespaceRepoResponse unmarshall(ListAKSAcrNamespaceRepoResponse listAKSAcrNamespaceRepoResponse, UnmarshallerContext _ctx) {
		
		listAKSAcrNamespaceRepoResponse.setRequestId(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RequestId"));
		listAKSAcrNamespaceRepoResponse.setResultCode(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.ResultCode"));
		listAKSAcrNamespaceRepoResponse.setResultMessage(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.ResultMessage"));

		RepoList repoList = new RepoList();
		repoList.setPage(_ctx.longValue("ListAKSAcrNamespaceRepoResponse.RepoList.Page"));
		repoList.setPageSize(_ctx.longValue("ListAKSAcrNamespaceRepoResponse.RepoList.PageSize"));
		repoList.setTotal(_ctx.longValue("ListAKSAcrNamespaceRepoResponse.RepoList.Total"));

		List<ReposItem> repos = new ArrayList<ReposItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos.Length"); i++) {
			ReposItem reposItem = new ReposItem();
			reposItem.setDetail(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].Detail"));
			reposItem.setGmtCreate(_ctx.longValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].GmtCreate"));
			reposItem.setGmtModified(_ctx.longValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].GmtModified"));
			reposItem.setRegionId(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RegionId"));
			reposItem.setRepoAuthorizeType(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoAuthorizeType"));
			reposItem.setRepoBuildType(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoBuildType"));
			reposItem.setRepoName(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoName"));
			reposItem.setRepoNamespace(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoNamespace"));
			reposItem.setRepoStatus(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoStatus"));
			reposItem.setRepoType(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoType"));
			reposItem.setSummary(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].Summary"));

			List<RepoDomainListItem> repoDomainList = new ArrayList<RepoDomainListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoDomainList.Length"); j++) {
				RepoDomainListItem repoDomainListItem = new RepoDomainListItem();
				repoDomainListItem.setDomain(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoDomainList["+ j +"].Domain"));
				repoDomainListItem.setType(_ctx.stringValue("ListAKSAcrNamespaceRepoResponse.RepoList.Repos["+ i +"].RepoDomainList["+ j +"].Type"));

				repoDomainList.add(repoDomainListItem);
			}
			reposItem.setRepoDomainList(repoDomainList);

			repos.add(reposItem);
		}
		repoList.setRepos(repos);
		listAKSAcrNamespaceRepoResponse.setRepoList(repoList);
	 
	 	return listAKSAcrNamespaceRepoResponse;
	}
}