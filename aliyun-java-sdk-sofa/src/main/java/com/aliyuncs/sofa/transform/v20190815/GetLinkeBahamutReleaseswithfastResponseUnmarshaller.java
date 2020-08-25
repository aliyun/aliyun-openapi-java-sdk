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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseswithfastResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseswithfastResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseswithfastResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutReleaseswithfastResponseUnmarshaller {

	public static GetLinkeBahamutReleaseswithfastResponse unmarshall(GetLinkeBahamutReleaseswithfastResponse getLinkeBahamutReleaseswithfastResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutReleaseswithfastResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.RequestId"));
		getLinkeBahamutReleaseswithfastResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.ResultCode"));
		getLinkeBahamutReleaseswithfastResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.ResultMessage"));
		getLinkeBahamutReleaseswithfastResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.ErrorMessage"));
		getLinkeBahamutReleaseswithfastResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.ErrorMsgParamsMap"));
		getLinkeBahamutReleaseswithfastResponse.setMessage(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Message"));
		getLinkeBahamutReleaseswithfastResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutReleaseswithfastResponse.ResponseStatusCode"));
		getLinkeBahamutReleaseswithfastResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutReleaseswithfastResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutReleaseswithfastResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutReleaseswithfastResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutReleaseswithfastResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutReleaseswithfastResponse.Paginator.PageSize"));
		getLinkeBahamutReleaseswithfastResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleaseswithfastResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneReleaseId(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroupName(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].AppGroupName"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Creator"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Type"));

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("GetLinkeBahamutReleaseswithfastResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			result.add(resultItem);
		}
		getLinkeBahamutReleaseswithfastResponse.setResult(result);
	 
	 	return getLinkeBahamutReleaseswithfastResponse;
	}
}