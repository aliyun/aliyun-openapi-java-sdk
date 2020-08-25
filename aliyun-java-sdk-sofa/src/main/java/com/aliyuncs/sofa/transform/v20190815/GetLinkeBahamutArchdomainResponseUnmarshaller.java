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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomainResponseUnmarshaller {

	public static GetLinkeBahamutArchdomainResponse unmarshall(GetLinkeBahamutArchdomainResponse getLinkeBahamutArchdomainResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomainResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.RequestId"));
		getLinkeBahamutArchdomainResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.ResultCode"));
		getLinkeBahamutArchdomainResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.ResultMessage"));
		getLinkeBahamutArchdomainResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.ErrorMessage"));
		getLinkeBahamutArchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.ErrorMsgParamsMap"));
		getLinkeBahamutArchdomainResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Message"));
		getLinkeBahamutArchdomainResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutArchdomainResponse.ResponseStatusCode"));
		getLinkeBahamutArchdomainResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomainResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutArchdomainResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutArchdomainResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutArchdomainResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutArchdomainResponse.Paginator.PageSize"));
		getLinkeBahamutArchdomainResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutArchdomainResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppNum(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result["+ i +"].AppNum"));
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result["+ i +"].Description"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result["+ i +"].ExternalId"));
			resultItem.setIterationNum(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result["+ i +"].IterationNum"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result["+ i +"].Name"));

			result.add(resultItem);
		}
		getLinkeBahamutArchdomainResponse.setResult(result);
	 
	 	return getLinkeBahamutArchdomainResponse;
	}
}