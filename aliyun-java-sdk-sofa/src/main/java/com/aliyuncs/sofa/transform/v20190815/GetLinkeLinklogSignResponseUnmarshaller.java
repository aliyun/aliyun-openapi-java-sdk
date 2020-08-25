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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogSignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogSignResponseUnmarshaller {

	public static GetLinkeLinklogSignResponse unmarshall(GetLinkeLinklogSignResponse getLinkeLinklogSignResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogSignResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogSignResponse.RequestId"));
		getLinkeLinklogSignResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogSignResponse.ResultCode"));
		getLinkeLinklogSignResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogSignResponse.ResultMessage"));
		getLinkeLinklogSignResponse.setKey(_ctx.stringValue("GetLinkeLinklogSignResponse.Key"));
		getLinkeLinklogSignResponse.setNonce(_ctx.stringValue("GetLinkeLinklogSignResponse.Nonce"));
		getLinkeLinklogSignResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogSignResponse.ResponseContentRange"));
		getLinkeLinklogSignResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogSignResponse.ResponseContentType"));
		getLinkeLinklogSignResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogSignResponse.ResponseStatusCode"));
		getLinkeLinklogSignResponse.setSign(_ctx.stringValue("GetLinkeLinklogSignResponse.Sign"));
		getLinkeLinklogSignResponse.setTimestamp(_ctx.stringValue("GetLinkeLinklogSignResponse.Timestamp"));
	 
	 	return getLinkeLinklogSignResponse;
	}
}