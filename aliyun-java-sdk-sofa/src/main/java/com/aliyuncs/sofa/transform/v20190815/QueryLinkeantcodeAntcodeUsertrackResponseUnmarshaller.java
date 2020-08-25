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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeUsertrackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeUsertrackResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeUsertrackResponse unmarshall(QueryLinkeantcodeAntcodeUsertrackResponse queryLinkeantcodeAntcodeUsertrackResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeUsertrackResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeUsertrackResponse.RequestId"));
		queryLinkeantcodeAntcodeUsertrackResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeUsertrackResponse.ResultCode"));
		queryLinkeantcodeAntcodeUsertrackResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeUsertrackResponse.ResultMessage"));
		queryLinkeantcodeAntcodeUsertrackResponse.setData(_ctx.stringValue("QueryLinkeantcodeAntcodeUsertrackResponse.Data"));
		queryLinkeantcodeAntcodeUsertrackResponse.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeUsertrackResponse.Message"));
		queryLinkeantcodeAntcodeUsertrackResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeUsertrackResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeUsertrackResponse.setStatus(_ctx.booleanValue("QueryLinkeantcodeAntcodeUsertrackResponse.Status"));
	 
	 	return queryLinkeantcodeAntcodeUsertrackResponse;
	}
}