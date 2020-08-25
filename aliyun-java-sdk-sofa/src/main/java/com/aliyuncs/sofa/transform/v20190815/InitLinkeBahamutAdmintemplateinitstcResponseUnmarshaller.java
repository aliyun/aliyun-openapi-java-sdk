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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutAdmintemplateinitstcResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutAdmintemplateinitstcResponseUnmarshaller {

	public static InitLinkeBahamutAdmintemplateinitstcResponse unmarshall(InitLinkeBahamutAdmintemplateinitstcResponse initLinkeBahamutAdmintemplateinitstcResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutAdmintemplateinitstcResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutAdmintemplateinitstcResponse.RequestId"));
		initLinkeBahamutAdmintemplateinitstcResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutAdmintemplateinitstcResponse.ResultCode"));
		initLinkeBahamutAdmintemplateinitstcResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutAdmintemplateinitstcResponse.ResultMessage"));
		initLinkeBahamutAdmintemplateinitstcResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutAdmintemplateinitstcResponse.ErrorMessage"));
		initLinkeBahamutAdmintemplateinitstcResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutAdmintemplateinitstcResponse.ErrorMsgParamsMap"));
		initLinkeBahamutAdmintemplateinitstcResponse.setMessage(_ctx.stringValue("InitLinkeBahamutAdmintemplateinitstcResponse.Message"));
		initLinkeBahamutAdmintemplateinitstcResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutAdmintemplateinitstcResponse.ResponseStatusCode"));
		initLinkeBahamutAdmintemplateinitstcResponse.setResult(_ctx.booleanValue("InitLinkeBahamutAdmintemplateinitstcResponse.Result"));
		initLinkeBahamutAdmintemplateinitstcResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutAdmintemplateinitstcResponse.Success"));
	 
	 	return initLinkeBahamutAdmintemplateinitstcResponse;
	}
}