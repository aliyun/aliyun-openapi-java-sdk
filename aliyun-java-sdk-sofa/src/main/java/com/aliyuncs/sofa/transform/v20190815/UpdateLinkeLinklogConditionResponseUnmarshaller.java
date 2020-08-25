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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogConditionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinklogConditionResponseUnmarshaller {

	public static UpdateLinkeLinklogConditionResponse unmarshall(UpdateLinkeLinklogConditionResponse updateLinkeLinklogConditionResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinklogConditionResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinklogConditionResponse.RequestId"));
		updateLinkeLinklogConditionResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinklogConditionResponse.ResultCode"));
		updateLinkeLinklogConditionResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinklogConditionResponse.ResultMessage"));
		updateLinkeLinklogConditionResponse.setErrorMsg(_ctx.stringValue("UpdateLinkeLinklogConditionResponse.ErrorMsg"));
		updateLinkeLinklogConditionResponse.setResponseContentRange(_ctx.stringValue("UpdateLinkeLinklogConditionResponse.ResponseContentRange"));
		updateLinkeLinklogConditionResponse.setResponseContentType(_ctx.stringValue("UpdateLinkeLinklogConditionResponse.ResponseContentType"));
		updateLinkeLinklogConditionResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinklogConditionResponse.ResponseStatusCode"));
		updateLinkeLinklogConditionResponse.setResult(_ctx.stringValue("UpdateLinkeLinklogConditionResponse.Result"));
		updateLinkeLinklogConditionResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinklogConditionResponse.Success"));
	 
	 	return updateLinkeLinklogConditionResponse;
	}
}