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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutCompleteunitswheniterationcompletedResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeBahamutCompleteunitswheniterationcompletedResponseUnmarshaller {

	public static ExecLinkeBahamutCompleteunitswheniterationcompletedResponse unmarshall(ExecLinkeBahamutCompleteunitswheniterationcompletedResponse execLinkeBahamutCompleteunitswheniterationcompletedResponse, UnmarshallerContext _ctx) {
		
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setRequestId(_ctx.stringValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.RequestId"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setResultCode(_ctx.stringValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.ResultCode"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setResultMessage(_ctx.stringValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.ResultMessage"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setErrorMessage(_ctx.stringValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.ErrorMessage"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setErrorMsgParamsMap(_ctx.stringValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.ErrorMsgParamsMap"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setMessage(_ctx.stringValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.Message"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.ResponseStatusCode"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setResult(_ctx.stringValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.Result"));
		execLinkeBahamutCompleteunitswheniterationcompletedResponse.setSuccess(_ctx.booleanValue("ExecLinkeBahamutCompleteunitswheniterationcompletedResponse.Success"));
	 
	 	return execLinkeBahamutCompleteunitswheniterationcompletedResponse;
	}
}