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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaldailyreleasesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaldailyreleasesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternaldailyreleasesResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternaldailyreleasesResponse unmarshall(GetLinkeBahamutAoneinternaldailyreleasesResponse getLinkeBahamutAoneinternaldailyreleasesResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternaldailyreleasesResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.RequestId"));
		getLinkeBahamutAoneinternaldailyreleasesResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.ResultCode"));
		getLinkeBahamutAoneinternaldailyreleasesResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.ResultMessage"));
		getLinkeBahamutAoneinternaldailyreleasesResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.ErrorMessage"));
		getLinkeBahamutAoneinternaldailyreleasesResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternaldailyreleasesResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Message"));
		getLinkeBahamutAoneinternaldailyreleasesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternaldailyreleasesResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreatedDate(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result["+ i +"].CreatedDate"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result["+ i +"].Creator"));
			resultItem.setPortalUrl(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result["+ i +"].PortalUrl"));
			resultItem.setRecordUniqueId(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result["+ i +"].RecordUniqueId"));
			resultItem.setRecordUniqueType(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result["+ i +"].RecordUniqueType"));
			resultItem.setStatusName(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result["+ i +"].StatusName"));
			resultItem.setSummary(_ctx.stringValue("GetLinkeBahamutAoneinternaldailyreleasesResponse.Result["+ i +"].Summary"));

			result.add(resultItem);
		}
		getLinkeBahamutAoneinternaldailyreleasesResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternaldailyreleasesResponse;
	}
}