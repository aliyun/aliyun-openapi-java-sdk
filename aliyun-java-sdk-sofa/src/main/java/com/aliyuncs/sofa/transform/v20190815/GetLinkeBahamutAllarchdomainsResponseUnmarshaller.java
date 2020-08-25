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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllarchdomainsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllarchdomainsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAllarchdomainsResponseUnmarshaller {

	public static GetLinkeBahamutAllarchdomainsResponse unmarshall(GetLinkeBahamutAllarchdomainsResponse getLinkeBahamutAllarchdomainsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAllarchdomainsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.RequestId"));
		getLinkeBahamutAllarchdomainsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.ResultCode"));
		getLinkeBahamutAllarchdomainsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.ResultMessage"));
		getLinkeBahamutAllarchdomainsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.ErrorMessage"));
		getLinkeBahamutAllarchdomainsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAllarchdomainsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Message"));
		getLinkeBahamutAllarchdomainsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAllarchdomainsResponse.ResponseStatusCode"));
		getLinkeBahamutAllarchdomainsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAllarchdomainsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAllarchdomainsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBakOwner(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].BakOwner"));
			resultItem.setBakTestOwner(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].BakTestOwner"));
			resultItem.setBuId(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].BuId"));
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].Id"));
			resultItem.setLevel(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].Owner"));
			resultItem.setParentId(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].ParentId"));
			resultItem.setSynacId(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].SynacId"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].TenantId"));
			resultItem.setTestOwner(_ctx.stringValue("GetLinkeBahamutAllarchdomainsResponse.Result["+ i +"].TestOwner"));

			result.add(resultItem);
		}
		getLinkeBahamutAllarchdomainsResponse.setResult(result);
	 
	 	return getLinkeBahamutAllarchdomainsResponse;
	}
}