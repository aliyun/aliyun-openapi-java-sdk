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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutOpeninitprsettingsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutOpeninitprsettingsResponseUnmarshaller {

	public static InitLinkeBahamutOpeninitprsettingsResponse unmarshall(InitLinkeBahamutOpeninitprsettingsResponse initLinkeBahamutOpeninitprsettingsResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutOpeninitprsettingsResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutOpeninitprsettingsResponse.RequestId"));
		initLinkeBahamutOpeninitprsettingsResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutOpeninitprsettingsResponse.ResultCode"));
		initLinkeBahamutOpeninitprsettingsResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutOpeninitprsettingsResponse.ResultMessage"));
		initLinkeBahamutOpeninitprsettingsResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutOpeninitprsettingsResponse.ErrorMessage"));
		initLinkeBahamutOpeninitprsettingsResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutOpeninitprsettingsResponse.ErrorMsgParamsMap"));
		initLinkeBahamutOpeninitprsettingsResponse.setMessage(_ctx.stringValue("InitLinkeBahamutOpeninitprsettingsResponse.Message"));
		initLinkeBahamutOpeninitprsettingsResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutOpeninitprsettingsResponse.ResponseStatusCode"));
		initLinkeBahamutOpeninitprsettingsResponse.setResult(_ctx.stringValue("InitLinkeBahamutOpeninitprsettingsResponse.Result"));
		initLinkeBahamutOpeninitprsettingsResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutOpeninitprsettingsResponse.Success"));
	 
	 	return initLinkeBahamutOpeninitprsettingsResponse;
	}
}