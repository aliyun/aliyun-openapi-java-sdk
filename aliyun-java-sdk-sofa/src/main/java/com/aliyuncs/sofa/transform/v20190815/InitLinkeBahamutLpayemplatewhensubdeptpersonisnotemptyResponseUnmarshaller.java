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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseUnmarshaller {

	public static InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse unmarshall(InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.RequestId"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.ResultCode"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.ResultMessage"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.ErrorMessage"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.ErrorMsgParamsMap"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setMessage(_ctx.stringValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.Message"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.ResponseStatusCode"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setResult(_ctx.stringValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.Result"));
		initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse.Success"));
	 
	 	return initLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse;
	}
}