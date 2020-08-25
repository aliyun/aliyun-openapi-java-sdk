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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutBuildconfigregistryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeBahamutBuildconfigregistryResponseUnmarshaller {

	public static RemoveLinkeBahamutBuildconfigregistryResponse unmarshall(RemoveLinkeBahamutBuildconfigregistryResponse removeLinkeBahamutBuildconfigregistryResponse, UnmarshallerContext _ctx) {
		
		removeLinkeBahamutBuildconfigregistryResponse.setRequestId(_ctx.stringValue("RemoveLinkeBahamutBuildconfigregistryResponse.RequestId"));
		removeLinkeBahamutBuildconfigregistryResponse.setResultCode(_ctx.stringValue("RemoveLinkeBahamutBuildconfigregistryResponse.ResultCode"));
		removeLinkeBahamutBuildconfigregistryResponse.setResultMessage(_ctx.stringValue("RemoveLinkeBahamutBuildconfigregistryResponse.ResultMessage"));
		removeLinkeBahamutBuildconfigregistryResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeBahamutBuildconfigregistryResponse.ErrorMessage"));
		removeLinkeBahamutBuildconfigregistryResponse.setErrorMsgParamsMap(_ctx.stringValue("RemoveLinkeBahamutBuildconfigregistryResponse.ErrorMsgParamsMap"));
		removeLinkeBahamutBuildconfigregistryResponse.setMessage(_ctx.stringValue("RemoveLinkeBahamutBuildconfigregistryResponse.Message"));
		removeLinkeBahamutBuildconfigregistryResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeBahamutBuildconfigregistryResponse.ResponseStatusCode"));
		removeLinkeBahamutBuildconfigregistryResponse.setResult(_ctx.booleanValue("RemoveLinkeBahamutBuildconfigregistryResponse.Result"));
		removeLinkeBahamutBuildconfigregistryResponse.setSuccess(_ctx.booleanValue("RemoveLinkeBahamutBuildconfigregistryResponse.Success"));
	 
	 	return removeLinkeBahamutBuildconfigregistryResponse;
	}
}