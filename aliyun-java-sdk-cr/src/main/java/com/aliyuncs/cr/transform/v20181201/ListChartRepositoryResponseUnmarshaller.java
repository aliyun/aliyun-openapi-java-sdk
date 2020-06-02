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

import com.aliyuncs.cr.model.v20181201.ListChartRepositoryResponse;
import com.aliyuncs.cr.model.v20181201.ListChartRepositoryResponse.RepositoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChartRepositoryResponseUnmarshaller {

	public static ListChartRepositoryResponse unmarshall(ListChartRepositoryResponse listChartRepositoryResponse, UnmarshallerContext _ctx) {
		
		listChartRepositoryResponse.setRequestId(_ctx.stringValue("ListChartRepositoryResponse.RequestId"));
		listChartRepositoryResponse.setIsSuccess(_ctx.booleanValue("ListChartRepositoryResponse.IsSuccess"));
		listChartRepositoryResponse.setCode(_ctx.stringValue("ListChartRepositoryResponse.Code"));
		listChartRepositoryResponse.setPageNo(_ctx.integerValue("ListChartRepositoryResponse.PageNo"));
		listChartRepositoryResponse.setPageSize(_ctx.integerValue("ListChartRepositoryResponse.PageSize"));
		listChartRepositoryResponse.setTotalCount(_ctx.stringValue("ListChartRepositoryResponse.TotalCount"));

		List<RepositoriesItem> repositories = new ArrayList<RepositoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListChartRepositoryResponse.Repositories.Length"); i++) {
			RepositoriesItem repositoriesItem = new RepositoriesItem();
			repositoriesItem.setRepoNamespaceName(_ctx.stringValue("ListChartRepositoryResponse.Repositories["+ i +"].RepoNamespaceName"));
			repositoriesItem.setRepoName(_ctx.stringValue("ListChartRepositoryResponse.Repositories["+ i +"].RepoName"));
			repositoriesItem.setRepoStatus(_ctx.stringValue("ListChartRepositoryResponse.Repositories["+ i +"].RepoStatus"));
			repositoriesItem.setRepoType(_ctx.stringValue("ListChartRepositoryResponse.Repositories["+ i +"].RepoType"));
			repositoriesItem.setSummary(_ctx.stringValue("ListChartRepositoryResponse.Repositories["+ i +"].Summary"));
			repositoriesItem.setInstanceId(_ctx.stringValue("ListChartRepositoryResponse.Repositories["+ i +"].InstanceId"));
			repositoriesItem.setRepoId(_ctx.stringValue("ListChartRepositoryResponse.Repositories["+ i +"].RepoId"));
			repositoriesItem.setCreateTime(_ctx.longValue("ListChartRepositoryResponse.Repositories["+ i +"].CreateTime"));
			repositoriesItem.setModifiedTime(_ctx.longValue("ListChartRepositoryResponse.Repositories["+ i +"].ModifiedTime"));

			repositories.add(repositoriesItem);
		}
		listChartRepositoryResponse.setRepositories(repositories);
	 
	 	return listChartRepositoryResponse;
	}
}