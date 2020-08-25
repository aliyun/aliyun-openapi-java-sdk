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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetlterationtabnumResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetlterationtabnumResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetlterationtabnumResponse unmarshall(GetLinkeBahamutIterationgetlterationtabnumResponse getLinkeBahamutIterationgetlterationtabnumResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetlterationtabnumResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetlterationtabnumResponse.RequestId"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetlterationtabnumResponse.ResultCode"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetlterationtabnumResponse.ResultMessage"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetlterationtabnumResponse.ErrorMessage"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetlterationtabnumResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetlterationtabnumResponse.Message"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetlterationtabnumResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setResult(_ctx.stringValue("GetLinkeBahamutIterationgetlterationtabnumResponse.Result"));
		getLinkeBahamutIterationgetlterationtabnumResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetlterationtabnumResponse.Success"));
	 
	 	return getLinkeBahamutIterationgetlterationtabnumResponse;
	}
}