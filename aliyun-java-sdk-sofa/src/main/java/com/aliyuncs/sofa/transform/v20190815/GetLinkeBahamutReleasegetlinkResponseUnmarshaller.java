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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleasegetlinkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutReleasegetlinkResponseUnmarshaller {

	public static GetLinkeBahamutReleasegetlinkResponse unmarshall(GetLinkeBahamutReleasegetlinkResponse getLinkeBahamutReleasegetlinkResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutReleasegetlinkResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutReleasegetlinkResponse.RequestId"));
		getLinkeBahamutReleasegetlinkResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutReleasegetlinkResponse.ResultCode"));
		getLinkeBahamutReleasegetlinkResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutReleasegetlinkResponse.ResultMessage"));
		getLinkeBahamutReleasegetlinkResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutReleasegetlinkResponse.ErrorMessage"));
		getLinkeBahamutReleasegetlinkResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutReleasegetlinkResponse.ErrorMsgParamsMap"));
		getLinkeBahamutReleasegetlinkResponse.setMessage(_ctx.stringValue("GetLinkeBahamutReleasegetlinkResponse.Message"));
		getLinkeBahamutReleasegetlinkResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutReleasegetlinkResponse.ResponseStatusCode"));
		getLinkeBahamutReleasegetlinkResponse.setResult(_ctx.stringValue("GetLinkeBahamutReleasegetlinkResponse.Result"));
		getLinkeBahamutReleasegetlinkResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutReleasegetlinkResponse.Success"));
	 
	 	return getLinkeBahamutReleasegetlinkResponse;
	}
}