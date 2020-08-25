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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeExternswebhookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeExternswebhookResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeExternswebhookResponse unmarshall(QueryLinkeantcodeAntcodeExternswebhookResponse queryLinkeantcodeAntcodeExternswebhookResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeExternswebhookResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeExternswebhookResponse.RequestId"));
		queryLinkeantcodeAntcodeExternswebhookResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeExternswebhookResponse.ResultCode"));
		queryLinkeantcodeAntcodeExternswebhookResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeExternswebhookResponse.ResultMessage"));
		queryLinkeantcodeAntcodeExternswebhookResponse.setData(_ctx.stringValue("QueryLinkeantcodeAntcodeExternswebhookResponse.Data"));
		queryLinkeantcodeAntcodeExternswebhookResponse.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeExternswebhookResponse.Message"));
		queryLinkeantcodeAntcodeExternswebhookResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeExternswebhookResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeExternswebhookResponse.setStatus(_ctx.booleanValue("QueryLinkeantcodeAntcodeExternswebhookResponse.Status"));
	 
	 	return queryLinkeantcodeAntcodeExternswebhookResponse;
	}
}