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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponseUnmarshaller {

	public static QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse unmarshall(QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.RequestId"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.ResultCode"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.ResultMessage"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Message"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setPageSize(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.PageSize"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.ResponseStatusCode"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Success"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setTotalCount(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.TotalCount"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setTotalPages(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.TotalPages"));
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setToPage(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.ToPage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAkProjectId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].AkProjectId"));
			resultItem.setAssignedTo(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCreatedAt(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].CreatedAt"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].Id"));
			resultItem.setLink(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].Link"));
			resultItem.setOtherJson(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].OtherJson"));
			resultItem.setPriority(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].PriorityId"));
			resultItem.setProjectId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].ProjectId"));
			resultItem.setStamp(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].Subject"));
			resultItem.setUser(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].User"));
			resultItem.setUserId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].UserId"));
			resultItem.setUserStaffId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].UserStaffId"));

			List<String> cfsList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].CfsList.Length"); j++) {
				cfsList.add(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.Result["+ i +"].CfsList["+ j +"]"));
			}
			resultItem.setCfsList(cfsList);

			result.add(resultItem);
		}
		queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse.setResult(result);
	 
	 	return queryLinkeBahamutAoneinternalworkitemfuzzysearchResponse;
	}
}