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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmergerequestdbResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsmergerequestdbResponseUnmarshaller {

	public static GetLinkeBahamutVcsmergerequestdbResponse unmarshall(GetLinkeBahamutVcsmergerequestdbResponse getLinkeBahamutVcsmergerequestdbResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsmergerequestdbResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsmergerequestdbResponse.RequestId"));
		getLinkeBahamutVcsmergerequestdbResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsmergerequestdbResponse.ResultCode"));
		getLinkeBahamutVcsmergerequestdbResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsmergerequestdbResponse.ResultMessage"));
		getLinkeBahamutVcsmergerequestdbResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsmergerequestdbResponse.ErrorMessage"));
		getLinkeBahamutVcsmergerequestdbResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsmergerequestdbResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsmergerequestdbResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsmergerequestdbResponse.Message"));
		getLinkeBahamutVcsmergerequestdbResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsmergerequestdbResponse.ResponseStatusCode"));
		getLinkeBahamutVcsmergerequestdbResponse.setResult(_ctx.stringValue("GetLinkeBahamutVcsmergerequestdbResponse.Result"));
		getLinkeBahamutVcsmergerequestdbResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsmergerequestdbResponse.Success"));
	 
	 	return getLinkeBahamutVcsmergerequestdbResponse;
	}
}