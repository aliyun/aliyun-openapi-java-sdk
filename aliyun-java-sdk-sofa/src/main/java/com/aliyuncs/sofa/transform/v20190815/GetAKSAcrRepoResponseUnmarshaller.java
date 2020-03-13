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

import com.aliyuncs.sofa.model.v20190815.GetAKSAcrRepoResponse;
import com.aliyuncs.sofa.model.v20190815.GetAKSAcrRepoResponse.Repo;
import com.aliyuncs.sofa.model.v20190815.GetAKSAcrRepoResponse.Repo.RepoDomainListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSAcrRepoResponseUnmarshaller {

	public static GetAKSAcrRepoResponse unmarshall(GetAKSAcrRepoResponse getAKSAcrRepoResponse, UnmarshallerContext _ctx) {
		
		getAKSAcrRepoResponse.setRequestId(_ctx.stringValue("GetAKSAcrRepoResponse.RequestId"));
		getAKSAcrRepoResponse.setResultCode(_ctx.stringValue("GetAKSAcrRepoResponse.ResultCode"));
		getAKSAcrRepoResponse.setResultMessage(_ctx.stringValue("GetAKSAcrRepoResponse.ResultMessage"));

		Repo repo = new Repo();
		repo.setDetail(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.Detail"));
		repo.setGmtCreate(_ctx.longValue("GetAKSAcrRepoResponse.Repo.GmtCreate"));
		repo.setGmtModified(_ctx.longValue("GetAKSAcrRepoResponse.Repo.GmtModified"));
		repo.setRegionId(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RegionId"));
		repo.setRepoAuthorizeType(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoAuthorizeType"));
		repo.setRepoBuildType(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoBuildType"));
		repo.setRepoName(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoName"));
		repo.setRepoNamespace(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoNamespace"));
		repo.setRepoStatus(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoStatus"));
		repo.setRepoType(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoType"));
		repo.setSummary(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.Summary"));

		List<RepoDomainListItem> repoDomainList = new ArrayList<RepoDomainListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSAcrRepoResponse.Repo.RepoDomainList.Length"); i++) {
			RepoDomainListItem repoDomainListItem = new RepoDomainListItem();
			repoDomainListItem.setDomain(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoDomainList["+ i +"].Domain"));
			repoDomainListItem.setType(_ctx.stringValue("GetAKSAcrRepoResponse.Repo.RepoDomainList["+ i +"].Type"));

			repoDomainList.add(repoDomainListItem);
		}
		repo.setRepoDomainList(repoDomainList);
		getAKSAcrRepoResponse.setRepo(repo);
	 
	 	return getAKSAcrRepoResponse;
	}
}