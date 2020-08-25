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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutAdmininitunitactivestageinfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutAdmininitunitactivestageinfoResponseUnmarshaller {

	public static InitLinkeBahamutAdmininitunitactivestageinfoResponse unmarshall(InitLinkeBahamutAdmininitunitactivestageinfoResponse initLinkeBahamutAdmininitunitactivestageinfoResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.RequestId"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.ResultCode"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.ResultMessage"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.ErrorMessage"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.ErrorMsgParamsMap"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setMessage(_ctx.stringValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.Message"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.ResponseStatusCode"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setResult(_ctx.booleanValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.Result"));
		initLinkeBahamutAdmininitunitactivestageinfoResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutAdmininitunitactivestageinfoResponse.Success"));
	 
	 	return initLinkeBahamutAdmininitunitactivestageinfoResponse;
	}
}