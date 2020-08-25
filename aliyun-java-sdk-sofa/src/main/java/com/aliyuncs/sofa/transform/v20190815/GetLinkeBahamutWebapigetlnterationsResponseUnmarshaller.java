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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlnterationsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlnterationsResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlnterationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetlnterationsResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetlnterationsResponse unmarshall(GetLinkeBahamutWebapigetlnterationsResponse getLinkeBahamutWebapigetlnterationsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetlnterationsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.RequestId"));
		getLinkeBahamutWebapigetlnterationsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.ResultCode"));
		getLinkeBahamutWebapigetlnterationsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.ResultMessage"));
		getLinkeBahamutWebapigetlnterationsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.ErrorMessage"));
		getLinkeBahamutWebapigetlnterationsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetlnterationsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Message"));
		getLinkeBahamutWebapigetlnterationsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetlnterationsResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetlnterationsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetlnterationsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutWebapigetlnterationsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutWebapigetlnterationsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutWebapigetlnterationsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutWebapigetlnterationsResponse.Paginator.PageSize"));
		getLinkeBahamutWebapigetlnterationsResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutWebapigetlnterationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Deleted"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].ExternalId"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Owner"));
			resultItem.setOwnerObj(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].OwnerObj"));
			resultItem.setProject(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Project"));
			resultItem.setRelease(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Release"));
			resultItem.setStage(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].Stage"));
			resultItem.setStageStep(_ctx.stringValue("GetLinkeBahamutWebapigetlnterationsResponse.Result["+ i +"].StageStep"));

			result.add(resultItem);
		}
		getLinkeBahamutWebapigetlnterationsResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetlnterationsResponse;
	}
}