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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetreleasebytimeResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetreleasebytimeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetreleasebytimeResponseUnmarshaller {

	public static GetLinkeBahamutOpengetreleasebytimeResponse unmarshall(GetLinkeBahamutOpengetreleasebytimeResponse getLinkeBahamutOpengetreleasebytimeResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetreleasebytimeResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.RequestId"));
		getLinkeBahamutOpengetreleasebytimeResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.ResultCode"));
		getLinkeBahamutOpengetreleasebytimeResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.ResultMessage"));
		getLinkeBahamutOpengetreleasebytimeResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.ErrorMessage"));
		getLinkeBahamutOpengetreleasebytimeResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetreleasebytimeResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Message"));
		getLinkeBahamutOpengetreleasebytimeResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetreleasebytimeResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetreleasebytimeResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetreleasebytimeResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAttachable(_ctx.booleanValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Attachable"));
			resultItem.setBetaRelease(_ctx.booleanValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].BetaRelease"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Created"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].ExternalId"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Status"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].TenantId"));
			resultItem.setTicket(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Ticket"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Type"));

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("GetLinkeBahamutOpengetreleasebytimeResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			result.add(resultItem);
		}
		getLinkeBahamutOpengetreleasebytimeResponse.setResult(result);
	 
	 	return getLinkeBahamutOpengetreleasebytimeResponse;
	}
}