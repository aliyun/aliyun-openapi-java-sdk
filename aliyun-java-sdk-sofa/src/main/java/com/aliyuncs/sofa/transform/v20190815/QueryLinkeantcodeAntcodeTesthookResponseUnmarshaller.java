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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeTesthookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeTesthookResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeTesthookResponse unmarshall(QueryLinkeantcodeAntcodeTesthookResponse queryLinkeantcodeAntcodeTesthookResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeTesthookResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeTesthookResponse.RequestId"));
		queryLinkeantcodeAntcodeTesthookResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeTesthookResponse.ResultCode"));
		queryLinkeantcodeAntcodeTesthookResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeTesthookResponse.ResultMessage"));
		queryLinkeantcodeAntcodeTesthookResponse.setCode(_ctx.longValue("QueryLinkeantcodeAntcodeTesthookResponse.Code"));
		queryLinkeantcodeAntcodeTesthookResponse.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeTesthookResponse.Message"));
		queryLinkeantcodeAntcodeTesthookResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeTesthookResponse.ResponseStatusCode"));
	 
	 	return queryLinkeantcodeAntcodeTesthookResponse;
	}
}