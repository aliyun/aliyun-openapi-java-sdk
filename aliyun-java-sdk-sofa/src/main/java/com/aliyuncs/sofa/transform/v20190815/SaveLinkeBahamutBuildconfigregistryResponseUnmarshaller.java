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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutBuildconfigregistryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutBuildconfigregistryResponseUnmarshaller {

	public static SaveLinkeBahamutBuildconfigregistryResponse unmarshall(SaveLinkeBahamutBuildconfigregistryResponse saveLinkeBahamutBuildconfigregistryResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutBuildconfigregistryResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutBuildconfigregistryResponse.RequestId"));
		saveLinkeBahamutBuildconfigregistryResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutBuildconfigregistryResponse.ResultCode"));
		saveLinkeBahamutBuildconfigregistryResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigregistryResponse.ResultMessage"));
		saveLinkeBahamutBuildconfigregistryResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigregistryResponse.ErrorMessage"));
		saveLinkeBahamutBuildconfigregistryResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutBuildconfigregistryResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutBuildconfigregistryResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigregistryResponse.Message"));
		saveLinkeBahamutBuildconfigregistryResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutBuildconfigregistryResponse.ResponseStatusCode"));
		saveLinkeBahamutBuildconfigregistryResponse.setResult(_ctx.booleanValue("SaveLinkeBahamutBuildconfigregistryResponse.Result"));
		saveLinkeBahamutBuildconfigregistryResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutBuildconfigregistryResponse.Success"));
	 
	 	return saveLinkeBahamutBuildconfigregistryResponse;
	}
}