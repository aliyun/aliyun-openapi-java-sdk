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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutTenantinitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutTenantinitResponseUnmarshaller {

	public static InitLinkeBahamutTenantinitResponse unmarshall(InitLinkeBahamutTenantinitResponse initLinkeBahamutTenantinitResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutTenantinitResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutTenantinitResponse.RequestId"));
		initLinkeBahamutTenantinitResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutTenantinitResponse.ResultCode"));
		initLinkeBahamutTenantinitResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutTenantinitResponse.ResultMessage"));
		initLinkeBahamutTenantinitResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutTenantinitResponse.ErrorMessage"));
		initLinkeBahamutTenantinitResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutTenantinitResponse.ErrorMsgParamsMap"));
		initLinkeBahamutTenantinitResponse.setMessage(_ctx.stringValue("InitLinkeBahamutTenantinitResponse.Message"));
		initLinkeBahamutTenantinitResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutTenantinitResponse.ResponseStatusCode"));
		initLinkeBahamutTenantinitResponse.setResult(_ctx.booleanValue("InitLinkeBahamutTenantinitResponse.Result"));
		initLinkeBahamutTenantinitResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutTenantinitResponse.Success"));
	 
	 	return initLinkeBahamutTenantinitResponse;
	}
}