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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutPaasgetmachinecountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutPaasgetmachinecountResponseUnmarshaller {

	public static QueryLinkeBahamutPaasgetmachinecountResponse unmarshall(QueryLinkeBahamutPaasgetmachinecountResponse queryLinkeBahamutPaasgetmachinecountResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutPaasgetmachinecountResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutPaasgetmachinecountResponse.RequestId"));
		queryLinkeBahamutPaasgetmachinecountResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutPaasgetmachinecountResponse.ResultCode"));
		queryLinkeBahamutPaasgetmachinecountResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutPaasgetmachinecountResponse.ResultMessage"));
		queryLinkeBahamutPaasgetmachinecountResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutPaasgetmachinecountResponse.ErrorMessage"));
		queryLinkeBahamutPaasgetmachinecountResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutPaasgetmachinecountResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutPaasgetmachinecountResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutPaasgetmachinecountResponse.Message"));
		queryLinkeBahamutPaasgetmachinecountResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutPaasgetmachinecountResponse.ResponseStatusCode"));
		queryLinkeBahamutPaasgetmachinecountResponse.setResult(_ctx.stringValue("QueryLinkeBahamutPaasgetmachinecountResponse.Result"));
		queryLinkeBahamutPaasgetmachinecountResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutPaasgetmachinecountResponse.Success"));
	 
	 	return queryLinkeBahamutPaasgetmachinecountResponse;
	}
}