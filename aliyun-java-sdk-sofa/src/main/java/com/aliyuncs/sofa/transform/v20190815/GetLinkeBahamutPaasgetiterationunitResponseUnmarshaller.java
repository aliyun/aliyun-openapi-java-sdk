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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPaasgetiterationunitResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPaasgetiterationunitResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPaasgetiterationunitResponseUnmarshaller {

	public static GetLinkeBahamutPaasgetiterationunitResponse unmarshall(GetLinkeBahamutPaasgetiterationunitResponse getLinkeBahamutPaasgetiterationunitResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPaasgetiterationunitResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.RequestId"));
		getLinkeBahamutPaasgetiterationunitResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.ResultCode"));
		getLinkeBahamutPaasgetiterationunitResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.ResultMessage"));
		getLinkeBahamutPaasgetiterationunitResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.ErrorMessage"));
		getLinkeBahamutPaasgetiterationunitResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPaasgetiterationunitResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.Message"));
		getLinkeBahamutPaasgetiterationunitResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPaasgetiterationunitResponse.ResponseStatusCode"));
		getLinkeBahamutPaasgetiterationunitResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPaasgetiterationunitResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPaasgetiterationunitResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppName(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.Result["+ i +"].AppName"));
			resultItem.setArchDomainName(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setBranch(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.Result["+ i +"].Branch"));
			resultItem.setGrayRelease(_ctx.booleanValue("GetLinkeBahamutPaasgetiterationunitResponse.Result["+ i +"].GrayRelease"));
			resultItem.setStage(_ctx.stringValue("GetLinkeBahamutPaasgetiterationunitResponse.Result["+ i +"].Stage"));

			result.add(resultItem);
		}
		getLinkeBahamutPaasgetiterationunitResponse.setResult(result);
	 
	 	return getLinkeBahamutPaasgetiterationunitResponse;
	}
}