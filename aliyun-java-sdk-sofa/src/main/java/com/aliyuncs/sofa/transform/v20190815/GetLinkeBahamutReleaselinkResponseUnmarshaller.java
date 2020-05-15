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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaselinkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutReleaselinkResponseUnmarshaller {

	public static GetLinkeBahamutReleaselinkResponse unmarshall(GetLinkeBahamutReleaselinkResponse getLinkeBahamutReleaselinkResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutReleaselinkResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutReleaselinkResponse.RequestId"));
		getLinkeBahamutReleaselinkResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutReleaselinkResponse.ResultCode"));
		getLinkeBahamutReleaselinkResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutReleaselinkResponse.ResultMessage"));
		getLinkeBahamutReleaselinkResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutReleaselinkResponse.ErrorMessage"));
		getLinkeBahamutReleaselinkResponse.setMessage(_ctx.stringValue("GetLinkeBahamutReleaselinkResponse.Message"));
		getLinkeBahamutReleaselinkResponse.setResult(_ctx.stringValue("GetLinkeBahamutReleaselinkResponse.Result"));
		getLinkeBahamutReleaselinkResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutReleaselinkResponse.Success"));
	 
	 	return getLinkeBahamutReleaselinkResponse;
	}
}