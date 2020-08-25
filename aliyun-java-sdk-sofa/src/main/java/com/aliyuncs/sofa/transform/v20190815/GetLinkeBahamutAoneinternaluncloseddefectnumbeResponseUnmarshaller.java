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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse unmarshall(GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse getLinkeBahamutAoneinternaluncloseddefectnumbeResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.RequestId"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.ResultCode"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.ResultMessage"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.ErrorMessage"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.Message"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setResult(_ctx.longValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.Result"));
		getLinkeBahamutAoneinternaluncloseddefectnumbeResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse.Success"));
	 
	 	return getLinkeBahamutAoneinternaluncloseddefectnumbeResponse;
	}
}