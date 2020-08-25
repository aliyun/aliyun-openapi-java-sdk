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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutIpaytemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutIpaytemplateResponseUnmarshaller {

	public static InitLinkeBahamutIpaytemplateResponse unmarshall(InitLinkeBahamutIpaytemplateResponse initLinkeBahamutIpaytemplateResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutIpaytemplateResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutIpaytemplateResponse.RequestId"));
		initLinkeBahamutIpaytemplateResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutIpaytemplateResponse.ResultCode"));
		initLinkeBahamutIpaytemplateResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutIpaytemplateResponse.ResultMessage"));
		initLinkeBahamutIpaytemplateResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutIpaytemplateResponse.ErrorMessage"));
		initLinkeBahamutIpaytemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutIpaytemplateResponse.ErrorMsgParamsMap"));
		initLinkeBahamutIpaytemplateResponse.setMessage(_ctx.stringValue("InitLinkeBahamutIpaytemplateResponse.Message"));
		initLinkeBahamutIpaytemplateResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutIpaytemplateResponse.ResponseStatusCode"));
		initLinkeBahamutIpaytemplateResponse.setResult(_ctx.stringValue("InitLinkeBahamutIpaytemplateResponse.Result"));
		initLinkeBahamutIpaytemplateResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutIpaytemplateResponse.Success"));
	 
	 	return initLinkeBahamutIpaytemplateResponse;
	}
}