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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainappcountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomainappcountResponseUnmarshaller {

	public static GetLinkeBahamutArchdomainappcountResponse unmarshall(GetLinkeBahamutArchdomainappcountResponse getLinkeBahamutArchdomainappcountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomainappcountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomainappcountResponse.RequestId"));
		getLinkeBahamutArchdomainappcountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomainappcountResponse.ResultCode"));
		getLinkeBahamutArchdomainappcountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomainappcountResponse.ResultMessage"));
		getLinkeBahamutArchdomainappcountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomainappcountResponse.ErrorMessage"));
		getLinkeBahamutArchdomainappcountResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutArchdomainappcountResponse.ErrorMsgParamsMap"));
		getLinkeBahamutArchdomainappcountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomainappcountResponse.Message"));
		getLinkeBahamutArchdomainappcountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutArchdomainappcountResponse.ResponseStatusCode"));
		getLinkeBahamutArchdomainappcountResponse.setResult(_ctx.longValue("GetLinkeBahamutArchdomainappcountResponse.Result"));
		getLinkeBahamutArchdomainappcountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomainappcountResponse.Success"));
	 
	 	return getLinkeBahamutArchdomainappcountResponse;
	}
}