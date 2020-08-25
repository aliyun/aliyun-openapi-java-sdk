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

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinklogConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinklogConfigResponseUnmarshaller {

	public static AddLinkeLinklogConfigResponse unmarshall(AddLinkeLinklogConfigResponse addLinkeLinklogConfigResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinklogConfigResponse.setRequestId(_ctx.stringValue("AddLinkeLinklogConfigResponse.RequestId"));
		addLinkeLinklogConfigResponse.setResultCode(_ctx.stringValue("AddLinkeLinklogConfigResponse.ResultCode"));
		addLinkeLinklogConfigResponse.setResultMessage(_ctx.stringValue("AddLinkeLinklogConfigResponse.ResultMessage"));
		addLinkeLinklogConfigResponse.setErrorMsg(_ctx.stringValue("AddLinkeLinklogConfigResponse.ErrorMsg"));
		addLinkeLinklogConfigResponse.setResponseContentRange(_ctx.stringValue("AddLinkeLinklogConfigResponse.ResponseContentRange"));
		addLinkeLinklogConfigResponse.setResponseContentType(_ctx.stringValue("AddLinkeLinklogConfigResponse.ResponseContentType"));
		addLinkeLinklogConfigResponse.setResponseStatusCode(_ctx.longValue("AddLinkeLinklogConfigResponse.ResponseStatusCode"));
		addLinkeLinklogConfigResponse.setResult(_ctx.stringValue("AddLinkeLinklogConfigResponse.Result"));
		addLinkeLinklogConfigResponse.setSuccess(_ctx.booleanValue("AddLinkeLinklogConfigResponse.Success"));
	 
	 	return addLinkeLinklogConfigResponse;
	}
}