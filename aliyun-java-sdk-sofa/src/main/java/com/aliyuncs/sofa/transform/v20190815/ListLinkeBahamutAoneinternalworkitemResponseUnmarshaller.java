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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAoneinternalworkitemResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAoneinternalworkitemResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAoneinternalworkitemResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAoneinternalworkitemResponseUnmarshaller {

	public static ListLinkeBahamutAoneinternalworkitemResponse unmarshall(ListLinkeBahamutAoneinternalworkitemResponse listLinkeBahamutAoneinternalworkitemResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAoneinternalworkitemResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.RequestId"));
		listLinkeBahamutAoneinternalworkitemResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.ResultCode"));
		listLinkeBahamutAoneinternalworkitemResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.ResultMessage"));
		listLinkeBahamutAoneinternalworkitemResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.ErrorMessage"));
		listLinkeBahamutAoneinternalworkitemResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAoneinternalworkitemResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Message"));
		listLinkeBahamutAoneinternalworkitemResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAoneinternalworkitemResponse.ResponseStatusCode"));
		listLinkeBahamutAoneinternalworkitemResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAoneinternalworkitemResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("ListLinkeBahamutAoneinternalworkitemResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("ListLinkeBahamutAoneinternalworkitemResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("ListLinkeBahamutAoneinternalworkitemResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("ListLinkeBahamutAoneinternalworkitemResponse.Paginator.PageSize"));
		listLinkeBahamutAoneinternalworkitemResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAoneinternalworkitemResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAkProjectId(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].AkProjectId"));
			resultItem.setAssignedTo(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].AssignedTo"));
			resultItem.setCreatedAt(_ctx.longValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].CreatedAt"));
			resultItem.setCreator(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Creator"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Id"));
			resultItem.setLink(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Link"));
			resultItem.setOtherJson(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].OtherJson"));
			resultItem.setPriority(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].PriorityId"));
			resultItem.setProjectId(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].ProjectId"));
			resultItem.setProjectName(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].ProjectName"));
			resultItem.setStamp(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Subject"));
			resultItem.setUrl(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].Url"));

			List<String> cfsList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].CfsList.Length"); j++) {
				cfsList.add(_ctx.stringValue("ListLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"].CfsList["+ j +"]"));
			}
			resultItem.setCfsList(cfsList);

			result.add(resultItem);
		}
		listLinkeBahamutAoneinternalworkitemResponse.setResult(result);
	 
	 	return listLinkeBahamutAoneinternalworkitemResponse;
	}
}