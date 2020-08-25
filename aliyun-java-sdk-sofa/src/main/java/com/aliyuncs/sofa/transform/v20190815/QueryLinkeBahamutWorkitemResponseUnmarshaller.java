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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkitemResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkitemResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkitemResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutWorkitemResponseUnmarshaller {

	public static QueryLinkeBahamutWorkitemResponse unmarshall(QueryLinkeBahamutWorkitemResponse queryLinkeBahamutWorkitemResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutWorkitemResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.RequestId"));
		queryLinkeBahamutWorkitemResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.ResultCode"));
		queryLinkeBahamutWorkitemResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.ResultMessage"));
		queryLinkeBahamutWorkitemResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.ErrorMessage"));
		queryLinkeBahamutWorkitemResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutWorkitemResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Message"));
		queryLinkeBahamutWorkitemResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutWorkitemResponse.ResponseStatusCode"));
		queryLinkeBahamutWorkitemResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutWorkitemResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutWorkitemResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutWorkitemResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutWorkitemResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutWorkitemResponse.Paginator.PageSize"));
		queryLinkeBahamutWorkitemResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutWorkitemResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAkProjectId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].AkProjectId"));
			resultItem.setAssignedTo(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCreatedAt(_ctx.longValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].CreatedAt"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].Id"));
			resultItem.setLink(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].Link"));
			resultItem.setOtherJson(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].OtherJson"));
			resultItem.setPriority(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].PriorityId"));
			resultItem.setProjectId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].ProjectId"));
			resultItem.setStamp(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].Subject"));
			resultItem.setUser(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].User"));
			resultItem.setUserId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].UserId"));
			resultItem.setUserStaffId(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].UserStaffId"));

			List<String> cfsList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].CfsList.Length"); j++) {
				cfsList.add(_ctx.stringValue("QueryLinkeBahamutWorkitemResponse.Result["+ i +"].CfsList["+ j +"]"));
			}
			resultItem.setCfsList(cfsList);

			result.add(resultItem);
		}
		queryLinkeBahamutWorkitemResponse.setResult(result);
	 
	 	return queryLinkeBahamutWorkitemResponse;
	}
}