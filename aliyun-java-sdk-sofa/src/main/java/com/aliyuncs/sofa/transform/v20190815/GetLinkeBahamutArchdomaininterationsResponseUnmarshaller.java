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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomaininterationsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomaininterationsResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomaininterationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomaininterationsResponseUnmarshaller {

	public static GetLinkeBahamutArchdomaininterationsResponse unmarshall(GetLinkeBahamutArchdomaininterationsResponse getLinkeBahamutArchdomaininterationsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomaininterationsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.RequestId"));
		getLinkeBahamutArchdomaininterationsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.ResultCode"));
		getLinkeBahamutArchdomaininterationsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.ResultMessage"));
		getLinkeBahamutArchdomaininterationsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.ErrorMessage"));
		getLinkeBahamutArchdomaininterationsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutArchdomaininterationsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Message"));
		getLinkeBahamutArchdomaininterationsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutArchdomaininterationsResponse.ResponseStatusCode"));
		getLinkeBahamutArchdomaininterationsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomaininterationsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutArchdomaininterationsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutArchdomaininterationsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutArchdomaininterationsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutArchdomaininterationsResponse.Paginator.PageSize"));
		getLinkeBahamutArchdomaininterationsResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutArchdomaininterationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Deleted"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].ExternalId"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Owner"));
			resultItem.setOwnerObj(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].OwnerObj"));
			resultItem.setProject(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Project"));
			resultItem.setRelease(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Release"));
			resultItem.setStage(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].Stage"));
			resultItem.setStageStep(_ctx.stringValue("GetLinkeBahamutArchdomaininterationsResponse.Result["+ i +"].StageStep"));

			result.add(resultItem);
		}
		getLinkeBahamutArchdomaininterationsResponse.setResult(result);
	 
	 	return getLinkeBahamutArchdomaininterationsResponse;
	}
}