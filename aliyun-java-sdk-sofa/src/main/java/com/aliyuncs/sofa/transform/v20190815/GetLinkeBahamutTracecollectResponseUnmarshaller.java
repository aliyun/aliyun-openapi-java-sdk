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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTracecollectResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTracecollectResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTracecollectResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTracecollectResponseUnmarshaller {

	public static GetLinkeBahamutTracecollectResponse unmarshall(GetLinkeBahamutTracecollectResponse getLinkeBahamutTracecollectResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTracecollectResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.RequestId"));
		getLinkeBahamutTracecollectResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.ResultCode"));
		getLinkeBahamutTracecollectResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.ResultMessage"));
		getLinkeBahamutTracecollectResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.ErrorMessage"));
		getLinkeBahamutTracecollectResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTracecollectResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Message"));
		getLinkeBahamutTracecollectResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTracecollectResponse.ResponseStatusCode"));
		getLinkeBahamutTracecollectResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTracecollectResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutTracecollectResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutTracecollectResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutTracecollectResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutTracecollectResponse.Paginator.PageSize"));
		getLinkeBahamutTracecollectResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTracecollectResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEnv(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].Env"));
			resultItem.setId(_ctx.longValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].Id"));
			resultItem.setSaveTime(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].SaveTime"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].TenantId"));
			resultItem.setTraceDescribe(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].TraceDescribe"));
			resultItem.setTraceId(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].TraceId"));
			resultItem.setTraceName(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].TraceName"));
			resultItem.setUpdateTime(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].UpdateTime"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].Url"));
			resultItem.setUserId(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].UserId"));
			resultItem.setUserName(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].UserName"));
			resultItem.setWorkspaceId(_ctx.stringValue("GetLinkeBahamutTracecollectResponse.Result["+ i +"].WorkspaceId"));

			result.add(resultItem);
		}
		getLinkeBahamutTracecollectResponse.setResult(result);
	 
	 	return getLinkeBahamutTracecollectResponse;
	}
}