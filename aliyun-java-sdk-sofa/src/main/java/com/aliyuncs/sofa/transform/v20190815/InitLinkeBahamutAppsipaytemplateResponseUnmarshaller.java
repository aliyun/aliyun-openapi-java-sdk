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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutAppsipaytemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutAppsipaytemplateResponseUnmarshaller {

	public static InitLinkeBahamutAppsipaytemplateResponse unmarshall(InitLinkeBahamutAppsipaytemplateResponse initLinkeBahamutAppsipaytemplateResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutAppsipaytemplateResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutAppsipaytemplateResponse.RequestId"));
		initLinkeBahamutAppsipaytemplateResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutAppsipaytemplateResponse.ResultCode"));
		initLinkeBahamutAppsipaytemplateResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutAppsipaytemplateResponse.ResultMessage"));
		initLinkeBahamutAppsipaytemplateResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutAppsipaytemplateResponse.ErrorMessage"));
		initLinkeBahamutAppsipaytemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutAppsipaytemplateResponse.ErrorMsgParamsMap"));
		initLinkeBahamutAppsipaytemplateResponse.setMessage(_ctx.stringValue("InitLinkeBahamutAppsipaytemplateResponse.Message"));
		initLinkeBahamutAppsipaytemplateResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutAppsipaytemplateResponse.ResponseStatusCode"));
		initLinkeBahamutAppsipaytemplateResponse.setResult(_ctx.stringValue("InitLinkeBahamutAppsipaytemplateResponse.Result"));
		initLinkeBahamutAppsipaytemplateResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutAppsipaytemplateResponse.Success"));
	 
	 	return initLinkeBahamutAppsipaytemplateResponse;
	}
}