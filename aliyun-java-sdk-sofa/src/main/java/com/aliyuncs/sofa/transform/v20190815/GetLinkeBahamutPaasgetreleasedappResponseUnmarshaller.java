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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPaasgetreleasedappResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPaasgetreleasedappResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPaasgetreleasedappResponseUnmarshaller {

	public static GetLinkeBahamutPaasgetreleasedappResponse unmarshall(GetLinkeBahamutPaasgetreleasedappResponse getLinkeBahamutPaasgetreleasedappResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPaasgetreleasedappResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.RequestId"));
		getLinkeBahamutPaasgetreleasedappResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.ResultCode"));
		getLinkeBahamutPaasgetreleasedappResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.ResultMessage"));
		getLinkeBahamutPaasgetreleasedappResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.ErrorMessage"));
		getLinkeBahamutPaasgetreleasedappResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPaasgetreleasedappResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.Message"));
		getLinkeBahamutPaasgetreleasedappResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPaasgetreleasedappResponse.ResponseStatusCode"));
		getLinkeBahamutPaasgetreleasedappResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPaasgetreleasedappResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPaasgetreleasedappResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppName(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.Result["+ i +"].AppName"));
			resultItem.setBranch(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.Result["+ i +"].Branch"));
			resultItem.setReleaseId(_ctx.stringValue("GetLinkeBahamutPaasgetreleasedappResponse.Result["+ i +"].ReleaseId"));

			result.add(resultItem);
		}
		getLinkeBahamutPaasgetreleasedappResponse.setResult(result);
	 
	 	return getLinkeBahamutPaasgetreleasedappResponse;
	}
}