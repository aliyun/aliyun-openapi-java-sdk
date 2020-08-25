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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllattachablereleaseResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllattachablereleaseResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllattachablereleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAllattachablereleaseResponseUnmarshaller {

	public static GetLinkeBahamutAllattachablereleaseResponse unmarshall(GetLinkeBahamutAllattachablereleaseResponse getLinkeBahamutAllattachablereleaseResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAllattachablereleaseResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.RequestId"));
		getLinkeBahamutAllattachablereleaseResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.ResultCode"));
		getLinkeBahamutAllattachablereleaseResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.ResultMessage"));
		getLinkeBahamutAllattachablereleaseResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.ErrorMessage"));
		getLinkeBahamutAllattachablereleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAllattachablereleaseResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Message"));
		getLinkeBahamutAllattachablereleaseResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAllattachablereleaseResponse.ResponseStatusCode"));
		getLinkeBahamutAllattachablereleaseResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAllattachablereleaseResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutAllattachablereleaseResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutAllattachablereleaseResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutAllattachablereleaseResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutAllattachablereleaseResponse.Paginator.PageSize"));
		getLinkeBahamutAllattachablereleaseResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAllattachablereleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneReleaseId(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroupName(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].AppGroupName"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Creator"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Type"));

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("GetLinkeBahamutAllattachablereleaseResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			result.add(resultItem);
		}
		getLinkeBahamutAllattachablereleaseResponse.setResult(result);
	 
	 	return getLinkeBahamutAllattachablereleaseResponse;
	}
}