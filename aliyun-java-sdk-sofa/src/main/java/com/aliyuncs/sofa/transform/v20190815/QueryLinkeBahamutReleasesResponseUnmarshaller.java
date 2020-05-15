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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasesResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasesResponse.ResultItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasesResponse.ResultItem.Creator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasesResponse.ResultItem.ManagersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleasesResponseUnmarshaller {

	public static QueryLinkeBahamutReleasesResponse unmarshall(QueryLinkeBahamutReleasesResponse queryLinkeBahamutReleasesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleasesResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.RequestId"));
		queryLinkeBahamutReleasesResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.ResultCode"));
		queryLinkeBahamutReleasesResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.ResultMessage"));
		queryLinkeBahamutReleasesResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.ErrorMessage"));
		queryLinkeBahamutReleasesResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Message"));
		queryLinkeBahamutReleasesResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleasesResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Paginator.PageSize"));
		queryLinkeBahamutReleasesResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleasesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneReleaseId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroupName(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].AppGroupName"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Created"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Type"));

			Creator creator = new Creator();
			creator.setAccount(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Account"));
			creator.setCreated(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Created"));
			creator.setCustomer(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Customer"));
			creator.setDeleted(_ctx.booleanValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Deleted"));
			creator.setDepartment(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Department"));
			creator.setEmail(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Email"));
			creator.setEmpId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.EmpId"));
			creator.setId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Id"));
			creator.setLastLogin(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.LastLogin"));
			creator.setLastModified(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.LastModified"));
			creator.setName(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Name"));
			creator.setNick(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Nick"));
			creator.setUid(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Uid"));
			creator.setUniqueId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.UniqueId"));
			creator.setWw(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Ww"));

			List<String> tenants1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Tenants.Length"); j++) {
				tenants1.add(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator.setTenants1(tenants1);
			resultItem.setCreator(creator);

			List<ManagersItem> managers = new ArrayList<ManagersItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers.Length"); j++) {
				ManagersItem managersItem = new ManagersItem();
				managersItem.setAccount(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Account"));
				managersItem.setCreated(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Created"));
				managersItem.setCustomer(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Customer"));
				managersItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Deleted"));
				managersItem.setDepartment(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Department"));
				managersItem.setEmail(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Email"));
				managersItem.setEmpId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].EmpId"));
				managersItem.setId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Id"));
				managersItem.setLastLogin(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].LastLogin"));
				managersItem.setLastModified(_ctx.longValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].LastModified"));
				managersItem.setName(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Name"));
				managersItem.setNick(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Nick"));
				managersItem.setUid(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Uid"));
				managersItem.setUniqueId(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].UniqueId"));
				managersItem.setWw(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Ww"));

				List<String> tenants = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Tenants.Length"); k++) {
					tenants.add(_ctx.stringValue("QueryLinkeBahamutReleasesResponse.Result["+ i +"].Managers["+ j +"].Tenants["+ k +"]"));
				}
				managersItem.setTenants(tenants);

				managers.add(managersItem);
			}
			resultItem.setManagers(managers);

			result.add(resultItem);
		}
		queryLinkeBahamutReleasesResponse.setResult(result);
	 
	 	return queryLinkeBahamutReleasesResponse;
	}
}