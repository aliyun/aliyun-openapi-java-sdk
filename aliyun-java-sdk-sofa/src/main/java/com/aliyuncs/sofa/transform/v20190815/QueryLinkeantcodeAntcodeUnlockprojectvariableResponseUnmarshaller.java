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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeUnlockprojectvariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeUnlockprojectvariableResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeUnlockprojectvariableResponse unmarshall(QueryLinkeantcodeAntcodeUnlockprojectvariableResponse queryLinkeantcodeAntcodeUnlockprojectvariableResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.RequestId"));
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.ResultCode"));
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.ResultMessage"));
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.Id"));
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setKey(_ctx.stringValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.Key"));
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setSecret(_ctx.booleanValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.Secret"));
		queryLinkeantcodeAntcodeUnlockprojectvariableResponse.setValue(_ctx.stringValue("QueryLinkeantcodeAntcodeUnlockprojectvariableResponse.Value"));
	 
	 	return queryLinkeantcodeAntcodeUnlockprojectvariableResponse;
	}
}