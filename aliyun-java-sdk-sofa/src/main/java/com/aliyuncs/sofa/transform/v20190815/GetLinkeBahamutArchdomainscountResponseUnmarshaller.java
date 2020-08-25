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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainscountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomainscountResponseUnmarshaller {

	public static GetLinkeBahamutArchdomainscountResponse unmarshall(GetLinkeBahamutArchdomainscountResponse getLinkeBahamutArchdomainscountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomainscountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomainscountResponse.RequestId"));
		getLinkeBahamutArchdomainscountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomainscountResponse.ResultCode"));
		getLinkeBahamutArchdomainscountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomainscountResponse.ResultMessage"));
		getLinkeBahamutArchdomainscountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomainscountResponse.ErrorMessage"));
		getLinkeBahamutArchdomainscountResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutArchdomainscountResponse.ErrorMsgParamsMap"));
		getLinkeBahamutArchdomainscountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomainscountResponse.Message"));
		getLinkeBahamutArchdomainscountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutArchdomainscountResponse.ResponseStatusCode"));
		getLinkeBahamutArchdomainscountResponse.setResult(_ctx.longValue("GetLinkeBahamutArchdomainscountResponse.Result"));
		getLinkeBahamutArchdomainscountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomainscountResponse.Success"));
	 
	 	return getLinkeBahamutArchdomainscountResponse;
	}
}