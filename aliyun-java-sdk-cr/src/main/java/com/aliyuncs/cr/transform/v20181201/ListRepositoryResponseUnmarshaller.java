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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepositoryResponse;
import com.aliyuncs.cr.model.v20181201.ListRepositoryResponse.RepositoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryResponseUnmarshaller {

	public static ListRepositoryResponse unmarshall(ListRepositoryResponse listRepositoryResponse, UnmarshallerContext _ctx) {
		
		listRepositoryResponse.setRequestId(_ctx.stringValue("ListRepositoryResponse.RequestId"));
		listRepositoryResponse.setIsSuccess(_ctx.booleanValue("ListRepositoryResponse.IsSuccess"));
		listRepositoryResponse.setCode(_ctx.stringValue("ListRepositoryResponse.Code"));
		listRepositoryResponse.setPageNo(_ctx.integerValue("ListRepositoryResponse.PageNo"));
		listRepositoryResponse.setPageSize(_ctx.integerValue("ListRepositoryResponse.PageSize"));
		listRepositoryResponse.setTotalCount(_ctx.stringValue("ListRepositoryResponse.TotalCount"));

		List<RepositoriesItem> repositories = new ArrayList<RepositoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryResponse.Repositories.Length"); i++) {
			RepositoriesItem repositoriesItem = new RepositoriesItem();
			repositoriesItem.setRepoNamespaceName(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].RepoNamespaceName"));
			repositoriesItem.setRepoName(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].RepoName"));
			repositoriesItem.setRepoStatus(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].RepoStatus"));
			repositoriesItem.setRepoType(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].RepoType"));
			repositoriesItem.setRepoBuildType(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].RepoBuildType"));
			repositoriesItem.setSummary(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].Summary"));
			repositoriesItem.setInstanceId(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].InstanceId"));
			repositoriesItem.setRepoId(_ctx.stringValue("ListRepositoryResponse.Repositories["+ i +"].RepoId"));
			repositoriesItem.setCreateTime(_ctx.longValue("ListRepositoryResponse.Repositories["+ i +"].CreateTime"));
			repositoriesItem.setModifiedTime(_ctx.longValue("ListRepositoryResponse.Repositories["+ i +"].ModifiedTime"));

			repositories.add(repositoriesItem);
		}
		listRepositoryResponse.setRepositories(repositories);
	 
	 	return listRepositoryResponse;
	}
}