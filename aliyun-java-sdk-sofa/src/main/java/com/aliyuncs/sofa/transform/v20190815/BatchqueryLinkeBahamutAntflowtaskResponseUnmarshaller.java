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

import com.aliyuncs.sofa.model.v20190815.BatchqueryLinkeBahamutAntflowtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryLinkeBahamutAntflowtaskResponseUnmarshaller {

	public static BatchqueryLinkeBahamutAntflowtaskResponse unmarshall(BatchqueryLinkeBahamutAntflowtaskResponse batchqueryLinkeBahamutAntflowtaskResponse, UnmarshallerContext _ctx) {
		
		batchqueryLinkeBahamutAntflowtaskResponse.setRequestId(_ctx.stringValue("BatchqueryLinkeBahamutAntflowtaskResponse.RequestId"));
		batchqueryLinkeBahamutAntflowtaskResponse.setResultCode(_ctx.stringValue("BatchqueryLinkeBahamutAntflowtaskResponse.ResultCode"));
		batchqueryLinkeBahamutAntflowtaskResponse.setResultMessage(_ctx.stringValue("BatchqueryLinkeBahamutAntflowtaskResponse.ResultMessage"));
		batchqueryLinkeBahamutAntflowtaskResponse.setErrorMessage(_ctx.stringValue("BatchqueryLinkeBahamutAntflowtaskResponse.ErrorMessage"));
		batchqueryLinkeBahamutAntflowtaskResponse.setErrorMsgParamsMap(_ctx.stringValue("BatchqueryLinkeBahamutAntflowtaskResponse.ErrorMsgParamsMap"));
		batchqueryLinkeBahamutAntflowtaskResponse.setMessage(_ctx.stringValue("BatchqueryLinkeBahamutAntflowtaskResponse.Message"));
		batchqueryLinkeBahamutAntflowtaskResponse.setResponseStatusCode(_ctx.longValue("BatchqueryLinkeBahamutAntflowtaskResponse.ResponseStatusCode"));
		batchqueryLinkeBahamutAntflowtaskResponse.setSuccess(_ctx.booleanValue("BatchqueryLinkeBahamutAntflowtaskResponse.Success"));
	 
	 	return batchqueryLinkeBahamutAntflowtaskResponse;
	}
}