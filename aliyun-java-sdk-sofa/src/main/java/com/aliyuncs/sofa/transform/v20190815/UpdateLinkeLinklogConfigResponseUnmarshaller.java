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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinklogConfigResponseUnmarshaller {

	public static UpdateLinkeLinklogConfigResponse unmarshall(UpdateLinkeLinklogConfigResponse updateLinkeLinklogConfigResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinklogConfigResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinklogConfigResponse.RequestId"));
		updateLinkeLinklogConfigResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinklogConfigResponse.ResultCode"));
		updateLinkeLinklogConfigResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinklogConfigResponse.ResultMessage"));
		updateLinkeLinklogConfigResponse.setErrorMsg(_ctx.stringValue("UpdateLinkeLinklogConfigResponse.ErrorMsg"));
		updateLinkeLinklogConfigResponse.setResponseContentRange(_ctx.stringValue("UpdateLinkeLinklogConfigResponse.ResponseContentRange"));
		updateLinkeLinklogConfigResponse.setResponseContentType(_ctx.stringValue("UpdateLinkeLinklogConfigResponse.ResponseContentType"));
		updateLinkeLinklogConfigResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinklogConfigResponse.ResponseStatusCode"));
		updateLinkeLinklogConfigResponse.setResult(_ctx.stringValue("UpdateLinkeLinklogConfigResponse.Result"));
		updateLinkeLinklogConfigResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinklogConfigResponse.Success"));
	 
	 	return updateLinkeLinklogConfigResponse;
	}
}