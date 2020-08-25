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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeLockprojectvariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeLockprojectvariableResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeLockprojectvariableResponse unmarshall(QueryLinkeantcodeAntcodeLockprojectvariableResponse queryLinkeantcodeAntcodeLockprojectvariableResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.RequestId"));
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.ResultCode"));
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.ResultMessage"));
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.Id"));
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setKey(_ctx.stringValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.Key"));
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setSecret(_ctx.booleanValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.Secret"));
		queryLinkeantcodeAntcodeLockprojectvariableResponse.setValue(_ctx.stringValue("QueryLinkeantcodeAntcodeLockprojectvariableResponse.Value"));
	 
	 	return queryLinkeantcodeAntcodeLockprojectvariableResponse;
	}
}