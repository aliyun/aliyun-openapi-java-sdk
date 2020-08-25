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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse unmarshall(QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.RequestId"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.ResultCode"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.ResultMessage"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setErrorCode(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.ErrorCode"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setErrorMsg(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.ErrorMsg"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setLogUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.LogUrl"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setResult(_ctx.stringValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.Result"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setSuccess(_ctx.booleanValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.Success"));
		queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.setTimestamp(_ctx.longValue("QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse.Timestamp"));
	 
	 	return queryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse;
	}
}