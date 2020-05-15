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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectsResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectsResponse.ResultItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectsResponse.ResultItem.AdminsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectsResponse.ResultItem.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutProjectsResponseUnmarshaller {

	public static QueryLinkeBahamutProjectsResponse unmarshall(QueryLinkeBahamutProjectsResponse queryLinkeBahamutProjectsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutProjectsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.RequestId"));
		queryLinkeBahamutProjectsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.ResultCode"));
		queryLinkeBahamutProjectsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.ResultMessage"));
		queryLinkeBahamutProjectsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.ErrorMessage"));
		queryLinkeBahamutProjectsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Message"));
		queryLinkeBahamutProjectsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutProjectsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutProjectsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutProjectsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutProjectsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutProjectsResponse.Paginator.PageSize"));
		queryLinkeBahamutProjectsResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutProjectsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setFullName(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].FullName"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Id"));
			resultItem.setIdPath(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].IdPath"));
			resultItem.setLink(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Link"));
			resultItem.setMode(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Mode"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Name"));
			resultItem.setParentId(_ctx.longValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].ParentId"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Type"));

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Creator.Id"));
			creator.setNickName(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Creator.NickName"));
			creator.setRealName(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Creator.RealName"));
			creator.setStaffId(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Creator.StaffId"));
			resultItem.setCreator(creator);

			List<AdminsItem> admins = new ArrayList<AdminsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Admins.Length"); j++) {
				AdminsItem adminsItem = new AdminsItem();
				adminsItem.setId(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Admins["+ j +"].Id"));
				adminsItem.setNickName(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Admins["+ j +"].NickName"));
				adminsItem.setRealName(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Admins["+ j +"].RealName"));
				adminsItem.setStaffId(_ctx.stringValue("QueryLinkeBahamutProjectsResponse.Result["+ i +"].Admins["+ j +"].StaffId"));

				admins.add(adminsItem);
			}
			resultItem.setAdmins(admins);

			result.add(resultItem);
		}
		queryLinkeBahamutProjectsResponse.setResult(result);
	 
	 	return queryLinkeBahamutProjectsResponse;
	}
}