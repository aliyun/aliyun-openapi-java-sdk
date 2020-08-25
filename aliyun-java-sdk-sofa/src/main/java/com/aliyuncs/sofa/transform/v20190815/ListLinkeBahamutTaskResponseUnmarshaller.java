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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutTaskResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutTaskResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutTaskResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutTaskResponseUnmarshaller {

	public static ListLinkeBahamutTaskResponse unmarshall(ListLinkeBahamutTaskResponse listLinkeBahamutTaskResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutTaskResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutTaskResponse.RequestId"));
		listLinkeBahamutTaskResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutTaskResponse.ResultCode"));
		listLinkeBahamutTaskResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutTaskResponse.ResultMessage"));
		listLinkeBahamutTaskResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutTaskResponse.ErrorMessage"));
		listLinkeBahamutTaskResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutTaskResponse.ErrorMsgParamsMap"));
		listLinkeBahamutTaskResponse.setMessage(_ctx.stringValue("ListLinkeBahamutTaskResponse.Message"));
		listLinkeBahamutTaskResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutTaskResponse.ResponseStatusCode"));
		listLinkeBahamutTaskResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutTaskResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("ListLinkeBahamutTaskResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("ListLinkeBahamutTaskResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("ListLinkeBahamutTaskResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("ListLinkeBahamutTaskResponse.Paginator.PageSize"));
		listLinkeBahamutTaskResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutTaskResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAssignedTo(_ctx.stringValue("ListLinkeBahamutTaskResponse.Result["+ i +"].AssignedTo"));
			resultItem.setCreator(_ctx.stringValue("ListLinkeBahamutTaskResponse.Result["+ i +"].Creator"));
			resultItem.setGmtCreate(_ctx.stringValue("ListLinkeBahamutTaskResponse.Result["+ i +"].GmtCreate"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutTaskResponse.Result["+ i +"].Id"));
			resultItem.setStatusName(_ctx.stringValue("ListLinkeBahamutTaskResponse.Result["+ i +"].StatusName"));
			resultItem.setTitle(_ctx.stringValue("ListLinkeBahamutTaskResponse.Result["+ i +"].Title"));
			resultItem.setUrl(_ctx.stringValue("ListLinkeBahamutTaskResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		listLinkeBahamutTaskResponse.setResult(result);
	 
	 	return listLinkeBahamutTaskResponse;
	}
}