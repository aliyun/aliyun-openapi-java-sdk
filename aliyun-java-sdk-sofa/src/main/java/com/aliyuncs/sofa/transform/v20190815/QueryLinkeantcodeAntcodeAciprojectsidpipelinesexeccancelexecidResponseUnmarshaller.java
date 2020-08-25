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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse unmarshall(QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.RequestId"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.ResultCode"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.ResultMessage"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setErrorCode(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.ErrorCode"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setErrorMsg(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.ErrorMsg"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setLogUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.LogUrl"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setResult(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.Result"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setSuccess(_ctx.booleanValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.Success"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.setTimestamp(_ctx.longValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse.Timestamp"));
	 
	 	return queryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse;
	}
}