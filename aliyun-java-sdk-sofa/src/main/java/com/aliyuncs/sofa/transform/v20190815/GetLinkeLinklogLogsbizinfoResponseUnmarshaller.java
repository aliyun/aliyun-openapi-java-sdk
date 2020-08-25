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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogLogsbizinfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogLogsbizinfoResponseUnmarshaller {

	public static GetLinkeLinklogLogsbizinfoResponse unmarshall(GetLinkeLinklogLogsbizinfoResponse getLinkeLinklogLogsbizinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogLogsbizinfoResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogLogsbizinfoResponse.RequestId"));
		getLinkeLinklogLogsbizinfoResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogLogsbizinfoResponse.ResultCode"));
		getLinkeLinklogLogsbizinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogLogsbizinfoResponse.ResultMessage"));
		getLinkeLinklogLogsbizinfoResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogLogsbizinfoResponse.ErrorMsg"));
		getLinkeLinklogLogsbizinfoResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogLogsbizinfoResponse.ResponseContentRange"));
		getLinkeLinklogLogsbizinfoResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogLogsbizinfoResponse.ResponseContentType"));
		getLinkeLinklogLogsbizinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogLogsbizinfoResponse.ResponseStatusCode"));
		getLinkeLinklogLogsbizinfoResponse.setResult(_ctx.stringValue("GetLinkeLinklogLogsbizinfoResponse.Result"));
		getLinkeLinklogLogsbizinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogLogsbizinfoResponse.Success"));
	 
	 	return getLinkeLinklogLogsbizinfoResponse;
	}
}