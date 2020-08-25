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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutCommonconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutCommonconfigResponseUnmarshaller {

	public static InitLinkeBahamutCommonconfigResponse unmarshall(InitLinkeBahamutCommonconfigResponse initLinkeBahamutCommonconfigResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutCommonconfigResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutCommonconfigResponse.RequestId"));
		initLinkeBahamutCommonconfigResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutCommonconfigResponse.ResultCode"));
		initLinkeBahamutCommonconfigResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutCommonconfigResponse.ResultMessage"));
		initLinkeBahamutCommonconfigResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutCommonconfigResponse.ErrorMessage"));
		initLinkeBahamutCommonconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutCommonconfigResponse.ErrorMsgParamsMap"));
		initLinkeBahamutCommonconfigResponse.setMessage(_ctx.stringValue("InitLinkeBahamutCommonconfigResponse.Message"));
		initLinkeBahamutCommonconfigResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutCommonconfigResponse.ResponseStatusCode"));
		initLinkeBahamutCommonconfigResponse.setResult(_ctx.stringValue("InitLinkeBahamutCommonconfigResponse.Result"));
		initLinkeBahamutCommonconfigResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutCommonconfigResponse.Success"));
	 
	 	return initLinkeBahamutCommonconfigResponse;
	}
}