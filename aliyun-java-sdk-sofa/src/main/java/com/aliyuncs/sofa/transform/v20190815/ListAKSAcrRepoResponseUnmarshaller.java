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

import com.aliyuncs.sofa.model.v20190815.ListAKSAcrRepoResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrRepoResponse.RepoList;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrRepoResponse.RepoList.ReposItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrRepoResponse.RepoList.ReposItem.RepoDomainListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSAcrRepoResponseUnmarshaller {

	public static ListAKSAcrRepoResponse unmarshall(ListAKSAcrRepoResponse listAKSAcrRepoResponse, UnmarshallerContext _ctx) {
		
		listAKSAcrRepoResponse.setRequestId(_ctx.stringValue("ListAKSAcrRepoResponse.RequestId"));
		listAKSAcrRepoResponse.setResultCode(_ctx.stringValue("ListAKSAcrRepoResponse.ResultCode"));
		listAKSAcrRepoResponse.setResultMessage(_ctx.stringValue("ListAKSAcrRepoResponse.ResultMessage"));

		RepoList repoList = new RepoList();
		repoList.setPage(_ctx.longValue("ListAKSAcrRepoResponse.RepoList.Page"));
		repoList.setPageSize(_ctx.longValue("ListAKSAcrRepoResponse.RepoList.PageSize"));
		repoList.setTotal(_ctx.longValue("ListAKSAcrRepoResponse.RepoList.Total"));

		List<ReposItem> repos = new ArrayList<ReposItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSAcrRepoResponse.RepoList.Repos.Length"); i++) {
			ReposItem reposItem = new ReposItem();
			reposItem.setDetail(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].Detail"));
			reposItem.setGmtCreate(_ctx.longValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].GmtCreate"));
			reposItem.setGmtModified(_ctx.longValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].GmtModified"));
			reposItem.setRegionId(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RegionId"));
			reposItem.setRepoAuthorizeType(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoAuthorizeType"));
			reposItem.setRepoBuildType(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoBuildType"));
			reposItem.setRepoName(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoName"));
			reposItem.setRepoNamespace(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoNamespace"));
			reposItem.setRepoStatus(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoStatus"));
			reposItem.setRepoType(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoType"));
			reposItem.setSummary(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].Summary"));

			List<RepoDomainListItem> repoDomainList = new ArrayList<RepoDomainListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoDomainList.Length"); j++) {
				RepoDomainListItem repoDomainListItem = new RepoDomainListItem();
				repoDomainListItem.setDomain(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoDomainList["+ j +"].Domain"));
				repoDomainListItem.setType(_ctx.stringValue("ListAKSAcrRepoResponse.RepoList.Repos["+ i +"].RepoDomainList["+ j +"].Type"));

				repoDomainList.add(repoDomainListItem);
			}
			reposItem.setRepoDomainList(repoDomainList);

			repos.add(reposItem);
		}
		repoList.setRepos(repos);
		listAKSAcrRepoResponse.setRepoList(repoList);
	 
	 	return listAKSAcrRepoResponse;
	}
}