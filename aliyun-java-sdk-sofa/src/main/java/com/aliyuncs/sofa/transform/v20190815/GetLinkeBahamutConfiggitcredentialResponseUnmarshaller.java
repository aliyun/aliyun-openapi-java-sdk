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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutConfiggitcredentialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutConfiggitcredentialResponseUnmarshaller {

	public static GetLinkeBahamutConfiggitcredentialResponse unmarshall(GetLinkeBahamutConfiggitcredentialResponse getLinkeBahamutConfiggitcredentialResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutConfiggitcredentialResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutConfiggitcredentialResponse.RequestId"));
		getLinkeBahamutConfiggitcredentialResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutConfiggitcredentialResponse.ResultCode"));
		getLinkeBahamutConfiggitcredentialResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutConfiggitcredentialResponse.ResultMessage"));
		getLinkeBahamutConfiggitcredentialResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutConfiggitcredentialResponse.ErrorMessage"));
		getLinkeBahamutConfiggitcredentialResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutConfiggitcredentialResponse.ErrorMsgParamsMap"));
		getLinkeBahamutConfiggitcredentialResponse.setMessage(_ctx.stringValue("GetLinkeBahamutConfiggitcredentialResponse.Message"));
		getLinkeBahamutConfiggitcredentialResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutConfiggitcredentialResponse.ResponseStatusCode"));
		getLinkeBahamutConfiggitcredentialResponse.setResult(_ctx.stringValue("GetLinkeBahamutConfiggitcredentialResponse.Result"));
		getLinkeBahamutConfiggitcredentialResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutConfiggitcredentialResponse.Success"));
	 
	 	return getLinkeBahamutConfiggitcredentialResponse;
	}
}